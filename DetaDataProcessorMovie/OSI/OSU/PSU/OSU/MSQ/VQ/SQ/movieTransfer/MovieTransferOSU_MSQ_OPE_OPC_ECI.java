package OSI.OSU.PSU.OSU.MSQ.VQ.SQ.movieTransfer;
import java.io.File;
import java.io.IOException;
import javax.media.NoDataSinkException;
import javax.media.NoProcessorException;
import javax.media.NotRealizedError;
import javax.sound.sampled.UnsupportedAudioFileException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
import PEU.P.movie.Export;
public class MovieTransferOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public MovieTransferOSU_MSQ_OPE_OPC_ECI()throws IOException{	
 	}
	@SuppressWarnings({ "deprecation", "unused" })
	public void run(final MovieTransferOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) 
			throws IOException, UnsupportedAudioFileException, NoProcessorException, NoDataSinkException
			, NotRealizedError, InterruptedException{		
		File f = new File(this.filepath);
		Export e=new Export(f.toURL().toString());	
	    SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout=toplygin;
	    System.out.println("run end");
	}
}