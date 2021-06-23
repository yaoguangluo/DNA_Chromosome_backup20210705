package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;

//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class FullDNATokenPDI_XCDX_do_PDE_RNA_FullFormular {

	public void de_PDE_RNA_FullFormularForDB(Initon initon, FullDNATokenPDI_XCDX pDE_RNA_FullFormular, boolean bYS) {
		// TODO Auto-generated method stub
		Initon InitonPDE= initon; 
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		Initon InitonPDE1V= new FullDNATokenPDI_XCDX_doIncrement().doIncrementV(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular);	
		Initon InitonPDE1E= new FullDNATokenPDI_XCDX_doIncrement().doIncrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1C= new FullDNATokenPDI_XCDX_doIncrement().doIncrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);	
		Initon InitonPDE1S= new FullDNATokenPDI_XCDX_doIncrement().doIncrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		
//		Initon InitonPDE1A= new FullDNATokenPDI_XCDX_doIncrement().doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);	
//		Initon InitonPDE1O= new FullDNATokenPDI_XCDX_doIncrement().doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular);
//		Initon InitonPDE1P= new FullDNATokenPDI_XCDX_doIncrement().doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular); 
//		Initon InitonPDE2= new FullDNATokenPDI_XCDX_doIncrement().doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
		while(InitonPDE1S.hasNext()) { 
			pDE_RNA_FullFormular.pde+= InitonPDE1S.getStore();
			InitonPDE1S= InitonPDE1S.next;
		} 
		pDE_RNA_FullFormular.pde+= InitonPDE1S.getStore();
		while(InitonPDE1S.hasPrev()) {
			InitonPDE1S= InitonPDE1S.prev;
		}
		
