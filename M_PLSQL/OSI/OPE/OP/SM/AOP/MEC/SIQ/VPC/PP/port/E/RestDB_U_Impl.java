package OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import org.json.JSONObject;

import OSI.OPE.MSU.OP.SM.AOP.MEC.SIQ.SM.update.E.U_RowsImp;
import OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class RestDB_U_Impl {
	public static Map<String, Object> updateRowByTablePathAndIndex(String tablePath
			, String pageIndex,String culumnOfUpdateRow, String token, String email
			, String password, String auth) throws Exception {
		Map<String, Object> output = new HashMap<String, Object>();
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus = LoginServiceImpl.checkTokenStatus(token, "level");
			if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		}else if(email != null && !email.equalsIgnoreCase("")){
			String checkStatus = LoginServiceImpl.checkRightsStatus(email, password, "DB");
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
		JSONObject jaculumnOfUpdateRow = new JSONObject(culumnOfUpdateRow);
		return U_RowsImp.updateRowByTablePathAndIndex(tablePath, pageIndex, jaculumnOfUpdateRow);
	}
}