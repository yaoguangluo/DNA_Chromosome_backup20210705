package AEU.OEI.AVC.SUQ.SVU.EOP.E;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import AEU.OCI.AVC.SUQ.estimation.C.RatioMap;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;

public class RatioMap_E implements RatioMap{

	@Override
	public Map<String, EmotionSample> getEmotionSampleMap(Map<Integer, WordFrequency> wordFrequencyMap,
			Map<String, Object> positive, Map<String, Object> negative) {
		Map<String, EmotionSample> output = new HashMap<>();
		for(int i = wordFrequencyMap.size() - StablePOS.INT_ONE; i >= StablePOS.INT_ZERO; i--) {
			if(wordFrequencyMap.get(i).getWord().length() > StablePOS.INT_ONE) {
				EmotionSample emotionSample;
				if(output.containsKey(wordFrequencyMap.get(i).getWord())) {
					emotionSample = output.get(wordFrequencyMap.get(i).getWord());
				}else {
					emotionSample = new EmotionSample();
				}
				if(positive.containsKey(wordFrequencyMap.get(i).getWord())) {
					emotionSample.I_PositiveCount(wordFrequencyMap.get(i).getFrequency());
				}else if(negative.containsKey(wordFrequencyMap.get(i).getWord())) {
					emotionSample.I_NegativeCount(wordFrequencyMap.get(i).getFrequency());
				}else {
					emotionSample.I_MedCount(wordFrequencyMap.get(i).getFrequency());
				}
				output.put(wordFrequencyMap.get(i).getWord(), emotionSample);
			}
		}
		return output;
	}

	@Override
	public void IQ_MotivationRatio(Map<String, EmotionSample> emotionSampleMap, double sumOfEmotion) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			emotionSample.I_MotivationRatio(emotionSample.getEmotionRatio()/sumOfEmotion);
			emotionSampleMap.put(word, emotionSample);
		}

	}

	@Override
	public void IQ_CorrelationRatio(Map<String, EmotionSample> emotionSampleMap, double sumOfEmotion) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			emotionSample.I_CorrelationRatio((emotionSample.getPositiveCount()
					+ emotionSample.getNegativeCount() + emotionSample.getMedCount())/sumOfEmotion);
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_ContinusRatio(Map<String, EmotionSample> emotionSampleMap, double emotionRatio) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			emotionSample.I_ContinusRatio((emotionSample.getPositiveCount()
					+ emotionSample.getNegativeCount() + emotionSample.getMedCount()) * emotionRatio);
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_TrendsRatio(Map<String, EmotionSample> emotionSampleMap) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			emotionSample.I_TrendsRatio(emotionSample.getEmotionRatio() * emotionSample.getContinusRatio() 
					* emotionSample.getCorrelationRatio());
			emotionSampleMap.put(word, emotionSample);
		}

	}

	@Override
	public void IQ_PredictionRatio(Map<String, EmotionSample> emotionSampleMap) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			emotionSample.I_PredictionRatio(emotionSample.getMotivationRatio()*emotionSample.getCorrelationRatio());
			emotionSampleMap.put(word, emotionSample);
		}

	}

	@Override
	public void IQ_GuessRatio(Map<String, EmotionSample> emotionSampleMap) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			emotionSample.I_GuessRatio(emotionSample.getPredictionRatio()*emotionSample.getTrendsRatio());
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_SensingRatio(Map<String, EmotionSample> emotionSampleMap) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			if(0==emotionSample.getTrendsRatio()) {
				emotionSample.I_SensingRatio(0);
			}else {
				emotionSample.I_SensingRatio(emotionSample.getPredictionRatio()/emotionSample.getTrendsRatio());
			}
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public double findTotalPositiveCount(Map<String, EmotionSample> emotionSampleMap) {
		double output = StablePOS.INT_ONE;
		Iterator<String> Iterator=emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			output += emotionSample.getPositiveCount();
		}
		return output;
	}

	@Override
	public double findTotalNegativeCount(Map<String, EmotionSample> emotionSampleMap) {
		double output = StablePOS.INT_ONE;
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			output += emotionSample.getNegativeCount();
		}
		return output;
	}

	@Override
	public void IQ_EmotionRatio(Map<String, EmotionSample> emotionSampleMap, double positiveCount,
			double negativeCount, double medCount) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			double negRate = emotionSample.getNegativeCount()/negativeCount;
			double posRate = emotionSample.getPositiveCount()/positiveCount;
			double medRate = emotionSample.getMedCount()/medCount;
			emotionSample.I_EmotionRatio(negRate + posRate + medRate);
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public double findTotalKeyCount(Map<String, EmotionSample> emotionSampleMap) {
		double output = StablePOS.INT_ONE;
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			output += emotionSample.getNegativeCount() + emotionSample.getPositiveCount()
			+ emotionSample.getMedCount();
		}
		return output;
	}

	@Override
	public void IQ_Motivation(Map<String, EmotionSample> emotionSampleMap, Map<String, Object> motivation) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			if(motivation.containsKey(word)) {
				emotionSample.I_Motivation(motivation.get(word).toString());
			}  
			emotionSampleMap.put(word, emotionSample);
		}	
	}

	@Override
	public void IQ_Trending(Map<String, EmotionSample> emotionSampleMap, Map<String, Object> trending) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			if(trending.containsKey(word)) {
				emotionSample.I_Trending(trending.get(word).toString());
			}  
			emotionSampleMap.put(word, emotionSample);
		}		
	}

	@Override
	public void IQ_Prediction(Map<String, EmotionSample> emotionSampleMap, Map<String, Object> prediction) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			if(prediction.containsKey(emotionSample.getTrending())) {
				emotionSample.I_Prediction(prediction.get(emotionSample.getTrending()).toString());
			} else if(prediction.containsKey(emotionSample.getMotivation())) {
				emotionSample.I_Prediction(prediction.get(emotionSample.getMotivation()).toString());
			} 
			emotionSampleMap.put(word, emotionSample);
		}	
	}

	@Override
	public void IQ_Distinction(Map<String, EmotionSample> emotionSampleMap, Map<String, Object> distinction) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get(word);
			if(distinction.containsKey(word)) {
				emotionSample.I_Distinction(distinction.get(word).toString());
			}  
			emotionSampleMap.put(word, emotionSample);
		}	
	}

	@Override
	public Map<String, EmotionSample> getEnvironmentSampleMap(Map<Integer, WordFrequency> wordFrequencyMap) {
		Map<String, EmotionSample> output = new HashMap<>();
		for (int i = wordFrequencyMap.size() - StablePOS.INT_ONE; i >= StablePOS.INT_ZERO; i--) {
			if(wordFrequencyMap.get(i).getWord().length() > StablePOS.INT_ONE) {
				EmotionSample emotionSample = new EmotionSample();
				if(!output.containsKey(wordFrequencyMap.get(i).getWord())) {
					output.put(wordFrequencyMap.get(i).getWord(), emotionSample);
				}
			}
		}
		return output;
	}
}
