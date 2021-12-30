package SEM.bloom;

import java.io.IOException;
import java.util.Map;

import OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OCI.ME.analysis.C.A_XCDX_Map;
import OCI.ME.analysis.C.BinaryForest_A;
import OCI.ME.analysis.C.CogsBinaryForest_A;
import OCI.ME.euclid.C.Euclid_C;
import OCI.ME.liner.C.Quick6DLuoYaoguangSort;
import OCI.ME.nero.C.NERO_C;
import OCI.ME.nero.C.NERO_C_OneTime;
import OCI.ME.nlp.C.NLP_C;
import OCI.ME.nlp.C.Nlp_C_XCDX_A;
import OCI.ME.nlp.C.Nlp_C_XCDX_S;
import OCI.ME.pos.C.Pos_C_XCDX_E;
import OCI.ME.pos.C.Pos_C_XCDX_O;
import OCI.ME.pos.C.Pos_C_XCDX_P;
import OCI.OPM.VEC.SVQ.MPC.fhmm.C.BehaviorMap;
import OCI.SVQ.MPC.fhmm.C.FMHMMList;
//今天看见 大量的原函数新陈代谢化和 碎片化继承，于是将函数设为类函数class接口
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapE_AOPM_C {
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_C, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getSensingMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getSensingMap();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getEmotionMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getEmotionMap();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCogsBinaryForest_A")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getCogsBinaryForest_A();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getEuclid_C")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getEuclid_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		
		if(callFunctionKey.equalsIgnoreCase("getQuick6DLuoYaoguangSort")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getQuick6DLuoYaoguangSort();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getNERO_C_OneTime")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNERO_C_OneTime();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getNERO_C")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNERO_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getNLP_C")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNLP_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getBehaviorMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getBehaviorMap();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getFMHMMList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getFMHMMList();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getPos_C_XCDX_P")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getPos_C_XCDX_P();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getPos_C_XCDX_E")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getPos_C_XCDX_E();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getPos_C_XCDX_O")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getPos_C_XCDX_O();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getNlp_C_XCDX_S")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNlp_C_XCDX_S();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getNlp_C_XCDX_A")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNlp_C_XCDX_A();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getA_XCDX_Map")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getA_XCDX_Map();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getA")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getA();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getBinaryForest_A")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getBinaryForest_A();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		staticFunctionMapE_AOPM_E.annotationMap.put("getSensingMap", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getEmotionMap", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getCogsBinaryForest_A", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getEuclid_C", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getQuick6DLuoYaoguangSort", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNERO_C_OneTime", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNERO_C", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNLP_C", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getBehaviorMap", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getFMHMMList", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getPos_C_XCDX_P", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getPos_C_XCDX_E", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getPos_C_XCDX_O", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNlp_C_XCDX_S", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNlp_C_XCDX_A", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getA_XCDX_Map", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getA", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getBinaryForest_A", "void");	
	}

	//SensingMap, 
	public SensingMap getSensingMap();
	//EmotionMap, 
	public EmotionMap getEmotionMap();
	//CogsBinaryForest_A, 
	public CogsBinaryForest_A getCogsBinaryForest_A();
	//Euclid_C, 
	public Euclid_C getEuclid_C();
	//Quick6DLuoYaoguangSort, 
	public Quick6DLuoYaoguangSort getQuick6DLuoYaoguangSort();
	//NERO_C_OneTime, 
	public NERO_C_OneTime getNERO_C_OneTime();
	//NERO_C
	public NERO_C getNERO_C();
	//NLP_C, 
	public NLP_C getNLP_C();
	//BehaviorMap, 
	public BehaviorMap getBehaviorMap();
	//FMHMMList
	public FMHMMList getFMHMMList();
	
	//Pos_C_XCDX_P
	public Pos_C_XCDX_P getPos_C_XCDX_P();
	//Pos_C_XCDX_E
	public Pos_C_XCDX_E getPos_C_XCDX_E();
	//Pos_C_XCDX_O
	public Pos_C_XCDX_O getPos_C_XCDX_O();
	//Nlp_C_XCDX_S
	public Nlp_C_XCDX_S getNlp_C_XCDX_S();
	//Nlp_C_XCDX_A
	public Nlp_C_XCDX_A getNlp_C_XCDX_A();
	//A_XCDX_Map
	public A_XCDX_Map getA_XCDX_Map();
	//A
	public A getA();
	//BinaryForest_A
	public BinaryForest_A getBinaryForest_A();
}
