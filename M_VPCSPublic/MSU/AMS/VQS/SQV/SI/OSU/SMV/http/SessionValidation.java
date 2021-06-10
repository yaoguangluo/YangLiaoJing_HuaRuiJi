package MSU.AMS.VQS.SQV.SI.OSU.SMV.http;

import java.util.Date;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
import VPC.VQS.DSU.utils.TokenUtil;
//DNA加密设计 罗瑶光
//DNA加密思想 罗瑶光
//Refer <DNA元基编码>, <PDE肽展公式>:  罗瑶光 罗荣武
public class SessionValidation{
	//序列检查, 用于并发条件下又没有缓存服务器额情况下.
	//用户注意, FullDNATokenPDI 是我目的用来做DNA搜索的, 在dna加密这里也可以用, 但是, 如果要用, 请谨慎修改.
	public boolean sessionCheck(Token token, TokenCerts tokenCerts) {
		boolean infix= this.sessionCheckWithOrderPDSKey(token, tokenCerts);
		boolean postfix= this.sessionCheckWithPostPDSKey(token, tokenCerts);
		return infix&& postfix;	
	}

	//序列使用一次便更新重置
	public Token sessionTokenUpdateByDNA(String password) {
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
		Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		return token;
	}

	//序列初始生成
	//可以将密码和时间都加载在这个humanWordsPassword中, 这样时间就不需要比对了.
	//我建议是码农别偷懒.
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword, boolean bys, String lockBys) {
		FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
		//String a= "luoyaoguang";
		//pDE_RNA_FullFormular.encodeDNA(a);
		pDE_RNA_FullFormular.key[0]= 0.6;
		pDE_RNA_FullFormular.key[1]= 0.3;
		pDE_RNA_FullFormular.key[2]= 0.5;
		pDE_RNA_FullFormular.key[3]= 0.632;
		pDE_RNA_FullFormular.text= humanWordsPassword;
		pDE_RNA_FullFormular.pdw= pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
		//		System.out.println("原文: "+ pDE_RNA_FullFormular.text);
		//pDE_RNA_FullFormular.pdw= "字典保密：MSIOCUOCIPCUPCI";
		if(bys) {
			pDE_RNA_FullFormular.lock= lockBys;
		}else {
			String[] lock= new String[12];
			lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
			lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
			lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
			int i= (int)(Math.random()* 12)% 12;
			pDE_RNA_FullFormular.lock+= lock[i];
			i= (int)(Math.random()* 12)% 12;
			pDE_RNA_FullFormular.lock+= lock[i];
			i= (int)(Math.random()* 12)% 12;
			pDE_RNA_FullFormular.lock+= lock[i];
			i= (int)(Math.random()* 12)% 12;
			pDE_RNA_FullFormular.lock+= lock[i];
		}
		for(int i= 0; i< pDE_RNA_FullFormular.pdw.length(); i++) {
			pDE_RNA_FullFormular.code+= pDE_RNA_FullFormular.lock + pDE_RNA_FullFormular.pdw.charAt(i);
		}
		//		System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
		//		System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
		//		System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
		TokenCerts tokenCerts= new TokenCerts();
		tokenCerts.setPdnKey(pDE_RNA_FullFormular.pdw);
		tokenCerts.setPdnLock(pDE_RNA_FullFormular.lock);
		tokenCerts.setPassword(humanWordsPassword);
		tokenCerts.setPdnPassword(pDE_RNA_FullFormular.code);
		return tokenCerts;
	}

	//序列PDI初始生成走非Util函数
	public Token sessionInitByTokenPDICertsDNA(TokenCerts tokenCerts) {
		Token token= new Token();
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		pDE_RNA_Formular.doKeyPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular, false);
		//		System.out.println("静态肽展降元概率钥匙E: "+ pDE_RNA_Formular.pdedeKey);
		//		System.out.println("静态肽展降元概率钥匙S: "+ pDE_RNA_Formular.pdedsKey);
		//		System.out.println("静态肽展降元: "+ pDE_RNA_Formular.pds);
		tokenCerts.setPds(pDE_RNA_Formular.pds);
		token.setUpdsde(pDE_RNA_Formular.pdedeKey);
		token.setUpdsds(pDE_RNA_Formular.pdedsKey);
		token.setUpdsie(pDE_RNA_Formular.pdeieKey);
		token.setUpdsis(pDE_RNA_Formular.pdeisKey);
		//		System.out.println("静态肽展增元概率钥匙E: "+ pDE_RNA_Formular.pdeieKey);
		//		System.out.println("静态肽展增元概率钥匙S: "+ pDE_RNA_Formular.pdeisKey);
		//		System.out.println("静态肽展增元: "+ pDE_RNA_Formular.pde);
		pDE_RNA_Formular.time= "" + System.currentTimeMillis();
		pDE_RNA_Formular.cacheId= "ID" + Math.random() + ":" + Math.random();
		//		System.out.println("时间:  " + pDE_RNA_Formular.time);
		//		System.out.println("账号随机缓存字符串:  " + pDE_RNA_Formular.cacheId);
		pDE_RNA_Formular.session_key= pDE_RNA_Formular.pde;
		//		System.out.println("Session: " + pDE_RNA_Formular.session_key);
		token.setmPassword(pDE_RNA_Formular.pde);
		return token;
	}

	//序列初始生成
	public Token sessionInitByTokenCertsDNA(TokenCerts tokenCerts) {
		String key= "";
		String[] lock= new String[12];
		lock[0]= "A"; lock[3]= "O"; lock[6]= "P"; lock[9]= "M";
		lock[1]= "V"; lock[4]= "E"; lock[7]= "C"; lock[10]= "S";
		lock[2]= "I"; lock[5]= "D"; lock[8]= "U"; lock[11]= "Q";
		//还可以加 TXH, 安全级别更高.
		for(int loop= 0; loop< 4; loop++) {
			int i= (int)(Math.random()* 12)% 12;
			key+= lock[i];
		}
		Token sessiontoken= new Token();//大家注意这个password 是元基, 明文要转化下.
		String dnaPassword= TokenUtil.getFirstDNAPassword(key, tokenCerts.getPdnPassword(), sessiontoken);
		sessiontoken.setuEmail("313699483@qq.com");
		sessiontoken.setuKey(key);
		//下面注意这个时间要和ETC的时区进行时区计算.进行统一.
		//我准备将下面这个时间稍后也同样肽加密, 不然别人改时间一样能用.
		//如果是服务器端的缓存有时间失效设置, 那就可以不考虑.
		sessiontoken.setuTime(new Date().getTime());
		//token.setmPassword(mPassword);
		sessiontoken.setmPassword(dnaPassword);
		return sessiontoken;
	}

	//序列 正序密文检查
	public boolean sessionCheckWithOrderPDSKey(Token token, TokenCerts tokenCerts) {
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		//		System.out.println("Session: "+ token.getmPassword());
		//		System.out.println("=========================================================================================");
		//		System.out.println("开始前序验证：");
		//		System.out.println("开始Session解析："+ token.getmPassword());
		//		System.out.println("开始概率钥匙解析："+ token.getUpdsde()+ token.getUpdsds()+ token.getUpdsie()+ token.getUpdsis());
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		pDE_RNA_Formular1.pdedeKey= token.getUpdsde().toString();
		pDE_RNA_Formular1.pdedsKey= token.getUpdsds().toString();
		pDE_RNA_Formular1.pdeieKey= token.getUpdsie().toString();
		pDE_RNA_Formular1.pdeisKey= token.getUpdsis().toString();
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		//		System.out.println("得到原降元元基DNA序列："+ pDE_RNA_Formular.pds);
		//		System.out.println("得到新降元元基DNA序列："+ pDE_RNA_Formular1.pds);
		//		System.out.println("得到原元基DNA序列："+ pDE_RNA_Formular.pde);
		//		System.out.println("得到新元基DNA序列："+ pDE_RNA_Formular1.pde);
		return pDE_RNA_Formular1.pde.equalsIgnoreCase(token.getmPassword())? true: false;
	}

	//序列 反序密文检查
	public boolean sessionCheckWithPostPDSKey(Token token, TokenCerts tokenCerts) {
		//		System.out.println("=========================================================================================");
		//		System.out.println("开始后序验证：");
		TokenPDI pDE_RNA_Formular2= new TokenPDI();
		pDE_RNA_Formular2.pdeieKey= token.getUpdsde().toString();
		pDE_RNA_Formular2.pdeisKey= token.getUpdsds().toString();
		pDE_RNA_Formular2.pdedeKey= token.getUpdsie().toString();
		pDE_RNA_Formular2.pdedsKey= token.getUpdsis().toString();
		//		System.out.println("准备计算元基DNA序列："+ token.getmPassword());
		pDE_RNA_Formular2.doSessionKeyUnPress(token.getmPassword(), pDE_RNA_Formular2, true);
		//		System.out.println("得到原续降元元基DNA序列："+ tokenCerts.getPds());
		//		System.out.println("得到后续降元元基DNA序列："+ pDE_RNA_Formular2.pds);
		//		System.out.println("验证正确？");
		System.out.println(tokenCerts.getPds().equals(pDE_RNA_Formular2.pds)? "正确": "失败");
		return tokenCerts.getPds().equals(pDE_RNA_Formular2.pds)? true: false;	
	}

	//写个main函数测试下
	public static void main(String[] argv) {
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA("控制吸收", false, null);
		Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		sessionValidation.sessionCheck(token, tokenCerts);

	}
}