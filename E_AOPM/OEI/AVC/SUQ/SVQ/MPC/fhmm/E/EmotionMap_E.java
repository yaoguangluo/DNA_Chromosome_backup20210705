package OEI.AVC.SUQ.SVQ.MPC.fhmm.E;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import SVQ.stable.StablePOS;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;

public class EmotionMap_E implements EmotionMap{
	private Map<String, Object> positiveMap;
	private Map<String, Object> negativeMap;
	private Map<String, Object> motivationMap;
	private Map<String, Object> trendingMap;
	private Map<String, Object> predictionMap;
	private Map<String, Object> distinctionMap;
	
	public Map<String, Object> getPredictionMap() {
		return predictionMap;
	}

	public void I_PredictionMap(Map<String, Object> predictionMap) {
		this.predictionMap = predictionMap;
	}
	
	public Map<String, Object> getPositiveMap() {
		return positiveMap;
	}

	public void I_PositiveMap(Map<String, Object> positiveMap) {
		this.positiveMap = positiveMap;
	}

	public Map<String, Object> getNegativeMap() {
		return negativeMap;
	}

	public void I_NegativeMap(Map<String, Object> negativeMap) {
		this.negativeMap = negativeMap;
	}

	public Map<String, Object> getMotivationMap() {
		return motivationMap;
	}

	public void I_MotivationMap(Map<String, Object> motivationMap) {
		this.motivationMap = motivationMap;
	}

	public Map<String, Object> getTrendingMap() {
		return trendingMap;
	}

	public void I_TrendingMap(Map<String, Object> trendingMap) {
		this.trendingMap = trendingMap;
	}

	public Map<String, Object> getDistinctionMap() {
		return distinctionMap;
	}

	public void I_DistinctionMap(Map<String, Object> distinctionMap) {
		this.distinctionMap = distinctionMap;
	}
	
	public void IV_PositiveMap() throws IOException{
		positiveMap = new HashMap<>();
		InputStream in = getClass().getResourceAsStream(StablePOS.WORDS_SOURSE_LINK_POS_POSITIVE);
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, StablePOS.UTF8_STRING));
		String cInputString;
		while ((cInputString = cReader.readLine()) != null) {
			if(!positiveMap.containsKey(cInputString)) {
				positiveMap.put(cInputString, true);
			}
		}
		cReader.close();
	}
	
	public void IV_MotivationMap() throws IOException{
		motivationMap = new HashMap<>();
		InputStream in = getClass().getResourceAsStream(StablePOS.WORDS_SOURSE_LINK_MOTIVATION);
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, StablePOS.UTF8_STRING));
		String cInputString;
		while ((cInputString = cReader.readLine()) != null) {
			String[] value = cInputString.split(StablePOS.NLP_SYMBO_SLASH);
			if(!motivationMap.containsKey(value[StablePOS.INT_ZERO])) {
				motivationMap.put(value[StablePOS.INT_ZERO], value[StablePOS.INT_ONE]);
			}
		}
		cReader.close();
	}
	
	public void IV_TrendingMap() throws IOException{
		trendingMap = new HashMap<>();
		InputStream in = getClass().getResourceAsStream(StablePOS.WORDS_SOURSE_LINK_TRENDING);
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, StablePOS.UTF8_STRING));
		String cInputString;
		while ((cInputString = cReader.readLine()) != null) {
			String[] value= cInputString.split(StablePOS.NLP_SYMBO_SLASH);
			if(!trendingMap.containsKey(value[StablePOS.INT_ZERO])) {
				trendingMap.put(value[StablePOS.INT_ZERO], value[StablePOS.INT_ONE]);
			}
		}
		cReader.close();
	}
	
	public void IV_NegativeMap() throws IOException{
		negativeMap = new HashMap<>();
		InputStream in = getClass().getResourceAsStream(StablePOS.WORDS_SOURSE_LINK_POS_NEGATIVE);
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, StablePOS.UTF8_STRING));
		String cInputString;
		while ((cInputString = cReader.readLine()) != null) {
			if(!negativeMap.containsKey(cInputString)) {
				negativeMap.put(cInputString, true);
			}
		}
		cReader.close();
	}

	public void IV_PredictionMap() throws IOException {
		predictionMap = new HashMap<>();
		InputStream in = getClass().getResourceAsStream(StablePOS.WORDS_SOURSE_LINK_PREDICTION);
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, StablePOS.UTF8_STRING));
		String cInputString;
		while ((cInputString = cReader.readLine()) != null) {
			String[] value= cInputString.split(StablePOS.NLP_SYMBO_SLASH);
			if(!predictionMap.containsKey(value[StablePOS.INT_ZERO])) {
				predictionMap.put(value[StablePOS.INT_ZERO], value[StablePOS.INT_ONE]);
			}
		}
		cReader.close();
	}

	public void IV_DistinctionMap() throws IOException {
		distinctionMap = new HashMap<>();
		InputStream in = getClass().getResourceAsStream(StablePOS.WORDS_SOURSE_LINK_DISTINCTION);
		BufferedReader cReader = new BufferedReader(new InputStreamReader(in, StablePOS.UTF8_STRING));
		String cInputString;
		while ((cInputString = cReader.readLine()) != null) {
			String[] value= cInputString.split(StablePOS.NLP_SYMBO_SLASH);
			if(!distinctionMap.containsKey(value[StablePOS.INT_ZERO])) {
				distinctionMap.put(value[StablePOS.INT_ZERO], value[StablePOS.INT_ONE]);
			}
		}
		cReader.close();
	}
}