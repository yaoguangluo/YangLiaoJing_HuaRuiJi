package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class PDE_FormularWithKeyPress {
	public double[] key= new double[4];
	public String bys= "";
	public String pdw= "";
	public String pds= "";
	public String pde= "";
	public String time= "";
	public String session_key= "";
	private String text;
	private String cacheId;

	public void doKeyPress(String initons, PDE_FormularWithKeyPress pDE_RNA_Formular) {	
		Initon[] initon= new Initon[initons.length()];
		for(int i= 0; i< initons.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].setIniton(""+ initons.charAt(i)); 
			if(i+ 1< initons.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}	
		do_PDE_RNA_Formular(initon[0], pDE_RNA_Formular);
	}

	public static void main(String[] argv) {	
		PDE_FormularWithKeyPress pDE_RNA_Formular= new PDE_FormularWithKeyPress();
		@SuppressWarnings("unused")
		String initonKeys= "EIU/0.6/EDU/0.4/si/0.3/sq/0.7/EIU/0.5/EDU/0.5/si/0.632/sq/0.368";
		pDE_RNA_Formular.key[0]= 0.6;
		pDE_RNA_Formular.key[1]= 0.3;
		pDE_RNA_Formular.key[2]= 0.5;
		pDE_RNA_Formular.key[3]= 0.632;

		pDE_RNA_Formular.text= "控制吸收";
		System.out.println("原文: " + pDE_RNA_Formular.text);
		pDE_RNA_Formular.pdw= "MSIOCUOCIPCUPCI";
		System.out.println("肽语: " + pDE_RNA_Formular.pdw);
		pDE_RNA_Formular.bys= "0.6/0.3/0.5/0.632";
		System.out.println("静态密钥: " + pDE_RNA_Formular.bys);
		pDE_RNA_Formular.doKeyPress("MSIOCUOCIPCUPCI", pDE_RNA_Formular);
		System.out.println("静态肽展降元: "+ pDE_RNA_Formular.pds);
		System.out.println("静态肽展增元: "+ pDE_RNA_Formular.pde);

		PDE_FormularWithKeyPress pDE_RNA_Formular1= new PDE_FormularWithKeyPress();
		pDE_RNA_Formular1.key[0]= 0.63;
		pDE_RNA_Formular1.key[1]= 0.2;
		pDE_RNA_Formular1.key[2]= 0.7;
		pDE_RNA_Formular1.key[3]= 0.677;
		pDE_RNA_Formular1.doKeyPress(pDE_RNA_Formular.pde, pDE_RNA_Formular1);
		pDE_RNA_Formular1.bys= "0.63/0.2/0.7/0.677";
		System.out.println("动态密钥: " + pDE_RNA_Formular1.bys);	
		System.out.println("动态肽展降元: "+ pDE_RNA_Formular1.pds);
		System.out.println("动态肽展增元: "+ pDE_RNA_Formular1.pde);

		pDE_RNA_Formular.time= "" + System.currentTimeMillis();
		pDE_RNA_Formular.cacheId= "ID" + Math.random() + ":" + Math.random();
		System.out.println("时间:  " + pDE_RNA_Formular.time);
		System.out.println("账号随机缓存字符串:  " + pDE_RNA_Formular.cacheId);
		pDE_RNA_Formular.session_key= pDE_RNA_Formular.pds+ pDE_RNA_Formular1.pds;
		System.out.println("Session: " + pDE_RNA_Formular.session_key);

	}

	public void do_PDE_RNA_Formular(Initon initon, PDE_FormularWithKeyPress pDE_RNA_Formular) {	
		//初始
		Initon InitonPDE= initon;
		//System.out.print("input:" + InitonPDE.getStore());
		while(InitonPDE.hasNext()) {
			InitonPDE= InitonPDE.forwardNext();
			//System.out.print(InitonPDE.getStore());
		}
		//System.out.println();

		//System.out.println("肽展 降元");
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementA(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		////System.out.println();
		////System.out.println("降元A = V + S");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementO(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		////System.out.println();
		////System.out.println("降元O = E + S");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementP(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		////System.out.println();
		////System.out.println("降元P = E + C");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementM(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		////System.out.println();
		////System.out.println("降元M = C + S");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementV(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		////System.out.println();
		////System.out.println("降元V = U + Q");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPY= InitonPDE.copyRNA(InitonPDE);

		if(Math.random()<pDE_RNA_Formular.key[0]) {
			////System.out.println();
			////System.out.println("1降元概率IU");
			doE_IU(InitonPDE, initonLinkDNA, pDE_RNA_Formular); 
		}else {
			initonLinkDNA.setInitonLink(InitonPDE_COPY);
			////System.out.println();
			////System.out.println("2降元概率DU");
			doE_DU(InitonPDE_COPY, initonLinkDNA, pDE_RNA_Formular); 
		}
	}

	private static void doE_IU(Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementE_IU(initonLinkDNA, null, false);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		////System.out.println();
		////System.out.println("11降元E = I + U");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		////System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementC(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		////System.out.println();
		//System.out.println("11降元C = I + D");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);    

		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPYSI= InitonPDE.copyRNA(InitonPDE);
		Initon InitonPDE_COPYSQ= InitonPDE.copyRNA(InitonPDE);

		//System.out.println();
		//	String s= "1111概率S_";
		//	String si= "1111概率S_I_";
		//	String sq= "1111概率S_Q_";
		////System.out.println("1111概率S");
		//doS(s, InitonPDE, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPYSI);

		if(Math.random()< pDE_RNA_Formular.key[1]) {
			//System.out.println();
			//System.out.println("1112概率S_I");
			doS_I("", InitonPDE_COPYSI, initonLinkDNA, pDE_RNA_Formular);
		}else {
			initonLinkDNA.setInitonLink(InitonPDE_COPYSQ);
			//System.out.println();
			//System.out.println("1113概率S_Q");
			doS_Q("", InitonPDE_COPYSQ, initonLinkDNA, pDE_RNA_Formular);
		}
	}

	private static void doS_Q(String sq, Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS_Q(initonLinkDNA, null);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();

		//System.out.println(sq+ "降元S = Q");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			pDE_RNA_Formular.pds+= InitonPDE.getStore();
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		pDE_RNA_Formular.pds+= InitonPDE.getStore();
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		//全部 收
		//System.out.println();
		//System.out.println(sq+ "肽展 增元");
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA= new InitonLinkDNA();
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(sq+ "V = U + Q");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPY= InitonPDE.copyRNA(InitonPDE);

		if(Math.random()< pDE_RNA_Formular.key[2]) {
			//System.out.println();
			//System.out.println(sq+ "概率Increment IU");
			doIncrementE_IU(sq, InitonPDE, initonLinkDNA, pDE_RNA_Formular); 
		}else {
			initonLinkDNA.setInitonLink(InitonPDE_COPY);
			//System.out.println();
			//System.out.println(sq+ "概率Increment DU");
			doIncrementE_DU(sq, InitonPDE_COPY, initonLinkDNA, pDE_RNA_Formular); 
		}
	}

	private static void doS_I(String si, Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS_I(initonLinkDNA, null, false);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(si+ "11降元S = I");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			pDE_RNA_Formular.pds+= InitonPDE.getStore();
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		pDE_RNA_Formular.pds+= InitonPDE.getStore();
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);

		//全部 收
		//System.out.println();
		//System.out.println(si+ "11肽展 增元");
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA= new InitonLinkDNA();
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(si+ "11V = U + Q");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPY= InitonPDE.copyRNA(InitonPDE);

		if(Math.random()< pDE_RNA_Formular.key[2]) {
			//System.out.println();
			//System.out.println(si+ "111概率Increment IU");
			doIncrementE_IU(si, InitonPDE, initonLinkDNA, pDE_RNA_Formular); 
		}else {
			initonLinkDNA.setInitonLink(InitonPDE_COPY);
			//System.out.println();
			//System.out.println(si+ "112概率Increment DU");
			doIncrementE_DU(si, InitonPDE_COPY, initonLinkDNA, pDE_RNA_Formular); 
		}


	}

	//	private static void doS(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
	//		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS(initonLinkDNA);
	//		while(InitonPDE.hasPrev()) {
	//			InitonPDE= InitonPDE.forwardPrev();
	//		}
	//		//System.out.println();
	//
	//		//System.out.println(s+ "11降元S = I + Q");
	//		while(InitonPDE.hasNext()) {
	//			//System.out.print(InitonPDE.getStore());
	//			InitonPDE= InitonPDE.forwardNext();
	//		}
	//		//System.out.print(InitonPDE.getStore());
	//		while(InitonPDE.hasPrev()) {
	//			InitonPDE= InitonPDE.forwardPrev();
	//		}
	//		initonLinkDNA.setInitonLink(InitonPDE);
	//
	//		//全部 收
	//		//System.out.println();
	//		//System.out.println(s+ "11肽展 增元");
	//		while(InitonPDE.hasPrev()) {
	//			InitonPDE= InitonPDE.forwardPrev();
	//		}
	//		initonLinkDNA= new InitonLinkDNA();
	//		initonLinkDNA.setInitonLink(InitonPDE);
	//		InitonPDE= new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
	//		while(InitonPDE.hasPrev()) {
	//			InitonPDE= InitonPDE.forwardPrev();
	//		}
	//		//System.out.println();
	//		//System.out.println(s+ "11V = U + Q");
	//		while(InitonPDE.hasNext()) {
	//			//System.out.print(InitonPDE.getStore());
	//			InitonPDE= InitonPDE.forwardNext();
	//		}
	//		//System.out.print(InitonPDE.getStore());
	//		while(InitonPDE.hasPrev()) {
	//			InitonPDE= InitonPDE.forwardPrev();
	//		}
	//		initonLinkDNA.setInitonLink(InitonPDE);
	//		Initon InitonPDE_COPY= InitonPDE.copyRNA(InitonPDE);
	//		//System.out.println();
	//		//System.out.println(s+ "111概率Increment IU");
	//		doIncrementE_IU(s, InitonPDE, initonLinkDNA); 
	//
	//		initonLinkDNA.setInitonLink(InitonPDE_COPY);
	//		//System.out.println();
	//		//System.out.println(s+ "112概率Increment DU");
	//		doIncrementE_DU(s, InitonPDE_COPY, initonLinkDNA); 
	//	}

	private static void doE_DU(Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementE_DU(initonLinkDNA, null);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println("21降元E = D + U");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementC(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println("21降元C = I + D");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}

		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPYSI= InitonPDE.copyRNA(InitonPDE);
		Initon InitonPDE_COPYSQ= InitonPDE.copyRNA(InitonPDE);
		//	String s= "2222概率S_";
		//String si= "2222概率S_I_";
		//String sq= "2222概率S_Q_";
		//	//System.out.println();
		//	//System.out.println("2111概率S");
		//	doS(s, InitonPDE, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPYSI);
		if(Math.random()< pDE_RNA_Formular.key[1]) {
			//System.out.println();
			//System.out.println("2112概率S_I");
			doS_I("", InitonPDE_COPYSI, initonLinkDNA, pDE_RNA_Formular); 
		}else {
			initonLinkDNA.setInitonLink(InitonPDE_COPYSQ);
			//System.out.println();
			//System.out.println("2113概率S_Q");
			doS_Q("", InitonPDE_COPYSQ, initonLinkDNA, pDE_RNA_Formular); 
		}
	}

	private static void doIncrementE_DU(String sq, Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementE_DU(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(sq+ "E = D + U");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementC(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(sq+ "C = I + D");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);

		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPYSI= InitonPDE.copyRNA(InitonPDE);
		Initon InitonPDE_COPYSQ= InitonPDE.copyRNA(InitonPDE);

		//doIncrementS(sq + "EDU_IQ_", InitonPDE, initonLinkDNA);
		if(Math.random()< pDE_RNA_Formular.key[3]) {
			doIncrementS_I(sq + "EDU_I_", InitonPDE_COPYSI, initonLinkDNA, pDE_RNA_Formular);
		}else {
			doIncrementS_Q(sq + "EDU_Q_", InitonPDE_COPYSQ, initonLinkDNA, pDE_RNA_Formular);
		}

	}

	private static void doIncrementE_IU(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementE_IU(initonLinkDNA, null, false);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(s+ "E = I + U");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementC(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(s+ "C = I + D");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPYSI= InitonPDE.copyRNA(InitonPDE);
		Initon InitonPDE_COPYSQ= InitonPDE.copyRNA(InitonPDE);

		//doIncrementS(s + "EIU_IQ_", InitonPDE, initonLinkDNA);
		if(Math.random()< pDE_RNA_Formular.key[3]) {
			doIncrementS_I(s + "EIU_I_", InitonPDE_COPYSI, initonLinkDNA, pDE_RNA_Formular);
		}else {
			doIncrementS_Q(s + "EIU_Q_", InitonPDE_COPYSQ, initonLinkDNA, pDE_RNA_Formular);
		}

	}

	private static void doIncrementS_Q(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS_Q(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(s+ "S = Q");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		doIncrementAOPM(s, InitonPDE, initonLinkDNA, pDE_RNA_Formular);
	}

	private static void doIncrementS_I(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS_I(initonLinkDNA, null);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(s+ "S = I");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		doIncrementAOPM(s, InitonPDE, initonLinkDNA, pDE_RNA_Formular);
	}

	//	@SuppressWarnings("unused")
	//	private static void doIncrementS(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
	//		initonLinkDNA.setInitonLink(InitonPDE);
	//		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS(initonLinkDNA);
	//		while(InitonPDE.hasPrev()) {
	//			InitonPDE= InitonPDE.forwardPrev();
	//		}
	//		//System.out.println();
	//		//System.out.println(s+ "S = I + Q");
	//		while(InitonPDE.hasNext()) {
	//			//System.out.print(InitonPDE.getStore());
	//			InitonPDE= InitonPDE.forwardNext();
	//		}
	//		//System.out.print(InitonPDE.getStore());
	//		while(InitonPDE.hasPrev()) {
	//			InitonPDE= InitonPDE.forwardPrev();
	//		}
	//		initonLinkDNA.setInitonLink(InitonPDE);
	//		doIncrementAOPM(s, InitonPDE, initonLinkDNA);
	//	}

	private static void doIncrementAOPM(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA, PDE_FormularWithKeyPress pDE_RNA_Formular) {
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementA(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(s+ "A = V + S");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementO(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(s+ "O = E + S");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementP(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println(s+ "P = E + C");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementM(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//System.out.println();
		//System.out.println("肽展增元: ");
		//System.out.println(s+ "M = C + S");
		while(InitonPDE.hasNext()) {
			//System.out.print(InitonPDE.getStore());
			pDE_RNA_Formular.pde+= InitonPDE.getStore();
			InitonPDE= InitonPDE.forwardNext();
		}
		//System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
	}
}