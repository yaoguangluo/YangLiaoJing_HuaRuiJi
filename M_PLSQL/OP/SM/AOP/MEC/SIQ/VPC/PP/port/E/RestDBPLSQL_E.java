package OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E;
import OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import PEU.P.md5.*;
//
//baseName:backend;
//tableName:usr:update;
//condition:or:u_id|<|200;
//culumnValue:u_email:77777;
public class RestDBPLSQL_E {
	public static Map<String, Object> restDBPLSQLImpl(String token,
			String email, String password, String auth, String plsql
			, String mod) throws Exception{
		Map<String, Object> output = new HashMap<String, Object>();
		String who = "";
		//security monitor
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus = LoginService_E.checkTokenStatus(token, "common");
			if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
			String json = StringUtil.decode(token);
			JSONObject js = new JSONObject(json);
			who = js.getString("uEmail");
		}else if(email != null && !email.equalsIgnoreCase("")){
			String checkStatus = LoginService_E.checkRightsStatus(email, password, "DB");
			if(checkStatus.contains("invalid")) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
			who = email;
		}else{
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}
		//write monior
		if(plsql.contains("update")||plsql.contains("insert")||plsql.contains("delete")
				||plsql.contains("drop")||plsql.contains("change")||plsql.contains("create")) {
			DatabaseLogHall.writeLogFile(System.currentTimeMillis(), who, plsql);
			try {
				E_PLSQL_E.E_PLSQL(plsql, false);
			}catch(Exception e) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", "invalid plsql");
				return output;
			}
			if(null != mod && mod.equalsIgnoreCase("true")) {
				output = E_PLSQL_E.E_PLSQL(plsql, true);
			}
		}else {
			output = E_PLSQL_E.E_PLSQL(plsql, true);	
		}
		return output;
	}
}