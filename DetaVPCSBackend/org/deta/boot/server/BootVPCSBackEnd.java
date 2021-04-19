package org.deta.boot.server;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;
import java.util.Random;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;
import org.ASQ.PSU.OEI.tinos.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import org.OCI.emotion.ortho.fhmm.EmotionMap;
import org.OEI.emotion.ortho.fhmm.imp.EmotionMapImp;
import org.deta.boot.thread.SocketThread;
import org.deta.boot.thread.SocketThreadPool;

import OSI.OSU.deta.config.Config;
public class BootVPCSBackEnd extends Thread{
	private static ServerSocket server;
	@SuppressWarnings("unused")
	private static Properties properties;
	private Analyzer analyzer;
	private EmotionMap emotionMap;
	private int port;
	static {
		properties = new Properties();
	}

	public BootVPCSBackEnd() {
		
	}

	public void init() {
		try {
			//port = Integer.parseInt(properties.getProperty("port"));
			port= Config.detaVPCSBackEndPort;
			server = new ServerSocket(port);
			analyzer = new CogsBinaryForestAnalyzerImp();
			analyzer.initMixed();
			emotionMap = new EmotionMapImp(); 
			emotionMap.initNegativeMap();
			emotionMap.initPositiveMap();
			emotionMap.initMotivationMap();
			emotionMap.initTrendingMap();
			emotionMap.initPredictionMap();
			emotionMap.initDistinctionMap();
			System.out.println("----德塔VPCS前端服务器端口启动:" + port);
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
		System.out.println("----DETA VPCS BackEnd--1.7");
		System.out.println("----Author: 罗瑶光");
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		System.out.println("----德塔VPCS后端服务器----");
		System.out.println("----德塔VPCS前端服务器启动一切正常-总耗时:"+ (now- before)+ "毫秒");
		while(true){
			if(socketThreadPool.getThreadsCount() < 300){
				SocketThread clientSocket= new SocketThread(emotionMap, analyzer, socketThreadPool, server.accept()
						, System.currentTimeMillis()+ "" + new Random().nextLong());
				socketThreadPool.addExecSocket(clientSocket.getSid(), clientSocket);
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