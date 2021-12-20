package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
//用来索引函数 注册类
//罗瑶光
public interface StaticFunctionMapA_VECS_C {
	public static void load(StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_E) {
		//扫描插件
		//扫描接口
		//扫描继承
		//稍后封装
		staticFunctionMapA_VECS_E.annotationMap.put("parserMixedString", "parserMixedString");
		staticFunctionMapA_VECS_E.annotationMap.put("parserMixedStringToList", "parserMixedStringToList");
		staticFunctionMapA_VECS_E.annotationMap.put("posReader", "posReader");
		staticFunctionMapA_VECS_E.annotationMap.put("dnnReader", "dnnReader");
		staticFunctionMapA_VECS_E.annotationMap.put("mindReader", "mindReader");
		staticFunctionMapA_VECS_E.annotationMap.put("emotionReader", "emotionReader");
		staticFunctionMapA_VECS_E.annotationMap.put("educationReader", "educationReader");
		staticFunctionMapA_VECS_E.annotationMap.put("environmentReader", "environmentReader");
		staticFunctionMapA_VECS_E.annotationMap.put("lenovoReader", "lenovoReader");
		staticFunctionMapA_VECS_E.annotationMap.put("frequencyReader", "frequencyReader");
	}
	//分词
	public static List<String> parserMixedString(String inputString) throws IOException {
		CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		List<String> sets = new ArrayList<>();
		sets= _A.parserMixedString(inputString);
		//罗瑶光
		return sets;
	}

	public List<String> parserMixedStringToList(String inputString) throws IOException;		
	
	//文本分析
	public List<String> posReader(String inputString) throws IOException;	
	
	//文本分析
	public List<String> dnnReader(String inputString) throws IOException;	
	
	//读心术 
	public List<String> mindReader(String inputString) throws IOException;	

	//情感分析，
	public List<String> emotionReader(String inputString) throws IOException;	

	//教育分析 
	public List<String> educationReader(String inputString) throws IOException;	

	//环境分析
	public Map<String, EmotionSample> environmentReader(String inputString) throws IOException;
	
	//联想分析
	public Map<String, Object> lenovoReader(String inputString) throws IOException;
	
	//词频分析
	public List<String> frequencyReader(String inputString) throws IOException;
	
	//视觉动画

	//

	//

	//
}