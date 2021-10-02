package OSM.shell;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import OSA.shell.PL_XA_E;
//�Ժ�DMA�ļ����ڴ�����滻�� jtable���ڴ���� ������
public class E_PLSearch_E {
	public static Map<String, Object> E_PLSearch(String plSearch, boolean mod) throws Exception{
		//working for here
		Map<String, Object> output = new ConcurrentHashMap<>();
		//1make container
		output.put("start", "0");
		output.put("countJoins", "0");
		//2make line
		String[] commands = plSearch.replace(" ", "").replace("\n", "").split(";");
		String[] acknowledge = null;
		for(String command:commands) {
			acknowledge = command.split(":");
			if(acknowledge[0].equals("setRoot")) {
				PLSearchCommand_E.P_SetRoot(acknowledge, output);
			}
			if(acknowledge[0].equals("baseName")) {
				PLSearchCommand_E.P_BaseName(acknowledge, output);
			}
			if(acknowledge[0].equals("����")) {
				PLSearchCommand_E.P_TableName(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnName")) {
				PLSearchCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("changeCulumnName")) {
				PLSearchCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnValue")) {
				PLSearchCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("join")) {
				PLSearchCommand_E.P_Join(acknowledge, output);
			}
			if(acknowledge[0].equals("����")) {
				PLSearchCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("relation")) {
				PLSearchCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("����")) {
				PLSearchCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("��ȡ����")) {
				PLSearchCommand_E.P_ListNeedStart(acknowledge, output);
			}
			output.put("newCommand", acknowledge[0]);
			PLSearchCommand_E.P_E(acknowledge, output, mod);
			output.put("lastCommand", output.get("newCommand"));
		}
		if(null!= acknowledge) {
			if(output.get("start").toString().equals("1")) {
				PLSearchCommand_E.P_E(acknowledge, output, mod);
			}
		}
		System.out.println("1");
		PLSearchCommand_E.P_Check(output.get("newCommand").toString(), output, mod);
		return output;
	}

	public static Map<String, Object> E_PLSearch(PL_XA_E orm, boolean b) throws Exception {
		return E_PLSearch(orm.getPLSearch(), true);
	}
}