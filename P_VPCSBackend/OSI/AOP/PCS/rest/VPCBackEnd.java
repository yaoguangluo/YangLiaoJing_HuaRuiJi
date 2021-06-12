package OSI.AOP.PCS.rest;
import java.util.Map;

import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OSI.AOP.PCS.PP.port_E.RestLoginPortImpl;
import OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import PCS.VQS.DSU.V.VtoV;
public class VPCBackEnd {
//	public static RestLoginPort restLoginPort;
	public static String forward(EmotionMap emotionMap, A _A, String string, Map<String, String> data) 
			throws Exception {
		if(string.equalsIgnoreCase("/login")){
			return new VtoV().ObjectToJsonString(RestLoginPortImpl.login(data.get("uEmail"),data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase("/find")){
			return new VtoV().ObjectToJsonString(RestLoginPortImpl.find(data.get("uEmail")));
		}
		if(string.equalsIgnoreCase("/logout")){
			return new VtoV().ObjectToJsonString(RestLoginPortImpl.logout(data.get("uEmail"), data.get("uToken")));
		}
		if(string.equalsIgnoreCase("/register")){
			return new VtoV().ObjectToJsonString(RestLoginPortImpl.register(data.get("uEmail")
					, data.get("uEmailEnsure")
					, data.get("uName"), data.get("uPassword"), data.get("uPassWDEnsure"), data.get("uAddress")
					, data.get("uPhone"), data.get("uWeChat"), data.get("uQq"), data.get("uAge"), data.get("uSex")));	
		}
		if(string.equalsIgnoreCase("/change")){
			return new VtoV().ObjectToJsonString(RestLoginPortImpl.change(data.get("uEmail"), data.get("uChange")
					, data.get("uChangeEnsure"),data.get("uToken"), data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase("/checkStatus")){
			return new VtoV().ObjectToJsonString(RestLoginPortImpl.checkStatus(data.get("token")));	
		}
		if(string.equalsIgnoreCase("/dataWS")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataWS(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataCX")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataCX(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataCY")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataCY(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataXL")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataXL(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataRN")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataRN(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataCG")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataCG(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataCJ")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataCJ(emotionMap, _A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataCL")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataCL(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataXX")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataXX(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataHF")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataHF(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataCP")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataCP(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataZF")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataZF(_A, data.get("input")));	
		}
		if(string.equalsIgnoreCase("/dataYL")){
			return new VtoV().ObjectToJsonString(RestNLPPortImpl.dataYL(_A, data.get("input")));	
		}
		return "";
	}
}