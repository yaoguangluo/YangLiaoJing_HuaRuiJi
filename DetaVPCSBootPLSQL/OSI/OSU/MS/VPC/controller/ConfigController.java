package OSI.OSU.MS.VPC.controller;
import java.util.Map;


import OSI.OSU.plsql.stable.StableData;
import PEU.mapProcessor.*;
import OSI.OSU.plsql.VPC.process.portImpl.RestDBConfigImpl;
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