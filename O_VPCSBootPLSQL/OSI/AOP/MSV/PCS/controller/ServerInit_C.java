package OSI.AOP.MSV.PCS.controller;
import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager;
import MS.VPC.PP.Time_P;
import MS.VPC.SH.Sleeper;
import MS.VPC.SH.SleeperHall;
import MSV.PCS.C.RequestFilter_C;
import OM.config.Config;
import OP.SM.AOP.MEC.SIQ.stable.StableData;
import OSI.AOP.MS.VPC.S.hall.DatabaseLogHall;
import VPC.VQS.DSU.utils.DetaUtil;
public class ServerInit_C {
	private static ServerSocket server;
	//private static Properties properties;
	private static int port;
	private static String dbConfigPath;
//	private App app;
	static {
		//properties = new Properties();
//		try {
//			properties.load(new FileInputStream
//					(new File("src/main/resources/property.proterties")));
//			System.out.println("----德塔VPCS数据库服务器资源载入:成功！");
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public static void initService(JTextPane jTextPane) throws IOException {
		try {
			//port= Integer.parseInt(properties.getProperty(StableData.TCP_PORT));
			port= Config.detaVPCSDBPort;
			server= new ServerSocket(port);
			System.out.println("----德塔VPCS数据库服务器端口启动:" + port);
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----德塔VPCS数据库服务器端口启动:" + port+ text;
				text="\r\n"+ "..."+ text;
				jTextPane.setText(text);
			}
			if(null!= dbConfigPath && !dbConfigPath.isEmpty()) {
				dbConfigPath.replace("\\", "/"); //支持 linux reg 格式
				DetaUtil.initDB(dbConfigPath);
			}else {
				dbConfigPath= "C:/DBconfig.lyg";
				DetaUtil.initDB(dbConfigPath);
			}
			System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----德塔VPCS数据库服务器DMA确认:成功！"+ text;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			RequestFilter_C.initBlockList();
			System.out.println("----德塔VPCS数据库服务器IP过滤服务启动:成功！");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----德塔VPCS数据库服务器IP过滤服务启动:成功！"+ text;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			DetaDBBufferCacheManager.reflection();
			System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----德塔VPCS数据库服务器启动整库过程映射服务:成功！"+ text;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			DatabaseLogHall.createBinLogHall();
			System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
			if(jTextPane!= null) {
				String text= jTextPane.getText();
				text="\r\n"+ "----德塔VPCS数据库服务器启动整库过程映射服务:成功！"+ text;;
				text="\r\n"+ "...";
				jTextPane.setText(text);
			}
			//			BootBackup.bootBackupByUsingGzip(CacheManager
			//.getCacheInfo("LogPath").getValue().toString()+"/zipCover");
			//			UnZip.unZipWithPath("C:/DetaLog/zipCover/zip_1549583065203.zip"
			//, "C:/DetaLog/zipCover/cover");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void haoHiYooFaker(SleeperHall sleeperHall) {
		sleeperHall.callSkivvy(); 
	}

	public static void initServer(App app) throws IOException {
		dbConfigPath= app.dbConfigPath;
		System.out.println("----DETA VPCS--2.0");
		System.out.println("----Author: 罗瑶光");
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		if(app.appConfig.SectionJPanel.jTextPane!= null) {
			String text= app.appConfig.SectionJPanel.jTextPane.getText();
			text="\r\n"+ "载入德塔 PLSQL数据库 映射添加完毕！"+ text;
			text="\r\n"+ "----Author: 罗瑶光"+ text;
			text="\r\n"+ "----浏阳德塔软件开发有限公司开源项目"+ text;
			text="\r\n"+ "..."+ text;
			app.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		Time_P timeProcess= new Time_P();
		timeProcess.begin();
		SleeperHall sleeperHall = new SleeperHall();
		initService(app.appConfig.SectionJPanel.jTextPane);
		timeProcess.end();
		if(app.appConfig.SectionJPanel.jTextPane!= null) {
			String text= app.appConfig.SectionJPanel.jTextPane.getText();
			text="\r\n"+ "----德塔VPCS数据库服务器启动一切正常-总耗时:" 
					+ timeProcess.duration()+ "毫秒"+ text;
			text="\r\n"+ "..."+ text;
			app.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		System.out.println("----德塔VPCS数据库服务器启动一切正常-总耗时:" 
		+ timeProcess.duration()+ "毫秒");
		app.ready= true;
		while(true){
			if(sleeperHall.getThreadsCount()< StableData.SLEEPERS_RANGE){
				Sleeper sleeper= new Sleeper(app);
				try {
					sleeper.hugPillow(sleeperHall, server.accept()
							, sleeper.hashCode());
					sleeper.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				haoHiYooFaker(sleeperHall);
			}
		}
	}
}