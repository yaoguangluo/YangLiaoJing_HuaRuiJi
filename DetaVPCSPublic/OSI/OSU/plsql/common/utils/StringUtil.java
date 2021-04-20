package OSI.OSU.plsql.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.catalytic.procedure.pde.TokenPDI;
import md5Processor.Token;

public class StringUtil {
	public static String encode(String input) throws Exception {
		String result = Base64.getEncoder().encodeToString(input.getBytes("UTF-8"));
		return result;
	}

	public static String decode(String str) throws UnsupportedEncodingException {
		if(str.equalsIgnoreCase("undefined")) {
			return str;
		}else {
			return new String(Base64.getMimeDecoder().decode(str), "UTF-8");
		}
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

	public static String EncoderByDNA(String key, String uPassword, Token token) {
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		@SuppressWarnings("unused")
		String initonKeys= "EIU/0.6/EDU/0.4/si/0.3/sq/0.7/EIU/0.5/EDU/0.5/si/0.632/sq/0.368";
		pDE_RNA_Formular.key[0]= 0.6;
		pDE_RNA_Formular.key[1]= 0.3;
		pDE_RNA_Formular.key[2]= 0.5;
		pDE_RNA_Formular.key[3]= 0.632;

		pDE_RNA_Formular.text= uPassword;
		System.out.println("Ô­ÎÄ: " + pDE_RNA_Formular.text);
		pDE_RNA_Formular.pdw= pDE_RNA_Formular.initonSect(key);
		for(int i= 0; i< pDE_RNA_Formular.pdw.length(); i++) {
			pDE_RNA_Formular.code+= pDE_RNA_Formular.lock + pDE_RNA_Formular.pdw.charAt(i);
		}
		System.out.println("ëÄÓï: " + pDE_RNA_Formular.pdw);
		System.out.println("ëÄËø: " + key);
		System.out.println("É¢ÁÐëÄÓï: ±£ÃÜ" );
		pDE_RNA_Formular.bys= "0.6/0.3/0.5/0.632";
		System.out.println("¾²Ì¬ÃÜÔ¿: " + pDE_RNA_Formular.bys);
		pDE_RNA_Formular.doKeyPress(pDE_RNA_Formular.code, pDE_RNA_Formular, false);
		token.setUpdsde( pDE_RNA_Formular.pdedeKey);
		token.setUpdsds( pDE_RNA_Formular.pdedsKey);
		token.setUpdsie( pDE_RNA_Formular.pdeieKey);
		token.setUpdsis( pDE_RNA_Formular.pdeisKey);
		pDE_RNA_Formular.time= "" + System.currentTimeMillis();
		pDE_RNA_Formular.cacheId= "ID" + Math.random() + ":" + Math.random();
		System.out.println("Ê±¼ä:  " + pDE_RNA_Formular.time);
		System.out.println("ÕËºÅËæ»ú»º´æ×Ö·û´®:  " + pDE_RNA_Formular.cacheId);
		pDE_RNA_Formular.session_key= pDE_RNA_Formular.pde;
		System.out.println("Session: " + pDE_RNA_Formular.session_key);
		return pDE_RNA_Formular.session_key;
	}
}
