package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;
@SuppressWarnings("unused")
public class Initon {
	private String store;
	public Initon prev;
	public Initon next;
	public String getStore() {
		return store;
	}

	public Initon addNextInitons(Initon initon) {
		Initon thisIniton= this;
		while(null!= thisIniton.next) {
			thisIniton= thisIniton.next;
		}
		thisIniton.next= initon;
		return thisIniton;
	}

	public Initon addPrevInitons(Initon initon) {
		Initon thisIniton= this;
		while(null!= thisIniton.prev) {
			thisIniton= thisIniton.prev;
		}
		thisIniton.prev= initon;
		return thisIniton;
	}
	public void I_Initon(String initon) {
		this.store= initon;
	}
	public void I_A() {
		this.store= "A";
	}
	public void I_O() {
		this.store= "O";
	}
	public void I_P() {
		this.store= "P";
	}
	public void I_M() {
		this.store= "M";
	}
	public void I_V() {
		this.store= "V";
	}
	public void I_E() {
		this.store= "E";
	}
	public void I_C() {
		this.store= "C";
	}
	public void I_S() {
		this.store= "S";
	}
	public void I_I() {
		this.store= "I";
	}
	public void I_D() {
		this.store= "D";
	}
	public void I_U() {
		this.store= "U";
	}
	public void I_Q() {
		this.store= "Q";
	}

	public boolean hasNext() {
		if(null!= this.next) {
			return true;
		}
		return false;
	}

	public Initon forwardNext() {
		return this.next;
	}

	public boolean hasPrev() {
		if(null!= this.prev) {
			return true;
		}
		return false;
	}

	public Initon forwardPrev() {
		return this.prev;
	}
    // ���ڼ��㸴��
	public Initon copyRNA(Initon initonPDE) {
		while(initonPDE.hasPrev()) {
			initonPDE.forwardPrev();
		}
		Initon InitonRNA= new Initon();
		InitonRNA.store= initonPDE.store;
		while(initonPDE.next!= null) {
			initonPDE=initonPDE.next;
			Initon initon= new Initon();
			initon.store= initonPDE.store;
			InitonRNA.next= initon;
			initon.prev= InitonRNA;
			InitonRNA= initon;
		}
		//���copy
		while(initonPDE.prev!= null) {
			initonPDE=initonPDE.prev;
		}
		while(InitonRNA.prev!= null) {
			InitonRNA=InitonRNA.prev;
		}
		return InitonRNA;
	}
	//�����Ŵ�����
	public Initon swapRNA(Initon initonPDE) {
		while(initonPDE.hasPrev()) {
			initonPDE.forwardPrev();
		}
		Initon InitonRNA= new Initon();
		InitonRNA.store= initonPDE.store;
		while(initonPDE.next!= null) {
			initonPDE=initonPDE.next;
			Initon initon= new Initon();
			if(initonPDE.store.equalsIgnoreCase("IQ")) {
				initon.store= "S";	
			}
			if(initonPDE.store.equalsIgnoreCase("S")) {
				initon.store= "IQ";		
		    }
//			if(initonPDE.store.equalsIgnoreCase("I")) {
//				initon.store= "U";	
//			}//�����һ������� �淶��. ������.20201105 7:56
//			if(initonPDE.store.equalsIgnoreCase("D")) {
//				initon.store= "DD";	
//			}
			if(initonPDE.store.equalsIgnoreCase("E")) {
				initon.store= "DU";	
			}
			if(initonPDE.store.equalsIgnoreCase("DU")) {
				initon.store= "E";		
		    }
			if(initonPDE.store.equalsIgnoreCase("C")) {
				initon.store= "ID";	
			}
			if(initonPDE.store.equalsIgnoreCase("ID")) {
				initon.store= "C";	
			}
			if(initonPDE.store.equalsIgnoreCase("UQ")) {
				initon.store= "V";		
		    }
			if(initonPDE.store.equalsIgnoreCase("V")) {
				initon.store= "UQ";		
		    }
			initon.store= initonPDE.store;
			InitonRNA.next= initon;
			initon.prev= InitonRNA;
			InitonRNA= initon;
		}
		//���copy
		while(initonPDE.prev!= null) {
			initonPDE=initonPDE.prev;
		}
		while(InitonRNA.prev!= null) {
			InitonRNA=InitonRNA.prev;
		}
		return InitonRNA;
	}
	
