package OSI.AOP.MS.VPC.server;

import java.io.IOException;
import java.net.Socket;
import MS.VPC.SH.Sleeper_H;
//这是标准的sleepr函数，我稍后会设计 frontend sleeper，  backend sleeper ，cache sleeper， database sleeper 继承它， 避免循环嵌套。
public class ServerSleeper_Standard extends Thread implements Runnable{
	public VPCSRequest vPCSRequest;
	public VPCSResponse vPCSResponse;
	
	public ServerSleeper_Standard(String port){
		vPCSRequest= new VPCSRequest();
		vPCSRequest.I_RequestPort(port);
		vPCSResponse= new VPCSResponse();
		vPCSResponse.I_HashCode(this.hashCode());
	}
	
	//合并
	public ServerSleeper_Standard(){
		vPCSRequest= new VPCSRequest();
		vPCSResponse= new VPCSResponse();
		vPCSResponse.I_HashCode(this.hashCode());
	}
	public void run(){
		try{
			RequestRecord_C.requestIpRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			RequestRecord_C.requestLinkRecoder(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			RequestFilter_C.requestIpFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			RequestFilter_C.requestLinkFilter(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			RequestFix_C.requestIpFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			RequestFix_C.requestLinkFix(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			ServerForward_Standard.IQ_ForwardType(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			ServerForward_Standard.forwardToRestMap(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			ServerRestMap_Standard.IQ_Response(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			ServerRestMap_Standard.returnResponse(vPCSRequest, vPCSResponse);
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