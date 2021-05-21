package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;
@SuppressWarnings("unused")
public class RangePDI{
	public static void main(String[] argv) {
		//System.out.println(new RangePDI().IOE(16, 20));
	}
	//240/4 600
	public int[][] IOE(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				String IDUQ= new RangePDI().PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[][] OIQ= new int[1][IDUQ.length()];
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== '2') {
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 3;
						}else {
							OIQ[0][k]= 1;
						}
					}else {
						OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
					}
				}
				ps[i][j]= new InitonsPDS().DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}
	
	public int[][] IPE(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				String IDUQ= new RangePDI().PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[][] OIQ= new int[1][IDUQ.length()];
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== '2') {//g
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 3;
						}else {
							OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
						}
					}else if(IDUQ.charAt(k)== '3') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 0;
						}else {
							OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
						}
					}else if(IDUQ.charAt(k)== '1') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 2;
						}else {
							OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
						}
					}else if(IDUQ.charAt(k)== '0') {//g
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 1;
						}else {
							OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
						}
					}
				}
				ps[i][j]= new InitonsPDS().DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}
	
	public int[][] QPE(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				String IDUQ= new RangePDI().PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[][] OIQ= new int[1][IDUQ.length()];
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== '0') {//g D I U Q
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 1;
						}else {
							OIQ[0][k]= 0;
						}
					}else if(IDUQ.charAt(k)== '1') {//s
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 1;
						}else {
							OIQ[0][k]= 2;
						}
					}else if(IDUQ.charAt(k)== '2') {//s
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 3;
						}else {
							OIQ[0][k]= 0;
						}
					}else if(IDUQ.charAt(k)== '3') {//g
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 3;
						}else {
							OIQ[0][k]= 0;
						}
					}
				}
				ps[i][j]= new InitonsPDS().DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}
	
	public String injectPDI(String pdi) {
		
		return pdi;	
	}
	
	public String PDSEncode(String VSQ) {
		while(VSQ.length()> 0){
		//	VSQ.concat(VSQ.replace("", ""))> 0;
		}
		return VSQ;	
	}
	
	public String PDS_OEC_IID(String VSQ_IIE, int OCI_PPE) {
        //
	    String $_CID= "AOPMVECS";
		//VSQ_IIE= $_CID.charAt(VSQ_IIE.length());
		return VSQ_IIE;	
	}
	
	public String PDS_P_USQ_ECP(int P_VSQ, int MSP) {
		String ISQ= "";
		while(P_VSQ> 0) {
			ISQ+= P_VSQ/ MSP;
			P_VSQ%= MSP;
		}
		ISQ+= P_VSQ;
		return ISQ;
	}
	//64/4   8/4 2  
	public String PDS_P_USQ_ECP_I(int P_VSQ, int MSP) {
		String ISQ= "";
		while(P_VSQ>= MSP) {
			ISQ+= P_VSQ/ MSP;
			P_VSQ%= MSP;
		}
		ISQ+= P_VSQ;
		return ISQ;
	}
	
	public String ESU_M_SVQ_PDS_OEU(String SQA) {
		String[] PDS= new String[]{"AOPM", "VECS", "DIUQ", "HTX"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_ECS_SVQ_PDS_OEU(String SQA) {
		String[] PDS= new String[]{"AOPM", "VECS"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_P_SVQ_PDS_OEU(String SQA) {
		String[] PDS= new String[]{"AOPM", "VECS", "DIUQ", "HTX"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_P_SEQ_PDS_OEU(String SQA) {
		String[] PDS= new String[]{"AOPM", "VECS", "DIUQ", "HTX"};
		String ISQ_PSD= "";
		int i= 0;
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
			SQA+= PDSEncode(PDS[i]);
		}
		return ISQ_PSD;
	}
	
	public String EUP_QD_PQI(String AEP, int QSV) {
		String[][] CED= new String[][] {{"A","O","P","M"}, {"V","E","C","S"}, {"D","I","U","Q"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUP_QD_PQU(String AEP, int QSU) {
		String[][] CED= new String[][] {{"D","I","U","Q"}, {"H","T","X"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String ESU_M_SVQ_PDS_OEU_M(String SQA) {
		String[] PDS= new String[]{"AOPM"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_M_SVQ_PDS_OEU_P(String SQA) {
		String[] PDS= new String[]{"VECS"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_M_SVQ_PDS_OEU_O(String SQA) {
		String[] PDS= new String[]{"DIUQ"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_M_SVQ_PDS_OEU_A(String SQA) {
		String[] PDS= new String[]{"HTX"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_M_SVQ_PDS_OEU_OA(String SQA) { 
		//AEC.VSQ.IC.IE
		return SQA;
	}
}