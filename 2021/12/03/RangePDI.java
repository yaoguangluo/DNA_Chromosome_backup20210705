package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;

import java.util.HashMap;
import java.util.Map;

import SVQ.stable.StableMapsInitons;

@SuppressWarnings("unused")
public class RangePDI{
	public static void main(String[] argv) {
		//System.out.println(new RangePDI().IOE(16, 20));
	}
	//240/4 600
	public int[][] IOE(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				String IDUQ= new RangePDI().PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[][] OIQ= new int[1][IDUQ.length()];
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== '2') {
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 3;
						}else {
							OIQ[0][k]= 1;
						}
					}else {
						OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
					}
				}
				ps[i][j]= new InitonsPDS().DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}
	
	//#### 元基数字 = 元基符号= 肽展公式元基数字变换 = (肽概率展开数字逻辑集合) #### 1位 ##### E = I = I =(I) 
	//##### F = U = I++ OR Q-- =(I, Q) 
	//##### G = Q = Q =(Q) 
	//#### 1~2位 
	//##### 0 = D = DD =(D, DD) 
	//#### 2位 
	//##### 1 = C = DI =(DI) 
	//##### 3 = E = IU, DU =(IU, DU) 
	//##### D = V = UQ =(UQ) 
	//##### 9 = S = QI =(QI) 
	//#### 2~4位 
	//##### 4 = H = (IU, DU) OR DI =(IU, DU, DI) OR (IUDI, DUDI) 
	//#### 4位 
	//##### 2 = P = (IU, DU) + DI =(IUDI, DUDI)
	//##### A = O = (IU, DU) + QI =(IUQI, DUQI) 
	//##### 7 = A = UQQI =(UQQI) 
	//#### 4~6位 
	//##### 5 = HC- = ((IU, DU) OR DI) + DI =(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI) 
	//##### B = HE+ = ((IU, DU) OR DI) + (IU, DU) =(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU) OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU)
	//#### 6~8位
	//##### 8 = M = ((IU, DU) OR DI) + DI + QI =(IUDIQI, DUDIQI, DIDIQI) OR (IUDIDIQI, DUDIDIQI) 
	//##### 6 = X = UQ + ((IU, DU) OR DI) + DI =(UQIUDI, UQDUDI, UQDIDI) OR (UQIUDIDI, UQDUDIDI) 
	//##### C = T = UQ + ((IU, DU) OR DI) + (IU, DU) =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU)
	public int[][] IPE_AOPM_VECS_IDUQ_TXH(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				String IDUQ= new RangePDI().PDS_P_USQ_ECP_I_17(ps[i][j], 17);
				char[][] OIQ= new char[1][IDUQ.length()];
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== 'U') {//g      //DIUQ
						if(Math.random()* 100> VECS) { // 按生化计算来。大于酸 小数，小于碱 大数
							OIQ[0][k]= 'Q';
						}else {
							OIQ[0][k]= IDUQ.charAt(k);
						}
					}else if(IDUQ.charAt(k)== 'Q') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'D';
						}else {
							OIQ[0][k]= IDUQ.charAt(k);
						}
					}else if(IDUQ.charAt(k)== 'I') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'U';
						}else {
							OIQ[0][k]= IDUQ.charAt(k);
						}
					}else if(IDUQ.charAt(k)== 'D') {//g
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 'I';
						}else {
							OIQ[0][k]=IDUQ.charAt(k);
						}
					}else if(IDUQ.charAt(k)== 'V') {//U   //DIUQ
						if(Math.random()* 100> VECS) {    //SEVC 相对应 //符号写翻了纠正 >20210820
							OIQ[0][k]= 'C';  
						}else {
							OIQ[0][k]= 'V'; 
						}
					}else if(IDUQ.charAt(k)== 'E') {//I
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'V';
						}else {
							OIQ[0][k]= 'E';
						}
					}else if(IDUQ.charAt(k)== 'C') {//Q
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'S';
						}else {
							OIQ[0][k]= 'C';
						}
					}else if(IDUQ.charAt(k)== 'S') {//D
						if(Math.random()* 100> VECS) { //符号写翻了纠正 >20210820
							OIQ[0][k]= 'E';
						}else {
							OIQ[0][k]= 'S';
						}
					}else {
						OIQ[0][k]= IDUQ.charAt(k);
					}
				}
				ps[i][j]= new InitonsPDS().DO_ACP_IDV_17(OIQ, 17);
			}
		}
		return ps;
	}

	//上面似乎又被猫腻了两个符号， 统一 VECS 小数是碱 大数是酸。 按标准肽展公式模拟下计算机视觉
	public int[][] IPE_AOPM_VECS_IDUQ_TXH_AC(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				//String IDUQ= new RangePDI().PDS_P_USQ_ECP_I_17(ps[i][j], 17);
				String IDUQ= new RangePDI().PDS_P_USQ_ECP_I_16(ps[i][j], 16);
				char[][] OIQ= new char[1][IDUQ.length()];
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== 'U') {//g
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'Q';
						}else {
							OIQ[0][k]= 'U';
						}
					}else if(IDUQ.charAt(k)== 'Q') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'Q';
						}else {
							OIQ[0][k]= 'U';
						}
					}else if(IDUQ.charAt(k)== 'I') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'I';
						}else {
							OIQ[0][k]= 'D';
						}
					}else if(IDUQ.charAt(k)== 'D') {//g
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'I';
						}else {
							OIQ[0][k]= 'D';
						}
					}else if(IDUQ.charAt(k)== 'V') {//U   //DIUQ
						if(Math.random()* 100< VECS) {    //SEVC 相对应
							OIQ[0][k]= 'C';
						}else {
							OIQ[0][k]= 'V';
						}
					}else if(IDUQ.charAt(k)== 'E') {//I
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'E';
						}else {
							OIQ[0][k]= 'S';
						}
					}else if(IDUQ.charAt(k)== 'C') {//Q
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'C';
						}else {
							OIQ[0][k]= 'V';
						}
					}else if(IDUQ.charAt(k)== 'S') {//D
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'E';
						}else {
							OIQ[0][k]= 'S';
						}
					}else if(IDUQ.charAt(k)== 'A') {//A = V + S, 酸 = C + E = P,  碱 = V + S = A
						if(Math.random()* 100< VECS) {    
							OIQ[0][k]= 'P';                 
						}else {
							OIQ[0][k]= 'A';
						}
					}else if(IDUQ.charAt(k)== 'O') {//O = E + S, 酸= E + E = E ,  碱 = V + S = A
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'E';
						}else {
							OIQ[0][k]= 'A';
						}
					}else if(IDUQ.charAt(k)== 'P') {//P = E + C, 酸 = E + C = P,  碱 = S + V = A
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'P';
						}else {
							OIQ[0][k]= 'A';
						}
					}else if(IDUQ.charAt(k)== 'M') {//M = C + S, 酸 = C + E = P,  碱 = V + S = A
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'P';
						}else {
							OIQ[0][k]= 'A';
						}
					}else if(IDUQ.charAt(k)== 'F') {//F = E+  C + S, 酸 = H,  碱 = V
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'H';
						}else {
							OIQ[0][k]= 'V';
						}	
					}else {
						OIQ[0][k]= IDUQ.charAt(k);
					}
				}
				//ps[i][j]= new InitonsPDS().DO_ACP_IDV_17(OIQ, 17);
				ps[i][j]= new InitonsPDS().DO_ACP_IDV_16(OIQ, 16);
			}
		}
		return ps;
	}
	
	
	
	public int[][] IPE(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				String IDUQ= new RangePDI().PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[][] OIQ= new int[1][IDUQ.length()];
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== '2') {//g
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 3;
						}else {
							OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
						}
					}else if(IDUQ.charAt(k)== '3') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 0;
						}else {
							OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
						}
					}else if(IDUQ.charAt(k)== '1') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 2;
						}else {
							OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
						}
					}else if(IDUQ.charAt(k)== '0') {//g
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 1;
						}else {
							OIQ[0][k]= Integer.valueOf(""+ IDUQ.charAt(k));
						}
					}
				}
				ps[i][j]= new InitonsPDS().DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}
	
	public int[][] QPE(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				String IDUQ= new RangePDI().PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[][] OIQ= new int[1][IDUQ.length()];
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== '0') {//g D I U Q
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 1;
						}else {
							OIQ[0][k]= 0;
						}
					}else if(IDUQ.charAt(k)== '1') {//s
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 1;
						}else {
							OIQ[0][k]= 2;
						}
					}else if(IDUQ.charAt(k)== '2') {//s
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 3;
						}else {
							OIQ[0][k]= 0;
						}
					}else if(IDUQ.charAt(k)== '3') {//g
						if(Math.random()* 100> VECS) {
							OIQ[0][k]= 3;
						}else {
							OIQ[0][k]= 0;
						}
					}
				}
				ps[i][j]= new InitonsPDS().DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}
	
	public String injectPDI(String pdi) {
		
		return pdi;	
	}
	
	public String PDSEncode(String VSQ) {
		while(VSQ.length()> 0){
		//	VSQ.concat(VSQ.replace("", ""))> 0;
		}
		return VSQ;	
	}
	
	public String PDS_OEC_IID(String VSQ_IIE, int OCI_PPE) {
        //
	    String $_CID= "AOPMVECS";
		//VSQ_IIE= $_CID.charAt(VSQ_IIE.length());
		return VSQ_IIE;	
	}
	
	public String PDS_P_USQ_ECP(int P_VSQ, int MSP) {
		String ISQ= "";
		while(P_VSQ> 0) {
			ISQ+= P_VSQ/ MSP;
			P_VSQ%= MSP;
		}
		ISQ+= P_VSQ;
		return ISQ;
	}
	//64/4   8/4 2  
	public String PDS_P_USQ_ECP_I(int P_VSQ, int MSP) {
		String ISQ= "";
		while(P_VSQ>= MSP) {
			ISQ+= P_VSQ/ MSP;
			P_VSQ%= MSP;
		}
		ISQ+= P_VSQ;
		return ISQ;
	}
	//	//阿拉伯数字变元基数字
	//	decadeToPDS.initonsSet.put("0", "0");
	//	decadeToPDS.initonsSet.put("1", "1");
	//	decadeToPDS.initonsSet.put("2", "2");
	//	decadeToPDS.initonsSet.put("3", "3");
	//	decadeToPDS.initonsSet.put("4", "4");
	//	decadeToPDS.initonsSet.put("5", "5");
	//	decadeToPDS.initonsSet.put("6", "6");
	//	decadeToPDS.initonsSet.put("7", "7");
	//	decadeToPDS.initonsSet.put("8", "8");
	//	decadeToPDS.initonsSet.put("9", "9");
	//	decadeToPDS.initonsSet.put("10", "A");
	//	decadeToPDS.initonsSet.put("11", "B");
	//	decadeToPDS.initonsSet.put("12", "C");
	//	decadeToPDS.initonsSet.put("13", "D");
	//	decadeToPDS.initonsSet.put("14", "E");
	//	decadeToPDS.initonsSet.put("15", "F");
	//	decadeToPDS.initonsSet.put("16", "G");
	//
	//	//元基数字变阿拉伯数字
	//	decadeToPDS.numberSet.put("0", 0);
	//	decadeToPDS.numberSet.put("1", 1);
	//	decadeToPDS.numberSet.put("2", 2);
	//	decadeToPDS.numberSet.put("3", 3);
	//	decadeToPDS.numberSet.put("4", 4);
	//	decadeToPDS.numberSet.put("5", 5);
	//	decadeToPDS.numberSet.put("6", 6);
	//	decadeToPDS.numberSet.put("7", 7);
	//	decadeToPDS.numberSet.put("8", 8);
	//	decadeToPDS.numberSet.put("9", 9);
	//	decadeToPDS.numberSet.put("A", 10);
	//	decadeToPDS.numberSet.put("B", 11);
	//	decadeToPDS.numberSet.put("C", 12);
	//	decadeToPDS.numberSet.put("D", 13);
	//	decadeToPDS.numberSet.put("E", 14);
	//	decadeToPDS.numberSet.put("F", 15);
	//	decadeToPDS.numberSet.put("G", 16);
	//现在PDS函数太大了，不想new，之后会用DecadeToPDS函数
	public String PDS_P_USQ_ECP_I_17(int P_VSQ, int MSP) {
		Map<String, String> initonsSet= new HashMap<>();
		initonsSet.put("0", "0");
		initonsSet.put("1", "1");
		initonsSet.put("2", "2");
		initonsSet.put("3", "3");
		initonsSet.put("4", "4");
		initonsSet.put("5", "5");
		initonsSet.put("6", "6");
		initonsSet.put("7", "7");
		initonsSet.put("8", "8");
		initonsSet.put("9", "9");
		initonsSet.put("10", "A");
		initonsSet.put("11", "B");
		initonsSet.put("12", "C");
		initonsSet.put("13", "D");
		initonsSet.put("14", "E");
		initonsSet.put("15", "F");
		initonsSet.put("16", "G");

		Map<String, String> initonsCode= new HashMap<>();
		initonsCode.put("0", "D");
		initonsCode.put("1", "C");
		initonsCode.put("2", "P");
		initonsCode.put("3", "E");
		initonsCode.put("4", "H");
		initonsCode.put("5", "-");
		initonsCode.put("6", "X");
		initonsCode.put("7", "A");
		initonsCode.put("8", "M");
		initonsCode.put("9", "S");
		initonsCode.put("A", "O");
		initonsCode.put("B", "+");
		initonsCode.put("C", "T");
		initonsCode.put("D", "V");
		initonsCode.put("E", "I");
		initonsCode.put("F", "U");
		initonsCode.put("G", "Q");
		String ISQ= "";
		while(P_VSQ>= MSP) {
			ISQ+= initonsCode.get(initonsSet.get(""+ P_VSQ/ MSP));// P_VSQ;
			P_VSQ%= MSP;
		}
		ISQ+= initonsCode.get(initonsSet.get(""+ P_VSQ));// P_VSQ;
		return ISQ;
	}
	
	public String PDS_P_USQ_ECP_I_16(int P_VSQ, int MSP) {
		Map<String, String> initonsSet= new HashMap<>();
		initonsSet.put("0", "0");
		initonsSet.put("1", "1");
		initonsSet.put("2", "2");
		initonsSet.put("3", "3");
		initonsSet.put("4", "4");
		initonsSet.put("5", "5");
		initonsSet.put("6", "6");
		initonsSet.put("7", "7");
		initonsSet.put("8", "8");
		initonsSet.put("9", "9");
		initonsSet.put("10", "A");
		initonsSet.put("11", "B");
		initonsSet.put("12", "C");
		initonsSet.put("13", "D");
		initonsSet.put("14", "E");
		initonsSet.put("15", "F");

		Map<String, String> initonsCode= new HashMap<>();
		initonsCode.put("0", "D");
		initonsCode.put("1", "C");
		initonsCode.put("2", "P");
		initonsCode.put("3", "E");
		initonsCode.put("4", "T");
		initonsCode.put("5", "H");
		initonsCode.put("6", "O");
		initonsCode.put("7", "S");
		initonsCode.put("8", "M");
		initonsCode.put("9", "A");
		initonsCode.put("A", "X");
		initonsCode.put("B", "F");
		initonsCode.put("C", "V");
		initonsCode.put("D", "I");
		initonsCode.put("E", "U");
		initonsCode.put("F", "Q");

		String ISQ= "";
		while(P_VSQ>= MSP) {
			ISQ+= initonsCode.get(initonsSet.get(""+ P_VSQ/ MSP));// P_VSQ;
			P_VSQ%= MSP;
		}
		ISQ+= initonsCode.get(initonsSet.get(""+ P_VSQ));// P_VSQ;
		return ISQ;
	}
	
	public String PDS_P_USQ_ECP_I_17_Stable(int P_VSQ, int MSP) {
		String ISQ= "";
		while(P_VSQ>= MSP) {
			ISQ+= StableMapsInitons.initonsCode.get(StableMapsInitons.initonsSet.get(""+ P_VSQ/ MSP));// P_VSQ;
			P_VSQ%= MSP;
		}
		ISQ+= StableMapsInitons.initonsCode.get(StableMapsInitons.initonsSet.get(""+ P_VSQ));// P_VSQ;
		return ISQ;
	}
	
	public String ESU_M_SVQ_PDS_OEU(String SQA) {
		String[] PDS= new String[]{"AOPM", "VECS", "DIUQ", "HTX"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_ECS_SVQ_PDS_OEU(String SQA) {
		String[] PDS= new String[]{"AOPM", "VECS"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_P_SVQ_PDS_OEU(String SQA) {
		String[] PDS= new String[]{"AOPM", "VECS", "DIUQ", "HTX"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_P_SEQ_PDS_OEU(String SQA) {
		String[] PDS= new String[]{"AOPM", "VECS", "DIUQ", "HTX"};
		String ISQ_PSD= "";
		int i= 0;
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
			SQA+= PDSEncode(PDS[i]);
		}
		return ISQ_PSD;
	}
	
	public String EUP_QD_PQI(String AEP, int QSV) {
		String[][] CED= new String[][] {{"A","O","P","M"}, {"V","E","C","S"}, {"D","I","U","Q"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUP_QD_PQU(String AEP, int QSU) {
		String[][] CED= new String[][] {{"D","I","U","Q"}, {"H","T","X"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String ESU_M_SVQ_PDS_OEU_M(String SQA) {
		String[] PDS= new String[]{"AOPM"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_M_SVQ_PDS_OEU_P(String SQA) {
		String[] PDS= new String[]{"VECS"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_M_SVQ_PDS_OEU_O(String SQA) {
		String[] PDS= new String[]{"DIUQ"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_M_SVQ_PDS_OEU_A(String SQA) {
		String[] PDS= new String[]{"HTX"};
		String ISQ_PSD= "";
		while(injectPDI(ISQ_PSD).length()> 0) {
			ISQ_PSD+= PDSEncode(SQA);
		}
		return ISQ_PSD;
	}
	
	public String ESU_M_SVQ_PDS_OEU_OA(String SQA) { 
		//AEC.VSQ.IC.IE
		return SQA;
	}
	
}