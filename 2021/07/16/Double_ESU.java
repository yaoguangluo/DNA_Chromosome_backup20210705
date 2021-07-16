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
			maps.put(nameScore[i].toString(), true);
			map.put(score[i], maps);
		}
		return map;
	}
}