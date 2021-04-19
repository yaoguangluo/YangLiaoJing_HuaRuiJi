package OSI.OSU.PCS.process.companyImpl;

import java.io.FileNotFoundException;


import java.io.IOException;
import java.util.Date;

import org.json.JSONObject;

import OSI.OSU.PCS.common.utils.StringUtil;
import OSI.OSU.PCS.common.utils.TokenUtil;
import OSI.OSU.PCS.process.factoryImpl.LoginDAOImpl;
import OSI.OSU.PCS.view.Usr;
import OSI.OSU.PCS.view.UsrToken;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//@Service
public class LoginServiceImpl {// implements LoginService {

//	@Autowired
//	private LoginDAO loginDAO;

	public static Usr findUsrByUEmail(String uEmail) throws IOException {
		Usr usr = LoginDAOImpl.selectUsrByUEmail(uEmail);
		return usr;
	}

	public static UsrToken findUsrTokenByUId(Integer uId) throws IOException {
		UsrToken usrToken = LoginDAOImpl.selectUsrTokenByUId(uId);
		return usrToken;
	}

	public static void updateUsrTokenByUId(Integer uId, String key, String uPassword, long uTime) throws IOException {
		LoginDAOImpl.updateUsrTokenByUId(uId, key, uPassword, uTime);
	}

	public static void insertRowByTablePath(String baseName, String tableName, JSONObject jsobj) throws FileNotFoundException, IOException {
		LoginDAOImpl.insertRowByTablePath(baseName, tableName, jsobj);
	}

	public static String checkStatus(String token, String level) throws Exception {
		if (null == token) {
			return "invalid ��Կ��ʧ�����µ�½��";
		}
		String json = StringUtil.decode(token);
		JSONObject js;
		try {
			js = new JSONObject(json);
		}catch(Exception e) {
			return "invalid ��Կ���������µ�½��";
		}
		long uTime = js.getLong("uTime");
		String uPassword = js.getString("mPassword");
		String uEmail = js.getString("uEmail");
		Usr usr = findUsrByUEmail(uEmail);
		UsrToken usrToken = findUsrTokenByUId(usr.getuId());
		String password = TokenUtil.getFirstMD5Password(js.getString("uKey"), usrToken.getuPassword());
		if (!uPassword.equals(password)) {
			return "invalid �������";
		}
		long nowTime = new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid 10���ӳ�ʱ�������µ�½��";
		}
		
		if(level.contains("level")) {
			String uLevel = usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid Ȩ�޲���";
			}
		}
		return "valid";
	}
}