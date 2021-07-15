package ISQ.VSU.feature;

import java.io.IOException;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV.
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ,������Դ��ͬ��GPL2.0��Դ.
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
		
		double[] output= new double[24];
		
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
		return output;
	}
}