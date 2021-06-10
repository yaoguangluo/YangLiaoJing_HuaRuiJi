package test.update;

import MSV.PCS.C.RequestFilter_C;
import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import OSV.ESU.standard.U_CellStandard;
import VPC.VQS.DSU.utils.DetaDBUtil;
import VPC.VQS.DSU.utils.DetaUtil;

public class TestUpdatePLSQL{
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
		DetaDBUtil.initCulumnNameType();
		//
		//String tabKey, String rowId, String cellName, String cellValue
		//UpdateCellStandard.UpdateCellPLSQL("gjjd", "5", "书名", "222");
		U_CellStandard.UpdateCellORM("gjjd", "5", "书名", "222");
	}
}