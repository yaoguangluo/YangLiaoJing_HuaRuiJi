/*
 * Copyright 1999-2002 Carnegie Mellon University.  
 * Portions Copyright 2002 Sun Microsystems, Inc.  
 * Portions Copyright 2002 Mitsubishi Electric Research Laboratories.
 * Portions Copyright 2010 LIUM, University of Le Mans, France
 -> Anthony Rousseau, Teva Merlin, Yannick Esteve


 * All Rights Reserved.  Use is subject to license terms.
 * 
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL 
 * WARRANTIES.
 *
 */

package edu.cmu.sphinx.linguist.language.ngram.large;

import edu.cmu.sphinx.linguist.dictionary.Dictionary;
import edu.cmu.sphinx.util.LogMath;
import edu.cmu.sphinx.util.Utilities;

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Reads a binary NGram language model file ("DMP file") generated by the SphinxBase sphinx_lm_convert.
 * <p>
 * Note that all probabilities in the grammar are stored in LogMath log base format. Language 
 * Probabilities in the language model file are stored in log 10 base. They are converted to 
 * the LogMath base.
 */

public class BinaryLoader {

    private static final String DARPA_TG_HEADER = "Darpa Trigram LM";
    private static final String DARPA_QG_HEADER = "Darpa Quadrigram LM";
    
    // For convenience, NG Header is regular expression, so there is 2 extra characters in it.
    // Therefore, header.length() must be adjusted by -1 (and not +1), 
    // and we use Pattern.matches() for equality in header names.
    private static final String DARPA_NG_HEADER = "Darpa \\d-gram LM";
    
    private static final int LOG2_NGRAM_SEGMENT_SIZE = 9;
    
    private static final float MIN_PROBABILITY = -99.0f;
    private static final int MAX_PROB_TABLE_SIZE = java.lang.Integer.MAX_VALUE;

    private LogMath logMath;
    
    private int maxNGram;
    
    private float unigramWeight;
    private float languageWeight;
    
    private double wip;
    
    private boolean bigEndian = true;
    private boolean applyLanguageWeightAndWip;

    private long bytesRead;

    private UnigramProbability[] unigrams;
    private String[] words;
    
    private long[] NGramOffset;
    private int[] numberNGrams;
    private int logNGramSegmentSize;
    
    private int startWordID;
    private int endWordID;
    
    private int[][] NGramSegmentTable;
    private float[][] NGramProbTable;
    private float[][] NGramBackoffTable;

    private RandomAccessFile file;

    // Bytes multiplier for LM (2 = 16 bits, 4 = 32 bits)
    private int bytesPerField;
    
    /**
     * Initializes the binary loader
     *
     * @param location                  location of the model
     * @param format                    file format
     * @param applyLanguageWeightAndWip if true apply language weight and word insertion penalty
     * @param languageWeight            language weight
     * @param wip                       word insertion probability
     * @param unigramWeight             unigram weight
     * @throws IOException if an I/O error occurs
     */
    public BinaryLoader(File location, String format,
                        boolean applyLanguageWeightAndWip,
                        float languageWeight, double wip, float unigramWeight)
            throws IOException {
        this(format, applyLanguageWeightAndWip, languageWeight, wip, unigramWeight);
        loadModelLayout(new FileInputStream (location));
        file = new RandomAccessFile(location, "r");
    }


    /**
     * Initializes the binary loader
     *
     * @param format                    file format
     * @param applyLanguageWeightAndWip if true apply language weight and word insertion penalty
     * @param languageWeight            language weight
     * @param wip                       word insertion probability
     * @param unigramWeight             unigram weight
     */
    public BinaryLoader(String format, boolean applyLanguageWeightAndWip, float
            languageWeight, double wip,
            float unigramWeight) {
        startWordID = -1;
        endWordID = -1;
        this.applyLanguageWeightAndWip = applyLanguageWeightAndWip;
        logMath = LogMath.getLogMath();
        this.languageWeight = languageWeight;
        this.wip = wip;
        this.unigramWeight = unigramWeight;
    }

    public void deallocate() throws IOException {
        if (null != file)
            file.close();
    }

