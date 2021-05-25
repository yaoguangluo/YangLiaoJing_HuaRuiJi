package PEU.P.nlp;
public interface StopSymbol_UTF8{
	//REFER http://www.fhdq.net/
	//为了避免踩编码界多年的巨坑，因为不支持GBK-UTF8混合字符乱码产生重编译bug, 
	//我把//www.fhdq.net/ 换了成电脑键盘的ascii 标准符号。
	//用户感兴趣自己添加，
	//作者罗瑶光。
	public static final String symbol="！@#￥%……&*（）——+}{“：？》《·1234567890-=】"
			+ "【‘；/。，`~!@#$%^&*()_+}{\":?></.,';][=-'";
} 
	