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
//�����¼���ö����ˡ�
public class SkinPathDoubleDetectTrip{
	public static List<Double[]> fileCells;
	public static List<String> fileNames;
	public Map<String, Boolean> afterFirstNames;
	public static void main(String[] argv) throws IOException {
		SkinPathDoubleDetectTrip skinPathDoubleDetectTrip= new SkinPathDoubleDetectTrip();
		skinPathDoubleDetectTrip.afterFirstNames= new HashMap<>();
		//skinPathDoubleDetectTrip.initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		skinPathDoubleDetectTrip.doFirstPDErosion(null);
		skinPathDoubleDetectTrip.doSecondPDErosion(null);
	}
	public void doFirstPDErosion(String[] argv) throws IOException {
		//Ƥ����ͼƬʶ��
		//1 ��ȡһ��ͼƬ
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		String testImagePath
		= "C:\\Users\\Lenovo\\Desktop\\deciphering\\һ����_�����׷�-ɫ��ʧ��֢-ë��ϡ���ɫ�س���.jpg";
		//2 ����ͼƬѵ��ֵ
		int ��ʴŨ��= 5;
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		int ���ط�ֵ= 10; 
		int ���رȾ���= 5; 
		int ���ز��= 8;
		double[] getStatisticCount
		= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 ���
		Double[] score= new Double[fileNames.size()];
		String[] nameScore= new String[fileNames.size()];
		int pcaScale= 25;
		int upcaScale= 15;
		int icaScale= 15;
		int ecaScale= 20;
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		
		
		//
		��ʴŨ��= 95;
		getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		���ط�ֵ= 10; 
		���رȾ���= 8; 
		���ز��= 8;
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		//4 ���
		Double[] score��= new Double[fileNames.size()];
		GetColorRatioScore.scoreDeciphring(score��, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		
		//
		//
		��ʴŨ��= 5;
		getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		���ط�ֵ= 10; 
		���رȾ���= 2; 
		���ز��= 8;
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt");
		//4 ���
		Double[] score_17= new Double[fileNames.size()];
		pcaScale= 1;
		upcaScale= 45;
		icaScale= 1;
		ecaScale= 1;	
		GetColorRatioScore.scoreDeciphring(score_17, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		
		//
		��ʴŨ��= 95;
		getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		���ط�ֵ= 10; 
		���رȾ���= 2;//������5 
		���ز��= 8;
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt");
		//4 ���
		Double[] score_��17= new Double[fileNames.size()];
		pcaScale= 1;
		upcaScale= 45;
		icaScale= 1;
		ecaScale= 1;	
		GetColorRatioScore.scoreDeciphring(score_��17, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		
		
		//�ں�
		for(int i= 0; i< score��.length; i++) {
			//score[i]+= score��[i]+ score_17[i]+ score_��17[i]; 
			score[i]= score[i]* 1+ score��[i]* 0.001+ score_17[i]* 1+ score_��17[i]* 1; 
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
				if(string.contains("�����")) {
					//System.out.println("����ͼƬ:"+ i+ "λ"+ string+ "-----����:"+ scoreDouble[i]);
					afterFirstNames.put(string, true);
				}else{
					if(i< 20) {
						//System.out.println("����ͼƬ:"+ i+ "λ"+ string+ "-----����:"+ scoreDouble[i]);
						afterFirstNames.put(string, true);
					}
				}
			}
			map.remove(scoreDouble[i]);
		//	System.out.println("����ͼƬ:"+ nameScore[i]+ "-----����:"+ scoreInt[i]);
		}
	}

	public void doSecondPDErosion(String[] argv) throws IOException {
		//Ƥ����ͼƬʶ��
		//1 ��ȡһ��ͼƬ
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		String testImagePath
		= "C:\\Users\\Lenovo\\Desktop\\deciphering\\һ����_�����׷�-ɫ��ʧ��֢-ë��ϡ���ɫ�س���.jpg";
		//2 ����ͼƬѵ��ֵ
		int ��ʴŨ��= 5;
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		int ���ط�ֵ= 10; 
		int ���رȾ���= 5; 
		int ���ز��= 8;
		double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 ���
		Double[] score= new Double[fileNames.size()];
		String[] nameScore= new String[fileNames.size()];
		int pcaScale= 25;
		int upcaScale= 15;
		int icaScale= 15;
		int ecaScale= 20;
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		//
		��ʴŨ��= 95;
		getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		���ط�ֵ= 5; 
		���رȾ���= 8; 
		���ز��= 8;
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		//4 ���
		Double[] score��= new Double[fileNames.size()];
		GetColorRatioScore.scoreDeciphring(score��, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		//
		//
		��ʴŨ��= 5;
		getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		���ط�ֵ= 5; 
		���رȾ���= 2; 
		���ز��= 8;
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt");
		//4 ���
		Double[] score_17= new Double[fileNames.size()];
		pcaScale= 1;
		upcaScale= 45;
		icaScale= 1;
		ecaScale= 1;	
		GetColorRatioScore.scoreDeciphring(score_17, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		
		//
		��ʴŨ��= 95;
		getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		���ط�ֵ= 5; 
		���رȾ���= 2;//������5 
		���ز��= 8;
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt");
		//4 ���
		Double[] score_��17= new Double[fileNames.size()];
		pcaScale= 1;
		upcaScale= 45;
		icaScale= 1;
		ecaScale= 1;	
		GetColorRatioScore.scoreDeciphring(score_��17, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		
		
		//�ں�
		for(int i= 0; i< score��.length; i++) {
			//score[i]+= score��[i]+ score_17[i]+ score_��17[i]; 
			score[i]= score[i]* 1+ score��[i]* 1+ score_17[i]* 1+ score_��17[i]* 1; 
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
				if(afterFirstNames.containsKey(string)) {
					System.out.println("����ͼƬ:"+ i+ "λ"+ string+ "-----����:"+ scoreDouble[i]);
				}				
			}
			map.remove(scoreDouble[i]);
		//	System.out.println("����ͼƬ:"+ nameScore[i]+ "-----����:"+ scoreInt[i]);
		}
	}
	
	private static void initDeciphring(String string) throws NumberFormatException, IOException {
		fileNames= new ArrayList<>();
		fileCells= new ArrayList<>();
		String ctempString;
		InputStream inputStream= new FileInputStream(string);
		BufferedReader cReader= new BufferedReader(new InputStreamReader(inputStream, "GBK"));
		while ((ctempString= cReader.readLine())!= null) {  
			String[] lineCell= ctempString.split(">d>");
			if(lineCell.length> 1) {
				fileNames.add(lineCell[0]);
				Double[] lineDouble= new Double[lineCell.length- 1]; 
				for(int i= 0; i< lineDouble.length; i++) {
					lineDouble[i]= Double.valueOf(lineCell[i+ 1]);
				}
				fileCells.add(lineDouble);
			}
		}
		cReader.close();
	}
}