	//���ڷ��븴��
	public Initon maskRNA(Initon initonPDE) {
		while(initonPDE.hasPrev()) {
			initonPDE.forwardPrev();
		}
		Initon InitonRNA= new Initon();
		InitonRNA.store= initonPDE.store;
		while(initonPDE.next!= null) {
			initonPDE=initonPDE.next;
			Initon initon= new Initon();

			if(initonPDE.store.equalsIgnoreCase("I")) {
				initon.store= "D";	
			}
			if(initonPDE.store.equalsIgnoreCase("D")) {
				initon.store= "I";	
			}
			if(initonPDE.store.equalsIgnoreCase("U")) {
				initon.store= "Q";	
			}
			if(initonPDE.store.equalsIgnoreCase("Q")) {
				initon.store= "U";	
			}
			initon.store= initonPDE.store;
			InitonRNA.next= initon;
			initon.prev= InitonRNA;
			InitonRNA= initon;
		}
		//���copy
		while(initonPDE.prev!= null) {
			initonPDE=initonPDE.prev;
		}
		while(InitonRNA.prev!= null) {
			InitonRNA=InitonRNA.prev;
		}
		return InitonRNA;
	}
	
	//���ڲ��븴��
	public Initon compsRNA(Initon initonPDE) {
		while(initonPDE.hasPrev()) {
			initonPDE.forwardPrev();
		}
		Initon InitonRNA= new Initon();
		InitonRNA.store= initonPDE.store;
		while(initonPDE.next!= null) {
			initonPDE=initonPDE.next;
			Initon initon= new Initon();

			if(initonPDE.store.equalsIgnoreCase("I")) {
				initon.store= "U";	
			}
			if(initonPDE.store.equalsIgnoreCase("D")) {
				initon.store= "I";	
			}
			if(initonPDE.store.equalsIgnoreCase("U")) {
				initon.store= "Q";	
			}
			if(initonPDE.store.equalsIgnoreCase("Q")) {
				initon.store= "DD";	
			}
			initon.store= initonPDE.store;
			InitonRNA.next= initon;
			initon.prev= InitonRNA;
			InitonRNA= initon;
		}
		//���copy
		while(initonPDE.prev!= null) {
			initonPDE=initonPDE.prev;
		}
		while(InitonRNA.prev!= null) {
			InitonRNA=InitonRNA.prev;
		}
		return InitonRNA;
	}
	
	//����V�� SWAP initon.store= "UQ"; -> initon.store= "U"; �� NEXT initon.store= "Q";
	//����RNA ��չ�Ŵ�����Ԫ����.
	public Initon storeRNAExtension(Initon initonPDE) {
		while(initonPDE.hasPrev()) {
			initonPDE.forwardPrev();
		}
		Initon InitonRNA= new Initon();
		InitonRNA.store= initonPDE.store;
		while(initonPDE!= null) {
			if(initonPDE.store.length()== 1) {
				Initon initon= new Initon();
				initon.store= initonPDE.store;
				initon.prev= initonPDE.prev;
				initon.next= initonPDE.next;
				InitonRNA= initon;
			}
			if(initonPDE.store.length()== 2) {
				//��ʼ
				Initon initonFirst= new Initon();
				Initon initonSecond= new Initon();
				//��ֵ
				initonFirst.store= ""+ initonPDE.store.charAt(0);
				initonSecond.store= ""+ initonPDE.store.charAt(1);
				//����
				initonFirst.next= initonSecond;
				initonSecond.prev= initonFirst;
				//�Ѽ����ǰ������
				if(initonPDE.prev!= null) {
					initonFirst.prev= initonPDE.prev;
					initonFirst.prev.next= initonFirst;
				}
				//δ����ĺ������
				if(initonPDE.next!= null) {
					initonSecond.next= initonPDE.next;
					initonSecond.next.prev= initonSecond;
				}
				//���
				InitonRNA= initonSecond;
			}
			if(null== initonPDE.next) {
				while(initonPDE.prev!= null) {
					initonPDE= initonPDE.prev;
				}
				while(InitonRNA.prev!= null) {
					InitonRNA= InitonRNA.prev;
				}
				return InitonRNA;
			}
			initonPDE= initonPDE.next;
		}
		//���copy
		while(initonPDE.prev!= null) {
			initonPDE=initonPDE.prev;
		}
		while(InitonRNA.prev!= null) {
			InitonRNA=InitonRNA.prev;
		}
		return InitonRNA;
	}
	
	public static void main(String[] argv) {	
		Initon initonV= new Initon();
		initonV.store= "UQ";
		Initon initonV1= new Initon();
		initonV1.store= "Q";
		Initon initonV2= new Initon();
		initonV2.store= "IQ";
		
		
		
		initonV.next=initonV1;
		initonV1.prev= initonV;
		
		initonV1.next=initonV2;
		initonV2.prev= initonV1;
		
		initonV= initonV.storeRNAExtension(initonV);
		while(initonV.hasNext()) {
			System.out.println(initonV.getStore());
			initonV= initonV.forwardNext();
		}
		System.out.println(initonV.getStore());
	}
	
}