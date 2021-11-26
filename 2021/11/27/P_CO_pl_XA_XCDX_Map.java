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

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ESU.list.List_ESU;
import ESU.sort.Quick9DLYGWithString_ESU;
import ME.APM.VSQ.HRJFrame;
import MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import OSA.shell.XA_ShellTable;
import OSA.shell.XA_ShellTables;
import SVQ.stable.StableShellETL;
//�Ժ�DMA�ļ����ڴ�����滻�� jtable���ڴ���� ������
@SuppressWarnings({ "unused"})
public class P_CO_pl_XA_XCDX_Map extends P_CO_pl_XA_XCDX {
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
				culumnMap.put(StableShellETL.SHELL_ETL_CULUMNNAME, cellName);
				culumnMap.put("culumnValue", cell.getCellValue().toString());
				culumnMaps.put(cellName, culumnMap);
			}
		}
		rowMap.put(StableShellETL.SHELL_ETL_ROWVALUE, culumnMaps);	
		return rowMap;
	}

	//��rowToRowMap �������� RowMapToRow һ����֤��2������С����ģ�ͣ�������һ����������㡣
	//������202109302339
	@SuppressWarnings("unchecked")
	public static Row rowMapToRow(Map<String, Object> map) {
		Row row= new Row();
		ConcurrentHashMap<String, Cell> cells=new ConcurrentHashMap<>();
		row.I_Cells(cells);
		Iterator<String> iterator= ((Map<String, Object>)map.get(StableShellETL.SHELL_ETL_ROWVALUE)).keySet().iterator();
		while(iterator.hasNext()) {
			String cellName = iterator.next();
			if(!cellName.contains("is_delete")) {
				Cell cell= new Cell();
				Map<String, Object> culumnMap 
				= (Map<String, Object>)((Map<String, Object>)map.get(StableShellETL.SHELL_ETL_ROWVALUE)).get(cellName);
				cell.I_CellValue(culumnMap.get("culumnValue"));
				row.putCell(cellName, cell);
			}
		}
		return row;
	}

	//è��� ����pmap��output �����ˣ� ����һ������ȫ�����ˡ�20210927
	//���ùܣ���P_Map �ĳ� shellP_Map
	public static void P_Map(String[] sets, List<Map<String, Object>> output, String tableName
			, Map<String, Object> object) {
		//����ͳһ�ӿڣ� �Ժ�ͳһ�Ż��ġ�
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		//����һ��table
		XA_ShellTable table;
		//outputTemp.addAll(output);
		if((output.isEmpty()||null== output)&& object.get("firstTime").equals("true")) {
			table= XA_ShellTables.searchShellTables.get(tableName);
			object.put("firstTime", "others");
		}else {
			Row[] huaRuiJiJtableRows= new Row[output.size()];
			for(int i= 0; i< output.size(); i++) {
				huaRuiJiJtableRows[i]= P_CO_pl_XA_XCDX_Map.rowMapToRow(output.get(i));
			}
			table= new XA_ShellTable();
			table.setHuaRuiJiJtableRows(huaRuiJiJtableRows);
		}
		//�޸��°�output���߼��ظ����� ����conditon��and ��or 
		//ֻ��ǰ50�� �Ժ�ĳɷ�ҳ
		//�Ժ���������Ƭ���Ƴ�����ļ������һ��������
		if(sets[1].equalsIgnoreCase("��������")) {
			//table to object
			//�Ժ��ҵ����ƾ���������release������ Ƭ�� ����Ҳ�����Ż����¡�
			String key= sets[2];	
			if(null== key|| key.equals("")) {
				return;
			}
			String[] score= new String[table.huaRuiJiJtableRows.length];
			int[] score_code= new int[table.huaRuiJiJtableRows.length];
			int []reg= new int[table.huaRuiJiJtableRows.length];
			int count= 0;
			Map<String, String> pos= HRJFrame.NE._A.getPosCnToCn();
			Map<String, WordFrequency> mapSearchWithoutSort = null;
			mapSearchWithoutSort = HRJFrame.NE._A.parserMixStringByReturnFrequencyMap(key);

			//Iterator<String> iteratorForCopy= copy.iterator();	
			int copyCount = 0;
			List<String> list= HRJFrame.NE._A.parserMixedString(key);
			String[] string= List_ESU.listToArray(list);
			String[] stringReg= new String[key.length()/3];
			for(int i= 0; i< stringReg.length; i++) {
				stringReg[i]= key.substring(i*3, (i*3+ 3)<key.length()?(i*3+ 3):key.length()-1);
			}
			Map<String, Row> map= new HashMap<>(); 
			for(int i= 0; i< table.huaRuiJiJtableRows.length; i++) {			
				//while(iteratorForCopy.hasNext()) {
				String temps= table.huaRuiJiJtableRows[i].getCell(sets[0]).getCellValue().toString();
				//				if(null== temps) {
				//					temps= "";
				//				}
				score[copyCount] = "i"+ i;//��Ϊ ������map key�����Ծ�ͨ��Ϊmap ���ݡ�
				map.put(score[copyCount], table.huaRuiJiJtableRows[i]);
				//String iteratorForCopyString= iteratorForCopy.next();
				//score[copyCount]= iteratorForCopyString;
				//String temps= dic_map.get(iteratorForCopyString).toString();
				Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
				Here:
					while(iteratorWordFrequency.hasNext()) {  
						String mapSearchaAtII = iteratorWordFrequency.next();
						WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
						if(temps.contains(mapSearchaAtII)) {
							if(reg[copyCount] == 0){
								count += 1;
							}
							//							score[copyCount] = temps;//��Ϊ ������map key�����Ծ�ͨ��Ϊmap ���ݡ���������Ҫmap
							//							if(score[copyCount].contains(key.replace(" ", ""))) {
							//								reg[copyCount]+= 500;
							//							}
							//							if(key.contains(score[copyCount].replace(" ", ""))) {
							//								reg[copyCount]+= 500;
							//							}
							if(temps.contains(key.replace(" ", ""))) {
								reg[copyCount]+= 500;
							}
							if(key.contains(temps.replace(" ", ""))) {
								reg[copyCount]+= 500;
							}
							if(!pos.containsKey(mapSearchaAtII)) {
								reg[copyCount] += 1;
								score_code[copyCount] += 1 << mapSearchaAtII.length() << wordFrequencySearch.getFrequency() ;
								continue Here;
							}
							if(pos.get(mapSearchaAtII).contains("��")||pos.get(mapSearchaAtII).contains("��")
									||pos.get(mapSearchaAtII).contains("��")||pos.get(mapSearchaAtII).contains("ν")) {
								reg[copyCount] += 2;
							}
							reg[copyCount] += 1;
							score_code[copyCount] += (temps.contains(mapSearchaAtII) ? 2 : 1) 
									* (!pos.get(mapSearchaAtII).contains("��") ? pos.get(mapSearchaAtII).contains("��")? 45 : 1 : 50) 
									<< mapSearchaAtII.length() * wordFrequencySearch.getFrequency();
							continue Here;
						}
						if(mapSearchaAtII.length()>1) {
							for(int j=0;j<mapSearchaAtII.length();j++) {
								if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
									if(reg[copyCount] == 0){
										count += 1;
									}
									//									score[copyCount] = temps;
									score_code[copyCount]+=1;
									if(pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
											pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("��")
											||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("��")
											||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("��")
											||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("ν")
											)) {
										reg[copyCount] += 2;
									}
									reg[copyCount] += 1;
									continue Here;
								}
							}
						}
					}
				score_code[copyCount] = score_code[copyCount] * reg[copyCount];
				//�ʾ�
				int code= 100;
				int tempb= 0;
				int tempa= score_code[copyCount];		
				if(key.length()> 4) {
					//ȫ��
					for(int j= 0; j< string.length; j++) {
						if(temps.contains(string[j])) {
							tempb+= code;
						}
					}
					//�Ͼ�
					for(int j= 0; j< stringReg.length; j++) {
						if(temps.contains(stringReg[j])) {
							tempb+= code;
						}
					}
					score_code[copyCount] = (int) (tempa/Math.pow(HRJFrame.NE.lookrot+ 1, 4) 
							+ tempb*Math.pow(Integer.valueOf(sets[3]), 2));
				}
				if(key.replace(" ", "").length()> 1&& key.replace(" ", "").length()< 5) {
					if(temps.contains(key.replace(" ", ""))) {
						tempb+= code<< 7;
					}
					score_code[copyCount] = (int) (tempa/Math.pow(Integer.valueOf(sets[3])+ 1, 4) 
							+ tempb*Math.pow(Integer.valueOf(sets[3]), 2));
				}
				copyCount++;
			}
			LABEL2:
				new Quick9DLYGWithString_ESU().sort(score_code, score);
			int max = score_code[0];
			Object[][] tableData= new Object[count][18];
			int new_count= 0;

			//			newTableModel.getDataVector().clear();
			//			if(null== key|| key.equals("")) {
			//				return;
			//			}
			//recordRows û�� ֵ
			//recordRows �� ֵ
			Here:
				for(int i= score.length- 1; i> 0; i--) {
					if(score_code[i]< 1){
						continue Here;
					}
					outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(map.get(score[i])));
				}	
			output.clear();
			output.addAll(outputTemp);
			return;
		}



		int max= 50;
		//��ȡtable��row
		Here:
			for(int i= 0; i< table.huaRuiJiJtableRows.length; i++ ) {
				//			if(i> max) {
				//				continue Here; 
				//			}
				Row row= table.huaRuiJiJtableRows[i];	
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_SMALL)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_LESS_THAN)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					//��ҿ���û�� rowvalue�� db�� Row���������ﾹȻ��output��iterator��2019�걻���ֽ��ˡ�
					if(new BigDecimal(rowCellFromString).doubleValue() < new BigDecimal((StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])).doubleValue()) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_LESS_AND_EQUAL_TO)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_LESS_AND_EQUAL_TO_R)
						||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_LESS_THAN_AND_EQUAL_TO)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(new BigDecimal(rowCellFromString).doubleValue() <=  new BigDecimal((StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])).doubleValue()) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_DOUBLE_EQUALS)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_SIMPLE_EUQALS)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(new BigDecimal(rowCellFromString).doubleValue() ==  new BigDecimal((StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])).doubleValue()) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO_R) 
						||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER_THAN_AND_EQUAL_TO)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(new BigDecimal(rowCellFromString).doubleValue() >= new BigDecimal((StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])).doubleValue()) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER_THAN)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(new BigDecimal(rowCellFromString).doubleValue() > new BigDecimal((StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])).doubleValue()) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_STRING_LENGTH_GREATER_THAN)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(rowCellFromString.length()> new BigDecimal((StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])).doubleValue()) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_STRING_LENGTH_LESS_THAN)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(rowCellFromString.length()< new BigDecimal((StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])).doubleValue()) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_NOT_EUQAL_TO)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_NOT_EUQAL_TO_R)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(new BigDecimal(rowCellFromString).doubleValue() != new BigDecimal(sets[2]).doubleValue()) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_CONTANS)) {	
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(rowCellFromString.contains(StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])) {
					//if(rowCellFromString.contains(sets[2])) {		
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_FILTER_BY)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_DOES_NOT_CONTANS)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(!rowCellFromString.contains(StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_EQUAL)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(rowCellFromString.equalsIgnoreCase(StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_DOES_NOT_EQUALS)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(!rowCellFromString.equalsIgnoreCase(StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])) {
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase((StableShellETL.SHELL_ETL_IN))) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					String set = "," + (StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2]) + ",";
					if(set.contains("," + rowCellFromString + ",")){
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_NOT_IN)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					String set = "," + (StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2]) + ",";
					if(!set.contains("," + rowCellFromString + ",")){
						outputTemp.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
					}	
				}
			}
		output.clear();
		output.addAll(outputTemp);
	}
}