package OSI.SSI.ASU.OSU.PSU.MSU.ouler;

import java.util.HashMap;
import java.util.Map;

import SVQ.stable.StableCommon;

public class Q_OulerRing16{
	//这段函数用于观测元基映射的欧拉回路模型
	//思想 罗瑶光
	//算法 欧拉
	//程序员 罗瑶光
	//基于32行组 求接出 16进制元基为 DCPE THOS MAXF VIUQ

/*
 * HOSMAXFVIUEPCD12
11
10
T10
9
Q9
8
7
6
5
4
3
2
1
0

//AMSOHEPCD7  //基于该组数据求解   罗瑶光 20211129
//6
//5
//UIVT8
//FX9
//8
//7
//6
//Q6
//5
//4
//3
//2
//1
//0

OHEPCD4
3
2
UIVT5
FMAX8
7
SQ8
7
6
5
4
3
2
1
0

PEHOSMAXFVIUQ11
10
9
T9
8
7
6
5
4
3
2
CD3
2
1
0

MAXFHOSQUEPCD11
10
9
TVI11
10
9
8
7
6
5
4
3
2
1
0

VIUEHOSMAXF9
8
7
6
Q6
5
4
CP5
D5
4
T4
3
2
1
0

EHOSMAXFVIUQ10
9
8
T8
7
6
5
4
3
2
1
CP2
D2
1
0

CHOSMAXFVIUEP11
T11
10
Q10
9
8
7
6
5
4
3
2
1
0
D0

SOHEPCD5
4
3
UIVT6
FMAX9
8
7
6
5
4
Q4
3
2
1
0

IVTHOSMAXF8
7
6
5
QUEPCD10
9
8
7
6
5
4
3
2
1
0

DCHOSMAXFVIUEP12
T12
11
Q11
10
9
8
7
6
5
4
3
2
1
0

UEHOSMAXFVI9
T9
8
7
6
5
4
Q4
3
2
CP3
D3
2
1
0

QSOHEPCD6
5
4
UIVT7
FMAX10
9
8
7
6
5
4
3
2
1
0

THOSMAXFVIUEPCD13
12
11
10
Q10
9
8
7
6
5
4
3
2
1
0

XAMSOHEPCD8
7
6
UIVT9
F9
8
7
Q7
6
5
4
3
2
1
0

+
FHOSMAX5
4
3
QUEPCD8
7
6
TVI8
7
6
5
4
3
2
1
0

0
 * */
	
	public static void main(String[] args) {
		//init AOPM VECS IDUQ TXH DD
		//初始环路
		Map<String, Boolean> initonsLink= new HashMap<>();
		//环路探索
		Map<String, Boolean> didInitonsLink= new HashMap<>();
		initonsLink.put("DC", true);
		initonsLink.put("CD", true);
		initonsLink.put("IV", true);
		initonsLink.put("VI", true);
		initonsLink.put("IU", true);
		initonsLink.put("UI", true);
		initonsLink.put("UE", true);
		initonsLink.put("EU", true);
		initonsLink.put("UQ", true);
		initonsLink.put("QU", true);
		initonsLink.put("QS", true);
		initonsLink.put("SQ", true);
		
		initonsLink.put("VT", true);
		initonsLink.put("TV", true);
		initonsLink.put("ET", true);
		initonsLink.put("TE", true);
		initonsLink.put("EH", true);
		initonsLink.put("HE", true);
		initonsLink.put("EP", true);
		initonsLink.put("PE", true);
//		initonsLink.put("H+", true);//HE + HC -
//		initonsLink.put("+H", true);
//		initonsLink.put("H-", true);
//		initonsLink.put("-H", true);
		initonsLink.put("HC", true);
		initonsLink.put("CH", true);
		initonsLink.put("CP", true);
		initonsLink.put("PC", true);
		initonsLink.put("SM", true);
		initonsLink.put("MS", true);
		initonsLink.put("SO", true);
		initonsLink.put("OS", true);	
		
		initonsLink.put("HF", true);
		initonsLink.put("FH", true);	
		initonsLink.put("VF", true);
		initonsLink.put("FV", true);
		
		initonsLink.put("XA", true);	
		initonsLink.put("AX", true);	
		initonsLink.put("MA", true);	
		initonsLink.put("AM", true);	
//		initonsLink.put("X-", true);	
//		initonsLink.put("-X", true);	
//		initonsLink.put("M-", true);	
//		initonsLink.put("-M", true);
		
		initonsLink.put("XF", true);	
		initonsLink.put("FX", true);	
		initonsLink.put("MF", true);	
		initonsLink.put("FM", true);	
		
//		initonsLink.put("T+", true);	
//		initonsLink.put("+T", true);	
//		initonsLink.put("O+", true);	
//		initonsLink.put("+O", true);	
	
		initonsLink.put("TH", true);	
		initonsLink.put("HT", true);	
		initonsLink.put("OH", true);	
		initonsLink.put("HO", true);
		
		String[] initons= new String[]{"H", "A", "O", "P", "M", "V", "E", "C", "S"
				, "I", "D", "U", "Q", "T", "X", "+", "F"};
		int[] initonsCount= new int[17]; 
		//for loop 
		//开始计算 路径总数
		//String didInitons= "";
        int count= 0;
		for(int i= 0; i< initons.length; i++) {
			//System.out.println(temp);
			System.out.print(initons[i]);
			initonsCount[i]++;
			recur(initons[i], initonsLink, didInitonsLink, initons, initonsCount
					, count, i);
			//System.out.println(count);
			//下一个
			count= 0;
			System.out.println();
			didInitonsLink.clear();
			initonsCount= new int[17]; 
		}
		// print loop initons
		//打印可能模式
		System.out.println(count);
	}
	//递归 继续修改。等会加 隔开观测。
	public static void recur(String firstChar, Map<String, Boolean> initonsLink
			, Map<String, Boolean> didInitonsLink, String[] initons
			, int[] initonsCount, int count, int i) {
		for(int j= 0; j< initons.length; j++) {
			if(!firstChar.equals(initons[j])) {
				String temp= StableCommon.STRING_EMPTY+ firstChar+ initons[j];
				//有路径                                                                                         
				//没有遍历  //遍历了两次
				if(initonsLink.containsKey(temp)&& !didInitonsLink.containsKey(temp)
						&& initonsCount[j]< 1) {
					initonsCount[j]++;
					didInitonsLink.put(""+ firstChar+ initons[j], true);
					System.out.print(initons[j]);
					recur(initons[j], initonsLink, didInitonsLink, initons
							, initonsCount, count+ 1, j);	
					System.out.println(count);
				}
			}
		}
	}
}