package OSI.OSU.VPC.common.utils;

import java.util.Date;

import OSI.OSU.VPC.view.Token;

public class TokenUtil {
	public static Token getNewTokenFromUsrAndUsrToken(md5Processor.Usr usr, md5Processor.UsrToken usrToken) throws Exception {
		String key = String.valueOf(Double.valueOf(Math.random() * 10000000).intValue());
		String mPassword = TokenUtil.getFirstMD5Password(key, usrToken.getuPassword());
		Token token = new Token();
		token.setuEmail(usr.getuEmail());
		token.setuKey(key);
		token.setuTime(new Date().getTime());
		token.setmPassword(mPassword);
		return token;
	}

	public static String getSecondMD5Password(String uPassword) throws Exception {
		return StringUtil.EncoderByMd5("Author:Yaoguang Luo", uPassword, 8);
	}
	public static String getFirstMD5Password(String key, String uPassword) throws Exception {
		return StringUtil.EncoderByMd5(key, uPassword, 8);
	}
}