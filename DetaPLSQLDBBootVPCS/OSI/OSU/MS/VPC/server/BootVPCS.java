package OSI.OSU.MS.VPC.server;
import java.io.IOException;

import ME.sample.App;
import OSI.OSU.MSV.PCS.controller.ServerInitController;
public class BootVPCS {
	public static void main(App app, String[] args) throws IOException {
		ServerInitController.initServer(app);
	}
}