//		Initon InitonPDEM= new FullDNATokenPDI_XCDX_doDecrement().doDecrementM(InitonPDE2, initonLinkDNA, pDE_RNA_FullFormular);
//		Initon InitonPDEP= new FullDNATokenPDI_XCDX_doDecrement().doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular);
//		Initon InitonPDEO= new FullDNATokenPDI_XCDX_doDecrement().doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular);
//		Initon InitonPDEA= new FullDNATokenPDI_XCDX_doDecrement().doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular);
//
//		Initon InitonPDES= new FullDNATokenPDI_XCDX_doDecrement().doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular, bYS);
//		Initon InitonPDEC= new FullDNATokenPDI_XCDX_doDecrement().doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_FullFormular);	
//		Initon InitonPDEE= new FullDNATokenPDI_XCDX_doDecrement().doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular, bYS);
//		Initon InitonPDE1= new FullDNATokenPDI_XCDX_doDecrement().doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular); 
//		while(InitonPDE1.hasNext()) { 
//			pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
//			InitonPDE1= InitonPDE1.next;
//		} 
//		pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
//		while(InitonPDE1.hasPrev()) {
//			InitonPDE1= InitonPDE1.prev;
//		}		
	}

	public void do_PDE_RNA_FullFormular_FullBack(Initon initon, FullDNATokenPDI_XCDX pDE_RNA_FullFormular3
			, boolean bYS) {
		Initon InitonPDE= initon; 
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		Initon InitonPDE1V= new FullDNATokenPDI_XCDX_doIncrement().doIncrementV(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular3);	
		Initon InitonPDE1E= new FullDNATokenPDI_XCDX_doIncrement().doIncrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular3, bYS);
		Initon InitonPDE1C= new FullDNATokenPDI_XCDX_doIncrement().doIncrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular3);	
		Initon InitonPDE1S= new FullDNATokenPDI_XCDX_doIncrement().doIncrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular3, bYS);
		
		Initon InitonPDE1A= new FullDNATokenPDI_XCDX_doIncrement().doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular3);	
		Initon InitonPDE1O= new FullDNATokenPDI_XCDX_doIncrement().doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular3);
		Initon InitonPDE1P= new FullDNATokenPDI_XCDX_doIncrement().doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular3); 
		Initon InitonPDE2= new FullDNATokenPDI_XCDX_doIncrement().doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular3);
		while(InitonPDE2.hasNext()) { 
			pDE_RNA_FullFormular3.pde+= InitonPDE2.getStore();
			InitonPDE2= InitonPDE2.next;
		} 
		pDE_RNA_FullFormular3.pde+= InitonPDE2.getStore();
		while(InitonPDE2.hasPrev()) {
			InitonPDE2= InitonPDE2.prev;
		}
		
		Initon InitonPDEM= new FullDNATokenPDI_XCDX_doDecrement().doDecrementM(InitonPDE2, initonLinkDNA, pDE_RNA_FullFormular3);
		Initon InitonPDEP= new FullDNATokenPDI_XCDX_doDecrement().doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular3);
		Initon InitonPDEO= new FullDNATokenPDI_XCDX_doDecrement().doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular3);
		Initon InitonPDEA= new FullDNATokenPDI_XCDX_doDecrement().doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular3);

		Initon InitonPDES= new FullDNATokenPDI_XCDX_doDecrement().doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular3, bYS);
		Initon InitonPDEC= new FullDNATokenPDI_XCDX_doDecrement().doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_FullFormular3);	
		Initon InitonPDEE= new FullDNATokenPDI_XCDX_doDecrement().doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular3, bYS);
		Initon InitonPDE1= new FullDNATokenPDI_XCDX_doDecrement().doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular3); 
		while(InitonPDE1.hasNext()) { 
			pDE_RNA_FullFormular3.pds+= InitonPDE1.getStore();
			InitonPDE1= InitonPDE1.next;
		} 
		pDE_RNA_FullFormular3.pds+= InitonPDE1.getStore();
		while(InitonPDE1.hasPrev()) {
			InitonPDE1= InitonPDE1.prev;
		}
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
		do_PDE_RNA_FullFormular_Back(initon[0], pDE_RNA_FullFormular2, bYS);
	}

	public void do_PDE_RNA_FullFormular_Back(Initon initon, FullDNATokenPDI_XCDX pDE_RNA_FullFormular
			, boolean bYS) {
		Initon InitonPDE= initon; 
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		Initon InitonPDEM= new FullDNATokenPDI_XCDX_doDecrement().doDecrementM(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDEP= new FullDNATokenPDI_XCDX_doDecrement().doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDEO= new FullDNATokenPDI_XCDX_doDecrement().doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDEA= new FullDNATokenPDI_XCDX_doDecrement().doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular);

		Initon InitonPDES= new FullDNATokenPDI_XCDX_doDecrement().doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		Initon InitonPDEC= new FullDNATokenPDI_XCDX_doDecrement().doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_FullFormular);	
		Initon InitonPDEE= new FullDNATokenPDI_XCDX_doDecrement().doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1= new FullDNATokenPDI_XCDX_doDecrement().doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular); 
		while(InitonPDE1.hasNext()) { 
			pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
			InitonPDE1= InitonPDE1.next;
		} 
		pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
		while(InitonPDE1.hasPrev()) {
			InitonPDE1= InitonPDE1.prev;
		}
//		Initon InitonPDE1S= new FullDNATokenPDI_XCDX_doIncrement().doIncrementS(InitonPDE1, initonLinkDNA, pDE_RNA_FullFormular, bYS);
//		Initon InitonPDE1C= new FullDNATokenPDI_XCDX_doIncrement().doIncrementC(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);
//		Initon InitonPDE1E= new FullDNATokenPDI_XCDX_doIncrement().doIncrementE(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);	
//		Initon InitonPDE1V= new FullDNATokenPDI_XCDX_doIncrement().doIncrementV(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);
//		Initon InitonPDE1M= new FullDNATokenPDI_XCDX_doIncrement().doIncrementM(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular);	
//		Initon InitonPDE1P= new FullDNATokenPDI_XCDX_doIncrement().doIncrementP(InitonPDE1M, initonLinkDNA, pDE_RNA_FullFormular);
//		Initon InitonPDE1O= new FullDNATokenPDI_XCDX_doIncrement().doIncrementO(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular); 
//		Initon InitonPDE2= new FullDNATokenPDI_XCDX_doIncrement().doIncrementA(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular);
//		while(InitonPDE2.hasNext()) { 
//			pDE_RNA_FullFormular.pde+= InitonPDE2.getStore();
//			InitonPDE2= InitonPDE2.next;
//		} 
//		pDE_RNA_FullFormular.pde+= InitonPDE2.getStore();
//		while(InitonPDE2.hasPrev()) {
//			InitonPDE2= InitonPDE2.prev;
//		}
	}

	public void do_PDE_RNA_FullFormularForDB(Initon initon, FullDNATokenPDI_XCDX pDE_RNA_FullFormular, boolean bYS) {
		// TODO Auto-generated method stub
		Initon InitonPDE= initon; 
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		Initon InitonPDE1V= new FullDNATokenPDI_XCDX_doDecrement().doDecrementV(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDE1E= new FullDNATokenPDI_XCDX_doDecrement().doDecrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1C= new FullDNATokenPDI_XCDX_doDecrement().doDecrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);		
		Initon InitonPDE1S= new FullDNATokenPDI_XCDX_doDecrement().doDecrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);
