package dbPath;

import MSV.PCS.C.RequestFilter_C;
import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import VPC.VQS.DSU.utils.DetaUtil;

public class CreateTable{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB("C:/DBconfig.lyg");
		System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");
		RequestFilter_C.initBlockList();
		System.out.println("----德塔VPCS数据库服务器IP过滤服务启动:成功！");
		MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
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
			ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}