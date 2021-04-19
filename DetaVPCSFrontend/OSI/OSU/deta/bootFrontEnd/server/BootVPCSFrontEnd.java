package OSI.OSU.deta.bootFrontEnd.server;
import java.io.IOException;

import OSI.OSU.deta.bootFrontEnd.vpc.controller.ServerInitControllerVPCSFrontEnd;
public class BootVPCSFrontEnd extends Thread{
	public BootVPCSFrontEnd() {
	}
	public static void main(String[] args) throws IOException {
		new BootVPCSFrontEnd().bootFrontEnd();
	}
	public void bootFrontEnd() throws IOException {
		new ServerInitControllerVPCSFrontEnd().initServer();
	}
	public void run() {
		try {
			new ServerInitControllerVPCSFrontEnd().initServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}