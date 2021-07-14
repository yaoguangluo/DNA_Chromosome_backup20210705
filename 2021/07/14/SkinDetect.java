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
		double countYellow= new GetICAStatisticRatio().getYellowStatisticCount(r, g, b);
		double countBlue= new GetICAStatisticRatio().getBlueStatisticCount(r, g, b);
		double countRed= new GetICAStatisticRatio().getRedStatisticCount(r, g, b);
		double countGreen= new GetICAStatisticRatio().getGreenStatisticCount(r, g, b);
		double countPupil= new GetICAStatisticRatio().getPupilStatisticCount(r, g, b);
		double countWhite= new GetICAStatisticRatio().getWhiteStatisticCount(r, g, b);
		double countPink= new GetICAStatisticRatio().getPinkStatisticCount(r, g, b);
		//double countPupil= ...
		//double countPink= ...
		//double countWhite= ...
		
		//5 ���.
		//5.1������ֵ
		double ratioRB= 0== countB? 0: countR/ countB;
		double ratioRG= 0== countG? 0: countR/ countG;
		double ratioGB= 0== countB? 0: countG/ countB;
		//...����Ϊ��ԭɫ
		double ratioYellowR= 0== countR? 0: countYellow/ countR;
		double ratioYellowG= 0== countG? 0: countYellow/ countG;
		double ratioYellowB= 0== countB? 0: countYellow/ countB;
		
		double countBlueR= 0== countR? 0: countBlue/ countR;
		double countBlueG= 0== countG? 0: countBlue/ countG;
		double countBlueB= 0== countB? 0: countBlue/ countB;
		
		double countRedR= 0== countR? 0: countRed/ countR;
		double countRedG= 0== countG? 0: countRed/ countG;
		double countRedB= 0== countB? 0: countRed/ countB;
		
		double countGreenR= 0== countR? 0: countGreen/ countR;
		double countGreenG= 0== countG? 0: countGreen/ countG;
		double countGreenB= 0== countB? 0: countGreen/ countB;
		
		double countPupilR= 0== countR? 0: countPupil/ countR;
		double countPupilG= 0== countG? 0: countPupil/ countG;
		double countPupilB= 0== countB? 0: countPupil/ countB;
		
		double countWhiteR= 0== countR? 0: countWhite/ countR;
		double countWhiteG= 0== countG? 0: countWhite/ countG;
		double countWhiteB= 0== countB? 0: countWhite/ countB;
		
		double countPinkR= 0== countR? 0: countPink/ countR;
		double countPinkG= 0== countG? 0: countPink/ countG;
		double countPinkB= 0== countB? 0: countPink/ countB;
		//...
		//..
		//�ӽ����� 100��, ���ٷֱȽӽ����ƶ� ���.	
        //double score= ������һ����, ����ͼƬ������������ �����������ݿ�, ֮��ͱȶ����ƶȴ�־�����.
		//...
		//��ֵ��������, �������ȡֵ, ���������2�� �����ܱ����ȡֵ.
		//���п���,���ӱȽ���,�����Ӿ�ȷ׼ȷ.���ɸ�ʽ���Ĳ��� �����֤ͷ������,�̶���.
		
		//6 ������и߷��Ƽ�.
		//�ܷ������Ƽ�
		
		//7��֮ǰ���н�����Ƥ����ͼƬѵ��, �������ݿ�,����������.	
	}
}