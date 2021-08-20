package ISQ.VSU.feature;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ESU.array.Double_ESU;
import ESU.image.ToolkitImageToBufferImage;
import ME.APM.VSQ.App;
import OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710 , ���� 17Ԫ�ḯʴ 20210821
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV. ����ͷ
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ, ������Դ��ͬ��GPL2.0��Դ.
//
public class SkinPathDetectTrip_E{
	public static List<Double[]> fileCells_5;
	public static List<String> fileNames_5;
	public static List<Double[]> fileCells_6;
	public static List<String> fileNames_6;
	public static List<Double[]> fileCells_17;
	public static List<String> fileNames_17;
	public static List<Double[]> fileCells_suan_17;
	public static List<String> fileNames_suan_17;

	public static void doTestWithFilePath(String testImagePath) throws IOException {
		//Ƥ����ͼƬʶ��
		//1 ��ȡһ��ͼƬ
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\��ɢ�Ի���_������.jpg";
		//2 ����ͼƬѵ��ֵ
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doInnerTest(getSkinBy);
	}

	public static List<String> doTestWithImageAPP(App u) throws IOException {
		BufferedImage BufferedImage= new ToolkitImageToBufferImage().toolkitImageToBufferImageAboutIconConfig(u.monitor.img, 0, 0);
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(BufferedImage);
		return doInnerTest(getSkinBy, u);
	}

	public static List<String> doTestWithImage(Image testImagePath) throws IOException {
		//Ƥ����ͼƬʶ��
		//1 ��ȡһ��ͼƬ
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\��ɢ�Ի���_������.jpg";
		//2 ����ͼƬѵ��ֵ
		BufferedImage BufferedImage= new ToolkitImageToBufferImage().toolkitImageToBufferImageAboutIconConfig(testImagePath, 0, 0);
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(BufferedImage);
		return doInnerTest(getSkinBy);
	}
	
	public static void doTestWithBufferedImage(BufferedImage testImagePath) throws IOException {
		//Ƥ����ͼƬʶ��
		//1 ��ȡһ��ͼƬ
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\��ɢ�Ի���_������.jpg";
		//2 ����ͼƬѵ��ֵ
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doInnerTest(getSkinBy);
	}


	private static List<String> doInnerTest(int[][][] getSkinBy, App u) throws IOException {
		int ��ʴŨ��= Integer.valueOf(u.fourInitonSuanFuTxt);
		// TODO Auto-generated method stub
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		int ���ط�ֵ= Integer.valueOf(u.fourInitonSuanFaTxt);
		int ���رȾ���= Integer.valueOf(u.fourInitonSuanBiTxt); 
		int ���ز��= Integer.valueOf(u.fourInitonSuanJingTxt);
		int pcaScale= Integer.valueOf(u.fourInitonSuanPCATxt);
		int upcaScale= Integer.valueOf(u.fourInitonSuanUPCATxt);
		int icaScale= Integer.valueOf(u.fourInitonSuanICATxt);
		int ecaScale= Integer.valueOf(u.fourInitonSuanECATxt);
		double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 ���
		Double[] score= new Double[fileNames_6.size()];
		String[] nameScore= new String[fileNames_6.size()];
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_6, fileNames_6
				, pcaScale, upcaScale, icaScale, ecaScale);

