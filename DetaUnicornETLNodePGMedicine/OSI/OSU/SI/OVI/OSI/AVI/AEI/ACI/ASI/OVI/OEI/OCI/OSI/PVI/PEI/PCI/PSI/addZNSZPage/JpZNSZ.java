package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZNSZPage;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D.Double;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import MVQ.button.DetaButton;
import MVQ.filenameFilter.TXTFilter;
import PEU.P.sound.SoundRecord;
import PEU.P.wave.DFT;

public class JpZNSZ extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;
	LYGFileIO lYGFileIO;
	public Thread thread;
	public DFT dFT;
	Thread time;
	public int reg= 0;
	public JpWave waveJpanel;
	int type= 0;
	SoundRecord rec;
	Vector<Double> lines ;
	Vector<Double> forOutput;
	BufferedImage imageForOutput;
	Jpv jpv;
	
	//
	public JpZNSZ(Container jpanelFourth, DFT dFT, JTextPane text, BufferedImage imageForOutput
			, MakeContainerZNSZ makeContainerZNSZ){
		this.imageForOutput= imageForOutput;
		this.dFT= dFT;
		forOutput= new Vector<Double>();
		rec= new SoundRecord(null);
		
		double[] fft= new double[1024];
		fft[4]= 500;
		LYGFileIO lYGFileIO= new LYGFileIO().initWithFFT(new double[1024], makeContainerZNSZ);
		waveJpanel= new JpWave(lYGFileIO);
		
		JButton jButtonStart = new DetaButton("Æô¶¯",100,50,Color.red);
		jButtonStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				type= 0;
				thread= new Thread(JpZNSZ.this);
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();	
				jpanelFourth.validate();
			}
		});
		jButtonStart.setSize(100, 30);
		jButtonStart.setBounds(500, 20, 100, 30);
		JButton jButtonStop= new DetaButton("¹Ø±Õ",100,50,Color.black);
		jButtonStop.setForeground(Color.white);
		jButtonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 0;
				waveJpanel.reg= 0;
				jpanelFourth.validate();
			}
		});
		jButtonStop.setSize(100, 30);
		JButton jButtonMakesArray= new DetaButton("Éú³ÉÊýÁÐ", 100- 20, 50, Color.green);
		jButtonMakesArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				reg= 2;
				if(forOutput== null) {
					return;
				}
				if(forOutput.size()<= 0) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page= new StringBuilder();
				Iterator<Double> iterator= forOutput.iterator();
					while(iterator.hasNext()) {
						Double setOfi= iterator.next();
						page.append(" "+ setOfi.getX2()+":"+setOfi.getY2()); 
					}
					if(!text.getText().isEmpty()) {
						text.setText(text.getText() +"\r\n\r\n"+ page.toString());
					}else {
						text.setText(page.toString());
					}
					text.validate(); 
			}
		});
		jButtonMakesArray.setSize(100,30);
		
		JButton jButtonReadArray= new DetaButton("¶ÁÈ¡ÊýÁÐ", 100- 20, 50, Color.green);
		jButtonReadArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				reg= 2;
				if(forOutput== null) {
					return;
				}
				if(forOutput.size()<= 0) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page= new StringBuilder();
				Iterator<Double> iterator= forOutput.iterator();
					while(iterator.hasNext()) {
						Double setOfi= iterator.next();
						page.append(" "+ setOfi.getX2()+":"+setOfi.getY2()); 
					}
					if(!text.getText().isEmpty()) {
						text.setText(text.getText() +"\r\n\r\n"+ page.toString());
					}else {
						text.setText(page.toString());
					}
					text.validate(); 
			}
		});
		jButtonReadArray.setSize(100,30);
		
		JButton jButtonSaveImage= new DetaButton("±£´æÍ¼Æ¬", 100- 20, 50, Color.magenta);
		jButtonSaveImage.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				reg= 0;
				//ï¿½ï¿½È¡Í¼Æ¬
				//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿
				if(null== imageForOutput) {
					return;
				}
				//get path
				FileDialog filedialog= new FileDialog(new Frame(), "±£´æÍ¼Æ¬µ½..", FileDialog.LOAD);
				filedialog.setFilenameFilter(new TXTFilter("png"));
				filedialog.setVisible(true);
				String filepath= filedialog.getDirectory() + filedialog.getFile();
				System.out.println(filepath);
				try {
					File outputBin = new File(filepath+ ".png");
					if(null== imageForOutput) {
						return;
					}
					ImageIO.write(imageForOutput, "png", outputBin);	
				} catch (IOException writePngError) {
					System.out.println(filepath);
				}	
				//ï¿½ï¿½ï¿½Í¼Æ
			}
		});
		jButtonSaveImage.setSize(100, 30);
		
		JButton jButtonDetectNoise= new DetaButton("ÔëÉù¼ì²â", 100- 20, 50, Color.black);
		jButtonDetectNoise.setForeground(Color.white);
		jButtonDetectNoise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				type= 1;
				thread= new Thread(JpZNSZ.this);
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();	
				jpanelFourth.validate();
			}
		});
		jButtonDetectNoise.setSize(100, 30);
		
		JButton jButtonReadImage= new DetaButton("¶ÁÈ¡Í¼Æ¬", 100- 20, 50, Color.black);
		jButtonReadImage.setForeground(Color.white);
		jButtonReadImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				type= 1;
				thread= new Thread(JpZNSZ.this);
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();	
				jpanelFourth.validate();
			}
		});
		jButtonReadImage.setSize(100, 30);
		
		JButton jButtonReadImage1= new DetaButton("µ÷ÖÆ½âµ÷", 100- 20, 50, Color.black);
		jButtonReadImage1.setForeground(Color.white);
		jButtonReadImage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				type= 1;
				//new fft[];
