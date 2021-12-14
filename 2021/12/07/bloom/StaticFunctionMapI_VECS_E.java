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

//����Ȩ�� + ���� = ������
public class StaticFunctionMapI_VECS_E implements StaticFunctionMapI_VECS_C{
	//SkinPathDoubleDetectTripFix2D_E{
	@Override
	public List<String> doTestWithImageAPP(App u) throws IOException {
		// TODO Auto-generated method stub
		return SkinPathDoubleDetectTripFix2D_E.doTestWithImageAPP(u);
	}; 
	public Double[] doFourJianPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException{
		return new SkinPathDoubleDetectTripFix2D_E(). doFourJianPDErosion(��ʴŨ��, ���ط�ֵ, ���رȾ���, ���ز��,
				pcaScale,  upcaScale, icaScale, ecaScale, bufferedImage);
	};
	public Double[] doFourSuanPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException{
		return new SkinPathDoubleDetectTripFix2D_E().doFourSuanPDErosion(��ʴŨ��, ���ط�ֵ, ���رȾ���, ���ز��,
				pcaScale, upcaScale, icaScale, ecaScale, bufferedImage); 

	};
	public Double[] doEightSuanPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException{
		return new SkinPathDoubleDetectTripFix2D_E(). doEightSuanPDErosion(��ʴŨ��, ���ط�ֵ, ���رȾ���, ���ز��,
				pcaScale, upcaScale, icaScale, ecaScale, bufferedImage);

	};
	public Double[] doEightJianPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException{
		return new SkinPathDoubleDetectTripFix2D_E().doEightJianPDErosion(��ʴŨ��, ���ط�ֵ, ���رȾ���, ���ز��, pcaScale, upcaScale, icaScale, ecaScale, bufferedImage); 

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
		string[4]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\��״̦޺-�����Ӳ��֢Ҷ״�װ�_������.jpg";
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
		//= "C:\\Users\\Lenovo\\Desktop\\deciphering\\��ɢ�Ի���_������.jpg";
		//= "C:\\Users\\Lenovo\\Desktop\\deciphering\\������_�����׷�-ɫ��ʧ��֢-ë��ϡ���ɫ�س���.jpg";	
		int[][] score= new int[][] {//�Ժ�����ֳ�ȥ ����������input ��ơ�
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
		skinPathDoubleDetectTrip.doThirdPDErosionWithTop(1, 1, 1, 1, score, 500, 4);    //ǰ500�� ����ɸѡ����50%����	
	}

	//16���� AOPM VECS IDUQ TXHF �ĸ�ʴ�Ǿ���Ӿ�����
	@Override
	public int[][] doPDERangePDI16(int[][] input, int ���scale) {
		// TODO Auto-generated method stub
		return new RangePDI().IPE_AOPM_VECS_IDUQ_TXH_AC(input, ���scale);
	}	
}
