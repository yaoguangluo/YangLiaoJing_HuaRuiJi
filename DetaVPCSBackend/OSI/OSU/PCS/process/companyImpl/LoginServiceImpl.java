package OSI.OSU.PCS.process.companyImpl;

import java.io.FileNotFoundException;


import java.io.IOException;
import java.util.Date;

import org.json.JSONObject;

import OSI.OSU.PCS.process.factoryImpl.LoginDAOImpl;
import OSI.OSU.PCS.view.Usr;
import OSI.OSU.PCS.view.UsrToken;
import OSI.OSU.VPC.common.utils.StringUtil;
import OSI.OSU.VPC.common.utils.TokenUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//@Service
//这个文件是我在3年前 vpc5.0 (我github 没删除,大家看得到 )的 spring 设计文件 进行优化的, 这个文件最后是我设计 lol的后端 应用了, 后来研发vpcs, 去掉了annotation, 就注释了很多spring的文件. 大家都看得到.
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
			return "invalid 锟斤拷钥锟斤拷失锟斤拷锟斤拷锟铰碉拷陆锟斤拷";
		}
		String json = StringUtil.decode(token);
		JSONObject js;
		try {
			js = new JSONObject(json);
		}catch(Exception e) {
			return "invalid 锟斤拷钥锟斤拷锟斤拷锟斤拷锟斤拷锟铰碉拷陆锟斤拷";
		}
		long uTime = js.getLong("uTime");
		String uPassword = js.getString("mPassword");
		String uEmail = js.getString("uEmail");
		Usr usr = findUsrByUEmail(uEmail);
		UsrToken usrToken = findUsrTokenByUId(usr.getuId());
		String password = TokenUtil.getFirstMD5Password(js.getString("uKey"), usrToken.getuPassword());
		if (!uPassword.equals(password)) {
			return "invalid 锟斤拷锟斤拷锟斤拷锟�";
		}
		long nowTime = new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid 10锟斤拷锟接筹拷时锟斤拷锟斤拷锟斤拷锟铰碉拷陆锟斤拷";
		}
		
		if(level.contains("level")) {
			String uLevel = usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid 权锟睫诧拷锟斤拷";
			}
		}
		return "valid";
	}
}