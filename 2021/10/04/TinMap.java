package OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
public class TinMap extends ConcurrentHashMap<String, Object> implements Cloneable{
	/**
	 *��Ϊmap �����ָ��Ƚϸ��ӣ�����һ��clone ���棬������о����������һ��copy����
	 *�������²��ܸ��ƣ���֪���ǲ������jdk�汾���⣬����������� map copy clone ������
	 *��������jsonString��ʲô������ˣ� ��Ϊ�漰����Ȩ���룬�ܲ��õ������Ͳ��á�
	 *������ 20211009
	 *�����£�׼������tinmap��ָ��������Ƭ���Զ��ϲ���˼��������������ʽ
	 *1������Գƣ�������ӻ�������⡣
	 *2�Ǳ�񲻶Գƣ�������ӻ�������⡣
	 *3��ָ���ظ�����ɵ������⡣
	 *������������������ˣ�output�������±�ʶ��
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
						//�ַ���
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
//						//�ַ���
//						newMap.put(strings, map.get(strings).toString());
//					}
//				}
//				newTinMap.put(string, newMap);
//			}
//		}
//		return newTinMap;  
//	}  
	
	
	
	
}
