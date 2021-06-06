package dbPath;

import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import OSI.OPE.MSV.PCS.C.RequestFilter_C;
import OSI.OPE.VPC.VQS.DSU.utils.DetaDBUtil;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;

public class CreateTableGuJiJingDian{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB("C:/DBconfig.lyg");
		System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");
		RequestFilter_C.initBlockList();
		System.out.println("----德塔VPCS数据库服务器IP过滤服务启动:成功！");
		OSI.OPE.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
		DetaDBUtil.initCulumnNameType();
		//
		String plsql= "setRoot:C:/DetaDB1;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:gjjd:create;"+ 
			   		"culumnName:pk:ID:string;"+ 
			   		"culumnName:uk:打分:string;"+ 
			   		"culumnName:uk:书名:string;"+ 
			   		"culumnName:uk:段落:string;";
		try {
			OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.E.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}