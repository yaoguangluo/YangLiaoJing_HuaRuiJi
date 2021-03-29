package org.tinos.vpcs.restServer;

import java.io.IOException;
import org.deta.boot.vpc.controller.ServerInitController;

import ME.sample.App;

public class restServer extends Thread implements Runnable{
	private App app;
	public boolean ready= false;
	public restServer(App app) {
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