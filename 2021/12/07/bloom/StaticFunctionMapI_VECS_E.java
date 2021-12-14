package SEM.bloom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import ISQ.VSU.feature.SkinPathDetectTrip_E;
import ISQ.VSU.feature.SkinPathDoubleDetectTripFix2D;
import ISQ.VSU.feature.SkinPathDoubleDetectTripFix2D_E;
import ME.APM.VSQ.App;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.RangePDI;

//著作权人 + 作者 = 罗瑶光
public class StaticFunctionMapI_VECS_E implements StaticFunctionMapI_VECS_C{
	//SkinPathDoubleDetectTripFix2D_E{
	@Override
	public List<String> doTestWithImageAPP(App u) throws IOException {
		// TODO Auto-generated method stub
		return SkinPathDoubleDetectTripFix2D_E.doTestWithImageAPP(u);
	}; 
	public Double[] doFourJianPDErosion(int 腐蚀浓度,int 像素阀值,int 像素比精度, int 像素差精度,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException{
		return new SkinPathDoubleDetectTripFix2D_E(). doFourJianPDErosion(腐蚀浓度, 像素阀值, 像素比精度, 像素差精度,
				pcaScale,  upcaScale, icaScale, ecaScale, bufferedImage);
	};
	public Double[] doFourSuanPDErosion(int 腐蚀浓度,int 像素阀值,int 像素比精度, int 像素差精度,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException{
		return new SkinPathDoubleDetectTripFix2D_E().doFourSuanPDErosion(腐蚀浓度, 像素阀值, 像素比精度, 像素差精度,
				pcaScale, upcaScale, icaScale, ecaScale, bufferedImage); 

	};
	public Double[] doEightSuanPDErosion(int 腐蚀浓度,int 像素阀值,int 像素比精度, int 像素差精度,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException{
		return new SkinPathDoubleDetectTripFix2D_E(). doEightSuanPDErosion(腐蚀浓度, 像素阀值, 像素比精度, 像素差精度,
				pcaScale, upcaScale, icaScale, ecaScale, bufferedImage);

	};
	public Double[] doEightJianPDErosion(int 腐蚀浓度,int 像素阀值,int 像素比精度, int 像素差精度,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException{
		return new SkinPathDoubleDetectTripFix2D_E().doEightJianPDErosion(腐蚀浓度, 像素阀值, 像素比精度, 像素差精度, pcaScale, upcaScale, icaScale, ecaScale, bufferedImage); 

	};
	public void doFirstPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan
			, int[][] scoreMatrix, int top, BufferedImage bufferedImage)throws IOException{
		new SkinPathDoubleDetectTripFix2D_E(). doFirstPDErosionWithTop(fourJian, fourSuan, eightJian, eightSuan
				, scoreMatrix, top, bufferedImage);
	};
	public void doSecondPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times, BufferedImage bufferedImage)throws IOException{
		new SkinPathDoubleDetectTripFix2D_E().doSecondPDErosionWithTop(fourJian, fourSuan, eightJian, eightSuan, scoreMatrix
				, top, times, bufferedImage);
	};
	public void doThirdPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times, List<String> output, BufferedImage bufferedImage)throws IOException{
		new SkinPathDoubleDetectTripFix2D_E().doThirdPDErosionWithTop(fourJian, fourSuan, eightJian, eightSuan, scoreMatrix
				, top, times, output, bufferedImage);
	};
	public void initDeciphring(String string, int type) throws NumberFormatException, IOException{
		new SkinPathDoubleDetectTripFix2D_E(). initDeciphring(string, type);
	};

	//SkinPathDetectTrip_E{
	public void doTestWithFilePath(String testImagePath) throws IOException{
		SkinPathDetectTrip_E.doTestWithFilePath(testImagePath);
	};

	public List<String> doTestWithImage(Image testImagePath) throws IOException{
		return SkinPathDetectTrip_E.doTestWithImage(testImagePath);

	};
	public void doTestWithBufferedImage(BufferedImage testImagePath) throws IOException{
		SkinPathDetectTrip_E.doTestWithBufferedImage(testImagePath);
	};

	public static void main(String[] argv) throws IOException {
		String[] string= new String[5];
		string[0]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt";
		string[1]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt";
		string[2]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt";
		string[3]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt";
		string[4]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\线状苔藓-结节性硬化症叶状白斑_脏数据.jpg";
		new StaticFunctionMapI_VECS_E().staticMain(string);
	}

	//SkinPathDoubleDetectTripFix2D	
	@Override
	public void staticMain(String[] string) throws IOException {
		// TODO Auto-generated method stub// 	
		SkinPathDoubleDetectTripFix2D skinPathDoubleDetectTrip= new SkinPathDoubleDetectTripFix2D();
		skinPathDoubleDetectTrip.afterFirstNames= new HashMap<>();
		skinPathDoubleDetectTrip.initDeciphring(string[0], 6);
		skinPathDoubleDetectTrip.initDeciphring(string[1], 5);
		skinPathDoubleDetectTrip.initDeciphring(string[2], 17);
		skinPathDoubleDetectTrip.initDeciphring(string[3], 18);
		skinPathDoubleDetectTrip.testImagePath= string[4];
		//= "C:\\Users\\Lenovo\\Desktop\\deciphering\\播散性黄瘤_脏数据.jpg";
		//= "C:\\Users\\Lenovo\\Desktop\\deciphering\\脏数据_白癜风伴白发-色素失禁症-毛发稀疏伴色素沉着.jpg";	
		int[][] score= new int[][] {//稍后数组分出去 多样化参数input 设计。
			{ 5,  10, 5, 8, 25, 15, 15, 20}
			,{95, 5, 8, 8, 25, 15, 15, 20}
			,{5,  5, 2, 8, 1, 45, 1, 1}
			,{95, 5, 2, 8, 1, 45, 1, 1}
		};
		//第一次叠加
		for(int i= 0; i< 10; i++) {
			skinPathDoubleDetectTrip.doFirstPDErosionWithTop(1, 1, 1, 1, score, 30);	//叠加前50。
		}
		//可以写mask
		//筛选
		//第二次筛选,没有出现3次的一律过滤;
		skinPathDoubleDetectTrip.doSecondPDErosionWithTop(1 , 1, 1, 1, score, 50, 4);	//叠加筛选 前50 次数50%进行。
		//可以写mask
		//细准焦 碱筛选 精度5
		skinPathDoubleDetectTrip.doThirdPDErosionWithTop(1, 1, 1, 1, score, 500, 4);    //前500的 叠加筛选次数50%进行	
	}

	//16进制 AOPM VECS IDUQ TXHF 肽腐蚀非卷积视觉计算
	@Override
	public int[][] doPDERangePDI16(int[][] input, int 酸碱scale) {
		// TODO Auto-generated method stub
		return new RangePDI().IPE_AOPM_VECS_IDUQ_TXH_AC(input, 酸碱scale);
	}	
}
