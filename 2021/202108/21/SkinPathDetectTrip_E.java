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

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710 , 新增 17元酸腐蚀 20210821
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV. 像素头
//因为肽展公式和思想GPL2.0开源, 本程序源码同样GPL2.0开源.
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
		//皮肤病图片识别
		//1 读取一张图片
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\播散性黄瘤_脏数据.jpg";
		//2 计算图片训练值
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doInnerTest(getSkinBy);
	}

	public static List<String> doTestWithImageAPP(App u) throws IOException {
		BufferedImage BufferedImage= new ToolkitImageToBufferImage().toolkitImageToBufferImageAboutIconConfig(u.monitor.img, 0, 0);
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(BufferedImage);
		return doInnerTest(getSkinBy, u);
	}

	public static List<String> doTestWithImage(Image testImagePath) throws IOException {
		//皮肤病图片识别
		//1 读取一张图片
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\播散性黄瘤_脏数据.jpg";
		//2 计算图片训练值
		BufferedImage BufferedImage= new ToolkitImageToBufferImage().toolkitImageToBufferImageAboutIconConfig(testImagePath, 0, 0);
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(BufferedImage);
		return doInnerTest(getSkinBy);
	}
	
	public static void doTestWithBufferedImage(BufferedImage testImagePath) throws IOException {
		//皮肤病图片识别
		//1 读取一张图片
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg";
		//String testImagePath= "C:\\Users\\Lenovo\\Desktop\\deciphering\\播散性黄瘤_脏数据.jpg";
		//2 计算图片训练值
		int[][][] getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doInnerTest(getSkinBy);
	}


	private static List<String> doInnerTest(int[][][] getSkinBy, App u) throws IOException {
		int 腐蚀浓度= Integer.valueOf(u.fourInitonSuanFuTxt);
		// TODO Auto-generated method stub
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, 腐蚀浓度);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		int 像素阀值= Integer.valueOf(u.fourInitonSuanFaTxt);
		int 像素比精度= Integer.valueOf(u.fourInitonSuanBiTxt); 
		int 像素差精度= Integer.valueOf(u.fourInitonSuanJingTxt);
		int pcaScale= Integer.valueOf(u.fourInitonSuanPCATxt);
		int upcaScale= Integer.valueOf(u.fourInitonSuanUPCATxt);
		int icaScale= Integer.valueOf(u.fourInitonSuanICATxt);
		int ecaScale= Integer.valueOf(u.fourInitonSuanECATxt);
		double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 像素阀值, 像素比精度, 像素差精度);
		//这个getStatisticCount地方可以优化为 像奥运会比赛那样,明显太多德杂色进行自动或者认为剔除, 如字的黑色, 一些图片的红色.
		//剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 遍历疾病数据表.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 打分
		Double[] score= new Double[fileNames_6.size()];
		String[] nameScore= new String[fileNames_6.size()];
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_6, fileNames_6
				, pcaScale, upcaScale, icaScale, ecaScale);

		//
		腐蚀浓度= Integer.valueOf(u.fourInitonJianFuTxt);
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, 腐蚀浓度);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		像素阀值= Integer.valueOf(u.fourInitonJianFaTxt);
		像素比精度= Integer.valueOf(u.fourInitonJianBiTxt);
		像素差精度= Integer.valueOf(u.fourInitonJianJingTxt);
		pcaScale= Integer.valueOf(u.fourInitonJianPCATxt);
		upcaScale= Integer.valueOf(u.fourInitonJianUPCATxt);
		icaScale= Integer.valueOf(u.fourInitonJianICATxt);
		ecaScale= Integer.valueOf(u.fourInitonJianECATxt);
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 像素阀值, 像素比精度, 像素差精度);
		//这个getStatisticCount地方可以优化为 像奥运会比赛那样,明显太多德杂色进行自动或者认为剔除, 如字的黑色, 一些图片的红色.
		//剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 遍历疾病数据表.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		//4 打分
		Double[] score酸= new Double[fileNames_5.size()];
		GetColorRatioScore.scoreDeciphring(score酸, nameScore, getStatisticRatio, fileCells_5, fileNames_5
				, pcaScale, upcaScale, icaScale, ecaScale);
		//
		//
		腐蚀浓度= Integer.valueOf(u.sixteenInitonJianBiTxt);
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, 腐蚀浓度);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		像素阀值= Integer.valueOf(u.sixteenInitonJianFaTxt);
		像素比精度= Integer.valueOf(u.sixteenInitonJianBiTxt); 
		像素差精度= Integer.valueOf(u.sixteenInitonJianJingTxt);
		pcaScale= Integer.valueOf(u.sixteenInitonJianPCATxt);
		upcaScale= Integer.valueOf(u.sixteenInitonJianUPCATxt);
		icaScale= Integer.valueOf(u.sixteenInitonJianICATxt);
		ecaScale= Integer.valueOf(u.sixteenInitonJianECATxt);
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 像素阀值, 像素比精度, 像素差精度);
		//这个getStatisticCount地方可以优化为 像奥运会比赛那样,明显太多的杂色进行自动或者认为剔除, 如字的黑色, 一些图片的红色.
		//剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 遍历疾病数据表.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt");
		//4 打分
		Double[] score_17= new Double[fileNames_17.size()];
		GetColorRatioScore.scoreDeciphring(score_17, nameScore, getStatisticRatio, fileCells_17, fileNames_17
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		//suan 17
		
		腐蚀浓度= Integer.valueOf(u.sixteenInitonSuanBiTxt);
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, 腐蚀浓度);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		像素阀值= Integer.valueOf(u.sixteenInitonSuanFaTxt);
		像素比精度= Integer.valueOf(u.sixteenInitonSuanBiTxt); 
		像素差精度= Integer.valueOf(u.sixteenInitonSuanJingTxt);
		pcaScale= Integer.valueOf(u.sixteenInitonSuanPCATxt);
		upcaScale= Integer.valueOf(u.sixteenInitonSuanUPCATxt);
		icaScale= Integer.valueOf(u.sixteenInitonSuanICATxt);
		ecaScale= Integer.valueOf(u.sixteenInitonSuanECATxt);
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 像素阀值, 像素比精度, 像素差精度);
		//这个getStatisticCount地方可以优化为 像奥运会比赛那样,明显太多的杂色进行自动或者认为剔除, 如字的黑色, 一些图片的红色.
		//剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 遍历疾病数据表.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt");
		//4 打分
		Double[] score_suan_17= new Double[fileNames_suan_17.size()];
		GetColorRatioScore.scoreDeciphring(score_suan_17, nameScore, getStatisticRatio, fileCells_suan_17, fileNames_suan_17
				, pcaScale, upcaScale, icaScale, ecaScale);
		
		//融合
		for(int i= 0; i< score酸.length; i++) {
			score[i]+= score酸[i]* 0.001+ score_17[i]+ score_suan_17[i]; 
			//System.out.println(score_suan_17[i]);
		}
		//5 筛选
		double[] scoreDouble= new double[score.length];
		for(int i= 0; i< scoreDouble.length; i++) {
			scoreDouble[i]= score[i];//
		}
		//改成map
		Map<Double, Map<String, Boolean>> map= Double_ESU.getMapFromDoubleStringArray(score, nameScore);	
		int 递归深度= 70; //避免同值冗余内存高峰
		int 堆栈广度= 7; //避免堆栈浪费计算高峰
		new LYG9DWithDoubleTopSort4D().sort(scoreDouble, 堆栈广度, 递归深度);
		//new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
		 List<String> output= new ArrayList<>();
		//6 推荐
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
						output.add("相似图片:"+ i+ "位"+ string+ ">-----分数:"+ scoreDouble[i]);
					}
					if(string.contains("苔藓")) {
						output.add("#################################相似图片:"+ i+ "位"+ string+ ">-----分数:"+ scoreDouble[i]);
					}
					//System.out.println("相似图片:"+ i+ "位"+ string+ ">-----分数:"+ scoreDouble[i]);
				}
				map.remove(scoreDouble[i]);
				//	System.out.println("相似图片:"+ nameScore[i]+ "-----分数:"+ scoreInt[i]);
			}
		//弹出面板
		
		//
		return output;
	}
	
	
	private static List<String> doInnerTest(int[][][] getSkinBy) throws IOException {
		int 腐蚀浓度= 5;
		// TODO Auto-generated method stub
		int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, 腐蚀浓度);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		int 像素阀值= 10; 
		int 像素比精度= 5; 
		int 像素差精度= 8;
		double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 像素阀值, 像素比精度, 像素差精度);
		//这个getStatisticCount地方可以优化为 像奥运会比赛那样,明显太多德杂色进行自动或者认为剔除, 如字的黑色, 一些图片的红色.
		//剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
		double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 遍历疾病数据表.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		//4 打分
		Double[] score= new Double[fileNames_6.size()];
		String[] nameScore= new String[fileNames_6.size()];
		int pcaScale= 25;
		int upcaScale= 15;
		int icaScale= 15;
		int ecaScale= 20;
		GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_6, fileNames_6
				, pcaScale, upcaScale, icaScale, ecaScale);

		//
		腐蚀浓度= 95;
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, 腐蚀浓度);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB1.jpg", doPDEofSkin);
		像素阀值= 10; 
		像素比精度= 8; 
		像素差精度= 8;
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 像素阀值, 像素比精度, 像素差精度);
		//这个getStatisticCount地方可以优化为 像奥运会比赛那样,明显太多德杂色进行自动或者认为剔除, 如字的黑色, 一些图片的红色.
		//剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 遍历疾病数据表.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		//4 打分
		Double[] score酸= new Double[fileNames_5.size()];
		GetColorRatioScore.scoreDeciphring(score酸, nameScore, getStatisticRatio, fileCells_5, fileNames_5
				, pcaScale, upcaScale, icaScale, ecaScale);
		//
		//
		腐蚀浓度= 95;
		//getSkinBy= new GetSkinBy().getSkinBy(testImagePath);
		doPDEofSkin= new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH(getSkinBy, 腐蚀浓度);
		//new ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB_17.jpg", doPDEofSkin);
		像素阀值= 10; 
		像素比精度= 2; 
		像素差精度= 8;
		getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 像素阀值, 像素比精度, 像素差精度);
		//这个getStatisticCount地方可以优化为 像奥运会比赛那样,明显太多德杂色进行自动或者认为剔除, 如字的黑色, 一些图片的红色.
		//剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
		getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
		//
		//3 遍历疾病数据表.
		//initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt");
		//4 打分
		Double[] score_17= new Double[fileNames_17.size()];
		pcaScale= 1;
		upcaScale= 45;
		icaScale= 1;
		ecaScale= 1;	
		GetColorRatioScore.scoreDeciphring(score_17, nameScore, getStatisticRatio, fileCells_17, fileNames_17
				, pcaScale, upcaScale, icaScale, ecaScale);
		//融合
		for(int i= 0; i< score酸.length; i++) {
			score[i]+= score酸[i]+ score_17[i]; 
		}
		//5 筛选
		double[] scoreDouble= new double[score.length];
		for(int i= 0; i< scoreDouble.length; i++) {
			scoreDouble[i]= score[i];//
		}
		//改成map
		Map<Double, Map<String, Boolean>> map= Double_ESU.getMapFromDoubleStringArray(score, nameScore);	
		int 递归深度= 70; //避免同值冗余内存高峰
		int 堆栈广度= 7; //避免堆栈浪费计算高峰
		new LYG9DWithDoubleTopSort4D().sort(scoreDouble, 堆栈广度, 递归深度);
		//new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
		 List<String> output= new ArrayList<>();
		//6 推荐
		Here:
			for(int i= 0; i< 20; i++) {
				if(!map.containsKey(scoreDouble[i])) {
					i++;
					continue Here;
				}
				Iterator<String> iterator= map.get(scoreDouble[i]).keySet().iterator();
				while(iterator.hasNext()) {
					String string= iterator.next();
					output.add("相似图片:"+ i+ "位"+ string+ ">-----分数:"+ scoreDouble[i]);
					//System.out.println("相似图片:"+ i+ "位"+ string+ ">-----分数:"+ scoreDouble[i]);
				}
				map.remove(scoreDouble[i]);
				//	System.out.println("相似图片:"+ nameScore[i]+ "-----分数:"+ scoreInt[i]);
			}
		//弹出面板
		
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
		doTestWithFilePath("C:\\Users\\Lenovo\\Desktop\\deciphering\\播散性黄瘤_脏数据.jpg");
		//	
	}
}