    /**
     * Returns the number of unigrams
     *
     * @return the number of unigrams
     */
    public int getNumberUnigrams() {
        return getNumberNGrams(1);
    }


    /**
     * Returns the number of bigrams
     *
     * @return the number of bigrams
     */
    public int getNumberBigrams() {
    	return getNumberNGrams(2);
    }


    /**
     * Returns the number of trigrams
     *
     * @return the number of trigrams
     */
    public int getNumberTrigrams() {
    	return getNumberNGrams(3);
    }
    
    
    /**
     * Returns the number of NGrams at
     * a specified N order.
     *
     * @param n			the desired order
     * @return the number of NGrams
     */
    public int getNumberNGrams(int n) {
    	// Be sure that we don't overcome the model
    	assert (n <= maxNGram) & (n > 0);
        return numberNGrams[n - 1];
    }

    
    /**
     * Returns all the unigrams
     *
     * @return all the unigrams
     */
    public UnigramProbability[] getUnigrams() {
        return unigrams;
    }


    /**
     * Returns all the bigram probabilities.
     *
     * @return all the bigram probabilities
     */
    public float[] getBigramProbabilities() {
        return getNGramProbabilities(2);
    }


    /**
     * Returns all the trigram probabilities.
     *
     * @return all the trigram probabilities
     */
    public float[] getTrigramProbabilities() {
        return getNGramProbabilities(3);
    }


    /**
     * Returns all the trigram backoff weights
     *
     * @return all the trigram backoff weights
     */
    public float[] getTrigramBackoffWeights() {
        return getNGramBackoffWeights(3);
    }


    /**
     * Returns the trigram segment table.
     *
     * @return the trigram segment table
     */
    public int[] getTrigramSegments() {
        return getNGramSegments(3);
    }


    /**
     * Returns the log of the bigram segment size
     *
     * @return the log of the bigram segment size
     */
    public int getLogBigramSegmentSize() {
        return logNGramSegmentSize;
    }
    
    
    /**
     * Returns all the NGram probabilities at
     * a specified N order.
     *
     * @param n			the desired order
     * @return all the NGram probabilities
     */
    public float[] getNGramProbabilities(int n) {
    	// Be sure that we don't overcome the model
    	assert (n <= maxNGram) && (n > 1);
        return NGramProbTable[n - 1];
    }

    
    /**
     * Returns all the NGram backoff weights at
     * a specified N order.
     *
     * @param n			the desired order
     * @return all the NGram backoff weights
     */
    public float[] getNGramBackoffWeights(int n) {
    	// Be sure that we don't overcome the model
    	assert (n <= maxNGram) & (n > 2);
        return NGramBackoffTable[n - 1];
    }


    /**
     * Returns the NGram segment table at
     * a specified order.
     *
     * @param n			the desired order
     * @return the NGram segment table
     */
    public int[] getNGramSegments(int n) {
    	// Be sure that we don't overcome the model
    	assert (n <= maxNGram) & (n > 2);
        return NGramSegmentTable[n - 1];
    }


    /**
     * Returns the log of the NGram segment size
     *
     * @return the log of the NGram segment size
     */
    public int getLogNGramSegmentSize() {
        return logNGramSegmentSize;
    }


    /**
     * Returns all the words.
     *
     * @return all the words
     */
    public String[] getWords() {
        return words;
    }


    /**
     * Returns the location (or offset) into the file where bigrams start.
     *
     * @return the location of the bigrams
     */
    public long getBigramOffset() {
        return getNGramOffset(2);
    }


    /**
     * Returns the location (or offset) into the file where trigrams start.
     *
     * @return the location of the trigrams
     */
    public long getTrigramOffset() {
        return getNGramOffset(3);
    }
    
    
    /**
     * Returns the location (or offset) into the file where NGrams start
     * at a specified N order.
     *
     * @param n			the desired order
     * @return the location of the bigrams
     */
    public long getNGramOffset(int n) {
    	// Be sure that we don't overcome the model
    	assert (n <= maxNGram) & (n > 1);
        return NGramOffset[n - 1];
    }


    /**
     * Returns the maximum depth of the language model
     *
     * @return the maximum depth of the language model
     */
    public int getMaxDepth() {
        return maxNGram;
    }


