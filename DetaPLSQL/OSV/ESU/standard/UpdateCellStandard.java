package OSV.ESU.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
//import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210507
//选中一个cell 进行改变
public class UpdateCellStandard{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

//  稍后我会把下面这个2个模式变成ORM UNSQL, 函数是很好写, 但是我在思考 or and 太多 怎么进行规范传参..
//  我的动机很简单, 就是养疗经数据表可以直接数据库操作修改.
//  见DNA编码与计算第一卷 308页
//	update samples 
//	tableName:test:update; 
//	condition:or:testCulumn1|<|20:testCulumn2|==|fire; 
//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
//	culumnValue:date0:19850525;
//	culumnValue:date1:19850526;
//	
//	update samples tableName:test:update; 
//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
//	join:backend:utest;
//	condition:and:uCulumn3|<|20; 
//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2; 
//	culumnValue:date0:19850525;
//	culumnValue:date1:19850526;
	
	public static Map<String, Object> UpdateCellORM(String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
//			PLORMInterf orm= new PLORMImpl();
//			map= orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
//					.withTableSelect(tabKey).withCondition("or")
//					.let("ID").lessThanAndEqualTo("3000")
//					.checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
//					.checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
//					.finalExec(true).returnAsMap();
			//map= org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLORM(orm, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	
	
	public static Map<String, Object> UpdateCellPLSQL(String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
//			String plsql= "setRoot:C:/DetaDB1;" + 
//					"baseName:ZYY;" + 
//					"tableName:"+ tabKey +":select;" +
//					"condition:or:ID|<=|3000;";
//			map= OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	
}