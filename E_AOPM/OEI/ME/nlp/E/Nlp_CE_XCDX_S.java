package OEI.ME.nlp.E;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import SVQ.stable.StableMaps;
import ME.utils.WordForestUtil;
//import OCI.ME.nlp.C.NLP_C;
import OCI.ME.nlp.C.Nlp_C_XCDX_S;
//import OCI.ME.pos.C.POS_C;
import OCI.ME.pos.C.Pos_C_XCDX_P;
//import OCI.ME.pos.C.Pos_C_XCDX_O;

//繁衍和继承是新陈代谢的一种体现.
public class Nlp_CE_XCDX_S extends Nlp_CE_XCDX_A implements Nlp_C_XCDX_S{

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