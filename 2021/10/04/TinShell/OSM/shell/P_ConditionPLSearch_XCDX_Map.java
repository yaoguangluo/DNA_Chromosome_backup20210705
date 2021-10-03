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
//�Ժ�DMA�ļ����ڴ�����滻�� jtable���ڴ���� ������
@SuppressWarnings({ "unused"})
public class P_ConditionPLSearch_XCDX_Map extends P_ConditionPLSearch_XCDX {
	//�Ժ��Ż���ͳһ�������������Ҫ��ת����2019-1-15 tin
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

	//��rowToRowMap �������� RowMapToRow һ����֤��2������С����ģ�ͣ�������һ����������㡣
	//������202109302339
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
	
	//è��� ����pmap��output �����ˣ� ����һ������ȫ�����ˡ�20210927
	//���ùܣ���P_Map �ĳ� shellP_Map
	public static void P_Map(String[] sets, List<Map<String, Object>> output, String tableName) {
		//����ͳһ�ӿڣ� �Ժ�ͳһ�Ż��ġ�
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		//����һ��table
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
		//�޸��°�output���߼��ظ����� ����conditon��and ��or 
		//ֻ��ǰ50�� �Ժ�ĳɷ�ҳ
		int max= 50;
		//��ȡtable��row
		Here:
		for(int i= 0; i< table.huaRuiJiJtableRows.length; i++ ) {
//			if(i> max) {
//				continue Here; 
//			}
			Row row= table.huaRuiJiJtableRows[i];	
			if(sets[1].equalsIgnoreCase("<")||sets[1].equalsIgnoreCase("-lt")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				//��ҿ���û�� rowvalue�� db�� Row���������ﾹȻ��output��iterator��2019�걻���ֽ��ˡ�
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

			if(sets[1].equalsIgnoreCase("����")) {	
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(rowCellFromString.contains(sets[2])) {
					outputTemp.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
				}	
			}
			if(sets[1].equalsIgnoreCase("���˵�")||sets[1].equalsIgnoreCase("������")) {
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