package OSI.OSU.MS.VPC.controller;
import java.util.Map;

import OSI.OSU.plsql.stable.StableData;
import PEU.mapProcessor.*;
import OSI.OSU.plsql.VPC.process.portImpl.RestDBSelectImpl;
public class SelectController {
	public static String exec(String string, Map<String, String> data) 
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_PATH_SELECT_ROWS_BY_ATTRIBUTE)){
			return VtoV.ObjectToJsonString(RestDBSelectImpl
					.selectRowsByAttribute(data.get("baseName")
					, data.get("tableName"), data.get("culumnName")
					, data.get("value"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));	
		}

		if(string.equalsIgnoreCase(StableData.REST_PATH_SELECT_ROWS_BY_TABLE_PATH)){
			return VtoV.ObjectToJsonString(RestDBSelectImpl
					.selectRowsByTablePath(data.get("tablePath")
					, data.get("pageBegin"), data.get("pageEnd")
					, data.get("direction"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));
		}
		return StableData.STRING_EMPTY;
	}
}