package ME.APM.VSQ.zhongYao;
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

import ME.APM.VSQ.App;
import ME.S.stables.PathLinkFile;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import PEU.S.verbal.VerbalSource;
@SuppressWarnings("unused")
public class DictionaryFromDB{	
//	public List<String> dic_list;
//	public Map<String,Object> dic_map;
//	public Map<String,Object> dic_li;
//	public Map<String,Object> dic_hai;
//	public Map<String,Object> dic_xz;
//	public Map<String,Object> dic_xw;
//	public Map<String,Object> dic_jm;
//	public Map<String,Object> dic_ya;
//	public Map<String,Object> dic_cy;
//	public Map<String,Object> dic_cj;
//	public Map<String,Object> dic_jj;
//	public Map<String,Object> dic_zf;
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
	
		return dic_list;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Object> map = null;
		//for(int i=0; i<)
		String plsql= "setRoot:C:/DetaDB1;" + 
				"baseName:ZYY;" + 
				"tableName:zybc:select;" +
				"condition:or:ID|<=|3000;";
				//"condition:or:ID|==|2;";
		try {
			map= ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		ArrayList list= (ArrayList) map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		return map;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<String, Object> listToMap(Map<String, Object> dic_yw, Map<String, Object> dic_li,
			Map<String, Object> dic_hai, Map<String, Object> dic_xz, Map<String, Object> dic_ya, 
			Map<String, Object> dic_jm, Map<String, Object> dic_xw, Map<String, Object> dic_cy, 
			Map<String, Object> dic_jj, Map<String, Object> dic_zf, Map<String, Object> dic_cj, 
			Map<String, Object> dic_yl) {
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Object> map = null;
		//for(int i=0; i<)
		System.out.println("1");
		String plsql= "setRoot:C:/DetaDB1;" + 
				"baseName:ZYY;" + 
				"tableName:zybc:select;" +
				"condition:or:ID|<=|3000;";
				//"condition:or:ID|==|2;";
		try {
			map= ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		ArrayList list= (ArrayList) map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		while(iterator.hasNext()) {
			HashMap<String,Object> hashmap= iterator.next();
			StringBuilder stringBuilder= new StringBuilder();
			if(hashmap.containsKey("rowValue")) {
				HashMap<String, Object> rowValue= (HashMap<String, Object>) hashmap.get("rowValue");
				String keyName= null;
				if(rowValue.containsKey("中药名称")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("中药名称");
					keyName= temp.get("culumnValue").toString();
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if(rowValue.containsKey("常见药")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("常见药");
					String cj= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					cj= new FullDNATokenPDI().initonDeSect(cj);	
					dic_cj.put(keyName, cj.replace("@biky@", ":"));
					stringBuilder.append(cj);
				}
				if(rowValue.containsKey("搭配")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("搭配");
					String zf= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					zf= new FullDNATokenPDI().initonDeSect(zf);
					dic_zf.put(keyName, zf.replace("@biky@", ":"));
					stringBuilder.append(zf);
				}
				if(rowValue.containsKey("愚按")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("愚按");
					String ya= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					ya= new FullDNATokenPDI().initonDeSect(ya);
					dic_ya.put(keyName, ya.replace("@biky@", ":"));
					stringBuilder.append(ya);
				}
				if(rowValue.containsKey("崇源")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("崇源");
					String cy= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					cy= new FullDNATokenPDI().initonDeSect(cy);
					dic_cy.put(keyName, cy.replace("@biky@", ":"));
					stringBuilder.append(cy);
				}
				if(rowValue.containsKey("经解")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("经解");
					String jj= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					jj= new FullDNATokenPDI().initonDeSect(jj);
					dic_jj.put(keyName, jj.replace("@biky@", ":"));
					stringBuilder.append(jj);
				}
				if(rowValue.containsKey("经脉")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("经脉");
					String jm= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					jm= new FullDNATokenPDI().initonDeSect(jm);
					dic_jm.put(keyName, jm.replace("@biky@", ":"));
					stringBuilder.append(jm);
				}
				if(rowValue.containsKey("性味")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("性味");
					String xw= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					xw= new FullDNATokenPDI().initonDeSect(xw);
					dic_xw.put(keyName, xw.replace("@biky@", ":"));
					stringBuilder.append(xw);
				}
				if(rowValue.containsKey("用量")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("用量");
					String yl= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
				    //yl= new FullDNATokenPDI().initonDeSect(yl);
					dic_yl.put(keyName, yl.replace("@biky@", ":"));
					stringBuilder.append(yl);
				}
				if(rowValue.containsKey("风险规避")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("风险规避");
					String hai= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
				    hai= new FullDNATokenPDI().initonDeSect(hai);
					dic_hai.put(keyName, hai.replace("@biky@", ":"));
					stringBuilder.append(hai);
				}
				if(rowValue.containsKey("功效")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("功效");
					String li= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
				    li= new FullDNATokenPDI().initonDeSect(li);
					dic_li.put(keyName, li.replace("@biky@", ":"));
					stringBuilder.append(li);
				}
				if(rowValue.containsKey("笔记原文")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("笔记原文");
					String yw= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					//yw= new FullDNATokenPDI().initonDeSect(yw);
					dic_yw.put(keyName, yw.replace("@biky@", ":"));
					stringBuilder.append(yw);
				}
				if(rowValue.containsKey("中医馆药理")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("中医馆药理");
					String xz= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
				    xz= new FullDNATokenPDI().initonDeSect(xz);
					dic_xz.put(keyName, xz.replace("@biky@", ":"));
					stringBuilder.append(xz);
				}
				
				dic_map.put(keyName, stringBuilder.toString().replace("@biky@", ":"));
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
			String index= iter.next().replaceAll(" ", "").replace("〔","").replace("〕",":");
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
}