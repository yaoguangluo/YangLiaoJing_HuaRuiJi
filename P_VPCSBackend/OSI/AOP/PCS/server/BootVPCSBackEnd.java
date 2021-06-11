package OSI.AOP.PCS.server;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;
import java.util.Random;

import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OM.config.Config;
import PCS.thread.SocketThread;
import PCS.thread.SocketThreadPool;
public class BootVPCSBackEnd extends Thread{
	private static ServerSocket server;
	@SuppressWarnings("unused")
	private static Properties properties;
	private A analyzer;
	private EmotionMap emotionMap;
	private int port;
	static {
		properties = new Properties();
	}

	public BootVPCSBackEnd(A analyzer) throws IOException {
		if(null== analyzer) {
			this.analyzer = new CogsBinaryForest_AE();
			this.analyzer.initMixed();
		}else {
			this.analyzer= analyzer;
		}
		
	}
	public BootVPCSBackEnd() throws IOException {	
	}
	
    // 因为首页已经init了,我之后会改成analyzer带入就是了. 罗瑶光20210420
	public void init() {
		try {
			//port = Integer.parseInt(properties.getProperty("port"));
			port= Config.detaVPCSBackEndPort;
			server = new ServerSocket(port);
			if(null== this.analyzer) {
				this.analyzer = new CogsBinaryForest_AE();
				this.analyzer.initMixed();
			}
			emotionMap = new EmotionMap_E(); 
			emotionMap.initNegativeMap();
			emotionMap.initPositiveMap();
			emotionMap.initMotivationMap();
			emotionMap.initTrendingMap();
			emotionMap.initPredictionMap();
			emotionMap.initDistinctionMap();
			System.out.println();
			System.out.println("----德塔VPCS后端服务器端口启动:" + port);
			//MrTin.born.start();;
			System.out.println("----Tin神 VPCS-AOPM-IDUQ 第一代类人催化生命特征开启:" + port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bootBackEnd() throws IOException {
		SocketThreadPool socketThreadPool= new SocketThreadPool();
		long before = System.currentTimeMillis();
		init();
		addRestService();
		long now = System.currentTimeMillis();
		System.out.println("----DETA VPCS BackEnd--2.0");
		System.out.println("----Author: 罗瑶光");
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		System.out.println("----德塔VPCS后端服务器----");
		System.out.println("----德塔VPCS后端服务器启动一切正常-总耗时:"+ (now- before)+ "毫秒");
		while(true){
			if(socketThreadPool.getThreadsCount() < 300){
				SocketThread clientSocket= new SocketThread(emotionMap, analyzer, socketThreadPool, server.accept()
						, System.currentTimeMillis()+ "" + new Random().nextLong());
				socketThreadPool.addE_Socket(clientSocket.getSid(), clientSocket);
				clientSocket.start();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new BootVPCSBackEnd().bootBackEnd();
	}
	
	public void run(){
		try {
			bootBackEnd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void addRestService() {	
	}
}