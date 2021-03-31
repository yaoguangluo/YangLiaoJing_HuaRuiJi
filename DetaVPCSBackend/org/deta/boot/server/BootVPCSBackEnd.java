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
public class BootVPCSBackEnd extends Thread{
	private static ServerSocket server;
	@SuppressWarnings("unused")
	private static Properties properties;
	private Analyzer analyzer;
	private EmotionMap emotionMap;
	private int port;
	static {
		properties = new Properties();
//		try {
//			properties.load(new FileInputStream(new File("src/main/resources/property.proterties")));
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public BootVPCSBackEnd() {
		
	}

	public void init() {
		try {
			//port = Integer.parseInt(properties.getProperty("port"));
			port= 8080;
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
			System.out.println("----����VPCSǰ�˷������˿�����:" + port);
			//MrTin.born.start();;
			System.out.println("----Tin�� VPCS-AOPM-IDUQ ��һ�����˴߻�������������:" + port);
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
		System.out.println("----Author: ������");
		System.out.println("----������������������޹�˾��Դ��Ŀ");
		System.out.println("----����VPCS��˷�����----");
		System.out.println("----����VPCSǰ�˷���������һ������-�ܺ�ʱ:"+ (now- before)+ "����");
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