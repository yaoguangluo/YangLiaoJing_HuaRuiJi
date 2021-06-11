package OSI.AOP.VPC.server;
import java.io.IOException;

import ME.APM.VSQ.App;
import OSI.AOP.VPC.C.ServerInitControllerVPCSFrontEnd;
//VPCS整合后修正, 稍后优化.
public class BootVPCSFrontEnd extends Thread{
	private App app;
	public BootVPCSFrontEnd(App app) {
		this.app= app;
	}
	public static void main(String[] args) throws IOException {
		new BootVPCSFrontEnd(null).bootFrontEnd();
	}
	public void bootFrontEnd() throws IOException {
		new ServerInitControllerVPCSFrontEnd().initServer(this.app);
	}
	public void run() {
		try {
			new ServerInitControllerVPCSFrontEnd().initServer(this.app);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}