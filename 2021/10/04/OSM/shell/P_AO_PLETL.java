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
//����˼����ﲹ�����ʱ��˼���� �����slang ��ģʽ �ͳ���ģʽ ������
public class P_AO_PLETL {
	@SuppressWarnings({"unchecked"})
	public static void P_PletlLimitMap(String[] sets, List<Map<String, Object>> output, Map<String, Object> object) 
			throws InstantiationException, IllegalAccessException, IOException {
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		//�нڵ�|���ϲ�|����|������|ID|����
		//�Ͻڵ���main�ڵ���Ϊaccumulator��ģ��rnaоƬ�������������½ڵ�ģ����Ԫ����ӿڡ�
		//��Ʊ��ﲹ���� �����Ϊ���� 20211011 ������
		//PLETL:�нڵ�|���б��ϲ�|����Ϊ|ID|ģʽΪ|������;
		//PLETL:�нڵ�|���б��ϲ�|����Ϊ|ID|ģʽΪ|������;
		//PLETL:�нڵ�|���б��ϲ�|����Ϊ|ID|ģʽΪ|�н���������;
		//PLETL:�нڵ�|���б��ϲ�|����Ϊ|ID|ģʽΪ|�н���������;
		//PLETL:�нڵ�|���б��ϲ�|����Ϊ|ID|ģʽΪ|�޽���������;
		if(sets[1].equalsIgnoreCase("���б��ϲ�")) {
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

			//�������������ѭ�� �ߵ�rotation ����
			if(sets[2].equalsIgnoreCase("����Ϊ")) {//�ȵ�һprimary key�� ֮������� forenge key �� combination key
				//To do��������ʼ
				Map<String, Object> tinShellETL= (Map<String, Object>)mapShell.get("TinShellETL");
				List<Map<String, Object>> rowList= (List<Map<String, Object>>)tinShellETL.get("obj");
				//��ѭ��
				List<Map<String, Object>> ��Ҫ������ѵ= (List<Map<String, Object>>)object.get("obj");
				Iterator<Map<String, Object>> outputTempIterator= ��Ҫ������ѵ.iterator();
				while(outputTempIterator.hasNext()) {
					Map<String, Object> rowOutputTempIterator= outputTempIterator.next();
					Map<String, Object> rowValueRowOutputTempIterator
					= (Map<String, Object>)rowOutputTempIterator.get("rowValue");
					if(0!= rowList.size()) {
						//��ѭ��
						Iterator<Map<String, Object>> iterator= rowList.iterator();
						Here:
							while(iterator.hasNext()) {//����Ҫ������ѵ
								Map<String, Object> row= iterator.next();
								Map<String, Object> rowValue= (Map<String, Object>)row.get("rowValue");
								Map<String, Object> culumnValue= (Map<String, Object>)rowValue.get(sets[3]);
								//outputTemp
								if(rowValueRowOutputTempIterator.containsKey(sets[3])) {
									Map<String, Object> rowValueRowOutputTempIteratorCulumnValue
									= (Map<String, Object>)rowValueRowOutputTempIterator.get(sets[3]);
									//�ϲ�rowValueRowOutputTempIteratorCulumnValue �� culumnValue
									//�ϲ���ʽ��1 �����кϲ� 2 �����кϲ�
									//��ʵ�ּ򵥵� �����кϲ�
									//��ִ��ǰ����sets[3]��ȼ��
									if(rowValueRowOutputTempIteratorCulumnValue.get("culumnValue")
											.equals(culumnValue.get("culumnValue"))) {
										if(sets[4].equalsIgnoreCase("ģʽΪ")) {
											model(sets, rowValue, �б�ʶ, rowValueRowOutputTempIterator);
										}	
									}
									//������״���� ���� 
									//������
									//������
									//��
								}
								rowOutputTempIterator.put("rowValue", rowValueRowOutputTempIterator);
							}
					}
					outputTemp.add(rowOutputTempIterator);
				}
			}
			//			if(sets[2].equalsIgnoreCase("���ɶ�����������")) {
			//			//To do������ 
			//		}
			output.clear();
			output.addAll(outputTemp);
		}

		//��Ƶ� �ཻ
		//PLETL:�нڵ�|���б���ཻ|����Ϊ|ID|ģʽΪ|������;
		//PLETL:�нڵ�|���б���ཻ|����Ϊ|ID|ģʽΪ|������;
		//PLETL:�нڵ�|���б���ཻ|����Ϊ|ID|ģʽΪ|�н���������;
		//PLETL:�нڵ�|���б���ཻ|����Ϊ|ID|ģʽΪ|�н���������;
		//PLETL:�нڵ�|���б���ཻ|����Ϊ|ID|ģʽΪ|�޽���������;
		if(sets[1].equalsIgnoreCase("���б���ཻ")) {
			TinMap mapShell= null;
			String �б�ʶ= null;
			if(sets[0].equalsIgnoreCase("�нڵ�")) {
				mapShell= (TinMap)object.get("midShell");
				�б�ʶ= "m_";
			}
			if(sets[0].equalsIgnoreCase("�½ڵ�")) {
				mapShell= (TinMap)object.get("downShell");
				�б�ʶ= "d_";
			}

			//�������������ѭ�� �ߵ�rotation ����
			if(sets[2].equalsIgnoreCase("����Ϊ")) {//�ȵ�һprimary key�� ֮������� forenge key �� combination key
				//To do��������ʼ
				Map<String, Object> tinShellETL= (Map<String, Object>)mapShell.get("TinShellETL");
				List<Map<String, Object>> rowList= (List<Map<String, Object>>)tinShellETL.get("obj");
				//��ѭ��
				List<Map<String, Object>> ��Ҫ������ѵ= (List<Map<String, Object>>)object.get("obj");
				Iterator<Map<String, Object>> outputTempIterator= ��Ҫ������ѵ.iterator();
				while(outputTempIterator.hasNext()) {
					Map<String, Object> rowOutputTempIterator= outputTempIterator.next();
					Map<String, Object> rowValueRowOutputTempIterator
					= (Map<String, Object>)rowOutputTempIterator.get("rowValue");
					boolean findConjunction= false;
					if(0!= rowList.size()) {
						//��ѭ��
						Iterator<Map<String, Object>> iterator= rowList.iterator();
						while(iterator.hasNext()) {//����Ҫ������ѵ
							Map<String, Object> row= iterator.next();
							Map<String, Object> rowValue= (Map<String, Object>)row.get("rowValue");
							Map<String, Object> culumnValue= (Map<String, Object>)rowValue.get(sets[3]);
							//outputTemp
							if(rowValueRowOutputTempIterator.containsKey(sets[3])) {
								Map<String, Object> rowValueRowOutputTempIteratorCulumnValue
								= (Map<String, Object>)rowValueRowOutputTempIterator.get(sets[3]);
								//�ϲ�rowValueRowOutputTempIteratorCulumnValue �� culumnValue
								//�ϲ���ʽ��1 �����кϲ� 2 �����кϲ�
								//��ʵ�ּ򵥵� �����кϲ�
								//��ִ��ǰ����sets[3]��ȼ��
								if(rowValueRowOutputTempIteratorCulumnValue.get("culumnValue")
										.equals(culumnValue.get("culumnValue"))) {//�Ժ���������Ż�
									findConjunction= true;
									if(sets[4].equalsIgnoreCase("ģʽΪ")) {
										model(sets, rowValue, �б�ʶ, rowValueRowOutputTempIterator);
									}	
								}
								//������״���� ���� 
								//������
								//������
								//��
							}
							rowOutputTempIterator.put("rowValue", rowValueRowOutputTempIterator);
						}
					}
					if(true== findConjunction) {//�н������вű���
						outputTemp.add(rowOutputTempIterator);
					}
				}
			}
			//			if(sets[2].equalsIgnoreCase("���ɶ�����������")) {
			//			//To do������ 
			//		}
			output.clear();
			output.addAll(outputTemp);
		}

		//PLETL:�нڵ�|���б���޳�|����Ϊ|ID|ģʽΪ|�ཻ�����޳�;
		if(sets[1].equalsIgnoreCase("���б���޳�")) {
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

			//�������������ѭ�� �ߵ�rotation ����
			if(sets[2].equalsIgnoreCase("����Ϊ")) {//�ȵ�һprimary key�� ֮������� forenge key �� combination key
				//To do��������ʼ
				Map<String, Object> tinShellETL= (Map<String, Object>)mapShell.get("TinShellETL");
				List<Map<String, Object>> rowList= (List<Map<String, Object>>)tinShellETL.get("obj");
				//��ѭ��
				List<Map<String, Object>> ��Ҫ������ѵ= (List<Map<String, Object>>)object.get("obj");
				Iterator<Map<String, Object>> outputTempIterator= ��Ҫ������ѵ.iterator();
				while(outputTempIterator.hasNext()) {
					Map<String, Object> rowOutputTempIterator= outputTempIterator.next();
					Map<String, Object> rowValueRowOutputTempIterator
					= (Map<String, Object>)rowOutputTempIterator.get("rowValue");
					boolean findConjunction= false;
					if(0!= rowList.size()) {
						//��ѭ��
						Iterator<Map<String, Object>> iterator= rowList.iterator();
						while(iterator.hasNext()) {//����Ҫ������ѵ
							Map<String, Object> row= iterator.next();
							Map<String, Object> rowValue= (Map<String, Object>)row.get("rowValue");
							Map<String, Object> culumnValue= (Map<String, Object>)rowValue.get(sets[3]);
							//outputTemp
							if(rowValueRowOutputTempIterator.containsKey(sets[3])) {
								Map<String, Object> rowValueRowOutputTempIteratorCulumnValue
								= (Map<String, Object>)rowValueRowOutputTempIterator.get(sets[3]);
								//�ϲ�rowValueRowOutputTempIteratorCulumnValue �� culumnValue
								//�ϲ���ʽ��1 �����кϲ� 2 �����кϲ�
								//��ʵ�ּ򵥵� �����кϲ�
								//��ִ��ǰ����sets[3]��ȼ��
								if(rowValueRowOutputTempIteratorCulumnValue.get("culumnValue")
										.equals(culumnValue.get("culumnValue"))) {//�Ժ���������Ż�
									findConjunction= true;
								}
								//������״���� ���� 
								//������
								//������
								//��
							}
							rowOutputTempIterator.put("rowValue", rowValueRowOutputTempIterator);
						}
					}
					if(false== findConjunction) {//�޽������вű���
						outputTemp.add(rowOutputTempIterator);
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

	//֮�������״���ĺ����һ�ֳ�ȥ �ṹ�� ������ 20211012
	@SuppressWarnings("unchecked")
	private static void model(String[] sets, Map<String, Object> rowValue, String �б�ʶ
			, Map<String, Object> rowValueRowOutputTempIterator) {

		if(sets[5].equalsIgnoreCase("������")) {
			Iterator<String> iteratorCulumnValue= rowValue.keySet().iterator();	
			while(iteratorCulumnValue.hasNext()) {
				String string= iteratorCulumnValue.next();
				Map<String, Object> culumnCell= (Map<String, Object>) rowValue.get(string);
				culumnCell.put("culumnName", �б�ʶ+ string);
				rowValueRowOutputTempIterator.put(�б�ʶ+ string, culumnCell);
				//��������������
			}
		}
		//������
		if(sets[5].equalsIgnoreCase("������")) {
			//�б���
			Iterator<String> iteratorCulumnValue= rowValue.keySet().iterator();	
			while(iteratorCulumnValue.hasNext()) {
				String string= iteratorCulumnValue.next();
				//�в���
				Map<String, Object> culumnCell= (Map<String, Object>) rowValue.get(string);
				if(rowValueRowOutputTempIterator.containsKey(string)) {
					//�о͵���
					Map<String, Object> culumnCellMain
					= (Map<String, Object>) rowValueRowOutputTempIterator.get(string);
					culumnCellMain.put("culumnValue", culumnCellMain.get("culumnValue").toString()
							+ culumnCell.get("culumnValue").toString() );
					rowValueRowOutputTempIterator.put(string, culumnCellMain);
				}else {
					//û�о����
					culumnCell.put("culumnName", �б�ʶ+ string);
					rowValueRowOutputTempIterator.put(�б�ʶ+ string, culumnCell);
				}
			}
		}	
		//�н����� ����
		if(sets[5].equalsIgnoreCase("�н���������")) {
			//�б���
			Iterator<String> iteratorCulumnValue= rowValue.keySet().iterator();	
			while(iteratorCulumnValue.hasNext()) {
				String string= iteratorCulumnValue.next();
				//�в���
				Map<String, Object> culumnCell= (Map<String, Object>) rowValue.get(string);
				if(rowValueRowOutputTempIterator.containsKey(string)) {
					//�о͵���
					Map<String, Object> culumnCellMain
					= (Map<String, Object>) rowValueRowOutputTempIterator.get(string);
					culumnCellMain.put("culumnValue", culumnCellMain.get("culumnValue").toString()
							+ culumnCell.get("culumnValue").toString());
					rowValueRowOutputTempIterator.put(string, culumnCellMain);
				}
			}
		}
		//�н����� ����
		if(sets[5].contains("����������")) {
			//�б���
			Iterator<String> iteratorCulumnValue= rowValue.keySet().iterator();	
			while(iteratorCulumnValue.hasNext()) {
				String string= iteratorCulumnValue.next();
				//�в���
				Map<String, Object> culumnCell= (Map<String, Object>) rowValue.get(string);
				if(sets[5].equalsIgnoreCase("�н���������")) {
					if(rowValueRowOutputTempIterator.containsKey(string)) {
						culumnCell.put("culumnName", �б�ʶ+ string);
						rowValueRowOutputTempIterator.put(�б�ʶ+ string, culumnCell);
					}
				}else if(sets[5].equalsIgnoreCase("�޽���������")) {
					if(!rowValueRowOutputTempIterator.containsKey(string)) {
						culumnCell.put("culumnName", �б�ʶ+ string);
						rowValueRowOutputTempIterator.put(�б�ʶ+ string, culumnCell);
					}
				}	
			}
		}
		//�ཻ�����޳�
	}
}