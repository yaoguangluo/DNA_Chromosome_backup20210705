package ISQ.VSU.feature;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import ESU.sort.Quick9DLYGWithString_ESU;
import PEU.P.image.ReadWritePng;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//����˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV. ����ͷ
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ, ������Դ��ͬ��GPL2.0��Դ.
//
public class SkinPathDetectString{
	public static List<Double[]> fileCells;
	public static List<String> fileNames;
	public static void main(String[] argv) throws IOException {
		//Ƥ����ͼƬʶ��
		//1 ��ȡһ��ͼƬ
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		String testImagePath= "D:\\bu20210606\\����ͼƬ\\����ͼƬ\\pgSearch\\Ƥ���Բ�ѧ\\���鲡-Ѱ���Ǵ�.jpg";
		//2 ����ͼƬѵ��ֵ
		int ��ʴŨ��= 95;
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH(getSkinBy, ��ʴŨ��);
		new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		int ���ط�ֵ= 10; 
		int ���رȾ���= 8; 
		int ���ز��= 8;
		double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		//���getStatisticCount�ط������Ż�Ϊ ����˻��������,����̫�����ɫ�����Զ�������Ϊ�޳�, ���ֵĺ�ɫ, һЩͼƬ�ĺ�ɫ.
		//�޳���Ҳ������Сֵ�޳�, �� һЩɢ��Ļ�ɫ(��˹��), ����������ԭͬλɫ�� ��ɫ, ͼƬ��ɫ��.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		//4 ���
		Double[] score= new Double[fileNames.size()];
		String[] nameScore= new String[fileNames.size()];
		int pcaScale= 25;
		int upcaScale= 15;
		int icaScale= 15;
		int ecaScale= 20;
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells, fileNames
				, pcaScale, upcaScale, icaScale, ecaScale);
		//5 ɸѡ
		int[] scoreDouble= new int[score.length];
		for(int i= 0; i< scoreDouble.length; i++) {
			scoreDouble[i]= (int)(score[i]* 10000);//
		}
		//�ĳ�map
//		Map<Double, Map<String, Boolean>> map= Double_ESU.getMapFromDoubleStringArray(score, nameScore);	
//		int �ݹ����= 70; //����ֵͬ�����ڴ�߷�
//		int ��ջ���= 7; //�����ջ�˷Ѽ���߷�
		//new LYG9DWithDoubleTopSort4D().sort(scoreDouble, ��ջ���, �ݹ����);
		new Quick9DLYGWithString_ESU().sort(scoreDouble, nameScore);
		
		//6 �Ƽ�
		for(int i= 0; i< scoreDouble.length; i++) {
			if(nameScore[i].contains("��")) {
				System.out.println("����ͼƬ:"+ nameScore[i]+ "-----����:"+ scoreDouble[i]);
			}
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