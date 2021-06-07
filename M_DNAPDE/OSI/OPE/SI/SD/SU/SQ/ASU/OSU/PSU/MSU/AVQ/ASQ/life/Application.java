package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.MSQ.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dnaSets.CMS;
import OSI.OPE.MSQ.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dnaSets.PDN;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.Family;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.Life;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.Race;

public class Application extends Thread {
	public PDN pdns= new PDN();
	public CMS cmss= new CMS();
	int count=0;
	public CopyOnWriteArrayList<String> read;
	boolean isSleep= true;
	public void run() {
		read= new CopyOnWriteArrayList<>();
		isSleep= false;
		Life life= new Life();
		life.born();
		//register family
		Family family= new Family();
		ConcurrentHashMap<String, Life> familyLife= new ConcurrentHashMap<>();
		familyLife.put("Tin", life);
		family.setFamily(familyLife);
		//register race
		Race race= new Race();
		ConcurrentHashMap<String, Family> raceFamily= new ConcurrentHashMap<>();
		raceFamily.put("Royal", family);
		race.setRace(raceFamily);
		//init analysis
		LoveIssues loveIssues= new LoveIssues();
		StudyIssues studyIssues= new StudyIssues();
		HelpIssues helpIssues= new HelpIssues();
		SafeIssues safeIssues= new SafeIssues();
		WorkIssues workIssues= new WorkIssues();
		CreativeIssues creativeIssues= new CreativeIssues();
		//loop the Hello World.
		while(true) {
			try {
				isSleep= wakeUp();
				if(!isSleep) {
					//love issues
					loveIssues.philosothon(read);
					//study issues
					studyIssues.philosothon(read);
					//help issues
					helpIssues.philosothon(read);
					//work issues
					workIssues.philosothon(read);
					//creative issues
					creativeIssues.philosothon(read);
					//safe issues
					safeIssues.philosothon(read);
					isSleep= true;
				}	 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	private boolean wakeUp() throws InterruptedException {
		while(read.isEmpty()) {
			Thread.sleep(100);
		}
		System.out.println("Tin God at here!");
		return false;
	}

	public void init() throws InterruptedException {
		//Application application= new Application();
		//application.run();
		//PRINT YANGLIAOJING FUNCTIONS APINAME
		
//		String string1= "D:\\Users\\Lenovo\\eclipse-workspace\\DETA_YLJ1.5.9";
//		String string2= "D:\\Users\\Lenovo\\git\\Deta_Parser";
		String string1= "C:\\Users\\Lenovo\\eclipse-workspace\\HRJ_YLJ_18111";
		String string2= "C:\\Users\\Lenovo\\eclipse-workspace\\HRJ_YLJ_18111";
		pdns.init();
		cmss.init();
	    
		String[] DNA_CHOMOS= new String[24*4];
		
		DNA_CHOMOS[4*0+0]="AV";DNA_CHOMOS[4*0+1]="AE";DNA_CHOMOS[4*0+2]="AC";DNA_CHOMOS[4*0+3]="AS";
		DNA_CHOMOS[4*1+ 0]="AI";DNA_CHOMOS[4*1+1]="AD";DNA_CHOMOS[4*1+2]="AU";DNA_CHOMOS[4*1+3]="AQ";
		DNA_CHOMOS[4*2+0]="OV";DNA_CHOMOS[4*2+1]="OE";DNA_CHOMOS[4*2+2]="OC";DNA_CHOMOS[4*2+3]="OS";
		DNA_CHOMOS[4*3+0]="OI";DNA_CHOMOS[4*3+1]="OD";DNA_CHOMOS[4*3+2]="OU";DNA_CHOMOS[4*3+3]="OQ";
		DNA_CHOMOS[4*4+0]="PV";DNA_CHOMOS[4*4+1]="PE";DNA_CHOMOS[4*4+2]="PC";DNA_CHOMOS[4*4+3]="PS";
		DNA_CHOMOS[4*5+0]="PI";DNA_CHOMOS[4*5+1]="PD";DNA_CHOMOS[4*5+2]="PU";DNA_CHOMOS[4*5+3]="PQ";
		DNA_CHOMOS[4*6+0]="MV";DNA_CHOMOS[4*6+1]="ME";DNA_CHOMOS[4*6+2]="MC";DNA_CHOMOS[4*6+3]="MS";
		DNA_CHOMOS[4*7+0]="MI";DNA_CHOMOS[4*7+1]="MD";DNA_CHOMOS[4*7+2]="MU";DNA_CHOMOS[4*7+3]="MQ";
		DNA_CHOMOS[4*8+0]="VA";DNA_CHOMOS[4*8+1]="VO";DNA_CHOMOS[4*8+2]="VP";DNA_CHOMOS[4*8+3]="VM";
		DNA_CHOMOS[4*9+0]="VI";DNA_CHOMOS[4*9+1]="VD";DNA_CHOMOS[4*9+2]="VU";DNA_CHOMOS[4*9+3]="VQ";
		DNA_CHOMOS[4*10+0]="EA";DNA_CHOMOS[4*10+1]="EO";DNA_CHOMOS[4*10+2]="EP";DNA_CHOMOS[4*10+3]="EM";
		DNA_CHOMOS[4*11+0]="EI";DNA_CHOMOS[4*11+1]="ED";DNA_CHOMOS[4*11+2]="EU";DNA_CHOMOS[4*11+3]="EQ";
		DNA_CHOMOS[4*12+0]="CA";DNA_CHOMOS[4*12+1]="CO";DNA_CHOMOS[4*12+2]="CP";DNA_CHOMOS[4*12+3]="CM";
		DNA_CHOMOS[4*13+0]="CI";DNA_CHOMOS[4*13+1]="CD";DNA_CHOMOS[4*13+2]="CU";DNA_CHOMOS[4*13+3]="CQ";
		DNA_CHOMOS[4*14+0]="SA";DNA_CHOMOS[4*14+1]="SO";DNA_CHOMOS[4*14+2]="SP";DNA_CHOMOS[4*14+3]="SM";
		DNA_CHOMOS[4*15+0]="SI";DNA_CHOMOS[4*15+1]="SD";DNA_CHOMOS[4*15+2]="SU";DNA_CHOMOS[4*15+3]="SQ";
		DNA_CHOMOS[4*16+0]="IA";DNA_CHOMOS[4*16+1]="IO";DNA_CHOMOS[4*16+2]="IP";DNA_CHOMOS[4*16+3]="IM";
		DNA_CHOMOS[4*17+0]="IV";DNA_CHOMOS[4*17+1]="IE";DNA_CHOMOS[4*17+2]="IC";DNA_CHOMOS[4*17+3]="IS";
		DNA_CHOMOS[4*18+0]="DA";DNA_CHOMOS[4*18+1]="DO";DNA_CHOMOS[4*18+2]="DP";DNA_CHOMOS[4*18+3]="DM";
		DNA_CHOMOS[4*19+0]="DV";DNA_CHOMOS[4*19+1]="DE";DNA_CHOMOS[4*19+2]="DC";DNA_CHOMOS[4*19+3]="DS";
		DNA_CHOMOS[4*20+0]="UA";DNA_CHOMOS[4*20+1]="UO";DNA_CHOMOS[4*20+2]="UP";DNA_CHOMOS[4*20+3]="UM";
		DNA_CHOMOS[4*21+0]="UV";DNA_CHOMOS[4*21+1]="UE";DNA_CHOMOS[4*21+2]="UC";DNA_CHOMOS[4*21+3]="US";
		DNA_CHOMOS[4*22+0]="QA";DNA_CHOMOS[4*22+1]="QO";DNA_CHOMOS[4*22+2]="QP";DNA_CHOMOS[4*22+3]="QM";
		DNA_CHOMOS[4*23+0]="QV";DNA_CHOMOS[4*23+1]="QE";DNA_CHOMOS[4*23+2]="QC";DNA_CHOMOS[4*23+3]="QS";
		
		
		String[] DNA_INITON= new String[64*3];
		DNA_INITON[0]= "AVI";DNA_INITON[1]= "AVD";DNA_INITON[2]= "AVU";DNA_INITON[3]= "AVQ";
		DNA_INITON[4]= "AEI";DNA_INITON[5]= "AED";DNA_INITON[6]= "AEU";DNA_INITON[7]= "AEQ";
		DNA_INITON[8]= "ACI";DNA_INITON[9]= "ACD";DNA_INITON[10]= "ACU";DNA_INITON[11]= "ACQ";
		DNA_INITON[12]= "ASI";DNA_INITON[13]= "ASD";DNA_INITON[14]= "ASU";DNA_INITON[15]= "ASQ";
		
		DNA_INITON[16]= "OVI";DNA_INITON[17]= "OVD";DNA_INITON[18]= "OVU";DNA_INITON[19]= "OVQ";
		DNA_INITON[20]= "OEI";DNA_INITON[21]= "OED";DNA_INITON[22]= "OEU";DNA_INITON[23]= "OEQ";
		DNA_INITON[24]= "OCI";DNA_INITON[25]= "OCD";DNA_INITON[26]= "OCU";DNA_INITON[27]= "OCQ";
		DNA_INITON[28]= "OSI";DNA_INITON[29]= "OSD";DNA_INITON[30]= "OSU";DNA_INITON[31]= "OSQ";
		
		DNA_INITON[32]= "PVI";DNA_INITON[33]= "PVD";DNA_INITON[34]= "PVU";DNA_INITON[35]= "PVQ";
		DNA_INITON[36]= "PEI";DNA_INITON[37]= "PED";DNA_INITON[38]= "PEU";DNA_INITON[39]= "PEQ";
		DNA_INITON[40]= "PCI";DNA_INITON[41]= "PCD";DNA_INITON[42]= "PCU";DNA_INITON[43]= "PCQ";
		DNA_INITON[44]= "PSI";DNA_INITON[45]= "PSD";DNA_INITON[46]= "PSU";DNA_INITON[47]= "PSQ";
		
		DNA_INITON[48]= "MVI";DNA_INITON[49]= "MVD";DNA_INITON[50]= "MVU";DNA_INITON[51]= "MVQ";
		DNA_INITON[52]= "MEI";DNA_INITON[53]= "MED";DNA_INITON[54]= "MEU";DNA_INITON[55]= "MEQ";
		DNA_INITON[56]= "MCI";DNA_INITON[57]= "MCD";DNA_INITON[58]= "MCU";DNA_INITON[59]= "MCQ";
		DNA_INITON[60]= "MSI";DNA_INITON[61]= "MSD";DNA_INITON[62]= "MSU";DNA_INITON[63]= "MSQ";
		
////
		DNA_INITON[64*1+ 0]= "VAI";DNA_INITON[64*1+ 1]= "VAD";DNA_INITON[64*1+ 2]= "VAU";DNA_INITON[64*1+ 3]= "VAQ";
		DNA_INITON[64*1+ 4]= "VOI";DNA_INITON[64*1+ 5]= "VOD";DNA_INITON[64*1+ 6]= "VOU";DNA_INITON[64*1+ 7]= "VOQ";
		DNA_INITON[64*1+ 8]= "VPI";DNA_INITON[64*1+ 9]= "VPD";DNA_INITON[64*1+ 10]= "VPU";DNA_INITON[64*1+ 11]= "VPQ";
		DNA_INITON[64*1+ 12]= "VMI";DNA_INITON[64*1+ 13]= "VMD";DNA_INITON[64*1+ 14]= "VMU";DNA_INITON[64*1+ 15]= "VMQ";
		
		DNA_INITON[64*1+ 16]= "EAI";DNA_INITON[64*1+ 17]= "EAD";DNA_INITON[64*1+ 18]= "EAU";DNA_INITON[64*1+ 19]= "EAQ";
		DNA_INITON[64*1+ 20]= "EOI";DNA_INITON[64*1+ 21]= "EOD";DNA_INITON[64*1+ 22]= "EOU";DNA_INITON[64*1+ 23]= "EOQ";
		DNA_INITON[64*1+ 24]= "EPI";DNA_INITON[64*1+ 25]= "EPD";DNA_INITON[64*1+ 26]= "EPU";DNA_INITON[64*1+ 27]= "EPQ";
		DNA_INITON[64*1+ 28]= "EMI";DNA_INITON[64*1+ 29]= "EMD";DNA_INITON[64*1+ 30]= "EMU";DNA_INITON[64*1+ 31]= "EMQ";
		
		DNA_INITON[64*1+ 32]= "CAI";DNA_INITON[64*1+ 33]= "CAD";DNA_INITON[64*1+ 34]= "CAU";DNA_INITON[64*1+ 35]= "CAQ";
		DNA_INITON[64*1+ 36]= "COI";DNA_INITON[64*1+ 37]= "COD";DNA_INITON[64*1+ 38]= "COU";DNA_INITON[64*1+ 39]= "COQ";
		DNA_INITON[64*1+ 40]= "CPI";DNA_INITON[64*1+ 41]= "CPD";DNA_INITON[64*1+ 42]= "CPU";DNA_INITON[64*1+ 43]= "CPQ";
		DNA_INITON[64*1+ 44]= "CMI";DNA_INITON[64*1+ 45]= "CMD";DNA_INITON[64*1+ 46]= "CMU";DNA_INITON[64*1+ 47]= "CMQ";
		
		DNA_INITON[64*1+ 48]= "SAI";DNA_INITON[64*1+ 49]= "SAD";DNA_INITON[64*1+ 50]= "SAU";DNA_INITON[64*1+ 51]= "SAQ";
		DNA_INITON[64*1+ 52]= "SOI";DNA_INITON[64*1+ 53]= "SOD";DNA_INITON[64*1+ 54]= "SOU";DNA_INITON[64*1+ 55]= "SOQ";
		DNA_INITON[64*1+ 56]= "SPI";DNA_INITON[64*1+ 57]= "SPD";DNA_INITON[64*1+ 58]= "SPU";DNA_INITON[64*1+ 59]= "SPQ";
		DNA_INITON[64*1+ 60]= "SMI";DNA_INITON[64*1+ 61]= "SMD";DNA_INITON[64*1+ 62]= "SMU";DNA_INITON[64*1+ 63]= "SMQ";
		
		////
		DNA_INITON[64*2+ 0]= "IAV";DNA_INITON[64*2+ 1]= "IAE";DNA_INITON[64*2+ 2]= "IAC";DNA_INITON[64*2+ 3]= "IAS";
		DNA_INITON[64*2+ 4]= "IOV";DNA_INITON[64*2+ 5]= "IOE";DNA_INITON[64*2+ 6]= "IOC";DNA_INITON[64*2+ 7]= "IOS";
		DNA_INITON[64*2+ 8]= "IPV";DNA_INITON[64*2+ 9]= "IPE";DNA_INITON[64*2+ 10]= "IPC";DNA_INITON[64*2+ 11]= "IPS";
		DNA_INITON[64*2+ 12]= "IMV";DNA_INITON[64*2+ 13]= "IME";DNA_INITON[64*2+ 14]= "IMC";DNA_INITON[64*2+ 15]= "IMS";
		
		DNA_INITON[64*2+ 16]= "DAV";DNA_INITON[64*2+ 17]= "DAE";DNA_INITON[64*2+ 18]= "DAC";DNA_INITON[64*2+ 19]= "DAS";
		DNA_INITON[64*2+ 20]= "DOV";DNA_INITON[64*2+ 21]= "DOE";DNA_INITON[64*2+ 22]= "DOC";DNA_INITON[64*2+ 23]= "DOS";
		DNA_INITON[64*2+ 24]= "DPV";DNA_INITON[64*2+ 25]= "DPE";DNA_INITON[64*2+ 26]= "DPC";DNA_INITON[64*2+ 27]= "DPS";
		DNA_INITON[64*2+ 28]= "DMV";DNA_INITON[64*2+ 29]= "DME";DNA_INITON[64*2+ 30]= "DMC";DNA_INITON[64*2+ 31]= "DMS";
		
		DNA_INITON[64*2+ 32]= "UAV";DNA_INITON[64*2+ 33]= "UAE";DNA_INITON[64*2+ 34]= "UAC";DNA_INITON[64*2+ 35]= "UAS";
		DNA_INITON[64*2+ 36]= "UOV";DNA_INITON[64*2+ 37]= "UOE";DNA_INITON[64*2+ 38]= "UOC";DNA_INITON[64*2+ 39]= "UOS";
		DNA_INITON[64*2+ 40]= "UPV";DNA_INITON[64*2+ 41]= "UPE";DNA_INITON[64*2+ 42]= "UPC";DNA_INITON[64*2+ 43]= "UPS";
		DNA_INITON[64*2+ 44]= "UMV";DNA_INITON[64*2+ 45]= "UME";DNA_INITON[64*2+ 46]= "UMC";DNA_INITON[64*2+ 47]= "UMS";
		
		DNA_INITON[64*2+ 48]= "QAV";DNA_INITON[64*2+ 49]= "QAE";DNA_INITON[64*2+ 50]= "QAC";DNA_INITON[64*2+ 51]= "QAS";
		DNA_INITON[64*2+ 52]= "QOV";DNA_INITON[64*2+ 53]= "QOE";DNA_INITON[64*2+ 54]= "QOC";DNA_INITON[64*2+ 55]= "QOS";
		DNA_INITON[64*2+ 56]= "QPV";DNA_INITON[64*2+ 57]= "QPE";DNA_INITON[64*2+ 58]= "QPC";DNA_INITON[64*2+ 59]= "QPS";
		DNA_INITON[64*2+ 60]= "QMV";DNA_INITON[64*2+ 61]= "QME";DNA_INITON[64*2+ 62]= "QMC";DNA_INITON[64*2+ 63]= "QMS";
		
		printFile(string1, DNA_CHOMOS, DNA_INITON, string1);
		printFile(string2, DNA_CHOMOS, DNA_INITON, string2);		
		printCMS(cmss);
		printCMSLink(cmss);
			
		System.out.println("finished");
		System.out.println(count);
		//input link
		//search sublink
		//is not a file,
	}

	private void printCMSLink(CMS cmss) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Iterator<String> iterators= cmss.javaCMSsroot.keySet().iterator();
				while(iterators.hasNext()) {
					String choclass= iterators.next();
					System.out.println();
					System.out.println("养疗经 染色体团:"+ choclass);
				Map<String,	Map<String, PDN>> classLeaf= cmss.javaCMSsroot.get(choclass);
					Iterator<String> iteratorsClassLeaf= classLeaf.keySet().iterator();
					while(iteratorsClassLeaf.hasNext()) {
						String pdnClassLeaf= iteratorsClassLeaf.next();
						System.out.print(":"+ pdnClassLeaf);
						Map<String, PDN> pdn= classLeaf.get(pdnClassLeaf);
						Iterator<String> iteratorsPDNClassLeaf= pdn.keySet().iterator();
						while(iteratorsPDNClassLeaf.hasNext()) {
							PDN pdnton= pdn.get(iteratorsPDNClassLeaf.next());
							Iterator<String> pdnLinkIterator= pdnton.javaPDNs.keySet().iterator();
							while(pdnLinkIterator.hasNext()) {
								String pdnLeaf= pdnLinkIterator.next();
								System.out.print(":"+ pdnLeaf);
								List<String> pdnLink= pdnton.javaPDNs.get(pdnLeaf);
								Iterator<String> pdnLinkSetIterator= pdnLink.iterator();
								System.out.print(":");
								while(pdnLinkSetIterator.hasNext()) {
									System.out.print(pdnLinkSetIterator.next()+";");
								}
							}	
						}
					}
				}
	}

	private void printCMS(CMS cmss) {
		// TODO Auto-generated method stub
		Iterator<String> iterators= cmss.javaCMSs.keySet().iterator();
		while(iterators.hasNext()) {
			String choclass= iterators.next();
			System.out.println("养疗经 染色体团:"+ choclass);
			Map<String, PDN> classLeaf= cmss.javaCMSs.get(choclass);
			Iterator<String> iteratorsClassLeaf= classLeaf.keySet().iterator();
			while(iteratorsClassLeaf.hasNext()) {
				String pdnClassLeaf= iteratorsClassLeaf.next();
				System.out.println("养疗经 染色体团:"+ choclass+ "染色体枝叶:"+ pdnClassLeaf);
				PDN pdn= classLeaf.get(pdnClassLeaf);
				Iterator<String> pdnLinkIterator= pdn.javaPDNs.keySet().iterator();
				while(pdnLinkIterator.hasNext()) {
					String pdnLeaf= pdnLinkIterator.next();
					System.out.println("养疗经 染色体团:"+ choclass
							+ "染色体枝叶:"+ pdnClassLeaf
							+ "叶肽:"+ pdnLeaf);
					List<String> pdnLink= pdn.javaPDNs.get(pdnLeaf);
					Iterator<String> pdnLinkSetIterator= pdnLink.iterator();
					System.out.println("养疗经 染色体团:"+ choclass
							+ "染色体枝叶:"+ pdnClassLeaf
							+ "叶肽:"+ pdnLeaf
							+ "肽单元+");
					while(pdnLinkSetIterator.hasNext()) {
						System.out.println(pdnLinkSetIterator.next());
					}
				}
			}
		}
	}

	private void printFile(String files, String[] dNA_CHOMOS, String[] dNA_INITON, String orilink) {
	//	int count=0;
		// TODO Auto-generated method stub
		Map<String, Boolean> fileCheckMap= new HashMap<>();
		File file= new File(files);
		if (file.isDirectory()) {
			String[] lists= file.list();
			for(String list:lists) {
				printFile(files+"\\"+ list, dNA_CHOMOS, dNA_INITON, orilink);
			}
		}else {
			if(files.contains("java")) {
				for(String chos: dNA_CHOMOS) {
					if(files.contains(chos)) {
						Map<String, PDN> list;
						if(cmss.javaCMSs.containsKey(chos)) {
							list= cmss.javaCMSs.get(chos);		
						}else {
							list= new HashMap<>();
						}	
						for(String pdn: dNA_INITON) {
							if(files.contains(pdn)) {
								PDN pDN= new PDN();
								if(list.containsKey(pdn)) {
									pDN= list.get(pdn);	
								}else {
									pDN.init();
								}
								List<String> PDNlist;
								if(pDN.javaPDNs.containsKey(pdn)) {
									PDNlist= pDN.javaPDNs.get(pdn);
								}else {
									PDNlist= new ArrayList<>();
								}
								if(!fileCheckMap.containsKey(files)) {
								//	count++;
									fileCheckMap.put(files, true);
									PDNlist.add(files.replace(orilink, "").replace("\\", "."));
									pDN.javaPDNs.put(pdn, PDNlist);
									list.put(pdn, pDN);// 加了pdn 和 pdn 对象
								}
							}
						}
						if(chos.charAt(0)=='A') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("AV")|| chos.contains("AE")
									|| chos.contains("AC")|| chos.contains("AS")) {
								if(cmss.javaCMSsroot.containsKey("显性A-VECS")) {
									VECSmap= cmss.javaCMSsroot.get("显性A-VECS");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}									
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性A-VECS", VECSmap);
							}
							if(chos.contains("AI")||chos.contains("AD")
									||chos.contains("AU")||chos.contains("AQ")) {
								if(cmss.javaCMSsroot.containsKey("隐性A-IDUQ")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性A-IDUQ");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}											
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性A-IDUQ", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='O') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("OV")||chos.contains("OE")
									||chos.contains("OC")||chos.contains("OS")) {
								if(cmss.javaCMSsroot.containsKey("显性O-VECS")) {
									VECSmap= cmss.javaCMSsroot.get("显性O-VECS");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}											
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性O-VECS", VECSmap);
							}
							if(chos.contains("OI")||chos.contains("OD")
									||chos.contains("OU")||chos.contains("OQ")) {
								if(cmss.javaCMSsroot.containsKey("隐性O-IDUQ")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性O-IDUQ");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}												
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性O-IDUQ", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='P') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("PV")||chos.contains("PE")
									||chos.contains("PC")||chos.contains("PS")) {
								if(cmss.javaCMSsroot.containsKey("显性P-VECS")) {
									VECSmap= cmss.javaCMSsroot.get("显性P-VECS");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}													
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性P-VECS", VECSmap);
							}
							if(chos.contains("PI")||chos.contains("PD")
									||chos.contains("PU")||chos.contains("PQ")) {
								if(cmss.javaCMSsroot.containsKey("隐性P-IDUQ")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性P-IDUQ");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}												
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性P-IDUQ", IDUQmap);
							}
						}
						
						
						if(chos.charAt(0)=='M') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("MV")||chos.contains("ME")
									||chos.contains("MC")||chos.contains("MS")) {
								if(cmss.javaCMSsroot.containsKey("显性M-VECS")) {
									VECSmap= cmss.javaCMSsroot.get("显性M-VECS");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}											
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性M-VECS", VECSmap);
							}
							if(chos.contains("MI")||chos.contains("MD")
									||chos.contains("MU")||chos.contains("MQ")) {
								if(cmss.javaCMSsroot.containsKey("隐性M-IDUQ")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性M-IDUQ");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}											
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性M-IDUQ", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='V') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("VA")||chos.contains("VO")
									||chos.contains("VP")||chos.contains("VM")) {
								if(cmss.javaCMSsroot.containsKey("显性V-AOPM")) {
									VECSmap= cmss.javaCMSsroot.get("显性V-AOPM");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}												
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性V-AOPM", VECSmap);
							}
							if(chos.contains("VI")||chos.contains("VD")
									||chos.contains("VU")||chos.contains("VQ")) {
								if(cmss.javaCMSsroot.containsKey("隐性V-IDUQ")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性V-IDUQ");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}												
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性V-IDUQ", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='E') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("EA")||chos.contains("EO")
									||chos.contains("EP")||chos.contains("EM")) {
								if(cmss.javaCMSsroot.containsKey("显性E-AOPM")) {
									VECSmap= cmss.javaCMSsroot.get("显性E-AOPM");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}											
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性E-AOPM", VECSmap);
							}
							if(chos.contains("EI")||chos.contains("ED")
									||chos.contains("EU")||chos.contains("EQ")) {
								if(cmss.javaCMSsroot.containsKey("隐性E-IDUQ")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性E-IDUQ");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}													
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性E-IDUQ", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='C') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("CA")||chos.contains("CO")
									||chos.contains("CP")||chos.contains("CM")) {
								if(cmss.javaCMSsroot.containsKey("显性C-AOPM")) {
									VECSmap= cmss.javaCMSsroot.get("显性C-AOPM");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}													
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性C-AOPM", VECSmap);
							}
							if(chos.contains("CI")||chos.contains("CD")
									||chos.contains("CU")||chos.contains("CQ")) {
								if(cmss.javaCMSsroot.containsKey("隐性C-IDUQ")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性C-IDUQ");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}												
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性C-IDUQ", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='S') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("SA")||chos.contains("SO")
									||chos.contains("SP")||chos.contains("SM")) {
								if(cmss.javaCMSsroot.containsKey("显性S-AOPM")) {
									VECSmap= cmss.javaCMSsroot.get("显性S-AOPM");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}												
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性S-AOPM", VECSmap);
							}
							if(chos.contains("SI")||chos.contains("SD")
									||chos.contains("SU")||chos.contains("SQ")) {
								if(cmss.javaCMSsroot.containsKey("隐性S-IDUQ")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性S-IDUQ");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}													
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性S-IDUQ", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='I') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("IA")||chos.contains("IO")
									||chos.contains("IP")||chos.contains("IM")) {
								if(cmss.javaCMSsroot.containsKey("显性I-AOPM")) {
									VECSmap= cmss.javaCMSsroot.get("显性I-AOPM");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}											
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性I-AOPM", VECSmap);
							}
							if(chos.contains("IV")||chos.contains("IE")
									||chos.contains("IC")||chos.contains("IS")) {
								if(cmss.javaCMSsroot.containsKey("隐性I-VECS")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性I-VECS");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}													
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性I-VECS", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='D') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("DA")||chos.contains("DO")
									||chos.contains("DP")||chos.contains("DM")) {
								if(cmss.javaCMSsroot.containsKey("显性D-AOPM")) {
									VECSmap= cmss.javaCMSsroot.get("显性D-AOPM");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}													
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性D-AOPM", VECSmap);
							}
							if(chos.contains("DV")||chos.contains("DE")
									||chos.contains("DC")||chos.contains("DS")) {
								if(cmss.javaCMSsroot.containsKey("隐性D-VECS")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性D-VECS");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}													
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性D-VECS", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='U') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("UA")||chos.contains("UO")
									||chos.contains("UP")||chos.contains("UM")) {
								if(cmss.javaCMSsroot.containsKey("显性U-AOPM")) {
									VECSmap= cmss.javaCMSsroot.get("显性U-AOPM");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}													
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性U-AOPM", VECSmap);
							}
							if(chos.contains("UV")||chos.contains("UE")
									||chos.contains("UC")||chos.contains("US")) {
								if(cmss.javaCMSsroot.containsKey("隐性U-VECS")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性U-VECS");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}														
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性U-VECS", IDUQmap);
							}
						}
						
						if(chos.charAt(0)=='Q') {
							Map<String, Map<String, PDN>> VECSmap;
							Map<String, Map<String, PDN>> IDUQmap;
							if(chos.contains("QA")||chos.contains("QO")
									||chos.contains("QP")||chos.contains("QM")) {
								if(cmss.javaCMSsroot.containsKey("显性Q-AOPM")) {
									VECSmap= cmss.javaCMSsroot.get("显性Q-AOPM");
									if(VECSmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= VECSmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										VECSmap.put(chos, list);		
									}													
								}else {
									VECSmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
										VECSmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("显性Q-AOPM", VECSmap);
							}
							if(chos.contains("QV")||chos.contains("QE")
									||chos.contains("QC")||chos.contains("QS")) {
								if(cmss.javaCMSsroot.containsKey("隐性Q-VECS")) {
									IDUQmap= cmss.javaCMSsroot.get("隐性Q-VECS");
									if(IDUQmap.containsKey(chos)) {//baoahan
										Map<String, PDN> pdn= IDUQmap.get(chos);
										Iterator<String> iterator= pdn.keySet().iterator();
										while(iterator.hasNext()) {
											String key= iterator.next();
											if(pdn.containsKey(key)) {
												PDN pdlist= pdn.get(key);
												Iterator<String> iteratorPdList= pdlist.javaPDNs.keySet().iterator();
												while(iteratorPdList.hasNext()) {
													String iteratorPdListKey= iteratorPdList.next();
													List<String> li= pdlist.javaPDNs.get(iteratorPdListKey);
													if(!list.isEmpty()) {
														PDN pn= list.get(key);
														if(pn!= null) {
															Iterator<String> addList= pn.javaPDNs.keySet().iterator();
															while(addList.hasNext()) {
																String addListKey= addList.next();
																List<String> addli= pn.javaPDNs.get(addListKey);
																Iterator<String> addlis= addli.iterator();
																while(addlis.hasNext()) {
																	li.add(addlis.next());
																}
															}	
														}
													}
													pdlist.javaPDNs.put(iteratorPdListKey, li);
												}
												list.put(key, pdlist);
											}	
										}
										IDUQmap.put(chos, list);		
									}													
								}else {
									IDUQmap= new HashMap<>();
									if(!list.isEmpty()) {
										count++;
								    	IDUQmap.put(chos, list);	
									}
								}
								cmss.javaCMSsroot.put("隐性Q-VECS", IDUQmap);
							}
						}
					
						//cmss.javaCMSs.put(chos, list);
					}
			
				}
			}
		}
		//System.out.println(count);
	}
}