package OSI.OSU.tinos.vpcs.restServer;

import java.io.IOException;

import ME.sample.App;
import OSI.OSU.MS.boot.vpc.controller.ServerInitController;

public class RestServer extends Thread implements Runnable{
	private App app;
	public boolean ready= false;
	public RestServer(App app) {
		//balabala here;
		this.app= app;
	}
	
	public void run() {
		try {
			ServerInitController.initServer(app);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}  