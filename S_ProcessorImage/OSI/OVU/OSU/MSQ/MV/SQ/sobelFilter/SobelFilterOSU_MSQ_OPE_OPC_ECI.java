package OSI.OVU.OSU.MSQ.MV.SQ.sobelFilter;
import java.io.IOException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.image.*;
public class SobelFilterOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public SobelFilterOSU_MSQ_OPE_OPC_ECI( ) throws IOException{	
	}
	public void run(final SobelFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException{
		System.out.println("runed"+value); 
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.path=new String(filepath); 
		int[][] mag= new Sobel().Processor(topgin,1);	    //1 for mag 2 for dir
		int[][] dir= new Sobel().Processor(topgin,2);
		mag = new Threshold().Processor(mag,12);      //bina value = 20
		dir= new Mask().Processor(mag,dir);           // mag as mask
		topgin=dir;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.gout=topgin;
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.out=new JTable(content,spec); 	
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.out=new JTable(content,spec); 	
	}
}
