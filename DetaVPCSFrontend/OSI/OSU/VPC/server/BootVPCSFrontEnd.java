package OSI.OSU.VPC.server;
import java.io.IOException;

import OSI.OSU.VPC.frontend.controller.ServerInitControllerVPCSFrontEnd;
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