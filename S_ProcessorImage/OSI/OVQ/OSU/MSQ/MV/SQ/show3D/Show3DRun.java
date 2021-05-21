package OSI.OVQ.OSU.MSQ.MV.SQ.show3D;

import java.io.IOException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class Show3DRun extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value= 0;
	public String filepath;
	public Show3DRun() throws IOException{	
		super();
 	}
	public void run(final Show3DView SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException{
		System.out.println("runed"+value); 
  		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.path=new String(filepath); 
	 	  int out[][] = new int[topgin.length][topgin[0].length];
	       for (int i = 0; i < topgin.length; i++) {
	           for (int j = 0; j < topgin[0].length; j++)  {
	            out[i][j]=topgin[i][j];
	           }
	       }		    	
		//gin = new Strech().Processor(out,0.1,0.9); 
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.gout=out;
	  //SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.out=new JTable(content,spec); 	
		  //SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.out=new JTable(content,spec); 	
	}
}
