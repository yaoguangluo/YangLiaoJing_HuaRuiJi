package VPC.VQS.DSU.utils;

import java.util.Date;

import PEU.P.dna.Token;
import PEU.P.md5.*;

public class TokenUtil {
//	public static Token getNewTokenFromUsrAndUsrToken(md5Processor.Usr usr, md5Processor.UsrToken usrToken) throws Exception {
//		String key = String.valueOf(Double.valueOf(Math.random() * 10000000).intValue());
//		String mPassword = TokenUtil.getFirstMD5Password(key, usrToken.getuPassword());
//		Token token = new Token();
//		token.setuEmail(usr.getuEmail());
//		token.setuKey(key);
//		token.setuTime(new Date().getTime());
//		token.setmPassword(mPassword);
//		return token;
//	}
//
//	public static String getSecondMD5Password(String uPassword) throws Exception {
//		return StringUtil.EncoderByMd5("Author:Yaoguang Luo", uPassword, 8);
//	}
//	public static String getFirstMD5Password(String key, String uPassword) throws Exception {
//		return StringUtil.EncoderByMd5(key, uPassword, 8);
//	}
	//等下把上面的3个MD5涉及的工程所有文件 整体替换为 下面的DNA加密
	//罗瑶光
	public static String getFirstDNAPassword(String key, String uPassword, Token token) {
		return StringUtil.EncoderByDNA(key, uPassword, token);
	}
	
	public static Token getNewTokenFromUsrAndUsrTokenByDNA(Usr usr, UsrToken usrToken) throws Exception {
		String key= "";
		String[] lock= new String[12];
        lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
        lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
        lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
        for(int loop= 0; loop< 4; loop++) {
        	int i= (int)(Math.random()* 12)% 12;
            key+= lock[i];
        }
        Token token= new Token();
		String dnaPassword= TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword(), token);
		token.setuEmail(usr.getuEmail());
		token.setuKey(key);
		token.setuTime(new Date().getTime());
		//token.setmPassword(mPassword);
		token.setmPassword(dnaPassword);
		return token;
	}
}