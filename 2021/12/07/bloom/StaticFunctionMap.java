package SEM.bloom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//用来索引函数 注册类
//罗瑶光
public class StaticFunctionMap{
	public static void doA_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_C, Map<String, Object> output) throws IOException {
		if(callFunctionKey.equalsIgnoreCase("main")) {
			//....
		}
	}
	public static void doA_IDUQ_CaseFunction(String callFunctionKey, String string, StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_C, Map<String, Object> output) throws IOException {
	}
	public static void doO_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_C, Map<String, Object> output) throws IOException {
	}
	public static void doO_IDUQ_CaseFunction(String callFunctionKey, String string, StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_C, Map<String, Object> output) throws IOException {
	}
	public static void doP_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_C, Map<String, Object> output) throws IOException {
	}
	public static void doP_IDUQ_CaseFunction(String callFunctionKey, String string, StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_C, Map<String, Object> output) throws IOException {
	}
	public static void doM_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_C, Map<String, Object> output) throws IOException {
	}
	public static void doM_IDUQ_CaseFunction(String callFunctionKey, String string, StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_C, Map<String, Object> output) throws IOException {
	}
	public static void doV_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_C, Map<String, Object> output) throws IOException {
	}
	public static void doV_IDUQ_CaseFunction(String callFunctionKey, String string, StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_C, Map<String, Object> output) throws IOException {
	}
	public static void doE_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_C, Map<String, Object> output) throws IOException {
	}
	public static void doE_IDUQ_CaseFunction(String callFunctionKey, String string, StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_C, Map<String, Object> output) throws IOException {
	}
	public static void doC_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_C, Map<String, Object> output) throws IOException {
	}

	public static void doC_IDUQ_CaseFunction(String callFunctionKey, String string, StaticFunctionMapC_IDUQ_E staticFunctionMapC_IDUQ_C, Map<String, Object> output) throws IOException {
	}
	public static void doS_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_C, Map<String, Object> output) throws IOException {
	}
	public static void doS_IDUQ_CaseFunction(String callFunctionKey, String string, StaticFunctionMapS_IDUQ_E staticFunctionMapS_IDUQ_C, Map<String, Object> output) throws IOException {
	}
	public static void doI_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_C, Map<String, Object> output) throws IOException {
	}
	public static void doI_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_C, Map<String, Object> output) throws IOException {
	}
	public static void doD_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapD_AOPM_E staticFunctionMapD_AOPM_C, Map<String, Object> output) throws IOException {
	}
	public static void doD_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapD_VECS_E staticFunctionMapD_VECS_C, Map<String, Object> output) throws IOException {
	}
	public static void doU_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_C, Map<String, Object> output) throws IOException {
	}

	@SuppressWarnings("static-access")
	public static void doU_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_C, Map<String, Object> output) throws IOException {
		if(callFunctionKey.equalsIgnoreCase("main")) {//稍后分出去
			//写法1
			//case 参数
			if(string.contains("null")) {
				//其他参数可用object， json 都可以
				staticFunctionMapU_VECS_C.main(null);//稍后分出去
				output.put("U_VECS_main", "void");//非void接口就直接put进去即可。
			}
			//写法2
			//可以插件遍历，可以 接口遍历，可以web的outowire 遍历，
			//无数种方法遍历
		}

		//写法2
		//我准备设计一种callFunctionKey对应的接口call模式
		StaticFunctionMapU_VECS_C.callFunction(callFunctionKey, staticFunctionMapU_VECS_C, output);
	}
	public static void doQ_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapQ_AOPM_E staticFunctionMapQ_AOPM_C, Map<String, Object> output) throws IOException {
	}
	public static void doQ_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C, Map<String, Object> output) throws IOException {
	}


	@SuppressWarnings("unchecked")
	public static Map<String, Object> preValues(Map<String, Object> output, String[] 传参因子) {
		boolean find= false;
		Map<String, Object> inputValues = null;
		//取值方法, 先检查上一个接口
		if(null!= output.get("lastInterfaceBackfeed")) {
			if(output.get("lastInterfaceBackfeed").toString().equalsIgnoreCase("success")) {
				String lastInterfaceReturn= (String) output.get("lastInterfaceName");//取 上一次运行接口名
				if(null!= lastInterfaceReturn) {
					Map<String, Object> lastReturns= (Map<String, Object>) output.get(lastInterfaceReturn);//取上一次运行接口的返回结果。
					inputValues= (Map<String, Object>) lastReturns.get("interfaceReturn");//
					find= true;
				}	
			}
		}
		//检查上一个接口是否匹配;
		if(find) {
			//if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
			//	find= true;
			//}else {
			//	find= false;
			//}
			for(int i= 0; i< 传参因子.length; i++) {//轮训传参 string i++
				if(!inputValues.containsKey(传参因子[i])){
					find= false;
				}
			}
		}
		//////////////////////////////////////////////////////////////////////////////////////	

		//操作方法,就检查全局传参
		if(!find) {//当上一个接口没有返回这个接口需要的数据时，就检查全局传参
			inputValues= (Map<String, Object>) output.get("inputValues");//取存储值
		}
		//检查特定输入参数是否匹配
		if(null!= inputValues) {
			//if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
			//	find= true;
			//}	
			find= true;
			for(int i= 0; i< 传参因子.length; i++) {//轮训传参 string i++
				if(!inputValues.containsKey(传参因子[i])){
					find= false;
				}
			}
		}//本来想设计成插件模式，但是速度降低100倍不止，先不考虑，
		/////////////////////////////////////////////////////////////////////////////////////////////////	
		return inputValues;
	}
	public static void postValues(Map<String, Object> output, boolean find, Object map, String callFunctionKey) {
		if(find) {
			//存储方法
			Map<String, Object> returnValue= new HashMap<>();
			returnValue.put("interfaceReturn", map);
			//输出
			output.put(callFunctionKey, returnValue);
			output.put("lastInterfaceName", callFunctionKey);//稍后设计成可 理论完美并行的模式。
			output.put("lastInterfaceBackfeed", "success");
		}else {
			output.put("lastInterfaceName", callFunctionKey);
			output.put("lastInterfaceBackfeed", "faild");
		}
	}
}