package org.OVU.node.image.GuassianFilter;
import java.io.IOException;

import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;
import PEU.imageProcessorYLJ.Guassian;
import PEU.movieProcessorYLJ.LYGFileIO;
public class GuassianFilterRun extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public GuassianFilterRun( ) throws IOException{	
		super();
 	}
	
	public void run(final GuassianFilterView SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException{
		System.out.println("runed"+value); 
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout=new LYGFileIO();
	    SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout.image=new Guassian().Processor(toplygin.image,3,3,1.6);
	}
}
