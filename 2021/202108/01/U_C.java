package OSI.AOP.VPC.C;
import java.util.Map;

import org.json.JSONObject;

import MSU.OP.SM.AOP.MEC.SIQ.SM.update.E.U_Rows_E;
import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_UE;
import PEU.P.cache.Cache_M;
import PEU.P.map.VtoV;
//import org.lyg.common.maps.VtoV;
//import org.lyg.vpc.P.portImpl.RestDBUpdateImpl;
public class U_C {
	public static String exec(String string, Map<String, String> data) throws Exception {
		if(string.equalsIgnoreCase("/updateRowByTablePathAndIndex")){
			return VtoV.ObjectToJsonString(RestDB_UE.updateRowByTablePathAndIndex(data.get("tablePath"), data.get("pageIndex")
					, data.get("culumnOfUpdateRow"), data.get("token"), data.get("email"), data.get("password"), data.get("auth")));
		}
		//之前用的json， 我之后会改成map，20210801 罗瑶光
		JSONObject jobj= new JSONObject();
		jobj.put("u_key" , data.get("key"));
		jobj.put("u_password" , data.get("tokenDNA"));
		jobj.put("u_password" , data.get("tokenDNA"));
		String tablePath= Cache_M.getCacheInfo("DBPath").getValue().toString()+ "/"+ data.get("baseName")+ "/"+ data.get("tableName");
		if(string.equalsIgnoreCase("/updateRowByTablePathAndAttribute")){
			return VtoV.ObjectToJsonString(U_Rows_E.updateRowByTablePathAndAttribute(tablePath, data.get("culumnName")
					, data.get("value"), jobj));
		}
		return "";
	}
}