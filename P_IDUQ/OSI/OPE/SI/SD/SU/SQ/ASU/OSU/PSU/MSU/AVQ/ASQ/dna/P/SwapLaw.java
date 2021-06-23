package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;
public class SwapLaw{
	public DNA swap(DNA original) {	
		original.I_FunctionLineDeque(new CopyLaw().copy(original.getMaskLineDeque()));	
		original.I_FunctionLineMap(new CopyLaw().copyMap(original.maskLineDeque));	
		original.I_MaskLineMap(new CopyLaw().copyMap(original.functionLineDeque));	
		return original;
	}
}