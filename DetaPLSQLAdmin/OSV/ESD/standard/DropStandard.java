package OSV.ESD.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210511
//表剔除操作的例子.
public class DropStandard{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	//	drop samples
	//	tableName:test:drop; 

	public static Map<String, Object> DropCellORM(String rootPath, String baseName
			, String tabKey) throws IOException{
		PLORMInterf orm= new PLORMImpl();
		orm= orm.startAtRootDir(rootPath)
				.withBaseName(baseName)
				.withTableDrop(tabKey);
		return null;
	}	

	public static Map<String, Object> DropCellPLSQL(String rootPath, String baseName
			, String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
			String plsql= "setRoot:"+ rootPath+ ";";
			plsql+= "baseName:"+ baseName+ ";"; 
			plsql+= "tableName:"+ tabKey+ ":drop;";
			map= OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			//准备写回滚
			e1.printStackTrace();
		}
		return map;
	}	
}