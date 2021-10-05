package OSM.shell;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.HRJFrame;
import MSV.OSQ.sets.DetaDouble;
import OEU.LYG4DQS4D.LYG10DWCMSSort13D_XCDX_C_A_S;
import OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;
import OEU.LYG4DQS4D.Quick_7D_luoyaoguang_Sort;
import OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import PEQ.AMV.ECS.test.ANNTest;
import PEQ.AMV.ECS.test.DNNTest;
import PEQ.AMV.ECS.test.SensingTest;
import PEU.P.table.TableSorterZYNK;
@SuppressWarnings({"unused"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
public class P_AggregationPLSearch {
	@SuppressWarnings({ "unchecked" })
	public static void P_AggregationLimitMap(String[] sets
			, List<Map<String, Object>> output) throws InstantiationException, IllegalAccessException, IOException {
		List<Map<String, Object>> outputTemp = new ArrayList<>();
		if(sets[1].equalsIgnoreCase("sortNumber")) {
			//outputTemp 是一个arraylist，已经具备了 排序的 模子。
			//这里通常会有数字和字符串2种模式，
			//于是设计sortNumber， sortString两个语法先
			return;
		}
		if(sets[1].equalsIgnoreCase("进行字符排序")) {
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
			if(sets[2].equalsIgnoreCase("从小到大")) {
				for(int i= 0; i< strings.length; i++) {
					outputTemp.add(maps.get(strings[i]));
				}
			}else if(sets[2].equalsIgnoreCase("从大到小")) {
				for(int i= 0; i< strings.length; i++) {
					outputTemp.add(maps.get(strings[strings.length- i- 1]));
				}
			}
			output.clear();
			output.addAll(outputTemp);
			return;
		}
		
		if(sets[1].equalsIgnoreCase("进行数字排序")) {
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
			double[] doubles= new double[outputTemp.size()];
			int index= 0;
			while(iterators.hasNext()) {
				Map<String, Object> map= iterators.next();
				Map<String, Object> rowValue= (Map<String, Object>)map.get("rowValue");
				Map<String, Object> culumnValue= (Map<String, Object>)rowValue.get(sets[0]);
				maps.put(culumnValue.get("culumnValue").toString(), map);	
				doubles[index++]= Double.valueOf(culumnValue.get("culumnValue").toString());
			}

			//2 list 去map名
			//3 sort map名
//			SortStringDemo.initMap();	
//			int returnInt= new LYG10DWCMSSort13D_XCDX_C_A_S()
//					.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(strings
//							, 0, strings.length- 1, 80, SortStringDemo.pinYin
//							, SortStringDemo.biHua, 7, 70);
			
			new LYG9DWithDoubleTopSort4D().sort(doubles, 7, 70);
			//4 输出
			outputTemp.clear();
			if(sets[2].equalsIgnoreCase("从小到大")) {
				for(int i= 0; i< doubles.length; i++) {
					outputTemp.add(maps.get(""+ (int)doubles[i]));
				}
			}else if(sets[2].equalsIgnoreCase("从大到小")) {
				for(int i= 0; i< doubles.length; i++) {
					outputTemp.add(maps.get(""+ (int)doubles[doubles.length- i- 1]));
				}
			}
			output.clear();
			output.addAll(outputTemp);
			return;
		}
		
		if(sets[1].equalsIgnoreCase("行至")) {
			Iterator<Map<String, Object>> iterator= output.iterator();
			int count= 0;
			while(iterator.hasNext()) {
				int rowid= count++;
				Map<String, Object> row= iterator.next();
				Map<String, Object> rowMap= new HashMap<>();
				if(sets[1].equalsIgnoreCase("行至")) {
					if(rowid >= new BigDecimal(sets[0]).doubleValue() && rowid 
							<= new BigDecimal(sets[2]).doubleValue()) {
						outputTemp.add(row);
					}	
				}
			}
			output.clear();
			output.addAll(outputTemp);
			return;
		}
		//稍后我会把这里 改成 contains 德塔DNN词汇，这样语言就自适应了。
		//罗瑶光 20211003
		if(sets[1].equalsIgnoreCase("颜色标记为")) {
			Iterator<Map<String, Object>> iterator = output.iterator();
			int count = 0;
			while(iterator.hasNext()) {
				int rowid = count++;
				Map<String, Object> row = iterator.next();
				Map<String, Object> rowMap = new HashMap<>();
				if(sets[1].equalsIgnoreCase("颜色标记为")) {
					Map<String, Object> map= (Map<String, Object>)row.get("rowValue");
					Map<String, Object> mapCulumn= (Map<String, Object>)map.get(sets[0]);
					String rowCellFromString= mapCulumn.get("culumnValue").toString();
					if(sets[2].equals("红色")) {
						sets[2]= "red";
					}
					if(sets[2].equals("黄色")) {
						sets[2]= "yellow";
					}
					if(sets[2].equals("蓝色")) {
						sets[2]= "blue";
					}
					if(sets[2].equals("绿色")) {
						sets[2]= "green";
					}
					rowCellFromString= "<div style=\"background:black\"><font color=\""+ sets[2] +"\">"
							+ rowCellFromString+ "</font></div>";
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
			return;
		}
		
		if(sets[1].equalsIgnoreCase("进行分词")) {
			Iterator<Map<String, Object>> iterator = output.iterator();
			int count = 0;
			while(iterator.hasNext()) {
				int rowid = count++;
				Map<String, Object> row = iterator.next();
				Map<String, Object> rowMap = new HashMap<>();
				if(sets[2].equalsIgnoreCase("词性显色")) {
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
				
				if(sets[2].equalsIgnoreCase("词性标注")) {
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
							rowCellFromString+= string+ "("+ nlp.get(string)+ ") ";
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
				
				//之后我会把dataCG函数进行重新封装，去重。
				if(sets[2].equalsIgnoreCase("DNN")) {
					Map<String, Object> map= (Map<String, Object>)row.get("rowValue");
					Map<String, Object> mapCulumn= (Map<String, Object>)map.get(sets[0]);
					String rowCellFromString= mapCulumn.get("culumnValue").toString();
					//
					//System.out.printntln(string);
					SensingTest sensingTest = HRJFrame.NE._A.getSensingTest();
					DNNTest dNNTest= new DNNTest();
					ANNTest aNNTest= new ANNTest();
					String[][] ann= aNNTest.getANNMatrix(sensingTest, rowCellFromString, HRJFrame.NE._A);
					String[][] dnn= dNNTest.getDNNMatrix(sensingTest, ann, HRJFrame.NE._A, rowCellFromString);
					List<String> cigan = new LinkedList<>();
					Here:
					for(int i=0; i<dnn.length; i++) {
						double dnn_lwa = 0;
						if(null == dnn[i][3]) {
							continue Here;
						}
						dnn_lwa = DetaDouble.parseDouble(dnn[i][3]);
						if(dnn_lwa>0) {
							String line="";
							line+=ann[i][0] + ":";
							line+=dnn[i][3] + ":";
							cigan.add(line);
						}
					}
					String[][] value = new String[cigan.size()][2];
					Iterator<String> iterators = cigan.iterator();
					int valueCount = 0;
					while(iterators.hasNext()) {
						String iteratorString = iterators.next();
						value[valueCount][0] = iteratorString.split(":")[0];
						value[valueCount++][1] = iteratorString.split(":")[1];
					}
					//value = new Quick_6D_luoyaoguang_Sort().sort(value);
					value = new Quick_7D_luoyaoguang_Sort().sort(value);
					String cg= "词名/DNN";
				    cg+= "\r\n";
					for(int i = 0; i<value.length; i++) {
						cg += value[i][0] + ":" + value[i][1] + "\r\n";
					}
					rowCellFromString+= "<div style=\"background:white\">";
					rowCellFromString+= cg +"</div>";
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
			return;
		}	
//		//稍后把这里 行遍历 改成 命令遍历。提高计算速度
//		//罗瑶光20211002
//		Iterator<Map<String, Object>> iterator = output.iterator();
//		int count = 0;
//		while(iterator.hasNext()) {
//			int rowid = count++;
//			Map<String, Object> row = iterator.next();
//			Map<String, Object> rowMap = new HashMap<>();
//			if(sets[1].equalsIgnoreCase("行至")) {
//				if(rowid >= new BigDecimal(sets[0]).doubleValue() && rowid 
//						<= new BigDecimal(sets[2]).doubleValue()) {
//					outputTemp.add(row);
//				}	
//			}
//
//			if(sets[1].equalsIgnoreCase("颜色")) {
//				Map<String, Object> map= (Map<String, Object>)row.get("rowValue");
//				Map<String, Object> mapCulumn= (Map<String, Object>)map.get(sets[0]);
//				String rowCellFromString= mapCulumn.get("culumnValue").toString();
//				if(sets[2].equals("红色")) {
//					sets[2]= "red";
//				}
//				if(sets[2].equals("黄色")) {
//					sets[2]= "yellow";
//				}
//				if(sets[2].equals("蓝色")) {
//					sets[2]= "blue";
//				}
//				if(sets[2].equals("绿色")) {
//					sets[2]= "green";
//				}
//				rowCellFromString= "<div style=\"background:black\"><font color=\""+ sets[2] +"\">"
//						+ rowCellFromString+ "</font></div>";
//				//更新
//				outputTemp.remove(row);
//				mapCulumn.put("culumnValue", rowCellFromString);
//				map.put(sets[0], mapCulumn);
//				row.put("rowValue", map);
//				outputTemp.add(row);
//			}
//
//			if(sets[1].equalsIgnoreCase("分词")) {
//				Map<String, Object> map= (Map<String, Object>)row.get("rowValue");
//				Map<String, Object> mapCulumn= (Map<String, Object>)map.get(sets[0]);
//				String rowCellFromString= mapCulumn.get("culumnValue").toString();
//				List<String> list= HRJFrame.NE._A.parserMixedString(rowCellFromString);
//				Map<String, String> nlp= HRJFrame.NE._A.getPosCnToCn();
//				Iterator<String> iterators= list.iterator();
//				rowCellFromString= "";
//				rowCellFromString+= "<div style=\"background:white\">";
//				while(iterators.hasNext()) {
//					String string= iterators.next();
//					if(nlp.containsKey(string)) {
//						rowCellFromString+= "<font color=\""+ 
//								(!nlp.get(string).contains("动")?!nlp.get(string).contains("名")?!nlp.get(string).contains("形")?
//										"black": "blue": "red": "green") +"\">"
//										+ string+ "</font>";
//					}
//				}
//				rowCellFromString+= "</div>";
//				//rowCellFromString= "<div style=\"background:white\"><font color=\""+ sets[2] +"\">"
//				//+ rowCellFromString+ "</font></div>";
//				//更新
//				outputTemp.remove(row);
//				mapCulumn.put("culumnValue", rowCellFromString);
//				map.put(sets[0], mapCulumn);
//				row.put("rowValue", map);
//				outputTemp.add(row);
//			}
//		}	
		output.clear();
		output.addAll(outputTemp);
	}
}