package OSI.SSI.ASU.OSU.PSU.MSU.pde;

import java.util.HashMap;
import java.util.Map;

import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL16;

//������������ڽ������任��ʮ������Ԫ�����֣�
//������������ڽ�ʮ������Ԫ�����ֽ���Ԫ���任
//������������ڽ�Ԫ���任������չ����˿��չ��
//����������ڽ���չ˿��������ʮ�����ƽ���Ԫ���任
//����������ڽ���չ˿��������ʮ�����Ʊ任��Ԫ������
//�����������ʮ������Ԫ�����ֽ���ʮ���ƻ�ԭ��
public class DecadeToPDS16{
	//˼�룺��չ��ʽ 1.2.2��Ԫ�������߼��� ʮ������Ԫ�������ѧ��������
	//�㷨�����Ƽ��㣬��չ����
	//����Ա�� �����⣬
	public Map<String, String> initonsMap= new HashMap<>();
	public Map<String, String> initonsCode= new HashMap<>();
	public Map<String, String> initonsSet= new HashMap<>();
	public Map<String, Integer> numberSet= new HashMap<>();
	public static void main(String[] Args) {	
		DecadeToPDS16 decadeToPDS= new DecadeToPDS16();
		decadeToPDS.IV_(decadeToPDS);
		int decade= (int)(Math.random()*1000 % 256);//���дһ����
		double pDE_KEY_rate= 0.25;//���ģ��һ��0-1֮��ĸ���Կ�ף����� 0~0.5Ϊ��
		//��0.5~1 Ϊ�		
		decadeToPDS.doPDS(decadeToPDS, decade, pDE_KEY_rate);
		System.out.println(1);
	}
	
//	//Ԫ�����ű�Ԫ������
//	//System.out.println("����ʮ��������"+ decade);
//	String seventeen= decadeToPDS.decadeToSeventeen(decade, decadeToPDS);
//	//System.out.println("Ԫ��������Ϊ��"+ seventeen);
//	String initons= decadeToPDS.seventeenToIntons(seventeen, decadeToPDS);
//	//System.out.println("�任ΪԪ����"+initons);
//	//initons= "AOPMVE";
//	//System.out.println("����Ԫ����"+ initons);
//	//System.out.println("������ʣ�"+ pDE_KEY_rate);
//	String pDS= decadeToPDS.initonsToPDS(initons, pDE_KEY_rate, decadeToPDS);
//	//System.out.println("�����˿:"+ pDS);
//	pDS= pDS.replace(".", "");
//	String pDSInitons= decadeToPDS.PDSToInitons(pDS, pDE_KEY_rate, decadeToPDS);
//	//System.out.println("��˿��Ԫ:"+ pDSInitons);
//	//�ڶ������չ��ʽ �����õ���
//	//String pDEInitons= decadeToPDS.PDSToPDE(pDSInitons, pDE_KEY_rate, decadeToPDS);
//	//System.out.println("��չ��Ԫ:"+ pDEInitons);
//	String pDSSeventeen= decadeToPDS.initonsToSeventeen(pDSInitons, decadeToPDS);
//	//System.out.println("Ԫ������:"+ pDSSeventeen);
//	String pDSDecade= decadeToPDS.seventeenToDecade(pDSSeventeen, decadeToPDS);
//	//System.out.println("���ʮ������:"+ pDSDecade);
//	return Integer.valueOf(pDSDecade).intValue();
	private int doPDS(DecadeToPDS16 decadeToPDS, int decade, double pDE_KEY_rate) {
		String sixteen= decadeToPDS.decadeToSixteen(decade, decadeToPDS);
		String initons= decadeToPDS.sixteenToIntons(sixteen, decadeToPDS);
		String pDS= decadeToPDS.initonsToPDS(initons, pDE_KEY_rate, decadeToPDS);
		pDS= pDS.replace(".", "");
		String pDSInitons= decadeToPDS.PDSToInitons(pDS, pDE_KEY_rate, decadeToPDS);
		String pDSSixteen= decadeToPDS.initonsToSixteen(pDSInitons, decadeToPDS);
		int pDSDecade= decadeToPDS.sixteenToDecade(pDSSixteen, decadeToPDS);
		return pDSDecade;
	}

