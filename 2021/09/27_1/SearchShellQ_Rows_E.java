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
import OSM.shell.P_AggregationPLSearch;
import OSM.shell.P_ConditionPLSearch_XCDX_Cache;
import OSM.shell.P_ConditionPLSearch_XCDX_Map;
import OSM.shell.P_GetCulumnsPLSearch;
//整体 plsql 替换成 plsearch，稍后测试验证 罗瑶光20210927
@SuppressWarnings({ "unused", "unchecked" })
public class SearchShellQ_Rows_E {
	public static List<Map<String, Object>> selectRowsByAttribute(String currentDB
			, String tableName, String culmnName, Object value) throws IOException{
		if(value==null) {
			value="";
		}
		String objectType = "";
		List<Map<String, Object>> output = new ArrayList<>();
		SearchShellTable table= SearchShellTables.searchShellTables.get(tableName);
		//稍后把下面的 Table 替换成 SearchShellTable 即可。
		for(int i= 0; i< table.huaRuiJiJtableRows.length; i++ ) {
			//Object[] row= table.huaRuiJiJtable[count];
			//还是要变成map，不然 命令的 key值查询 只能forloop， 效率减低
			Row row= table.huaRuiJiJtableRows[i];		
			if(row.getCell(culmnName).equals(value)) {
				output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
			}
		}
		return output;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		try {
			new SearchShellQ_Rows_E().selectRowsByAttribute("backend", "login"
					, "usr_name", "yaoguangluo");
			// deletefile("D:/file");
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
		System.out.println("ok");
	}

	//今天看了下发现我的数据库 没有分页，以后会设计一个文件夹最大为3000 rows 一页，先不管了，shell 用不到sheets逻辑。
	//罗瑶光20210927
	public static Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction) throws IOException {
		Map<String, Object> output= new HashMap<>();
		SearchShellTable table= SearchShellTables.searchShellTables.get(tablePath);
		output.put("tablePath", tablePath);
		int rowBeginIndex= Integer.valueOf(pageBegin);
		int rowEndIndex= Integer.valueOf(pageEnd);
		int totalPages= (rowEndIndex- rowBeginIndex)/15; //稍后优化，多加了一个功能。
		int totalRows= table.huaRuiJiJtableRows.length;	
		List<Object> rowMapList= new ArrayList<>();
		int operationRowIndex= direction.contains("next")? rowEndIndex++: --rowBeginIndex;
		Map<String, Object> culumnMaps = new HashMap<>();
		Here:
			for(int i= operationRowIndex; i< 15; i++) {
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
		if(direction.contains("next")) {//有next， 就
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

		//total pages  懒得管了，		
		//		Map<String, Object> output = new HashMap<>();
		//		int totalPages = 0;
		//		output.put("tablePath", tablePath);
		//		int rowBeginIndex = Integer.valueOf(pageBegin);
		//		int rowEndIndex = Integer.valueOf(pageEnd);
		//		String objectType = "";
		//		List<Object> rowMapList = new ArrayList<>();
		//		File fileDBTable = new File(tablePath);
		//		if (fileDBTable.isDirectory()) {
		//			String DBTableRowsPath = tablePath + "/rows";	
		//			File fileDBTableRowsPath = new File(DBTableRowsPath);
		//			if (fileDBTableRowsPath.isDirectory()) {
		//				File[] files = fileDBTableRowsPath.listFiles();
		//				totalPages = files.length;
		//				int i = 0;
		//				int index = 0;
		//				Here:
		//					while(i<15) {
		//						String DBTableRowIndexPath = DBTableRowsPath + "/row" + (direction.contains("next")? rowEndIndex++: --rowBeginIndex);	
		//						File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
		//						if (!readDBTableRowIndexFile.exists()) {
		//							break;
		//						}
		//						File deleteTest = new File(DBTableRowIndexPath + "/is_delete_1");
		//						if (deleteTest.exists()) {
		//							continue Here;
		//						}
		//						i++;
		//						Map<String, Object> rowMap = new HashMap<>();
		//						String[] readDBTableRowCulumnsIndexFile = readDBTableRowIndexFile.list();
		//						Map<String, Object> culumnMaps = new HashMap<>();
		//						NextFile:
		//							for(String readDBTableRowCulumnIndexFile: readDBTableRowCulumnsIndexFile) {
		//								if(readDBTableRowCulumnIndexFile.contains("is_delete")) {
		//									continue NextFile;
		//								}
		//								Map<String, Object> culumnMap = new HashMap<>();
		//								String DBTableRowIndexCulumnPath = DBTableRowIndexPath + "/" + readDBTableRowCulumnIndexFile;	
		//								File readDBTableRowIndexCulumnFile = new File(DBTableRowIndexCulumnPath);
		//								if (readDBTableRowIndexCulumnFile.exists()) {
		//									String temp = "";
		//									FileInputStream fis = new FileInputStream(new File(DBTableRowIndexCulumnPath + "/value.lyg"));
		//									BufferedInputStream bis = new BufferedInputStream(fis);
		//									byte[] buffer = new byte[1024];
		//									int cnt;
		//									while((cnt = bis.read(buffer)) != -1) {
		//										temp += new String(buffer, 0, cnt);
		//									}
		//									fis.close();
		//									bis.close(); 
		//									culumnMap.put("culumnName", readDBTableRowCulumnIndexFile);
		//									culumnMap.put("culumnValue", temp);
		//									culumnMaps.put(readDBTableRowCulumnIndexFile, culumnMap);
		//								}
		//							} 
		//						rowMap.put("rowValue", culumnMaps);
		//						if(direction.contains("next")) {
		//							rowMap.put("rowIndex", rowEndIndex-1);
		//							rowMapList.add(rowMap);
		//						}else {
		//							rowMap.put("rowIndex", rowBeginIndex);
		//							rowMapList.add(0, rowMap);
		//						}
		//					}
		//			}
		//		}
		//		if(direction.contains("next")) {
		//			output.put("pageBegin", Integer.valueOf(pageEnd));
		//			output.put("pageEnd", rowEndIndex);
		//			output.put("totalPages", totalPages);
		//		}else {
		//			output.put("pageBegin", rowBeginIndex);
		//			output.put("pageEnd", Integer.valueOf(pageBegin));
		//			output.put("totalPages", totalPages);
		//		}
		//		output.put("obj", rowMapList);
		//		List<Object> spec= new ArrayList<>();
		//		Map<String, Object> row = (Map<String, Object>) rowMapList.get(0);
		//		Map<String, Object> culumns = (Map<String, Object>) row.get("rowValue");
		//
		//		Iterator<String> it=culumns.keySet().iterator();
		//		while(it.hasNext()) {
		//			spec.add(((Map<String, Object>)culumns.get(it.next())).get("culumnName").toString());
		//		}
		//		output.put("spec", spec);
		//		return output;
	}


	//db替换shell中 20210927
	public static Object selectRowsByAttributesOfCondition(Map<String, Object> object) throws IOException {
		if(!object.containsKey("recordRows")) {
			Map<String, Boolean> recordRows= new ConcurrentHashMap<>();
			object.put("recordRows", recordRows);
		}
		List<Map<String, Object>> output = new ArrayList<>();
		//SearchShellTable table= SearchShellTables.searchShellTables.get(object.get("tableName").toString());
		List<String[]> conditionValues = (List<String[]>) object.get("condition");//条件计算
		Iterator<String[]> iterator = conditionValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = output.size() == 0? false: true;
			String[] conditionValueArray = iterator.next();
			String type = conditionValueArray[1];
			boolean andMap = type.equalsIgnoreCase("and")?true:false;
			for(int i = 2; i < conditionValueArray.length; i++) {
				String[] sets= conditionValueArray[i].split("\\|");
				if(overMap&& andMap) {//这里map 和cache一样了，稍后会准备将cache 进行本地缓存化，保证养疗经的并发版本。
					P_ConditionPLSearch_XCDX_Map.P_Map(sets, output, object.get("tableName").toString());//1
				}else{
					P_ConditionPLSearch_XCDX_Cache.P_Cache(sets, output, object.get("tableName").toString()
							, object.get("baseName").toString(), object);//1
				}//shell脚本去掉DMA
			}
		}

		return output;
	}

	//20210927 注释下 稍后替换
	//先设计成 plsearch 语法和 plsql 语法通用， 方便我之后的plorm 统一一种方式扩展 pladmin
	public static List<Map<String, Object>> selectRowsByAttributesOfAggregation(Map<String, Object> object) {
		if(!object.containsKey("obj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> aggregationValues = (List<String[]>) object.get("aggregation");
		Iterator<String[]> iterator = aggregationValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = obj.size() == 0? false: true;
			String[] aggregationValueArray = iterator.next();
			String type = aggregationValueArray[1];
			boolean limitMap = type.equalsIgnoreCase("limit")?true:false;
			for(int i = 2; i < aggregationValueArray.length; i++) {
				String[] sets = aggregationValueArray[i].split("\\|");
				if(limitMap) {
					P_AggregationPLSearch.P_AggregationLimitMap(sets, obj);
				}
				//基于sort key 前序treeMap 之后排序功能设计
				//基于sort key 后序treeMap
			}
		}
		return obj;
	}

	public static Object selectRowsByAttributesOfGetCulumns(Map<String, Object> object) {
		if(!object.containsKey("obj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> getCulumnsValues = (List<String[]>) object.get("getCulumns");
		Iterator<String[]> iterator = getCulumnsValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = obj.size() == 0? false: true;
			String[] getCulumnsValueArray = iterator.next();
			if(overMap) {
				P_GetCulumnsPLSearch.P_GetCulumnsMap(obj, getCulumnsValueArray);
			}
		}
		return obj;
	}
}