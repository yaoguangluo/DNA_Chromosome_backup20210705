package OEI.ME.pos.E;

import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import OCI.ME.pos.C.Pos_C_XCDX_O;

///
/// O  o
/// E  e 
/// P  p
public class Pos_CE_XCDX_O implements Pos_C_XCDX_O{

	public int parserFirstCharOfTwo(int countInputStringLength, List<String> outputList, String[] strings
			, StringBuilder[] fixWord){
		outputList.add(strings[StablePOS.INT_ZERO]);
		String postNext=StablePOS.EMPTY_STRING + strings[StablePOS.INT_ONE].charAt(StablePOS.INT_ONE);
		outputList.add(postNext);
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(postNext);
		return countInputStringLength;
	}

	public int parserFirstCharOfThree(int countInputStringLength, List<String> outputList, String[] strings
			, StringBuilder[] fixWord){
		outputList.add(strings[StablePOS.INT_ZERO]);
		outputList.add(strings[StablePOS.INT_TWO]);
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
		return countInputStringLength;
	}
	
	public int parserFirstTwoCharOfThree(int countInputStringLength, List<String> outputList, String[] strings
			, StringBuilder[] fixWord){
		outputList.add(strings[StablePOS.INT_ONE]);
		outputList.add(strings[StablePOS.INT_THREE]);
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_THREE]);
		return countInputStringLength;
	}

	public int parserFirstCharOfTwoForMap(int countInputStringLength, Map<String, WordFrequency> outputList, String[] strings
			, StringBuilder[] fixWord, Map<String, String> wordsForest){
		countInputStringLength -= StablePOS.INT_TWO;
		if (outputList.containsKey(strings[StablePOS.INT_ZERO])){
			WordFrequency wordFrequency = outputList.get(strings[StablePOS.INT_ZERO]);
			wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
			outputList.put(strings[StablePOS.INT_ZERO], wordFrequency);
		} else{
			WordFrequency wordFrequency = new WordFrequency();
			wordFrequency.I_Frequency(StablePOS.INT_ONE);
			wordFrequency.I_Word(strings[StablePOS.INT_ZERO]);
			outputList.put(strings[StablePOS.INT_ZERO], wordFrequency);
		}
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
		countInputStringLength += StablePOS.INT_ONE;
		return countInputStringLength;
	}

	public int parserFirstCharOfThreeForMap(int countInputStringLength, Map<String, WordFrequency> outputList, String[] strings
			, StringBuilder[] fixWord, Map<String, String> wordsForest){
		countInputStringLength-= StablePOS.INT_THREE;
		if (outputList.containsKey(strings[StablePOS.INT_ZERO])){
			WordFrequency wordFrequency = outputList.get(strings[StablePOS.INT_ZERO]);
			wordFrequency.I_Frequency(wordFrequency.getFrequency()+ StablePOS.INT_ONE);
			outputList.put(strings[StablePOS.INT_ZERO], wordFrequency);
		} else{
			WordFrequency wordFrequency= new WordFrequency();
			wordFrequency.I_Frequency(StablePOS.INT_ONE);
			wordFrequency.I_Word(strings[StablePOS.INT_ZERO]);
			outputList.put(strings[StablePOS.INT_ZERO], wordFrequency);
		}
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
		countInputStringLength ++;
		if (wordsForest.containsKey(strings[StablePOS.INT_TWO])){
			if (outputList.containsKey(strings[StablePOS.INT_TWO])){
				WordFrequency wordFrequency= outputList.get(strings[StablePOS.INT_TWO]);
				wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
				outputList.put(strings[StablePOS.INT_TWO], wordFrequency);
			} else{
				WordFrequency wordFrequency= new WordFrequency();
				wordFrequency.I_Frequency(StablePOS.INT_ONE);
				wordFrequency.I_Word(strings[StablePOS.INT_TWO]);
				outputList.put(strings[StablePOS.INT_TWO], wordFrequency);
			}
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
			countInputStringLength+= StablePOS.INT_TWO;
			return countInputStringLength;
		}
		return countInputStringLength;
	}
}