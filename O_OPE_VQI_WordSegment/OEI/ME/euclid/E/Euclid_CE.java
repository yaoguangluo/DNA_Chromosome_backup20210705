package OEI.ME.euclid.E;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import SVQ.stable.StablePOS;
import OCI.ME.euclid.C.Euclid_C;

import java.util.HashMap;
import java.util.Iterator;
public class Euclid_CE implements Euclid_C {
	@SuppressWarnings({StablePOS.RAW_TYPES, StablePOS.UNCHECKED})
	public Map<Integer, Map> mCogsEuclid(Map<Long, FMHMMNode> HashMap) {
		Map<Integer, Map> HashMapRoot= new HashMap<>();
		Iterator<Long> iter= HashMap.keySet().iterator();
		Here:
			while (iter.hasNext()) {
				Long keyValue= iter.next();
				Integer charOfKeyValueToInteger= Integer.valueOf(StablePOS.EMPTY_STRING + keyValue);
				int range= (charOfKeyValueToInteger.intValue()>> StablePOS.INT_SIX);
				int rangeHigh= range >> StablePOS.INT_FOUR;
				if (!HashMapRoot.containsKey(rangeHigh)) {
					HashMap<Long, FMHMMNode> innerHashMap = new HashMap<>();
					innerHashMap.put(keyValue, HashMap.get(keyValue));
					HashMap<Integer, HashMap> root = new HashMap<>();
					root.put(range, innerHashMap);
					HashMapRoot.put(rangeHigh, root);
					continue Here;
				}
				Map<Integer, HashMap> root= HashMapRoot.get(rangeHigh);
				if (!root.containsKey(range)) {
					HashMap<Long, FMHMMNode> innerHashMap = new HashMap<>();
					innerHashMap.put(keyValue, HashMap.get(keyValue));
					root.put(range, innerHashMap);
					HashMapRoot.put(rangeHigh, root);
					continue Here;
				}
				HashMap<Long, FMHMMNode> innerHashMap = root.get(range);
				innerHashMap.put(keyValue, HashMap.get(keyValue));
				root.put(range, innerHashMap);
				HashMapRoot.put(rangeHigh, root);
			}
		return HashMapRoot;
	}
}
