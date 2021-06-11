package OSI.AOP.VPC.C;
import java.io.IOException;

import java.net.ServerSocket;
import java.util.Properties;

import ME.APM.VSQ.App;
import MS.VPC.PP.Time_P;
import MS.VPC.SH.Sleeper;
import MS.VPC.SH.SleeperHall;
import OM.config.Config;
import VPC.VQS.DSU.utils.DetaUtil;
public class ServerInit_C_VPCSFrontEnd {
	private ServerSocket server;
	@SuppressWarnings("unused")
	private Properties properties;
	private App app;
	private int port;{
		properties= new Properties();
			System.out.println("----德塔VPCS前端服务器资源载入:成功！");
	}

	public void init() throws IOException {
		try {
			port= Config.detaVPCSFrontEndPort;
			server= new ServerSocket(port);
			System.out.println("----德塔VPCS前端服务器端口启动:" + port);
			if(null!= app.dbConfigPath&& !app.dbConfigPath.isEmpty()) {
				DetaUtil.initDB(app.dbConfigPath);//稍后整理下
			}else {
				DetaUtil.initDB("C:/DBconfig.lyg");
			}
			System.out.println("----德塔VPCS前端服务器DMA确认:成功！");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void haoHiYooFaker(SleeperHall sleeperHall) {
		sleeperHall.callSkivvy(); 
	}

	public void initServer(App app) throws IOException {
		this.app= app;
		System.out.println("");
		System.out.println("----DETA VPCS--2.0");
		System.out.println("----Author: 罗瑶光");
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		Time_P timeProcess= new Time_P();
		timeProcess.begin();
		SleeperHall sleeperHall= new SleeperHall();
		init();
		timeProcess.end();
		System.out.println("----德塔VPCS前端服务器启动一切正常-总耗时:"+ timeProcess.duration()+ "毫秒");
		while(true){	
			if(sleeperHall.getThreadsCount()< 500){
				Sleeper sleeper= new Sleeper(this.app);
				sleeper.hugPillow(sleeperHall, server.accept(), sleeper.hashCode());
				sleeper.start();
			}else {
				haoHiYooFaker(sleeperHall);
			}
		}
	}
}