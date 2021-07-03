package OEI.ME.nlp.E;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import SVQ.stable.StableMaps;
import ME.utils.WordForestUtil;
//import OCI.ME.nlp.C.NLP_C;
import OCI.ME.nlp.C.Nlp_C_XCDX_A;
//import OCI.ME.pos.C.POS_C;
import OCI.ME.pos.C.Pos_C_XCDX_P;
import OCI.ME.pos.C.Pos_C_XCDX_O;
public class Nlp_CE_XCDX_A implements Nlp_C_XCDX_A{
	public int doSlangPartAndPOSCheckForTwoChar(int countInputStringLength, List<String> outputList
			, StringBuilder stringBuilder, Map<String, String> wordsForest, StringBuilder[] prefixWord
			, Pos_C_XCDX_P posUtils, int charPosition, String textInputString){
		String countWordNode= stringBuilder.toString();
		if (prefixWord[StablePOS.INT_ZERO].length()== StablePOS.INT_ZERO){
			if(StableMaps.CiTwo.containsKey(countWordNode)) {
				prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
				prefixWord[StablePOS.INT_ZERO].append(countWordNode);
				outputList.add(countWordNode);
				return countInputStringLength;
			}
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(stringBuilder.charAt(StablePOS.INT_ZERO));
			outputList.add(StablePOS.EMPTY_STRING+ stringBuilder.charAt(StablePOS.INT_ZERO));
			return countInputStringLength- StablePOS.INT_ONE;
		}
		String[] strings= new String[StablePOS.INT_TWO];
		strings[StablePOS.INT_ZERO]= String.valueOf(countWordNode.charAt(StablePOS.INT_ZERO));
		strings[StablePOS.INT_ONE]= countWordNode;
		if (StableMaps.mingCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputStringLength= posUtils.chuLiMingCiOfTwo(wordsForest, outputList, countInputStringLength
					, strings, prefixWord, charPosition, textInputString);
			return countInputStringLength;
		}
		if (StableMaps.baDongCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputStringLength = posUtils.chuLiBaDongCiOfTwo(wordsForest, outputList, countInputStringLength
					, strings, prefixWord);
			return countInputStringLength;
		}
		if (StableMaps.jieCi.containsKey(strings[StablePOS.INT_ZERO].toString())){
			if (StableMaps.dongCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString())){
				if (!StableMaps.jieCi.containsKey(countWordNode)){
					countInputStringLength= ((Pos_C_XCDX_O)posUtils).parserFirstCharOfTwo(countInputStringLength, outputList, strings, prefixWord);
					return countInputStringLength;
				}
			}
		}
		if (StableMaps.CiTwo.containsKey(countWordNode)){
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(countWordNode);
			outputList.add(countWordNode);
			return countInputStringLength;
		}
		countInputStringLength= ((Pos_C_XCDX_O)posUtils).parserFirstCharOfTwo(countInputStringLength, outputList, strings, prefixWord);
		return countInputStringLength;
	}

	public int doPOSAndEMMCheckOfThree(int countInputLength, List<String> outputList
			, Map<String, String> wordsForest, StringBuilder stringBuilder, StringBuilder[] prefixWord
			, Pos_C_XCDX_P posUtils, int charPosition, String textInputString){
		String inputString= stringBuilder.toString();
		if (StableMaps.CiThree.containsKey(inputString)){
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(inputString);
			outputList.add(inputString);
			return countInputLength;
		}
		String[] strings= new String[StablePOS.INT_FOUR];
		strings[StablePOS.INT_ZERO]= String.valueOf(inputString.charAt(StablePOS.INT_ZERO));
		strings[StablePOS.INT_ONE]= String.valueOf(inputString.charAt(StablePOS.INT_ZERO)) 
				+ inputString.charAt(StablePOS.INT_ONE);
		strings[StablePOS.INT_TWO]= String.valueOf(inputString.charAt(StablePOS.INT_ONE)) 
				+ inputString.charAt(StablePOS.INT_TWO);
		strings[StablePOS.INT_THREE]= String.valueOf(inputString.charAt(StablePOS.INT_TWO));
		if (null== prefixWord[StablePOS.INT_ZERO]){
			if (StableMaps.CiThree.containsKey(inputString)){
				prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
				prefixWord[StablePOS.INT_ZERO].append(inputString);
				outputList.add(inputString);
				return countInputLength;
			} 
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoChar(--countInputLength, outputList
					, stringsBuilder.append(strings[StablePOS.INT_ONE]), wordsForest, prefixWord, posUtils, charPosition, textInputString);
			return countInputLength;
		}
		if (!StableMaps.CiOne.containsKey(strings[StablePOS.INT_ZERO])){
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoChar(--countInputLength, outputList
					, stringsBuilder.append(strings[StablePOS.INT_ONE]), wordsForest, prefixWord, posUtils, charPosition, textInputString);
			return countInputLength;
		}
		if(StableMaps.lianCi.containsKey(strings[StablePOS.INT_THREE])) {
			countInputLength = posUtils.chuLiLianCiPostFixOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.lianCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength = posUtils.chuLiLianCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.jieCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength = posUtils.chuLiJieCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.zhuCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength = posUtils.chuLiZhuCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.liangCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength = posUtils.chuLiLiangCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.mingCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength= posUtils.chuLiMingCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.shiTaiCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength= posUtils.chuLiShiTaiCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.dongCi.containsKey(strings[StablePOS.INT_ZERO])||StableMaps.fuCi.containsKey(strings[StablePOS.INT_ZERO])){
			if(StableMaps.zhuCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString())
					&& (StableMaps.liangCi.containsKey(strings[StablePOS.INT_TWO])
					|| StableMaps.jieCi.containsKey(strings[StablePOS.INT_TWO]))) {
				countInputLength = ((Pos_C_XCDX_O)posUtils).parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
				return countInputLength;
			}
			if(StableMaps.fuCi.containsKey(strings[StablePOS.INT_TWO])||StableMaps.mingCi.containsKey(strings[StablePOS.INT_TWO])
					||StableMaps.daiCi.containsKey(strings[StablePOS.INT_TWO])) {
				countInputLength = ((Pos_C_XCDX_O)posUtils).parserFirstCharOfThree(countInputLength, outputList, strings, prefixWord);
				return countInputLength;
			}
		}
		if (StableMaps.fuCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength= posUtils.chuLiFuCiOfThree(wordsForest, outputList, countInputLength, strings, prefixWord);
			return countInputLength;
		}
		if(StableMaps.CiTwo.containsKey(strings[StablePOS.INT_ONE])) {
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoChar(--countInputLength, outputList, stringsBuilder.append(strings[StablePOS.INT_ONE])
					, wordsForest, prefixWord, posUtils, charPosition, textInputString);
			return countInputLength;
		}
		outputList.add(strings[StablePOS.INT_ZERO]);
		prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
		prefixWord[StablePOS.INT_ZERO].append(strings[StablePOS.INT_ZERO]);
		return StablePOS.INT_ONE;
	} 


	public int doSlangPartAndPOSCheckForTwoCharForMap(int countInputStringLength, Map<String, WordFrequency> outputList
			, StringBuilder stringBuilder, Map<String, String> wordsForest, StringBuilder[] prefixWord
			, Pos_C_XCDX_P posUtils){
		String countWordNode= stringBuilder.toString();
		if (!wordsForest.containsKey(countWordNode)){
			WordForestUtil.wordsForestNotContainsKey(outputList, countWordNode, prefixWord);
			return --countInputStringLength;
		}
		if (prefixWord[StablePOS.INT_ZERO].length()== StablePOS.INT_ZERO){
			WordForestUtil.prefixWordEqualZero(outputList, countWordNode, prefixWord);
			return countInputStringLength;
		}
		String[] strings= new String[StablePOS.INT_TWO];
		strings[StablePOS.INT_ZERO]= String.valueOf(countWordNode.charAt(StablePOS.INT_ZERO));
		strings[StablePOS.INT_ONE]= String.valueOf(countWordNode.charAt(StablePOS.INT_ZERO))
				+ String.valueOf(countWordNode.charAt(StablePOS.INT_ONE));
		if (wordsForest.containsKey(strings[StablePOS.INT_ZERO])){
			if (wordsForest.get(strings[StablePOS.INT_ZERO]).contains(StablePOS.NLP_CI_MING)){
				countInputStringLength= posUtils.chuLiMingCiOfTwoForMap(wordsForest, outputList, countInputStringLength
						, strings, prefixWord);
				return countInputStringLength;
			}
		}
		if (wordsForest.containsKey(strings[StablePOS.INT_ONE])){
			WordForestUtil.wordsForestContainsKey(outputList, countWordNode, prefixWord);
			return countInputStringLength;
		}
		return StablePOS.INT_ZERO;
	}

	public int doPOSAndEMMCheckOfThreeForMap(int countInputLength, Map<String, WordFrequency> outputList
			, Map<String, String> wordsForest, StringBuilder stringBuilder, StringBuilder[] prefixWord
			, Pos_C_XCDX_P posUtils){
		String inputString= stringBuilder.toString();
		if (wordsForest.containsKey(inputString)){
			WordForestUtil.wordsForestContainsKey(outputList, inputString, prefixWord);
			return countInputLength;
		}
		String[] strings= new String[StablePOS.INT_FOUR];
		strings[StablePOS.INT_ZERO]= String.valueOf(inputString.charAt(StablePOS.INT_ZERO));
		strings[StablePOS.INT_ONE]= String.valueOf(inputString.charAt(StablePOS.INT_ZERO)) 
				+ inputString.charAt(StablePOS.INT_ONE);
		strings[StablePOS.INT_TWO]= String.valueOf(inputString.charAt(StablePOS.INT_ONE) 
				+ inputString.charAt(StablePOS.INT_TWO));
		strings[StablePOS.INT_THREE]= String.valueOf(inputString.charAt(StablePOS.INT_TWO));
		if (null== prefixWord[StablePOS.INT_ZERO]){
			if (wordsForest.containsKey(inputString)){
				WordForestUtil.wordsForestContainsKey(outputList, inputString, prefixWord);
				return countInputLength;
			} 
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoCharForMap(--countInputLength, outputList
					, stringsBuilder.append(strings[StablePOS.INT_ONE]), wordsForest, prefixWord, posUtils);
			return countInputLength;
		}
		if (!wordsForest.containsKey(strings[StablePOS.INT_ZERO])){
			StringBuilder stringsBuilder= new StringBuilder();
			countInputLength= doSlangPartAndPOSCheckForTwoCharForMap(--countInputLength, outputList
					, stringsBuilder.append(strings[StablePOS.INT_ONE]), wordsForest, prefixWord, posUtils);
			return countInputLength;
		}
		if (StableMaps.zhuCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength= posUtils.chuLiZhuCiOfThreeForMap(wordsForest, outputList, countInputLength
					, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.liangCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength= posUtils.chuLiLiangCiOfThreeForMap(wordsForest, outputList, countInputLength
					, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.zhuCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength= posUtils.chuLiJieCiOfThreeForMap(wordsForest, outputList, countInputLength
					, strings, prefixWord);
			return countInputLength;
		}
		if (StableMaps.lianCi.containsKey(strings[StablePOS.INT_ZERO])){
			countInputLength= posUtils.chuLiLianCiOfThreeForMap(wordsForest, outputList, countInputLength
					, strings, prefixWord);
			return countInputLength;
		}
		StringBuilder stringsBuilder= new StringBuilder();
		countInputLength= doSlangPartAndPOSCheckForTwoCharForMap(--countInputLength, outputList
				, stringsBuilder.append(strings[StablePOS.INT_ONE]), wordsForest, prefixWord, posUtils);
		return countInputLength;
	} 
}