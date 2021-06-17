package ME.utils;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
public class WordForestUtil {
	public static void wordsForestNotContainsKey(Map<String, WordFrequency> outputList
			, String countWordNode, StringBuilder[] prefixWord) {
		String string= String.valueOf(countWordNode.charAt(StablePOS.INT_ZERO));
		if (outputList.containsKey(string)) {
			WordFrequency wordFrequency = outputList.get(string);
			wordFrequency.setFrequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
			outputList.put(string, wordFrequency);
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(countWordNode.charAt(StablePOS.INT_ZERO));
			return;
		} 
		WordFrequency wordFrequency = new WordFrequency();
		wordFrequency.setFrequency(StablePOS.INT_ONE);
		wordFrequency.setWord(string);
		outputList.put(string, wordFrequency);
		prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
		prefixWord[StablePOS.INT_ZERO].append(countWordNode.charAt(StablePOS.INT_ZERO));
	}

	public static void prefixWordEqualZero(Map<String, WordFrequency> outputList,String countWordNode
			, StringBuilder[] prefixWord) {
		prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
		prefixWord[StablePOS.INT_ZERO].append(countWordNode);
		if (outputList.containsKey(countWordNode)) {
			WordFrequency wordFrequency = outputList.get(countWordNode);
			wordFrequency.setFrequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
			outputList.put(countWordNode, wordFrequency);
			return;
		}
		WordFrequency wordFrequency = new WordFrequency();
		wordFrequency.setFrequency(StablePOS.INT_ONE);
		wordFrequency.setWord(countWordNode);
		outputList.put(countWordNode, wordFrequency);
	}

	public static void wordsForestContainsKey(Map<String, WordFrequency> outputList,String countWordNode
			, StringBuilder[] prefixWord) {
		prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
		prefixWord[StablePOS.INT_ZERO].append(countWordNode);
		if (outputList.containsKey(countWordNode)) {
			WordFrequency wordFrequency = outputList.get(countWordNode);
			wordFrequency.setFrequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
			outputList.put(countWordNode, wordFrequency);
			return;
		} 
		WordFrequency wordFrequency = new WordFrequency();
		wordFrequency.setFrequency(StablePOS.INT_ONE);
		wordFrequency.setWord(countWordNode);
		outputList.put(countWordNode, wordFrequency);
	}
}