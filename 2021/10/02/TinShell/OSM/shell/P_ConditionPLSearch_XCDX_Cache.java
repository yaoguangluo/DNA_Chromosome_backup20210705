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
@SuppressWarnings({"unused", "unchecked"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
public class P_ConditionPLSearch_XCDX_Cache extends P_ConditionPLSearch_XCDX {
	public static void P_Cache(String[] sets, List<Map<String, Object>> output
			, String tableName, Map<String, Object> object) {
		//Table table= DetaDBBufferCache_M.db.getBase(baseName).getTable(tableName);
		//我没有将search shell 用DetaDBBufferCache_M 内存机制来存储是因为 table操作是增删改查严谨操作。
		//而search shell 操作是筛选查找 极速操作，严谨操作与极速操作 的应用环境有天壤之别。 
		//SearchShellTable table= SearchShellTables.searchShellTables.get(tableName);
		//稍后把下面的 Table 替换成 SearchShellTable 即可。
		//Table table= DetaDBBufferCache_M.db.getBase(baseName).getTable(tableName);


		//算了统一接口， 以后统一优化改。
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		//创建一个table
		SearchShellTable table;

		outputTemp.addAll(output);
		if(outputTemp.isEmpty()) {
			table= SearchShellTables.searchShellTables.get(tableName);
		}else {
			Row[] huaRuiJiJtableRows= new Row[outputTemp.size()];
			for(int i= 0; i< outputTemp.size(); i++) {
				huaRuiJiJtableRows[i]= P_ConditionPLSearch_XCDX_Map.rowMapToRow(outputTemp.get(i));
			}
			table= new SearchShellTable();
			table.setHuaRuiJiJtableRows(huaRuiJiJtableRows);
		}
		//修改下把output的逻辑重复利用 满足conditon的and 和or 
		//只拿前100行 以后改成分页
		int max= 50;
		//获取table的row
		Here:
		for(int i= 0; i< table.huaRuiJiJtableRows.length; i++ ) {
//			if(i> max) {
//				continue Here; 
//			}
			//Object[] row= table.huaRuiJiJtable[count];
			//还是要变成map，不然 命令的 key值查询 只能forloop， 效率减低
			Row row= table.huaRuiJiJtableRows[i];			
			Cell cell= new Cell();
			cell.I_CellValue(i); //加id
			//出现一个问题，我的table db是非线性map 结构， 自带表头key， 而data 是矩阵， 
			row.putCell("Index", cell);
			if(sets[1].equalsIgnoreCase("<")|| sets[1].equalsIgnoreCase("-lt")) {
				double rowCellFromBigDecimal= new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal< new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("<=")||sets[1].equalsIgnoreCase("=<")
					||sets[1].equalsIgnoreCase("-lte")) {

				String set= sets[0];
				Cell setCell= row.getCell(set);
				String cellString= setCell.getCellValue().toString();
				cellString=cellString.isEmpty()? "0": cellString;
				double rowCellFromBigDecimal = new BigDecimal(cellString).doubleValue();
				if(rowCellFromBigDecimal<=  new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("contains")) {	
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(rowCellFromString.contains(sets[2])) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("filter")||sets[1].equalsIgnoreCase("!contains")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(!rowCellFromString.contains(sets[2])) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			
			if(sets[1].equalsIgnoreCase("==")||sets[1].equalsIgnoreCase("=")
					||sets[1].equalsIgnoreCase("===")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal ==  new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase(">=")||sets[1].equalsIgnoreCase("=>") 
					||sets[1].equalsIgnoreCase("-gte")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal >= new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase(">")||sets[1].equalsIgnoreCase("-gt")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal > new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!=")||sets[1].equalsIgnoreCase("=!")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal != new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("equal") && row.containsCell("is_delete_0")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(rowCellFromString.equalsIgnoreCase(sets[2])) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!equal")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(!rowCellFromString.equalsIgnoreCase(sets[2]) && row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}

			if(sets[1].equalsIgnoreCase("in")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				String set = "," + sets[2] + ",";
				if(set.contains("," + rowCellFromString + ",") && row.containsCell("is_delete_0")){
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!in")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				String set = "," + sets[2] + ",";
				if(!set.contains("," + rowCellFromString + ",") && row.containsCell("is_delete_0")){
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(i, true);
						object.put("recordRows", recordRows);
					}
				}	
			}		
		}	
	}
}