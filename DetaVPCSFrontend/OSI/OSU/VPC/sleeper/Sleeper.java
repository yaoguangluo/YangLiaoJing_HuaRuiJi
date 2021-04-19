package OSI.OSU.VPC.sleeper;
import java.io.IOException;

import java.net.Socket;

import OSI.OSU.VPC.vision.VPCSRequest;
import OSI.OSU.VPC.vision.VPCSResponse;

public class Sleeper extends Thread implements Runnable{
	private VPCSRequest vPCSRequest;
	private VPCSResponse vPCSResponse;
	
	public VPCSRequest getVPCSRequest() {
		return this.vPCSRequest;
	}
	
	public Sleeper(){
		vPCSRequest= new VPCSRequest();
		vPCSResponse= new VPCSResponse();
		vPCSResponse.setHashCode(this.hashCode());
	}

	public void run(){
		try{
			OSI.OSU.VPC.frontend.controller.RequestRecordController.requestIpRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(70);
			OSI.OSU.VPC.frontend.controller.RequestRecordController.requestLinkRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(70);
			OSI.OSU.VPC.frontend.controller.RequestFilterController.requestIpFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(70);
			OSI.OSU.VPC.frontend.controller.RequestFilterController.requestLinkFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(70);
			OSI.OSU.VPC.frontend.controller.RequestFixController.requestIpFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(70);
			OSI.OSU.VPC.frontend.controller.RequestFixController.requestLinkFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(70);
			OSI.OSU.VPC.vision.ForwardVision.getForwardType(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(70);
			OSI.OSU.VPC.vision.ForwardVision.forwardToRestMap(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(70);
			OSI.OSU.VPC.vision.RestMapVision.getResponse(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
			Thread.sleep(30);
			OSI.OSU.VPC.vision.RestMapVision.returnResponse(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				vPCSResponse.returnErrorCode(200);
				return;
			}
		}catch(Exception e){
			try {
				vPCSResponse.returnErrorCode(200);
				e.printStackTrace();
			} catch (IOException e1) {
				System.gc();
			}
		}
	}
	public void hugPillow(SleeperHall sleeperHall, Socket accept, int hashCode) {
		sleeperHall.addExecSleeper(hashCode, this);
		vPCSResponse.setSocket(accept);
		vPCSResponse.setSleeperHall(sleeperHall);
	}
}