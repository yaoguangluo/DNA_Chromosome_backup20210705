package OSI.AOP.VPC.C;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_QE;
import PEU.P.map.VtoV;

//import org.lyg.common.maps.VtoV;
//import org.lyg.vpc.P.portImpl.RestDBSelectImpl;
//今天集成后 进行元基更新
//罗瑶光 20210730
public class Q_C {
	public static String exec(String string, Map<String, String> data) throws Exception {
		if(string.equalsIgnoreCase("/selectRowsByAttribute")){
			return VtoV.ObjectToJsonString(RestDB_QE.selectRowsByAttribute(data.get("baseName")
					, data.get("tableName"), data.get("culumnName"), data.get("value"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));	
		}
		
		if(string.equalsIgnoreCase("/selectRowsByTablePath")){
			return VtoV.ObjectToJsonString(RestDB_QE.selectRowsByTablePath(data.get("tablePath")
					, data.get("pageBegin"), data.get("pageEnd"), data.get("direction"), data.get("token")
					, data.get("email"), data.get("password"), data.get("auth")));
		}
		return "";
	}
}