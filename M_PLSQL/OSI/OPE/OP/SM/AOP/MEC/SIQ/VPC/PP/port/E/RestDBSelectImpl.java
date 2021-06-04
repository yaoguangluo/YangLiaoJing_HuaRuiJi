package OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;
import OSI.OPE.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.Q_RowsImp;
import OSI.OPE.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class RestDBSelectImpl {
	public static Map<String, Object> selectRowsByAttribute(String baseName,
			String tableName, String culumnName, String value, String token,
			String email, String password, String auth) throws Exception{
		Map<String, Object> output = new HashMap<String, Object>();
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus = LoginServiceImpl.checkTokenStatus(token, "common");
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
		output.put("obj", Q_RowsImp.selectRowsByAttribute(baseName, tableName, culumnName, value));
		return output;
	}

	public static Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction
			, String token, String email, String password, String auth) throws Exception {
		Map<String, Object> output = new HashMap<String, Object>();
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus = LoginServiceImpl.checkTokenStatus(token, "common");
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

		//		if(CacheManager.getCacheInfo(tablePath + ":" + pageBegin + ":" + pageEnd 
		//+ ":" + direction) != null) {
		//			output = (Map<String, Object>)(CacheManager.getCacheInfo(tablePath 
		//+ ":" + pageBegin + ":" + pageEnd + ":" + direction).getValue());
		//			return output;
		//		} 
		output = Q_RowsImp.selectRowsByTablePath(tablePath, pageBegin, pageEnd, direction);
		//		if(tablePath.equalsIgnoreCase("c:/DetaDB/frontend/login")) {
		//			Cache c = new Cache();
		//			c.setValue(output);
		//			CacheManager.putCache(tablePath + ":" + pageBegin + ":" + pageEnd + ":" + direction, c);
		//		}
		return output;
	}
}