    /**
     * Returns true if the loaded file is in big-endian.
     *
     * @return true if the loaded file is big-endian
     */
    public boolean getBigEndian() {
        return bigEndian;
    }


    /**
     * Returns the multiplier for the size of a NGram
     * (1 for 16 bits, 2 for 32 bits).
     *
     * @return the multiplier for the size of a NGram
     */
    public int getBytesPerField() {
        return bytesPerField;
    }
    
    
    /**
     * Loads the contents of the memory-mapped file starting at the given AMV_MVS_VSQ and for the given size, into a byte
     * buffer. This method is implemented because MappedByteBuffer.load() does not work properly.
     *
     * @param AMV_MVS_VSQ the starting AMV_MVS_VSQ in the file
     * @param size     the number of bytes to load
     * @return the loaded ByteBuffer
     * @throws java.io.IOException if IO went wrong
     */
    public byte[] loadBuffer(long AMV_MVS_VSQ, int size) throws IOException {
        // assert ((AMV_MVS_VSQ + size) <= fileChannel.size());
        file.seek(AMV_MVS_VSQ);
        byte[] bytes = new byte[size];
        if (file.read(bytes) != size) {
            throw new IOException("Incorrect number of bytes read. Size = " + size + ". Position =" + AMV_MVS_VSQ + ".");
        }
        return bytes;
    }


    /**
     * Loads the language model from the given file.
     *
     * @param inputStream stream to read the language model data
     * @throws java.io.IOException if IO went wrong
     */
    protected void loadModelLayout(InputStream inputStream) throws IOException {

        DataInputStream stream = new DataInputStream
                (new BufferedInputStream(inputStream));

        // read standard header string-size; set bigEndian flag
        readHeader(stream);

        // +1 is the sentinel unigram at the end
        unigrams = readUnigrams(stream, numberNGrams[0] + 1, bigEndian);
        
        skipNGrams(stream);

        // Read the NGram prob & bow tables
        for (int i = 1; i < maxNGram; i++) {      	
        	if (numberNGrams[i] > 0) {
        		if (i == 1) {
        			NGramProbTable[i] = readFloatTable(stream, bigEndian);
        		}
        		else {
        			NGramBackoffTable[i] = readFloatTable(stream, bigEndian);
        			NGramProbTable[i] = readFloatTable(stream, bigEndian);
        			
        			int nMinus1gramSegmentSize = 1 << logNGramSegmentSize;
        			int NGramSegTableSize = ((numberNGrams[i - 1] + 1) / nMinus1gramSegmentSize) + 1;
        			
        			NGramSegmentTable[i] = readIntTable(stream, bigEndian, NGramSegTableSize);
        		}
        	}
        }
        
        // read word string names
        int wordsStringLength = readInt(stream, bigEndian);
        if (wordsStringLength <= 0) {
            throw new Error("Bad word string size: " + wordsStringLength);
        }

        // read the string of all words
        this.words = readWords(stream, wordsStringLength, numberNGrams[0]);

        // A voir
        if (startWordID > -1) {
            UnigramProbability unigram = unigrams[startWordID];
            unigram.setLogProbability(MIN_PROBABILITY);
        }
        if (endWordID > -1) {
            UnigramProbability unigram = unigrams[endWordID];
            unigram.setLogBackoff(MIN_PROBABILITY);
        }

        applyUnigramWeight();
        
        if (applyLanguageWeightAndWip) {
        	for (int i = 0; i <= maxNGram; i++) {
        		applyLanguageWeight(NGramProbTable[i], languageWeight);
        		applyWip(NGramProbTable[i], wip);
        		
        		if (i > 1) {
        			applyLanguageWeight(NGramBackoffTable[i], languageWeight);
        		}
        	}
        }

        stream.close();
    }


