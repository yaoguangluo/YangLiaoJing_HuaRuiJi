package dbPath;

import OSI.OPE.MSV.PCS.controller.RequestFilterController;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;
import OSI.OSU.MS.VPC.S.hall.DatabaseLogHall;

public class CreateTable{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB();
		System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");
		RequestFilterController.initBlockList();
		System.out.println("----德塔VPCS数据库服务器IP过滤服务启动:成功！");
		OSI.OSU.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
		//
		String plsql= "setRoot:C:/DetaDB;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:zybc:create;" + 
			   		"culumnName:pk:ID:string;" + 
			   		"culumnName:uk:打分:string;" + 
			   		"culumnName:uk:中药名称:string;" + 
			   		"culumnName:uk:笔记原文:string;" + 
			   		"culumnName:uk:功效:string;" + 
			   		"culumnName:uk:风险规避:string;" + 
			   		"culumnName:uk:用量:string;" + 
			   		"culumnName:uk:性味:string;" + 
			   		"culumnName:uk:经脉:string;" + 
			   		"culumnName:uk:中医馆药理:string;" + 
			   		"culumnName:uk:经解:string;" + 
			   		"culumnName:uk:崇源:string;" + 
			   		"culumnName:uk:愚按:string;" + 
			   		"culumnName:uk:搭配:string;" + 
			   		"culumnName:uk:常见药:string;";
		try {
			OSI.OSU.ME.SM.OP.SM.AOP.MEC.SIQ.imp.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}