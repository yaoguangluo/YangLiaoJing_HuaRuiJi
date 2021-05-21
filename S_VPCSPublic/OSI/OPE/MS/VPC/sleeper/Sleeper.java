package OSI.OPE.MS.VPC.sleeper;
import java.io.IOException;
import java.net.Socket;

import ME.APM.VSQ.App;
import OSI.OPE.MS.VPC.vision.VPCSRequest;
import OSI.OPE.MS.VPC.vision.VPCSResponse;

public class Sleeper extends Thread implements Runnable{
	public VPCSRequest vPCSRequest;
	public VPCSResponse vPCSResponse;
	private App app;
	public Sleeper(App app){
		this.app= app;
		vPCSRequest = new VPCSRequest();
		vPCSResponse = new VPCSResponse();
		vPCSResponse.setHashCode(this.hashCode());
	}
	//ºÏ²¢
	public Sleeper(){
		vPCSRequest= new VPCSRequest();
		vPCSResponse= new VPCSResponse();
		vPCSResponse.setHashCode(this.hashCode());
	}
	public void run(){
		try{
			OSI.OPE.MSV.PCS.controller.RequestRecordController
			.requestIpRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.controller.RequestRecordController
			.requestLinkRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.controller.RequestFilterController
			.requestIpFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.controller.RequestFilterController
			.requestLinkFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.controller.RequestFixController
			.requestIpFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.controller.RequestFixController
			.requestLinkFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MS.VPC.vision.ForwardVision.getForwardType(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MS.VPC.vision.ForwardVision.forwardToRestMap(app, vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MS.VPC.vision.RestMapVision.getResponse(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MS.VPC.vision.RestMapVision.returnResponse(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}		
		}catch(Exception e){
			try {
				vPCSResponse.returnErrorCode(500);
				e.printStackTrace();
			} catch (IOException e1) {
				System.gc();
				e1.printStackTrace();
			}
		}
	}

	public void hugPillow(SleeperHall sleeperHall, Socket accept, int hashCode) {
		sleeperHall.addExecSleeper(hashCode, this);
		vPCSResponse.setSocket(accept);
		vPCSResponse.setSleeperHall(sleeperHall);
	}
}