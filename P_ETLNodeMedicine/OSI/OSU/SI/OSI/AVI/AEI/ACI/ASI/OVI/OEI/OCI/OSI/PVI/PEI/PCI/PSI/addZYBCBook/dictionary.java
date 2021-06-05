package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYBCBook;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ME.S.stables.PathLinkFile;
import PEU.S.verbal.VerbalSource;

public class dictionary{	
	public List<String> dic_list;
	public Map<String,Object> dic_map;
	public Map<String,Object> dic_li;
	public Map<String,Object> dic_hai;
	public Map<String,Object> dic_xz;
	public Map<String,Object> dic_xw;
	public Map<String,Object> dic_jm;
	public Map<String,Object> dic_ya;
	public Map<String,Object> dic_cy;
	public Map<String,Object> dic_cj;
	public Map<String,Object> dic_jj;
	public Map<String,Object> dic_zf;
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		InputStream in= this.getClass().getResourceAsStream("bcqj.txt");
		BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
		String ctempString= null; 
		while ((ctempString= cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				dic_list.add(ctempString);
		}
		cReader.close();
		return dic_list;
	}
	
	@SuppressWarnings("unused")
	public Map<String, Object> listToMap(Map<String, Object> dic_map, List<String> dic_list) throws IOException{
		for(int i = 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("ÕªÒª")) {
				if(i+3 < dic_list.size()) {
					String med_name = dic_list.get(i+3).replace("[ÖÐÒ©Ãû³Æ]", "");
					String med_text = "";
					int j = i+2;				
					while(++j < dic_list.size() && !dic_list.get(j).contains("ÕªÒª")) {
						med_text += "\n" + dic_list.get(j);
					}
					med_name= med_name.replaceAll(" ", "").replace("¡²","").replace("¡³",":");	
					
					if(!dic_map.containsKey(med_name)) {
						dic_map.put(med_name, med_text+"¡³¡³");
					}else {
						dic_map.put(med_name
								, dic_map.get(med_name)+ "µþ¼Ó£º"+ med_text+"¡³¡³");
					}
				}
			}
		}
		return dic_map;
	}
	
	public Map<String, Object> mapToIndex(Map<String, Object> dic_map) {
		Map<String,String> pinyin= new HashMap<>();
		try {
			InputStream inputStreamp= new VerbalSource().getClass().getResourceAsStream(PathLinkFile.PinYinCN_lyg);
    		BufferedReader cReaderp= new BufferedReader(new InputStreamReader(inputStreamp, "GBK"));
    		//index
    		String cInputStringp;
    		while ((cInputStringp= cReaderp.readLine())!= null) {
    			String[] words= cInputStringp.split("->");
    			if(words.length>1) {
    				pinyin.put(words[0], words[1]);
    			}
    		}
    		cReaderp.close();
		}catch(Exception e) {

		}		
		Map<String, Object> dic_index= new HashMap<>();
		Iterator<String> iter= dic_map.keySet().iterator();
		while (iter.hasNext()) {
			String index= iter.next().replaceAll(" ", "").replace("¡²","").replace("¡³",":");
			StringBuilder stringBuilder= new StringBuilder() ;
			for(int l= 0; l< index.length(); l++) {
				if(pinyin.containsKey(""+ index.charAt(l))) {
					stringBuilder.append(""+ pinyin.get(""+ index.charAt(l)).toUpperCase().charAt(0));
				}
			}
			//med_name= stringBuilder.toString()+ ":"+ index;	
			dic_index.put(index, stringBuilder.toString());
		}
		return dic_index;
	}
	
	public Map<String, Object> mapToMap_yw(Map<String, Object> dic_map) {
		Map<String,Object> dic_yw = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("±Ê¼ÇÔ­ÎÄ(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("±Ê¼ÇÔ­ÎÄ]", "").replace("[", ".");
			}
//			if(!dic_yw.containsKey(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"))) {
//				dic_yw.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
//						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
//			}
			
			med_name= med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":");
			if(!dic_yw.containsKey(med_name)) {
				dic_yw.put(med_name
						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}else {
				dic_yw.put(med_name
						, dic_yw.get(med_name)+ "µþ¼Ó£º"+ temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}
		}
		return dic_yw;
	}
	
	public Map<String, Object> mapToMap_li(Map<String, Object> dic_map) {
		Map<String,Object> dic_li = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("¹¦Ð§(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("¹¦Ð§]", "").replace("[", ".");
			}
			med_name= med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":");
			if(!dic_li.containsKey(med_name)) {
				dic_li.put(med_name
						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}else {
				dic_li.put(med_name
						, dic_li.get(med_name)+ "µþ¼Ó£º"+ temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}
		}
		return dic_li;
	}
	
	public Map<String, Object> mapToMap_hai(Map<String, Object> dic_map) {
		Map<String,Object> dic_hai = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());	
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("·çÏÕ¹æ±Ü(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("·çÏÕ¹æ±Ü]", "").replace("[", "");
			}
