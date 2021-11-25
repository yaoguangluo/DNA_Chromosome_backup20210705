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
@SuppressWarnings({"unused", "unchecked"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
public class P_CO_pl_XA_XCDX_Cache extends P_CO_pl_XA_XCDX {
	public static void P_Cache(String[] sets, List<Map<String, Object>> output
			, String tableName, Map<String, Object> object, String condition) {
		//Table table= DetaDBBufferCache_M.db.getBase(baseName).getTable(tableName);
		//我没有将search shell 用DetaDBBufferCache_M 内存机制来存储是因为 table操作是增删改查严谨操作。
		//而search shell 操作是筛选查找 极速操作，严谨操作与极速操作 的应用环境有天壤之别。 
		//SearchShellTable table= SearchShellTables.searchShellTables.get(tableName);
		//稍后把下面的 Table 替换成 SearchShellTable 即可。
		//Table table= DetaDBBufferCache_M.db.getBase(baseName).getTable(tableName);
		//算了统一接口， 以后统一优化改。
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		//创建一个table
		XA_ShellTable table = null;
		outputTemp.addAll(output);
		if(outputTemp.isEmpty()||condition.equals("或")||condition.equals("和")) { //因为改成了or map，所以只有原表重新load
			table= XA_ShellTables.searchShellTables.get(tableName);
		}else if(!outputTemp.isEmpty()&& condition.equals("和")) {//这里不会再走了。成了伪函数
			Row[] huaRuiJiJtableRows= new Row[outputTemp.size()];
			for(int i= 0; i< outputTemp.size(); i++) {
				huaRuiJiJtableRows[i]= P_CO_pl_XA_XCDX_Map.rowMapToRow(outputTemp.get(i));
			}
			table= new XA_ShellTable();
			table.setHuaRuiJiJtableRows(huaRuiJiJtableRows);
		}
		//修改下把output的逻辑重复利用 满足conditon的and 和or 
		//只拿前100行 以后改成分页
		//稍后把这个函数片段移除这个文件，变成一个函数。
		if(sets[1].equalsIgnoreCase("精度搜索")) {
			//table to object
			//稍后我的养疗经界面搜索release函数的 片段 这里也可以优化如下。
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
				score[copyCount] = "i"+ i;//因为 不再有map key，所以就通用为map 内容。
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
							//score[copyCount] = temps;//因为 不再有map key，所以就通用为map 内容。，还是需要map
							//	if(score[copyCount].contains(key.replace(" ", ""))) {
							//		reg[copyCount]+= 500;
							//	}
							//  if(key.contains(score[copyCount].replace(" ", ""))) {
							//	reg[copyCount]+= 500;
							//}
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
							if(pos.get(mapSearchaAtII).contains("名")||pos.get(mapSearchaAtII).contains("动")
									||pos.get(mapSearchaAtII).contains("形")||pos.get(mapSearchaAtII).contains("谓")) {
								reg[copyCount] += 2;
							}
							reg[copyCount] += 1;
							score_code[copyCount] += (temps.contains(mapSearchaAtII) ? 2 : 1) 
									* (!pos.get(mapSearchaAtII).contains("名")
											? pos.get(mapSearchaAtII).contains("动")? 45 : 1 : 50) 
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
											pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
											||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
											||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
											||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
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
				//词距
				int code= 100;
				int tempb= 0;
				int tempa= score_code[copyCount];		
				if(key.length()> 4) {
					//全词
					for(int j= 0; j< string.length; j++) {
						if(temps.contains(string[j])) {
							tempb+= code;
						}
					}
					//断句
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
			Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
			if(null== recordRows) {
				recordRows= new HashMap<>();
			}

			recordRows.clear();
			//recordRows 没有 值
			//recordRows 有 值
			Here:
				for(int i= score.length- 1; i> 0; i--) {
					if(score_code[i]< 1){
						continue Here;
					}

					output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(map.get(score[i])));
					recordRows.put(Integer.valueOf(score[i].replace("i", "")), true);
				}	
			object.put("recordRows", recordRows);
			return;
		}

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
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_SMALL)|| sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_LESS_THAN)) {
					double rowCellFromBigDecimal= new BigDecimal(row.getCell(sets[0])
							.getCellValue().toString()).doubleValue();
					if(rowCellFromBigDecimal< new BigDecimal(sets[2]).doubleValue() 
							&& row.containsCell("is_delete_0")) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_LESS_AND_EQUAL_TO)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_LESS_AND_EQUAL_TO_R)
						||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_LESS_THAN_AND_EQUAL_TO)) {

					String set= sets[0];
					Cell setCell= row.getCell(set);
					String cellString= setCell.getCellValue().toString();
					cellString=cellString.isEmpty()? "0": cellString;
					double rowCellFromBigDecimal = new BigDecimal(cellString).doubleValue();
					if(rowCellFromBigDecimal<=  new BigDecimal(sets[2]).doubleValue() 
							&& row.containsCell("is_delete_0")) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_CONTANS)) {	
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(rowCellFromString.contains(StableShellETL.storeValue.containsKey(sets[2])? StableShellETL.storeValue.get(sets[2]): sets[2])) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				
				//字符串长度小于
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_STRING_LENGTH_GREATER_THAN)) {	
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString().trim();
					if(rowCellFromString.length()> new BigDecimal(sets[2]).doubleValue()) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				//字符串长度小于
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_STRING_LENGTH_LESS_THAN)) {	
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString().trim();
					if(rowCellFromString.length()< new BigDecimal(sets[2]).doubleValue()) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				
				if(sets[1].equalsIgnoreCase("过滤")||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_DOES_NOT_CONTANS)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(!rowCellFromString.contains(sets[2])) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				//PLSEARCH 准备整体去掉plsql db的 is_delete_0 关键字
				//罗瑶光 20211015
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_DOUBLE_EQUALS)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_SIMPLE_EUQALS)
						||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
					double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
							.getCellValue().toString()).doubleValue();
					if(rowCellFromBigDecimal ==  new BigDecimal(sets[2]).doubleValue()) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO_R) 
						||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER_THAN_AND_EQUAL_TO)) {
					double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
							.getCellValue().toString()).doubleValue();
					if(rowCellFromBigDecimal >= new BigDecimal(sets[2]).doubleValue()) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_GREATER_THAN)) {
					double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
							.getCellValue().toString()).doubleValue();
					if(rowCellFromBigDecimal > new BigDecimal(sets[2]).doubleValue() ) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_NOT_EUQAL_TO)||sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_NOT_EUQAL_TO_R)) {
					double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
							.getCellValue().toString()).doubleValue();
					if(rowCellFromBigDecimal != new BigDecimal(sets[2]).doubleValue()) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_EQUAL)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(rowCellFromString.equalsIgnoreCase(sets[2])) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_DOES_NOT_EQUALS)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					if(!rowCellFromString.equalsIgnoreCase(sets[2])) {
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}

				if(sets[1].equalsIgnoreCase((StableShellETL.SHELL_ETL_IN))) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					String set = "," + sets[2] + ",";
					if(set.contains("," + rowCellFromString + ",")){
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}
				if(sets[1].equalsIgnoreCase(StableShellETL.SHELL_ETL_NOT_IN)) {
					String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
					String set = "," + sets[2] + ",";
					if(!set.contains("," + rowCellFromString + ",")){
						if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(i)) {
							output.add(P_CO_pl_XA_XCDX_Map.rowToRowMap(row));
							Map<Integer, Boolean> recordRows= (Map<Integer, Boolean>) object.get("recordRows");
							recordRows.put(i, true);
							object.put("recordRows", recordRows);
						}
					}	
				}		
			}	
	}
}