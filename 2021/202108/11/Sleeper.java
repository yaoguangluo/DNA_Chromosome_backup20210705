package MS.VPC.SH;
import java.io.IOException;

import ME.APM.VSQ.App;
import MS.VPC.V.Forward_V;
import MS.VPC.V.RestMap_V;
import OSI.AOP.MS.VPC.server.RequestFilter_C;
import OSI.AOP.MS.VPC.server.RequestFix_C;
import OSI.AOP.MS.VPC.server.RequestRecord_C;
import OSI.AOP.MS.VPC.server.ServerSleeper_Standard;
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse;
//这是标准的sleepr函数，我稍后会设计 frontend sleeper，backend sleeper ，cache sleeper， database sleeper 继承它， 避免循环嵌套。
//开始vpcs 继承，方便之后新陈代谢元基肽化
//罗瑶光 20210811
public class Sleeper extends ServerSleeper_Standard implements Runnable{
//	public VPCSRequest vPCSRequest;
//	public VPCSResponse vPCSResponse;
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
	
//	public Sleeper(String port){
//		vPCSRequest= new VPCSRequest();
//		vPCSRequest.I_RequestPort(port);
//		vPCSResponse= new VPCSResponse();
//		vPCSResponse.I_HashCode(this.hashCode());
//	}
//
//	//合并
//	public Sleeper(){
//		vPCSRequest= new VPCSRequest();
//		vPCSResponse= new VPCSResponse();
//		vPCSResponse.I_HashCode(this.hashCode());
//	}
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
			Forward_V.IQ_ForwardType(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			Forward_V.forwardToRestMap(app, vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			RestMap_V.IQ_Response(vPCSRequest, vPCSResponse);
			if(vPCSResponse.getSocket().isClosed()) {
				return;
			}
			RestMap_V.returnResponse(vPCSRequest, vPCSResponse);
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
}