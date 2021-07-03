package OEI.ME.pos.E;

import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import SVQ.stable.StableMaps;
import OCI.ME.pos.C.Pos_C_XCDX_E;

public class Pos_CE_XCDX_E extends Pos_CE_XCDX_O implements Pos_C_XCDX_E{
	
	public void I_FixWordsOfTwo(int charPosition, String inputString, StringBuilder[] fixWords) {
		fixWords[StablePOS.INT_ONE].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ONE].length());
		if (charPosition+ StablePOS.INT_SEVEN < inputString.length()) {
			fixWords[StablePOS.INT_ONE].append(inputString.substring(charPosition + StablePOS.INT_TWO
					, charPosition + StablePOS.INT_SEVEN));
			return;
		}
		fixWords[StablePOS.INT_ONE].append(inputString.substring(charPosition + StablePOS.INT_TWO
				, inputString.length()));
	}

	public int loopCheckBackFix(StringBuilder[] fixWord, int backPosition, Map<String, String> wordsForest
			, int countInputStringLength, List<String> outputList, String[] strings, int[] nestCountInputStringLength){
		String charPositionAtFixWord = StablePOS.EMPTY_STRING + fixWord[StablePOS.INT_ONE].charAt(backPosition);
		if (wordsForest.containsKey(charPositionAtFixWord) && (StableMaps.zhuCi.containsKey(charPositionAtFixWord) 
				|| StableMaps.shengLueCi.containsKey(charPositionAtFixWord)|| StableMaps.fuCi.containsKey(charPositionAtFixWord))){
			if(!wordsForest.get(fixWord[StablePOS.INT_ZERO].toString()).contains(StablePOS.NLP_CI_SHENG_LUE)
					&& wordsForest.get(charPositionAtFixWord).contains(StablePOS.NLP_CI_FU)){
				return StablePOS.INT_ERROR;
			}
			nestCountInputStringLength[StablePOS.INT_ZERO]= parserFirstCharOfThree(countInputStringLength, outputList
					, strings, fixWord);	
			return StablePOS.INT_RIGHT;
		}
		return StablePOS.INT_ERROR;
	}

	public void didNotFindFirstChar(List<String> outputList, String[] strings, StringBuilder[] fixWord
			, Map<String, String> wordsForest){
		if(!wordsForest.containsKey(strings[StablePOS.INT_TWO])){
			if(wordsForest.containsKey(strings[StablePOS.INT_ONE])){
				outputList.add(strings[StablePOS.INT_ONE]);
				outputList.add(strings[StablePOS.INT_THREE]);
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_THREE]);
			}
			return;
		}
		if (StableMaps.fuCi.containsKey(strings[StablePOS.INT_TWO])){
			outputList.add(strings[StablePOS.INT_ZERO]);
			outputList.add(strings[StablePOS.INT_TWO]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
			return;
		}
		if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
			outputList.add(strings[StablePOS.INT_ONE]);
			outputList.add(strings[StablePOS.INT_THREE]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_THREE]);
		}
	}

	public int loopCheckBackFixForMap(StringBuilder[] fixWord, int backPosition, Map<String, String> wordsForest
			, int countInputStringLength, Map<String, WordFrequency> outputList, String[] strings, int[] nestCountInputStringLength){
		String charPositionAtFixWord= StablePOS.EMPTY_STRING+ fixWord[StablePOS.INT_ONE].charAt(backPosition);
		if (wordsForest.containsKey(charPositionAtFixWord)&& (StableMaps.zhuCi.containsKey(charPositionAtFixWord) 
				|| wordsForest.get(charPositionAtFixWord).contains(StablePOS.NLP_CI_SHENG_LUE))){
			nestCountInputStringLength[StablePOS.INT_ZERO]= parserFirstCharOfThreeForMap(countInputStringLength, outputList
					, strings, fixWord, wordsForest);
			return StablePOS.INT_RIGHT;
		}
		return StablePOS.INT_ERROR;
	}

	

	public void didNotFindFirstCharForMap(Map<String, WordFrequency> outputList, String[] strings, StringBuilder[] fixWord
			, Map<String, String> wordsForest){
		if(!wordsForest.containsKey(strings[StablePOS.INT_TWO])){
			return;
		}
		if (StableMaps.fuCi.containsKey(strings[StablePOS.INT_TWO])){
			if (outputList.containsKey(strings[StablePOS.INT_ZERO])){
				WordFrequency wordFrequency= outputList.get(strings[StablePOS.INT_ZERO]);
				wordFrequency.I_Frequency(wordFrequency.getFrequency()+ StablePOS.INT_ONE);
				outputList.put(strings[StablePOS.INT_ZERO], wordFrequency);
			} else{
				WordFrequency wordFrequency= new WordFrequency();
				wordFrequency.I_Frequency(StablePOS.INT_ONE);
				wordFrequency.I_Word(strings[StablePOS.INT_ZERO]);
				outputList.put(strings[StablePOS.INT_ZERO], wordFrequency);
			}
			if (outputList.containsKey(strings[StablePOS.INT_TWO])){
				WordFrequency wordFrequency= outputList.get(strings[StablePOS.INT_TWO]);
				wordFrequency.I_Frequency(wordFrequency.getFrequency()+ StablePOS.INT_ONE);
				outputList.put(strings[StablePOS.INT_TWO], wordFrequency);
			} else{
				WordFrequency wordFrequency= new WordFrequency();
				wordFrequency.I_Frequency(StablePOS.INT_ONE);
				wordFrequency.I_Word(strings[StablePOS.INT_TWO]);
				outputList.put(strings[StablePOS.INT_TWO], wordFrequency);
			}
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
		}
	}
}