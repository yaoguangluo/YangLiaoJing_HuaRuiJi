package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.freqCount;


import java.io.IOException;


import javax.sound.sampled.UnsupportedAudioFileException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;



public class FreqCountOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public FreqCountOSU_MSQ_OPE_OPC_ECI( ) throws IOException
 	{	
 	}
	public void run(final FreqCountOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		         int size[] = new int[9999];
		         int cacucount = 0;
                 double []reg = toplygin.adataFrame.master;
                 for(int i = 1;i<reg.length-1;i++)
                 {
                	 //find high
                	 if(reg[i]<reg[i+1]&&reg[i]<reg[i-1])
                	 {
                			 size[cacucount]++;
                			 cacucount=0;	 
                     }                	 
                     cacucount++; 
                 }
				
				 
				 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout=toplygin;
				 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.lygout.fsize=size;
	}
}
