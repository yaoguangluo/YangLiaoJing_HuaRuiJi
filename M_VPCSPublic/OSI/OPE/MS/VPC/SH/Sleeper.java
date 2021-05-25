package OSI.OPE.MS.VPC.SH;
import java.io.IOException;
import java.net.Socket;

import ME.APM.VSQ.App;
import OSI.OPE.MS.VPC.V.VPCSRequest;
import OSI.OPE.MS.VPC.V.VPCSResponse;

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
			OSI.OPE.MSV.PCS.C.RequestRecordController
			.requestIpRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.C.RequestRecordController
			.requestLinkRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.C.RequestFilterController
			.requestIpFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.C.RequestFilterController
			.requestLinkFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.C.RequestFixController
			.requestIpFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MSV.PCS.C.RequestFixController
			.requestLinkFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MS.VPC.V.ForwardVision.getForwardType(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MS.VPC.V.ForwardVision.forwardToRestMap(app, vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MS.VPC.V.RestMapVision.getResponse(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			OSI.OPE.MS.VPC.V.RestMapVision.returnResponse(vPCSRequest, vPCSResponse);
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