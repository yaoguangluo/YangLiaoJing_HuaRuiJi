package org.deta.boot.server;
import java.io.IOException;

import org.deta.boot.vpc.controller.ServerInitController;

import ME.sample.App;
public class BootVPCS {
	public static void main(App app, String[] args) throws IOException {
		ServerInitController.initServer(app);
	}
}