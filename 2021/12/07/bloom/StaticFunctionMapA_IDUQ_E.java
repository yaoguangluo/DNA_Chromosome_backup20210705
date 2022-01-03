package SEM.bloom;

import java.util.HashMap;
import java.util.Map;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI_XCDX;

public class StaticFunctionMapA_IDUQ_E {
	public Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unused")
	public static void main(String[] argv) {
		String string= "ยÞัþนโ";
		String pdw=  StaticFunctionMapA_IDUQ_C.getPDW(string);
		String lock= StaticFunctionMapA_IDUQ_C.getLock();
		String code= StaticFunctionMapA_IDUQ_C.getCode(pdw, lock);
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular.pdw= pdw.toString();
		pDE_RNA_FullFormular.lock= lock.toString();
		pDE_RNA_FullFormular.code= code.toString();
		pDE_RNA_FullFormular= StaticFunctionMapA_IDUQ_C.doPDE(pDE_RNA_FullFormular);
		FullDNATokenPDI_XCDX pDE_RNA_FullFormularNew= StaticFunctionMapA_IDUQ_C.doPrefixPDE(pDE_RNA_FullFormular);
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular2= StaticFunctionMapA_IDUQ_C.doPostfixPDE(pDE_RNA_FullFormular
				, pDE_RNA_FullFormularNew);
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular3= StaticFunctionMapA_IDUQ_C.doSurffixPDE(pDE_RNA_FullFormular
				, pDE_RNA_FullFormularNew);
	}
}
