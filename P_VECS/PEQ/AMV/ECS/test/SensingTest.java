package PEQ.AMV.ECS.test;
import java.io.IOException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import AEU.OCI.AVC.SUQ.estimation.C.RatioMap;
import AEU.OEI.AVC.SUQ.SVU.EOP.E.RatioMap_E;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import SVQ.stable.StableString;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
//import OCI.ME.analysis.C.A;
import OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
//import OEI.ME.analysis.E.AE_XCDX_Map;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
public class SensingTest{
	public List<String> getSets() {
		return sets;
	}

	public void I_Sets(List<String> sets) {
		this.sets = sets;
	}

	public Map<String, String> getPosCnToCn() {
		return this.pos;
	}
	private List<String> sets;
	private Map<String, String> pos;
	public String[][] getMatrix() throws IOException {
		EmotionMap emotionMap = new EmotionMap_E(); 
		emotionMap.IV_MotivationMap();
		emotionMap.IV_NegativeMap();
		emotionMap.IV_PositiveMap();
		emotionMap.IV_TrendingMap();
		emotionMap.IV_PredictionMap();
		//A _A = new CogsBinaryForest_AE();
		CogsBinaryForest_AE _A= new CogsBinaryForest_AE();
		_A.IV_Mixed();
		pos = _A.getPosCnToCn();
		Map<String, Object> positive= emotionMap.getPositiveMap();
		Map<String, Object> negative= emotionMap.getNegativeMap();
		Map<String, Object> motivation= emotionMap.getMotivationMap();
		Map<String, Object> trending= emotionMap.getTrendingMap();
		Map<String, Object> prediction= emotionMap.getPredictionMap();
		sets = _A.parserString(StableString.text1);
		Map<Integer, WordFrequency> wordFrequencyMap= _A.getWordFrequencyByReturnSortMap(sets);
		RatioMap rationMap= new RatioMap_E();
		Map<String, EmotionSample> emotionSampleMap= rationMap.getEmotionSampleMap(wordFrequencyMap, positive, negative);
		double positiveCount= rationMap.findTotalPositiveCount(emotionSampleMap);
		double negativeCount= rationMap.findTotalNegativeCount(emotionSampleMap);
		double totalCount= rationMap.findTotalKeyCount(emotionSampleMap);
		double medCount= totalCount- (positiveCount+ negativeCount);
		rationMap.IQ_Motivation(emotionSampleMap, motivation);
		rationMap.IQ_Trending(emotionSampleMap, trending);
		rationMap.IQ_Prediction(emotionSampleMap,prediction);
		rationMap.IQ_EmotionRatio(emotionSampleMap, positiveCount, negativeCount, medCount);
		rationMap.IQ_MotivationRatio(emotionSampleMap, totalCount);
		rationMap.IQ_CorrelationRatio(emotionSampleMap, totalCount);
		double emotionRatio = Math.abs(positiveCount/ negativeCount - negativeCount/ positiveCount);
		rationMap.IQ_ContinusRatio(emotionSampleMap, emotionRatio);
		rationMap.IQ_TrendsRatio(emotionSampleMap);
		rationMap.IQ_PredictionRatio(emotionSampleMap);
		rationMap.IQ_GuessRatio(emotionSampleMap);
		rationMap.IQ_SensingRatio(emotionSampleMap);
		String[][] DNNMatrix = new String[emotionSampleMap.size()][15];
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		int count = StablePOS.INT_ZERO;
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			DNNMatrix[count][StablePOS.INT_ZERO]=word;
			DNNMatrix[count][StablePOS.INT_ONE]=emotionSample.getMotivation();
			DNNMatrix[count][StablePOS.INT_TWO]=emotionSample.getTrending();
			DNNMatrix[count][StablePOS.INT_THREE]= emotionSample.getPrediction();
			DNNMatrix[count][StablePOS.INT_FOUR]= StablePOS.EMPTY_STRING + emotionSample.getPositiveCount();
			DNNMatrix[count][StablePOS.INT_FIVE]= StablePOS.EMPTY_STRING + emotionSample.getMedCount();
			DNNMatrix[count][StablePOS.INT_SIX]= StablePOS.EMPTY_STRING + emotionSample.getNegativeCount();
			DNNMatrix[count][StablePOS.INT_SEVEN]= StablePOS.EMPTY_STRING + (int)(emotionSample.getEmotionRatio()*10000);
			DNNMatrix[count][StablePOS.INT_EIGHT]= StablePOS.EMPTY_STRING + (int)(emotionSample.getMotivationRatio()*100000);
			DNNMatrix[count][StablePOS.INT_NINE]= StablePOS.EMPTY_STRING + (int)(emotionSample.getCorrelationRatio()*10000);
			DNNMatrix[count][StablePOS.INT_TEN]= StablePOS.EMPTY_STRING + (int)(emotionSample.getContinusRatio()*10);
			DNNMatrix[count][StablePOS.INT_ELEVEN]= StablePOS.EMPTY_STRING + (int)(emotionSample.getTrendsRatio()*100000);
			DNNMatrix[count][StablePOS.INT_TWELVE]= StablePOS.EMPTY_STRING + (int)(emotionSample.getPredictionRatio()*10000*1000);
			DNNMatrix[count][StablePOS.INT_THIRTEEN]= StablePOS.EMPTY_STRING + (int)(emotionSample.getGuessRatio()*100000*100000);
			DNNMatrix[count][StablePOS.INT_FOURTEEN]= StablePOS.EMPTY_STRING + (int)(emotionSample.getSensingRatio()*100000);
			count++;
		}
		return DNNMatrix;
	}

	public static void main(String[] argv) throws IOException {
		SensingTest sensingTest = new SensingTest();
		sensingTest.getMatrix();
	}

	public String[][] getMatrix(String text, CogsBinaryForest_AE _A) throws IOException {
		pos= _A.getPosCnToCn();
		EmotionMap emotionMap= _A.getEmotionMap();
		Map<String, Object> positive= emotionMap.getPositiveMap();
		Map<String, Object> negative= emotionMap.getNegativeMap();
		Map<String, Object> motivation= emotionMap.getMotivationMap();
		Map<String, Object> trending= emotionMap.getTrendingMap();
		Map<String, Object> prediction= emotionMap.getPredictionMap();
		sets= _A.parserString(text);
		Map<Integer, WordFrequency> wordFrequencyMap= _A.getWordFrequencyByReturnSortMap(sets);
		RatioMap rationMap= new RatioMap_E();
		Map<String, EmotionSample> emotionSampleMap= rationMap.getEmotionSampleMap(wordFrequencyMap, positive, negative);
		double positiveCount= rationMap.findTotalPositiveCount(emotionSampleMap);
		double negativeCount= rationMap.findTotalNegativeCount(emotionSampleMap);
		double totalCount= rationMap.findTotalKeyCount(emotionSampleMap);
		double medCount= totalCount- (positiveCount+ negativeCount);
		rationMap.IQ_Motivation(emotionSampleMap, motivation);
		rationMap.IQ_Trending(emotionSampleMap, trending);
		rationMap.IQ_Prediction(emotionSampleMap,prediction);
		rationMap.IQ_EmotionRatio(emotionSampleMap, positiveCount, negativeCount, medCount);
		rationMap.IQ_MotivationRatio(emotionSampleMap, totalCount);
		rationMap.IQ_CorrelationRatio(emotionSampleMap,totalCount);
		double emotionRatio= Math.abs(positiveCount/negativeCount - negativeCount/positiveCount);
		rationMap.IQ_ContinusRatio(emotionSampleMap, emotionRatio);
		rationMap.IQ_TrendsRatio(emotionSampleMap);
		rationMap.IQ_PredictionRatio(emotionSampleMap);
		rationMap.IQ_GuessRatio(emotionSampleMap);
		rationMap.IQ_SensingRatio(emotionSampleMap);
		String[][] DNNMatrix= new String[emotionSampleMap.size()][15];
		Iterator<String> Iterator= emotionSampleMap.keySet().iterator();
		int count= StablePOS.INT_ZERO;
		while(Iterator.hasNext()) {
			String word= Iterator.next();
			EmotionSample emotionSample= emotionSampleMap.get(word);
			DNNMatrix[count][StablePOS.INT_ZERO]= word;
			DNNMatrix[count][StablePOS.INT_ONE]= emotionSample.getMotivation();
			DNNMatrix[count][StablePOS.INT_TWO]= emotionSample.getTrending();
			DNNMatrix[count][StablePOS.INT_THREE]= emotionSample.getPrediction();
			DNNMatrix[count][StablePOS.INT_FOUR]= StablePOS.EMPTY_STRING+ emotionSample.getPositiveCount();
			DNNMatrix[count][StablePOS.INT_FIVE]= StablePOS.EMPTY_STRING+ emotionSample.getMedCount();
			DNNMatrix[count][StablePOS.INT_SIX]= StablePOS.EMPTY_STRING+ emotionSample.getNegativeCount();
			DNNMatrix[count][StablePOS.INT_SEVEN]= StablePOS.EMPTY_STRING+ (int)(emotionSample.getEmotionRatio()* 10000);
			DNNMatrix[count][StablePOS.INT_EIGHT]= StablePOS.EMPTY_STRING+ (int)(emotionSample.getMotivationRatio()* 100000);
			DNNMatrix[count][StablePOS.INT_NINE]= StablePOS.EMPTY_STRING+ (int)(emotionSample.getCorrelationRatio()* 10000);
			DNNMatrix[count][StablePOS.INT_TEN]= StablePOS.EMPTY_STRING+ (int)(emotionSample.getContinusRatio()* 10);
			DNNMatrix[count][StablePOS.INT_ELEVEN]= StablePOS.EMPTY_STRING+ (int)(emotionSample.getTrendsRatio()* 100000);
			DNNMatrix[count][StablePOS.INT_TWELVE]= StablePOS.EMPTY_STRING+ (int)(emotionSample.getPredictionRatio()* 10000* 1000);
			DNNMatrix[count][StablePOS.INT_THIRTEEN]= StablePOS.EMPTY_STRING+ (int)(emotionSample.getGuessRatio()* 10000* 10000);
			DNNMatrix[count][StablePOS.INT_FOURTEEN]= StablePOS.EMPTY_STRING+ (int)(emotionSample.getSensingRatio()* 100000);
			count++;
		}
		return DNNMatrix;
	}
}