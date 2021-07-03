package OEI.ME.nlp.E;
import java.util.List;

import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import SVQ.stable.StableMaps;
import ME.utils.WordForestUtil;
import OCI.ME.nlp.C.NLP_C;
//import OCI.ME.pos.C.POS_C;
import OCI.ME.pos.C.Pos_C_XCDX_P;
import OCI.ME.pos.C.Pos_C_XCDX_O;
public class NLP_CE implements NLP_C{
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
// 2个月研究发现 词性越来越多, 根据笛摩根定律, 先把未知词汇也添加到条件中. 之后采用 排除法优化.
//	if(StableMaps.jieCi.containsKey(preRegister)|| StableMaps.mingCi.containsKey(preRegister)|| StableMaps.xingRongCi.containsKey(preRegister)
//	|| StableMaps.fuCi.containsKey(preRegister)|| StableMaps.dongCi.containsKey(preRegister)|| StableMaps.lianCi.containsKey(preRegister)
//	|| StableMaps.liangCi.containsKey(preRegister)|| StableMaps.xingWeiCi.containsKey(preRegister)|| StableMaps.shiTaiCi.containsKey(preRegister)
//	|| StableMaps.zhuCi.containsKey(preRegister)) {
//if(StableMaps.mingCi.containsKey(postRegister)|| StableMaps.dongCi.containsKey(postRegister)|| StableMaps.lianCi.containsKey(postRegister)
//		|| StableMaps.xingRongCi.containsKey(postRegister)|| StableMaps.xingWeiCi.containsKey(postRegister)|| StableMaps.liangCi.containsKey(preRegister)
//		|| StableMaps.fuCi.containsKey(postRegister)|| StableMaps.jieCi.containsKey(postRegister)) {
	public int doSlangCheck(int countInputStringLength, List<String> output, StringBuilder stringBuilder,
			Map<String, String> wordsForest, StringBuilder[] prefixWord, Pos_C_XCDX_P posUtils, int charPosition, String textInputString){
		String inputString = stringBuilder.toString();
		if (StableMaps.CiFour.containsKey(inputString)){
			output.add(inputString);
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(inputString);
			return countInputStringLength;
		}//will make pre 3 or post 3 check. now finished pre 3 .20190330
		String preRegister= StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_ZERO)+ inputString.charAt(StablePOS.INT_ONE);
		String inRegister= StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_ONE)+ inputString.charAt(StablePOS.INT_TWO);
		String postRegister= StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_TWO)+ inputString.charAt(StablePOS.INT_THREE);
		if(StableMaps.dongCi.containsKey(StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_THREE)
		+ prefixWord[StablePOS.INT_ONE].charAt(StablePOS.INT_ZERO))) {
			countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
					, stringBuilder.delete(StablePOS.INT_THREE, StablePOS.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
			return countInputStringLength;
		}	
		if (StableMaps.CiTwo.containsKey(preRegister)){
			if (StableMaps.CiTwo.containsKey(postRegister)){
				String string= StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_ZERO);
				if(StableMaps.xingWeiCi.containsKey(prefixWord[StablePOS.INT_ZERO].toString())
						&&StableMaps.shiTaiCi.containsKey(string)) {
					output.add(string);
					prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
					prefixWord[StablePOS.INT_ZERO].append(string);
					return countInputStringLength- StablePOS.INT_THREE;
				}
				if(StableMaps.zhuCi.containsKey(string)){
					String[] strings= new String[StablePOS.INT_FOUR];
					strings[StablePOS.INT_ZERO]= String.valueOf(inputString.charAt(StablePOS.INT_ZERO));
					strings[StablePOS.INT_ONE]= String.valueOf(inputString.charAt(StablePOS.INT_ZERO)) 
							+ inputString.charAt(StablePOS.INT_ONE);
					strings[StablePOS.INT_TWO]= String.valueOf(inputString.charAt(StablePOS.INT_ONE)) 
							+ inputString.charAt(StablePOS.INT_TWO);
					strings[StablePOS.INT_THREE]= String.valueOf(inputString.charAt(StablePOS.INT_TWO));
					countInputStringLength= posUtils.chuLiZhuCiOfThree(wordsForest, output, countInputStringLength-StablePOS.INT_ONE, strings, prefixWord);
					return countInputStringLength;
				}
				output.add(preRegister);
				prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
				prefixWord[StablePOS.INT_ZERO].append(preRegister);
				return countInputStringLength-StablePOS.INT_TWO;
			}
		}
		if(StableMaps.CiThree.containsKey(preRegister+ inputString.charAt(StablePOS.INT_TWO))&& !StableMaps.CiTwo.containsKey(postRegister)) {
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(preRegister+ inputString.charAt(StablePOS.INT_TWO));
			output.add(preRegister+ inputString.charAt(StablePOS.INT_TWO));
			return countInputStringLength- StablePOS.INT_ONE ;
		}
		if(StableMaps.CiTwo.containsKey(preRegister)&& StableMaps.CiTwo.containsKey(inRegister)) {
			countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
					, stringBuilder.delete(StablePOS.INT_THREE, StablePOS.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
			return countInputStringLength;
		}	
		if(StableMaps.CiTwo.containsKey(preRegister)) {
			countInputStringLength= doSlangPartAndPOSCheckForTwoChar(countInputStringLength- StablePOS.INT_TWO, output
					, stringBuilder.delete(StablePOS.INT_TWO, StablePOS.INT_FOUR), wordsForest, prefixWord, posUtils, charPosition, textInputString);
			return countInputStringLength;
		}
		output.add(StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_ZERO));
		prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
		prefixWord[StablePOS.INT_ZERO].append(StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_ZERO));
		return countInputStringLength= StablePOS.INT_ONE;
	}
