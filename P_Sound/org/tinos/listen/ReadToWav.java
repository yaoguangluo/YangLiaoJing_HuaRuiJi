package org.tinos.listen;

import java.io.ByteArrayInputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import PEU.P.movie.*;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import edu.cmu.sphinx.decoder.adaptation.Stats;
import edu.cmu.sphinx.decoder.adaptation.Transform;
//import soundProcessor.SoundPlay;
public class ReadToWav {
	public AudioInputStream audioInputStream;
	public int big;
	TargetDataLine line;
	Thread thread;
	AudioFormat format;
	public int times= 0;
	public boolean stoped= false;
	public AdataFrame adataFrame;

	public void saveToFile(AudioFileFormat.Type type) throws IOException {
		//audioInputStream.reset();
		File file= new File("D:\\temp\\temp.wav");
		if(AudioSystem.write(audioInputStream, type, file)==-1) {
			throw new IOException("error luo");
		};
	}

	@SuppressWarnings("unused")
	public ReadToWav(){
		audioInputStream= null;  
		adataFrame= new AdataFrame();
		AudioFormat.Encoding encoding= AudioFormat.Encoding.PCM_SIGNED;  
		float rate= 16000f;  
		int sampleSize= 16;  
		String signedString= "signed";  
		boolean bigEndian= false;  
		int channels= 1;  
		format= new AudioFormat(encoding, rate, sampleSize,  
				channels, (sampleSize/ 8)* channels, rate, bigEndian); 
	}
	
	public String listen() throws LineUnavailableException, UnsupportedAudioFileException {
		DataLine.Info info= new DataLine.Info(TargetDataLine.class, format);
		if (!AudioSystem.isLineSupported(info)) {
			return "";
		}
		try {
			line = (TargetDataLine)AudioSystem.getLine(info);
			line.open(format, line.getBufferSize());
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ByteArrayOutputStream out= new ByteArrayOutputStream();
			//OutputStream out= new OutputStream();
			int frameSizeInBytes= format.getFrameSize();
			int bufferLengthInFrames= line.getBufferSize()/(8);
			int bufferLengthInBytes= bufferLengthInFrames* frameSizeInBytes;
			System.out.println("bufferLengthInBytes : "+ bufferLengthInBytes +" **");
			int numBytesRead= 0;
			//		byte[] data= new byte[bufferLengthInBytes];
			byte[] data= new byte[bufferLengthInBytes*2/20];
			line.start();
			//audioInputStream= new AudioInputStream(line);
			for(int i= 0; i< 40; i++) {
				for(int j= 0; j< 20; j++) {
					if((numBytesRead= line.read(data, 0, data.length))> 0) {
						out.write(data, 0, numBytesRead);
					}	
				}
			}
			byte[] audioBytes= out.toByteArray();
			ByteArrayInputStream bais= new ByteArrayInputStream(audioBytes);
			audioInputStream= new AudioInputStream(bais, format
					, audioBytes.length/ frameSizeInBytes);
			line.stop();
			line.close();
			line= null;
			out.close();
			stoped= true;
			saveToFile(AudioFileFormat.Type.WAVE);
			//	print
			Configuration configuration = new Configuration();
			configuration.setAcousticModelPath("resources:/edu/cmu/sphinx/models/en-us/en-us");
			configuration.setDictionaryPath("resources:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
			configuration.setLanguageModelPath("resources:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
			StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
			//to file
			File file= new File("D:\\temp\\temp.wav");
			audioInputStream= AudioSystem.getAudioInputStream(file);
			InputStream stream = new FileInputStream(file);
			stream.skip(44);
			Stats stats = recognizer.createStats(3);
			Transform transform = stats.createTransform();
			recognizer.setTransform(transform);
			recognizer.startRecognition(stream);
			SpeechResult result;
			String output= "";
			while ((result= recognizer.getResult()) != null) {
				output+= " "+ result.getHypothesis();
			}
			recognizer.stopRecognition();
			return output;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String[] argv) throws LineUnavailableException, UnsupportedAudioFileException {
		System.out.println(new ReadToWav().listen());
	}
}