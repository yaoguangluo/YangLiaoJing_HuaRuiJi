package ME.APM.VSQ.zhongYiFuChan;
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

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
@SuppressWarnings("unused")
public class DictionaryDB{	
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
	
//	@SuppressWarnings({"unchecked", "rawtypes", "unused"})
	public Map<String, Object> listToMap(List<String> dic_list) throws IOException{
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Object> map= null;
		//for(int i=0; i<)
		String plsql= "setRoot:C:/DetaDB1;" + 
				"baseName:ZYY;" + 
				"tableName:gjjd:select;" +
				"condition:or:ID|<=|3000;";
				//"condition:or:ID|==|2;";
		try {
//			Select orm= new Select().startAtRootDir("C:/DetaDB").withBaseName("ZYY")
//					.withTableSelect("xybg").withCondition("or", "ID|<=|3000");
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLSQL(plsql, true);
		//	map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	//	ArrayList list= (ArrayList) map.get("obj");
//		Iterator<HashMap<String, Object>> iterator= list.iterator();
		return map;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<String, String> txtToMap(Map<String, Object> dic_bing_ming, Map<String, Object> dic_yongyao) throws IOException{
		Map<String, String> dic_map= new ConcurrentHashMap<String, String>();
		Map<String, Object> map= null;
		//for(int i=0; i<)
		String plsql= "setRoot:C:/DetaDB1;" + 
				"baseName:ZYY;" + 
				"tableName:zysz:select;" +
				"condition:or:ID|<=|3000;";
				//"condition:or:ID|==|2;";
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
					.withTableSelect("zysz").withCondition("or")
					.let("ID").lessThanAndEqualTo("3000")
					.checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
					.checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
					.finalE(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLSQL(plsql, true);
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		ArrayList list= (ArrayList)map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		//int index= 0;
		Here:
		while(iterator.hasNext()) {
			//index++;
			HashMap<String, Object> hashmap= iterator.next();
			StringBuilder stringBuilder= new StringBuilder();
			if(hashmap.containsKey("rowValue")) {
				HashMap<String, Object> rowValue= (HashMap<String, Object>) hashmap.get("rowValue");
				String keyName= null;
				if(rowValue.containsKey("病名")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("病名");
					keyName= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@Tin@", ":");
					if(null== keyName) {
						continue Here;
					}
					String gg= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					gg= new FullDNATokenPDI().initonDeSect(gg);
					keyName= gg.replace("@Tin@", ":");
					dic_bing_ming.put(keyName,keyName);
					stringBuilder.append(keyName);
				}
				if(rowValue.containsKey("用药")) {
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get("用药");
					String gg= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString();
					gg= new FullDNATokenPDI().initonDeSect(gg);
					dic_yongyao.put(keyName, gg.replace("@Tin@", ":"));
					stringBuilder.append(gg.replace("@Tin@", ":"));
				}
				dic_map.put(keyName, stringBuilder.toString().replace("@Tin@", ":"));
			}
		}
		return dic_map;
	}	
}