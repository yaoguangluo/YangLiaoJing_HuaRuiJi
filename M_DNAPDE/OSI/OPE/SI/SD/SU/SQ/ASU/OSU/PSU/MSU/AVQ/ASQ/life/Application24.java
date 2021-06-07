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

public class Application24 extends Thread {
	public PDN pdns= new PDN();
	public CMS cmss= new CMS();
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
		
//		String string1= "D:\\Users\\Lenovo\\eclipse-workspace\\DETA_YLJ1.5.8";
//		String string2= "D:\\Users\\Lenovo\\git\\Deta_Parser";
		
		String string1= "C:\\Users\\Lenovo\\eclipse-workspace\\HRJ_YLJ_18111";
		String string2= "C:\\Users\\Lenovo\\eclipse-workspace\\HRJ_YLJ_18111";
		pdns.init();
		cmss.init();
	    
		String[] DNA_CHOMOS= new String[16];
		DNA_CHOMOS[0]="AV";DNA_CHOMOS[1]="AE";DNA_CHOMOS[2]="AC";DNA_CHOMOS[3]="AS";
		DNA_CHOMOS[4]="OV";DNA_CHOMOS[5]="OE";DNA_CHOMOS[6]="OC";DNA_CHOMOS[7]="OS";
		DNA_CHOMOS[8]="PV";DNA_CHOMOS[9]="PE";DNA_CHOMOS[10]="PC";DNA_CHOMOS[11]="PS";
		DNA_CHOMOS[12]="MV";DNA_CHOMOS[13]="ME";DNA_CHOMOS[14]="MC";DNA_CHOMOS[15]="MS";
		
		String[] DNA_INITON= new String[64];
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
		printFile(string1, DNA_CHOMOS, DNA_INITON, string1);
		printFile(string2, DNA_CHOMOS, DNA_INITON, string2);		
		printCMS(cmss);
		printCMSLink(cmss);
			
		System.out.println("finished");
		
		//input link
		//search sublink
		//is not a file,
	}

	private void printCMSLink(CMS cmss) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Iterator<String> iterators= cmss.javaCMSs.keySet().iterator();
				while(iterators.hasNext()) {
					String choclass= iterators.next();
					System.out.println();
					System.out.println("养疗经 染色体团:"+ choclass);
					Map<String, PDN> classLeaf= cmss.javaCMSs.get(choclass);
					Iterator<String> iteratorsClassLeaf= classLeaf.keySet().iterator();
					while(iteratorsClassLeaf.hasNext()) {
						String pdnClassLeaf= iteratorsClassLeaf.next();
						System.out.print(":"+ pdnClassLeaf);
						PDN pdn= classLeaf.get(pdnClassLeaf);
						Iterator<String> pdnLinkIterator= pdn.javaPDNs.keySet().iterator();
						while(pdnLinkIterator.hasNext()) {
							String pdnLeaf= pdnLinkIterator.next();
							System.out.print(":"+ pdnLeaf);
							List<String> pdnLink= pdn.javaPDNs.get(pdnLeaf);
							Iterator<String> pdnLinkSetIterator= pdnLink.iterator();
							System.out.print(":");
							while(pdnLinkSetIterator.hasNext()) {
								System.out.print(pdnLinkSetIterator.next()+";");
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
		// TODO Auto-generated method stub
		File file= new File(files);
		if (file.isDirectory()) {
			String[] lists= file.list();
			for(String list:lists) {
				printFile(files+"\\"+ list, dNA_CHOMOS, dNA_INITON, orilink);
			}
		}else {
			if(files.contains("pde")) {
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
								PDNlist.add(files.replace(orilink, "").replace("\\", "."));
								pDN.javaPDNs.put(pdn, PDNlist);
								list.put(pdn, pDN);
							}
						}
						cmss.javaCMSs.put(chos, list);
					}
				}	
			}
		}
	}
}