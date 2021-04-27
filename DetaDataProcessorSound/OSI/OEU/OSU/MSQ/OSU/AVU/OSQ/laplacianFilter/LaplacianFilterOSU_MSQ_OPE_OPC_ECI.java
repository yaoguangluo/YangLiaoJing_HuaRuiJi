package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.laplacianFilter;


import java.io.IOException;
import java.util.Vector;


import javax.sound.sampled.UnsupportedAudioFileException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.sound.*;


public class LaplacianFilterOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public LaplacianFilterOSU_MSQ_OPE_OPC_ECI( ) throws IOException{	
	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final LaplacianFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException, UnsupportedAudioFileException{
		//anasys
		LaplacianPro gs=new LaplacianPro();
		Vector lines = gs.getVectorLines(topaisin);
		topaisin = new BytestoAIS().getAIS(gs.laplacian,topaisin);
		//play
		//new soundPlay().Play(ais1);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.aisout=topaisin;
	}
}
