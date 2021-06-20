package OSI.AOP.MS.VPC.C;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_IUE;
import SVQ.stable.StableWeb;
import PEU.P.map.*;
public class IUC {
	public static String exec(String string, Map<String, String> data) 
			throws Exception {
		if(string.equalsIgnoreCase(StableWeb.REST_PATH_INSERT_ROW_BY_BASE_NAME)){
			return VtoV.ObjectToJsonString(RestDB_IUE
					.insertRowByBaseName(data.get("baseName")
					, data.get("tableName"), data.get("culumnOfNewRow")
					, data.get("token"), data.get("email")
					, data.get("password"), data.get("auth")));
		}
		if(string.equalsIgnoreCase(StableWeb.REST_PATH_INSERT_ROW_BY_TABLE_PATH)){
			return VtoV.ObjectToJsonString(RestDB_IUE
					.insertRowByTablePath(data.get("tablePath")
					, data.get("pageIndex"), data.get("culumnOfNewRow")
					, data.get("token"), data.get("email")
					, data.get("password"), data.get("auth")));
		}
		return StableWeb.STRING_EMPTY;
	}
}