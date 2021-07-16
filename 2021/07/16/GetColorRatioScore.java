package ISQ.VSU.feature;

import java.util.Iterator;
import java.util.List;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV.
//因为肽展公式和思想GPL2.0开源,本程序源码同样GPL2.0开源.
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
			score[lineCount]= score[lineCount]/ 24;//nor 均值进行了优化 20210714
			lineCount++;
		}
		//  -24+ 处理 近似值 1
//		for(int i= 0; i< score.length; i++) {
//			score[i]= Math.abs(score[i]);
//		}
	}
}