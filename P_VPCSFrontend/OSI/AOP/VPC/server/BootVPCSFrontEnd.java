package OSI.AOP.VPC.server;
import java.io.IOException;

import ME.APM.VSQ.App;
import OSI.AOP.VPC.C.ServerInit_C_VPCSFrontEnd;
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
		new ServerInit_C_VPCSFrontEnd().initServer(this.app);
	}
	public void run() {
		try {
			new ServerInit_C_VPCSFrontEnd().initServer(this.app);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}