//		Initon InitonPDE1A= new FullDNATokenPDI_XCDX_doIncrement().doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);	
//		Initon InitonPDE1O= new FullDNATokenPDI_XCDX_doIncrement().doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular);
//		Initon InitonPDE1P= new FullDNATokenPDI_XCDX_doIncrement().doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular); 
//		Initon InitonPDE2= new FullDNATokenPDI_XCDX_doIncrement().doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
		while(InitonPDE1S.hasNext()) { 
			pDE_RNA_FullFormular.pde+= InitonPDE1S.getStore();
			InitonPDE1S= InitonPDE1S.next;
		} 
		pDE_RNA_FullFormular.pde+= InitonPDE1S.getStore();
		while(InitonPDE1S.hasPrev()) {
			InitonPDE1S= InitonPDE1S.prev;
		}
	}

	public void do_PDE_RNA_FullFormular(Initon initon, FullDNATokenPDI_XCDX pDE_RNA_FullFormular
			, boolean bYS) {	
		Initon InitonPDE= initon; 
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		//a->b
		Initon InitonPDEA= new FullDNATokenPDI_XCDX_doDecrement().doDecrementA(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDEO= new FullDNATokenPDI_XCDX_doDecrement().doDecrementO(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular);	
		Initon InitonPDEP= new FullDNATokenPDI_XCDX_doDecrement().doDecrementP(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDEM= new FullDNATokenPDI_XCDX_doDecrement().doDecrementM(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular); 
		Initon InitonPDEV= new FullDNATokenPDI_XCDX_doDecrement().doDecrementV(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDEE= new FullDNATokenPDI_XCDX_doDecrement().doDecrementE(InitonPDEV, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		Initon InitonPDEC= new FullDNATokenPDI_XCDX_doDecrement().doDecrementC(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDE1= new FullDNATokenPDI_XCDX_doDecrement().doDecrementS(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		while(InitonPDE1.hasNext()) { 
			pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
			InitonPDE1= InitonPDE1.next;
		} 
		pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
		while(InitonPDE1.hasPrev()) {
			InitonPDE1= InitonPDE1.prev;
		}
		//b->c
		Initon InitonPDE1V= new FullDNATokenPDI_XCDX_doIncrement().doIncrementV(InitonPDE1, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDE1E= new FullDNATokenPDI_XCDX_doIncrement().doIncrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1C= new FullDNATokenPDI_XCDX_doIncrement().doIncrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);		
		Initon InitonPDE1S= new FullDNATokenPDI_XCDX_doIncrement().doIncrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1A= new FullDNATokenPDI_XCDX_doIncrement().doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);	
		Initon InitonPDE1O= new FullDNATokenPDI_XCDX_doIncrement().doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular);
		Initon InitonPDE1P= new FullDNATokenPDI_XCDX_doIncrement().doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular); 
		Initon InitonPDE2= new FullDNATokenPDI_XCDX_doIncrement().doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
		while(InitonPDE2.hasNext()) { 
			pDE_RNA_FullFormular.pde+= InitonPDE2.getStore();
			InitonPDE2= InitonPDE2.next;
		} 
		pDE_RNA_FullFormular.pde+= InitonPDE2.getStore();
		while(InitonPDE2.hasPrev()) {
			InitonPDE2= InitonPDE2.prev;
		}
	}
}