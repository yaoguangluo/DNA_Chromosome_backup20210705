package OSU.PEQ.AVC.SUQ.test;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import AEU.AVC.SUQ.engine.EnvironmentInit;
import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import SVQ.stable.StableString;
public class EnvironmentTest{
	public static void main(String[] argv) throws IOException {
		//init
		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.init(StableString.text1);
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
		//reduce
		System.out.println("环    境：");
		Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getDistinction()) {
				System.out.print(emotionSample.getDistinction()+" ");
			}
		}
		System.out.println("");
		System.out.println("动    机：");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getMotivation()) {
				System.out.print(emotionSample.getMotivation()+" ");
			}
		}
		System.out.println("");
		System.out.println("倾    向：" );
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getTrending()) {
				System.out.print(emotionSample.getTrending()+" ");
			}
		}
		//reduce
		System.out.println("");
		System.out.println("决    策：");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getPrediction()) {
				System.out.print(emotionSample.getPrediction()+" ");
			}
		}	
	}
}