//卡诺图化简.PCA阀门分流. 卷积催化, .原来备注这里 ,20190523
//	if(!wordsForest.containsKey(preRegister)&& (wordsForest.containsKey(inRegister)||wordsForest.containsKey(postRegister))) {
//	if(wordsForest.containsKey(preRegister+ inputString.charAt(StableData.INT_TWO))) {
//		output.add(preRegister+ inputString.charAt(StableData.INT_TWO));
//		prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
//		prefixWord[StableData.INT_ZERO].append(preRegister+ inputString.charAt(StableData.INT_TWO));
//		return countInputStringLength- StableData.INT_ONE;
//	}
//	output.add(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO));
//	prefixWord[StableData.INT_ZERO].delete(StableData.INT_ZERO, prefixWord[StableData.INT_ZERO].length());
//	prefixWord[StableData.INT_ZERO].append(StableData.EMPTY_STRING+ inputString.charAt(StableData.INT_ZERO));
//	return countInputStringLength- StableData.INT_THREE;
//}

//if(wordsForest.containsKey(preRegister)&& wordsForest.containsKey(inRegister+ inputString.charAt(StableData.INT_THREE))) {
//	countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
//			, stringBuilder.delete(StableData.INT_THREE, StableData.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
//	return countInputStringLength;
//}
//if(wordsForest.containsKey(preRegister)) {
//	countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
//			, stringBuilder.delete(StableData.INT_THREE, StableData.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
//	return countInputStringLength;
//}
	public int doSlangCheckForMap(int countInputStringLength, List<String> output, StringBuilder stringBuilder
			, Map<String, String> wordsForest, StringBuilder[] prefixWord, Pos_C_XCDX_P posUtils, int charPosition, String textInputString){
		String inputString= stringBuilder.toString();
		if (wordsForest.containsKey(inputString)){
			output.add(inputString);
			prefixWord[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, prefixWord[StablePOS.INT_ZERO].length());
			prefixWord[StablePOS.INT_ZERO].append(inputString);
			return countInputStringLength;
		}
		countInputStringLength= doPOSAndEMMCheckOfThree(--countInputStringLength, output, wordsForest
				, stringBuilder.delete(StablePOS.INT_THREE, StablePOS.INT_FOUR), prefixWord, posUtils, charPosition, textInputString);
		return countInputStringLength;
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

	public int doSlangCheckForMap(int countInputStringLength, Map<String, WordFrequency> output, StringBuilder stringBuilder
			, Map<String, String> wordsForest, StringBuilder[] prefixWord, Pos_C_XCDX_P posUtils){
		String inputString= stringBuilder.toString();
		if (wordsForest.containsKey(inputString)){
			WordForestUtil.wordsForestContainsKey(output, inputString, prefixWord);
			return countInputStringLength;
		}
		if(StableMaps.mingCi.containsKey(StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_ZERO)+ inputString.charAt(StablePOS.INT_ONE))) {
			if(StableMaps.mingCi.containsKey(StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_TWO)+ inputString.charAt(StablePOS.INT_THREE))) {
				WordForestUtil.wordsForestContainsKey(output, StablePOS.EMPTY_STRING+ inputString.charAt(StablePOS.INT_ZERO)+ inputString.charAt(StablePOS.INT_ONE), prefixWord);
				return countInputStringLength;
			}
		}
		countInputStringLength= doPOSAndEMMCheckOfThreeForMap(--countInputStringLength, output, wordsForest
				, stringBuilder.delete(StablePOS.INT_THREE, StablePOS.INT_FOUR), prefixWord, posUtils);
		return countInputStringLength;
	}
}