package AEU.OPM.VEC.ica;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import AEU.AVC.SUQ.engine.EmotionInit;
import AEU.AVC.SUQ.engine.EnvironmentInit;
import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import SVQ.stable.StablePOS;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
//import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;

public class InitBehaviorICAKernel{
	private double[] kernel;
	public double[] getKernel() {
		return kernel;
	}

	public void I_Kernel(double[] kernel) {
		this.kernel = kernel;
	}

	public List<String> getForRestReturn() {
		return forRestReturn;
	}

	public void I_ForRestReturn(List<String> forRestReturn) {
		this.forRestReturn = forRestReturn;
	}

	private List<String> forRestReturn;
	public double getTrustRate(String text) throws IOException {
		EmotionInit emotionInitEnvironment = new EmotionInit();
		emotionInitEnvironment.IV_(text);
		double positiveCountEnvironment = emotionInitEnvironment.getPositiveCount();
		double totalCountEnvironment = emotionInitEnvironment.getTotalCount();
		positiveCountEnvironment += StablePOS.INT_ONE;
		return positiveCountEnvironment/totalCountEnvironment;
	}

	public double getTrustRate(String text, CogsBinaryForest_AE _A, EmotionMap emotionMap) throws IOException {
		EmotionInit emotionInitEnvironment = new EmotionInit();
		emotionInitEnvironment.IV_Exclude_A(text, _A, emotionMap);
		//reduce
		double positiveCountEnvironment = emotionInitEnvironment.getPositiveCount();
		double totalCountEnvironment = emotionInitEnvironment.getTotalCount();
		positiveCountEnvironment += StablePOS.INT_ONE;
		return positiveCountEnvironment/totalCountEnvironment;
	}
	
