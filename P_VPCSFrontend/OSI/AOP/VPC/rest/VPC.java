package OSI.AOP.VPC.rest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import ME.APM.VSQ.App;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.AOP.VPC.PP.portImpl.RestAskPortImpl;
import OSI.AOP.VPC.PP.portImpl.RestLoginPortImpl;
import OSI.AOP.VPC.controller.ConfigController;
import OSI.AOP.VPC.controller.DBCategoryController;
import OSI.AOP.VPC.controller.DeleteController;
import OSI.AOP.VPC.controller.InsertController;
import OSI.AOP.VPC.controller.SelectController;
import OSI.AOP.VPC.controller.UpdateController;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.dna.TokenCerts;
import PEU.P.map.*;
public class VPC {
	public static String forward(App app, String string, Map<String, String> data) throws Exception {
		//养疗经的DNA加密展示 全局检查密钥 调试已经成功,.
		@SuppressWarnings("unused")
		String id= data.get("id");
		
		String password= data.get("password");
		String de= data.get("de");
		String ds= data.get("ds");
		String ie= data.get("ie");
		String is= data.get("is");
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		TokenPDI pDE_RNA_Formular2= new TokenPDI();
		pDE_RNA_Formular2.pdeieKey= de;
		pDE_RNA_Formular2.pdeisKey= ds;
		pDE_RNA_Formular2.pdedeKey= ie;
		pDE_RNA_Formular2.pdedsKey= is;
//		System.out.println("准备计算元基DNA序列："+ token.getmPassword());
		pDE_RNA_Formular2.doSessionKeyUnPress(password, pDE_RNA_Formular2, true);
		System.out.println("pds--2>"+ pDE_RNA_Formular2.pds);
		
		@SuppressWarnings("unused")
		String DB_id= "313699483@qq.com";
		
		//String DB_id= id;
		//模拟本地数据库计算DB_password 在数据库user表中通过DB_id 来获取. 大家好理解吧. 
		String DB_password= "fengyue1985";
		
		String lock= data.get("lock");//也可已放数据表中.不在rest里面发送.
		//DB_password to lock DB
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(DB_password, true, lock);
		pDE_RNA_Formular1.pdedeKey= de;
		pDE_RNA_Formular1.pdedsKey= ds;
		pDE_RNA_Formular1.pdeieKey= ie;
		pDE_RNA_Formular1.pdeisKey= is;
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		System.out.println("pds--3>"+ pDE_RNA_Formular1.pds);
		//开始比对
		if(!pDE_RNA_Formular1.pde.equalsIgnoreCase(password)? true: false) {
			return "";
			//成功就放下走,不成功就返回了失败.
			//以后有时间我包装成完美的 DNA VPCS 包。优先级降低。
			//罗瑶光 20210422
		}
		//controller
		if(string.contains("/select")){
			return SelectController.exec(string, data);	
		}
		if(string.contains("/setDB")){
			return ConfigController.exec(string, data);	
		}
		if(string.contains("/insert")){
			return InsertController.exec(string, data);	
		}
		if(string.contains("/delete")){
			return DeleteController.exec(string, data);	
		}
		if(string.contains("/update")){
			return UpdateController.exec(string, data);	
		}
		if(string.contains("DBCategory")){
			return DBCategoryController.exec(string, data);	
		}
		//restMap
		if(string.equalsIgnoreCase("/login")){
			return VtoV.ObjectToJsonString(RestLoginPortImpl.login(data.get("uEmail"),data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase("/find")){
			return VtoV.ObjectToJsonString(RestLoginPortImpl.find(data.get("uEmail")));
		}
		if(string.equalsIgnoreCase("/logout")){
			return VtoV.ObjectToJsonString(RestLoginPortImpl.logout(data.get("uEmail"), data.get("uToken")));
		}
		if(string.equalsIgnoreCase("/register")){
			return VtoV.ObjectToJsonString(RestLoginPortImpl.register(data.get("uEmail"), data.get("uEmailEnsure")
					, data.get("uName"), data.get("uPassword"), data.get("uPassWDEnsure"), data.get("uAddress")
					, data.get("uPhone"), data.get("uWeChat"), data.get("uQq"), data.get("uAge"), data.get("uSex")));	
		}
		if(string.equalsIgnoreCase("/change")){
			return VtoV.ObjectToJsonString(RestLoginPortImpl.change(data.get("uEmail"), data.get("uChange")
					, data.get("uChangeEnsure"),data.get("uToken"), data.get("uPassword")));	
		}
//		if(string.equalsIgnoreCase("/checkStatus")){
//			return VtoV.ObjectToJsonString(RestLoginPortImpl.checkStatus(data.get("token")));	
//		}
		if(string.equalsIgnoreCase("/ask")){
			return VtoV.ObjectToJsonString(RestAskPortImpl.ask(data.get("ip"), data.get("token")
					, data.get("message"), data.get("pointIp")));
		}
		if(string.equalsIgnoreCase("/feedBack")){
			return VtoV.ObjectToJsonString(RestAskPortImpl.feedBack(data.get("ip"), data.get("token")
					, data.get("pointIp")));
		}
		if(string.equalsIgnoreCase("/getAskers")){
			return VtoV.ObjectToJsonString(RestAskPortImpl.getAskers(data.get("token")));
		}	
		if(string.equalsIgnoreCase("/dataWS")){
			return RestAskPortImpl.dataWS(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCX")){
			return RestAskPortImpl.dataCX(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCY")){
			return RestAskPortImpl.dataCY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXL")){
			return RestAskPortImpl.dataXL(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataRN")){
			return RestAskPortImpl.dataRN(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCG")){
			return RestAskPortImpl.dataCG(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCJ")){
			return RestAskPortImpl.dataCJ(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCL")){
			return RestAskPortImpl.dataCL(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXX")){
			return RestAskPortImpl.dataXX(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataHF")){
			return RestAskPortImpl.dataHF(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCP")){
			return RestAskPortImpl.dataCP(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZF")){
			return RestAskPortImpl.dataZF(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZY")){
			return RestAskPortImpl.dataZY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXY")){
			return RestAskPortImpl.dataXY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataYT")){
			return RestAskPortImpl.dataYT(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZT")){
			return RestAskPortImpl.dataZT(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXT")){
			return RestAskPortImpl.dataXT(data.get("message"));
		}	
		return "";
	}

	public static String getCode(String filePath) throws IOException{
		if(filePath.contains(".html")||filePath.contains(".js")){
			return "UTF-8";
		}
		return "GBK";
	}

	public static String getFilePath(String string) {
		String root = new File("src/main/resources/static").getAbsolutePath().replace("\\", "/");
		if(null==string||string.equalsIgnoreCase("")||string.equalsIgnoreCase("/")){
			string = "/index.html";
		}
		return root + string;
	}
}