package SEM.bloom;

import java.util.List;

import OSI.SIQ.tinMap.TinMap;
//����Ȩ��+ ����= ������
public interface StaticFunctionMapS_IDUQ_C {

	public static void load() {
	}
	//TinMap extends ConcurrentHashMap<String, Object> implements Cloneable{	
	public TinMap clone(TinMap tinMap) throws CloneNotSupportedException; 
	// DoSplit
	public List<String>splitRegex(String input, String split, String unSplit);
}
