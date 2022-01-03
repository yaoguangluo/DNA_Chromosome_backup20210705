package SEM.bloom;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ESU.list.List_ESU;
import ESU.sort.Quick9DLYGWithString_ESU;
import ME.APM.VSQ.App;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public class StaticFunctionMapQ_VECS_E implements StaticFunctionMapQ_VECS_C {
	public Map<String, String> annotationMap= new HashMap<>();
	public void searchFromTable(String key, DefaultTableModel newTableModel, Object[][] tableData_old
			, ArrayList<String> copy_xj, Map<String, String> dic_xj, App app) throws IOException {
		if(null== key|| key.equals("")) {//��null key check��ǰ�������ӿ�
			newTableModel.getDataVector().clear();
			for(int i= 0; i< tableData_old.length; i++) {
				newTableModel.insertRow(i, tableData_old[i]);
			}		
			newTableModel.fireTableDataChanged();	
			return;
		}
		//////////////
		String[] score=new String[copy_xj.size()];
		int[] score_code=new int[copy_xj.size()];
		int []reg= new int[copy_xj.size()];
		int count=0;
		Map<String, WordFrequency> mapSearchWithoutSort = null;
		CogsBinaryForest_AE _A= new CogsBinaryForest_AE();
		_A.IV_Mixed();
		Map<String, String> pos= _A.getPosCnToCn();
		mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(key);
		Iterator<String> iteratorForCopy = copy_xj.iterator();	
		int copyCount = 0;
		//List<String> list= u._A.parserMixedString(key);
		//�����ò��� list���������׼����frequencymap��key���list
		List<String> list= new ArrayList<>();
		Iterator<String> iterator= mapSearchWithoutSort.keySet().iterator();
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		String[] string= List_ESU.listToArray(list);
		String[] stringReg= new String[key.length()/3];
		for(int i= 0; i< stringReg.length; i++) {
			stringReg[i]= key.substring(i*3, (i*3+ 3)<key.length()?(i*3+ 3):key.length()-1);
		}
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString = iteratorForCopy.next();
			score[copyCount] = iteratorForCopyString;
			String temps = dic_xj.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					String mapSearchaAtII = iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
					if(temps.contains(mapSearchaAtII)) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						score[copyCount] = iteratorForCopyString;
						if(score[copyCount].contains(key.replace(" ", ""))) {
							reg[copyCount]+= 500;
						}
						if(key.contains(score[copyCount].replace(" ", ""))) {
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
						score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1) 
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
								score[copyCount] = iteratorForCopyString;
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
				for(int i= 0; i< string.length; i++) {
					if(temps.contains(string[i])) {//��Ϊ��FrequencyMap���棬����Ҫ����Ƶ�ʡ�
						tempb+= code* mapSearchWithoutSort.get(string[i]).getFrequency();
					}
				}
				//�Ͼ�
				for(int i= 0; i< stringReg.length; i++) {
					if(temps.contains(stringReg[i])) {
						tempb+= code;
					}
				}
				score_code[copyCount] = (int) (tempa/Math.pow(app.lookrot+ 1, 4) + tempb*Math.pow(app.lookrot, 2));
			}
			if(key.replace(" ", "").length()> 1&& key.replace(" ", "").length()< 5) {
				if(temps.contains(key)) {
					tempb+= code<< 7;
				}
				score_code[copyCount] = (int) (tempa/Math.pow(app.lookrot+ 1, 4) + tempb*Math.pow(app.lookrot, 2));
			}
			copyCount++;
		}
		new Quick9DLYGWithString_ESU().sort(score_code, score);
		Object[][] tableData = new Object[count][18];
		int new_count=0;
		newTableModel.getDataVector().clear();
		Here:
			for(int i = copy_xj.size()-1; i > -1; i--) {
				if(score_code[i] < 1){
					continue Here;
				}
				if(app.shuming_filter_box.isSelected()) {
					String wei= score[i];
					String temp= app.name_filter.getText();
					for(int j=0;j<temp.length();j++) {
						if(wei.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				tableData[new_count]= new Object[]{new_count+1,
						score_code[i],
						score[i],
						dic_xj.get(score[i]).toString()
				};   
				newTableModel.insertRow(new_count, tableData[new_count]);
				new_count+=1;
			}	
		newTableModel.fireTableDataChanged();	
	}

	//�پ���� �Ժ�ȥDefaultTableModel ֱ����� ���������� Object[][] ���ɡ�
	public List<Object[]> searchFromTablewithScale(String searchkey, ArrayList<String> ����
			, Map<String, String> ����, double lookrot) throws IOException {
		List<Object[]> outputList= new ArrayList<>();
		if(null== searchkey|| searchkey.equals("")) {//��null key check��ǰ�������ӿ�
			return outputList;
		}
		//////////////
		String[] score=new String[����.size()];
		int[] score_code=new int[����.size()];
		int []reg= new int[����.size()];
		int count=0;
		Map<String, WordFrequency> mapSearchWithoutSort = null;
		CogsBinaryForest_AE _A= new CogsBinaryForest_AE();
		_A.IV_Mixed();
		Map<String, String> pos= _A.getPosCnToCn();
		mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(searchkey);
		Iterator<String> iteratorForCopy = ����.iterator();	
		int copyCount = 0;
		//List<String> list= u._A.parserMixedString(key);
		//�����ò��� list���������׼����frequencymap��key���list
		List<String> list= new ArrayList<>();
		Iterator<String> iterator= mapSearchWithoutSort.keySet().iterator();
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		String[] string= List_ESU.listToArray(list);
		String[] stringReg= new String[searchkey.length()/3];
		for(int i= 0; i< stringReg.length; i++) {
			stringReg[i]= searchkey.substring(i*3, (i*3+ 3)<searchkey.length()?(i*3+ 3):searchkey.length()-1);
		}
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString = iteratorForCopy.next();
			score[copyCount] = iteratorForCopyString;
			String temps = ����.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					String mapSearchaAtII = iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
					if(temps.contains(mapSearchaAtII)) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						score[copyCount] = iteratorForCopyString;
						if(score[copyCount].contains(searchkey.replace(" ", ""))) {
							reg[copyCount]+= 500;
						}
						if(searchkey.contains(score[copyCount].replace(" ", ""))) {
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
						score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1) 
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
								score[copyCount] = iteratorForCopyString;
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
			if(searchkey.length()> 4) {
				//ȫ��
				for(int i= 0; i< string.length; i++) {
					if(temps.contains(string[i])) {//��Ϊ��FrequencyMap���棬����Ҫ����Ƶ�ʡ�
						tempb+= code* mapSearchWithoutSort.get(string[i]).getFrequency();
					}
				}
				//�Ͼ�
				for(int i= 0; i< stringReg.length; i++) {
					if(temps.contains(stringReg[i])) {
						tempb+= code;
					}
				}
				score_code[copyCount] = (int) (tempa/Math.pow(lookrot+ 1, 4) + tempb*Math.pow(lookrot, 2));
			}
			if(searchkey.replace(" ", "").length()> 1&& searchkey.replace(" ", "").length()< 5) {
				if(temps.contains(searchkey)) {
					tempb+= code<< 7;
				}
				score_code[copyCount] = (int) (tempa/Math.pow(lookrot+ 1, 4) + tempb*Math.pow(lookrot, 2));
			}
			copyCount++;
		}
		new Quick9DLYGWithString_ESU().sort(score_code, score);
		Object[][] tableData = new Object[count][18];
		int new_count=0;
		Here:
			for(int i = ����.size()-1; i > -1; i--) {
				if(score_code[i] < 1){
					continue Here;
				}
				tableData[new_count]= new Object[]{new_count+1,
						score_code[i],
						score[i],
						����.get(score[i]).toString()
				};   
				outputList.add(tableData[new_count]);
				new_count+=1;
			}	
		return outputList;
	}
	//�Ѳ��ԣ� �����ȷ
	public static void main(String[] argv) throws IOException {	
		ArrayList<String> ����= new ArrayList<String>();
		Map<String, String> ����= new HashMap<>();
		double lookrot= 0;
		����.add("������");
		����.add("������");
		����.add("������");
		����.add("������");
		����.add("������");
		
		����.put("������","������luoyaoguang");
		����.put("������","������luoyaolin");
		����.put("������","������luoyunlv");
		����.put("������","������luozhenyou");
		����.put("������","������luozhenxin");
		
		String searchkey= "������";
		List<Object[]> outputList = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(searchkey, ����, ����, lookrot);
		Iterator<Object[]> iterator= outputList.iterator();
		while(iterator.hasNext()) {
			Object[] object= iterator.next();
			for(int i= 0; i<object.length; i++) {
				System.out.println(object[i].toString());
			}
		}
		searchkey= "����";
		outputList = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(searchkey, ����, ����, lookrot);
		iterator= outputList.iterator();
		while(iterator.hasNext()) {
			Object[] object= iterator.next();
			for(int i= 0; i<object.length; i++) {
				System.out.println(object[i].toString());
			}
		}
		
		searchkey= "����";
		outputList = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(searchkey, ����, ����, lookrot);
		iterator= outputList.iterator();
		while(iterator.hasNext()) {
			Object[] object= iterator.next();
			for(int i= 0; i<object.length; i++) {
				System.out.println(object[i].toString());
			}
		}
	}
}
