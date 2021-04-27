package OSI.OVU.OSU.MSQ.MV.SQ.grayFilter;
import java.io.IOException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.image.*;
public class GrayFilterOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public GrayFilterOSU_MSQ_OPE_OPC_ECI( ) throws IOException{	
 	}
	public void run(final GrayFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)
			throws IOException{
		System.out.println("runed"+value);   
		topgin=new ReadWritePng().GRNpngRead(toplygin.image);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.gout=topgin;	
	}
}
