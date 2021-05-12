package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.xlsReaderNode;
import java.io.IOException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class XlsReaderOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public XlsReaderOSU_MSQ_OPE_OPC_ECI( ) throws IOException{	
	}
	public void run(final XlsReaderOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException{
		this.setLayout(null);
		System.out.println("runed"+value);	
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout=this.toptablein; 	
	}
}
