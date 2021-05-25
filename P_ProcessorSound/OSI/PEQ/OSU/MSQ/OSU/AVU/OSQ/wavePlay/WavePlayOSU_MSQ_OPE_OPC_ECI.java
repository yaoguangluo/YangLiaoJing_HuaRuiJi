package OSI.PEQ.OSU.MSQ.OSU.AVU.OSQ.wavePlay;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

public class WavePlayOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI 
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	Jp jj;
	public WavePlayOSU_MSQ_OPE_OPC_ECI( ) throws IOException
 	{	
 	}
	public void run(final WavePlayOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException, UnsupportedAudioFileException, InterruptedException
	{ 			
		 jj= new Jp(toplygin);			
		 JFrame ff=new JFrame();
		 ff.add(jj);
		 //ff.addWindowListener(this);
		 //.setDefaultCloseOperation(JFrame..EXIT_ON_CLOSE);
	     ff.setSize(500, 200);
	     ff.setVisible(true);
		 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout = toplygin;
		 System.out.println("end");
				 //anasys
	}
}
