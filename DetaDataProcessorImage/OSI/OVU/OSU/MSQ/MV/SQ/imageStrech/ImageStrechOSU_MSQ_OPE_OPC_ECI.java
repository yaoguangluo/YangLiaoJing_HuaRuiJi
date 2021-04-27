package OSI.OVU.OSU.MSQ.MV.SQ.imageStrech;
import java.io.IOException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.image.Strech;
import PEU.P.movie.LYGFileIO;
public class ImageStrechOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public ImageStrechOSU_MSQ_OPE_OPC_ECI( ) throws IOException{	
	}
	public void run(final ImageStrechOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException{
		System.out.println("runed"+value);   
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout=new LYGFileIO();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout.image=new Strech().Processor(this.toplygin.image,0.1,0.9); 
	}
}
