package ISQ.VSU.feature;

import java.io.IOException;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.RangePDI;
import PCI.ASQ.statistic.ShareholdCount;
import PEU.P.image.ReadWritePng;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV. ����ͷ
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ,������Դ��ͬ��GPL2.0��Դ.
public class SkinDetect{
	public void getSkinBy() {

	}
	
	public void doPDEofSkin() {

	}
	
	public void getStatisticRatio() {

	}
	
	public void getRatioScore() {

	}
	
	public void getRatioScoreSort() {

	}
	@SuppressWarnings("unused")
	public static void main(String[] argv) throws IOException {
		//Ƥ����ͼƬʶ��
		//1 ��ȡһ��ͼƬ
		//��
		int[][] r= new ReadWritePng().REDpngRead("ͼƬ��ַ");
		int[][] g= new ReadWritePng().GRNpngRead("ͼƬ��ַ"); 
		int[][] b= new ReadWritePng().BLUpngRead("ͼƬ��ַ");
		//�Ȼ�����PCA�������
		///......
		//
		//2 ������չ�Ǿ����ʴ�任.
		//3 ͳ�Ƹ�ʴ�����ɫ����
		//3.1��PDE�ĸ�ʴ���� Ϊ ������
		int ratio= 50;//���Ũ��ģ��͵��������.(0 ~ 100)
		int[][] rp= new RangePDI().IPE(r, ratio);
		int[][] gp= new RangePDI().IPE(g, ratio);
		int[][] bp= new RangePDI().IPE(b, ratio); 
		
		//4 Ȼ�����ģʽʶ�� ���ݱȶ�,
		int sharehold= 127;//���Ũ��ģ��͵��������.(0 ~ 100)
		//4.1����ͳ��
		double countR= ShareholdCount.getShareholdCount(rp, sharehold);
		double countB= ShareholdCount.getShareholdCount(bp, sharehold);
		double countG= ShareholdCount.getShareholdCount(gp, sharehold);
		
		//double countYellow= ...
		//double countPupil= ...
		//double countPink= ...
		//double countWhite= ...
		
		//5 ���.
		//5.1������ֵ
		double ratioRB= 0== countB? 0: countR/ countB;
		double ratioRG= 0== countG? 0: countR/ countG;
		double ratioGB= 0== countB? 0: countG/ countB;
		//...
		//...
		//..
		//�ӽ����� 100��, ���ٷֱȽӽ����ƶ� ���.	

//...
		//��ֵ��������, �������ȡֵ, ���������2�� �����ܱ����ȡֵ.
		
		//6 ������и߷��Ƽ�.
		//�ܷ������Ƽ�
		
		//7��֮ǰ���н�����Ƥ����ͼƬѵ��, �������ݿ�,����������.	
	}
}