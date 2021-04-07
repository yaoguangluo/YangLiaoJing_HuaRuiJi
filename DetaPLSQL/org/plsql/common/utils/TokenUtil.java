package org.plsql.common.utils;

import java.util.Date;

import md5Processor.Token;
import md5Processor.Usr;
import md5Processor.UsrToken;

public class TokenUtil {
	//引用了中科大的筛子非对称加密论文思想，这里标注下.  ~20180701
	//今天已经全部替换为罗瑶光先生的肽元基计算加密思想。20200103~。
	public static Token getNewTokenFromUsrAndUsrToken(Usr usr, UsrToken usrToken) throws Exception {
		//String key = String.valueOf(Double.valueOf(Math.random() * 10000000).intValue());
		//String mPassword = TokenUtil.getFirstMD5Password(key, usrToken.getuPassword());
		//替换如下：
		
		String key= "";
		String[] lock= new String[12];
        lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
        lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
        lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
        for(int loop= 0; loop< 4; loop++) {
        	int i= (int)(Math.random()* 12)% 12;
            key+= lock[i];
        }
        Token token = new Token();
		String dnaPassword = TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword(), token);
		token.setuEmail(usr.getuEmail());
		token.setuKey(key);
		token.setuTime(new Date().getTime());
		//token.setmPassword(mPassword);
		token.setmPassword(dnaPassword);
		return token;
	}
	public static String getSecondMD5Password(String uPassword) throws Exception {
		return StringUtil.EncoderByMd5("Author:Yaoguang Luo", uPassword, 8);
	}
	public static String getFirstMD5Password(String key, String uPassword) throws Exception {
		return StringUtil.EncoderByMd5(key, uPassword, 8);
	}
	public static String getFirstDNAPassword(String key, String uPassword, Token token) {
		return StringUtil.EncoderByDNA(key, uPassword, token);
	}
}