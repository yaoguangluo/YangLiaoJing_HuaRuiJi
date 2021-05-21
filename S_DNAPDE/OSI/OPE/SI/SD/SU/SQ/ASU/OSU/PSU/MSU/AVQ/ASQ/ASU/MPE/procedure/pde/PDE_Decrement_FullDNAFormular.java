package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class PDE_Decrement_FullDNAFormular {
	//A = V + S LINK 数据结构对象 (简单测试)
	//作用发现有A 的initon进行VPCS级展开. 按我在 印度 ANSI C代码风格进行编写方式.
	public Initon PDE_DecrementA(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("A")) {
				Initon initonIncrementV= new Initon();
				initonIncrementV.setV(); //新增一个数据V
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //新增一个数据S

				initonIncrementV.next= initonIncrementS;  //V初始
				initonIncrementV.prev= initonLink.prev;
				if(null!= initonIncrementV.prev) {
					initonIncrementV.prev.next= initonIncrementV;
				}

				initonIncrementS.prev= initonIncrementV;  //S初始
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) { 
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//最后S代替
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop 替增.
		}
		return initonLink;
	}

	//O = E + S LINK 数据结构对象 (简单测试)
	public Initon PDE_DecrementO(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("O")) {
				Initon initonIncrementE= new Initon();
				initonIncrementE.setE(); //新增一个数据E
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //新增一个数据S

				initonIncrementE.next= initonIncrementS;  //E初始
				initonIncrementE.prev= initonLink.prev;
				if(null!= initonIncrementE.prev) {
					initonIncrementE.prev.next= initonIncrementE;
				}

				initonIncrementS.prev= initonIncrementE;  //S初始
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) {
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//最后S代替
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop 替增.
		}
		return initonLink;
	}

	//P = E + C LINK 数据结构对象 (简单测试)
	public Initon PDE_DecrementP(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("P")) {
				Initon initonIncrementE= new Initon();
				initonIncrementE.setE(); //新增一个数据E
				Initon initonIncrementC= new Initon();
				initonIncrementC.setC(); //新增一个数据C

				initonIncrementE.next= initonIncrementC;  //E初始
				initonIncrementE.prev= initonLink.prev;
				if(null!= initonIncrementE.prev) {
					initonIncrementE.prev.next= initonIncrementE;
				}

				initonIncrementC.prev= initonIncrementE;  //C初始
				initonIncrementC.next= initonLink.next;
				if(null!= initonIncrementC.next) {
					initonIncrementC.next.prev= initonIncrementC;
				}
				initonLink= initonIncrementC;//最后C代替
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop 替增.
		}
		return initonLink;
	}
	//M = C + S
	public Initon PDE_DecrementM(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("M")) {
				Initon initonIncrementC= new Initon();
				initonIncrementC.setC(); //新增一个数据C
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //新增一个数据S

				initonIncrementC.next= initonIncrementS;  //C初始
				initonIncrementC.prev= initonLink.prev;
				if(null!= initonIncrementC.prev) {
					initonIncrementC.prev.next= initonIncrementC;
				}

				initonIncrementS.prev= initonIncrementC;  //s初始
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) {
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//最后S代替
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop 替增.
		}
		return initonLink;
	}
	//V = U + Q
	public Initon PDE_DecrementV(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("V")) {
				Initon initonIncrementU= new Initon();
				initonIncrementU.setU(); //新增一个数据U
				Initon initonIncrementQ= new Initon();
				initonIncrementQ.setQ(); //新增一个数据Q

				initonIncrementU.next= initonIncrementQ;  //U初始
				initonIncrementU.prev= initonLink.prev;
				if(null!= initonIncrementU.prev) {
					initonIncrementU.prev.next= initonIncrementU;
				}

				initonIncrementQ.prev= initonIncrementU;  //Q初始
				initonIncrementQ.next= initonLink.next;
				if(null!= initonIncrementQ.next) {
					initonIncrementQ.next.prev= initonIncrementQ;
				}
				initonLink= initonIncrementQ;//最后Q代替
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop 替增.
		}
		return initonLink;
	}
	//E = D + U
	//肽展公式的概率问题, 先这样命名,之后讨论 是IU还是DU
	//E = D + U
	//肽展公式的概率问题, 先这样命名,之后讨论 是IU还是DU
	//2021年2月10， 优化次黄嘌呤 对应 D 和 U 弱碱强碱. 罗瑶光。这里受酸碱的浓度控制 正如 S= I和 S= Q 强酸弱酸。
	//之后研究 u是否可以略去。今改下E= D 和 E= U
	public Initon PDE_DecrementE_DU(InitonLinkDNA initonLinkDNA, FullDNATokenPDI pDE_RNA_Formular, boolean bYS) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		int index= 0;
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("E")) {
				Initon initonIncrementI= new Initon();
				if(bYS) {
					try {
						if(pDE_RNA_Formular.pdedeKey.charAt(index)== '0') { 
							initonIncrementI.setD(); //新增一个数据D
						}if(pDE_RNA_Formular.pdedeKey.charAt(index)== '1') { 
							initonIncrementI.setU(); //新增一个数据U
						}
						//else {
						//	initonIncrementI.setE(); //新增一个数据E
						//}		
						index++;
					}catch(Exception e) {
						e.printStackTrace();
					}
						
				}else {
					if(Math.random()< pDE_RNA_Formular.key[1]) { 
						pDE_RNA_Formular.pdedeKey+= "0";
						initonIncrementI.setD();
					}else {
						pDE_RNA_Formular.pdedeKey+= "1";
						initonIncrementI.setU();
					}
				}
				initonIncrementI.prev= initonLink.prev;
				if(null!= initonIncrementI.prev) {
					initonIncrementI.prev.next= initonIncrementI;
				}

				initonIncrementI.next= initonLink.next;
				if(null!= initonIncrementI.next) {
					initonIncrementI.next.prev= initonIncrementI;
				}
				initonLink= initonIncrementI;//最后I代替
			}
			//else if(initonLink.getStore().equalsIgnoreCase("D")) {
			//	pDE_RNA_Formular.pdedeKey+= "2";
			//}else if(initonLink.getStore().equalsIgnoreCase("U")) {
			//	pDE_RNA_Formular.pdedeKey+= "2";
			//}
			if(!initonLink.hasNext()) {
				//System.out.println(pDE_RNA_Formular.pdedsKey);
				return initonLink;
			}
			initonLink= initonLink.next;//while loop 替增.
		}
		//System.out.println(pDE_RNA_Formular.pdedsKey);
		return initonLink;
	}
	//C = I + D
	public Initon PDE_DecrementC(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("C")) {
				Initon initonIncrementI= new Initon();
				initonIncrementI.setI(); //新增一个数据I
				Initon initonIncrementD= new Initon();
				initonIncrementD.setD(); //新增一个数据D

				initonIncrementI.next= initonIncrementD;  //I初始
				initonIncrementI.prev= initonLink.prev;
				if(null!= initonIncrementI.prev) {
					initonIncrementI.prev.next= initonIncrementI;
				}

				initonIncrementD.prev= initonIncrementI;  //D初始
				initonIncrementD.next= initonLink.next;
				if(null!= initonIncrementD.next) {
					initonIncrementD.next.prev= initonIncrementD;
				}
				initonLink= initonIncrementD;//最后D代替
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.next;//while loop 替增.
		}
		return initonLink;
	}

	//S = I
	//肽展公式的概率问题, 先这样命名,之后讨论 是I, Q还是I + Q
	public Initon PDE_DecrementS_IQ(InitonLinkDNA initonLinkDNA, FullDNATokenPDI pDE_RNA_Formular, boolean bYS) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		int index= 0;
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("S")) {
				Initon initonIncrementI= new Initon();
				if(bYS) {
					try {
						if(pDE_RNA_Formular.pdedsKey.charAt(index)== '0') { 
							initonIncrementI.setI(); //新增一个数据D
						}if(pDE_RNA_Formular.pdedsKey.charAt(index)== '1') { 
							initonIncrementI.setQ(); //新增一个数据U
						}
//						else {
//							initonIncrementI.setS(); //新增一个数据E
//						}		
						index++;
					}catch(Exception e) {
						e.printStackTrace();
					}
						
				}else {
					if(Math.random()< pDE_RNA_Formular.key[1]) { 
						pDE_RNA_Formular.pdedsKey+= "0";
						initonIncrementI.setI();
					}else {
						pDE_RNA_Formular.pdedsKey+= "1";
						initonIncrementI.setQ();
					}
				}
				initonIncrementI.prev= initonLink.prev;
				if(null!= initonIncrementI.prev) {
					initonIncrementI.prev.next= initonIncrementI;
				}

				initonIncrementI.next= initonLink.next;
				if(null!= initonIncrementI.next) {
					initonIncrementI.next.prev= initonIncrementI;
				}
				initonLink= initonIncrementI;//最后I代替
			}
//			else if(initonLink.getStore().equalsIgnoreCase("I")) {
//				pDE_RNA_Formular.pdedsKey+= "2";
//			}else if(initonLink.getStore().equalsIgnoreCase("Q")) {
//				pDE_RNA_Formular.pdedsKey+= "2";
//			}
			if(!initonLink.hasNext()) {
				System.out.println(pDE_RNA_Formular.pdedsKey);
				return initonLink;
			}
			initonLink= initonLink.next;//while loop 替增.
		}
		//System.out.println(pDE_RNA_Formular.pdedsKey);
		return initonLink;
	}
}