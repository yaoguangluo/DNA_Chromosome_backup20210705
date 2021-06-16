package MSV.PCS.C;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import MS.VPC.V.VPCSRequest;
import MS.VPC.V.VPCSResponse;
import SVQ.stable.StablePOS;
import SVQ.stable.StableWeb;
public class RequestRecord_C {

	public static void requestIpRecoder(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
		vPCSRequest.setRequestIp(vPCSResponse.getSocket().getInetAddress().getHostAddress());
		vPCSRequest.setRequestName(vPCSResponse.getSocket().getInetAddress().getHostName());
	}

	public static void requestLinkRecoder(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse)
			throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(vPCSResponse.getSocket()
				.getInputStream(), StableWeb.CHARSET_GBK));
		String mess = br.readLine();
		if(null == mess){
			vPCSResponse.returnErrorCode(StableWeb.HTTP_400);
			return;
		}
		if(mess.equalsIgnoreCase(StableWeb.STRING_EMPTY)){
			vPCSResponse.returnErrorCode(StableWeb.HTTP_400);
			return;
		}
		String[] type = mess.split(StableWeb.STRING_SPACE);
		if(type.length < StablePOS.INT_TWO){
			vPCSResponse.returnErrorCode(StableWeb.HTTP_500);
			return;
		}
		String[] content = type[StablePOS.INT_ONE].split(StableWeb.STRING_SLASH_QUESTION);
		if(content.length == StablePOS.INT_TWO){
			vPCSRequest.setRequestIsRest(true);
			if(content[StablePOS.INT_ONE] == null){
				vPCSResponse.returnErrorCode(StableWeb.HTTP_500);
				return;
			}
		}
		if(content[StablePOS.INT_ZERO].contains(StableWeb.STRING_QUATE)){
			//			vPCSRequest.setRequestIsRest(false);
		}
		if(vPCSRequest.getRequestIsRest()){
			String[] column = content[StablePOS.INT_ONE].split(StableWeb.STRING_JUNCTION);
			Map<String, String> data = new ConcurrentHashMap<>();
			for(String cell:column){
				String[] cells = cell.split(StableWeb.MATH_EQUAL);
				data.put(cells[StablePOS.INT_ZERO], URLDecoder.decode(cells[StablePOS.INT_ONE]
						, StableWeb.CHARSET_UTF_8));
			}
			vPCSRequest.setRequestValue(data);	
		}
		vPCSRequest.setRequestLink(content[StablePOS.INT_ZERO]);	
	}
}