	public double[] getBehaviorICAKernel(String text) throws IOException {
		forRestReturn = new LinkedList<>();
		kernel = new double[StablePOS.INT_SEVEN];	
		EmotionInit emotionInit = new EmotionInit();
		emotionInit.IV_(text);
		double positiveCount = emotionInit.getPositiveCount();
		double negativeCount = emotionInit.getNegativeCount();
		double totalCount = emotionInit.getTotalCount();
		forRestReturn.add("������У�" + positiveCount);
		forRestReturn.add("������У�" + negativeCount);
		if(positiveCount == StablePOS.INT_ZERO) {
			positiveCount = StablePOS.INT_ONE;
		}
		if(negativeCount == StablePOS.INT_ZERO) {
			negativeCount = StablePOS.INT_ONE;
		}
		double adjRatio = Math.abs(positiveCount/negativeCount-negativeCount/positiveCount);
		forRestReturn.add("��Ⱦ���ʣ�" + adjRatio);
		double phychologicRatio = (positiveCount + negativeCount)/totalCount;
		forRestReturn.add("�������ʣ�" + phychologicRatio);
		double infectionRatio = adjRatio*phychologicRatio;
		forRestReturn.add("��Ⱦ���ʣ�" + infectionRatio);
		kernel[StablePOS.INT_ZERO] = adjRatio;
		kernel[StablePOS.INT_ONE] = phychologicRatio;
		kernel[StablePOS.INT_TWO] = infectionRatio;
		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.IV_FromEmotion(emotionInit.getWordFrequencyMap());
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
		forRestReturn.add("�۲�Ƕȣ�");
		String environmentText = "";
		Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getDistinction()) {
				environmentText += emotionSample.getDistinction() + StablePOS.SPACE_STRING;
			}
		}
		forRestReturn.add(environmentText);
		kernel[StablePOS.INT_THREE] = getTrustRate(environmentText);
		forRestReturn.add(StablePOS.EMPTY_STRING + kernel[StablePOS.INT_THREE]);
		forRestReturn.add("���α��ʣ�");
		String motivationText = StablePOS.EMPTY_STRING;
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getMotivation()) {
				motivationText += emotionSample.getMotivation() + StablePOS.SPACE_STRING;
			}
		}
		forRestReturn.add(motivationText);
		kernel[StablePOS.INT_FOUR] = getTrustRate(motivationText);
		forRestReturn.add(StablePOS.EMPTY_STRING+kernel[StablePOS.INT_FOUR]);
		forRestReturn.add("ִ�б��ʣ�");
		String trendingText = StablePOS.EMPTY_STRING;
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getTrending()) {
				trendingText += emotionSample.getTrending() + StablePOS.SPACE_STRING;
			}
		}
		forRestReturn.add(trendingText);
		kernel[StablePOS.INT_FIVE] = getTrustRate(trendingText);
		forRestReturn.add(StablePOS.EMPTY_STRING + kernel[StablePOS.INT_FIVE]);
		forRestReturn.add("�ɹ����ʣ�");
		String predictionText = StablePOS.EMPTY_STRING;
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getPrediction()) {
				predictionText += emotionSample.getPrediction() + StablePOS.SPACE_STRING;
			}
		}
		forRestReturn.add(predictionText);
		kernel[StablePOS.INT_SIX] = getTrustRate(predictionText);
		forRestReturn.add(StablePOS.EMPTY_STRING + kernel[StablePOS.INT_SIX]);
		return kernel;
	}

	public double[] getBehaviorICAKernel(String text, CogsBinaryForest_AE _A, EmotionMap emotionMap) throws IOException {
		forRestReturn = new LinkedList<>();
		kernel = new double[StablePOS.INT_SEVEN];	
		EmotionInit emotionInit = new EmotionInit();
		emotionInit.IV_Exclude_A(text, _A, emotionMap);
		double positiveCount = emotionInit.getPositiveCount();
		double negativeCount = emotionInit.getNegativeCount();
		double totalCount = emotionInit.getTotalCount();
		forRestReturn.add("������У�" + positiveCount);
		forRestReturn.add("������У�" + negativeCount);
		if(positiveCount == StablePOS.INT_ZERO) {
			positiveCount = StablePOS.INT_ONE;
		}
		if(negativeCount == StablePOS.INT_ZERO) {
			negativeCount = StablePOS.INT_ONE;
		}
		double adjRatio = Math.abs(positiveCount/negativeCount-negativeCount/positiveCount);
		forRestReturn.add("��Ⱦ���ʣ�" + adjRatio);
		double phychologicRatio = (positiveCount + negativeCount)/totalCount;
		forRestReturn.add("�������ʣ�" + phychologicRatio);
		double infectionRatio = adjRatio*phychologicRatio;
		forRestReturn.add("��Ⱦ���ʣ�" + infectionRatio);
		kernel[StablePOS.INT_ZERO] = adjRatio;
		kernel[StablePOS.INT_ONE] = phychologicRatio;
		kernel[StablePOS.INT_TWO] = infectionRatio;
		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.IV_FromEmotionExcludeEmotion(emotionInit.getWordFrequencyMap(), emotionMap);
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
		forRestReturn.add("�۲�Ƕȣ�");
		String environmentText = StablePOS.EMPTY_STRING;
		Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getDistinction()) {
				environmentText += emotionSample.getDistinction() + StablePOS.SPACE_STRING;
			}
		}
		forRestReturn.add(environmentText);
		kernel[StablePOS.INT_THREE] = getTrustRate(environmentText, _A, emotionMap);
		forRestReturn.add(StablePOS.EMPTY_STRING+kernel[StablePOS.INT_THREE]);
		forRestReturn.add("���α��ʣ�");
		String motivationText = StablePOS.EMPTY_STRING;
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getMotivation()) {
				motivationText += emotionSample.getMotivation() + StablePOS.SPACE_STRING;
			}
		}
		forRestReturn.add(motivationText);
		kernel[StablePOS.INT_FOUR] = getTrustRate(motivationText, _A, emotionMap);
		forRestReturn.add(StablePOS.EMPTY_STRING+kernel[StablePOS.INT_FOUR]);
		forRestReturn.add("ִ�б��ʣ�");
		String trendingText = StablePOS.EMPTY_STRING;
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getTrending()) {
				trendingText += emotionSample.getTrending() + StablePOS.SPACE_STRING;
			}
		}
		forRestReturn.add(trendingText);
		kernel[StablePOS.INT_FIVE] = getTrustRate(trendingText, _A, emotionMap);
		forRestReturn.add(StablePOS.EMPTY_STRING+kernel[StablePOS.INT_FIVE]);
		forRestReturn.add("�ɹ����ʣ�");
		String predictionText = StablePOS.EMPTY_STRING;
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getPrediction()) {
				predictionText += emotionSample.getPrediction() + StablePOS.SPACE_STRING;
			}
		}
		forRestReturn.add(predictionText);
		kernel[StablePOS.INT_SIX] = getTrustRate(predictionText, _A, emotionMap);
		forRestReturn.add(StablePOS.EMPTY_STRING+kernel[StablePOS.INT_SIX]);
		return kernel;
	}
}