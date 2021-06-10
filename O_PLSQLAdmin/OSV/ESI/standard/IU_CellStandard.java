package OSV.ESI.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210510
//插入一行完整的数据.
//我没有测试, 现在养疗经还用不到, 优先级稍后.
//稍后会考虑不完整的插入情况 赋值empty 或null.
public class IU_CellStandard{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	public static Map<String, Object> InsertCellORM(String rootPath, String baseName, String tabKey
			, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		Iterator<String> iterators= rowCells.keySet().iterator();
		Map<String, Object> map= null;
		try {
			PLORMInterf orm= new PLORMImpl();
			orm= orm.startAtRootDir(rootPath)
					.withBaseName(baseName)
					.withTableInsert(tabKey);
			while(iterators.hasNext()) {
				String string= iterators.next();
				if(initonEncrypt) {
					orm= orm.withCulumnValue(string
							, new FullDNATokenPDI().initonSect(rowCells.get(string).replace(":", "@Tin@")));
				}else {
					orm= orm.withCulumnValue(string, rowCells.get(string).replace(":", "@Tin@"));	
					//我稍后会思考: 符号怎么进行实体化,省的要变通配符代替.
				}	
			}
			orm.checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
			.checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
			.finalE(true);
			//map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	

	public static Map<String, Object> InsertCellPLSQL(String rootPath, String baseName, String tabKey
			, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		Iterator<String> iterators= rowCells.keySet().iterator();
		Map<String, Object> map= null;
		try {
			String plsql= "setRoot:"+ rootPath+ ";";
			plsql+= "baseName:"+ baseName+ ";"; 
			plsql+= "tableName:"+ tabKey+ ":insert;";
			while(iterators.hasNext()) {
				String string= iterators.next();
				if(initonEncrypt) {
					plsql+= "culumnValue:"+ string+ ":"
							+ new FullDNATokenPDI().initonSect(rowCells.get(string).replace(":", "@Tin@"))+ ";";
				}else {
					plsql+= "culumnValue:"+ string+ ":"+ rowCells.get(string).replace(":", "@Tin@")+ ";";
				}
			}	
			map= ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	
}