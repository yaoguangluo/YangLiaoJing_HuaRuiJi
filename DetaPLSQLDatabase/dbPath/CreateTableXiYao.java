package dbPath;

import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import OSI.OPE.MSV.PCS.controller.RequestFilterController;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;

public class CreateTableXiYao{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB();
		System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");
		RequestFilterController.initBlockList();
		System.out.println("----德塔VPCS数据库服务器IP过滤服务启动:成功！");
		OSI.OPE.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
		//
		String plsql= "setRoot:C:/DetaDB;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:xybg:create;" + 
			   		"culumnName:pk:ID:string;" + 
			   		"culumnName:uk:打分:string;" + 
			   		"culumnName:uk:西药名:string;" + 
			   		"culumnName:uk:介绍:string;" + 
			   		"culumnName:uk:药理:string;" + 
			   		"culumnName:uk:主要成分:string;" + 
			   		"culumnName:uk:用法:string;" + 
			   		"culumnName:uk:注意事项:string;" + 
			   		"culumnName:uk:适应症:string;" + 
			   		"culumnName:uk:不良反应:string;" + 
			   		"culumnName:uk:用量:string;" + 
			   		"culumnName:uk:药物相互作用:string;" + 
			   		"culumnName:uk:其他:string;"; 

		try {
			OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}