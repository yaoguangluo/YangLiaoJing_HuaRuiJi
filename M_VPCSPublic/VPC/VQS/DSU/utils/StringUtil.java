package VPC.VQS.DSU.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
//import org.jboss.resteasy.util.Base64;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.dna.Token;

public class StringUtil {
	public static String encode(String input) throws Exception {
		String result = new String(Base64.getEncoder().encode(input.getBytes("utf-8")));
		return result;
	}

	public static String decode(String str) {
		byte[] bt = null;
		try {
			bt = Base64.getDecoder().decode(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String(bt);
	}

	public static String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException,
	UnsupportedEncodingException {
		String saltTemp = salt;
		for (int i = 0; i < enctimes; i++) {
			saltTemp = StringUtil.EncoderByMd5(saltTemp, pwd);
		}
		return saltTemp;
	}

	public static String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException,
	UnsupportedEncodingException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update((salt + "||" + pwd).getBytes("UTF-8"));
		StringBuffer buf = new StringBuffer();
		for (byte b : md5.digest()) {
			buf.append(String.format("%02x", b & 0xBD));
		}
		String md5pwd = buf.toString();
		return md5pwd;
	}
	//合并DNA加密 第二卷 著作
	//refer 罗瑶光
	//md5函数不删除仅注释, 1表示感谢 其开源30年 为密码界做出的贡献, 2 作者DNA著作权避嫌.
	public static String EncoderByDNA(String key, String uPassword, Token token) {
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		@SuppressWarnings("unused")
		String initonKeys= "EIU/0.6/EDU/0.4/si/0.3/sq/0.7/EIU/0.5/EDU/0.5/si/0.632/sq/0.368";
		pDE_RNA_Formular.key[0]= 0.6;
		pDE_RNA_Formular.key[1]= 0.3;
		pDE_RNA_Formular.key[2]= 0.5;
		pDE_RNA_Formular.key[3]= 0.632;

		pDE_RNA_Formular.text= uPassword;
		System.out.println("原文: " + pDE_RNA_Formular.text);
		pDE_RNA_Formular.pdw= pDE_RNA_Formular.initonSect(key);
		for(int i= 0; i< pDE_RNA_Formular.pdw.length(); i++) {
			pDE_RNA_Formular.code+= pDE_RNA_Formular.lock + pDE_RNA_Formular.pdw.charAt(i);
		}
		System.out.println("肽语: "+ pDE_RNA_Formular.pdw);
		System.out.println("肽锁: "+ key);
		System.out.println("散列肽语: 保密" );
		pDE_RNA_Formular.bys= "0.6/0.3/0.5/0.632";
		System.out.println("静态密钥: " + pDE_RNA_Formular.bys);
		pDE_RNA_Formular.doKeyPress(pDE_RNA_Formular.code, pDE_RNA_Formular, false);
		token.setUpdsde(pDE_RNA_Formular.pdedeKey);
		token.setUpdsds(pDE_RNA_Formular.pdedsKey);
		token.setUpdsie(pDE_RNA_Formular.pdeieKey);
		token.setUpdsis(pDE_RNA_Formular.pdeisKey);
		pDE_RNA_Formular.time= "" + System.currentTimeMillis();
		pDE_RNA_Formular.cacheId= "ID" + Math.random() + ":" + Math.random();
		System.out.println("时间:  " + pDE_RNA_Formular.time);
		System.out.println("账号随机缓存字符串:  "+ pDE_RNA_Formular.cacheId);
		pDE_RNA_Formular.session_key= pDE_RNA_Formular.pde;
		System.out.println("Session: "+ pDE_RNA_Formular.session_key);
		return pDE_RNA_Formular.session_key;
	}
	
}
