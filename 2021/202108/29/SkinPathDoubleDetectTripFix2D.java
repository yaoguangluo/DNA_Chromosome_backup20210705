package ISQ.VSU.feature;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ESU.array.Double_ESU;
import OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV. ����ͷ
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ, ������Դ��ͬ��GPL2.0��Դ.
//���θ�ʴԪ����չ���� δ�Ż��� ������ 20210827 �����׷� �Ѿ��Ǵδ� �ŷ�ǰ3.
//������ 20210829 �Ѻ���ģ�黯�� for loop ����ͳ�Ʋ��� ɸѡ��
//�����¼���ö����ˡ�
public class SkinPathDoubleDetectTripFix2D{
	public List<Double[]> fileCells_5;
	public List<String> fileNames_5;
	public List<Double[]> fileCells_6;
	public List<String> fileNames_6;
	public List<Double[]> fileCells_17;
	public List<String> fileNames_17;
	public List<Double[]> fileCells_suan_17;
	public List<String> fileNames_suan_17;
	public Map<String, Integer> afterFirstNames;
	public String testImagePath;
	public String[] nameScore;
	public static void main(String[] argv) throws IOException {
		SkinPathDoubleDetectTripFix2D skinPathDoubleDetectTrip= new SkinPathDoubleDetectTripFix2D();
		skinPathDoubleDetectTrip.afterFirstNames= new HashMap<>();
		skinPathDoubleDetectTrip.initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt", 6);
		skinPathDoubleDetectTrip.initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt", 5);
		skinPathDoubleDetectTrip.initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt", 17);
		skinPathDoubleDetectTrip.initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt", 18);
		skinPathDoubleDetectTrip.testImagePath
		= "C:\\Users\\Lenovo\\Desktop\\deciphering\\��״̦޺-�����Ӳ��֢Ҷ״�װ�_������.jpg";
		//= "C:\\Users\\Lenovo\\Desktop\\deciphering\\��ɢ�Ի���_������.jpg";
		//= "C:\\Users\\Lenovo\\Desktop\\deciphering\\������_�����׷�-ɫ��ʧ��֢-ë��ϡ���ɫ�س���.jpg";	
		int[][] score= new int[][] {
			{ 5,  10, 5, 8, 25, 15, 15, 20}
			,{95, 5, 8, 8, 25, 15, 15, 20}
			,{5,  5, 2, 8, 1, 45, 1, 1}
			,{95, 5, 2, 8, 1, 45, 1, 1}
		};
		//��һ�ε���
		for(int i= 0; i< 10; i++) {
			skinPathDoubleDetectTrip.doFirstPDErosionWithTop(1, 1, 1, 1, score, 30);	//����ǰ50��
		}
		//����дmask
		//ɸѡ
		//�ڶ���ɸѡ,û�г���3�ε�һ�ɹ���;
		skinPathDoubleDetectTrip.doSecondPDErosionWithTop(1 , 1, 1, 1, score, 50, 4);	//����ɸѡ ǰ50 ����50%���С�
		//����дmask
		//ϸ׼�� ��ɸѡ ����5
		skinPathDoubleDetectTrip.doThirdPDErosionWithTop(1, 1, 1, 1, score, 500, 4);    //ǰ500�� ����ɸѡ����50%���С�
	}

