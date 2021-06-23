package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;

import java.util.HashMap;
import java.util.Map;

//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class FullDNATokenPDI_XCDX {
	public double[] key= new double[4];
	public String bys= "";
	public String pdw= "";
	public String pds= "";
	public String pde= "";
	public String time= "";
	public String session_key= "";
	public String text;
	public String cacheId;
	public String code= "";
	public String lock= "";
	public String pdedeKey= "";
	public String pdedsKey= "";
	public String pdeieKey= "";
	public String pdeisKey= "";
	
	public void doKeyPress(String initons, FullDNATokenPDI_XCDX pDE_RNA_FullFormular, boolean bYS) {	
		Initon[] initon= new Initon[initons.length()];
		for(int i= 0; i< initons.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].I_Initon(""+ initons.charAt(i)); 
			if(i+ 1< initons.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}
		if(null!= initons&& initons.length()> 0) {
			new FullDNATokenPDI_XCDX_do_PDE_RNA_FullFormular().do_PDE_RNA_FullFormular(initon[0], pDE_RNA_FullFormular, bYS);	
		}
	}
	
	public String[] encodeDNA(String humanWord) {
		String[] string= new String[5];
		//0e  1s  2 humanword 3 seccode 4dna initons 
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular.code= pDE_RNA_FullFormular.initonSect(humanWord);
		System.out.println(pDE_RNA_FullFormular.code);
		pDE_RNA_FullFormular.enSecCode(pDE_RNA_FullFormular, false);
		pDE_RNA_FullFormular.pdedeKey= pDE_RNA_FullFormular.pdeieKey;
		pDE_RNA_FullFormular.pdedsKey= pDE_RNA_FullFormular.pdeisKey;
		pDE_RNA_FullFormular.code= pDE_RNA_FullFormular.pde;
		pDE_RNA_FullFormular.pde= "";
		pDE_RNA_FullFormular.deSecCode(pDE_RNA_FullFormular, true);
		string[0]= pDE_RNA_FullFormular.pdeieKey;
		string[1]= pDE_RNA_FullFormular.pdeisKey;
		string[2]= humanWord;
		string[3]= pDE_RNA_FullFormular.code;
		string[4]= pDE_RNA_FullFormular.pde;
		System.out.println(pDE_RNA_FullFormular.pde);
		return string;
	}
	private void deSecCode(FullDNATokenPDI_XCDX pDE_RNA_FullFormular, boolean b) {
		//
		String initons= pDE_RNA_FullFormular.code;
		Initon[] initon= new Initon[initons.length()];
		for(int i= 0; i< initons.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].I_Initon(""+ initons.charAt(i)); 
			if(i+ 1< initons.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}
		if(null!= initons&& initons.length()> 0) {
			new FullDNATokenPDI_XCDX_do_PDE_RNA_FullFormular().de_PDE_RNA_FullFormularForDB(initon[0], pDE_RNA_FullFormular, true);	
			//do_PDE_RNA_FullFormular_FullBack(initon[0], pDE_RNA_FullFormular, true);	
		}	
	}

	private void enSecCode(FullDNATokenPDI_XCDX pDE_RNA_FullFormular, boolean bys) {
		String initons= pDE_RNA_FullFormular.code;
		Initon[] initon= new Initon[initons.length()];
		for(int i= 0; i< initons.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].I_Initon(""+ initons.charAt(i)); 
			if(i+ 1< initons.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}
		if(null!= initons&& initons.length()> 0) {
			new FullDNATokenPDI_XCDX_do_PDE_RNA_FullFormular().do_PDE_RNA_FullFormularForDB(initon[0], pDE_RNA_FullFormular, bys);	
		}	
	}

	public void doFullSessionKeyUnPress(String initons, FullDNATokenPDI_XCDX pDE_RNA_FullFormular3, boolean bYS) {
		Initon[] initon= new Initon[initons.length()];
		for(int i= 0; i< initons.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].I_Initon(""+ initons.charAt(i)); 
			if(i+ 1< initons.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}	
		new FullDNATokenPDI_XCDX_do_PDE_RNA_FullFormular().do_PDE_RNA_FullFormular_FullBack(initon[0], pDE_RNA_FullFormular3, bYS);	
	}

	public void doSessionKeyUnPress(String initons, FullDNATokenPDI_XCDX pDE_RNA_FullFormular2, boolean bYS) {
		Initon[] initon= new Initon[initons.length()];
		for(int i= 0; i< initons.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].I_Initon(""+ initons.charAt(i)); 
			if(i+ 1< initons.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}	
		new FullDNATokenPDI_XCDX_do_PDE_RNA_FullFormular().do_PDE_RNA_FullFormular_Back(initon[0], pDE_RNA_FullFormular2, bYS);
	}

	public void doKeyUnPress(String initons, FullDNATokenPDI_XCDX pDE_RNA_FullFormular, boolean bYS) {
		Initon[] initon= new Initon[initons.length()];
		for(int i= 0; i< initons.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].I_Initon(""+ initons.charAt(i)); 
			if(i+ 1< initons.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}	
		new FullDNATokenPDI_XCDX_do_PDE_RNA_FullFormular().do_PDE_RNA_FullFormular(initon[0], pDE_RNA_FullFormular, bYS);
	}
	
	public String initonSect(String key) {
		String pdis= "";
		Map<String, String> map= new HashMap<>();
		map.put("0", "A");
		map.put("1", "O");
		map.put("2", "P");
		map.put("3", "M");
		map.put("4", "V");
		map.put("5", "E");
		map.put("6", "C");
		map.put("7", "S");
		map.put("8", "I");
		map.put("9", "D");
		map.put(".", "Q");
		int lineChars= 0;//让元基码分段
		for(int i= 0; i< key.length(); i++) {
			lineChars++;
			if(lineChars== 60) { //1行60个char
				pdis+="\r\n";
				lineChars= 0;
			}
			int c= key.charAt(i);
			String ints= ""+c;
			for(int j= 0; j< ints.length(); j++) {
				pdis+=map.get(""+ ints.charAt(j));
			}
			pdis+="U";
		}
		return pdis;
	}
	
	public String initonDeSect(String key) {
		String pdis= "";
		Map<String, String> map= new HashMap<>();
		map.put("A", "0");
		map.put("O", "1");
		map.put("P", "2");
		map.put("M", "3");
		map.put("V", "4");
		map.put("E", "5");
		map.put("C", "6");
		map.put("S", "7");
		map.put("I", "8");
		map.put("D", "9");
		map.put("Q", ".");
		String[] values= key.split("U");
		for(int i= 0; i< values.length; i++) {
			String c= values[i];
			String ints= "";
			for(int j= 0; j< c.length(); j++) {
				ints+=map.get(""+ c.charAt(j));
			}
			if(!ints.isEmpty()&& !ints.contains("null")) {//优化下null check
				int a= Integer.valueOf(ints);
				char b= (char) a;
				pdis+= b;
			}
		}
		return pdis;
	}
}