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
		String testImagePath= "D:\\bu20210606\\搜索图片\\搜索图片\\pgSearch\\皮肤性病学\\阿洪病-寻常狼疮.jpg";
		//2 计算图片训练值
		int 腐蚀浓度= 95;
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin(getSkinBy, 腐蚀浓度);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg", doPDEofSkin);
		int 像素阀值= 10; 
		int 像素比精度= 8; 
		int 像素差精度= 10;
		double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 像素阀值, 像素比精度, 像素差精度);
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//3 遍历疾病数据表.
		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB3.txt");
		//4 打分
		Double[] score= new Double[fileNames.size()];
		String[] nameScore= new String[fileNames.size()];
		scoreDeiphring(score, nameScore, getStatisticRatio);
		//5 筛选
		double[] scoreDouble= new double[score.length];
		for(int i= 0; i< scoreDouble.length; i++) {
			scoreDouble[i]= score[i];//
		}
		//改成map
		Map<Double, Map<String, Boolean>> map= new HashMap<>();
		for(int i= 0; i< score.length; i++) {
			Map<String, Boolean> maps;
			if(map.containsKey(score[i])) {
				maps= map.get(score[i]);
			}else {
				maps= new HashMap<>();
			}
			if(nameScore[i].contains("狼")) {
				System.out.println("输入图片:"+ i+ "位"+ nameScore[i]+ "-----分数:"+ score[i]);
			}
			maps.put(nameScore[i].toString(), true);
			map.put(score[i], maps);
		}
		
		new LYG9DWithDoubleTopSort1D().sort(scoreDouble, 8, 10);
		//new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
		
		//6 推荐
		for(int i= 0; i< scoreDouble.length; i++) {
			Iterator<String> iterator= map.get(scoreDouble[i]).keySet().iterator();
			while(iterator.hasNext()) {
				String string= iterator.next();
				if(string.contains("狼")) {
					System.out.println("相似图片:"+ i+ "位"+ string+ "-----分数:"+ scoreDouble[i]);
				}
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
			score[lineCount]= score[lineCount]/ 24;//nor 均值进行了优化 20210714
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