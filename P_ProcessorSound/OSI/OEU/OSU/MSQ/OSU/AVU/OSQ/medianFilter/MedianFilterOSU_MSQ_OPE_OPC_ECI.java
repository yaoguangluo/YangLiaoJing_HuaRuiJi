package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.medianFilter;






import java.io.IOException;
import java.util.Vector;



import javax.sound.sampled.UnsupportedAudioFileException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.sound.MedianPro;


public class MedianFilterOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public MedianFilterOSU_MSQ_OPE_OPC_ECI( ) throws IOException
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final MedianFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
				 MedianPro gs = new MedianPro();
				 Vector lines = gs.getVectorLines(toplygin);
				 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout= toplygin;
	}
}
