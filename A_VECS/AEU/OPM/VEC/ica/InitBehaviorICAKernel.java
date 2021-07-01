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
		forRestReturn.add("正面情感：" + positiveCount);
		forRestReturn.add("负面情感：" + negativeCount);
		if(positiveCount == StablePOS.INT_ZERO) {
			positiveCount = StablePOS.INT_ONE;
		}
		if(negativeCount == StablePOS.INT_ZERO) {
			negativeCount = StablePOS.INT_ONE;
		}
		double adjRatio = Math.abs(positiveCount/negativeCount-negativeCount/positiveCount);
		forRestReturn.add("渲染比率：" + adjRatio);
		double phychologicRatio = (positiveCount + negativeCount)/totalCount;
		forRestReturn.add("情绪比率：" + phychologicRatio);
		double infectionRatio = adjRatio*phychologicRatio;
		forRestReturn.add("感染比率：" + infectionRatio);
		kernel[StablePOS.INT_ZERO] = adjRatio;
		kernel[StablePOS.INT_ONE] = phychologicRatio;
		kernel[StablePOS.INT_TWO] = infectionRatio;
		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.IV_FromEmotion(emotionInit.getWordFrequencyMap());
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
		forRestReturn.add("观测角度：");
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
		forRestReturn.add("信任比率：");
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
		forRestReturn.add("执行比率：");
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
		forRestReturn.add("成功比率：");
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
		forRestReturn.add("正面情感：" + positiveCount);
		forRestReturn.add("负面情感：" + negativeCount);
		if(positiveCount == StablePOS.INT_ZERO) {
			positiveCount = StablePOS.INT_ONE;
		}
		if(negativeCount == StablePOS.INT_ZERO) {
			negativeCount = StablePOS.INT_ONE;
		}
		double adjRatio = Math.abs(positiveCount/negativeCount-negativeCount/positiveCount);
		forRestReturn.add("渲染比率：" + adjRatio);
		double phychologicRatio = (positiveCount + negativeCount)/totalCount;
		forRestReturn.add("情绪比率：" + phychologicRatio);
		double infectionRatio = adjRatio*phychologicRatio;
		forRestReturn.add("感染比率：" + infectionRatio);
		kernel[StablePOS.INT_ZERO] = adjRatio;
		kernel[StablePOS.INT_ONE] = phychologicRatio;
		kernel[StablePOS.INT_TWO] = infectionRatio;
		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.IV_FromEmotionExcludeEmotion(emotionInit.getWordFrequencyMap(), emotionMap);
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
		forRestReturn.add("观测角度：");
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
		forRestReturn.add("信任比率：");
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
		forRestReturn.add("执行比率：");
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
		forRestReturn.add("成功比率：");
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