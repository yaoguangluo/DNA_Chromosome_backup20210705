package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;

//ע��: �� �ļ���Ӧ�������������� DNA ���� �� ���������  ���������� ˼��ı��� ʵ��. 
//������ �� ֪ʶ��ȨίԱ�� �Ѿ����� , ���Ķ� ��� ����Ȩ ԭ��  �����߼����.  
public class FullDNATokenPDI_XCDX_doIncrement {
/////INITONS SWAP	
	
	public Initon doIncrementA(Initon InitonPDE, InitonLinkDNA initonLinkDNA
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_FullFormular().PDE_IncrementA(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		System.out.println();
		System.out.print("A->");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.next;
		}
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		return InitonPDE;
	}
	public Initon doIncrementO(Initon InitonPDE, InitonLinkDNA initonLinkDNA
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_FullFormular().PDE_IncrementO(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		System.out.println();
		System.out.print("O->");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.next;
		}
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		return InitonPDE;
	}
	public Initon doIncrementP(Initon InitonPDE, InitonLinkDNA initonLinkDNA
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_FullFormular().PDE_IncrementP(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		System.out.println();
		System.out.print("P->");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.next;
		}
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		return InitonPDE;
	}
	public Initon doIncrementM(Initon InitonPDE, InitonLinkDNA initonLinkDNA
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_FullFormular().PDE_IncrementM(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		System.out.println();
		System.out.print("M->");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.next;
		}
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		return InitonPDE;
	}
	public Initon doIncrementV(Initon InitonPDE, InitonLinkDNA initonLinkDNA
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_FullFormular().PDE_IncrementV(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		System.out.println();
		System.out.print("V->");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.next;
		}
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		return InitonPDE;
	}
	public Initon doIncrementC(Initon InitonPDE, InitonLinkDNA initonLinkDNA
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_FullFormular().PDE_IncrementC(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		System.out.println();
		System.out.print("C->");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.next;
		}
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		return InitonPDE;
	}
	public Initon doIncrementE(Initon InitonPDE, InitonLinkDNA initonLinkDNA
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormular, boolean bYS) {
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_FullDNAFormular_XCDX().PDE_IncrementE_DU(initonLinkDNA
				, pDE_RNA_FullFormular, bYS);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		System.out.println();
		System.out.print("E->");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.next;
		}
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		return InitonPDE;
	}
	
	public Initon doIncrementS(Initon InitonPDE, InitonLinkDNA initonLinkDNA
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormular, boolean bYS) {
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_FullDNAFormular_XCDX().PDE_IncrementS_IQ(initonLinkDNA
				, pDE_RNA_FullFormular);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		System.out.println();
		System.out.print("S->");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.next;
		}
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.prev;
		}
		return InitonPDE;
	}
}