		//
		��ʴŨ��= Integer.valueOf(u.fourInitonJianFuTxt);
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		���ط�ֵ= Integer.valueOf(u.fourInitonJianFaTxt);
		���رȾ���= Integer.valueOf(u.fourInitonJianBiTxt);
		���ز��= Integer.valueOf(u.fourInitonJianJingTxt);
		pcaScale= Integer.valueOf(u.fourInitonJianPCATxt);
		upcaScale= Integer.valueOf(u.fourInitonJianUPCATxt);
		icaScale= Integer.valueOf(u.fourInitonJianICATxt);
		ecaScale= Integer.valueOf(u.fourInitonJianECATxt);
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		//4 ���
		Double[] score��= new Double[fileNames_5.size()];
		GetColorRatioScore.scoreDeciphring(score��, nameScore, getStatisticRatio, fileCells_5, fileNames_5
				, pcaScale, upcaScale, icaScale, ecaScale);
		//
		//
		��ʴŨ��= Integer.valueOf(u.sixteenInitonJianBiTxt);
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		���ط�ֵ= Integer.valueOf(u.sixteenInitonJianFaTxt);
		���رȾ���= Integer.valueOf(u.sixteenInitonJianBiTxt); 
		���ز��= Integer.valueOf(u.sixteenInitonJianJingTxt);
		pcaScale= Integer.valueOf(u.sixteenInitonJianPCATxt);
		upcaScale= Integer.valueOf(u.sixteenInitonJianUPCATxt);
		icaScale= Integer.valueOf(u.sixteenInitonJianICATxt);
		ecaScale= Integer.valueOf(u.sixteenInitonJianECATxt);
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt");
		//4 ���
		Double[] score_17= new Double[fileNames_17.size()];
		GetColorRatioScore.scoreDeciphring(score_17, nameScore, getStatisticRatio, fileCells_17, fileNames_17
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		//suan 17
		
		��ʴŨ��= Integer.valueOf(u.sixteenInitonSuanBiTxt);
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		���ط�ֵ= Integer.valueOf(u.sixteenInitonSuanFaTxt);
		���رȾ���= Integer.valueOf(u.sixteenInitonSuanBiTxt); 
		���ز��= Integer.valueOf(u.sixteenInitonSuanJingTxt);
		pcaScale= Integer.valueOf(u.sixteenInitonSuanPCATxt);
		upcaScale= Integer.valueOf(u.sixteenInitonSuanUPCATxt);
		icaScale= Integer.valueOf(u.sixteenInitonSuanICATxt);
		ecaScale= Integer.valueOf(u.sixteenInitonSuanECATxt);
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt");
		//4 ���
		Double[] score_suan_17= new Double[fileNames_suan_17.size()];
		GetColorRatioScore.scoreDeciphring(score_suan_17, nameScore, getStatisticRatio, fileCells_suan_17, fileNames_suan_17
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		//�ں�
		for(int i= 0; i< score��.length; i++) {
			score[i]+= score��[i]* 0.001+ score_17[i]+ score_suan_17[i]; 
			//System.out.println(score_suan_17[i]);
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
		 List<String> output= new ArrayList<>();
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
					if(i< 50) {
						output.add("����ͼƬ:"+ i+ "λ"+ string+ ">-----����:"+ scoreDouble[i]);
					}
					if(string.contains("̦޺")) {
						output.add("#################################����ͼƬ:"+ i+ "λ"+ string+ ">-----����:"+ scoreDouble[i]);
					}
					//System.out.println("����ͼƬ:"+ i+ "λ"+ string+ ">-----����:"+ scoreDouble[i]);
				}
				map.remove(scoreDouble[i]);
				//	System.out.println("����ͼƬ:"+ nameScore[i]+ "-----����:"+ scoreInt[i]);
			}
		//�������
		
		//
		return output;
	}
	
	
	private static List<String> doInnerTest(int[][][] getSkinBy) throws IOException {
		int ��ʴŨ��= 5;
		// TODO Auto-generated method stub
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
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 ���
		Double[] score= new Double[fileNames_6.size()];
		String[] nameScore= new String[fileNames_6.size()];
		int pcaScale= 25;
		int upcaScale= 15;
		int icaScale= 15;
		int ecaScale= 20;
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_6, fileNames_6
				, pcaScale, upcaScale, icaScale, ecaScale);

		//
		��ʴŨ��= 95;
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
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
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		//4 ���
		Double[] score��= new Double[fileNames_5.size()];
		GetColorRatioScore.scoreDeciphring(score��, nameScore, getStatisticRatio, fileCells_5, fileNames_5
				, pcaScale, upcaScale, icaScale, ecaScale);
		//
		//
		��ʴŨ��= 95;
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH(getSkinBy, ��ʴŨ��);
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
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt");
		//4 ���
		Double[] score_17= new Double[fileNames_17.size()];
		pcaScale= 1;
		upcaScale= 45;
		icaScale= 1;
		ecaScale= 1;	
		GetColorRatioScore.scoreDeciphring(score_17, nameScore, getStatisticRatio, fileCells_17, fileNames_17
				, pcaScale, upcaScale, icaScale, ecaScale);
		//�ں�
		for(int i= 0; i< score��.length; i++) {
			score[i]+= score��[i]+ score_17[i]; 
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
		 List<String> output= new ArrayList<>();
		//6 �Ƽ�
		Here:
			for(int i= 0; i< 20; i++) {
				if(!map.containsKey(scoreDouble[i])) {
					i++;
					continue Here;
				}
				Iterator<String> iterator= map.get(scoreDouble[i]).keySet().iterator();
				while(iterator.hasNext()) {
					String string= iterator.next();
					output.add("����ͼƬ:"+ i+ "λ"+ string+ ">-----����:"+ scoreDouble[i]);
					//System.out.println("����ͼƬ:"+ i+ "λ"+ string+ ">-----����:"+ scoreDouble[i]);
				}
				map.remove(scoreDouble[i]);
				//	System.out.println("����ͼƬ:"+ nameScore[i]+ "-----����:"+ scoreInt[i]);
			}
		//�������
		
		//
		return output;
	}

	public static void initDeciphring(String string, int type) throws NumberFormatException, IOException {
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

	public static void main(String[] argv) throws NumberFormatException, IOException {
		//init
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt", 5);
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt", 6);
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt", 17);
		doTestWithFilePath("C:\\Users\\Lenovo\\Desktop\\deciphering\\��ɢ�Ի���_������.jpg");
		//	
	}
}