package ISQ.VSU.feature;

import java.io.IOException;

import PCI.ASQ.statistic.ShareholdCount;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV.
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ,������Դ��ͬ��GPL2.0��Դ.
public class GetStatisticCount{
	public void getStatisticCount() {

	}
	public void getIncreasementStatisticCount() {

	}
	public void getPCAStatisticCount() {

	}
	public void getICAStatisticCount() {
//
	}
	public void getCorrelationStatisticCount() {

	}
	public void getBayansStatisticCount() {

	}
	public double[] getStatisticCount(int[][][] rgbIPE, int sharehold, int scale, int corr) throws IOException {
		double[] output= new double[17];
		//int sharehold= 127;
		double countR= ShareholdCount.getShareholdCount(rgbIPE[0], sharehold);
		double countB= ShareholdCount.getShareholdCount(rgbIPE[1], sharehold);
		double countG= ShareholdCount.getShareholdCount(rgbIPE[2], sharehold);
		
		double countYellow= new GetICAStatisticRatio(scale, corr).getYellowStatisticCount(rgbIPE);
		double countBlue= new GetICAStatisticRatio(scale, corr).getBlueStatisticCount(rgbIPE);
		double countRed= new GetICAStatisticRatio(scale, corr).getRedStatisticCount(rgbIPE);
		double countGreen= new GetICAStatisticRatio(scale, corr).getGreenStatisticCount(rgbIPE);
		double countPupil= new GetICAStatisticRatio(scale, corr).getPupilStatisticCount(rgbIPE);
		double countWhite= new GetICAStatisticRatio(scale, corr).getWhiteStatisticCount(rgbIPE);
		double countPink= new GetICAStatisticRatio(scale, corr).getPinkStatisticCount(rgbIPE);
		double countMidYellow= new GetICAStatisticRatio(scale, corr).getYellowStatisticCount(rgbIPE);
		double countMidBlue= new GetICAStatisticRatio(scale, corr).getBlueStatisticCount(rgbIPE);
		double countMidRed= new GetICAStatisticRatio(scale, corr).getRedStatisticCount(rgbIPE);
		double countMidGreen= new GetICAStatisticRatio(scale, corr).getGreenStatisticCount(rgbIPE);
		double countMidPupil= new GetICAStatisticRatio(scale, corr).getPupilStatisticCount(rgbIPE);
		double countMidWhite= new GetICAStatisticRatio(scale, corr).getWhiteStatisticCount(rgbIPE);
		double countMidPink= new GetICAStatisticRatio(scale, corr).getPinkStatisticCount(rgbIPE);
		output[0]= countR;
		output[1]= countB;
		output[2]= countG;
		output[3]= countYellow;
		output[4]= countBlue;
		output[5]= countRed;
		output[6]= countGreen;
		output[7]= countPupil;
		output[8]= countWhite;
		output[9]= countPink;
		output[10]= countMidYellow;
		output[11]= countMidBlue;
		output[12]= countMidRed;
		output[13]= countMidGreen;
		output[14]= countMidPupil;
		output[15]= countMidWhite;
		output[16]= countMidPink;
		return output;
	
	}
}