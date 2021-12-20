package SEM.bloom;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import MS.VPC.SH.Sleeper_H;
import OSI.AOP.MS.VPC.server.RequestFilter_C;
import OSI.AOP.MS.VPC.server.RequestFix_C;
import OSI.AOP.MS.VPC.server.RequestRecord_C;
import OSI.AOP.MS.VPC.server.ServerForward_Standard;
import OSI.AOP.MS.VPC.server.ServerInit_C;
import OSI.AOP.MS.VPC.server.ServerInit_C_VPCSFrontEnd;
import OSI.AOP.MS.VPC.server.ServerInit_Standard;
import OSI.AOP.MS.VPC.server.ServerRestMap_Standard;
import OSI.AOP.MS.VPC.server.ServerSleeper_Standard;
import OSI.AOP.MS.VPC.server.ServerVPC_Standard;
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse;

//著作权人+ 作者= 罗瑶光
//vpcs 服务器的 STANDARD 标准示例
public class StaticFunctionMapC_AOPM_E implements StaticFunctionMapC_AOPM_C{
	public Map<String, String> annotationMap= new HashMap<>();
	//BootVPCSBackEnd extends Thread
	public void BootVPCSBackEnd(App app) throws IOException{
		new OSI.AOP.MS.VPC.server.BootVPCSBackEnd(app);
	}
	public void BootVPCSBackEnd() throws IOException {
		new OSI.AOP.MS.VPC.server.BootVPCSBackEnd();
	}
	//	//	// 因为首页已经init了,我之后会改成_A带入就是了. 罗瑶光20210420 可自适应稍后vpcs细化接口
	//	//	public void IV_(){    
	//	//	}
	//	public void bootBackEnd() throws IOException{
	//
	//	}

	//RequestFilter_C {
	//	public void main(String[] args){    
	//
	//	}
	public void requestIpFilter(Socket socket) {    
		RequestFilter_C.requestIpFilter(socket);
	}
	public void requestLinkFilter(Socket socket) {   
		RequestFilter_C.requestLinkFilter(  socket);
	}
	public void requestIpFilter(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException{  
		RequestFilter_C. requestIpFilter(  vPCSRequest,   vPCSResponse) ;
	}
	public void requestLinkFilter(VPCSRequest vpcsRequest, VPCSResponse vPCSResponse) throws IOException{ 
		RequestFilter_C. requestLinkFilter(  vpcsRequest,   vPCSResponse);
	}
	public void IV_BlockList() throws IOException{  
		RequestFilter_C. IV_BlockList();
	}

	//RequestFix_C {
	public void requestIpFix(Socket socket){   
		RequestFix_C.requestIpFix(  socket);
	}
	public void requestLinkFix(Socket socket){  
		RequestFix_C.requestLinkFix(  socket);
	}
	public void requestIpFix(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse){    
		RequestFix_C. requestIpFix(  vPCSRequest,   vPCSResponse);
	}
	public void requestLinkFix(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse){    
		RequestFix_C.requestLinkFix(  vPCSRequest,   vPCSResponse);
	}

	//RequestRecord_C {
	public void requestIpRecoder(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse){   
		RequestRecord_C. requestIpRecoder(  vPCSRequest,   vPCSResponse);
	}
	public void requestLinkRecoder(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse)throws Exception{      
		RequestRecord_C.requestLinkRecoder(  vPCSRequest,   vPCSResponse);
	}

	//ServerForward_Standard {
	public void IQ_ForwardType(Socket socket) {    
		ServerForward_Standard. IQ_ForwardType(  socket) ;
	}
	public void forwardToRestMap(Socket socket) {   
		ServerForward_Standard.forwardToRestMap(  socket);
	}
	public void IQ_ForwardType(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException {  
		ServerForward_Standard.IQ_ForwardType(  vPCSRequest,   vPCSResponse);
	}	
	public void forwardToRestMap(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception{    
		ServerForward_Standard.forwardToRestMap(  vPCSRequest,   vPCSResponse);
	}

	//ServerInit_C_VPCSFrontEnd {// 稍后命名区分下 改成 return
	public void IV_ServerInit_C_VPCSFrontEnd() throws IOException {     
		new ServerInit_C_VPCSFrontEnd();
	}
	public void IV_Server(App app) throws IOException {  
		new ServerInit_C_VPCSFrontEnd(). IV_Server(  app);
	}

	//ServerInit_C {
	public void IV_Service(JTextPane jTextPane, String 前端接口Txt) throws IOException {  
		new ServerInit_C().IV_Service(  jTextPane,   前端接口Txt);
	}
	public void IV_ServerServerInit_C(App app) throws IOException {  
		new ServerInit_C().IV_Server(  app) ;
	}

	//ServerInit_Standard {
	public void IV_Service(String 前端接口Txt, String 服务器名) throws IOException{   
		new ServerInit_Standard(). IV_Service(  前端接口Txt,   服务器名) ;
	}
	public void IV_Server(String 前端接口Txt, String 服务器名) throws IOException{    
		new ServerInit_Standard().IV_Server(  前端接口Txt,   服务器名);
	}

	//ServerRestMap_Standard {
	public void IQ_Response(Socket socket) {    
		ServerRestMap_Standard.IQ_Response(  socket);
	}
	public void returnResponse(Socket socket) {   
		ServerRestMap_Standard.returnResponse(  socket);
	}
	public void IQ_Response(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {   
		ServerRestMap_Standard.IQ_Response(  vPCSRequest,   vPCSResponse);
	}
	public void returnResponse(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {    
		ServerRestMap_Standard.returnResponse(  vPCSRequest,   vPCSResponse);
	}
	public void P_Rest(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {   
		ServerRestMap_Standard.P_Rest(  vPCSRequest,   vPCSResponse);
	}
	public void P_View(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {   
		ServerRestMap_Standard. P_View(  vPCSRequest,   vPCSResponse);
	}
	public void P_Bytes(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {   
		ServerRestMap_Standard. P_Bytes(  vPCSRequest,   vPCSResponse) ;
	}
	public void P_Buffer(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException{  
		ServerRestMap_Standard. P_Buffer(  vPCSRequest,   vPCSResponse) ;
	}
	public void P_BufferBytes(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws UnsupportedEncodingException, IOException { 
		ServerRestMap_Standard. P_BufferBytes(  vPCSRequest,   vPCSResponse);
	}
	public void P_BytesWithoutZip(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException{  
		ServerRestMap_Standard.P_BytesWithoutZip(  vPCSRequest,   vPCSResponse);
	}

	// ServerSleeper_Standard extends Thread implements Runnable{
	public void hugPillow(Sleeper_H sleeper_H, Socket accept, int hashCode) {  
		new ServerSleeper_Standard().hugPillow(  sleeper_H,   accept,   hashCode);
	}

	//ServerVPC_Standard {
	public String forward(String string, Map<String, String> data) throws Exception {   
		return 	ServerVPC_Standard.forward(  string,   data);
	}
	public String getCode(String filePath) throws IOException{     
		return 	ServerVPC_Standard. getCode(  filePath) ;
	}
	public String getFilePath(String string){   
		return 	ServerVPC_Standard.getFilePath(  string);
	}
	//小接口略
}
