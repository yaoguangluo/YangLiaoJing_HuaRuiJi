package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;
@SuppressWarnings("unused")
public class InitonsPDI{
	//M-E-C
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
		//WHILE
		//AEP+=PM_ISO+CED[][];
		//...
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
		String SEP= "";
		for(int i= 0; i< VDE.length; i++) {
			for(int j= 0; j< VDE[0].length; j++) {
				VDE[0][j]+= SEP.charAt(i)| '0';
			}
		}
		return null;	
	}
	
	public String SDI_P_M_PDS(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '0';
			SQV+= AEP.charAt(i)& '1';
		}
		for(int i= 0; i< AEP.length(); i++) {
			for(int j= 0; j< SQV.length(); j++) {
				AEP+= AEP.charAt(i)|SQV.charAt(j);
			}	
		}
		return AEP+ SQV;
	}
	
	public String SDD_P_M_PDS(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '0';
			SQV+= AEP.charAt(i)| '0';
		}
		return AEP+ SQV;
	}
}