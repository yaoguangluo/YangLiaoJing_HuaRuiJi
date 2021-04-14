package org.LYG.node.movie.lygRead;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;
import PEU.movieProcessorYLJ.LYGFileIO;

public class LYGReadOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public LYGReadOSU_MSQ_OPE_OPC_ECI()throws IOException{	
 	}
	public void run(final LYGReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException, UnsupportedAudioFileException{		
		toplygin = new LYGFileIO();
		toplygin.reset();
		toplygin.lygRead(filepath);
		//IO.lygRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newluo.lyg");
		toplygin.init();
	    SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout=toplygin;
	    System.out.println("run end");
	}
}
