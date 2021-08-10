package MS.VPC.V;
import ME.APM.VSQ.App;
import OSI.AOP.MS.VPC.server.ServerForward_Standard;
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse;
import SVQ.stable.StableHTTP;
import SVQ.stable.StableWeb;
//import OSI.AOP.VPC.PP.port_E.RestLoginPort_E;
//import PEU.P.map.VtoV;
//�ϲ� ���ݿ�� ǰ�˵� vison�ļ�
//������ 20210730
public class Forward_V extends ServerForward_Standard{
	public static void forwardToRestMap(App app, VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws Exception {
		if(null== vPCSRequest || null== vPCSRequest.getRequestForwardType()){
			vPCSResponse.return404();
			return;
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_REST)){
			//������Ƹ�sleeper�̳У�������������Ƹ�condition������ Ȼ�����portʶ�� ���̳����condition �����ˡ��� ������ 20210730
			if(vPCSRequest.getRequestPort().equals(StableHTTP.PORT_DATABASE)) {
				RestMap_V.P_RestDB(app, vPCSRequest, vPCSResponse);
			}else {
				RestMap_V.P_Rest(app, vPCSRequest, vPCSResponse);
			}
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
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableWeb.STREAM_BYTES_WITHOUT_ZIP)){
			RestMap_V.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
		}
	}
}