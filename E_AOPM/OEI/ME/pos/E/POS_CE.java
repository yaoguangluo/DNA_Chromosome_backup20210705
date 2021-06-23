package OEI.ME.pos.E;

import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import SVQ.stable.StableMaps;
import OCI.ME.pos.C.POS_C;

public class POS_CE implements POS_C{
	public int chuLiBaDongCiOfTwo(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength,
			String[] strings, StringBuilder[] prefixWord){
		if (!wordsForest.containsKey(prefixWord[StablePOS.INT_ZERO].toString())){
			return countInputStringLength;
		}
		if (StableMaps.daiCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString())
				||StableMaps.fuCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString())) {
			countInputStringLength = parserFirstCharOfTwo(countInputStringLength, outputList, strings, prefixWord);
			return countInputStringLength;
		}
		if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
			outputList.add(strings[StablePOS.INT_ONE]);
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
			return countInputStringLength;
		}
		return countInputStringLength- StablePOS.INT_TWO;
	}

	public int chuLiMingCiOfTwo(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord, int charPosition, String inputString){
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if (StableMaps.liangCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				countInputStringLength= parserFirstCharOfTwo(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			if (StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
					||StableMaps.xingRongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
					||StableMaps.mingCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
					||StableMaps.zhuCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
					||StableMaps.liangCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])) {
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
					outputList.add(strings[StablePOS.INT_ONE]);
					return countInputStringLength;
				}
				countInputStringLength= parserFirstCharOfTwo(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			addFixWordsOfTwo(charPosition, inputString, fixWord);
			if (StablePOS.INT_ZERO< fixWord[StablePOS.INT_ONE].length()&& StableMaps.fuCi.containsKey(StablePOS.EMPTY_STRING
					+ fixWord[StablePOS.INT_ONE].toString().charAt(StablePOS.INT_ZERO))){
				countInputStringLength= parserFirstCharOfTwo(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
				outputList.add(strings[StablePOS.INT_ONE]);
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
				return countInputStringLength;
			}
			countInputStringLength= parserFirstCharOfTwo(countInputStringLength, outputList, strings, fixWord);
			return countInputStringLength;
		}
		return countInputStringLength;
	}
	
	public void addFixWordsOfTwo(int charPosition, String inputString, StringBuilder[] fixWords) {
		fixWords[StablePOS.INT_ONE].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ONE].length());
		if (charPosition+ StablePOS.INT_SEVEN < inputString.length()) {
			fixWords[StablePOS.INT_ONE].append(inputString.substring(charPosition + StablePOS.INT_TWO
					, charPosition + StablePOS.INT_SEVEN));
			return;
		}
		fixWords[StablePOS.INT_ONE].append(inputString.substring(charPosition + StablePOS.INT_TWO
				, inputString.length()));
	}

	public int parserFirstCharOfTwo(int countInputStringLength, List<String> outputList, String[] strings
			, StringBuilder[] fixWord){
		outputList.add(strings[StablePOS.INT_ZERO]);
		String postNext=StablePOS.EMPTY_STRING + strings[StablePOS.INT_ONE].charAt(StablePOS.INT_ONE);
		outputList.add(postNext);
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(postNext);
		return countInputStringLength;
	}

	public int chuLiLianCiPostFixOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputLength,
			String[] strings, StringBuilder[] prefixWord) {
		if (StableMaps.lianCi.containsKey(strings[StablePOS.INT_TWO])){
			countInputLength= parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
			countInputLength= parserFirstTwoCharOfThree(countInputLength, outputList, strings, prefixWord);
			return countInputLength;
		}
		return countInputLength;
	}
	
	public int chuLiLianCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (outputList.size() == StablePOS.INT_ZERO){
			didNotFindFirstChar(outputList, strings, fixWord, wordsForest);
			return countInputStringLength;
		}
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString()) && (StableMaps.mingCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
				|| StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())|| StableMaps.fuCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
				|| StableMaps.daiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString()) || StableMaps.weiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString()))){
			countInputStringLength = parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
			return countInputStringLength;
		}
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString()) && (StableMaps.zhuCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
				|| StableMaps.shengLueCi.containsKey(fixWord[StablePOS.INT_ZERO].toString()))){
			for (int BackPosition = StablePOS.INT_ZERO; BackPosition < fixWord[StablePOS.INT_ONE].length(); BackPosition++){
				int[] nestCountInputStringLength = new int[StablePOS.INT_ONE];
				int result = loopCheckBackFix(fixWord, BackPosition, wordsForest, countInputStringLength, outputList, strings
						, nestCountInputStringLength);
				if (result == StablePOS.INT_RIGHT){
					return nestCountInputStringLength[StablePOS.INT_ZERO];
				}
			}
			if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
				outputList.add(strings[StablePOS.INT_ONE]);
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
				return countInputStringLength- StablePOS.INT_ONE;
			}
			return countInputStringLength- StablePOS.INT_THREE;
		}
		if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
			outputList.add(strings[StablePOS.INT_ONE]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			return countInputStringLength- StablePOS.INT_ONE;
		}
		return countInputStringLength- StablePOS.INT_THREE;
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

	public int chuLiZhuCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (StablePOS.INT_ZERO== outputList.size()){
			didNotFindFirstChar(outputList, strings, fixWord, wordsForest);
			return countInputStringLength;
		}
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if (StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				if(wordsForest.containsKey(strings[StablePOS.INT_TWO])) {
					countInputStringLength = parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
					return countInputStringLength;
				}
				outputList.add(strings[StablePOS.INT_ZERO]);
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
				return 	countInputStringLength= StablePOS.INT_ONE;
			} else if(fixWord[StablePOS.INT_ONE].length()> StablePOS.INT_ONE) {
				String firstChar= StablePOS.EMPTY_STRING+ fixWord[StablePOS.INT_ONE].toString().charAt(StablePOS.INT_ZERO);
				String secondChar= StablePOS.EMPTY_STRING+ fixWord[StablePOS.INT_ONE].toString().charAt(StablePOS.INT_ONE);
				if(!StableMaps.fuCi.containsKey(firstChar)&& !StableMaps.fuCi.containsKey(secondChar)
						&&!StableMaps.fuCi.containsKey(firstChar+ secondChar)) {
					if(wordsForest.containsKey(firstChar)&& wordsForest.containsKey(secondChar)) {
						outputList.add(strings[StablePOS.INT_ZERO]);
						fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
						fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
						countInputStringLength= StablePOS.INT_ONE;
						if(wordsForest.containsKey(strings[StablePOS.INT_TWO])) {
							outputList.add(strings[StablePOS.INT_TWO]);
							fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
							fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
							countInputStringLength= StablePOS.INT_THREE;
						}
						return countInputStringLength;
					}
				}
			}
			if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
				outputList.add(strings[StablePOS.INT_ONE]);
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
				return countInputStringLength- StablePOS.INT_ONE;
			}
			if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_TWO])){
				outputList.add(strings[StablePOS.INT_ZERO]);
				outputList.add(strings[StablePOS.INT_TWO]);
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
				return countInputStringLength;
			}
		}
		return countInputStringLength;
	}

	public int chuLiJieCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (StablePOS.INT_ZERO== outputList.size()&& (wordsForest.get(strings[StablePOS.INT_TWO])
				.contains(StablePOS.NLP_CI_WEI))){
			outputList.add(strings[StablePOS.INT_ZERO]);
			outputList.add(strings[StablePOS.INT_TWO]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
			return countInputStringLength;
		}
		if (outputList.size() > StablePOS.INT_ZERO&& wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if (StableMaps.qingTaiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
					|| StableMaps.weiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
					|| StableMaps.lianCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			} else{
				if(StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())) {
					if(StableMaps.xingWeiCi.containsKey(strings[StablePOS.INT_ONE])
							|| StableMaps.xingRongCi.containsKey(strings[StablePOS.INT_ONE])) {
						countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
						return countInputStringLength;
					}
				}
				if (StableMaps.mingCi.containsKey(strings[StablePOS.INT_TWO])){
					outputList.add(strings[StablePOS.INT_ZERO]);
					outputList.add(strings[StablePOS.INT_TWO]);
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
					return countInputStringLength;
				}else if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
					if(StableMaps.jieCi.containsKey(strings[StablePOS.INT_ONE])) {
						countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
						return countInputStringLength;
					}
					outputList.add(strings[StablePOS.INT_ONE]);
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
					countInputStringLength = StablePOS.INT_TWO;
					return countInputStringLength;
				}else if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_TWO])){
					outputList.add(strings[StablePOS.INT_ZERO]);
					outputList.add(strings[StablePOS.INT_TWO]);
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
					return countInputStringLength;
				}
			}
		}
		if(StableMaps.jieCi.containsKey(strings[StablePOS.INT_ONE])) {
			countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
			return countInputStringLength;
		}
		outputList.add(strings[StablePOS.INT_ZERO]);
		if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_TWO])) {
			outputList.add(strings[StablePOS.INT_TWO]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
			return countInputStringLength;
		}
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
		return countInputStringLength= StablePOS.INT_ONE;
	}

	public int chuLiLiangCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if (StableMaps.mingCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())|| StableMaps.daiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				countInputStringLength = parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			} 
			if (StableMaps.liangCi.containsKey(strings[StablePOS.INT_ONE])){
				outputList.add(strings[StablePOS.INT_ONE]);
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
				return StablePOS.INT_TWO;
			}
			if ((StableMaps.xingWeiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())||StableMaps.xingRongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString()))
					&& StableMaps.mingCi.containsKey(strings[StablePOS.INT_ONE])){
				outputList.add(strings[StablePOS.INT_ONE]);
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
				return StablePOS.INT_TWO;
			}
		}
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
		outputList.add(strings[StablePOS.INT_ZERO]);
		if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_TWO])){
			outputList.add(strings[StablePOS.INT_TWO]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
			return StablePOS.INT_THREE;
		}
		return  StablePOS.INT_ONE;
	}

	public int chuLiMingCiOfTwoForMap(Map<String, String> wordsForest,  Map<String, WordFrequency> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if (StableMaps.liangCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				countInputStringLength = parserFirstCharOfTwoForMap(countInputStringLength, outputList, strings, fixWord
						, wordsForest);
				return countInputStringLength;
			}
			countInputStringLength -= StablePOS.INT_TWO;
			if (wordsForest.containsKey(strings[StablePOS.INT_ONE])){
				if (outputList.containsKey(strings[StablePOS.INT_ONE])){
					WordFrequency wordFrequency = outputList.get(strings[StablePOS.INT_ONE]);
					wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
					outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
				} else{
					WordFrequency wordFrequency = new WordFrequency();
					wordFrequency.I_Frequency(StablePOS.INT_ONE);
					wordFrequency.I_Word(strings[StablePOS.INT_ONE]);
					outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
				}
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
				countInputStringLength += StablePOS.INT_TWO;
			}
			return countInputStringLength;
		}
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

	public int chuLiLiangCiOfThreeForMap(Map<String, String> wordsForest, Map<String, WordFrequency> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if (StableMaps.mingCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())|| StableMaps.daiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				countInputStringLength= parserFirstCharOfThreeForMap(countInputStringLength, outputList, strings, fixWord
						, wordsForest);
				return countInputStringLength;
			} 
			countInputStringLength -= StablePOS.INT_THREE;
			if (wordsForest.containsKey(strings[StablePOS.INT_ONE])){
				if (outputList.containsKey(strings[StablePOS.INT_ONE])){
					WordFrequency wordFrequency = outputList.get(strings[StablePOS.INT_ONE]);
					wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
					outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
				} else{
					WordFrequency wordFrequency = new WordFrequency();
					wordFrequency.I_Frequency(StablePOS.INT_ONE);
					wordFrequency.I_Word(strings[StablePOS.INT_ONE]);
					outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
				}
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
				countInputStringLength += StablePOS.INT_TWO;
			}
			return countInputStringLength;
		}
		return countInputStringLength;
	}

	public int chuLiJieCiOfThreeForMap(Map<String, String> wordsForest, Map<String, WordFrequency> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (outputList.size()== StablePOS.INT_ZERO&& StableMaps.weiCi.containsKey(strings[StablePOS.INT_TWO])){
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
			return countInputStringLength;
		}
		if (outputList.size()> StablePOS.INT_ZERO&& wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if (StableMaps.lianCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())|| StableMaps.qingTaiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
					|| StableMaps.weiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				countInputStringLength= parserFirstCharOfThreeForMap(countInputStringLength, outputList, strings, fixWord, wordsForest);
				return countInputStringLength;
			} else{
				countInputStringLength-= StablePOS.INT_THREE;
				if (wordsForest.containsKey(strings[StablePOS.INT_ONE])){
					if (outputList.containsKey(strings[StablePOS.INT_ONE])){
						WordFrequency wordFrequency= outputList.get(strings[StablePOS.INT_ONE]);
						wordFrequency.I_Frequency(wordFrequency.getFrequency()+ StablePOS.INT_ONE);
						outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
					} else{
						WordFrequency wordFrequency= new WordFrequency();
						wordFrequency.I_Frequency(StablePOS.INT_ONE);
						wordFrequency.I_Word(strings[StablePOS.INT_ONE]);
						outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
					}
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
					countInputStringLength+= StablePOS.INT_TWO;
				}
				return countInputStringLength;
			}
		}
		return countInputStringLength;
	}

	public int chuLiLianCiOfThreeForMap(Map<String, String> wordsForest, Map<String, WordFrequency>  outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (outputList.size()== StablePOS.INT_ZERO){
			didNotFindFirstCharForMap(outputList, strings, fixWord, wordsForest);
			return countInputStringLength;
		}
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString()) 
				&& (StableMaps.mingCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
						|| StableMaps.daiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
						|| StableMaps.weiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
						|| StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
						|| StableMaps.fuCi.containsKey(fixWord[StablePOS.INT_ZERO].toString()))){
			countInputStringLength = parserFirstCharOfThreeForMap(countInputStringLength, outputList, strings, fixWord, wordsForest);
			return countInputStringLength;
		}
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString()) 
				&& (StableMaps.zhuCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())
						|| StableMaps.shengLueCi.containsKey(fixWord[StablePOS.INT_ZERO].toString()))){
			for (int BackPosition= StablePOS.INT_ZERO; BackPosition< fixWord[StablePOS.INT_ONE].length(); BackPosition++){
				int[] nestCountInputStringLength = new int[StablePOS.INT_ONE];
				int result= loopCheckBackFixForMap(fixWord, BackPosition, wordsForest, countInputStringLength, outputList, strings
						, nestCountInputStringLength);
				if (result== StablePOS.INT_RIGHT){
					return nestCountInputStringLength[StablePOS.INT_ZERO];
				}
			}
			countInputStringLength-= StablePOS.INT_THREE;
			if (wordsForest.containsKey(strings[StablePOS.INT_ONE])){
				if (outputList.containsKey(strings[StablePOS.INT_ONE])){
					WordFrequency wordFrequency= outputList.get(strings[StablePOS.INT_ONE]);
					wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
					outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
				} else{
					WordFrequency wordFrequency = new WordFrequency();
					wordFrequency.I_Frequency(StablePOS.INT_ONE);
					wordFrequency.I_Word(strings[StablePOS.INT_ONE]);
					outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
				}
				fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
				fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
				countInputStringLength += StablePOS.INT_TWO;
			}
			return countInputStringLength;
		}
		countInputStringLength-= StablePOS.INT_THREE;
		if (wordsForest.containsKey(strings[StablePOS.INT_ONE])){
			if (outputList.containsKey(strings[StablePOS.INT_ONE])){
				WordFrequency wordFrequency = outputList.get(strings[StablePOS.INT_ONE]);
				wordFrequency.I_Frequency(wordFrequency.getFrequency()+ StablePOS.INT_ONE);
				outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
			} else{
				WordFrequency wordFrequency= new WordFrequency();
				wordFrequency.I_Frequency(StablePOS.INT_ONE);
				wordFrequency.I_Word(strings[StablePOS.INT_ONE]);
				outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
			}
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			countInputStringLength+= StablePOS.INT_TWO;
		}
		return countInputStringLength;
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

	public int chuLiZhuCiOfThreeForMap(Map<String, String> wordsForest, Map<String, WordFrequency>  outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord){
		if (StablePOS.INT_ZERO== outputList.size()){
			didNotFindFirstCharForMap(outputList, strings, fixWord, wordsForest);
			return countInputStringLength;
		}
		if (wordsForest.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if (StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				countInputStringLength= parserFirstCharOfThreeForMap(countInputStringLength, outputList, strings, fixWord, wordsForest);
				return countInputStringLength;
			} else{
				countInputStringLength-= StablePOS.INT_THREE;
				if (wordsForest.containsKey(strings[StablePOS.INT_ONE])){
					if (outputList.containsKey(strings[StablePOS.INT_ONE])){
						WordFrequency wordFrequency= outputList.get(strings[StablePOS.INT_ONE]);
						wordFrequency.I_Frequency(wordFrequency.getFrequency()+ StablePOS.INT_ONE);
						outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
					} else{
						WordFrequency wordFrequency= new WordFrequency();
						wordFrequency.I_Frequency(StablePOS.INT_ONE);
						wordFrequency.I_Word(strings[StablePOS.INT_ONE]);
						outputList.put(strings[StablePOS.INT_ONE], wordFrequency);
					}
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
					countInputStringLength+= StablePOS.INT_TWO;
				}
				return countInputStringLength;
			}
		}
		return countInputStringLength;
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

	public int chuLiMingCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength,
			String[] strings, StringBuilder[] fixWord){
		if (StableMaps.xingWeiCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())|| StableMaps.mingCi
				.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
			if(StableMaps.dongCi.containsKey(strings[StablePOS.INT_TWO])){
				countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			if(StableMaps.dongCi.containsKey(strings[StablePOS.INT_THREE])){
				if(StableMaps.fuCi.containsKey(StablePOS.EMPTY_STRING+ (0== fixWord[StablePOS.INT_ONE].length()? "@^_^@": fixWord[StablePOS.INT_ONE].charAt(StablePOS.INT_ZERO)))){
					if(StableMaps.dongCi.containsKey(strings[StablePOS.INT_ONE])|| StableMaps.qingTaiCi.containsKey(strings[StablePOS.INT_ONE])) {
						countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
						return countInputStringLength;
					}
					outputList.add(strings[StablePOS.INT_ZERO]);
					if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_TWO])){
						outputList.add(strings[StablePOS.INT_TWO]);
						fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
						fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
						return countInputStringLength;
					}
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
					return countInputStringLength= StablePOS.INT_ONE;
				}
				if(!StableMaps.dingMingCi.containsKey(strings[StablePOS.INT_ZERO])){
					if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
						countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
						return countInputStringLength;
					}
					outputList.add(strings[StablePOS.INT_ZERO]);
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
					return countInputStringLength= StablePOS.INT_ONE;
				}
			}
			if(StableMaps.mingCi.containsKey(strings[StablePOS.INT_TWO])){
				if(StablePOS.INT_ZERO< fixWord[StablePOS.INT_ONE].length()&& StableMaps.zhuCi.containsKey(StablePOS.EMPTY_STRING
						+ fixWord[StablePOS.INT_ONE].charAt(StablePOS.INT_ZERO))){
					if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])) {
						if(!StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
							countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
							return countInputStringLength;
						}
						countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
						return countInputStringLength;
					}
					outputList.add(strings[StablePOS.INT_ZERO]);
					fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
					fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
					return countInputStringLength= StablePOS.INT_ONE;
				}
				countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			if(StableMaps.mingCi.containsKey(strings[StablePOS.INT_ONE])|| StableMaps.fuCi.containsKey(strings[StablePOS.INT_ONE])){
				countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_TWO])){
				countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			outputList.add(strings[StablePOS.INT_ZERO]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
			countInputStringLength= StablePOS.INT_ONE;
			return countInputStringLength;
		} 
		if(StableMaps.dongCi.containsKey(strings[StablePOS.INT_THREE])){
			if(StableMaps.dongCi.containsKey(strings[StablePOS.INT_TWO])){
				if(StableMaps.mingCi.containsKey(strings[StablePOS.INT_ZERO])) {
					countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
					return countInputStringLength;
				}
			}
			if(null!= fixWord[StablePOS.INT_ZERO]&& StablePOS.INT_ZERO<fixWord[StablePOS.INT_ZERO].length()){
				if(StableMaps.zhuCi.containsKey(StablePOS.EMPTY_STRING+ fixWord[StablePOS.INT_ZERO].charAt(StablePOS.INT_ZERO))){
					if(!StableMaps.mingCi.containsKey(strings[StablePOS.INT_ONE])) {
						countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);	
						return countInputStringLength;
					}
				}
			}
			if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])) {
				countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);	
				return countInputStringLength;
			}
			countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
			return countInputStringLength;
		}
		if(StableMaps.mingCi.containsKey(strings[StablePOS.INT_TWO])){
			if(StablePOS.INT_ZERO< fixWord[StablePOS.INT_ONE].length()&& StableMaps.zhuCi.containsKey(StablePOS.EMPTY_STRING
					+ fixWord[StablePOS.INT_ONE].charAt(StablePOS.INT_ZERO))){
				if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
					if(!StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
						countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
						return countInputStringLength;
					}
					countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
					return countInputStringLength;
				}
				countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			if(StablePOS.INT_ZERO< fixWord[StablePOS.INT_ONE].length()&& StableMaps.dingMingCi.containsKey(StablePOS.EMPTY_STRING
					+ fixWord[StablePOS.INT_ONE].charAt(StablePOS.INT_ZERO))){
				countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
				return countInputStringLength;
			}
			if(StableMaps.dongCi.containsKey(fixWord[StablePOS.INT_ZERO].toString())){
				if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
					countInputStringLength= parserFirstTwoCharOfThree(countInputStringLength, outputList, strings, fixWord);
					return countInputStringLength;
				}
			}
			countInputStringLength= parserFirstCharOfThree(countInputStringLength, outputList, strings, fixWord);
			return countInputStringLength;
		}
		if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
			outputList.add(strings[StablePOS.INT_ONE]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
			countInputStringLength= StablePOS.INT_TWO;
			return countInputStringLength;
		}
		outputList.add(strings[StablePOS.INT_ZERO]);
		if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_TWO])) {
			outputList.add(strings[StablePOS.INT_TWO]);
			fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
			fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
			return countInputStringLength;
		}
		fixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWord[StablePOS.INT_ZERO].length());
		fixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
		return countInputStringLength= StablePOS.INT_ONE;
	}

	public int chuLiShiTaiCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputLength,
			String[] strings, StringBuilder[] prefixWord) {
		if ((StableMaps.mingCi.containsKey(strings[StablePOS.INT_TWO].toString()))
				&& (StableMaps.jieCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString())
						|| StableMaps.xingWeiCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString())
						|| StableMaps.dongCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString()))){
			countInputLength= parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.dongCi.containsKey(strings[StablePOS.INT_TWO].toString())
				||StableMaps.liangCi.containsKey(strings[StablePOS.INT_TWO].toString())) {
			countInputLength= parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])){
			outputList.add(strings[StablePOS.INT_ONE]);
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ONE]);
			countInputLength= StablePOS.INT_TWO;
			return countInputLength;
		}
		outputList.add(strings[StablePOS.INT_ZERO]);
		if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_TWO])) {
			outputList.add(strings[StablePOS.INT_TWO]);
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_TWO]);
			return countInputLength;
		}
		prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
		prefixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
		return countInputLength= StablePOS.INT_ONE;
	}

	public int chuLiFuCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputLength,
			String[] strings, StringBuilder[] prefixWord) {
		if (StableMaps.fuCi.containsKey(strings[StablePOS.INT_TWO].toString())) {
			if (StableMaps.fuCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString())) {
				countInputLength= parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
				return countInputLength;
			}
		}
		if (StableMaps.dongCi.containsKey(strings[StablePOS.INT_TWO].toString())) {
			if (StableMaps.zhuCi.containsKey(StablePOS.EMPTY_STRING+ prefixWord[StablePOS.INT_ONE].charAt(StablePOS.INT_ZERO))
					|| StableMaps.daiCi.containsKey(StablePOS.EMPTY_STRING+ prefixWord[StablePOS.INT_ONE].charAt(StablePOS.INT_ZERO))) {
				countInputLength= parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
				return countInputLength;
			}
		}
		if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])) {
			countInputLength= parserFirstTwoCharOfThree(countInputLength, outputList, strings, prefixWord);
			return countInputLength;
		}
		outputList.add(strings[StablePOS.INT_ZERO]);
		prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
		prefixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
		return StablePOS.INT_ONE;
	}
}