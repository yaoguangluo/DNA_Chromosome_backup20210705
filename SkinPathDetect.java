package ISQ.VSU.feature;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ESU.sort.Quick9DLYGWithString_ESU;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV. 像素头
//因为肽展公式和思想GPL2.0开源, 本程序源码同样GPL2.0开源.
//
public class SkinPathDetect{
	public static List<Double[]> fileCells;
	public static List<String> fileNames;
	public static void main(String[] argv) throws IOException {
		//皮肤病图片识别
		//1 读取一张图片
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		String testImagePath= "D:\\bu20210606\\搜索图片\\搜索图片\\pgSearch\\皮肤性病学\\laugier-hunziker综合征.jpg";
		//2 计算图片训练值
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin(getSkinBy, 95);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg", doPDEofSkin);
		double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 10);
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//3 遍历疾病数据表.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.txt");
		//4 打分
		Double[] score= new Double[fileNames.size()];
		String[] nameScore= new String[fileNames.size()];
		scoreDeiphring(score, nameScore, getStatisticRatio);
		//5 筛选
		int[] scoreInt= new int[score.length];
		for(int i= 0; i< scoreInt.length; i++) {
			scoreInt[i]= (int)(score[i]* 10000);//
		}
		new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
		//6 推荐
		for(int i= 0; i< nameScore.length; i++) {
			if(nameScore[i].contains("laugier-hunziker综合征")) {
				System.out.println("相似图片:"+ nameScore[i]+ "-----分数:"+ scoreInt[i]);
			}
		//	System.out.println("相似图片:"+ nameScore[i]+ "-----分数:"+ scoreInt[i]);
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
			int sum= 0;
			for(int i= 0; i< getStatisticRatio.length; i++) {
				try {
//					if(0== Doubles[i]|| 0== getStatisticRatio[i]) {
//						sum++;
//						score[lineCount]+= 0;
//					}else {
//						score[lineCount]+= getStatisticRatio[i]* 10000/ Doubles[i];
//					}
					
					if(0== Doubles[i]|| 0== getStatisticRatio[i]) {
						sum++;
						score[lineCount]+= 0;
					}else {
						Double ratio= (getStatisticRatio[i]* 10000)/ Doubles[i];
						score[lineCount]+= ratio;
					}
					
				}catch(Exception e) {
					System.out.println(Doubles[i]);
					score[lineCount]+= 0;
				}
			}
			score[lineCount]= Math.abs(score[lineCount]- 24+ sum);//nor 均值进行了优化 20210714
			lineCount++;
		}
		//  -24+ 处理 近似值 1
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