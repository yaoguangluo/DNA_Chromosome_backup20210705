package SEM.bloom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//������������ ע����
//������
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
		if(callFunctionKey.equalsIgnoreCase("main")) {//�Ժ�ֳ�ȥ
			//д��1
			//case ����
			if(string.contains("null")) {
				//������������object�� json ������
				staticFunctionMapU_VECS_C.main(null);//�Ժ�ֳ�ȥ
				output.put("U_VECS_main", "void");//��void�ӿھ�ֱ��put��ȥ���ɡ�
			}
			//д��2
			//���Բ������������ �ӿڱ���������web��outowire ������
			//�����ַ�������
		}

		//д��2
		//��׼�����һ��callFunctionKey��Ӧ�Ľӿ�callģʽ
		StaticFunctionMapU_VECS_C.callFunction(callFunctionKey, staticFunctionMapU_VECS_C, output);
	}
	public static void doQ_AOPM_CaseFunction(String callFunctionKey, String string, StaticFunctionMapQ_AOPM_E staticFunctionMapQ_AOPM_C, Map<String, Object> output) throws IOException {
	}
	public static void doQ_VECS_CaseFunction(String callFunctionKey, String string, StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C, Map<String, Object> output) throws IOException {
	}


	@SuppressWarnings("unchecked")
	public static Map<String, Object> preValues(Map<String, Object> output, String[] ��������) {
		boolean find= false;
		Map<String, Object> inputValues = null;
		//ȡֵ����, �ȼ����һ���ӿ�
		if(null!= output.get("lastInterfaceBackfeed")) {
			if(output.get("lastInterfaceBackfeed").toString().equalsIgnoreCase("success")) {
				String lastInterfaceReturn= (String) output.get("lastInterfaceName");//ȡ ��һ�����нӿ���
				if(null!= lastInterfaceReturn) {
					Map<String, Object> lastReturns= (Map<String, Object>) output.get(lastInterfaceReturn);//ȡ��һ�����нӿڵķ��ؽ����
					inputValues= (Map<String, Object>) lastReturns.get("interfaceReturn");//
					find= true;
				}	
			}
		}
		//�����һ���ӿ��Ƿ�ƥ��;
		if(find) {
			//if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
			//	find= true;
			//}else {
			//	find= false;
			//}
			for(int i= 0; i< ��������.length; i++) {//��ѵ���� string i++
				if(!inputValues.containsKey(��������[i])){
					find= false;
				}
			}
		}
		//////////////////////////////////////////////////////////////////////////////////////	

		//��������,�ͼ��ȫ�ִ���
		if(!find) {//����һ���ӿ�û�з�������ӿ���Ҫ������ʱ���ͼ��ȫ�ִ���
			inputValues= (Map<String, Object>) output.get("inputValues");//ȡ�洢ֵ
		}
		//����ض���������Ƿ�ƥ��
		if(null!= inputValues) {
			//if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
			//	find= true;
			//}	
			find= true;
			for(int i= 0; i< ��������.length; i++) {//��ѵ���� string i++
				if(!inputValues.containsKey(��������[i])){
					find= false;
				}
			}
		}//��������Ƴɲ��ģʽ�������ٶȽ���100����ֹ���Ȳ����ǣ�
		/////////////////////////////////////////////////////////////////////////////////////////////////	
		return inputValues;
	}
	public static void postValues(Map<String, Object> output, boolean find, Object map, String callFunctionKey) {
		if(find) {
			//�洢����
			Map<String, Object> returnValue= new HashMap<>();
			returnValue.put("interfaceReturn", map);
			//���
			output.put(callFunctionKey, returnValue);
			output.put("lastInterfaceName", callFunctionKey);//�Ժ���Ƴɿ� �����������е�ģʽ��
			output.put("lastInterfaceBackfeed", "success");
		}else {
			output.put("lastInterfaceName", callFunctionKey);
			output.put("lastInterfaceBackfeed", "faild");
		}
	}
}