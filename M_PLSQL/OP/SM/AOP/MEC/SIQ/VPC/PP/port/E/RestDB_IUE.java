package OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import org.json.JSONObject;

import MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E;
import OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;

import java.util.HashMap;
import java.util.Map;

public class RestDB_IUE {
	public static Map<String, Object> insertRowByTablePath(String tablePath, String pageIndex
			, String culumnOfNewRow, String token, String email, String password
			, String auth) throws Exception {
		Map<String, Object> output = new HashMap<String, Object>();
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus = LoginService_E.checkTokenStatus(token, "common");
			if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		}else if(email != null && !email.equalsIgnoreCase("")){
			String checkStatus = LoginService_E.checkRightsStatus(email, password, "DB");
			if(checkStatus.contains("invalid")) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		}else{
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}	

		JSONObject jaculumnOfNewRow=new JSONObject(culumnOfNewRow);
		output = IU_Rows_E.insertRowByTablePathAndIndex(tablePath, pageIndex, jaculumnOfNewRow);
		return output;
	}

	public static Map<String, Object> insertRowByBaseName(String baseName, String tableName
			, String culumnOfNewRow, String token, String email, String password
			, String auth) throws Exception {
		Map<String, Object> output = new HashMap<String, Object>();
		String checkStatus = LoginService_E.checkRightsStatus(email, password, "DB");
		if(checkStatus.contains("invalid")) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}

		checkStatus = LoginService_E.checkTokenStatus(token, "common");
		if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}

		JSONObject jaculumnOfNewRow=new JSONObject(culumnOfNewRow);
		output = IU_Rows_E.insertRowByBaseName(baseName, tableName, jaculumnOfNewRow, true);
		return output;
	}
}