package OSI.AOP.MS.VPC.server;
import java.io.IOException;

import ME.APM.VSQ.App;
import OSI.AOP.MSV.PCS.controller.ServerInit_C;
public class BootVPCS {
	public static void main(App app, String[] args) throws IOException {
		ServerInit_C.initServer(app);
	}
}