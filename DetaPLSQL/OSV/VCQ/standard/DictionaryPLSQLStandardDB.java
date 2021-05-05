package OSV.VCQ.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210506
public class DictionaryPLSQLStandardDB{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}
	
	public static Map<String, Object> bootORMReadDBInCommonWay(String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
					.withTableSelect(tabKey).withCondition("or")
					.let("ID").lessThanAndEqualTo("3000")
					.checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
					.checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
					.finalExec(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLORM(orm, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	
	
	public static Map<String, Object> bootPLSQLReadDBInCommonWay(String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
			String plsql= "setRoot:C:/DetaDB1;" + 
					"baseName:ZYY;" + 
					"tableName:"+ tabKey +":select;" +
					"condition:or:ID|<=|3000;";
			map= OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	
}