package OSI.AOP.MS.VPC.rest;
import java.io.File;

import java.io.IOException;
import java.util.Map;

import ME.APM.VSQ.App;
import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDBPLSQL_E;
import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestLoginPort_E;
import OP.SM.AOP.MEC.SIQ.stable.StableData;
import OSI.AOP.MS.VPC.C.Config_C;
import OSI.AOP.MS.VPC.C.DBCategory_C;
import OSI.AOP.MS.VPC.C.DC;
import OSI.AOP.MS.VPC.C.IUC;
import OSI.AOP.MS.VPC.C.QC;
import OSI.AOP.MS.VPC.C.UC;
import OSI.AOP.rest.medicine.RestMedicinePort_E;
import PEU.P.map.*;
public class VPC {
	public static String forward(App app, String string, Map<String, String> data)
			throws Exception {
		//controller
		if(string.contains(StableData.REST_PATH_SELECT)){
			return QC.exec(string, data);	
		}
		if(string.contains(StableData.REST_PATH_SETDB)){
			return Config_C.exec(string, data);	
		}
		if(string.contains(StableData.REST_PATH_INSERT)){
			return IUC.exec(string, data);	
		}
		if(string.contains(StableData.REST_PATH_DELETE)){
			return DC.exec(string, data);	
		}
		if(string.contains(StableData.REST_PATH_UPDATE)){
			return UC.exec(string, data);	
		}
		if(string.contains(StableData.REST_PATH_DB_CATEGORY)){
			return DBCategory_C.exec(string, data);	
		}
		//plsql
		if(string.equalsIgnoreCase(StableData.REST_PATH_EXEC_DETA_PLSQL)){
			return VtoV.ObjectToJsonString(RestDBPLSQL_E.restDBPLSQLImpl(data
					.get("token") ,data.get("email"), data.get("password"), data.get("auth")
					, data.get("LYGQuery"), data.get("mod")));
		}	
		//restMap
		if(string.equalsIgnoreCase(StableData.REST_PATH_LOGIN)){
			return VtoV.ObjectToJsonString(RestLoginPort_E.login(data.get("uEmail")
					, data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_FIND)){
			return VtoV.ObjectToJsonString(RestLoginPort_E.find(data.get("uEmail")));
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_LOGOUT)){
			return VtoV.ObjectToJsonString(RestLoginPort_E.logout(data.get("uEmail")
					, data.get("uToken")));
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_REGISTER)){
			return VtoV.ObjectToJsonString(RestLoginPort_E.register(data.get("uEmail")
					, data.get("uEmailEnsure")
					, data.get("uName"), data.get("uPassword"), data.get("uPassWDEnsure")
					, data.get("uAddress")
					, data.get("uPhone"), data.get("uWeChat"), data.get("uQq"), data.get("uAge")
					, data.get("uSex")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_CHANGE)){
			return VtoV.ObjectToJsonString(RestLoginPort_E.change(data.get("uEmail")
					, data.get("uChange")
					, data.get("uChangeEnsure"),data.get("uToken"), data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_CHECK_STATUS)){
			return VtoV.ObjectToJsonString(RestLoginPort_E.checkStatus(data.get("token")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_MEDICINEZY)){
			return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackZY(app, data.get("medicine")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_MEDICINEXY)){
			return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackXY(app, data.get("medicine")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_MEDICINEZT)){
			return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackZT(app, data.get("medicine")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_MEDICINEXT)){
			return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackXT(app, data.get("medicine")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_MEDICINEYT)){
			return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackYT(app, data.get("medicine")));	
		}
		if(string.equalsIgnoreCase(StableData.REST_PATH_SEARCH)){
			return VtoV.ObjectToJsonString(RestMedicinePort_E.doSearch(app, data.get("word")));	
		}
		return StableData.STRING_EMPTY;
	}

	public static String getCode(String filePath) throws IOException{
		if(filePath.contains(StableData.FILE_HTML)||filePath.contains(StableData.FILE_JS)){
			return "UTF-8";
		}
		return "GBK";
	}

	public static String getFilePath(String string) {
		String root = new File("src/main/resources/static").getAbsolutePath().replace("\\", "/");
		if(string.equalsIgnoreCase("")||string.equalsIgnoreCase("/")){
			string = "/index.html";
		}
		return root + string;
	}
	
	
	
	
	
	
}