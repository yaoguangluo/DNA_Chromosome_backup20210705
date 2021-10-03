package OSM.shell;
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
import OSA.shell.SearchShellTable;
import OSA.shell.SearchShellTables;
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
@SuppressWarnings({ "unused"})
public class P_ConditionPLSearch_XCDX_Map extends P_ConditionPLSearch_XCDX {
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

	//将rowToRowMap 进行逆向 RowMapToRow 一来验证，2来找最小计算模型，方便下一步表格编译计算。
	//罗瑶光202109302339
	@SuppressWarnings("unchecked")
	public static Row rowMapToRow(Map<String, Object> map) {
		Row row= new Row();
		ConcurrentHashMap<String, Cell> cells=new ConcurrentHashMap<>();
		row.I_Cells(cells);

		Iterator<String> iterator= ((Map<String, Object>)map.get("rowValue")).keySet().iterator();
		while(iterator.hasNext()) {
			String cellName = iterator.next();
			if(!cellName.contains("is_delete")) {
				Cell cell= new Cell();
				Map<String, Object> culumnMap = (Map<String, Object> )((Map<String, Object>)map.get("rowValue")).get(cellName);

				cell.I_CellValue(culumnMap.get("culumnValue"));
				row.putCell(cellName, cell);
			}
		}
		return row;
	}
	
	//猫腻哥 把我pmap的output 都改了， 今天一查问题全出来了。20210927
	//懒得管，把P_Map 改成 shellP_Map
	public static void P_Map(String[] sets, List<Map<String, Object>> output, String tableName) {
		//算了统一接口， 以后统一优化改。
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		//创建一个table
		SearchShellTable table;
		
		//outputTemp.addAll(output);
		if(output.isEmpty()||null== output) {
			table= SearchShellTables.searchShellTables.get(tableName);
		}else {
			Row[] huaRuiJiJtableRows= new Row[output.size()];
			for(int i= 0; i< output.size(); i++) {
				huaRuiJiJtableRows[i]= P_ConditionPLSearch_XCDX_Map.rowMapToRow(output.get(i));
			}
			table= new SearchShellTable();
			table.setHuaRuiJiJtableRows(huaRuiJiJtableRows);
		}
		//修改下把output的逻辑重复利用 满足conditon的and 和or 
		//只拿前50行 以后改成分页
		int max= 50;
		//获取table的row
		Here:
		for(int i= 0; i< table.huaRuiJiJtableRows.length; i++ ) {
//			if(i> max) {
//				continue Here; 
//			}
			Row row= table.huaRuiJiJtableRows[i];	
			if(sets[1].equalsIgnoreCase("<")||sets[1].equalsIgnoreCase("-lt")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				//大家看见没， rowvalue是 db的 Row单例，这里竟然是output的iterator。2019年被动手脚了。
				if(new BigDecimal(rowCellFromString).doubleValue() < new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
			if(sets[1].equalsIgnoreCase("<=")||sets[1].equalsIgnoreCase("=<")
					||sets[1].equalsIgnoreCase("-lte")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(new BigDecimal(rowCellFromString).doubleValue() <=  new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
			if(sets[1].equalsIgnoreCase("==")||sets[1].equalsIgnoreCase("=")||sets[1].equalsIgnoreCase("===")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(new BigDecimal(rowCellFromString).doubleValue() ==  new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
			if(sets[1].equalsIgnoreCase(">=")||sets[1].equalsIgnoreCase("=>") 
					||sets[1].equalsIgnoreCase("-gte")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(new BigDecimal(rowCellFromString).doubleValue() >= new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
			if(sets[1].equalsIgnoreCase(">")||sets[1].equalsIgnoreCase("-gt")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(new BigDecimal(rowCellFromString).doubleValue() > new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
			if(sets[1].equalsIgnoreCase("!=")||sets[1].equalsIgnoreCase("=!")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(new BigDecimal(rowCellFromString).doubleValue() != new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}

			if(sets[1].equalsIgnoreCase("包含")) {	
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(rowCellFromString.contains(sets[2])) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
			if(sets[1].equalsIgnoreCase("过滤掉")||sets[1].equalsIgnoreCase("不包含")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(!rowCellFromString.contains(sets[2])) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
			
			
			if(sets[1].equalsIgnoreCase("equal")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(rowCellFromString.equalsIgnoreCase(sets[2])) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}

			if(sets[1].equalsIgnoreCase("!equal")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(!rowCellFromString.equalsIgnoreCase(sets[2])) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}

			if(sets[1].equalsIgnoreCase("in")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				String set = "," + sets[2] + ",";
				if(set.contains("," + rowCellFromString + ",")){
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}

			if(sets[1].equalsIgnoreCase("!in")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				String set = "," + sets[2] + ",";
				if(!set.contains("," + rowCellFromString + ",")){
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
		}
		output.clear();
		output.addAll(outputTemp);
	}
}