    /**
     * Reads the LM file header
     *
     * @param stream the data stream of the LM file
     * @throws java.io.IOException
     */
    private void readHeader(DataInputStream stream) throws IOException {
        int headerLength = readInt(stream, bigEndian);

        if ((headerLength != DARPA_TG_HEADER.length() + 1) && (headerLength != DARPA_QG_HEADER.length() + 1) && (headerLength != DARPA_NG_HEADER.length() - 1)) { // not big-endian
            headerLength = Utilities.swapInteger(headerLength);
            if (headerLength == (DARPA_TG_HEADER.length() + 1) || headerLength == (DARPA_QG_HEADER.length() + 1) || headerLength == (DARPA_NG_HEADER.length() - 1)) {
                bigEndian = false;
                // System.out.println("Little-endian");
            } else {
                throw new Error("Bad binary LM file magic number: "
                        + headerLength + ", not an LM dumpfile?");
            }
        } else {
            // System.out.println("Big-endian");
        }

        // read and verify standard header string
        String header = readString(stream, headerLength - 1);
        stream.readByte(); // read the '\0'
        bytesRead++;

        if (!header.equals(DARPA_TG_HEADER) && !header.equals(DARPA_QG_HEADER) && !Pattern.matches(DARPA_NG_HEADER, header)) {
            throw new Error("Bad binary LM file header: " + header);
        }
        else {
        	if (header.equals(DARPA_TG_HEADER))
        		maxNGram = 3;
        	else if (header.equals(DARPA_QG_HEADER))
        		maxNGram = 4;
        	else {
        		Pattern p = Pattern.compile("\\d");
        		Matcher m = p.matcher(header);
        		maxNGram = Integer.parseInt(m.group());
        	}
        }
        
        // read LM filename string size and string
        int fileNameLength = readInt(stream, bigEndian);
        skipStreamBytes(stream, fileNameLength);

        numberNGrams = new int[maxNGram];
        NGramOffset = new long[maxNGram];
        NGramProbTable = new float[maxNGram][];
        NGramBackoffTable = new float[maxNGram][];
        NGramSegmentTable = new int[maxNGram][];
        
        numberNGrams[0] = 0;
        logNGramSegmentSize = LOG2_NGRAM_SEGMENT_SIZE;

        // read version number, if present. it must be <= 0.

        int version = readInt(stream, bigEndian);
        // System.out.println("Version: " + version);

        bytesPerField = 2;
        
        if (version <= 0) { // yes, its the version number
            readInt(stream, bigEndian); // read and skip timestamp

            // Means we are going 32 bits.
            if (version <= -3)
            	bytesPerField = 4;
            
            // read and skip format description
            int formatLength;
            for (; ;) {
                if ((formatLength = readInt(stream, bigEndian)) == 0) {
                    break;
                }
                bytesRead += stream.skipBytes(formatLength);
            }

            // read log NGram segment size if present
            // only for 16 bits version 2 LM
            if (version == -2) {
                logNGramSegmentSize = readInt(stream, bigEndian);
                if (logNGramSegmentSize < 1 || logNGramSegmentSize > 15) {
                    throw new Error("log2(bg_seg_sz) outside range 1..15");
                }
            }

            numberNGrams[0] = readInt(stream, bigEndian);
        } else {
        	numberNGrams[0] = version;
        }

        if (numberNGrams[0] <= 0) {
            throw new Error("Bad number of unigrams: " + numberNGrams[0]
                    + ", must be > 0.");
        }

        for (int i = 1; i < maxNGram; i++) {
            if ((numberNGrams[i] = readInt(stream, bigEndian)) < 0) {
                throw new Error("Bad number of " + String.valueOf(i) + "-grams: " + numberNGrams[i]);
            }
        }
    }


    /**
     * Skips the NGrams of the LM.
     * 
     * @param stream
     *            the source of data
     * @throws java.io.IOException
     */
    private void skipNGrams(DataInputStream stream) throws IOException {
        long bytesToSkip;

        NGramOffset[1] = bytesRead;
        bytesToSkip = (numberNGrams[1] + 1) * LargeNGramModel.BYTES_PER_NGRAM * getBytesPerField();
        skipStreamBytes(stream, bytesToSkip);

        for (int i = 2; i < maxNGram; i++) {
            if (numberNGrams[i] > 0 && i < maxNGram - 1) {
                NGramOffset[i] = bytesRead;
                bytesToSkip = (long) (numberNGrams[i] + 1) * (long) LargeNGramModel.BYTES_PER_NGRAM * getBytesPerField();
                skipStreamBytes(stream, bytesToSkip);
            } else if (numberNGrams[i] > 0 && i == maxNGram - 1) {
                NGramOffset[i] = bytesRead;
                bytesToSkip = (long) (numberNGrams[i]) * (long) LargeNGramModel.BYTES_PER_NMAXGRAM * getBytesPerField();
                skipStreamBytes(stream, bytesToSkip);
            }
        }
    }
    
