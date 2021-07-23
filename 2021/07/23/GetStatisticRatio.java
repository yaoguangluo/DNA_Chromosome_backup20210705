package ISQ.VSU.feature;

import java.io.IOException;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV.
//因为肽展公式和思想GPL2.0开源,本程序源码同样GPL2.0开源.
public class GetStatisticRatio{
	public void getStatisticRatio() {

	}
	public void getIncreasementStatisticRatio() {

	}
	public void getPCAStatisticRatio() {

	}
	public void getICAStatisticRatio() {
//
	}
	public void getCorrelationStatisticRatio() {

	}
	public void getBayansStatisticRatio() {

	}
	
	public double[] getStatisticRatio(double[] rgbIPECount) throws IOException {
		double countR= rgbIPECount[0];
		double countB= rgbIPECount[1];
		double countG= rgbIPECount[2];
		double countYellow= rgbIPECount[3];
		double countBlue= rgbIPECount[4];
		double countRed= rgbIPECount[5];
		double countGreen= rgbIPECount[6];
		double countPupil= rgbIPECount[7];
		double countWhite= rgbIPECount[8];
		double countPink= rgbIPECount[9];
		
		double countMidYellow= rgbIPECount[10];
		double countMidBlue= rgbIPECount[11];
		double countMidRed= rgbIPECount[12];
		double countMidGreen= rgbIPECount[13];
		double countMidPupil= rgbIPECount[14];
		double countMidWhite= rgbIPECount[15];
		double countMidPink= rgbIPECount[16];
		
		double[] output= new double[45];
		
		double ratioRB= 0== countB? 0: countR/ countB;
		double ratioRG= 0== countG? 0: countR/ countG;
		double ratioGB= 0== countB? 0: countG/ countB;

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
		
		double ratioMidYellowR= 0== countR? 0: countMidYellow/ countR;
		double ratioMidYellowG= 0== countG? 0: countMidYellow/ countG;
		double ratioMidYellowB= 0== countB? 0: countMidYellow/ countB;
		
		double countMidBlueR= 0== countR? 0: countMidBlue/ countR;
		double countMidBlueG= 0== countG? 0: countMidBlue/ countG;
		double countMidBlueB= 0== countB? 0: countMidBlue/ countB;
		
		double countMidRedR= 0== countR? 0: countMidRed/ countR;
		double countMidRedG= 0== countG? 0: countMidRed/ countG;
		double countMidRedB= 0== countB? 0: countMidRed/ countB;
		
		double countMidGreenR= 0== countR? 0: countMidGreen/ countR;
		double countMidGreenG= 0== countG? 0: countMidGreen/ countG;
		double countMidGreenB= 0== countB? 0: countMidGreen/ countB;
		
		double countMidPupilR= 0== countR? 0: countMidPupil/ countR;
		double countMidPupilG= 0== countG? 0: countMidPupil/ countG;
		double countMidPupilB= 0== countB? 0: countMidPupil/ countB;
		
		double countMidWhiteR= 0== countR? 0: countMidWhite/ countR;
		double countMidWhiteG= 0== countG? 0: countMidWhite/ countG;
		double countMidWhiteB= 0== countB? 0: countMidWhite/ countB;
		
		double countMidPinkR= 0== countR? 0: countMidPink/ countR;
		double countMidPinkG= 0== countG? 0: countMidPink/ countG;
		double countMidPinkB= 0== countB? 0: countMidPink/ countB;
		
		output[0]= ratioRB;
		output[1]= ratioRG;
		output[2]= ratioGB;
		
		output[3]= ratioYellowR;
		output[4]= ratioYellowG;
		output[5]= ratioYellowB;
		
		output[6]= countBlueR;
		output[7]= countBlueG;
		output[8]= countBlueB;
		
		output[9]=  countRedR;
		output[10]= countRedG;
		output[11]= countRedB;
		
		output[12]= countGreenR;
		output[13]= countGreenG;
		output[14]= countGreenB;
		
		output[15]= countPupilR;
		output[16]= countPupilG;
		output[17]= countPupilB;
		
		output[18]= countWhiteR;
		output[19]= countWhiteG;
		output[20]= countWhiteB;
		
		output[21]= countPinkR;
		output[22]= countPinkG;
		output[23]= countPinkB;
		
		output[24]= ratioMidYellowR;
		output[25]= ratioMidYellowG;
		output[26]= ratioMidYellowB;
		
		output[27]= countMidBlueR;
		output[28]= countMidBlueG;
		output[29]= countMidBlueB;
		
		output[30]= countMidRedR;
		output[31]= countMidRedG;
		output[32]= countMidRedB;
		
		output[33]= countMidGreenR;
		output[34]= countMidGreenG;
		output[35]= countMidGreenB;
		
		output[36]= countMidPupilR;
		output[37]= countMidPupilG;
		output[38]= countMidPupilB;
		
		output[39]= countMidWhiteR;
		output[40]= countMidWhiteG;
		output[41]= countMidWhiteB;
		
		output[42]= countMidPinkR;
		output[43]= countMidPinkG;
		output[44]= countMidPinkB;
		return output;
	}
}