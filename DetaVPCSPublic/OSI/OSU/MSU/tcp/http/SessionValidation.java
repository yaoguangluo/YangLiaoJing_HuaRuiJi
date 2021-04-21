package OSI.OSU.MSU.tcp.http;

import java.util.Date;

import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.catalytic.procedure.pde.FullDNATokenPDI;
import OSI.OSU.VPC.common.utils.TokenUtil;
import dnaProcessor.Token;
import dnaProcessor.TokenCerts;
//设计 罗瑶光
//思想 罗瑶光
public class SessionValidation{
	//序列时间超时检查
    public void sessionTimeoutCheck() {
		
	}
    
    //序列初始生成
    public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword) {
    	FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
    	//String a= "luoyaoguang";
    	//pDE_RNA_FullFormular.encodeDNA(a);
    	pDE_RNA_FullFormular.key[0]= 0.6;
    	pDE_RNA_FullFormular.key[1]= 0.3;
    	pDE_RNA_FullFormular.key[2]= 0.5;
    	pDE_RNA_FullFormular.key[3]= 0.632;

    	pDE_RNA_FullFormular.text= humanWordsPassword;
    	pDE_RNA_FullFormular.pdw= pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
    	System.out.println("原文: "+ pDE_RNA_FullFormular.text);
    	//pDE_RNA_FullFormular.pdw= "字典保密：MSIOCUOCIPCUPCI";
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

    	for(i= 0; i< pDE_RNA_FullFormular.pdw.length(); i++) {
    		pDE_RNA_FullFormular.code+= pDE_RNA_FullFormular.lock + pDE_RNA_FullFormular.pdw.charAt(i);
    	}
    	System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
    	System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
    	System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
    	TokenCerts tokenCerts= new TokenCerts();
    	tokenCerts.setPdnKey(pDE_RNA_FullFormular.text);
    	tokenCerts.setPdnLock(pDE_RNA_FullFormular.lock);
    	tokenCerts.setPassword(humanWordsPassword);
    	tokenCerts.setPdnPassword(pDE_RNA_FullFormular.code);
    	return tokenCerts;
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
    
    //序列时间超时更新
    public void sessionUpdateByDNA() {
		
   	}
    //序列 正序密文检查
    public void sessionCheckWithOrderPDSKey() {
		
 	}
    //序列 反序密文检查
    public void sessionCheckWithPostPDSKey() {
		
 	}
}