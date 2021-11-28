package OSM.shell;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import OSA.shell.XA_ShellQ_JoinRows_E;
import OSA.shell.XA_ShellQ_Rows_E;
import OSA.shell.XA_ShellTable;
import OSA.shell.XA_ShellTables;
import PEU.P.cache.*;
import SVQ.stable.StableShellETL;
@SuppressWarnings("unchecked")
public class Pl_XA_Command_E {
	public static void P_SetRoot(String[] acknowledge, Map<String, Object> output) throws Exception {
		String dbPath = acknowledge[1];
		for(int i=2; i<acknowledge.length; i++) {
			dbPath += ":" + acknowledge[i];
		}
		if(null != Cache_M.getCacheInfo("DBPath")) {
			File file = new File(dbPath);
			if(!file.exists()) {
				file.mkdirs();
				Cache c = new Cache();
				c.I_Value(dbPath);
				Cache_M.putCache("DBPath", c);
			}else if(file.isFile()) {
				throw new Exception();
			}else if(file.isDirectory()) {
				Cache c = new Cache();
				c.I_Value(dbPath);
				Cache_M.putCache("DBPath", c);
			}
		}
	}

	public static void P_BaseName(String[] acknowledge, Map<String, Object> object) {
		object.put(acknowledge[0], acknowledge[1]);
	}

	public static void P_TableName(String[] acknowledge, Map<String, Object> object) {
		object.put(acknowledge[0], acknowledge[1]);
		object.put("type", acknowledge[2]);
	}

	public static void P_ListNeedStart(String[] acknowledge, Map<String, Object> object) {
		object.put("start", "1");
		if(object.containsKey(acknowledge[0])) {
			List<String[]> relationValues = (List<String[]>) object.get(acknowledge[0]);
			relationValues.add(acknowledge);
			object.put(acknowledge[0], relationValues);
			return;
		}
		List<String[]> relationValues = new CopyOnWriteArrayList<>();
		relationValues.add(acknowledge);
		object.put(acknowledge[0], relationValues);
	}

	public static void P_Join(String[] acknowledge, Map<String, Object> object) {
		if(object.get("countJoins").toString().equals("1")) {
			object.put("countJoins", "n");
		}
		if(object.get("countJoins").toString().equals("0")) {
			object.put("countJoins", "1");
		}
		object.put(StableShellETL.SHELL_ETL_JOIN_BASE_NAME, acknowledge[1]);
		object.put("joinTableName", acknowledge[2]);
	}

