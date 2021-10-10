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
import OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell.TinMap;
import PEQ.AMV.ECS.test.ANNTest;
import PEQ.AMV.ECS.test.DNNTest;
import PEQ.AMV.ECS.test.SensingTest;
import PEU.P.table.TableSorterZYNK;
@SuppressWarnings({"unused"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
//pletl 先实现 上中下的 tinmap中指令合并
public class P_AggregationPLETL {
	@SuppressWarnings({"unchecked"})
	public static void P_PletlLimitMap(String[] sets, List<Map<String, Object>> output, Map<String, Object> object) 
			throws InstantiationException, IllegalAccessException, IOException {
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		//中节点|表格合并|主码|新增列|ID|。。
		//上节点是main节点作为accumulator，模拟rna芯片计算容器，中下节点模拟神经元记忆接口。
		if(sets[1].equalsIgnoreCase("表格合并")) {
			TinMap mapShell= null;
			String 列标识 = null;
			if(sets[0].equalsIgnoreCase("中节点")) {
				mapShell= (TinMap)object.get("midShell");
				列标识= "m_";
			}
			if(sets[0].equalsIgnoreCase("下节点")) {
				mapShell= (TinMap)object.get("downShell");
				列标识= "d_";
			}
			if(sets[2].equalsIgnoreCase("主码")) {//先单一primary key， 之后再设计 forenge key 和 combination key
				//To do。。。 
				List<Map<String, Object>> rowList= (List<Map<String, Object>>)mapShell.get("obj");
				if(0!= rowList.size()) {
					Iterator<Map<String, Object>> iterator= rowList.iterator();
					Here:
						while(iterator.hasNext()) {
							Map<String, Object> row= iterator.next();
							Map<String, Object> rowValue= (Map<String, Object>)row.get("rowValue");
							Map<String, Object> culumnValue= (Map<String, Object>)rowValue.get(sets[4]);
							if(0!= outputTemp.size()) {
								Iterator<Map<String, Object>> outputTempIterator= outputTemp.iterator();
								while(outputTempIterator.hasNext()) {
									Map<String, Object> rowOutputTempIterator= outputTempIterator.next();
									Map<String, Object> rowValueRowOutputTempIterator
										= (Map<String, Object>)rowOutputTempIterator.get("rowValue");
									//outputTemp
									if(rowValueRowOutputTempIterator.containsKey(sets[4])) {
										Map<String, Object> rowValueRowOutputTempIteratorCulumnValue
											= (Map<String, Object>)rowValueRowOutputTempIterator.get(sets[4]);
										//合并rowValueRowOutputTempIteratorCulumnValue 与 culumnValue
										//合并方式，1 叠加列合并 2 新增列合并
										//先实现简单的 新增列合并
										if(sets[3].equalsIgnoreCase("新增列")) {
											Iterator<String> iteratorCulumnValue= culumnValue.keySet().iterator();	
											while(iteratorCulumnValue.hasNext()) {
												String string= iteratorCulumnValue.next();
												Map<String, Object> culumnCell= (Map<String, Object>) culumnValue.get(string);
												culumnCell.put("culumnName", 列标识+ string);
												rowValueRowOutputTempIteratorCulumnValue.put(列标识+ string, culumnCell);
												//先这样，测试下
											}
										}	
									}
								}
							}
						}
				}
			}
			//			if(sets[2].equalsIgnoreCase("自由定义各种命令。。")) {
			//			//To do。。。 
			//		}
			output.clear();
			output.addAll(outputTemp);
		}
	}
}