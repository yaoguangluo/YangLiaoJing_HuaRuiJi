package OSI.OVU.OSU.MSQ.MV.SQ.guassianFilter;
import java.io.IOException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.image.Guassian;
import PEU.P.movie.LYGFileIO;
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
