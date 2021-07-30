package MS.VPC.SH;
import java.io.IOException;
import java.net.Socket;

import ME.APM.VSQ.App;
import MS.VPC.V.VPCSRequest;
import MS.VPC.V.VPCSResponse;
//这是标准的sleepr函数，我稍后会设计 frontend sleeper，  backend sleeper ，cache sleeper， database sleeper 继承它， 避免循环嵌套。
public class Sleeper extends Thread implements Runnable{
	public VPCSRequest vPCSRequest;
	public VPCSResponse vPCSResponse;
	private App app;
	public Sleeper(App app){
		this.app= app;
		vPCSRequest= new VPCSRequest();
		vPCSResponse= new VPCSResponse();
		vPCSResponse.I_HashCode(this.hashCode());
	}
	
	public Sleeper(App app, String port){
		this.app= app;
		vPCSRequest= new VPCSRequest();
		vPCSRequest.I_RequestPort(port);
		vPCSResponse= new VPCSResponse();
		vPCSResponse.I_HashCode(this.hashCode());
	}
	
	//合并
	public Sleeper(){
		vPCSRequest= new VPCSRequest();
		vPCSResponse= new VPCSResponse();
		vPCSResponse.I_HashCode(this.hashCode());
	}
	public void run(){
		try{
			MSV.PCS.C.RequestRecord_C
			.requestIpRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MSV.PCS.C.RequestRecord_C
			.requestLinkRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MSV.PCS.C.RequestFilter_C
			.requestIpFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MSV.PCS.C.RequestFilter_C
			.requestLinkFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MSV.PCS.C.RequestFix_C
			.requestIpFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MSV.PCS.C.RequestFix_C
			.requestLinkFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MS.VPC.V.Forward_V.IQ_ForwardType(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MS.VPC.V.Forward_V.forwardToRestMap(app, vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MS.VPC.V.RestMap_V.IQ_Response(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			MS.VPC.V.RestMap_V.returnResponse(vPCSRequest, vPCSResponse);
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

	public void hugPillow(Sleeper_H sleeper_H, Socket accept, int hashCode) {
		sleeper_H.I_E_Sleeper(hashCode, this);
		vPCSResponse.I_Socket(accept);
		vPCSResponse.I_Sleeper_H(sleeper_H);
	}
}