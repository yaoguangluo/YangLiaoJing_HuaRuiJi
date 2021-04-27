package OSI.AOP.MS.VPC.controller;
import java.util.Map;

import OSI.OSU.OP.SM.AOP.MEC.SIQ.VPC.PP.portImpl.RestDBConfigImpl;
import OSI.OSU.OP.SM.AOP.MEC.SIQ.stable.StableData;
import PEU.P.map.*;
public class ConfigController {
	public static String exec(String string, Map<String, String> data)
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_PATH_SET_DB_PATH)){
			return VtoV.ObjectToJsonString(RestDBConfigImpl.setDBPath(data
					.get("baseName")
					, data.get("baseName"), data.get("baseName")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_SET_DB_TABLE)){
			return VtoV.ObjectToJsonString(RestDBConfigImpl.setDBTable(data
					.get("tableName")
					, data.get("token"), data.get("auth")));	
		}
		return "";
	}
}