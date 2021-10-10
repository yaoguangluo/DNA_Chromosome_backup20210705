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
//�Ժ�DMA�ļ����ڴ�����滻�� jtable���ڴ���� ������
//pletl ��ʵ�� �����µ� tinmap��ָ��ϲ�
public class P_AggregationPLETL {
	@SuppressWarnings({"unchecked"})
	public static void P_PletlLimitMap(String[] sets, List<Map<String, Object>> output, Map<String, Object> object) 
			throws InstantiationException, IllegalAccessException, IOException {
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		//�нڵ�|���ϲ�|����|������|ID|����
		//�Ͻڵ���main�ڵ���Ϊaccumulator��ģ��rnaоƬ�������������½ڵ�ģ����Ԫ����ӿڡ�
		if(sets[1].equalsIgnoreCase("���ϲ�")) {
			TinMap mapShell= null;
			String �б�ʶ = null;
			if(sets[0].equalsIgnoreCase("�нڵ�")) {
				mapShell= (TinMap)object.get("midShell");
				�б�ʶ= "m_";
			}
			if(sets[0].equalsIgnoreCase("�½ڵ�")) {
				mapShell= (TinMap)object.get("downShell");
				�б�ʶ= "d_";
			}
			if(sets[2].equalsIgnoreCase("����")) {//�ȵ�һprimary key�� ֮������� forenge key �� combination key
				//To do������ 
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
										//�ϲ�rowValueRowOutputTempIteratorCulumnValue �� culumnValue
										//�ϲ���ʽ��1 �����кϲ� 2 �����кϲ�
										//��ʵ�ּ򵥵� �����кϲ�
										if(sets[3].equalsIgnoreCase("������")) {
											Iterator<String> iteratorCulumnValue= culumnValue.keySet().iterator();	
											while(iteratorCulumnValue.hasNext()) {
												String string= iteratorCulumnValue.next();
												Map<String, Object> culumnCell= (Map<String, Object>) culumnValue.get(string);
												culumnCell.put("culumnName", �б�ʶ+ string);
												rowValueRowOutputTempIteratorCulumnValue.put(�б�ʶ+ string, culumnCell);
												//��������������
											}
										}	
									}
								}
							}
						}
				}
			}
			//			if(sets[2].equalsIgnoreCase("���ɶ�����������")) {
			//			//To do������ 
			//		}
			output.clear();
			output.addAll(outputTemp);
		}
	}
}