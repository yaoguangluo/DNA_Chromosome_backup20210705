package OEI.ME.liner.E;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import OCI.ME.liner.C.Quick6DLuoYaoguangSort;
public class Quick6DLuoYaoguangSort3DMap_E implements Quick6DLuoYaoguangSort {
	@Override
	public void quick6DLuoYaoGuangSortWordFrequency(Map<Integer, WordFrequency> map, int leftPosition,
			int rightPosition) {
		if (leftPosition< rightPosition) {
			int c= rightPosition- leftPosition + StablePOS.INT_ONE;
			if (c< StablePOS.INT_FOUR) {
				int j;
				for (int i= StablePOS.INT_ONE+ leftPosition; i< leftPosition+ c; i++) {
					j= i;
					while (j>= StablePOS.INT_ONE+ leftPosition) {
						if (map.get(j).getFrequency()< map.get(j- StablePOS.INT_ONE).getFrequency()) {
							WordFrequency wordFrequency= map.get(j);
							map.put(j, map.get(j- StablePOS.INT_ONE));
							map.put(j- StablePOS.INT_ONE, wordFrequency);
						}
						j--;
					}
				}
				return;
			}
			int pos= partition(map, leftPosition, rightPosition);
			quick6DLuoYaoGuangSortWordFrequency(map, leftPosition, pos- StablePOS.INT_ONE);
			quick6DLuoYaoGuangSortWordFrequency(map, ++pos, rightPosition);
		}	
	}

	@Override
	public int partition(Map<Integer, WordFrequency> map, int leftPosition, int rightPosition) {
		int leftPositionNew= leftPosition;
		WordFrequency wordFrequencyX= map.get(leftPosition);
		WordFrequency wordFrequencyY= map.get(rightPosition);
		wordFrequencyY= wordFrequencyX.getFrequency()<= wordFrequencyY.getFrequency()
				? wordFrequencyX: wordFrequencyY;
		while (leftPositionNew< rightPosition) {
			while (!(map.get(leftPositionNew++).getFrequency()> wordFrequencyY.getFrequency()
					|| leftPositionNew> rightPosition)) {
			} 
			while (map.get(rightPosition--).getFrequency()> wordFrequencyY.getFrequency()) {
			}  
			if (--leftPositionNew< ++rightPosition) {
				WordFrequency wordFrequency= map.get(rightPosition);
				map.put(rightPosition, map.get(leftPositionNew));
				map.put(leftPositionNew, wordFrequency);
			}
		}
		map.put(leftPosition, map.get(rightPosition));
		map.put(rightPosition, wordFrequencyY);
		return rightPosition;
	}

	@SuppressWarnings(StablePOS.RAW_TYPES)
	public Map<Integer, WordFrequency> frequencyWordMapToMap(Map<String, WordFrequency> map) {
		Map<Integer, WordFrequency> listMap= new HashMap<>();
		Iterator iterator= map.keySet().iterator();
		int c= StablePOS.INT_ZERO;
		while (iterator.hasNext()) {
			listMap.put(c++, map.get(iterator.next()));
		}
		return listMap;
	}

	public void quick6DLuoYaoGuangSortWordFrequency(List<WordFrequency> list, int leftPosition, int rightPosition) {
	}

	public int partition(List<WordFrequency> list, int leftPosition, int rightPosition) {
		return StablePOS.INT_ZERO;
	}

	public List<WordFrequency> frequencyWordMapToList(Map<String, WordFrequency> map) {
		return null;
	}
}