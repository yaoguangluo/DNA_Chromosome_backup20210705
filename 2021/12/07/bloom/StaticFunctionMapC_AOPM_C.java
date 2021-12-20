package SEM.bloom;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Map;

import javax.swing.JTextPane;
import ME.APM.VSQ.App;
import MS.VPC.SH.Sleeper_H;
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse;
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapC_AOPM_C {

	public static void load(StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		staticFunctionMapC_AOPM_E.annotationMap.put("BootVPCSBackEnd", "BootVPCSBackEnd");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestIpFilter", "requestIpFilter");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestLinkFilter", "requestLinkFilter");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_BlockList", "IV_BlockList");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestIpFix", "requestIpFix");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestLinkFix", "requestLinkFix");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestIpRecoder", "requestIpRecoder");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestLinkRecoder", "requestLinkRecoder");
		staticFunctionMapC_AOPM_E.annotationMap.put("IQ_ForwardType", "IQ_ForwardType");
		staticFunctionMapC_AOPM_E.annotationMap.put("forwardToRestMap", "forwardToRestMap");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_ServerInit_C_VPCSFrontEnd", "IV_ServerInit_C_VPCSFrontEnd");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_Server", "IV_Server");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_Service", "IV_Service");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_ServerServerInit_C", "IV_ServerServerInit_C");
		staticFunctionMapC_AOPM_E.annotationMap.put("IQ_Response", "IQ_Response");
		staticFunctionMapC_AOPM_E.annotationMap.put("returnResponse", "returnResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Rest", "P_Rest");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_View", "P_View");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Bytes", "P_Bytes");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Buffer", "P_Buffer");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_BufferBytes", "P_BufferBytes");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_BytesWithoutZip", "P_BytesWithoutZip");
		staticFunctionMapC_AOPM_E.annotationMap.put("hugPillow", "hugPillow");
		staticFunctionMapC_AOPM_E.annotationMap.put("forward", "forward");
		staticFunctionMapC_AOPM_E.annotationMap.put("getFilePath", "getFilePath");
		staticFunctionMapC_AOPM_E.annotationMap.put("getCode", "getCode");
	}
	//BootVPCSBackEnd extends Thread
	public void BootVPCSBackEnd(App app) throws IOException ;
	public void BootVPCSBackEnd() throws IOException ;

	// 因为首页已经init了,我之后会改成_A带入就是了. 罗瑶光20210420
	//	public void IV_() ;
	//	public void bootBackEnd() throws IOException;
	//
	//	//RequestFilter_C {
	//	public void main(String[] args);
	public void requestIpFilter(Socket socket) ;
	public void requestLinkFilter(Socket socket) ;
	public void requestIpFilter(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException;
	public void requestLinkFilter(VPCSRequest vpcsRequest, VPCSResponse vPCSResponse) throws IOException;
	public void IV_BlockList() throws IOException;

	//RequestFix_C {
	public void requestIpFix(Socket socket);
	public void requestLinkFix(Socket socket);
	public void requestIpFix(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse);
	public void requestLinkFix(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse);

	//RequestRecord_C {
	public void requestIpRecoder(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse);
	public void requestLinkRecoder(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse)throws Exception;

	//ServerForward_Standard {
	public void IQ_ForwardType(Socket socket) ;
	public void forwardToRestMap(Socket socket) ;
	public void IQ_ForwardType(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException ;	
	public void forwardToRestMap(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception;

	//ServerInit_C_VPCSFrontEnd {// 稍后命名区分下
	public void IV_ServerInit_C_VPCSFrontEnd() throws IOException ;
	public void IV_Server(App app) throws IOException ;

	//ServerInit_C {
	public void IV_Service(JTextPane jTextPane, String 前端接口Txt) throws IOException ;
	public void IV_ServerServerInit_C(App app) throws IOException ;

	//ServerInit_Standard {
	public void IV_Service(String 前端接口Txt, String 服务器名) throws IOException;
	public void IV_Server(String 前端接口Txt, String 服务器名) throws IOException;

	//ServerRestMap_Standard {
	public void IQ_Response(Socket socket) ;
	public void returnResponse(Socket socket) ;
	public void IQ_Response(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) ;
	public void returnResponse(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) ;
	public void P_Rest(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception ;
	public void P_View(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) ;
	public void P_Bytes(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException ;
	public void P_Buffer(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException;
	public void P_BufferBytes(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws UnsupportedEncodingException, IOException ;
	public void P_BytesWithoutZip(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException;

	// ServerSleeper_Standard extends Thread implements Runnable{
	public void hugPillow(Sleeper_H sleeper_H, Socket accept, int hashCode) ;

	//ServerVPC_Standard {
	public String forward(String string, Map<String, String> data) throws Exception ;
	public String getCode(String filePath) throws IOException;
	public String getFilePath(String string);
	//小接口略
}
