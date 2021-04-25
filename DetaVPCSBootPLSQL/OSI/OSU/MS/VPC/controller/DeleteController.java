package OSI.OSU.MS.VPC.controller;
import java.util.Map;

import OSI.OSU.plsql.VPC.PP.portImpl.RestDBDeleteImpl;
import OSI.OSU.plsql.stable.StableData;
import PEU.mapProcessor.*;
public class DeleteController {
	public static String exec(String string, Map<String, String> data)
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_PATH_DELETE_ROWS_BY_TABLE_PATH_AND_INDEX)){
			return VtoV.ObjectToJsonString(RestDBDeleteImpl
					.deleteRowByTablePathAndIndex(data.get("tablePath")
					, data.get("pageIndex"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));
		}	
		return StableData.STRING_EMPTY;
	}
}