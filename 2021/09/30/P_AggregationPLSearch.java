package OSM.shell;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.HRJFrame;
@SuppressWarnings({"unused"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
public class P_AggregationPLSearch {
	public static void P_AggregationLimitMap(String[] sets
			, List<Map<String, Object>> output) {
		List<Map<String, Object>> outputTemp = new ArrayList<>();
		Iterator<Map<String, Object>> iterator = output.iterator();
		int count = 0;
		while(iterator.hasNext()) {
			int rowid = count++;
			Map<String, Object> row = iterator.next();
			Map<String, Object> rowMap = new HashMap<>();
			if(sets[1].equalsIgnoreCase("~")) {
				if(rowid >= new BigDecimal(sets[0]).doubleValue() && rowid 
						<= new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("color")) {
				@SuppressWarnings("unchecked")
				Map<String, Object> map= (Map<String, Object>)row.get("rowValue");
				@SuppressWarnings("unchecked")
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
				@SuppressWarnings("unchecked")
				Map<String, Object> map= (Map<String, Object>)row.get("rowValue");
				@SuppressWarnings("unchecked")
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
				//				rowCellFromString= "<div style=\"background:white\"><font color=\""+ sets[2] +"\">"
				//						+ rowCellFromString+ "</font></div>";
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