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
//�Ժ�DMA�ļ����ڴ�����滻�� jtable���ڴ���� ������
@SuppressWarnings({ "unused", "unchecked"})
public class P_ConditionPLSearch_XCDX_Table extends P_ConditionPLSearch_XCDX {
	//plsql���溯����ȡ��ʼ��� ������ 20210405  //����� ����һ��û�ж� �����plsql����,��׼���Ա���history
	//object ָ���ջ
	//output ������
	public static void P_Table(String[] sets, List<Map<String, Object>> output
			, String DBTablePath, Map<String, Object> object) throws IOException {
		String DBTableRowsPath= DBTablePath + "/rows";	
		File fileDBTableRowsPath= new File(DBTableRowsPath);
		if (fileDBTableRowsPath.isDirectory()) {
			String[] rowList= fileDBTableRowsPath.list();
			int count= 0;
			NextRow:
				for(String row: rowList) {
					count++;
					Map<String, Object> rowMap= new HashMap<>();
					String DBTableRowIndexPath= DBTablePath + "/rows/" + row;	
					File readDBTableRowIndexFile= new File(DBTableRowIndexPath);
					if (readDBTableRowIndexFile.isDirectory()) {	
						String isDelete= DBTableRowIndexPath + "/is_delete_1" ;	
						File isDeleteFile= new File(isDelete);
						if(isDeleteFile.exists()) {
							continue NextRow;
						}
						String DBTableRowIndexCulumnPath= DBTableRowIndexPath + "/" + sets[0];	
						File readDBTableRowIndexCulumnFile= new File(DBTableRowIndexCulumnPath);
						if(readDBTableRowIndexCulumnFile.isDirectory()) {
							BufferedReader reader= new BufferedReader
									(new FileReader(readDBTableRowIndexCulumnFile + "/" + "value.lyg"));  
							String temp= "";
							String tempString= "";
							while ((tempString= reader.readLine())!= null) {
								temp+= tempString;
							}
							reader.close();
							if(temp.isEmpty()) {//����һ��idΪ�ռ��, ��Ҽǵø� ���ݿ��id�ӵ�ֵ,��lyg�Ķ��ǿ��ļ�.
								continue NextRow;
							}
							if(sets[1].equalsIgnoreCase("<")|| sets[1].equalsIgnoreCase("-lt")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										< new BigDecimal(sets[2].toString()).doubleValue()) {	
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);						
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("<=")||sets[1].equalsIgnoreCase("=<")
									||sets[1].equalsIgnoreCase("-lte")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										<= new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("==")||sets[1].equalsIgnoreCase("=")
									||sets[1].equalsIgnoreCase("===")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										== new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase(">=")||sets[1].equalsIgnoreCase("=>") 
									||sets[1].equalsIgnoreCase("-gte")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										>= new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase(">")||sets[1].equalsIgnoreCase("-gt")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										> new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("!=")||sets[1].equalsIgnoreCase("=!")) {
								if(new BigDecimal(temp.toString()).doubleValue()
										!= new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("equal")) {
								String rowCellFromString = temp.toString();
								if(rowCellFromString.equalsIgnoreCase(sets[2].toString())) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("!equal")) {
								String rowCellFromString = temp.toString();
								if(!rowCellFromString.equalsIgnoreCase(sets[2].toString())) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("in")) {
								String rowCellFromString = temp.toString();
								String set = "," + sets[2] + ",";
								if(set.contains("," + rowCellFromString + ",")) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("!in")) {
								String rowCellFromString = temp.toString();
								String set = "," + sets[2] + ",";
								if(!set.contains("," + rowCellFromString + ",")) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.I_Cells(new ConcurrentHashMap<String, Cell>());
										P_ConditionPLSearch_XCDX_Kernel.P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader
												, row, output, bufferRow, rowMap);
										output.add(P_ConditionPLSearch_XCDX_Map.rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
						}
					} 
				}
		}
	}
}