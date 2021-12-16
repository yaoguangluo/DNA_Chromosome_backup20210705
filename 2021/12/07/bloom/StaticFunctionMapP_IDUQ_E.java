package SEM.bloom;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.CopyLaw;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.DNA;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.DatingLaw;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.InheritanceLaw;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.Life;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.MutationLaw;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.PDN;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.RST;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.SeparaterLaw;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P.SwapLaw;
//著作权人+作者=罗瑶光
//我的世界就要来了。
public class StaticFunctionMapP_IDUQ_E implements StaticFunctionMapP_IDUQ_C{
	// CopyLaw{
	public DNA copy(DNA dna) {
		return new CopyLaw().copy(dna);
	}
	public ConcurrentHashMap<Integer, PDN> copyMap(ConcurrentLinkedDeque<PDN> functionLineDeque){
		return new CopyLaw().copyMap(functionLineDeque);
	}
	public ConcurrentLinkedDeque<PDN> mask(ConcurrentLinkedDeque<PDN> originDeque
			, ConcurrentLinkedDeque<PDN> newDeque, ConcurrentLinkedDeque<PDN> maskOutput) {
		return new CopyLaw().mask( originDeque
				, newDeque, maskOutput);
	}
	public ConcurrentLinkedDeque<PDN> copy(ConcurrentLinkedDeque<PDN> maskLineDeque) {
		return new CopyLaw().copy(maskLineDeque) ;
	}
	public DNA mutationCopy(DNA dna) {
		return new CopyLaw(). mutationCopy(dna) ;
	}

	//DatingLaw{
	public RST dating(RST father, RST mother) {
		return new DatingLaw().dating(father, mother) ;
	}
	//InheritanceLaw{
	public RST inheritance(RST father, RST mother) {
		return new InheritanceLaw().inheritance( father,  mother);
	}

	//Life{ //稍后 return 化
	public void born() {
		new Life().born() ;
	}
	//MutationLaw{
	public RST mutation(RST father, RST mother) {
		return new MutationLaw(). mutation(father, mother);
	}
	//SeparaterLaw{
	public ConcurrentLinkedDeque<DNA> separater(ConcurrentLinkedDeque<DNA> original){
		return new SeparaterLaw().separater(original);
	}
	//SwapLaw{
	public DNA swap(DNA original) {
		return new SwapLaw().swap(original);
	}
}
