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
					.finalE(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	

	public static Map<String, Object> bootORMReadDBByRangeRowID(String rootPath, String baseName
			, boolean unTest, String tabKey, String RangeRowIDCount) throws IOException{
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir(rootPath).withBaseName(baseName)
					.withTableSelect(tabKey).withCondition("or")
					.let("ID").lessThanAndEqualTo(RangeRowIDCount)
					.checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
					.checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
					.finalE(unTest).returnAsMap();
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	
	//下面这些例子, 本人只是给大家一些更多的参考而已.
	public static Map<String, Object> bootORMReadDBByLessThanAndEqualTo(String rootPath, String baseName
			, String conditionSubject, String conditionObject, boolean unTest, String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			map= orm.startAtRootDir(rootPath).withBaseName(baseName)
					.withTableSelect(tabKey).withCondition("or")
					.let(conditionSubject).lessThanAndEqualTo(conditionObject)
					.checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
					.checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
					.finalE(unTest).returnAsMap();
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
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
			map= ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	
}