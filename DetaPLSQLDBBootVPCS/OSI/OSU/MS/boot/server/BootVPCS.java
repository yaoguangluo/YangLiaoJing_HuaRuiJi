package OSI.OSU.MS.boot.server;
import java.io.IOException;

import ME.sample.App;
import OSI.OSU.MS.boot.vpc.controller.ServerInitController;
public class BootVPCS {
	public static void main(App app, String[] args) throws IOException {
		ServerInitController.initServer(app);
	}
}