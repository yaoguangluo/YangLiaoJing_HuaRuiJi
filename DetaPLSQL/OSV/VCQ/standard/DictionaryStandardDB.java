package OSV.VCQ.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//研发,思想,设计: 罗瑶光 20210504
//@送给54青年节的礼物
public class DictionaryStandardDB{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<String, Map<String, Object>> dbToMap(String primaryKey, String tabKey) throws IOException{
		Map<String, Object> dic_map= new ConcurrentHashMap<String, Object>();
		Map<String, Map<String, Object>> dbMap= new HashMap<>();
		Map<String, Object> map= null;
		//for(int i=0; i<)
		//		String plsql= "setRoot:C:/DetaDB;" + 
		//				"baseName:ZYY;" + 
		//				"tableName:"+ tabKey +":select;" +
		//				"condition:or:ID|<=|3000;";
		//"condition:or:ID|==|2;";
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
					.withTableSelect(tabKey).withCondition("or")
					.let("ID").lessThanAndEqualTo("3000")
					.checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
					.checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
					.finalExec(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLORM(orm, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		ArrayList list= (ArrayList)map.get("obj");
		Iterator<HashMap<String, Object>> iterator= list.iterator();
		Here:
			while(iterator.hasNext()) {
				HashMap<String, Object> hashmap= iterator.next();
				StringBuilder stringBuilder= new StringBuilder();
				if(hashmap.containsKey("rowValue")) {
					HashMap<String, Object> rowValue= (HashMap<String, Object>) hashmap.get("rowValue");
					String keyName= null;
					HashMap<String, Object> temp= (HashMap<String, Object>) rowValue.get(primaryKey);
					keyName= null== temp.get("culumnValue")?"":temp.get("culumnValue").toString().replace("@Tin@", ":").replace("@biky@", ":");
					if(null== keyName) {
						continue Here;
					}
					String gg= null== temp.get("culumnValue")? "": temp.get("culumnValue").toString();
					//因为zybc我有明文存储, 所以先加个注释,以后修正.
					boolean isIniton= true;
					if(!gg.contains("A")&&!gg.contains("O")&&!gg.contains("P")&&!gg.contains("M")&&
							!gg.contains("V")&&!gg.contains("E")&&!gg.contains("C")&&!gg.contains("S")&&
							!gg.contains("I")&&!gg.contains("D")&&!gg.contains("U")&&!gg.contains("Q")) {
						isIniton= false;
					}
					if(isIniton) {//稍后处理迪摩根化简
						gg= new FullDNATokenPDI().initonDeSect(gg);
					}
					keyName= gg.replace("@Tin@", ":").replace("@biky@", ":");
					if(dbMap.containsKey(primaryKey)) {
						//获取hashmap 子集;
						Map<String, Object> hashMap= dbMap.get(primaryKey);
						//hashmap 子集添加数据
						if(null== hashMap) {
							hashMap= new HashMap<>();	
						}
						hashMap.put(keyName, keyName);
						//hashmap 子集存档
						dbMap.put(primaryKey, hashMap);
					}else {
						Map<String, Object> hashMap= new HashMap<>();
						hashMap.put(keyName, keyName);
						dbMap.put(primaryKey, hashMap);
					}
					stringBuilder.append(keyName);
					Iterator<String> iterators= rowValue.keySet().iterator();
					while(iterators.hasNext()) {
						String string= iterators.next();//列表名
						if(!string.equalsIgnoreCase(primaryKey)) {
							temp= (HashMap<String, Object>) rowValue.get(string);
							gg= null== temp.get("culumnValue")? "": temp.get("culumnValue").toString();	
							//去null//去empty 稍后
							try {
//								if(!gg.contains("A")&&!gg.contains("O")&&!gg.contains("P")&&!gg.contains("M")&&
//										!gg.contains("V")&&!gg.contains("E")&&!gg.contains("C")&&!gg.contains("S")&&
//										!gg.contains("I")&&!gg.contains("D")&&!gg.contains("U")&&!gg.contains("Q")) {
//									isIniton= false;
//								}
//								if(isIniton) {//稍后处理迪摩根化简
									String stringGG= new FullDNATokenPDI().initonDeSect(gg.replace("null", ""));
									gg= stringGG.isEmpty()?gg.replace("null", ""): stringGG;//  先做个简单的优化,稍后进行规范化OSV.
								//}
							}catch(Exception e) {
								e.printStackTrace();
							}
							if(dbMap.containsKey(string)&& null!= dbMap.get(string)) {
								//获取hashmap 子集;
								Map<String, Object> hashMap= dbMap.get(string);
								//hashmap 子集添加数据
								hashMap.put(keyName, gg.replace("@Tin@", ":").replace("@biky@", ":"));
								//hashmap 子集存档
								dbMap.put(string, hashMap);
							}else {
								Map<String, Object> hashMap= new HashMap<>();
								hashMap.put(keyName, gg.replace("@Tin@", ":").replace("@biky@", ":"));
								dbMap.put(string, hashMap);
							}
							stringBuilder.append(gg.replace("@Tin@", ":").replace("@biky@", ":"));
						}
					}
					dic_map.put(keyName, stringBuilder.toString().replace("@Tin@", ":").replace("@biky@", ":"));
				}
			}
		dbMap.put("dic_map", dic_map);
		return dbMap;
	}	
}