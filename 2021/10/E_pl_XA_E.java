package OSM.shell;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import OSA.shell.PL_XA_E;
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
public class E_pl_XA_E {
	public static Map<String, Object> E_pl_XA(String plSearch, boolean mod
			, Map<String, Object> output) throws Exception{
		//working for here
		//Map<String, Object> output = new ConcurrentHashMap<>();
		//1make container
		if(null== output) {
			output= new ConcurrentHashMap<>();
		}
		output.put("firstTime", "true");
		output.put("start", "0");
		output.put("countJoins", "0");
		//2make line
		String[] commands= plSearch.replace(" ", "").replace("\n", "").split(";");
		String[] acknowledge= null;
		for(String command:commands) {
			acknowledge= command.split(":");
			if(acknowledge[0].equals("setRoot")) {
				Pl_XA_Command_E.P_SetRoot(acknowledge, output);
			}
			if(acknowledge[0].equals("baseName")) {
				Pl_XA_Command_E.P_BaseName(acknowledge, output);
			}
			if(acknowledge[0].equals("获取表名")) {
				Pl_XA_Command_E.P_TableName(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnName")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("changeCulumnName")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnValue")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("join")) {
				Pl_XA_Command_E.P_Join(acknowledge, output);
			}
			if(acknowledge[0].equals("条件为")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("relation")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("操作")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("PLETL")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("获取表列名")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("PLTCP")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			output.put("newCommand", acknowledge[0]);
			Pl_XA_Command_E.P_E(acknowledge, output, mod);
			output.put("lastCommand", output.get("newCommand"));
		}
		if(null!= acknowledge) {
			if(output.get("start").toString().equals("1")) {
				Pl_XA_Command_E.P_E(acknowledge, output, mod);
			}
		}
		System.out.println("1");
		Pl_XA_Command_E.P_Check(output.get("newCommand").toString(), output, mod);
		return output;
	}

	public static Map<String, Object> E_pl_XA(PL_XA_E orm, boolean b
			, Map<String, Object> output) throws Exception {
		return E_pl_XA(orm.getPLSearch(), true, output);
	}
}