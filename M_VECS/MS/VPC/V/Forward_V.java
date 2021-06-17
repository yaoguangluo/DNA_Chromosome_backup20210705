package MS.VPC.V;
import java.io.IOException;
import java.net.Socket;

import ME.APM.VSQ.App;
import SVQ.stable.StableWeb;
import OSI.AOP.MS.VPC.rest.VPC;
//合并 数据库和 前端的 vison文件
public class Forward_V {
	public static void main(String[] args){
	}

	public static void getForwardType(Socket socket) {
	}

	public static void forwardToRestMap(Socket socket) {
	}

	public static void getForwardType(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException {
		if(vPCSRequest.getRequestIsRest()){
			String filePath = VPC.getFilePath(vPCSRequest.getRequestLink());
			if(filePath.contains(StableWeb.FILE_TTF)
					||filePath.contains(StableWeb.FILE_EOT)
					||filePath.contains(StableWeb.FILE_SVG)
					||filePath.contains(StableWeb.FILE_WOFF)
					||filePath.contains(StableWeb.FILE_WOFF2)
					||filePath.contains(StableWeb.FILE_OTF)){
				String code = VPC.getCode(filePath);
				vPCSRequest.setRequestFilePath(filePath);
				vPCSRequest.setRequestFileCode(code);
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BUFFER);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_FONT_WOFF);
				return;
			}	
			vPCSRequest.setRequestForwardType(StableWeb.STREAM_REST);
		}else{
			String filePath = VPC.getFilePath(vPCSRequest.getRequestLink());
			String code = VPC.getCode(filePath);
			vPCSRequest.setRequestFilePath(filePath);
			vPCSRequest.setRequestFileCode(code);
			if(filePath.contains(StableWeb.FILE_PNG)){ 
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_PNG);
			}
			if(filePath.contains(StableWeb.FILE_JPEG)){ 
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_JPEG);
			}
			if(filePath.contains(StableWeb.FILE_JPG)){ 
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_JPG);
			}
			if(filePath.contains(StableWeb.FILE_GIF)){ 
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_GIF);
			}
			if(filePath.contains(StableWeb.FILE_JS) && code.equalsIgnoreCase(StableWeb.CHARSET_UTF_8)){	
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES_BUFFER);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_JS);
			}
			if(filePath.contains(StableWeb.FILE_CSS)){
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BUFFER);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_CSS);
			}
			if(filePath.contains(StableWeb.FILE_HTML)){
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BUFFER);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_HTML);
			}	
			if(filePath.contains(StableWeb.FILE_PDF)){
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_PDF);
			}
			if(filePath.contains(StableWeb.FILE_ZIP)){
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_ZIP);
			}
			if(filePath.contains(StableWeb.FILE_WAV)){
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BUFFER);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_WAV);
			}
				if(filePath.contains(StableWeb.FILE_RAR)){
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_RAR);
			}
			if(filePath.contains(StableWeb.FILE_XML)){
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_XML);
			}
			if(filePath.contains(StableWeb.FILE_TXT)){
				vPCSRequest.setRequestForwardType(StableWeb.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableWeb.HEADER_CONTENT_TYPE_TXT);
			}
		}	
	}

	public static void forwardToRestMap(App app, VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws Exception {
		if(null== vPCSRequest || null== vPCSRequest.getRequestForwardType()){
			vPCSResponse.return404();
			return;
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_REST)){
			RestMap_V.P_Rest(app, vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES)){
			RestMap_V.P_Bytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BUFFER)){
			RestMap_V.P_Buffer(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES_BUFFER)){
			RestMap_V.P_BufferBytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesWithoutZip")){
			RestMap_V.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
		}
	}
	
	public static void forwardToRestMap(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		if(vPCSRequest.getRequestForwardType() == null){
			vPCSResponse.return404();
			return;
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("rest")){
			RestMap_V.P_Rest(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytes")){
			RestMap_V.P_Bytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("buffer")){
			RestMap_V.P_Buffer(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesBuffer")){
			RestMap_V.P_BufferBytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesWithoutZip")){
			RestMap_V.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
		}
	}
}