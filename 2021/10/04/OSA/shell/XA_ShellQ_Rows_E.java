package OSA.shell;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OSM.shell.P_AO_PLETL;
import OSM.shell.P_AO_pl_XA;
import OSM.shell.P_AO_PLTCP;
import OSM.shell.P_CO_pl_XA_XCDX_Cache;
import OSM.shell.P_CO_pl_XA_XCDX_Map;
import OSM.shell.P_I_CulumnsPL_XA;
//���� plsql �滻�� plsearch���Ժ������֤ ������20210927
@SuppressWarnings({ "unused", "unchecked" })
public class XA_ShellQ_Rows_E {
	public static List<Map<String, Object>> selectRowsByAttribute(String currentDB
			, String tableName, String culmnName, Object value) throws IOException{
		if(value==null) {
			value="";
		}
		String objectType = "";
		List<Map<String, Object>> output = new ArrayList<>();
		XA_ShellTable table= XA_ShellTables.searchShellTables.get(tableName);
		//�Ժ������� Table �滻�� SearchShellTable ���ɡ�
		for(int i= 0; i< table.huaRuiJiJtableRows.length; i++ ) {
			//Object[] row= table.huaRuiJiJtable[count];
			//����Ҫ���map����Ȼ ����� keyֵ��ѯ ֻ��forloop�� Ч�ʼ���
			Row row= table.huaRuiJiJtableRows[i];		
			if(row.getCell(culmnName).equals(value)) {
				output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
			}
		}
		return output;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		try {
			new XA_ShellQ_Rows_E().selectRowsByAttribute("backend", "login"
					, "usr_name", "yaoguangluo");
			// deletefile("D:/file");
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
		System.out.println("ok");
	}

	//���쿴���·����ҵ����ݿ� û�з�ҳ���Ժ�����һ���ļ������Ϊ3000 rows 
	//һҳ���Ȳ����ˣ�shell �ò���sheets�߼���
	//������20210927
	public static Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction) throws IOException {
		Map<String, Object> output= new HashMap<>();
		XA_ShellTable table= XA_ShellTables.searchShellTables.get(tablePath);
		output.put("tablePath", tablePath);
		int rowBeginIndex= Integer.valueOf(pageBegin);
		int rowEndIndex= Integer.valueOf(pageEnd);
		int totalPages= (rowEndIndex- rowBeginIndex)/15; //�Ժ��Ż��������һ�����ܡ�
		int totalRows= table.huaRuiJiJtableRows.length;	
		List<Object> rowMapList= new ArrayList<>();
		int operationRowIndex= direction.contains("next")? rowEndIndex++: --rowBeginIndex;
		Map<String, Object> culumnMaps = new HashMap<>();
		Here:
			for(int i= operationRowIndex; i< operationRowIndex+ 15; i++) {
				Map<String, Object> rowMap = new HashMap<>();
				if(i>= table.huaRuiJiJtableRows.length) {
					continue Here;
				}
				Row row= table.huaRuiJiJtableRows[i];
				Iterator<String> iterator= row.getCells().keySet().iterator();
				while(iterator.hasNext()) {
					String culumnName= iterator.next();
					Map<String, Object> culumnMap = new HashMap<>();
					culumnMap.put("culumnName", culumnName);
					culumnMap.put("culumnValue",  row.getCells().get(culumnName));
					culumnMaps.put(culumnName, culumnMap);
				}	
				rowMap.put("rowValue", culumnMaps);
				if(direction.contains("next")) {
					rowMap.put("rowIndex", rowEndIndex-1);
					rowMapList.add(rowMap);
				}else {
					rowMap.put("rowIndex", rowBeginIndex);
					rowMapList.add(0, rowMap);
				}
			}			
		if(direction.contains("next")) {//��next�� ��
			output.put("pageBegin", Integer.valueOf(pageEnd));
			output.put("pageEnd", rowEndIndex);
			output.put("totalPages", totalRows);
		}else {
			output.put("pageBegin", rowBeginIndex);
			output.put("pageEnd", Integer.valueOf(pageBegin));
			output.put("totalPages", totalRows);
		}
		output.put("obj", rowMapList);
		List<Object> spec= new ArrayList<>();
		Map<String, Object> row = (Map<String, Object>) rowMapList.get(0);
		Map<String, Object> culumns = (Map<String, Object>) row.get("rowValue");

		Iterator<String> it=culumns.keySet().iterator();
		while(it.hasNext()) {
			spec.add(((Map<String, Object>)culumns.get(it.next())).get("culumnName").toString());
		}
		output.put("spec", spec);
		return output;
	}