	public void IV_(DecadeToPDS16 decadeToPDS) {
		decadeToPDS.initonsMap.put("A", "9");
		decadeToPDS.initonsMap.put("O", "6");
		decadeToPDS.initonsMap.put("P", "2");
		decadeToPDS.initonsMap.put("M", "8");
		decadeToPDS.initonsMap.put("V", "C");
		decadeToPDS.initonsMap.put("E", "3");
		decadeToPDS.initonsMap.put("C", "1");
		decadeToPDS.initonsMap.put("S", "7");
		decadeToPDS.initonsMap.put("I", "D");
		decadeToPDS.initonsMap.put("D", "0");
		decadeToPDS.initonsMap.put("U", "E");
		decadeToPDS.initonsMap.put("Q", "F");
		decadeToPDS.initonsMap.put("T", "4");
		decadeToPDS.initonsMap.put("X", "A");
		decadeToPDS.initonsMap.put("F", "B");
		decadeToPDS.initonsMap.put("H", "5");
		//Ԫ�����ֱ�Ԫ������
		decadeToPDS.initonsCode.put("0", "D");
		decadeToPDS.initonsCode.put("1", "C");
		decadeToPDS.initonsCode.put("2", "P");
		decadeToPDS.initonsCode.put("3", "E");
		decadeToPDS.initonsCode.put("4", "T");
		decadeToPDS.initonsCode.put("5", "H");
		decadeToPDS.initonsCode.put("6", "O");
		decadeToPDS.initonsCode.put("7", "S");
		decadeToPDS.initonsCode.put("8", "M");
		decadeToPDS.initonsCode.put("9", "A");
		decadeToPDS.initonsCode.put("A", "X");
		decadeToPDS.initonsCode.put("B", "F");
		decadeToPDS.initonsCode.put("C", "V");
		decadeToPDS.initonsCode.put("D", "I");
		decadeToPDS.initonsCode.put("E", "U");
		decadeToPDS.initonsCode.put("F", "Q");
		//���������ֱ�Ԫ������
		decadeToPDS.initonsSet.put("0", "0");
		decadeToPDS.initonsSet.put("1", "1");
		decadeToPDS.initonsSet.put("2", "2");
		decadeToPDS.initonsSet.put("3", "3");
		decadeToPDS.initonsSet.put("4", "4");
		decadeToPDS.initonsSet.put("5", "5");
		decadeToPDS.initonsSet.put("6", "6");
		decadeToPDS.initonsSet.put("7", "7");
		decadeToPDS.initonsSet.put("8", "8");
		decadeToPDS.initonsSet.put("9", "9");
		decadeToPDS.initonsSet.put("10", "A");
		decadeToPDS.initonsSet.put("11", "B");
		decadeToPDS.initonsSet.put("12", "C");
		decadeToPDS.initonsSet.put("13", "D");
		decadeToPDS.initonsSet.put("14", "E");
		decadeToPDS.initonsSet.put("15", "F");

		//Ԫ�����ֱ䰢��������
		decadeToPDS.numberSet.put("0", 0);
		decadeToPDS.numberSet.put("1", 1);
		decadeToPDS.numberSet.put("2", 2);
		decadeToPDS.numberSet.put("3", 3);
		decadeToPDS.numberSet.put("4", 4);
		decadeToPDS.numberSet.put("5", 5);
		decadeToPDS.numberSet.put("6", 6);
		decadeToPDS.numberSet.put("7", 7);
		decadeToPDS.numberSet.put("8", 8);
		decadeToPDS.numberSet.put("9", 9);
		decadeToPDS.numberSet.put("A", 10);
		decadeToPDS.numberSet.put("B", 11);
		decadeToPDS.numberSet.put("C", 12);
		decadeToPDS.numberSet.put("D", 13);
		decadeToPDS.numberSet.put("E", 14);
		decadeToPDS.numberSet.put("F", 15);
	}

