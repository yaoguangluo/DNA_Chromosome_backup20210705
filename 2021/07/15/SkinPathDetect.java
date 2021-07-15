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
import OEU.LYG4DQS4D.LYG9DWithDoubleTopSort1D;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV. ����ͷ
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ, ������Դ��ͬ��GPL2.0��Դ.
//
public class SkinPathDetect{
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
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin(getSkinBy, ��ʴŨ��);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg", doPDEofSkin);
		int ���ط�ֵ= 10; 
		int ���رȾ���= 8; 
		int ���ز��= 10;
		double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, ���ط�ֵ, ���رȾ���, ���ز��);
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//3 �����������ݱ�.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB3.txt");
		//4 ���
		Double[] score= new Double[fileNames.size()];
		String[] nameScore= new String[fileNames.size()];
		scoreDeiphring(score, nameScore, getStatisticRatio);
		//5 ɸѡ
		double[] scoreDouble= new double[score.length];
		for(int i= 0; i< scoreDouble.length; i++) {
			scoreDouble[i]= score[i];//
		}
		//�ĳ�map
		Map<Double, Map<String, Boolean>> map= new HashMap<>();
		for(int i= 0; i< score.length; i++) {
			Map<String, Boolean> maps;
			if(map.containsKey(score[i])) {
				maps= map.get(score[i]);
			}else {
				maps= new HashMap<>();
			}
			if(nameScore[i].contains("��")) {
				System.out.println("����ͼƬ:"+ i+ "λ"+ nameScore[i]+ "-----����:"+ score[i]);
			}
			maps.put(nameScore[i].toString(), true);
			map.put(score[i], maps);
		}
		
		new LYG9DWithDoubleTopSort1D().sort(scoreDouble, 8, 10);
		//new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
		
		//6 �Ƽ�
		for(int i= 0; i< scoreDouble.length; i++) {
			Iterator<String> iterator= map.get(scoreDouble[i]).keySet().iterator();
			while(iterator.hasNext()) {
				String string= iterator.next();
				if(string.contains("��")) {
					System.out.println("����ͼƬ:"+ i+ "λ"+ string+ "-----����:"+ scoreDouble[i]);
				}
			}
		//	System.out.println("����ͼƬ:"+ nameScore[i]+ "-----����:"+ scoreInt[i]);
		}
	}

	private static void scoreDeiphring(Double[] score, String[] nameScore, double[] getStatisticRatio) {
		int lineCount= 0;
		Iterator<Double[]> iteratorCells= fileCells.iterator();
		Iterator<String> iteratorNames= fileNames.iterator();
		while(iteratorNames.hasNext()) {
			String name= iteratorNames.next();
			nameScore[lineCount++]= name.toString();
		}
		lineCount= 0;
		while(iteratorCells.hasNext()) {
			Double[] Doubles= iteratorCells.next();
			score[lineCount]= new Double(0);
			for(int i= 0; i< getStatisticRatio.length; i++) {
				try {
					if(0== Doubles[i]|| 0== getStatisticRatio[i]) {
						score[lineCount]+= 10000;
					}else {
						Double ratio= (getStatisticRatio[i]* 10000)/ Doubles[i];
						if(ratio>2||ratio<0.5) {
							score[lineCount]+= 10000;
						}else {
							score[lineCount]+= ratio;	
						}
					}
					
				}catch(Exception e) {
					System.out.println(Doubles[i]);
					score[lineCount]+= 0;
				}
			}
			score[lineCount]= score[lineCount]/ 24;//nor ��ֵ�������Ż� 20210714
			lineCount++;
		}
		//  -24+ ���� ����ֵ 1
//		for(int i= 0; i< score.length; i++) {
//			score[i]= Math.abs(score[i]);
//		}
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