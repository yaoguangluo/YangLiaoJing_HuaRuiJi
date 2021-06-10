package OSI.AOP.MS.VPC.C;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_QE;
import OP.SM.AOP.MEC.SIQ.stable.StableData;
import PEU.P.map.*;
public class QC {
	public static String exec(String string, Map<String, String> data) 
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_PATH_SELECT_ROWS_BY_ATTRIBUTE)){
			return VtoV.ObjectToJsonString(RestDB_QE
					.selectRowsByAttribute(data.get("baseName")
					, data.get("tableName"), data.get("culumnName")
					, data.get("value"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));	
		}

		if(string.equalsIgnoreCase(StableData.REST_PATH_SELECT_ROWS_BY_TABLE_PATH)){
			return VtoV.ObjectToJsonString(RestDB_QE
					.selectRowsByTablePath(data.get("tablePath")
					, data.get("pageBegin"), data.get("pageEnd")
					, data.get("direction"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));
		}
		return StableData.STRING_EMPTY;
	}
}