//			if(!dic_hai.containsKey(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"))) {
//				dic_hai.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
//						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
//				
//			}
//			
			med_name= med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":");
			if(!dic_hai.containsKey(med_name)) {
				dic_hai.put(med_name
						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}else {
				dic_hai.put(med_name
						, dic_hai.get(med_name)+ "µþ¼Ó£º"+ temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}
		}
		return dic_hai;
	}
	
	public Map<String, Object> mapToMap_xz(Map<String, Object> dic_map) {
		Map<String,Object> dic_xz = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString().replace("\n", "");	
			Pattern p=Pattern.compile("ÖÐÒ½¹ÝÒ©Àí(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("ÖÐÒ½¹ÝÒ©Àí]", "").replace("[", "");
			}
//			if(!dic_xz.containsKey(med_name.replaceAll("\\s*", "").replace("¡²", "").replace("¡³",":"))) {
//				dic_xz.put(med_name.replaceAll("\\s*", "").replace("¡²", "").replace("¡³", ":")
//						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
//			}
			med_name= med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":");
			if(!dic_xz.containsKey(med_name)) {
				dic_xz.put(med_name
						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}else {
				dic_xz.put(med_name
						, dic_xz.get(med_name)+ "µþ¼Ó£º"+ temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}
		}
		return dic_xz;
	}

	public Map<String, Object> mapToMap_zf(Map<String, Object> dic_map) {
		Map<String,Object> dic_zf = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("´îÅä(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("´îÅä]", "").replace("[", "");
			}
			dic_zf.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
					, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
		}
		return dic_zf;
	}
	
	public Map<String, Object> mapToMap_cj(Map<String, Object> dic_map) {
		Map<String,Object> dic_cj = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("³£¼ûÒ©(.*?)Ò©Ð¡½ÚÍê"); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0).replace("³£¼ûÒ©]", "");
			}
			dic_cj.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
					, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
		}
		return dic_cj;
	}
	

	public Map<String, Object> mapToMap_jj(Map<String, Object> dic_map) {
		Map<String,Object> dic_jj = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("¾­½â(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("¾­½â]", "").replace("[", "");
			}
			dic_jj.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
					, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
		}
		return dic_jj;
	}

	public Map<String, Object> mapToMap_cy(Map<String, Object> dic_map) {
		Map<String,Object> dic_cy = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("³çÔ´(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("³çÔ´]", "").replace("[", "");
			}
			dic_cy.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
					, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
		}
		return dic_cy;
	}

	public Map<String, Object> mapToMap_ya(Map<String, Object> dic_map) {
		Map<String,Object> dic_ya = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("ÓÞ°´(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("ÓÞ°´]", "").replace("[", "");
			}
			dic_ya.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
					, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
		}
		return dic_ya;
	}

	public Map<String, Object> mapToMap_jm(Map<String, Object> dic_map) {
		Map<String,Object> dic_jm = new ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("¾­Âö/¾­Âç(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("¾­Âö/¾­Âç]", "").replace("[", "");
			}
			temp= temp.replace("Î¸", "Î¸PES");
			temp= temp.replace("ÐÄ", "ÐÄOEIT");
			temp= temp.replace("°ü", "°üESIT");
			temp= temp.replace("¸Î", "¸ÎAPMSUH");
			temp= temp.replace("Æ¢", "Æ¢OSU");
			temp= temp.replace("·Î", "·ÎSIDH");
			temp= temp.replace("Éö", "ÉöPVDH");
			temp= temp.replace("Ð¡³¦", "Ð¡³¦MCI");
			temp= temp.replace("´ó³¦", "´ó³¦CID");
			temp= temp.replace("µ¨", "µ¨MSIH");
			temp= temp.replace("³¦", "³¦CI");
			temp= temp.replace("°òë×", "°òë×MVID");
			
			if(med_text.contains("¹Ç")||med_text.contains("Âç")||med_text.contains("½î")) {
				temp= temp+ "¹ÇOMVSI";	
			}
			if(med_text.contains("¶ú")) {
				temp= temp+ "¶úVIQX";	
			}
			if(med_text.contains("±Ç")) {
				temp= temp+ "±ÇVIDX";	
			}
			if(med_text.contains("ºí")) {
				temp= temp+ "ºíAVUX";	
			}
			if(med_text.contains("ÑÛ")|| med_text.contains("Ä¿")|| med_text.contains("ôè")) {
				temp= temp+ "ÑÛVQX";	
			}
			if(med_text.contains("Æ¤")) {
				temp= temp+ "Æ¤MVIDX";	
			}
			if(med_text.contains("×ì")) {
				temp= temp+ "×ìODQ";	
			}
			if(med_text.contains("Ã¼")) {
				temp= temp+ "Ã¼OEU";	
			}
			if(med_text.contains("ÊÖ")) {
				temp= temp+ "ÊÖOPMVTX";	
			}
			if(med_text.contains("½Å")) {
				temp= temp+ "½ÅEUT";	
			}
			if(med_text.contains("Ñª")||med_text.contains("Æø")) {
				temp= temp+ "ÑªÆøMEH";	
			}
			if(med_text.contains("ÁÜ")) {
				temp= temp+ "ÁÜAVSDQ";	
			}
			if(med_text.contains("Ëè")||med_text.contains("ÄÔ")||med_text.contains("Éñ¾­")) {
				temp= temp+ "ËèAPMCS";	
			}
//			temp= temp.replace("¹Ç", "¹ÇOMVSI");
//			temp= temp.replace("¶ú", "¶úVIQX");
//			temp= temp.replace("±Ç", "±ÇVIDX");
//			temp= temp.replace("ºí", "ºíAVUX");
//			temp= temp.replace("ÑÛ", "ÑÛVQX");
//			temp= temp.replace("Æ¤", "Æ¤MVIDX");
//			temp= temp.replace("×ì", "×ìODQ");
//			temp= temp.replace("Ã¼", "Ã¼OEU");
//			temp= temp.replace("ÊÖ", "ÊÖOPMVTX");
//			temp= temp.replace("½Å", "½ÅEUT");
//			temp= temp.replace("Ñª", "ÑªMEH");
//			temp= temp.replace("ÁÜ°Í", "ÁÜ°ÍAVSDQ");
//			temp= temp.replace("ÄÔ", "ÄÔAPMCS");
			dic_jm.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
					, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
		}
		return dic_jm;
	}

	public Map<String, Object> mapToMap_xw(Map<String, Object> dic_map) {
		Map<String,Object> dic_xw = new java.util.concurrent.ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("ÐÔÎ¶(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("ÐÔÎ¶]", "").replace("[", "");
			}
			//if(!dic_xw.containsKey(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"))) {
			//dic_xw.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
			//		, temp.replace("¾­Âç", "").replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			med_name= med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":");
			//½ö½öÓïÒå´Ê»ã·½Ê½Ôª»ùëÄÒë¡£
			temp= temp.replace("Ëá", "ËáOPESI");
			temp= temp.replace("Ìð", "ÌðOSI");
			temp= temp.replace("¿à", "¿àMECD");
			temp= temp.replace("À±", "À±OESI");
			temp= temp.replace("ÐÁ", "À±OPESI");
			temp= temp.replace("ÏÌ", "ÏÌOMD");
			temp= temp.replace("Á¹", "Á¹MCD");
			temp= temp.replace("¸Ê", "¸ÊSI");
			temp= temp.replace("º®", "º®MD");
			temp= temp.replace("ÈÈ", "ÈÈPSI");
			temp= temp.replace("ÎÂ", "ÎÂESI");
			temp= temp.replace("Ôï", "ÔïPESI");
			temp= temp.replace("É¬", "É¬PMI");
			temp= temp.replace("Æ½", "Æ½MS");
			temp= temp.replace("µ­", "µ­U");
			temp= temp.replace("Î¢", "Î¢U");
			if(!dic_xw.containsKey(med_name)) {
				dic_xw.put(med_name
						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}else {
				dic_xw.put(med_name
						, dic_xw.get(med_name)+ "µþ¼Ó£º"+ temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}
		}
		//}
		return dic_xw;
	}

	public Map<String, Object> mapToMap_yl(Map<String, Object> dic_map, Map<String, Object> dic_xw,
			Map<String, Object> dic_li, Map<String, Object> dic_xz, Map<String, Object> dic_jm) throws IOException {
		Map<String,Object> dic_yl = new java.util.concurrent.ConcurrentHashMap<String, Object>();
		Iterator<String> iter = dic_map.keySet().iterator();
		List<String> copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n", "");	
			Pattern p=Pattern.compile("ÓÃÁ¿/¿Ë, ±ðÃû£¬ÆäËû£¬±¸×¢(.*?)\\["); 
			Matcher m = p.matcher(med_text); 
			String temp = "";
			if (m.find()) {
				temp=m.group(0);
				temp=temp.replace("ÓÃÁ¿/¿Ë, ±ðÃû£¬ÆäËû£¬±¸×¢]", "").replace("[", "");
			}
//			if(!dic_yl.containsKey(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"))) {
//				dic_yl.put(med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")
//						, temp.replace("¾­Âç", "").replaceAll("\\s*", "").replace("¡²","").replace("¡³",":")+":");
//			}
			med_name= med_name.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":");
			if(!dic_yl.containsKey(med_name)) {
				dic_yl.put(med_name
						, temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}else {
				dic_yl.put(med_name
						, dic_yl.get(med_name)+ "µþ¼Ó£º"+ temp.replaceAll("\\s*", "").replace("¡²","").replace("¡³",":"));
			}
		}
		return dic_yl;	
	}	
}