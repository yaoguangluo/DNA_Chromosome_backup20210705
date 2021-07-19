package ISQ.VSU.feature;

import java.util.Iterator;
import java.util.List;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV.
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ,������Դ��ͬ��GPL2.0��Դ.
public class GetColorRatioScore{
	//RGBY
	public void getRatioScore() {

	}
	public void getRGRatioScore() {

	}
	public void getRBRatioScore() {

	}
	public void getGBRatioScore() {

	}
	public void getGYRatioScore() {

	}
	public void getBYRatioScore() {

	}
	public void getRYRatioScore() {

	}
	static void scoreDeiphring(Double[] score, String[] nameScore, double[] getStatisticRatio
			, List<Double[]> fileCells, List<String> fileNames) {
		int lineCount= 0;
		Iterator<Double[]> iteratorCells= fileCells.iterator();
		Iterator<String> iteratorNames= fileNames.iterator();
		while(iteratorNames.hasNext()) {
			String name= iteratorNames.next();
			nameScore[lineCount++]= name.toString();
		}
		lineCount= 0;
		while(iteratorCells.hasNext()) {
			Double[] Doubles= iteratorCells.next();
			score[lineCount]= new Double(0);
			for(int i= 0; i< getStatisticRatio.length; i++) {
				try {
					if(0== Doubles[i]|| 0== getStatisticRatio[i]) {
						score[lineCount]+= 10000;
					}else {
						Double ratio= (getStatisticRatio[i]* 10000)/ Doubles[i];
						if(ratio>2||ratio<0.5) {
							score[lineCount]+= 10000;
						}else {
							score[lineCount]+= ratio;	
						}
					}
				}catch(Exception e) {
					System.out.println(Doubles[i]);
					score[lineCount]+= 0;
				}
			}
			score[lineCount]= Math.abs(score[lineCount]/ 45 - 1);//nor ��ֵ�������Ż� 20210714
			lineCount++;
		}
	}
	//Deiphring �ֽ�Ϊ Deciphring + Desiphine 
	static void scoreDeciphring(Double[] score, String[] nameScore, double[] getStatisticRatio
			, List<Double[]> fileCells, List<String> fileNames, int pcaScale, int upcaScale, int icaScale, int ecaScale) {
		int lineCount= 0;
		Iterator<Double[]> iteratorCells= fileCells.iterator();
		Iterator<String> iteratorNames= fileNames.iterator();
		while(iteratorNames.hasNext()) {
			String name= iteratorNames.next();
			nameScore[lineCount++]= name.toString();
		}
		lineCount= 0;
		while(iteratorCells.hasNext()) {
			Double[] Doubles= iteratorCells.next();
			score[lineCount]= new Double(0);
			int PCA= 0;
			int UPCA= 0;
			int ICA= 0;
			int ECA= 0;
			for(int i= 0; i< getStatisticRatio.length; i++) {
				try {
					if(0== Doubles[i]|| 0== getStatisticRatio[i]) {
						score[lineCount]+= 10000;
						ICA++;
						UPCA++;
					}else {
						Double ratio= (getStatisticRatio[i]* 10000)/ Doubles[i];
						if(ratio> 2|| ratio< 0.5) {
							UPCA++;
							score[lineCount]+= 10000;
						}else if(ratio< 1.5|| ratio> 0.75) {
							score[lineCount]+= ratio;	
							PCA++;
							if(i> 2) {
								ICA++;
							}
							if(ratio< 1.1|| ratio> 0.9) {
								ECA++;
							}
						} 
					}	
				}catch(Exception e) {
					System.out.println(Doubles[i]);
					score[lineCount]+= 0;
				}
			}
			if(PCA> pcaScale&& UPCA< upcaScale&& ICA> icaScale&& ECA> ecaScale) {
				score[lineCount]= Math.abs(score[lineCount]/ 45 - 1);//nor ��ֵ�������Ż� 20210714
			}else {
				score[lineCount]= 99999.0;//nor ��ֵ�������Ż� 20210714
			}
			lineCount++;
		}
	}
//	static void scoreDesiphine(Double[] score, String[] nameScore, double[] getStatisticRatio
//			, List<Double[]> fileCells, List<String> fileNames) {
//		int lineCount= 0;
//		int ECA= 0;
//		Iterator<Double[]> iteratorCells= fileCells.iterator();
//		Iterator<String> iteratorNames= fileNames.iterator();
//		while(iteratorNames.hasNext()) {
//			String name= iteratorNames.next();
//			nameScore[lineCount++]= name.toString();
//		}
//		lineCount= 0;
//		while(iteratorCells.hasNext()) {
//			Double[] Doubles= iteratorCells.next();
//			score[lineCount]= new Double(0);
//			for(int i= 0; i< getStatisticRatio.length; i++) {
//				try {
//					if(0== Doubles[i]|| 0== getStatisticRatio[i]) {
//						score[lineCount]+= 10000;
//					}else {
//						Double ratio= (getStatisticRatio[i]* 10000)/ Doubles[i];
//						if(ratio>2||ratio<0.5) {
//							score[lineCount]+= 10000;
//						}else {
//							score[lineCount]+= ratio;	
//						}
//					}
//					
//				}catch(Exception e) {
//					System.out.println(Doubles[i]);
//					score[lineCount]+= 0;
//				}
//			}
//			score[lineCount]= Math.abs(score[lineCount]/ 45 - 1);//nor ��ֵ�������Ż� 20210714
//			lineCount++;
//		}
//	}
}