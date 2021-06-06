package OSI.AOP.MS.VPC.controller;
import java.util.Map;

import OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_D_Impl;
import OSI.OPE.OP.SM.AOP.MEC.SIQ.stable.StableData;
import PEU.P.map.*;
public class DeleteController {
	public static String exec(String string, Map<String, String> data)
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_PATH_DELETE_ROWS_BY_TABLE_PATH_AND_INDEX)){
			return VtoV.ObjectToJsonString(RestDB_D_Impl
					.deleteRowByTablePathAndIndex(data.get("tablePath")
					, data.get("pageIndex"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));
		}	
		return StableData.STRING_EMPTY;
	}
}