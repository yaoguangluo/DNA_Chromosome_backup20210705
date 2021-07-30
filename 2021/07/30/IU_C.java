package OSI.AOP.VPC.C;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_IUE;
import PEU.P.map.VtoV;

//import org.lyg.common.maps.VtoV;
//import org.lyg.vpc.P.portImpl.RestDBInsertImpl;
public class IU_C {
	public static String exec(String string, Map<String, String> data) throws Exception {
		if(string.equalsIgnoreCase("/insertRowByBaseName")){
			return VtoV.ObjectToJsonString(RestDB_IUE.insertRowByBaseName(data.get("baseName")
					, data.get("tableName"), data.get("culumnOfNewRow"), data.get("token"), data.get("email")
					, data.get("password"), data.get("auth")));
		}
		if(string.equalsIgnoreCase("/login")){
			return VtoV.ObjectToJsonString(RestDB_IUE.insertRowByTablePath(data.get("tablePath")
					, data.get("pageIndex"), data.get("culumnOfNewRow"), data.get("token"), data.get("email")
					, data.get("password"), data.get("auth")));
		}
		return "";
	}
}