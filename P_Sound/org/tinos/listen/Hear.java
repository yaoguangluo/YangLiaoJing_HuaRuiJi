package org.tinos.listen;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import PEU.P.movie.*;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import edu.cmu.sphinx.decoder.adaptation.Stats;
import edu.cmu.sphinx.decoder.adaptation.Transform;
//import soundProcessor.SoundPlay;
public class Hear {
	public AudioInputStream audioInputStream;
	public int big;
	TargetDataLine line;
	Thread thread;
	AudioFormat format;
	public int times= 0;
	public boolean stoped= false;
	public AdataFrame adataFrame;

	public Hear(){
		audioInputStream= null;  
		adataFrame= new AdataFrame();
		AudioFormat.Encoding encoding= AudioFormat.Encoding.PCM_SIGNED;  
		float rate= 19200f;  
		int sampleSize= 8;  
		@SuppressWarnings("unused")
		String signedString= "signed";  
		boolean bigEndian= true;  
		int channels= 1;  
		format= new AudioFormat(encoding, rate, sampleSize,  
				channels, (sampleSize/ 8)* channels, rate, bigEndian); 
	}
	@SuppressWarnings({ "unused", "resource" })
	public void listen() {
		DataLine.Info info= new DataLine.Info(TargetDataLine.class, format);
		if (!AudioSystem.isLineSupported(info)) {
			return;
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
			byte[] data= new byte[2400];
			line.start();
			//audioInputStream= new AudioInputStream(line);
			for(int i=0;i<100;i++) {
				if((numBytesRead= line.read(data, 0, bufferLengthInBytes))== -1) {
					break;
				}
				if(numBytesRead<= 0) {
					break;
				}
				out.write(data, 0, numBytesRead);
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
			//print
			//			Thread.sleep(10);
			//			SoundPlay soundPlay= new SoundPlay();
			//			System.out.println("speak");
			//			soundPlay.Play(audioInputStream);

			Configuration configuration = new Configuration();
			configuration.setAcousticModelPath("resources:/edu/cmu/sphinx/models/en-us/en-us");
			configuration.setDictionaryPath("resources:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
			configuration.setLanguageModelPath("resources:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
			StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
			//to file
			File file= new File("D:\\Users\\Lenovo\\eclipse-workspace\\DETA_YLJ1.0.0\\resources\\edu\\cmu\\sphinx\\10001-90210-01803.wav");
			InputStream stream = new FileInputStream(file);
		    stream.skip(44);
			
			//read file
			Stats stats = recognizer.createStats(1);
			Transform transform = stats.createTransform();
		        recognizer.setTransform(transform);

			//recognizer.startRecognition(stream);
		    recognizer.startRecognition(audioInputStream);
			SpeechResult result;
			while ((result = recognizer.getResult()) != null) {
				System.out.format("Hypothesis: %s\n", result.getHypothesis());
			}
			recognizer.stopRecognition();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] argv) {
		Hear hear= new Hear();
		hear.listen();
	}
}