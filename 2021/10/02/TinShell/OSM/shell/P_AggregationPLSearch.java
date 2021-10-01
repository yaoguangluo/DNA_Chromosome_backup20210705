package OSM.shell;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.HRJFrame;
import OEU.LYG4DQS4D.LYG10DWCMSSort13D_XCDX_C_A_S;
import PEU.P.table.TableSorterZYNK;
@SuppressWarnings({"unused"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
public class P_AggregationPLSearch {
	@SuppressWarnings("unchecked")
	public static void P_AggregationLimitMap(String[] sets
			, List<Map<String, Object>> output) {
		List<Map<String, Object>> outputTemp = new ArrayList<>();
		if(sets[1].equalsIgnoreCase("sortNumber")) {
			//outputTemp 是一个arraylist，已经具备了 排序的 模子。
			//这里通常会有数字和字符串2种模式，
			//于是设计sortNumber， sortString两个语法先
			return;
		}
		if(sets[1].equalsIgnoreCase("sortString")) {
			//outputTemp 是一个 arraylist，已经具备了 排序的 模子。
			//这里通常会有数字和字符串2种模式，
			//于是设计sortNumber， sortString两个语法先
			//outputTemp
			//先把之前的文字拼音笔画排序接口拿过来，
			//然后面向该接口进行封装适应这里的功能。
			//看怎么改
			outputTemp.addAll(output);
			//1 list 存map
			Map<String, Map<String, Object>> maps= new HashMap<>();  
			Iterator<Map<String, Object>> iterators= outputTemp.iterator();
			String[] strings= new String[outputTemp.size()];
			int index= 0;
			while(iterators.hasNext()) {
				Map<String, Object> map= iterators.next();
				Map<String, Object> rowValue= (Map<String, Object>)map.get("rowValue");
				Map<String, Object> culumnValue= (Map<String, Object>)rowValue.get(sets[0]);
				maps.put(culumnValue.get("culumnValue").toString(), map);	
				strings[index++]= culumnValue.get("culumnValue").toString();
			}

			//2 list 去map名
			//3 sort map名
			SortStringDemo.initMap();	
			int returnInt= new LYG10DWCMSSort13D_XCDX_C_A_S()
					.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(strings
							, 0, strings.length- 1, 80, SortStringDemo.pinYin
							, SortStringDemo.biHua, 7, 70);
			//4 输出
			outputTemp.clear();
			if(sets[2].equalsIgnoreCase("increment")) {
				for(int i= 0; i< strings.length; i++) {
					outputTemp.add(maps.get(strings[i]));
				}
			}else if(sets[2].equalsIgnoreCase("decrement")) {
				for(int i= 0; i< strings.length; i++) {
					outputTemp.add(maps.get(strings[strings.length- i- 1]));
				}
			}
			output.clear();
			output.addAll(outputTemp);
			return;
		}
		
		//稍后把这里 行遍历 改成 命令遍历。提高计算速度
		//罗瑶光20211002
		Iterator<Map<String, Object>> iterator = output.iterator();
		int count = 0;
		while(iterator.hasNext()) {
			int rowid = count++;
			Map<String, Object> row = iterator.next();
			Map<String, Object> rowMap = new HashMap<>();
			if(sets[1].equalsIgnoreCase("limit")) {
				if(rowid >= new BigDecimal(sets[0]).doubleValue() && rowid 
						<= new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("color")) {
				Map<String, Object> map= (Map<String, Object>)row.get("rowValue");
				Map<String, Object> mapCulumn= (Map<String, Object>)map.get(sets[0]);
				String rowCellFromString= mapCulumn.get("culumnValue").toString();
				rowCellFromString= "<div style=\"background:black\"><font color=\""+ sets[2] +"\">"
						+ rowCellFromString+ "</font></div>";
				//更新
				outputTemp.remove(row);
				mapCulumn.put("culumnValue", rowCellFromString);
				map.put(sets[0], mapCulumn);
				row.put("rowValue", map);
				outputTemp.add(row);
			}

			if(sets[1].equalsIgnoreCase("parser")) {
				Map<String, Object> map= (Map<String, Object>)row.get("rowValue");
				Map<String, Object> mapCulumn= (Map<String, Object>)map.get(sets[0]);
				String rowCellFromString= mapCulumn.get("culumnValue").toString();
				List<String> list= HRJFrame.NE._A.parserMixedString(rowCellFromString);
				Map<String, String> nlp= HRJFrame.NE._A.getPosCnToCn();
				Iterator<String> iterators= list.iterator();
				rowCellFromString= "";
				rowCellFromString+= "<div style=\"background:white\">";
				while(iterators.hasNext()) {
					String string= iterators.next();
					if(nlp.containsKey(string)) {
						rowCellFromString+= "<font color=\""+ 
								(!nlp.get(string).contains("动")?!nlp.get(string).contains("名")?!nlp.get(string).contains("形")?
										"black": "blue": "red": "green") +"\">"
										+ string+ "</font>";
					}
				}
				rowCellFromString+= "</div>";
				//rowCellFromString= "<div style=\"background:white\"><font color=\""+ sets[2] +"\">"
				//+ rowCellFromString+ "</font></div>";
				//更新
				outputTemp.remove(row);
				mapCulumn.put("culumnValue", rowCellFromString);
				map.put(sets[0], mapCulumn);
				row.put("rowValue", map);
				outputTemp.add(row);
			}
		}	
		output.clear();
		output.addAll(outputTemp);
	}
}