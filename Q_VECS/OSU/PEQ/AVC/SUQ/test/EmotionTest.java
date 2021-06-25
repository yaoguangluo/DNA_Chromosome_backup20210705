package OSU.PEQ.AVC.SUQ.test;

import java.io.IOException;

import AEU.AVC.SUQ.engine.EmotionInit;
import SVQ.stable.StableString;

public class EmotionTest{
	public static void main(String[] argv) throws IOException {
		EmotionInit emotionInit = new EmotionInit();
		emotionInit.IV_(StableString.text1);
		//reduce
		double positiveCount = emotionInit.getPositiveCount();
		double negativeCount = emotionInit.getNegativeCount();
		double totalCount = emotionInit.getTotalCount();
		System.out.println("��������" + positiveCount);
		System.out.println("��������" + negativeCount);
		if(positiveCount == 0) {
			positiveCount = 1;
		}
		if(negativeCount == 0) {
			negativeCount = 1;
		}
		double adjRatio = Math.abs(positiveCount/negativeCount-negativeCount/positiveCount);
		System.out.println("��Ⱦ���ʣ�" + adjRatio);
		double phychologicRatio = (positiveCount + negativeCount)/totalCount;
		System.out.println("�������ʣ�" + phychologicRatio);
		double infectionRatio = adjRatio*phychologicRatio;
		System.out.println("��Ⱦ���ʣ�" + infectionRatio);	
	}
}