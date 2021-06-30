package ME.SM.OP.SM.AOP.MEC.SIQ.E;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
@SuppressWarnings({ "unused", "unchecked"})
public class P_ConditionPLSQL_XCDX_Map extends P_ConditionPLSQL_XCDX {
	//以后优化成统一对象输出，不需要再转换。2019-1-15 tin
	public static Map<String, Object> rowToRowMap(Row row) {
		Map<String, Object> culumnMaps= new HashMap<>();
		Map<String, Object> rowMap= new HashMap<>();
		Iterator<String> iterator= row.getCells().keySet().iterator();
		while(iterator.hasNext()) {
			String cellName = iterator.next();
			if(!cellName.contains("is_delete")) {
				Cell cell = row.getCell(cellName);
				Map<String, Object> culumnMap = new HashMap<>();
				culumnMap.put("culumnName", cellName);
				culumnMap.put("culumnValue", cell.getCellValue().toString());
				culumnMaps.put(cellName, culumnMap);
			}
		}
		rowMap.put("rowValue", culumnMaps);	
		return rowMap;
	}

	public static void P_Map(String[] sets, List<Map<String, Object>> output, String dBTablePath) {
		List<Map<String, Object>> outputTemp = new ArrayList<>();
		Iterator<Map<String, Object>> iterator = output.iterator();
		int rowid = 0;
		while(iterator.hasNext()) {
			Map<String, Object> row = iterator.next();
			Map<String, Object> rowMap = new HashMap<>();
			if(sets[1].equalsIgnoreCase("<")||sets[1].equalsIgnoreCase("-lt")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() < new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase("<=")||sets[1].equalsIgnoreCase("=<")
					||sets[1].equalsIgnoreCase("-lte")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() <=  new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase("==")||sets[1].equalsIgnoreCase("=")||sets[1].equalsIgnoreCase("===")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() ==  new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(">=")||sets[1].equalsIgnoreCase("=>") 
					||sets[1].equalsIgnoreCase("-gte")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() >= new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(">")||sets[1].equalsIgnoreCase("-gt")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() > new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase("!=")||sets[1].equalsIgnoreCase("=!")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() != new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("equal")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(rowCellFromString.equalsIgnoreCase(sets[2])) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("!equal")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(!rowCellFromString.equalsIgnoreCase(sets[2])) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("in")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				String set = "," + sets[2] + ",";
				if(set.contains("," + rowCellFromString + ",")){
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("!in")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				String set = "," + sets[2] + ",";
				if(!set.contains("," + rowCellFromString + ",")){
					outputTemp.add(row);
				}	
			}
		}
		output.clear();
		output.addAll(outputTemp);
	}
}