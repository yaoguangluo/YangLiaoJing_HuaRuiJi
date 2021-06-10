package OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;


import java.util.HashMap;
import java.util.Map;

import MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E.D_Rows_E;
import OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;

public class RestDB_DE {
	public static Map<String, Object> deleteRowByTablePathAndIndex(String tablePath
			, String pageIndex, String token
			, String email, String password, String auth) throws Exception {
		Map<String, Object> output = new HashMap<String, Object>();
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus = LoginService_E.checkTokenStatus(token, "level");
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
		return D_Rows_E.deleteRowByTablePathAndIndex(tablePath, pageIndex, true);
	}
}