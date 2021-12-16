package SEM.bloom;

import java.util.List;

import OSI.PSO.regex.DoSplit;
import OSI.SIQ.tinMap.TinMap;
//著作权人+ 作者= 罗瑶光
public class StaticFunctionMapS_IDUQ_E implements StaticFunctionMapS_IDUQ_C{
	public TinMap clone(TinMap tinMap) throws CloneNotSupportedException{
		return tinMap.clone();
	}

	public List<String> splitRegex(String input, String split, String unSplit) {
		return new DoSplit().splitRegex(input, split, unSplit);
	}
}
