package OSI.AOP.MS.VPC.C;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_UE;
import OP.SM.AOP.MEC.SIQ.stable.StableData;
import PEU.P.map.*;
public class UC {
	public static String exec(String string, Map<String, String> data)
			throws Exception {
		if(string.equalsIgnoreCase(StableData.REST_PATH_UPDATE_ROW_BY_TABLE_PATH_AND_INDEX)){
			return VtoV.ObjectToJsonString(RestDB_UE
					.updateRowByTablePathAndIndex(data.get("tablePath")
							, data.get("pageIndex"), data.get("culumnOfUpdateRow")
							, data.get("token"), data.get("email")
							, data.get("password"), data.get("auth")));
		}
		return StableData.STRING_EMPTY;
	}
}