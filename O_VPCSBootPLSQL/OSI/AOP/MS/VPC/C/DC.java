package OSI.AOP.MS.VPC.C;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_DE;
import SVQ.stable.StableWeb;
import PEU.P.map.*;
public class DC {
	public static String exec(String string, Map<String, String> data)
			throws Exception {
		if(string.equalsIgnoreCase(StableWeb.REST_PATH_DELETE_ROWS_BY_TABLE_PATH_AND_INDEX)){
			return VtoV.ObjectToJsonString(RestDB_DE
					.deleteRowByTablePathAndIndex(data.get("tablePath")
					, data.get("pageIndex"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));
		}	
		return StableWeb.STRING_EMPTY;
	}
}