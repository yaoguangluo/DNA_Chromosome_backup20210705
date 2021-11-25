package OSM.shell;
import java.io.File;

import java.util.ArrayList;
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
							||object.get("lastCommand").toString().contains("条件为")
							||object.get("lastCommand").toString().contains("relation")
							||object.get("lastCommand").toString().contains("操作")
							||object.get("lastCommand").toString().contains("PLETL")
							||object.get("lastCommand").toString().contains("PLTCP")
							||object.get("lastCommand").toString().contains("获取表列名")
							||object.get("lastCommand").toString().contains(StableShellETL.SHELL_ETL_CULUMNNAME)
							||object.get("lastCommand").toString().contains("relation"))) {
				P_E_Kernel(object, mod);
			}
		}
	}
	//处理机中心, 别急, 准备验证 罗瑶光
	private static void P_E_Kernel(Map<String, Object> object, boolean mod) throws Exception{
		if(object.get("type").toString().equalsIgnoreCase("进行选择") && 
				(object.get("countJoins").toString().equalsIgnoreCase("0") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && 
								object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey("条件为")) {
				object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfCondition(object));
			}
			if(object.containsKey("操作")) {
				//plsearch 的筛选 在这里拓展。罗瑶光20210927
				object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfAggregation(object));
			}
			if(object.containsKey("获取表列名")) {
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
		if(object.get("type").toString().equalsIgnoreCase("进行选择") && 
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
		//离散数学的conjuction变换  a^&&b^&&c * kernel[] = (a^&&b^)^^&&c * kernel[] = (a||b)^&&c * kernel[]
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
		object.remove("条件为");
		object.remove(StableShellETL.SHELL_ETL_CULUMNNAME);
		object.remove("changeCulumnName");
		object.remove("relation");
		object.remove("操作");
		object.remove("获取表列名");
		object.remove("PLETL");
		object.remove("PLTCP");
		object.put("start", "0");
	}

	//plsql函数执行指令 正在检查中 罗瑶光 20210405
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

		object.put("tablePath", object.get("获取表名").toString());
		object.put("returnResult", "success");
		object.put("totalPages", totalPages);
		object.put("loginInfo", "success");
		List<Object> spec = new ArrayList<>();
		//		Iterator<String> iterator = new ArrayList<String>().iterator();
		//		if(obj== null || obj.size()< 1) {
		//			//Base base= DetaDBBufferCache_M.db.getBase(object.get("baseName").toString());
		//			SearchShellTable table= SearchShellTables.searchShellTables.get(object.get("tableName").toString());
		//			Object[] specs= table.getHuaRuiJiJtableCulumns();
		//		}else {//进行map 验证检测 罗瑶光 20210405
		//			Map<String, Object> map= obj.get(0);
		//			Map<String, Object> objectInMap= (Map<String, Object>)map.get(StableShellETL.SHELL_ETL_ROWVALUE);
		//			iterator = null== objectInMap? null:objectInMap.keySet().iterator();
		//		}
		XA_ShellTable table= XA_ShellTables.searchShellTables.get(object.get("获取表名").toString());
		Object[] specs= table.getHuaRuiJiJtableCulumns();
		for(Object specS: specs) {
			spec.add(specS);
		}
		object.put("spec", spec);
	}

	public static void P_StoreValues(String[] acknowledge, Map<String, Object> output) {
		// TODO Auto-generated method stub
		//如果没有初始就初始
		//如果已经初始就存值
		//0   1   2   3
		//设:数据:为:ddsdsds
		if(acknowledge[0].contains("设")&& acknowledge[2].contains("为")) {
			StableShellETL.storeValue.put(acknowledge[1].toString(), acknowledge[3].toString());	
		}
	}
}