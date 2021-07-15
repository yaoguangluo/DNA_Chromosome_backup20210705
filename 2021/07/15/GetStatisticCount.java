package ISQ.VSU.feature;

import java.io.IOException;

import PCI.ASQ.statistic.ShareholdCount;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV.
//因为肽展公式和思想GPL2.0开源,本程序源码同样GPL2.0开源.
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
		double[] output= new double[10];
		//int sharehold= 127;
		double countR= ShareholdCount.getShareholdCount(rgbIPE[0], sharehold);
		double countB= ShareholdCount.getShareholdCount(rgbIPE[1], sharehold);
		double countG= ShareholdCount.getShareholdCount(rgbIPE[2], sharehold);
		
		double countYellow= new GetICAStatisticRatio(scale, corr).getYellowStatisticCount(rgbIPE[0], rgbIPE[1], rgbIPE[2]);
		double countBlue= new GetICAStatisticRatio(scale, corr).getBlueStatisticCount(rgbIPE[0], rgbIPE[1], rgbIPE[2]);
		double countRed= new GetICAStatisticRatio(scale, corr).getRedStatisticCount(rgbIPE[0], rgbIPE[1], rgbIPE[2]);
		double countGreen= new GetICAStatisticRatio(scale, corr).getGreenStatisticCount(rgbIPE[0], rgbIPE[1], rgbIPE[2]);
		double countPupil= new GetICAStatisticRatio(scale, corr).getPupilStatisticCount(rgbIPE[0], rgbIPE[1], rgbIPE[2]);
		double countWhite= new GetICAStatisticRatio(scale, corr).getWhiteStatisticCount(rgbIPE[0], rgbIPE[1], rgbIPE[2]);
		double countPink= new GetICAStatisticRatio(scale, corr).getPinkStatisticCount(rgbIPE[0], rgbIPE[1], rgbIPE[2]);
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
		return output;
	
	}
}