	public Double[] doFourJianPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale) throws IOException {
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		double[] getStatisticCount
		= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 ���
		Double[] score= new Double[fileNames_6.size()];
		nameScore= new String[fileNames_6.size()];
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_6, fileNames_6
				, pcaScale, upcaScale, icaScale, ecaScale);
		return score;
	}

	public Double[] doFourSuanPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale) throws IOException {
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		double[] getStatisticCount
		= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 ���
		Double[] score= new Double[fileNames_5.size()];
		nameScore= new String[fileNames_5.size()];
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_5, fileNames_5
				, pcaScale, upcaScale, icaScale, ecaScale);
		return score;
	}

	public Double[] doEightSuanPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale) throws IOException {
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		double[] getStatisticCount
		= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 ���
		Double[] score= new Double[fileNames_suan_17.size()];
		nameScore= new String[fileNames_suan_17.size()];
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_suan_17
				, fileNames_suan_17, pcaScale, upcaScale, icaScale, ecaScale);
		return score;
	}

	public Double[] doEightJianPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale) throws IOException {
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		double[] getStatisticCount
		= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 ���
		Double[] score= new Double[fileNames_17.size()];
		nameScore= new String[fileNames_17.size()];
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_17, fileNames_17
				, pcaScale, upcaScale, icaScale, ecaScale);
		return score;
	}
	public void doFirstPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan, int[][] scoreMatrix, int top)
			throws IOException {
		Double[] score= doFourJianPDErosion(scoreMatrix[0][0], scoreMatrix[0][1], scoreMatrix[0][2], scoreMatrix[0][3]
				, scoreMatrix[0][4], scoreMatrix[0][5], scoreMatrix[0][6], scoreMatrix[0][7]);
		Double[] score��= doFourSuanPDErosion(scoreMatrix[1][0], scoreMatrix[1][1], scoreMatrix[1][2], scoreMatrix[1][3]
				, scoreMatrix[1][4], scoreMatrix[1][5], scoreMatrix[1][6], scoreMatrix[1][7]);
		Double[] score_17= doEightJianPDErosion(scoreMatrix[2][0], scoreMatrix[2][1], scoreMatrix[2][2], scoreMatrix[2][3]
				, scoreMatrix[2][4], scoreMatrix[2][5], scoreMatrix[2][6], scoreMatrix[2][7]);
		Double[] score_��17= doEightSuanPDErosion(scoreMatrix[3][0], scoreMatrix[3][1], scoreMatrix[3][2], scoreMatrix[3][3]
				, scoreMatrix[3][4], scoreMatrix[3][5], scoreMatrix[3][6], scoreMatrix[3][7]);
		//�ں�
		for(int i= 0; i< score��.length; i++) {
			score[i]= score[i]* fourJian+ score��[i]* fourSuan+ score_17[i]* eightJian+ score_��17[i]* eightSuan; 
		}
		//5 ɸѡ
		double[] scoreDouble= new double[score.length];
		for(int i= 0; i< scoreDouble.length; i++) {
			scoreDouble[i]= score[i];//
		}
		//�ĳ�map
		Map<Double, Map<String, Boolean>> map= Double_ESU.getMapFromDoubleStringArray(score, nameScore);	
		int �ݹ����= 70; //����ֵͬ�����ڴ�߷�
		int ��ջ���= 7; //�����ջ�˷Ѽ���߷�
		new LYG9DWithDoubleTopSort4D().sort(scoreDouble, ��ջ���, �ݹ����);
		//new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
		//6 �Ƽ�
		Here:
			for(int i= 0; i< scoreDouble.length; i++) {
				if(!map.containsKey(scoreDouble[i])) {
					i++;
					continue Here;
				}
				Iterator<String> iterator= map.get(scoreDouble[i]).keySet().iterator();
				while(iterator.hasNext()) {
					String string= iterator.next();
					if(i< top) {//ɸѡ
						if(!afterFirstNames.containsKey(string)) {
							afterFirstNames.put(string, 1);
						}else {
							afterFirstNames.put(string, afterFirstNames.get(string)+ 1);//���
						}
					}
					double scoreRank= (null== afterFirstNames.get(string)? 0: afterFirstNames.get(string))* i;
					if(string.contains("�����Ӳ��֢Ҷ״�װ�")||string.contains("����")||string.contains("����")) {
						System.out.println(scoreRank+"--"+afterFirstNames.get(string)+ "����ͼƬ:"+ i+ "λ"+ string+ "--����:"+ scoreDouble[i]);
					}
				}
				map.remove(scoreDouble[i]);
			}
	}

	public void doSecondPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times)
			throws IOException {
		Double[] score= doFourJianPDErosion(scoreMatrix[0][0], scoreMatrix[0][1], scoreMatrix[0][2], scoreMatrix[0][3]
				, scoreMatrix[0][4], scoreMatrix[0][5], scoreMatrix[0][6], scoreMatrix[0][7]);
		Double[] score��= doFourSuanPDErosion(scoreMatrix[1][0], scoreMatrix[1][1], scoreMatrix[1][2], scoreMatrix[1][3]
				, scoreMatrix[1][4], scoreMatrix[1][5], scoreMatrix[1][6], scoreMatrix[1][7]);
		Double[] score_17= doEightJianPDErosion(scoreMatrix[2][0], scoreMatrix[2][1], scoreMatrix[2][2], scoreMatrix[2][3]
				, scoreMatrix[2][4], scoreMatrix[2][5], scoreMatrix[2][6], scoreMatrix[2][7]);
		Double[] score_��17= doEightSuanPDErosion(scoreMatrix[3][0], scoreMatrix[3][1], scoreMatrix[3][2], scoreMatrix[3][3]
				, scoreMatrix[3][4], scoreMatrix[3][5], scoreMatrix[3][6], scoreMatrix[3][7]);
		//�ں�
		for(int i= 0; i< score��.length; i++) {
			score[i]= score[i]* fourJian+ score��[i]* fourSuan+ score_17[i]* eightJian+ score_��17[i]* eightSuan; 
		}
		//5 ɸѡ
		double[] scoreDouble= new double[score.length];
		for(int i= 0; i< scoreDouble.length; i++) {
			scoreDouble[i]= score[i];//
		}
		//�ĳ�map
		Map<Double, Map<String, Boolean>> map= Double_ESU.getMapFromDoubleStringArray(score, nameScore);	
		int �ݹ����= 70; //����ֵͬ�����ڴ�߷�
		int ��ջ���= 7; //�����ջ�˷Ѽ���߷�
		new LYG9DWithDoubleTopSort4D().sort(scoreDouble, ��ջ���, �ݹ����);
		//new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
		//6 �Ƽ�
		Here:
			for(int i= 0; i< scoreDouble.length; i++) {
				if(!map.containsKey(scoreDouble[i])) {
					i++;
					continue Here;
				}
				Iterator<String> iterator= map.get(scoreDouble[i]).keySet().iterator();
				while(iterator.hasNext()) {
					String string= iterator.next();
					if(i< top) {
						//ɸѡ 
						if(!afterFirstNames.containsKey(string)) {
							afterFirstNames.put(string, 0);
						}else {
							if(afterFirstNames.get(string)> times) {
								afterFirstNames.put(string, afterFirstNames.get(string)+ 1);//�����ĴβŴ��
							}
						}
						double scoreRank= (null== afterFirstNames.get(string)? 0: afterFirstNames.get(string));
						if(string.contains("�����Ӳ��֢Ҷ״�װ�")||string.contains("����")||string.contains("����")) {
							System.out.println(">>>>"+scoreRank+"--"+afterFirstNames.get(string)+ "����ͼƬ:"+ i+ "λ"
									+ string+ "--����:"+ scoreDouble[i]);
						}	
					}
				}
				map.remove(scoreDouble[i]);
				//	System.out.println("����ͼƬ:"+ nameScore[i]+ "-----����:"+ scoreInt[i]);
			}
	}

	public void doThirdPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan, int[][] scoreMatrix, int top, int times)
			throws IOException {
		Double[] score= doFourJianPDErosion(scoreMatrix[0][0], scoreMatrix[0][1], scoreMatrix[0][2], scoreMatrix[0][3]
				, scoreMatrix[0][4], scoreMatrix[0][5], scoreMatrix[0][6], scoreMatrix[0][7]);
		Double[] score��= doFourSuanPDErosion(scoreMatrix[1][0], scoreMatrix[1][1], scoreMatrix[1][2], scoreMatrix[1][3]
				, scoreMatrix[1][4], scoreMatrix[1][5], scoreMatrix[1][6], scoreMatrix[1][7]);
		Double[] score_17= doEightJianPDErosion(scoreMatrix[2][0], scoreMatrix[2][1], scoreMatrix[2][2], scoreMatrix[2][3]
				, scoreMatrix[2][4], scoreMatrix[2][5], scoreMatrix[2][6], scoreMatrix[2][7]);
		Double[] score_��17= doEightSuanPDErosion(scoreMatrix[3][0], scoreMatrix[3][1], scoreMatrix[3][2], scoreMatrix[3][3]
				, scoreMatrix[3][4], scoreMatrix[3][5], scoreMatrix[3][6], scoreMatrix[3][7]);
		//�ں�
		for(int i= 0; i< score��.length; i++) {
			score[i]= score[i]* fourJian+ score��[i]* fourSuan+ score_17[i]* eightJian+ score_��17[i]* eightSuan; 
		}
		//5 ɸѡ
		double[] scoreDouble= new double[score.length];
		for(int i= 0; i< scoreDouble.length; i++) {
			scoreDouble[i]= score[i];//
		}
		//�ĳ�map
		Map<Double, Map<String, Boolean>> map= Double_ESU.getMapFromDoubleStringArray(score, nameScore);	
		int �ݹ����= 70; //����ֵͬ�����ڴ�߷�
		int ��ջ���= 7; //�����ջ�˷Ѽ���߷�
		new LYG9DWithDoubleTopSort4D().sort(scoreDouble, ��ջ���, �ݹ����);
		//new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
		//6 �Ƽ�
		Here:
			for(int i= 0; i< scoreDouble.length; i++) {
				if(!map.containsKey(scoreDouble[i])) {
					i++;
					continue Here;
				}
				Iterator<String> iterator= map.get(scoreDouble[i]).keySet().iterator();
				while(iterator.hasNext()) {
					String string= iterator.next();
					if(i< top) {
						if(afterFirstNames.containsKey(string)) {
							double scoreRank= (null== afterFirstNames.get(string)? 0: afterFirstNames.get(string));
							if(scoreRank> times) {//mask
								System.out.println(scoreRank+"--"+afterFirstNames.get(string)+ "����ͼƬ:"+ i+ "λ"+ string+ "--����:"+ scoreDouble[i]+"---"+scoreDouble[i]/scoreRank);
							}
						}	
					}
					double scoreRank= (null== afterFirstNames.get(string)? 0: afterFirstNames.get(string));
					if(string.contains("�����Ӳ��֢Ҷ״�װ�")||string.contains("����")||string.contains("����")) {
						System.out.println(">>>>"+scoreRank+"--"+afterFirstNames.get(string)+ "����ͼƬ:"+ i+ "λ"+ string+ "--����:"+ scoreDouble[i]);
					}
				}
				map.remove(scoreDouble[i]);
			}
	}

	public void initDeciphring(String string, int type) throws NumberFormatException, IOException {
		if(5== type) {
			fileNames_5= new ArrayList<>();
			fileCells_5= new ArrayList<>();
		}
		if(6== type) {
			fileNames_6= new ArrayList<>();
			fileCells_6= new ArrayList<>();
		}
		if(17== type) {
			fileNames_17= new ArrayList<>();
			fileCells_17= new ArrayList<>();
		}
		if(18== type) {
			fileNames_suan_17= new ArrayList<>();
			fileCells_suan_17= new ArrayList<>();
		}

		String ctempString;
		InputStream inputStream= new FileInputStream(string);
		BufferedReader cReader= new BufferedReader(new InputStreamReader(inputStream, "GBK"));
		while ((ctempString= cReader.readLine())!= null) {  
			String[] lineCell= ctempString.split(">d>");
			if(lineCell.length> 1) {
				if(5== type) {
					fileNames_5.add(lineCell[0]);
				}
				if(6== type) {
					fileNames_6.add(lineCell[0]);
				}
				if(17== type) {
					fileNames_17.add(lineCell[0]);
				}
				if(18== type) {
					fileNames_suan_17.add(lineCell[0]);
				}
				Double[] lineDouble= new Double[lineCell.length- 1]; 
				for(int i= 0; i< lineDouble.length; i++) {
					lineDouble[i]= Double.valueOf(lineCell[i+ 1]);
				}
				if(5== type) {
					fileCells_5.add(lineDouble);
				}
				if(6== type) {
					fileCells_6.add(lineDouble);
				}
				if(17== type) {
					fileCells_17.add(lineDouble);
				}
				if(18== type) {
					fileCells_suan_17.add(lineDouble);
				}
			}
		}
		cReader.close();
	}
}