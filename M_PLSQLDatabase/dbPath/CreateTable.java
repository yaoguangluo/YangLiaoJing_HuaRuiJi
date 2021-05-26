package dbPath;

import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import OSI.OPE.MSV.PCS.C.RequestFilterController;
import OSI.OPE.VPC.VQS.DSU.utils.DetaUtil;

public class CreateTable{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB("C:/DBconfig.lyg");
		System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
		RequestFilterController.initBlockList();
		System.out.println("----����VPCS���ݿ������IP���˷�������:�ɹ���");
		OSI.OPE.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager.reflection();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DatabaseLogHall.createBinLogHall();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		//
		String plsql= "setRoot:C:/DetaDB;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:zybc:create;" + 
			   		"culumnName:pk:ID:string;" + 
			   		"culumnName:uk:���:string;" + 
			   		"culumnName:uk:��ҩ����:string;" + 
			   		"culumnName:uk:�ʼ�ԭ��:string;" + 
			   		"culumnName:uk:��Ч:string;" + 
			   		"culumnName:uk:���չ��:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:��ζ:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:��ҽ��ҩ��:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:��Դ:string;" + 
			   		"culumnName:uk:�ް�:string;" + 
			   		"culumnName:uk:����:string;" + 
			   		"culumnName:uk:����ҩ:string;";
		try {
			OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.E.ExecPLSQLImp.ExecPLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}