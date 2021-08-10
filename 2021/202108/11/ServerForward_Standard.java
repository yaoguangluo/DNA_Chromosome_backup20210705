package OSI.AOP.MS.VPC.server;
import java.io.IOException;
import java.net.Socket;
import OSI.AOP.VPC.rest.VPCYangliaojing;
import SVQ.stable.StableWeb;
//import OSI.AOP.VPC.PP.port_E.RestLoginPort_E;
//import PEU.P.map.VtoV;
//�ϲ� ���ݿ�� ǰ�˵� vison�ļ�
//������ 20210730
public class ServerForward_Standard {
	public static void main(String[] args){
	}

	public static void IQ_ForwardType(Socket socket) {
	}

	public static void forwardToRestMap(Socket socket) {
	}

	public static void IQ_ForwardType(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException {
		if(vPCSRequest.getRequestIsRest()){
			String filePath = VPCYangliaojing.getFilePath(vPCSRequest.getRequestLink());
			if(filePath.contains(StableWeb.FILE_TTF)
					||filePath.contains(StableWeb.FILE_EOT)
					||filePath.contains(StableWeb.FILE_SVG)
					||filePath.contains(StableWeb.FILE_WOFF)
					||filePath.contains(StableWeb.FILE_WOFF2)
					||filePath.contains(StableWeb.FILE_OTF)){
				String code = VPCYangliaojing.getCode(filePath);
				vPCSRequest.I_RequestFilePath(filePath);
				vPCSRequest.I_RequestFileCode(code);
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BUFFER);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_FONT_WOFF);
				return;
			}	
			vPCSRequest.I_RequestForwardType(StableWeb.STREAM_REST);
		}else{
			String filePath = VPCYangliaojing.getFilePath(vPCSRequest.getRequestLink());
			String code = VPCYangliaojing.getCode(filePath);
			vPCSRequest.I_RequestFilePath(filePath);
			vPCSRequest.I_RequestFileCode(code);
			if(filePath.contains(StableWeb.FILE_PNG)){ 
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_PNG);
			}
			if(filePath.contains(StableWeb.FILE_JPEG)){ 
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_JPEG);
			}
			if(filePath.contains(StableWeb.FILE_JPG)){ 
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_JPG);
			}
			if(filePath.contains(StableWeb.FILE_GIF)){ 
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_GIF);
			}
			if(filePath.contains(StableWeb.FILE_JS) && code.equalsIgnoreCase(StableWeb.CHARSET_UTF_8)){	
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES_BUFFER);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_JS);
			}
			if(filePath.contains(StableWeb.FILE_CSS)){
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BUFFER);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_CSS);
			}
			if(filePath.contains(StableWeb.FILE_HTML)){
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BUFFER);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_HTML);
			}	
			if(filePath.contains(StableWeb.FILE_PDF)){
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_PDF);
			}
			if(filePath.contains(StableWeb.FILE_ZIP)){
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_ZIP);
			}
			if(filePath.contains(StableWeb.FILE_WAV)){
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BUFFER);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_WAV);
			}
				if(filePath.contains(StableWeb.FILE_RAR)){
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_RAR);
			}
			if(filePath.contains(StableWeb.FILE_XML)){
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_XML);
			}
			if(filePath.contains(StableWeb.FILE_TXT)){
				vPCSRequest.I_RequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.I_ResponseContentType(StableWeb.HEADER_CONTENT_TYPE_TXT);
			}
		}	
	}

//	public static void forwardToRestMap(App app, VPCSRequest vPCSRequest
//			, VPCSResponse vPCSResponse) throws Exception {
//		if(null== vPCSRequest || null== vPCSRequest.getRequestForwardType()){
//			vPCSResponse.return404();
//			return;
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_REST)){
//			//������Ƹ�sleeper�̳У�������������Ƹ�condition������ Ȼ�����portʶ�� ���̳����condition �����ˡ��� ������ 20210730
//			if(vPCSRequest.getRequestPort().equals(StableHTTP.PORT_DATABASE)) {
//				RestMap_V.P_RestDB(app, vPCSRequest, vPCSResponse);
//			}else {
//				RestMap_V.P_Rest(app, vPCSRequest, vPCSResponse);
//			}
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES)){
//			RestMap_V.P_Bytes(vPCSRequest, vPCSResponse);
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BUFFER)){
//			RestMap_V.P_Buffer(vPCSRequest, vPCSResponse);
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES_BUFFER)){
//			RestMap_V.P_BufferBytes(vPCSRequest, vPCSResponse);
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES_WITHOUT_ZIP)){
//			RestMap_V.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
//		}
//	}
	
	public static void forwardToRestMap(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		if(vPCSRequest.getRequestForwardType() == null){
			vPCSResponse.return404();
			return;
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_REST)){
			ServerRestMap_Standard.P_Rest(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES)){
			ServerRestMap_Standard.P_Bytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BUFFER)){
			ServerRestMap_Standard.P_Buffer(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES_BUFFER)){
			ServerRestMap_Standard.P_BufferBytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES_WITHOUT_ZIP)){
			ServerRestMap_Standard.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
		}
	}
}