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
			//因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
			if(maps.containsKey(nameScore[i].toString())) {//因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
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
			if(map.containsKey(score[i])) {//因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
				maps= map.get(score[i]);
			}else {
				maps= new HashMap<>();
			}
			//因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
			if(maps.containsKey(nameScore[i].toString())) {//因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
				maps.put(nameScore[i].toString()+ ""+ maps.size()+ 1, true);
			}else {
				maps.put(nameScore[i].toString(), true);
			}
			map.put(score[i], maps);
		}
		return map;
	}
	//稍后并到int array 新文件中
	public static Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao(int[] score, String[] nameScore){
		Map<Integer, Map<String, Boolean>> map= new HashMap<>();
		for(int i= 0; i< score.length; i++) {
			Map<String, Boolean> maps;
			if(map.containsKey(score[i])) {//因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
				maps= map.get(score[i]);
			}else {
				maps= new HashMap<>();
			}
			//因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
			if(maps.containsKey(nameScore[i].toString())) {//因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
				maps.put(nameScore[i].toString()+ ""+ maps.size()+ 1, true);
			}else {
				maps.put(nameScore[i].toString(), true);
			}
			map.put(score[i], maps);
		}
		return map;
	}
}