	//db�滻shell�� 20210927
	public static Object selectRowsByAttributesOfCondition(Map<String, Object> object) throws IOException {
		if(!object.containsKey("recordRows")) {
			Map<String, Boolean> recordRows= new ConcurrentHashMap<>();
			object.put("recordRows", recordRows);
		}
		List<Map<String, Object>> output = new ArrayList<>();
		//SearchShellTable table= SearchShellTables.searchShellTables.get(object.get("tableName").toString());
		List<String[]> conditionValues = (List<String[]>) object.get("����Ϊ");//��������
		Iterator<String[]> iterator = conditionValues.iterator();
		while(iterator.hasNext()) {
			String[] conditionValueArray= iterator.next();
			String type= conditionValueArray[1];
			boolean andMap= type.equalsIgnoreCase("��")?true:false;
			boolean orMap= type.equalsIgnoreCase("��")?true:false;
			for(int i = 2; i< conditionValueArray.length; i++) {
				String[] sets= conditionValueArray[i].split("\\|");
				//if(andMap) {//����map ��cacheһ���ˣ��Ժ��׼����cache ���б��ػ��滯����֤���ƾ��Ĳ����汾��
				//	P_ConditionPLSearch_XCDX_Map.P_Map(sets, output, object.get("��ȡ����").toString());//1
				//}else{//�������P_Cache �߼��ĳ� or map ������ 20211004
				//	P_ConditionPLSearch_XCDX_Cache.P_Cache(sets, output, object.get("��ȡ����").toString()
				//		, object);//1
				//}//shell�ű�ȥ��DMA

				//and ������output ��ֵ
				//and ������output ��ֵ
				//or ������output ��ֵ
				//or ������output ��ֵ

				//1 �ȼ���Ƿ���record row				
				boolean hasOutputMap= output.size()== 0? false: true;
				ConcurrentHashMap<Integer, Object> map= (ConcurrentHashMap<Integer, Object>) object.get("recordRows");
				boolean hasRecordMap= map.isEmpty()? false: true;

				if((hasOutputMap|| hasRecordMap)&& andMap) {
					//������һ������ �ǲ��ǵ�һ�� ִ������Ϊ 
					//������ 20211015
					P_CO_pl_XA_XCDX_Map.P_Map(sets, output, object.get("��ȡ����").toString(), object);
				}else {
					P_CO_pl_XA_XCDX_Cache.P_Cache(sets, output, object.get("��ȡ����").toString()
							, object, type);//1
				}//shell�ű�ȥ��DMA

				//P_ConditionPLSearch_XCDX_Cache.P_Cache(sets, output, object.get("��ȡ����").toString()
				//		, object, type);//1

			}
		}

		return output;
	}

	//20210927 ע���� �Ժ��滻
	//����Ƴ� plsearch �﷨�� plsql �﷨ͨ�ã� ������֮���plorm ͳһһ�ַ�ʽ��չ pladmin
	public static List<Map<String, Object>> selectRowsByAttributesOfAggregation(Map<String, Object> object) 
			throws InstantiationException, IllegalAccessException, IOException {
		if(!object.containsKey("obj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> aggregationValues = (List<String[]>) object.get("����");
		Iterator<String[]> iterator = aggregationValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = obj.size() == 0? false: true;
			String[] aggregationValueArray = iterator.next();
			String type = aggregationValueArray[1];
			boolean limitMap = type.equalsIgnoreCase("����")?true:false;
			boolean otherMap = type.equalsIgnoreCase("")?true:false;
			for(int i = 1; i < aggregationValueArray.length; i++) {
				String[] sets = aggregationValueArray[i].split("\\|");
				if(limitMap|| !otherMap ) {
					P_AO_pl_XA.P_AggregationLimitMap(sets, obj);
				}
				//����sort key ǰ��treeMap ֮�����������
				//����sort key ����treeMap
			}
		}
		return obj;
	}

	public static Object selectRowsByAttributesOfGetCulumns(Map<String, Object> object) {
		if(!object.containsKey("obj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj= ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> getCulumnsValues= (List<String[]>) object.get("��ȡ������");
		Iterator<String[]> iterator= getCulumnsValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap= obj.size()== 0? false: true;
			String[] getCulumnsValueArray= iterator.next();
			if(overMap) {
				P_I_CulumnsPL_XA.P_GetCulumnsMap(obj, getCulumnsValueArray);
			}
		}
		return obj;
	}

	//PLETL����һ�֮࣬��׼���ֳ�ȥ
	//������ 20211010
	public static Object selectRowsByAttributesOfPLETL(Map<String, Object> object)
			throws InstantiationException, IllegalAccessException, IOException {
		if(!object.containsKey("obj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> aggregationValues = (List<String[]>) object.get("PLETL");
		Iterator<String[]> iterator = aggregationValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = obj.size() == 0? false: true;
			String[] aggregationValueArray = iterator.next();
			String type = aggregationValueArray[1];
			boolean limitMap = type.equalsIgnoreCase("����")?true:false;
			boolean otherMap = type.equalsIgnoreCase("")?true:false;
			for(int i = 1; i < aggregationValueArray.length; i++) {
				String[] sets = aggregationValueArray[i].split("\\|");
				if(limitMap|| !otherMap ) {
					P_AO_PLETL.P_PletlLimitMap(sets, obj, object);
				}
				//����sort key ǰ��treeMap ֮�����������
				//����sort key ����treeMap
			}
		}
		return obj;
	}
	public static Object selectRowsByAttributesOfPLTCP(Map<String, Object> object) throws IOException {
		if(!object.containsKey("obj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj= ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> aggregationValues= (List<String[]>) object.get("PLTCP");
		Iterator<String[]> iterator= aggregationValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap= obj.size()== 0? false: true;
			String[] aggregationValueArray= iterator.next();
			String type= aggregationValueArray[1];
			boolean limitMap= type.equalsIgnoreCase("����")?true:false;
			boolean otherMap= type.equalsIgnoreCase("")?true:false;
			for(int i= 1; i< aggregationValueArray.length; i++) {
				String[] sets= aggregationValueArray[i].split("\\|");
				if(limitMap|| !otherMap ) {
					P_AO_PLTCP.P_PltcpLimitMap(sets, obj, object);
				}
				//����sort key ǰ��treeMap ֮�����������
				//����sort key ����treeMap
			}
		}
		return obj;
	}
}