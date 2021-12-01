package OSM.shell;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.tinos.regex.DoSplit;

import ESU.list.List_ESU;
import OSA.shell.PL_XA_E;
import SVQ.stable.StableShellETL;
//�Ժ�DMA�ļ����ڴ�����滻�� jtable���ڴ���� ������
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
		List<String> lists= new DoSplit().splitRegex(plSearch.replace(" ", "").replace("\n", "")
				, ";"
				, "\\");
		String[] commands= List_ESU.StringlistToStringArray(lists);
		//String[] commands= plSearch.replace(" ", "").replace("\n", "").split(";");
		String[] acknowledge= null;
		for(String command:commands) {
			List<String> commandLists= new DoSplit().splitRegex(command
					, ":"
					, "\\");
			acknowledge= List_ESU.StringlistToStringArray(commandLists);
//			acknowledge= command.split(":");
			if(acknowledge[0].equals("setRoot")) {
				Pl_XA_Command_E.P_SetRoot(acknowledge, output);
			}
			if(acknowledge[0].equals("baseName")) {
				Pl_XA_Command_E.P_BaseName(acknowledge, output);
			}
			if(acknowledge[0].equals("��ȡ����")) {
				Pl_XA_Command_E.P_TableName(acknowledge, output);
			}
			if(acknowledge[0].equals("��")) {//������������洢��
				Pl_XA_Command_E.P_StoreValues(acknowledge, output);
			}
			 //ȷ���ļ���:·��:��������
			if(acknowledge[0].equals("ȷ���ļ���")) {//׼������ļ��м���
				Pl_XA_Command_E.P_fileOperations(acknowledge, output);
			}
			//��:�ַ���:�滻Ϊ:�滻;
			if(acknowledge[0].equals("��")) {//׼������ļ��м���
				Pl_XA_Command_E.P_fileOperations(acknowledge, output);
			}
			if(acknowledge[0].equals(StableShellETL.SHELL_ETL_CULUMNNAME)) {
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
			if(acknowledge[0].equals("����Ϊ")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("relation")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("����")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("PLETL")) {
				Pl_XA_Command_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("��ȡ������")) {
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