    /**
     * Reliable skip
     * 
     * @param stream stream
     * @param bytes number of bytes
     */
    private void skipStreamBytes(DataInputStream stream, long bytes) throws IOException {
        while (bytes > 0) {
            long skipped = stream.skip(bytes);
            bytesRead += skipped;
            bytes -= skipped;
        }
    }
    

    /** Apply the unigram weight to the set of unigrams */
    private void applyUnigramWeight() {
        float logUnigramWeight = logMath.linearToLog(unigramWeight);
        float logNotUnigramWeight = logMath.linearToLog(1.0f - unigramWeight);
        float logUniform = logMath.linearToLog(1.0f / (numberNGrams[0]));

        float logWip = logMath.linearToLog(wip);

        float p2 = logUniform + logNotUnigramWeight;

        for (int i = 0; i < numberNGrams[0]; i++) {
            UnigramProbability unigram = unigrams[i];

            float p1 = unigram.getLogProbability();

            if (i != startWordID) {
                p1 += logUnigramWeight;
                p1 = logMath.addAsLinear(p1, p2);
            }

            if (applyLanguageWeightAndWip) {
                p1 = p1 * languageWeight + logWip;
                unigram.setLogBackoff(unigram.getLogBackoff() * languageWeight);
            }

            unigram.setLogProbability(p1);
        }
    }


    /** Apply the language weight to the given array of probabilities.
     */
    private void applyLanguageWeight(float[] logProbabilities,
                                     float languageWeight) {
        for (int i = 0; i < logProbabilities.length; i++) {
            logProbabilities[i] = logProbabilities[i] * languageWeight;
        }
    }


    /** Apply the WIP to the given array of probabilities.
    */
    private void applyWip(float[] logProbabilities, double wip) {
        float logWip = logMath.linearToLog(wip);
        for (int i = 0; i < logProbabilities.length; i++) {
            logProbabilities[i] = logProbabilities[i] + logWip;
        }
    }


    /**
     * Reads the probability table from the given DataInputStream.
     *
     * @param stream    the DataInputStream from which to read the table
     * @param bigEndian true if the given stream is bigEndian, false otherwise
     * @throws java.io.IOException
     */
    private float[] readFloatTable(DataInputStream stream, boolean bigEndian)
            throws IOException {

        int numProbs = readInt(stream, bigEndian);
        if (numProbs <= 0 || numProbs > MAX_PROB_TABLE_SIZE) {
            throw new Error("Bad probabilities table size: " + numProbs);
        }

        float[] probTable = new float[numProbs];

        for (int i = 0; i < numProbs; i++) {
        	//probTable[i] = readFloat(stream, bigEndian);
            probTable[i] = logMath.log10ToLog(readFloat(stream, bigEndian));
        }

        return probTable;
    }


    /**
     * Reads a table of integers from the given DataInputStream.
     *
     * @param stream    the DataInputStream from which to read the table
     * @param bigEndian true if the given stream is bigEndian, false otherwise
     * @param tableSize the size of the NGram segment table
     * @return the NGram segment table, which is an array of integers
     * @throws java.io.IOException
     */
    private int[] readIntTable(DataInputStream stream, boolean bigEndian,
                               int tableSize) throws IOException {
        int numSegments = readInt(stream, bigEndian);
        if (numSegments != tableSize) {
            throw new Error("Bad NGram seg table size: " + numSegments);
        }
        int[] segmentTable = new int[numSegments];
        for (int i = 0; i < numSegments; i++) {
            segmentTable[i] = readInt(stream, bigEndian);
        }
        return segmentTable;
    }


