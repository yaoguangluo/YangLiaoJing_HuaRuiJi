package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;
@SuppressWarnings("unused")
public class InitonsPDS{
	public static void main(String[] argv) {
		
	}
	
	public String EUM_QD_MQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"A","O","P","M"}, {"D","I","U","Q"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUM_QI_PQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"A", "O", "P", "M"}, {"V", "E", "C", "S"}, {"D", "I", "U", "Q"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUM_QD_PQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"A", "O", "P", "M"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUM_Q_PQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"V", "E", "C", "S"}, {"D", "I", "U", "Q"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUM_QU_PQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"V", "E", "C", "S"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUP_QD_PQU(String AEP, int QSU) {
		String[][] CED= new String[][] {{"D","I","U","Q"}, {"H","T","X"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String OCS(int[][] VDE) {
		
		return null;	
	}
	
	public String SDI_P_M_PDS(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '0';
			SQV+= AEP.charAt(i)| '0';
		}
		return AEP;
	}
	//s-e-i
	public String SDD_P_M_PDS(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '0';
			SQV+= AEP.charAt(i)& '0';
		}
		return AEP;
	}
	
	public String SDI_P_M_PDS_I(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '0';
			SQV+= AEP.charAt(i)| '1';
		}
		return AEP;
	}
	//s-e-i
	public String SDD_P_M_PDS_I(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '1';
			SQV+= AEP.charAt(i)& '0';
		}
		return AEP;
	}
	
	public String SDI_P_M_PDS_D(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '1';
			//SQV+= AEP.charAt(i)| '0';
		}
		return AEP;
	}
	//s-e-i
	public String SDD_P_M_PDS_D(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '0';
			//SQV+= AEP.charAt(i)& '1';
		}
		return AEP;
	}
	
	public String SDI_P_M_PDS_ID(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '1';
			//SQV+= AEP.charAt(i)| '0';
		}
		return AEP;
	}
	//s-e-i
	public String SDD_P_M_PDS_ID(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '0';
			//SQV+= AEP.charAt(i)& '1';
		}
		int S= 1;
		int E= 1;
		int I= 1;
		String SEI= "DO ACP.IDV";
		//...
		return AEP;
	}
	//51MV_51_D1_SVI  20   2* 41     
 	public int DO_ACP_IDV(int[][] IDC, int QVM) {
		int OSI= 0;
		for(int i= 0; i< IDC.length; i++) {
			for(int j= 0; j< IDC[0].length- 1; j++) {
				OSI+= IDC[i][j]* Math.pow(QVM, IDC[0].length- j- 1);
			}
		}
		int IC= IDC[0].length;
		return OSI+ IDC[0][IC- 1];
	}
}