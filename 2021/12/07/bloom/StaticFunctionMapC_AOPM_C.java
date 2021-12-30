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
//����Ȩ��+ ����= ������
public interface StaticFunctionMapC_AOPM_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_C, Map<String, Object> output) throws Exception {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("BootVPCSBackEnd")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.BootVPCSBackEnd((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestIpFilter")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestIpFilter((Socket)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestLinkFilter")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestLinkFilter((Socket)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestIpFix")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestIpFix((Socket)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestLinkFix")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestLinkFix((Socket)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_BlockList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_BlockList();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestLinkRecoder")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestLinkRecoder((VPCSRequest)inputValues.get(��������[����++]), (VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IQ_ForwardType")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IQ_ForwardType((Socket)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("forwardToRestMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.forwardToRestMap((Socket)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_ServerInit_C_VPCSFrontEnd")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_ServerInit_C_VPCSFrontEnd();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_Server")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_Server((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("IV_Service")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_Service((JTextPane)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_ServerServerInit_C")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_ServerServerInit_C((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("IQ_Response")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IQ_Response((Socket)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("returnResponse")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.returnResponse((Socket)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("P_Rest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_Rest((VPCSRequest)inputValues.get(��������[����++])
						, (VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("P_View")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_View((VPCSRequest)inputValues.get(��������[����++])
						, (VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("P_Bytes")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_Bytes((VPCSRequest)inputValues.get(��������[����++])
						, (VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("P_Buffer")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_Buffer((VPCSRequest)inputValues.get(��������[����++])
						, (VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("P_BufferBytes")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_BufferBytes((VPCSRequest)inputValues.get(��������[����++])
						, (VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("P_BytesWithoutZip")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_BytesWithoutZip((VPCSRequest)inputValues.get(��������[����++])
						, (VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("hugPillow")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.hugPillow((Sleeper_H)inputValues.get(��������[����++])
						, (Socket)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("forward")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapC_AOPM_C.forward((String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getFilePath")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapC_AOPM_C.getFilePath((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCode")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapC_AOPM_C.getCode((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}

	public static void load(StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapC_AOPM_E.annotationMap.put("BootVPCSBackEnd", "app");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestIpFilter", "socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestLinkFilter", "socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_BlockList", "void");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestIpFix", "vPCSRequest:vPCSResponse");//��ʱ����Щ������ҪΨһ��������tinshell��ѯ���棬����������һ��
		staticFunctionMapC_AOPM_E.annotationMap.put("requestLinkFix", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestIpRecoder", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestLinkRecoder", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("IQ_ForwardType", "socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("forwardToRestMap", "socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_ServerInit_C_VPCSFrontEnd", "void");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_Server", "app");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_Service", "jTextPane:ǰ�˽ӿ�Txt");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_ServerServerInit_C", "app");
		staticFunctionMapC_AOPM_E.annotationMap.put("IQ_Response", "socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("returnResponse", "socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Rest", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_View", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Bytes", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Buffer", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_BufferBytes", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_BytesWithoutZip", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("hugPillow", " sleeper_H:accept:hashCode");
		staticFunctionMapC_AOPM_E.annotationMap.put("forward", "string:data");
		staticFunctionMapC_AOPM_E.annotationMap.put("getFilePath", "string");
		staticFunctionMapC_AOPM_E.annotationMap.put("getCode", "filePath");
	}
	//BootVPCSBackEnd extends Thread
	public void BootVPCSBackEnd(App app) throws IOException ;
	public void BootVPCSBackEnd() throws IOException ;

	// ��Ϊ��ҳ�Ѿ�init��,��֮���ĳ�_A���������. ������20210420
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

	//ServerInit_C_VPCSFrontEnd {// �Ժ�����������
	public void IV_ServerInit_C_VPCSFrontEnd() throws IOException ;
	public void IV_Server(App app) throws IOException ;

	//ServerInit_C {
	public void IV_Service(JTextPane jTextPane, String ǰ�˽ӿ�Txt) throws IOException ;
	public void IV_ServerServerInit_C(App app) throws IOException ;

	//ServerInit_Standard {
	public void IV_Service(String ǰ�˽ӿ�Txt, String ��������) throws IOException;
	public void IV_Server(String ǰ�˽ӿ�Txt, String ��������) throws IOException;

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
	//С�ӿ���
}
