package ESU.array;

import java.util.HashMap;
import java.util.Map;

public class Double_ESU{
	public static Map<Double, Map<String, Boolean>> getMapFromDoubleStringArray(Double[] score, String[] nameScore){
		Map<Double, Map<String, Boolean>> map= new HashMap<>();
		for(int i= 0; i< score.length; i++) {
			Map<String, Boolean> maps;
			if(map.containsKey(score[i])) {
				maps= map.get(score[i]);
			}else {
				maps= new HashMap<>();
			}
			//��Ϊ�ϲ�ҩ���ļ�����ͬ�������������ֵ���ģʽ�������鼮�ֿ�
			if(maps.containsKey(nameScore[i].toString())) {//��Ϊ�ϲ�ҩ���ļ�����ͬ�������������ֵ���ģʽ�������鼮�ֿ�
				maps.put(nameScore[i].toString()+ ""+ maps.size()+ 1, true);
			}else {
				maps.put(nameScore[i].toString(), true);
			}
			map.put(score[i], maps);
		}
		return map;
	}
	
	public static Map<Integer, Map<String, Boolean>> getMapFromIntStringArray(int[] score, String[] nameScore){
		Map<Integer, Map<String, Boolean>> map= new HashMap<>();
		for(int i= 0; i< score.length; i++) {
			Map<String, Boolean> maps;
			if(map.containsKey(score[i])) {//��Ϊ�ϲ�ҩ���ļ�����ͬ�������������ֵ���ģʽ�������鼮�ֿ�
				maps= map.get(score[i]);
			}else {
				maps= new HashMap<>();
			}
			//��Ϊ�ϲ�ҩ���ļ�����ͬ�������������ֵ���ģʽ�������鼮�ֿ�
			if(maps.containsKey(nameScore[i].toString())) {//��Ϊ�ϲ�ҩ���ļ�����ͬ�������������ֵ���ģʽ�������鼮�ֿ�
				maps.put(nameScore[i].toString()+ ""+ maps.size()+ 1, true);
			}else {
				maps.put(nameScore[i].toString(), true);
			}
			map.put(score[i], maps);
		}
		return map;
	}
	//�Ժ󲢵�int array ���ļ���
	public static Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao(int[] score, String[] nameScore){
		Map<Integer, Map<String, Boolean>> map= new HashMap<>();
		for(int i= 0; i< score.length; i++) {
			Map<String, Boolean> maps;
			if(map.containsKey(score[i])) {//��Ϊ�ϲ�ҩ���ļ�����ͬ�������������ֵ���ģʽ�������鼮�ֿ�
				maps= map.get(score[i]);
			}else {
				maps= new HashMap<>();
			}
			//��Ϊ�ϲ�ҩ���ļ�����ͬ�������������ֵ���ģʽ�������鼮�ֿ�
			if(maps.containsKey(nameScore[i].toString())) {//��Ϊ�ϲ�ҩ���ļ�����ͬ�������������ֵ���ģʽ�������鼮�ֿ�
				maps.put(nameScore[i].toString()+ ""+ maps.size()+ 1, true);
			}else {
				maps.put(nameScore[i].toString(), true);
			}
			map.put(score[i], maps);
		}
		return map;
	}
}