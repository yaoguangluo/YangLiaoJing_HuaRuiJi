package OSI.config;
//准备设计配置文件，养疗经启动配置都走这里的参数
//罗瑶光
public class Config{
	//数据库配置
	public static final int detaVPCSBackEndPort= 8080; 
	//前端配置
	public static final int detaVPCSFrontEndPort= 80; 
	//后端配置
	public static final int detaVPCSDBPort= 8000; 
	//字符集配置
	public static final String detaMainCharset= "GBK";
	public static final String detaReferCharset= "UTF8";
	//缓存配置
	
	//时钟配置
	public static final String timeETC= "G8+";
	//本地路径配置
	
	//系统硬件信息适配
	
	//热备记录和第三方接口日志上传功能
}