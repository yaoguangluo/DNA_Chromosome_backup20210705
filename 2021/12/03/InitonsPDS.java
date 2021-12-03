package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;

import java.util.HashMap;
import java.util.Map;

import SVQ.stable.StableMapsInitons;

@SuppressWarnings("unused")
public class InitonsPDS{
	public static void main(String[] argv) {
		
	}
	
	public String EUM_QD_MQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"A","O","P","M"}, {"D","I","U","Q"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUM_QI_PQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"A", "O", "P", "M"}, {"V", "E", "C", "S"}, {"D", "I", "U", "Q"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUM_QD_PQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"A", "O", "P", "M"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUM_Q_PQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"V", "E", "C", "S"}, {"D", "I", "U", "Q"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUM_QU_PQD(String AEP, int QSV) {
		String[][] CED= new String[][] {{"V", "E", "C", "S"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String EUP_QD_PQU(String AEP, int QSU) {
		String[][] CED= new String[][] {{"D","I","U","Q"}, {"H","T","X"}};
		String PM_ISQ= "";
		return AEP;		
	}
	
	public String OCS(int[][] VDE) {
		
		return null;	
	}
	
	public String SDI_P_M_PDS(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '0';
			SQV+= AEP.charAt(i)| '0';
		}
		return AEP;
	}
	//s-e-i
	public String SDD_P_M_PDS(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '0';
			SQV+= AEP.charAt(i)& '0';
		}
		return AEP;
	}
	
	public String SDI_P_M_PDS_I(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '0';
			SQV+= AEP.charAt(i)| '1';
		}
		return AEP;
	}
	//s-e-i
	public String SDD_P_M_PDS_I(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '1';
			SQV+= AEP.charAt(i)& '0';
		}
		return AEP;
	}
	
	public String SDI_P_M_PDS_D(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '1';
			//SQV+= AEP.charAt(i)| '0';
		}
		return AEP;
	}
	//s-e-i
	public String SDD_P_M_PDS_D(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '0';
			//SQV+= AEP.charAt(i)& '1';
		}
		return AEP;
	}
	
	public String SDI_P_M_PDS_ID(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)& '1';
			//SQV+= AEP.charAt(i)| '0';
		}
		return AEP;
	}
	//s-e-i
	public String SDD_P_M_PDS_ID(String SQV, int[][] SVE, int[][] mask){
		String AEP= "";
		for(int i= 0; i< SQV.length(); i++) {
			AEP+= SQV.charAt(i)| '0';
			//SQV+= AEP.charAt(i)& '1';
		}
		int S= 1;
		int E= 1;
		int I= 1;
		String SEI= "DO ACP.IDV";
		//...
		return AEP;
	}
	//51MV_51_D1_SVI  20   2* 41     
 	public int DO_ACP_IDV(int[][] IDC, int QVM) {
		int OSI= 0;
		for(int i= 0; i< IDC.length; i++) {
			for(int j= 0; j< IDC[0].length- 1; j++) {
				OSI+= IDC[i][j]* Math.pow(QVM, IDC[0].length- j- 1);
			}
		}
		int IC= IDC[0].length;
		return OSI+ IDC[0][IC- 1];
	}
 	
 	// 	decadeToPDS.initonsMap.put("A", "7");
 	//	decadeToPDS.initonsMap.put("O", "A");
 	//	decadeToPDS.initonsMap.put("P", "2");
 	//	decadeToPDS.initonsMap.put("M", "8");
 	//	decadeToPDS.initonsMap.put("V", "D");
 	//	decadeToPDS.initonsMap.put("E", "3");
 	//	decadeToPDS.initonsMap.put("C", "1");
 	//	decadeToPDS.initonsMap.put("S", "9");
 	//	decadeToPDS.initonsMap.put("I", "E");
 	//	decadeToPDS.initonsMap.put("D", "0");
 	//	decadeToPDS.initonsMap.put("U", "F");
 	//	decadeToPDS.initonsMap.put("Q", "G");
 	//	decadeToPDS.initonsMap.put("T", "C");
 	//	decadeToPDS.initonsMap.put("X", "6");
 	//	decadeToPDS.initonsMap.put("+", "B");
 	//	decadeToPDS.initonsMap.put("-", "5");
 	//	decadeToPDS.initonsMap.put("H", "4");
 	//	
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
 	
 	//稍后会把map并到stable文件去。
 	public int DO_ACP_IDV_17(char[][] IDC, int QVM) {
 		Map<String, String> initonsMap= new HashMap<>();
 		initonsMap.put("A", "7");
 		initonsMap.put("O", "A");
 		initonsMap.put("P", "2");
 		initonsMap.put("M", "8");
 		initonsMap.put("V", "D");
 		initonsMap.put("E", "3");
 		initonsMap.put("C", "1");
 		initonsMap.put("S", "9");
 		initonsMap.put("I", "E");
 		initonsMap.put("D", "0");
 		initonsMap.put("U", "F");
 		initonsMap.put("Q", "G");
 		initonsMap.put("T", "C");
 		initonsMap.put("X", "6");
 		initonsMap.put("+", "B");
 		initonsMap.put("-", "5");
 		initonsMap.put("H", "4");
 		
 		Map<String, Integer> numberSet= new HashMap<>();	
 		numberSet.put("0", 0);
 		numberSet.put("1", 1);
 		numberSet.put("2", 2);
 		numberSet.put("3", 3);
 		numberSet.put("4", 4);
 		numberSet.put("5", 5);
 		numberSet.put("6", 6);
 		numberSet.put("7", 7);
 		numberSet.put("8", 8);
 		numberSet.put("9", 9);
 		numberSet.put("A", 10);
 		numberSet.put("B", 11);
 		numberSet.put("C", 12);
 		numberSet.put("D", 13);
 		numberSet.put("E", 14);
 		numberSet.put("F", 15);
 		numberSet.put("G", 16);
 		
		int OSI= 0;
		for(int i= 0; i< IDC.length; i++) {
			for(int j= 0; j< IDC[0].length- 1; j++) {
				int temp= numberSet.get(initonsMap.get(""+ IDC[i][j]));
				OSI+= temp* Math.pow(QVM, IDC[0].length- j- 1);
				
			}
		}
		int IC= IDC[0].length;
		IC= numberSet.get(initonsMap.get(""+ IDC[0][IC- 1]));
		return OSI+ IC;
	}
 	
 	public int DO_ACP_IDV_17_Stable(char[][] IDC, int QVM) {	
		int OSI= 0;
		for(int i= 0; i< IDC.length; i++) {
			for(int j= 0; j< IDC[0].length- 1; j++) {
				int temp= StableMapsInitons.numberSet.get(StableMapsInitons.initonsMap.get(""+ IDC[i][j]));
				OSI+= temp* Math.pow(QVM, IDC[0].length- j- 1);
				
			}
		}
		int IC= IDC[0].length;
		IC= StableMapsInitons.numberSet.get(StableMapsInitons.initonsMap.get(""+ IDC[0][IC- 1]));
		return OSI+ IC;
	}

		public int DO_ACP_IDV_16(char[][] IDC, int QVM) {
 		Map<String, String> initonsMap= new HashMap<>();
 		initonsMap.put("D", "0");
 		initonsMap.put("C", "1");
 		initonsMap.put("P", "2");
 		initonsMap.put("E", "3");
 		initonsMap.put("T", "4");
 		initonsMap.put("H", "5");
 		initonsMap.put("O", "6");
 		initonsMap.put("S", "7");
 		initonsMap.put("M", "8");
 		initonsMap.put("A", "9");
 		initonsMap.put("X", "A");
 		initonsMap.put("F", "B");
 		initonsMap.put("V", "C");
 		initonsMap.put("I", "D");
 		initonsMap.put("U", "E");
 		initonsMap.put("Q", "F");
 		
 		Map<String, Integer> numberSet= new HashMap<>();	
 		numberSet.put("0", 0);
 		numberSet.put("1", 1);
 		numberSet.put("2", 2);
 		numberSet.put("3", 3);
 		numberSet.put("4", 4);
 		numberSet.put("5", 5);
 		numberSet.put("6", 6);
 		numberSet.put("7", 7);
 		numberSet.put("8", 8);
 		numberSet.put("9", 9);
 		numberSet.put("A", 10);
 		numberSet.put("B", 11);
 		numberSet.put("C", 12);
 		numberSet.put("D", 13);
 		numberSet.put("E", 14);
 		numberSet.put("F", 15);
 		
		int OSI= 0;
		for(int i= 0; i< IDC.length; i++) {
			for(int j= 0; j< IDC[0].length- 1; j++) {
				int temp= numberSet.get(initonsMap.get(""+ IDC[i][j]));
				OSI+= temp* Math.pow(QVM, IDC[0].length- j- 1);
				
			}
		}
		int IC= IDC[0].length;
		IC= numberSet.get(initonsMap.get(""+ IDC[0][IC- 1]));
		return OSI+ IC;
	}
}