//				double[] fft= new double[1024];
//				fft[4]= 500;
//				LYGFileIO lYGFileIO= new LYGFileIO().initWithFFT(new double[1024], makeContainerZNSZ);
//				waveJpanel= new org.LYG.node.sound.wavePlay.jp(lYGFileIO);
				waveJpanel.reg= 5;
				thread= new Thread(waveJpanel);
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();;
				jpanelFourth.validate();
			}
		});
		jButtonReadImage1.setSize(100, 30);
		
		DetaButton jButtonUndustMonit= new DetaButton("É½ÁÖ", 100-10, 50, Color.green);
		jButtonUndustMonit.setForeground(Color.white);
		jButtonUndustMonit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				type= 1;
				thread= new Thread(JpZNSZ.this);
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();	
				jpanelFourth.validate();
			}
		});
		jButtonUndustMonit.setSize(100, 30);
		
		DetaButton jButtonSeasideMonit= new DetaButton("º£±ß", 100- 20, 50, Color.blue);
		jButtonSeasideMonit.setForeground(Color.white);
		jButtonSeasideMonit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				type= 1;
				thread= new Thread(JpZNSZ.this);
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();	
				jpanelFourth.validate();
			}
		});
		jButtonSeasideMonit.setSize(100, 30);
		
		JButton jButtonImaginationMonit= new DetaButton("ÃÀÃÎ", 100- 20, 50, Color.magenta);
		jButtonImaginationMonit.setForeground(Color.white);
		jButtonImaginationMonit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				type= 1;
				thread= new Thread(JpZNSZ.this);
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();	
				jpanelFourth.validate();
			}
		});
		jButtonImaginationMonit.setSize(100, 30);
		
		JButton jButtonLibraryMonit= new DetaButton("ÔÄ¶Á", 100- 20, 50, Color.yellow);
		jButtonLibraryMonit.setForeground(Color.white);
		jButtonLibraryMonit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				type= 1;
				thread= new Thread(JpZNSZ.this);
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();	
				jpanelFourth.validate();
			}
		});
		jButtonLibraryMonit.setSize(100, 30);
	
		this.add(jButtonStart);	
		this.add(jButtonStop);
		this.add(jButtonMakesArray);	
		this.add(jButtonReadArray);	
		this.add(jButtonSaveImage);
		this.add(jButtonReadImage);
		this.add(jButtonDetectNoise);
		this.add(jButtonReadImage1);
		this.add(jButtonUndustMonit);
		this.add(jButtonSeasideMonit);
		this.add(jButtonImaginationMonit);
		this.add(jButtonLibraryMonit);
		jpv= new Jpv(imageForOutput.getGraphics());
		jpv.setBounds(100, 0, 400, 400);
		jpv.setVisible(true);
		this.add(jpv);	
	} 

	@SuppressWarnings({ "unchecked", "unused" })
	public void run(){
		while(reg==1){
			//System.out.println("luo");
			SoundWaveVector sw= new SoundWaveVector();
			time= new Thread(rec);
			time.setPriority(6);
			TargetDataLine line;
			AudioFormat.Encoding encoding = AudioFormat.Encoding.PCM_SIGNED;  
			float rate= 19200f;  
			int sampleSize= 16;  
			String signedString= "signed";  
			boolean bigEndian = true;  
			int channels= 2;  
			AudioFormat format= new AudioFormat(encoding, rate, sampleSize,  
					channels, (sampleSize/ 8) * channels, rate, bigEndian); 
			Map<String,String> cache_sj=new ConcurrentHashMap<>();
			Map<String,String> cache_bz=new ConcurrentHashMap<>();
//			//InputStream ain = getClass().getResourceAsStream("zabo.txt");
//			//BufferedReader acReader= new BufferedReader(new InputStreamReader(ain));  
//			//String actempString= null; 
//			try {
//				//while ((actempString = acReader.readLine()) != null) {
//					//cache_bz.put(actempString, actempString);
//				//}
//				//acReader.close();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			while(reg==1){
				try {
					Thread.sleep(1);
					DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);  
					if (!AudioSystem.isLineSupported(info)) {
						return;
					}
					// get and open the target data line for capture.
					try {
						line = (TargetDataLine) AudioSystem.getLine(info);
						line.open(format, line.getBufferSize());
					} catch (LineUnavailableException ex) { 
						return;
					} catch (SecurityException ex) { 
						//shutDown(ex.toString());
						return;
					} catch (Exception ex) { 
						//shutDown(ex.toString());
						return;
					}
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					Thread.sleep(100);
					int frameSizeInBytes = format.getFrameSize();
					int bufferLengthInFrames = line.getBufferSize() / 8;
					int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
					//  System.out.println("bufferLengthInBytes : " + bufferLengthInBytes +" **");
					byte[] data = new byte[bufferLengthInBytes];
					int numBytesRead = 0;
					line.start();
					if((numBytesRead = line.read(data, 0, bufferLengthInBytes)) == -1) {
						break;
					}
					out.write(data, 0, numBytesRead);
					line.stop();
					line.close();
					line = null;
					// stop and close the output stream
					try {
						out.flush();
						out.close();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
					// load bytes into the audio input stream for playback
					byte[] audioBytes= out.toByteArray();
					ByteArrayInputStream bais= new ByteArrayInputStream(audioBytes);
					AudioInputStream ais= new AudioInputStream(bais, format, audioBytes.length/ format.getFrameSize());    
					lines= sw.getVectorLines1(this, jpv, ais, cache_bz, cache_sj, dFT, forOutput
							, imageForOutput.getGraphics(), type);				     
				} catch (InterruptedException | IOException e) {
					e.printStackTrace();
				}
			}
			//ï¿½ï¿½Ê¾ï¿½ï¿½ï¿½ï¿½ï¿ 
			return;
		} 
	}
}
