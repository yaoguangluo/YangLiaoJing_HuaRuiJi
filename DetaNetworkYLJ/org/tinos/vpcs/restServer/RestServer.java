package org.tinos.vpcs.restServer;

import java.io.IOException;

import org.MS.boot.vpc.controller.ServerInitController;

import ME.sample.App;

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