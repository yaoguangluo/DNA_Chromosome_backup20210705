package SEM.bloom;

import java.util.List;

import OSI.SIQ.tinMap.TinMap;
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapS_IDUQ_C {

	public static void load() {
	}
	//TinMap extends ConcurrentHashMap<String, Object> implements Cloneable{	
	public TinMap clone(TinMap tinMap) throws CloneNotSupportedException; 
	// DoSplit
	public List<String>splitRegex(String input, String split, String unSplit);
}
