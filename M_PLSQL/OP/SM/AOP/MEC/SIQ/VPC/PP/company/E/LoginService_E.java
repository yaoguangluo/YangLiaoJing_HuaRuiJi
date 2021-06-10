package OP.SM.AOP.MEC.SIQ.VPC.PP.company.E;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import org.json.JSONObject;

import OP.SM.AOP.MEC.SIQ.VPC.PP.factory.E.LoginDAO_E;
import PEU.P.dna.Token;
import PEU.P.md5.*;
import VPC.VQS.DSU.utils.StringUtil;
import VPC.VQS.DSU.utils.TokenUtil;
public class LoginService_E {

	//	@Autowired
	//	private LoginDAO loginDAO;

	public static Usr findUsrByUEmail(String uEmail) throws IOException {
		Usr usr = LoginDAO_E.selectUsrByUEmail(uEmail);
		return usr;
	}

	public static UsrToken findUsrTokenByUId(Integer uId) throws IOException {
		UsrToken usrToken = LoginDAO_E.selectUsrTokenByUId(uId);
		return usrToken;
	}

	public static void updateUsrTokenByUId(Integer uId, String key
			, String uPassword, long uTime) throws IOException {
		LoginDAO_E.updateUsrTokenByUId(uId, key, uPassword, uTime);
	}

	public static void insertRowByTablePath(String baseName, String tableName
			, JSONObject jsobj) throws Exception {
		LoginDAO_E.insertRowByTablePath(baseName, tableName, jsobj);
	}

	public static String checkTokenStatus(String token, String level) throws Exception {
		if (null == token) {
			return "invalid 秘钥丢失请重新登陆。";
		}
		String json = StringUtil.decode(token);
		JSONObject js;
		try {
			js = new JSONObject(json);
		}catch(Exception e) {
			return "invalid 秘钥错误请重新登陆。";
		}
		long uTime = js.getLong("uTime");
		String uPassword = js.getString("mPassword");
		String uEmail = js.getString("uEmail");
		Usr usr = findUsrByUEmail(uEmail);
		UsrToken usrToken = findUsrTokenByUId(usr.getuId());

		//下面用DNA 替换了下, 之后进行组件测试.
		String key= "";
		String[] lock= new String[12];
		lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
		lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
		lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
		for(int loop= 0; loop< 4; loop++) {
			int i= (int)(Math.random()* 12)% 12;
			key+= lock[i];
		}
		Token sessiontoken = new Token();
		js.put("uKey", key);
		String dnaPassword = TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword(), sessiontoken);
		sessiontoken.setuEmail(usr.getuEmail());
		sessiontoken.setuKey(key);
		sessiontoken.setuTime(new Date().getTime());
		//token.setmPassword(mPassword);
		sessiontoken.setmPassword(dnaPassword);

		//String password = TokenUtil.getFirstMD5Password(js.getString("uKey"), usrToken.getuPassword());
		//if (!uPassword.equals(password)) {
		if (!uPassword.equals(dnaPassword)) {
			return "invalid 密码错误。";
		}
		long nowTime = new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid 10分钟超时，请重新登陆。";
		}

		if(level.contains("level")) {
			String uLevel = usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid 权限不够";
			}
		}
		return "valid";
	}

	public static String checkRightsStatus(String inEmail, String inPassword
			, String level) throws Exception {
		if (null == inEmail) {
			return "invalid 秘钥丢失请重新登陆。";
		}
		//String uPassword = inPassword;
		String uEmail = inEmail;
		Usr usr = findUsrByUEmail(uEmail);
		//UsrToken usrToken = this.findUsrTokenByUId(usr.getuId());



		//下面用DNA 替换了下, 之后进行组件测试.
		String key= "";
		String[] lock= new String[12];
		lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
		lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
		lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
		for(int loop= 0; loop< 4; loop++) {
			int i= (int)(Math.random()* 12)% 12;
			key+= lock[i];
		}
		Token sessiontoken = new Token();
		String dnaPassword = TokenUtil.getFirstDNAPassword(key, inPassword, sessiontoken);
		sessiontoken.setuEmail(usr.getuEmail());
		sessiontoken.setuKey(key);
		sessiontoken.setuTime(new Date().getTime());
		//token.setmPassword(mPassword);
		sessiontoken.setmPassword(dnaPassword);


		//String password = TokenUtil.getSecondMD5Password(inPassword);
		//if (!usr.getuPassword().equals(password)) {
		if (!usr.getuPassword().equals(dnaPassword)) {
			return "invalid 密码错误。";
		}
		return "valid";
	}

	public static String checkTokenStatusAndGetLevel(String token, String level
			, Map<String, Object> output) throws Exception {
		if (null == token || token.equalsIgnoreCase("undefined")) {
			return "invalid 秘钥丢失请重新登陆。";
		}
		String json = StringUtil.decode(token);
		JSONObject js;
		try {
			js = new JSONObject(json);
		}catch(Exception e) {
			return "invalid 秘钥错误请重新登陆。";
		}
		long uTime = js.getLong("uTime");
		String uPassword = js.getString("mPassword");
		String uEmail = js.getString("uEmail");
		Usr usr = findUsrByUEmail(uEmail);
		UsrToken usrToken = findUsrTokenByUId(usr.getuId());
		//String password = TokenUtil.getFirstMD5Password(js.getString("uKey")
		//		, usrToken.getuPassword());


		//下面用DNA 替换了下, 之后进行组件测试.
		String key= "";
		String[] lock= new String[12];
		lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
		lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
		lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
		for(int loop= 0; loop< 4; loop++) {
			int i= (int)(Math.random()* 12)% 12;
			key+= lock[i];
		}
		Token sessiontoken = new Token();
		js.put("uKey", key);
		String dnaPassword = TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword(), sessiontoken);
		sessiontoken.setuEmail(usr.getuEmail());
		sessiontoken.setuKey(key);
		sessiontoken.setuTime(new Date().getTime());
		//token.setmPassword(mPassword);
		sessiontoken.setmPassword(dnaPassword);



		//if (!uPassword.equals(password)) {
		if (!uPassword.equals(dnaPassword)) {
			return "invalid 密码错误。";
		}
		long nowTime = new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid 10分钟超时，请重新登陆。";
		}

		if(level.contains("level")) {
			String uLevel = usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid 权限不够";
			}
		}
		output.put("usrName", "咨询专家" + usr.getuId());
		return "valid" + usrToken.getuLevel();
	}
}