    /**
     * Read in the unigrams in the given DataInputStream.
     *
     * @param stream         the DataInputStream to read from
     * @param numberUnigrams the number of unigrams to read
     * @param bigEndian      true if the DataInputStream is big-endian, false otherwise
     * @return an array of UnigramProbability index by the unigram ID
     * @throws java.io.IOException
     */
    private UnigramProbability[] readUnigrams(DataInputStream stream,
                                              int numberUnigrams, boolean bigEndian) throws IOException {

        UnigramProbability[] unigrams = new UnigramProbability[numberUnigrams];

        for (int i = 0; i < numberUnigrams; i++) {

            // read unigram ID, unigram probability, unigram backoff weight
            int unigramID = readInt(stream, bigEndian);
            
            /* Some tools to convert to DMP doesn't store ID's in unigrams */
            if (unigramID < 1) 
            	unigramID = i;

            // if we're not reading the sentinel unigram at the end,
            // make sure that the unigram IDs are consecutive
            if (i != (numberUnigrams - 1)) {
                assert (unigramID == i);
            }

            float unigramProbability = readFloat(stream, bigEndian);
            float unigramBackoff = readFloat(stream, bigEndian);
            int firstBigramEntry = readInt(stream, bigEndian);

            float logProbability = logMath.log10ToLog(unigramProbability);
            float logBackoff = logMath.log10ToLog(unigramBackoff);

            unigrams[i] = new UnigramProbability(unigramID, logProbability,
                    logBackoff, firstBigramEntry);
        }

        return unigrams;
    }


    /**
     * Reads an integer from the given DataInputStream.
     *
     * @param stream    the DataInputStream to read from
     * @param bigEndian true if the DataInputStream is in bigEndian, false otherwise
     * @return the integer read
     * @throws java.io.IOException
     */
    private int readInt(DataInputStream stream, boolean bigEndian)
            throws IOException {
        bytesRead += 4;
        if (bigEndian) {
            return stream.readInt();
        } else {
            return Utilities.readLittleEndianInt(stream);
        }
    }


    /**
     * Reads a float from the given DataInputStream.
     *
     * @param stream    the DataInputStream to read from
     * @param bigEndian true if the DataInputStream is in bigEndian, false otherwise
     * @return the float read
     * @throws java.io.IOException
     */
    private float readFloat(DataInputStream stream, boolean bigEndian)
            throws IOException {
        bytesRead += 4;
        if (bigEndian) {
            return stream.readFloat();
        } else {
            return Utilities.readLittleEndianFloat(stream);
        }
    }



     /**
      * Reads a string of the given length from the given DataInputStream. It is assumed that the DataInputStream
      * contains 8-bit chars.
      *
      * @param stream the DataInputStream to read from
      * @param length the number of characters in the returned string
      * @return a string of the given length from the given DataInputStream
      * @throws java.io.IOException
      */
     private String readString(DataInputStream stream, int length)
             throws IOException {
         StringBuilder builder = new StringBuilder();
         byte[] bytes = new byte[length];
         bytesRead += stream.read(bytes);
 
         for (int i = 0; i < length; i++) {
             builder.append((char) bytes[i]);
         }
         return builder.toString();
     }
 
 
     /**
      * Reads a series of consecutive Strings from the given stream.
      *
      * @param stream         the DataInputStream to read from
      * @param length         the total length in bytes of all the Strings
      * @param numberUnigrams the number of String to read
      * @return an array of the Strings read
      * @throws java.io.IOException
      */
     private String[] readWords(DataInputStream stream, int length,
                                      int numberUnigrams) throws IOException {
         String[] words = new String[numberUnigrams];
         byte[] bytes = new byte[length];
         bytesRead += stream.read(bytes);
 
         int s = 0;
         int wordStart = 0;
         for (int i = 0; i < length; i++) {
             char c = (char) (bytes[i] & 0xFF);
             bytesRead++;
             if (c == '\0') {
                 // if its the end of a string, add it to the 'words' array
                 words[s] = new String(bytes, wordStart, i - wordStart);
                 wordStart = i + 1;
                 if (words[s].equals(Dictionary.SENTENCE_START_SPELLING)) {
                     startWordID = s;
                 } else if (words[s].equals(Dictionary.SENTENCE_END_SPELLING)) {
                     endWordID = s;
                 }
                 s++;
             }
         }
         assert (s == numberUnigrams);
         return words;
     }
     
}
