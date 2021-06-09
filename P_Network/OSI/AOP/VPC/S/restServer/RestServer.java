package OSI.AOP.VPC.S.restServer;

import java.io.IOException;

import ME.APM.VSQ.App;
import OSI.AOP.MSV.PCS.controller.ServerInit_C;

public class RestServer extends Thread implements Runnable{
	private App app;
	public boolean ready= false;
	public RestServer(App app) {
		//balabala here;
		this.app= app;
	}
	
	public void run() {
		try {
			ServerInit_C.initServer(this.app);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}  