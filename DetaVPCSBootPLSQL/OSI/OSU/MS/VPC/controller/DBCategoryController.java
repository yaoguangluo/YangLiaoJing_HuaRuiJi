package OSI.OSU.MS.VPC.controller;
import java.util.Map;

import PEU.mapProcessorYLJ.*;
import OSI.OSU.plsql.stable.StableData;
import OSI.OSU.plsql.vpc.process.portImpl.RestControllerPortImpl;
public class DBCategoryController {
	public static String exec(String string, Map<String, String> data) 
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_GET_DB_CATEGORY)){
			return VtoV.ObjectToJsonString(RestControllerPortImpl
					.getDBCategory(data.get(StableData.DB_BASE_NAME)
					, data.get(StableData.LOGIN_TOKEN),data
					.get(StableData.LOGIN_AUTH)));	
		}
		if(string.equalsIgnoreCase(StableData.REST_GET_ALL_DB_CATEGORY)){
			return VtoV.ObjectToJsonString(RestControllerPortImpl
					.getAllDBCategory(data.get(StableData.LOGIN_TOKEN)
					, data.get(StableData.LOGIN_AUTH)));
		}
		return StableData.STRING_EMPTY;
	}
}