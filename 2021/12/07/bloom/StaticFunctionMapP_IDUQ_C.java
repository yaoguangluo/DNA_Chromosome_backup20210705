package SEM.bloom;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.DNA;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.PDN;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.RST;
//����Ȩ��+����=������
//���ڿ�ʼ��Ҫ�����ó��ˡ��ҵĳ��ԡ�
public interface StaticFunctionMapP_IDUQ_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_C, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("copyMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.copyMap((ConcurrentLinkedDeque<PDN>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("mask")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.mask((ConcurrentLinkedDeque<PDN>)inputValues.get(��������[����++])
						, (ConcurrentLinkedDeque<PDN>) inputValues.get(��������[����++]), (ConcurrentLinkedDeque<PDN>) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("copy")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.copy((DNA)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("mutationCopy")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.mutationCopy((DNA)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("dating")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.dating((RST)inputValues.get(��������[����++]), (RST)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("inheritance")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.inheritance((RST)inputValues.get(��������[����++]), (RST)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("born")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_IDUQ_C.born();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("mutation")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.mutation((RST)inputValues.get(��������[����++]), (RST)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("separater")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.separater((ConcurrentLinkedDeque<DNA>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("swap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_IDUQ_C.swap((DNA)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ

		staticFunctionMapP_IDUQ_E.annotationMap.put("copy", "copy");
		staticFunctionMapP_IDUQ_E.annotationMap.put("copyMap", "copyMap");
		staticFunctionMapP_IDUQ_E.annotationMap.put("mask", "mask");
		staticFunctionMapP_IDUQ_E.annotationMap.put("copy", "copy");

		staticFunctionMapP_IDUQ_E.annotationMap.put("mutationCopy", "mutationCopy");	
		staticFunctionMapP_IDUQ_E.annotationMap.put("dating", "dating");	
		staticFunctionMapP_IDUQ_E.annotationMap.put("inheritance", "inheritance");	
		staticFunctionMapP_IDUQ_E.annotationMap.put("born", "born");	
		staticFunctionMapP_IDUQ_E.annotationMap.put("mutation", "mutation");	
		staticFunctionMapP_IDUQ_E.annotationMap.put("separater", "separater");	
		staticFunctionMapP_IDUQ_E.annotationMap.put("swap", "swap");	
	}

	// CopyLaw{
	public DNA copy(DNA dna) ;
	public ConcurrentHashMap<Integer, PDN> copyMap(ConcurrentLinkedDeque<PDN> functionLineDeque);
	public ConcurrentLinkedDeque<PDN> mask(ConcurrentLinkedDeque<PDN> originDeque
			, ConcurrentLinkedDeque<PDN> newDeque, ConcurrentLinkedDeque<PDN> maskOutput) ;
	public ConcurrentLinkedDeque<PDN> copy(ConcurrentLinkedDeque<PDN> maskLineDeque) ;
	public DNA mutationCopy(DNA dna);

	//DatingLaw{
	public RST dating(RST father, RST mother);
	//InheritanceLaw{
	public RST inheritance(RST father, RST mother);

	//Life{
	public void born();
	//MutationLaw{
	public RST mutation(RST father, RST mother);
	//SeparaterLaw{
	public ConcurrentLinkedDeque<DNA> separater(ConcurrentLinkedDeque<DNA> original);
	//SwapLaw{
	public DNA swap(DNA original);
}
