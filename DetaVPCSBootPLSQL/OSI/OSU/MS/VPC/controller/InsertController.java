package OSI.OSU.MS.VPC.controller;
import java.util.Map;
import PEU.mapProcessorYLJ.*;
import OSI.OSU.plsql.stable.StableData;
import OSI.OSU.plsql.VPC.process.portImpl.RestDBInsertImpl;
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