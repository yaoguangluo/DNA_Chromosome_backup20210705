package ME.utils;

import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;

public class WordFrequencyUtil {
	public static void WordFrequencyFindCheck(Map<String, WordFrequency> outputList,StringBuilder[] fixWords) {
		String string= fixWords[StablePOS.INT_ZERO].toString();
		if (outputList.containsKey(string)) {
			WordFrequency wordFrequency= outputList.get(string);
			wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
			outputList.put(string, wordFrequency);
			return;
		}
		WordFrequency wordFrequency= new WordFrequency();
		wordFrequency.I_Frequency(StablePOS.INT_ONE);
		wordFrequency.I_Word(string);
		outputList.put(string, wordFrequency);
	}

	public static void WordFrequencyCompareCheck(Map<String, WordFrequency> outputList , StringBuilder[] fixWords,
			String countWordNode) {
		if (outputList.containsKey(countWordNode)) {
			WordFrequency wordFrequency=outputList.get(countWordNode);
			wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
			outputList.put(countWordNode, wordFrequency);
			return;
		}
		WordFrequency wordFrequency=new WordFrequency();
		wordFrequency.I_Frequency(StablePOS.INT_ONE);
		wordFrequency.I_Word(fixWords[StablePOS.INT_ZERO].toString());
		outputList.put(countWordNode,wordFrequency);
	}
}