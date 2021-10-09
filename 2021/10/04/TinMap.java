package OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
public class TinMap extends ConcurrentHashMap<String, Object> implements Cloneable{
	/**
	 *因为map 下面的指令集比较复杂，先用一个clone 代替，如果不行就再完整设计一个copy函数
	 *测试了下不能复制，不知道是不是这个jdk版本问题，于是重新设计 map copy clone 函数。
	 *本可以用jsonString，什么都解决了， 因为涉及著作权申请，能不用第三方就不用。
	 *罗瑶光 20211009
	 *备份下，准备做个tinmap的指令结果记忆片段自动合并，思考了下有三个方式
	 *1是命令不对称，进行添加会出现问题。
	 *2是表格不对称，进行添加会出现问题。
	 *3是指令重复，造成迭代问题。
	 *处理这种问题我想好了，output加上中下标识先
	 */
	private static final long serialVersionUID= 1L;
	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public TinMap clone() throws CloneNotSupportedException {
		TinMap newTinMap= new TinMap();
		if(null!= this) {
			Iterator<String> iterator= this.keySet().iterator(); 
			while(iterator.hasNext()) {
				String string= iterator.next();
				ConcurrentHashMap<String, Object> newMap= new ConcurrentHashMap<>();
				ConcurrentHashMap<String, Object> map= (ConcurrentHashMap<String, Object>)this.get(string);
				Iterator<String> iterators= map.keySet().iterator(); 
				while(iterators.hasNext()) {
					String strings= iterators.next();
					if(strings.contains("obj")) {
						//arraylist<hashmap>
						ArrayList<HashMap<String, HashMap<String, HashMap<String, String>>>> arrayListnew= new ArrayList();
						ArrayList<HashMap<String, HashMap<String, HashMap<String, String>>>> arrayList= (ArrayList)map.get(strings);
						//
						Iterator<HashMap<String, HashMap<String, HashMap<String, String>>>> iteratormap= arrayList.iterator();
						while(iteratormap.hasNext()) {
							HashMap<String, HashMap<String, HashMap<String, String>>> hashmapNew= new HashMap<>();
							HashMap<String, HashMap<String, HashMap<String, String>>> hashmap= iteratormap.next();
							Iterator<String> iteratormapIterator= hashmap.keySet().iterator();
							while(iteratormapIterator.hasNext()) {
								String iteratormapIteratorString= iteratormapIterator.next();
								HashMap<String, HashMap<String, String>> hashMapsNew= new HashMap<>();
								HashMap<String, HashMap<String, String>> hashMaps= hashmap.get(iteratormapIteratorString);
								Iterator<String> iteratormapIteratorHashMaps= hashMaps.keySet().iterator();
								while(iteratormapIteratorHashMaps.hasNext()) {
									String iteratormapIteratorHashMapsString= iteratormapIteratorHashMaps.next();
									HashMap<String, String> iteratormapIteratorHashMapsStringHashMapsNew= new HashMap<>();
									HashMap<String, String> iteratormapIteratorHashMapsStringHashMaps
									= hashMaps.get(iteratormapIteratorHashMapsString);
									Iterator<String> iteratormapIteratorHashMapsStringHashMapsIterator
									= iteratormapIteratorHashMapsStringHashMaps.keySet().iterator();
									while(iteratormapIteratorHashMapsStringHashMapsIterator.hasNext()) {
										String stringCell= iteratormapIteratorHashMapsStringHashMapsIterator.next();
										iteratormapIteratorHashMapsStringHashMapsNew
										.put(stringCell,iteratormapIteratorHashMapsStringHashMaps.get(stringCell).toString());		
									}
									hashMapsNew.put(iteratormapIteratorHashMapsString, iteratormapIteratorHashMapsStringHashMapsNew);
								}
								hashmapNew.put(iteratormapIteratorString, hashMapsNew);
							}
							arrayListnew.add(hashmapNew);
						}
						newMap.put(strings, arrayListnew);
						//object row
					}else if(strings.contains("spec")) {
						List<String> list= new ArrayList<>();
						List<String> object= (ArrayList)map.get(strings);
						Iterator<String> iteratorString= object.iterator();
						while(iteratorString.hasNext()) {
							list.add(iteratorString.next().toString());	
						}
						newMap.put(strings, list);
						//array
					}else if(strings.contains("hashmap")) {
						//map
						//newMap.put(strings, map.get(strings));
					}else {
						//字符串
						newMap.put(strings, map.get(strings).toString());
					}
				}
				newTinMap.put(string, newMap);
			}
		}
		return newTinMap;  
	}  
	
	
	
//	public TinMap clone(TinMap outputOut) throws CloneNotSupportedException {
//		TinMap newTinMap= new TinMap();
//		if(null!= this) {
//			Iterator<String> iterator= this.keySet().iterator(); 
//			while(iterator.hasNext()) {
//				String string= iterator.next();
//				ConcurrentHashMap<String, Object> newMap= new ConcurrentHashMap<>();
//				ConcurrentHashMap<String, Object> map= (ConcurrentHashMap<String, Object>)this.get(string);
//				Iterator<String> iterators= map.keySet().iterator(); 
//				while(iterators.hasNext()) {
//					String strings= iterators.next();
//					if(strings.contains("obj")) {
//						//arraylist<hashmap>
//						ArrayList<HashMap<String, HashMap<String, HashMap<String, String>>>> arrayListnew= new ArrayList();
//						ArrayList<HashMap<String, HashMap<String, HashMap<String, String>>>> arrayList= (ArrayList)map.get(strings);
//						//
//						Iterator<HashMap<String, HashMap<String, HashMap<String, String>>>> iteratormap= arrayList.iterator();
//						while(iteratormap.hasNext()) {
//							HashMap<String, HashMap<String, HashMap<String, String>>> hashmapNew= new HashMap<>();
//							HashMap<String, HashMap<String, HashMap<String, String>>> hashmap= iteratormap.next();
//							Iterator<String> iteratormapIterator= hashmap.keySet().iterator();
//							while(iteratormapIterator.hasNext()) {
//								String iteratormapIteratorString= iteratormapIterator.next();
//								HashMap<String, HashMap<String, String>> hashMapsNew= new HashMap<>();
//								HashMap<String, HashMap<String, String>> hashMaps= hashmap.get(iteratormapIteratorString);
//								Iterator<String> iteratormapIteratorHashMaps= hashMaps.keySet().iterator();
//								while(iteratormapIteratorHashMaps.hasNext()) {
//									String iteratormapIteratorHashMapsString= iteratormapIteratorHashMaps.next();
//									HashMap<String, String> iteratormapIteratorHashMapsStringHashMapsNew= new HashMap<>();
//									HashMap<String, String> iteratormapIteratorHashMapsStringHashMaps
//									= hashMaps.get(iteratormapIteratorHashMapsString);
//									Iterator<String> iteratormapIteratorHashMapsStringHashMapsIterator
//									= iteratormapIteratorHashMapsStringHashMaps.keySet().iterator();
//									while(iteratormapIteratorHashMapsStringHashMapsIterator.hasNext()) {
//										String stringCell= iteratormapIteratorHashMapsStringHashMapsIterator.next();
//										iteratormapIteratorHashMapsStringHashMapsNew
//										.put(stringCell,iteratormapIteratorHashMapsStringHashMaps.get(stringCell).toString());		
//									}
//									hashMapsNew.put(iteratormapIteratorHashMapsString, iteratormapIteratorHashMapsStringHashMapsNew);
//								}
//								hashmapNew.put(iteratormapIteratorString, hashMapsNew);
//							}
//							arrayListnew.add(hashmapNew);
//						}
//						newMap.put(strings, arrayListnew);
//						//object row
//					}else if(strings.contains("spec")) {
//						List<String> list= new ArrayList<>();
//						List<String> object= (ArrayList)map.get(strings);
//						Iterator<String> iteratorString= object.iterator();
//						while(iteratorString.hasNext()) {
//							list.add(iteratorString.next().toString());	
//						}
//						newMap.put(strings, list);
//						//array
//					}else if(strings.contains("hashmap")) {
//						//map
//						//newMap.put(strings, map.get(strings));
//					}else {
//						//字符串
//						newMap.put(strings, map.get(strings).toString());
//					}
//				}
//				newTinMap.put(string, newMap);
//			}
//		}
//		return newTinMap;  
//	}  
	
	
	
	
}
