package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
//������������ ע����
//������
public interface StaticFunctionMapA_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_C, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("parserMixedString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= StaticFunctionMapA_VECS_C.parserMixedString((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("parserMixedStringToList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.parserMixedStringToList((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("posReader")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.posReader((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("dnnReader")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.dnnReader((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("mindReader")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.mindReader((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("emotionReader")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.emotionReader((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("educationReader")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.educationReader((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("environmentReader")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.environmentReader((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("lenovoReader")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.lenovoReader((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("frequencyReader")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapA_VECS_C.frequencyReader((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	
	public static void load(StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_E) {
		//ɨ����
		//ɨ��ӿ�
		//ɨ��̳�
		//�Ժ��װ
		StaticFunctionMapA_VECS_C.annotationMap.put("parserMixedString", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("parserMixedStringToList", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("posReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("dnnReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("mindReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("emotionReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("educationReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("environmentReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("lenovoReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("frequencyReader", "inputString");
	}
	//�ִ�
	public static List<String> parserMixedString(String inputString) throws IOException {
		CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		List<String> sets = new ArrayList<>();
		sets= _A.parserMixedString(inputString);
		//������
		return sets;
	}

	public List<String> parserMixedStringToList(String inputString) throws IOException;		
	
	//�ı�����
	public List<String> posReader(String inputString) throws IOException;	
	
	//�ı�����
	public List<String> dnnReader(String inputString) throws IOException;	
	
	//������ 
	public List<String> mindReader(String inputString) throws IOException;	

	//��з�����
	public List<String> emotionReader(String inputString) throws IOException;	

	//�������� 
	public List<String> educationReader(String inputString) throws IOException;	

	//��������
	public Map<String, EmotionSample> environmentReader(String inputString) throws IOException;
	
	//�������
	public Map<String, Object> lenovoReader(String inputString) throws IOException;
	
	//��Ƶ����
	public List<String> frequencyReader(String inputString) throws IOException;
	
	//�Ӿ�����

	//

	//

	//
}