package SEM.bloom;

import java.io.IOException;
import java.util.Map;

import OSI.SSI.ASU.OSU.PSU.MSU.ouler.Q_OulerRing;
import OSI.SSI.ASU.OSU.PSU.MSU.ouler.Q_OulerRing16;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS16;
import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL;
import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL16;

//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapM_IDUQ_C {
	public static void callFunction(String callFunctionKey, StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_C, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getQ_OulerRing")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getQ_OulerRing();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getQ_OulerRing16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getQ_OulerRing16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDecadeToPDS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getDecadeToPDS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDecadeToPDS16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getDecadeToPDS16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getPDE_PDS_DL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getPDE_PDS_DL();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getPDE_PDS_DL16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getPDE_PDS_DL16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_E) {
		// TODO Auto-generated method stub
		//稍后封装
		staticFunctionMapM_IDUQ_E.annotationMap.put("getQ_OulerRing", "getQ_OulerRing");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getQ_OulerRing16", "getQ_OulerRing16");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getDecadeToPDS", "getDecadeToPDS");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getDecadeToPDS16", "getDecadeToPDS16");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getPDE_PDS_DL", "getPDE_PDS_DL");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getPDE_PDS_DL16", "getPDE_PDS_DL16");

	}
	public Q_OulerRing getQ_OulerRing();
	public Q_OulerRing16 getQ_OulerRing16();
	public DecadeToPDS getDecadeToPDS();
	public DecadeToPDS16 getDecadeToPDS16();
	public PDE_PDS_DL getPDE_PDS_DL();
	public PDE_PDS_DL16 getPDE_PDS_DL16();
	
}
