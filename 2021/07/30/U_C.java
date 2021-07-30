package OSI.AOP.VPC.C;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_UE;
import PEU.P.map.VtoV;
//import org.lyg.common.maps.VtoV;
//import org.lyg.vpc.P.portImpl.RestDBUpdateImpl;
public class U_C {
	public static String exec(String string, Map<String, String> data) throws Exception {
		if(string.equalsIgnoreCase("/selectRowsByAttribute")){
			return VtoV.ObjectToJsonString(RestDB_UE.updateRowByTablePathAndIndex(data.get("tablePath"), data.get("pageIndex")
					, data.get("culumnOfUpdateRow"), data.get("token"), data.get("email"), data.get("password"), data.get("auth")));
		}
		return "";
	}
}