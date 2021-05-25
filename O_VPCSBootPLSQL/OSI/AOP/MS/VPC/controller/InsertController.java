package OSI.AOP.MS.VPC.controller;
import java.util.Map;

import OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDBInsertImpl;
import OSI.OPE.OP.SM.AOP.MEC.SIQ.stable.StableData;
import PEU.P.map.*;
public class InsertController {
	public static String exec(String string, Map<String, String> data) 
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_PATH_INSERT_ROW_BY_BASE_NAME)){
			return VtoV.ObjectToJsonString(RestDBInsertImpl
					.insertRowByBaseName(data.get("baseName")
					, data.get("tableName"), data.get("culumnOfNewRow")
					, data.get("token"), data.get("email")
					, data.get("password"), data.get("auth")));
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_INSERT_ROW_BY_TABLE_PATH)){
			return VtoV.ObjectToJsonString(RestDBInsertImpl
					.insertRowByTablePath(data.get("tablePath")
					, data.get("pageIndex"), data.get("culumnOfNewRow")
					, data.get("token"), data.get("email")
					, data.get("password"), data.get("auth")));
		}
		return StableData.STRING_EMPTY;
	}
}