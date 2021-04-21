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
import dnaProcessor.Token;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//这个文件是我在3年前vpc5.0(我github 没删除,大家看得到)的spring设计文件 进行优化的, 这个文件最后是我设计lol的后端 应用了, 后来研发vpcs, 去掉了annotation, 就注释了很多spring的文件. 大家都看得到.

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
			return "invalid ..";
		}
		String json = StringUtil.decode(token);
		JSONObject js;
		try {
			js = new JSONObject(json);
		}catch(Exception e) {
			return "invalid ..";
		}
		long uTime = js.getLong("uTime");
		String uPassword = js.getString("mPassword");
		String uEmail = js.getString("uEmail");
		
		
		Usr usr = findUsrByUEmail(uEmail);
		UsrToken usrToken = findUsrTokenByUId(usr.getuId());
		//String password = TokenUtil.getFirstMD5Password(js.getString("uKey"), usrToken.getuPassword());
		
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
		//return sessiontoken
		//if (!uPassword.equals(password)) {
		if (!uPassword.equals(dnaPassword)) {
			return "invalid ..";
		}
		long nowTime = new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid 10..";
		}
		
		if(level.contains("level")) {
			String uLevel = usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid ..";
			}
		}
		return "valid";
	}
}