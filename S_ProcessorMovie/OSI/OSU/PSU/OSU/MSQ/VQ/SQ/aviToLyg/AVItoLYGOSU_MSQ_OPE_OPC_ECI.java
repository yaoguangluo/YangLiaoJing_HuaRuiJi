package OSI.OSU.PSU.OSU.MSQ.VQ.SQ.aviToLyg;
import java.io.IOException;




import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.movie.LYGFileIO;

public class AVItoLYGOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public String writefile;
	jp jj;
	public String filepathWAV;
	public AVItoLYGOSU_MSQ_OPE_OPC_ECI()throws IOException{	
 	}
	public void run(final AVItoLYGOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) 
			throws IOException, UnsupportedAudioFileException{		
		 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout = new LYGFileIO();
		 jj = new jp(filepath ,filepathWAV,writefile, SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout);			
		 JFrame ff = new JFrame();
		 ff.add(jj);
	     ff.setSize(500, 200);
	     ff.setVisible(true);
	    System.out.println("run end");
	}
}
