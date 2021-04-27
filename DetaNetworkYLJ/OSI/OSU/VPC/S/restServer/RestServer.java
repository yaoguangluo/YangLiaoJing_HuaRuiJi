package OSI.OSU.VPC.S.restServer;

import java.io.IOException;

import ME.APM.VSQ.App;
import OSI.AOP.MSV.PCS.controller.ServerInitController;

public class RestServer extends Thread implements Runnable{
	private App app;
	public boolean ready= false;
	public RestServer(App app) {
		//balabala here;
		this.app= app;
	}
	
	public void run() {
		try {
			ServerInitController.initServer(this.app);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}  