	public static void P_E(String[] acknowledge, Map<String, Object> object, boolean mod) throws Exception {
		if(object.get("start").toString().equals("1")) {
			if(!acknowledge[0].equalsIgnoreCase(object.get("lastCommand").toString())
					&&(object.get("lastCommand").toString().contains("changeCulumnName")
							||object.get("lastCommand").toString().contains("culumnValue")
							||object.get("lastCommand").toString().contains("����Ϊ")
							||object.get("lastCommand").toString().contains("relation")
							||object.get("lastCommand").toString().contains("����")
							||object.get("lastCommand").toString().contains("PLETL")
							||object.get("lastCommand").toString().contains("PLTCP")
							||object.get("lastCommand").toString().contains("��ȡ������")
							||object.get("lastCommand").toString().contains(StableShellETL.SHELL_ETL_CULUMNNAME)
							||object.get("lastCommand").toString().contains("relation"))) {
				P_E_Kernel(object, mod);
			}
		}
	}
	//���������, ��, ׼����֤ ������
	private static void P_E_Kernel(Map<String, Object> object, boolean mod) throws Exception{
		if(object.get("type").toString().equalsIgnoreCase("����ѡ��") && 
				(object.get("countJoins").toString().equalsIgnoreCase("0") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && 
								object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey("����Ϊ")) {
				object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfCondition(object));
			}
			if(object.containsKey("����")) {
				//plsearch ��ɸѡ ��������չ��������20210927
				object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfAggregation(object));
			}
			if(object.containsKey("��ȡ������")) {
				object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfGetCulumns(object));
			}
			if(object.containsKey("PLETL")) {
				object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfPLETL(object));
			}
			if(object.containsKey("PLTCP")) {
				object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfPLTCP(object));
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("����ѡ��") && 
				(object.get("countJoins").toString().equalsIgnoreCase("n") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && 
								!object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey(StableShellETL.SHELL_ETL_CONDITION)) {
				object.put("joinObj", XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinCondition(object));
			}
			if(object.containsKey("relation")) {
				object.put("obj", XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinRelation(object));
			}
			if(object.containsKey("aggregation")) {
				//object.put("obj", SearchShellQ_JoinRows_E.selectRowsByAttributesOfJoinAggregation(object));
			}
			if(object.containsKey("getCulumns")) {
				object.put("joinObj", XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinGetCulumns(object));
			}
			if(object.containsKey("PLETL")) {
				//				object.put("obj", SearchShellQ_Rows_E.selectRowsByAttributesOfPLETL(object));
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("create")){
			if(object.containsKey(StableShellETL.SHELL_ETL_CULUMNNAME)) {
				//I_Tables_E.I_Table(object, mod);
			}
			object.remove("recordRows");
		}
		//��ɢ��ѧ��conjuction�任  a^&&b^&&c * kernel[] = (a^&&b^)^^&&c * kernel[] = (a||b)^&&c * kernel[]
		if(object.get("type").toString().equalsIgnoreCase("update") && 
				(object.get("countJoins").toString().equalsIgnoreCase("0") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && 
								object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey(StableShellETL.SHELL_ETL_CONDITION)) {
				//object.put("updateObj", U_Rows_E.updateRowsByAttributesOfCondition(object, mod));
			}
			if(object.containsKey("aggregation")) {
				//object.put("updateObj", U_Rows_E.updateRowsByAttributesOfAggregation(object, mod));
			}
			if(object.containsKey("culumnValue")) {
				//U_Rows_E.updateRowsByRecordConditions(object, mod);
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("update") && 
				(object.get("countJoins").toString().equalsIgnoreCase("n") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && 
								!object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey(StableShellETL.SHELL_ETL_CONDITION)) {
				//object.put("updateJoinObj", U_JoinRows_E.updateRowsByAttributesOfJoinCondition(object, mod));
			}
			if(object.containsKey("relation")) {
				//object.put("updateObj", U_JoinRows_E.updateRowsByAttributesOfJoinRelation(object, mod));
			}
			if(object.containsKey("aggregation")) {
				//object.put("updateObj", U_JoinRows_E.updateRowsByAttributesOfJoinAggregation(object, mod));
			}
			if(object.containsKey("culumnValue")) {
				//U_Rows_E.updateRowsByRecordConditions(object, mod);
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("insert")) {
			if(object.containsKey("culumnValue")) {
				//IU_Rows_E.IU_RowByAttributes(object, mod);
			}
		}
		if(object.get("type").toString().equalsIgnoreCase("delete")) {
			if(object.containsKey(StableShellETL.SHELL_ETL_CONDITION)) {
				//D_Rows_E.D_RowByAttributesOfCondition(object, mod);
			}
		}
		object.remove("����Ϊ");
		object.remove(StableShellETL.SHELL_ETL_CULUMNNAME);
		object.remove("changeCulumnName");
		object.remove("relation");
		object.remove("����");
		object.remove("��ȡ������");
		object.remove("PLETL");
		object.remove("PLTCP");
		object.put("start", "0");
	}

	//plsql����ִ��ָ�� ���ڼ���� ������ 20210405
	public static void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception {
		if(object.get("start").toString().equals("1")) {
			P_E_Kernel(object, mod);
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		int totalPages = 0;
		if(obj != null) {
			totalPages = obj.size();
		}
		int rowBeginIndex = object.containsKey("pageBegin")? Integer.valueOf(object.get("pageBegin").toString()):0;
		int rowEndIndex = object.containsKey("pageEnd")?Integer.valueOf(object.get("pageEnd").toString()):totalPages>15?15:totalPages;
		object.put("pageBegin", rowBeginIndex);
		object.put("pageEnd", rowEndIndex);

		//		String DBPath= Cache_M.getCacheInfo("DBPath").getValue().toString() + "/" + object.get("baseName").toString();
		//		String DBTablePath = DBPath + "/" + object.get("tableName").toString();

		object.put("tablePath", (null== object.get("��ȡ����")? "": object.get("��ȡ����")).toString());
		object.put("returnResult", "success");
		object.put("totalPages", totalPages);
		object.put("loginInfo", "success");
		List<Object> spec = new ArrayList<>();
		//		Iterator<String> iterator = new ArrayList<String>().iterator();
		//		if(obj== null || obj.size()< 1) {
		//			//Base base= DetaDBBufferCache_M.db.getBase(object.get("baseName").toString());
		//			SearchShellTable table= SearchShellTables.searchShellTables.get(object.get("tableName").toString());
		//			Object[] specs= table.getHuaRuiJiJtableCulumns();
		//		}else {//����map ��֤��� ������ 20210405
		//			Map<String, Object> map= obj.get(0);
		//			Map<String, Object> objectInMap= (Map<String, Object>)map.get(StableShellETL.SHELL_ETL_ROWVALUE);
		//			iterator = null== objectInMap? null:objectInMap.keySet().iterator();
		//		}
		XA_ShellTable table= XA_ShellTables.searchShellTables.get((null== object.get("��ȡ����")? "": object.get("��ȡ����")).toString());
		if(null!= table) {
			Object[] specs= table.getHuaRuiJiJtableCulumns();
			for(Object specS: specs) {
				spec.add(specS);
			}
			object.put("spec", spec);
		}
	}

	public static void P_StoreValues(String[] acknowledge, Map<String, Object> output) {
		// TODO Auto-generated method stub
		//���û�г�ʼ�ͳ�ʼ
		//����Ѿ���ʼ�ʹ�ֵ
		//0   1   2   3
		//��:����:Ϊ:ddsdsds
		if(acknowledge[0].contains("��")&& acknowledge[2].contains("Ϊ")) {
			StableShellETL.storeValue.put(acknowledge[1].toString(), acknowledge[3].toString());	
		}
	}
	//֮��׼����Ƴɹ����� ���� ������ bean
	public static void P_fileOperations(String[] acknowledge, Map<String, Object> output) {
		//ȷ���ļ���:·��:��������
		if(acknowledge[0].equals("ȷ���ļ���")) {
			String filePath= (StableShellETL.storeValue.containsKey(acknowledge[1])? StableShellETL.storeValue.get(acknowledge[1]): acknowledge[1]);
			StableShellETL.storeValue.put("ȷ���ļ���", filePath.toString().replace("\\:", ":"));		
		}
		
//		 ƥ������:�ļ�����:����:java;
//		  *     ƥ������:�ļ���СKB:С��:200;
//		  *     ƥ������:�ļ���:����:����;
//		  *     ƥ������:�滻:5:�м���:10;
		if(acknowledge[0].equals("ƥ������")) {
			if(acknowledge[1].equals("�ļ�����")) {
				StableShellETL.storeValue.put("�ļ�����", acknowledge[3].toString());	
			}else
			if(acknowledge[1].equals("�ļ���СKB")) {
				StableShellETL.storeValue.put("�ļ���СKB", acknowledge[3].toString());		
			}else
			if(acknowledge[1].equals("�ļ���")) { 
				StableShellETL.storeValue.put("�ļ���", acknowledge[3].toString());	
			}else
			if(acknowledge[1].equals("�滻")) {
				if(acknowledge[3].equals("�м���")) {
					StableShellETL.storeValue.put("beginLine", acknowledge[2].toString());	
					StableShellETL.storeValue.put("endLine", acknowledge[4].toString());						
				}

			}
		}
		
		//��:�ַ���:�滻Ϊ:�滻;
		if(acknowledge[0].equals("��")) {
			if(acknowledge[2].equals("�滻Ϊ")) {
				//new ShellReplace().replaceString("C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample", ">_<", "..>_<.."); 
				try {
					Map<String, String> conditions= new HashMap<>();
					conditions.put("fileType",(StableShellETL.storeValue.containsKey("�ļ�����")? StableShellETL.storeValue.get("�ļ�����"): ""));
					conditions.put("fileName", (StableShellETL.storeValue.containsKey("�ļ���")? StableShellETL.storeValue.get("�ļ���"): ""));
					conditions.put("filesize_KB",(StableShellETL.storeValue.containsKey("�ļ���СKB")? StableShellETL.storeValue.get("�ļ���СKB"): ""));
					conditions.put("beginLine", (StableShellETL.storeValue.containsKey("beginLine")? StableShellETL.storeValue.get("beginLine"): ""));
					conditions.put("endLine", (StableShellETL.storeValue.containsKey("endLine")? StableShellETL.storeValue.get("endLine"): ""));
					conditions.put("searchString", (StableShellETL.storeValue.containsKey(acknowledge[1])? StableShellETL.storeValue.get(acknowledge[1]): acknowledge[1]));
					conditions.put("needReplaceString", (StableShellETL.storeValue.containsKey(acknowledge[3])? StableShellETL.storeValue.get(acknowledge[3]): acknowledge[3]));
					conditions.put("fileDirectroyPath", StableShellETL.storeValue.get("ȷ���ļ���"));
					System.out.println("--->>"+ StableShellETL.storeValue.get("ȷ���ļ���"));
					conditions.put("replaceLogPath", StableShellETL.storeValue.get("ȷ���ļ���")+ "\\replace_Log.lyg");//\\ֻ������windows���ǵ� / �Ƚϡ�
					ShellReplace shellReplace=	new ShellReplace();
					shellReplace.replaceStringWithLogRecording(conditions); 
				}catch(Exception e) {
					//�Ժ�дrollback
					//˼�����¸ĳ���򵥵Ĳ��ԡ�
					//�滻�����ǳ������ˡ�ֱ�ӽ�backup�ļ��滻���ɡ�
					//�ع���Ƴ� exception����ģʽ�� ������
					//shellReplace.rollbackWithRecordingLog(conditions);,,	
				}
			}
		}
	}
}