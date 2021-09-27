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
@SuppressWarnings({ "unused", "unchecked"})
//�Ժ�DMA�ļ����ڴ�����滻�� jtable���ڴ���� ������
public class P_ConditionPLSearch_XCDX_Cache extends P_ConditionPLSearch_XCDX {
	public static void P_Cache(String[] sets, List<Map<String, Object>> output
			, String tableName, String baseName, Map<String, Object> object) {
		//Table table= DetaDBBufferCache_M.db.getBase(baseName).getTable(tableName);
		//��û�н�search shell ��DetaDBBufferCache_M �ڴ�������洢����Ϊ table��������ɾ�Ĳ��Ͻ�������
		//��search shell ������ɸѡ���� ���ٲ������Ͻ������뼫�ٲ��� ��Ӧ�û���������֮�� 
		SearchShellTable table= SearchShellTables.searchShellTables.get(tableName);
		//�Ժ������� Table �滻�� SearchShellTable ���ɡ�
		//Table table= DetaDBBufferCache_M.db.getBase(baseName).getTable(tableName);

		for(int i= 0; i< table.huaRuiJiJtable.length; i++ ) {
			int count= i;
			String rowIndex= ""+ i;
			//Object[] row= table.huaRuiJiJtable[count];
			//����Ҫ���map����Ȼ ����� keyֵ��ѯ ֻ��forloop�� Ч�ʼ���
			Row row= table.huaRuiJiJtableRows[count];			
			Cell cell= new Cell();
			cell.I_CellValue(i); //��id
			//����һ�����⣬�ҵ�table db�Ƿ�����map �ṹ�� �Դ���ͷkey�� ��data �Ǿ��� 
			row.putCell("Index", cell);
			if(sets[1].equalsIgnoreCase("<")|| sets[1].equalsIgnoreCase("-lt")) {
				double rowCellFromBigDecimal= new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal< new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
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
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("==")||sets[1].equalsIgnoreCase("=")
					||sets[1].equalsIgnoreCase("===")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal ==  new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase(">=")||sets[1].equalsIgnoreCase("=>") 
					||sets[1].equalsIgnoreCase("-gte")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal >= new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase(">")||sets[1].equalsIgnoreCase("-gt")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal > new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!=")||sets[1].equalsIgnoreCase("=!")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal != new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("equal") && row.containsCell("is_delete_0")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(rowCellFromString.equalsIgnoreCase(sets[2])) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!equal")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(!rowCellFromString.equalsIgnoreCase(sets[2]) && row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}

			if(sets[1].equalsIgnoreCase("in")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				String set = "," + sets[2] + ",";
				if(set.contains("," + rowCellFromString + ",") && row.containsCell("is_delete_0")){
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!in")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				String set = "," + sets[2] + ",";
				if(!set.contains("," + rowCellFromString + ",") && row.containsCell("is_delete_0")){
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}		
		}	
	}
}