package SEM.bloom;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.DNA;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.PDN;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.RST;
//著作权人+作者=罗瑶光
//终于开始快要派上用场了。我的初衷。
public interface StaticFunctionMapP_IDUQ_C {

	public static void load(StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_E) {
		// TODO Auto-generated method stub
		//稍后封装
		
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
