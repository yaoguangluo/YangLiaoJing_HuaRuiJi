package OSI.OVU.OSU.MSQ.OSU.AVU.OSQ.butterworthFilter;


import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.sound.*;

public class ButterworthFilterOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public ButterworthFilterOSU_MSQ_OPE_OPC_ECI( ) throws IOException{	
	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final ButterworthFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException, UnsupportedAudioFileException{ 		
		//anasys
		ButterworthPro Bs = new ButterworthPro();
		Vector lines = Bs.getVectorLines(topaisin);
		topaisin = new BytestoAIS().getAIS(Bs.butterworth,topaisin);
		AudioInputStream cp = new BytestoAIS().getAIS(Bs.butterworth,topaisin);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.aisout=cp;
	}
}
