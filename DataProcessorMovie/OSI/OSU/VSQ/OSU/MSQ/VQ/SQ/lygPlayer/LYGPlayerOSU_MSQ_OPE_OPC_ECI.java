package OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygPlayer;
import java.io.IOException;


import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.movie.LYGFileIO;

public class LYGPlayerOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public String writefile;
	Jp jj;
	public String filepathWAV;
	public LYGPlayerOSU_MSQ_OPE_OPC_ECI()throws IOException{	
 	}
	public void run(final LYGPlayerOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)
			throws IOException, UnsupportedAudioFileException{		
		 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout = new LYGFileIO();
		 jj = new Jp(filepath);			
		 JFrame ff = new JFrame();
		 ff.add(jj);
	     ff.setSize(800, 600);
	     ff.setVisible(true);
	     System.out.println("run end");
	}
}
