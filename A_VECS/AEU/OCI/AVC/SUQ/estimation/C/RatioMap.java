package AEU.OCI.AVC.SUQ.estimation.C;

import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;

public interface RatioMap {
	Map<String, EmotionSample> getEmotionSampleMap(Map<Integer, WordFrequency> wordFrequencyMap
			, Map<String, Object> positive, Map<String, Object> negative);
	void IQ_EmotionRatio(Map<String, EmotionSample> emotionSampleMap, double positiveCount
			, double negativeCount, double medCount);
	void IQ_MotivationRatio(Map<String, EmotionSample> emotionSampleMap, double sumOfEmotion);
	void IQ_CorrelationRatio(Map<String, EmotionSample> emotionSampleMap, double sumOfEmotion);
	void IQ_ContinusRatio(Map<String, EmotionSample> emotionSampleMap, double emotionRatio);
	void IQ_TrendsRatio( Map<String, EmotionSample> emotionSampleMap);
	void IQ_PredictionRatio(Map<String, EmotionSample> emotionSampleMap);
	void IQ_GuessRatio(Map<String, EmotionSample> emotionSampleMap);
	void IQ_SensingRatio(Map<String, EmotionSample> emotionSampleMap);
	double findTotalPositiveCount(Map<String, EmotionSample> emotionSampleMap);
	double findTotalNegativeCount(Map<String, EmotionSample> emotionSampleMap);
	double findTotalKeyCount(Map<String, EmotionSample> emotionSampleMap);
	void IQ_Motivation(Map<String, EmotionSample> emotionSampleMap, Map<String, Object> motivation);
	void IQ_Trending(Map<String, EmotionSample> emotionSampleMap, Map<String, Object> trending);
	void IQ_Prediction(Map<String, EmotionSample> emotionSampleMap, Map<String, Object> prediction);
	void IQ_Distinction(Map<String, EmotionSample> emotionSampleMap, Map<String, Object> distinction);
	Map<String, EmotionSample> getEnvironmentSampleMap(Map<Integer, WordFrequency> wordFrequencyMap);
}