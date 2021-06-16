package OSI.AOP.MS.VPC.C;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.Rest_C_Port_E;
import SVQ.stable.StableWeb;
import PEU.P.map.*;
public class DBCategory_C {
	public static String exec(String string, Map<String, String> data) 
			throws Exception {
		if(string.equalsIgnoreCase(StableWeb.REST_GET_DB_CATEGORY)){
			return VtoV.ObjectToJsonString(Rest_C_Port_E
					.getDBCategory(data.get(StableWeb.DB_BASE_NAME)
					, data.get(StableWeb.LOGIN_TOKEN),data
					.get(StableWeb.LOGIN_AUTH)));	
		}
		if(string.equalsIgnoreCase(StableWeb.REST_GET_ALL_DB_CATEGORY)){
			return VtoV.ObjectToJsonString(Rest_C_Port_E
					.getAllDBCategory(data.get(StableWeb.LOGIN_TOKEN)
					, data.get(StableWeb.LOGIN_AUTH)));
		}
		return StableWeb.STRING_EMPTY;
	}
}