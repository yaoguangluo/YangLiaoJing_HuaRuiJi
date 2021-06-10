package OM.config;
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

	//2 缓存配置        
	public static final int CACHE_KEY_LENGTH= 32;
	public static final int CACHE_PIPE_NODE_LENGTH= 1500;
	
	//3 多线程配置        
	public static final int POOL_RANGE= 50;
	
	//4 VPCS 配置        
	public static final int SLEEPER_HALL_SIZE= 200;
	//5 分词配置        
	public static final int INDEX_LEVEL= 5;
	//6 元基计算配置        
	public static final int PDE_LEVEL= 2;
	//10 ETL配置        
	
	//11 系统运营环境配置        
	public static final String LOG_MODEL= "bin";
	//12 日志信息配置   
	
	//系统硬件信息适配
	
	//热备记录和第三方接口日志上传功能
}