	//	//׼�����ɵڶ����AOPM ���� ��չ��ʽ ���Ѿ�����PDSToInitons ������
	//	private String PDSToPDE(String pds, double pDE_KEY_rate, DecadeToPDS
	//decadeToPDS) {
	//		
	////pds= pds.replace("UQ", "V");	
	////pds= pds.replace("DI", "C");	
	////pds= pds.replace("IQ", "S");	
	////pds= pds.replace("VS", "A");
	////pds= pds.replace("ES", "O");
	////pds= pds.replace("EC", "P");
	////pds= pds.replace("CS", "M");
	////pds= pds.replace("VE", "T");
	////pds= pds.replace("VC", "X");
	////		
	//		return pds;
	//	}
	//������������ڽ������任��ʮ������Ԫ�����֣�
	public String decadeToSixteen(int decade, DecadeToPDS16 decadeToPDS) {
		String sixteen= "";
		int decad= decade;
		while(0< decad/ 16) {
			int sixteenth= decad% 16;
			sixteen= decadeToPDS.initonsSet.get(""+ sixteenth)+ sixteen;
			decad= decad/ 16;
		}
		sixteen= decadeToPDS.initonsSet.get(""+ decad)+ sixteen;
		//
		return sixteen;
	}
	//������������ڽ�ʮ������Ԫ�����ֽ���Ԫ���任
	public String sixteenToIntons(String sixteen, DecadeToPDS16 decadeToPDS) {
		String initons= "";	
		for(int i= 0; i< sixteen.length(); i++) {
			initons+= decadeToPDS.initonsCode.get(""+ sixteen.charAt(i));
		}
		//
		return initons;
	}
	//������������ڽ�Ԫ���任������չ����˿��չ��
	public String initonsToPDS(String initons, double pDE_KEY_rate, DecadeToPDS16 
			decadeToPDS) {
		String PDS= "";
		StringBuilder PDEKey= new StringBuilder("");
		for(int i= 0; i< initons.length(); i++) {
			PDS+=	new PDE_PDS_DL16().initonPDSwithBYS(""+ initons.charAt(i)
			, pDE_KEY_rate, PDEKey, true)+ ".";
		}
		//System.out.println("����Կ�ף�"+ PDEKey);
		//
		return PDS;
	}
	//����������ڽ���չ˿��������ʮ�����ƽ���Ԫ���任�� ֮�������� PDEKey ���ĸ�ʴ�е����á�
	public String PDSToInitons(String pDS, double pDE_KEY_rate, DecadeToPDS16 
			decadeToPDS) {
		String initons= "";
		//initons= new PDE_PDS_DL().initonPDIwithBYS(pDS, 0, new StringBuilder()
		//, false);
		//initons= new PDE_PDS_DL().initonPDEwithBYS(pDS, pDE_KEY_rate
		//, new StringBuilder(), true);
		initons= new PDE_PDS_DL16().initonPDE_DCDLwithBYS(pDS, pDE_KEY_rate
				, new StringBuilder(), true);
		return initons;
	}
	//����������ڽ���չ˿��������ʮ�����Ʊ任��Ԫ������
	public String initonsToSixteen(String initons, DecadeToPDS16 decadeToPDS) {
		String seventeen= "";
		//
		for(int i= 0; i< initons.length(); i++) {
			seventeen+= decadeToPDS.initonsMap.get(""+ initons.charAt(i));
		}
		return seventeen;
	}
	//�����������ʮ������Ԫ�����ֽ���ʮ���ƻ�ԭ��
	public int sixteenToDecade(String sixteen, DecadeToPDS16 decadeToPDS) {
		int decade= 0;
		//A11         10*16*16 + 1*16 + 1
		for(int i= 0; i< sixteen.length(); i++) {
			int value= decadeToPDS.numberSet.get(""+ sixteen.charAt(i)).intValue();
			decade+= value* Math.pow(16,  sixteen.length()- 1- i);
		}
		return decade;
	}
	//�����������ʮ������Ԫ�����ֽ���ʮ���ƾ���任��
	public int[][] doPDSMatrix(DecadeToPDS16 decadeToPDS, int[][] rp, double facx) {
		for(int i= 0; i< rp.length; i++) {
			for(int j= 0; j< rp[0].length; j++) {
				rp[i][j]= decadeToPDS.doPDS(decadeToPDS, rp[i][j], facx);
			}
		}
		return rp;
	}
}