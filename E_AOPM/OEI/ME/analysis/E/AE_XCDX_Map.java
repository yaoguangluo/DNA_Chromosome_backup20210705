package OEI.ME.analysis.E;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import ME.utils.WordFrequencyUtil;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A_XCDX_Map;

import java.util.Iterator;
//PARSER XCDX
//Yaoguang.Luo
//20210702
//一种元基枝 写法结构 处理子类接口 分类.
public class AE_XCDX_Map extends AE implements A_XCDX_Map{
	public Map<String, WordFrequency> parserStringByReturnFrequencyMap(String inputString) {
		Map<String, String> wordsForest = fHMMList.getPosCnToCn();
		Map<String, WordFrequency> outputList = new ConcurrentHashMap<>();
		Map<Long, FMHMMNode> forestRoots = fHMMList.getMap();
		int inputStringLength = inputString.length();
		int forestDepth = StablePOS.INT_ZERO;
		int countInputStringLength;
		StringBuilder[] fixWords = new StringBuilder[StablePOS.INT_TWO];
		fixWords[StablePOS.INT_ZERO] = new StringBuilder();
		fixWords[StablePOS.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		int find = StablePOS.INT_ZERO;
		Here:
			for (int charPosition= StablePOS.INT_ZERO; charPosition< inputStringLength; charPosition
					+= (countInputStringLength== StablePOS.INT_ZERO? StablePOS.INT_ONE: countInputStringLength)) {
				if(inputString.charAt(charPosition)< StablePOS.INT_ONE_TWO_EIGHT){
					if(fixWords[StablePOS.INT_ZERO].length()> StablePOS.INT_ZERO) {
						if(fixWords[StablePOS.INT_ZERO].charAt(fixWords[StablePOS.INT_ZERO].length()- StablePOS.INT_ONE)
								< StablePOS.INT_ONE_TWO_EIGHT) {
							fixWords[StablePOS.INT_ZERO].append(inputString.charAt(charPosition));
							countInputStringLength= StablePOS.INT_ONE;
							find = StablePOS.INT_ONE;
							continue Here;
						}
						fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
					}
					find=StablePOS.INT_ONE;
					fixWords[StablePOS.INT_ZERO].append(inputString.charAt(charPosition));
					countInputStringLength = StablePOS.INT_ONE;
					continue Here;
				}
				if(find == StablePOS.INT_ONE) {
					find = StablePOS.INT_ZERO;
					WordFrequencyUtil.WordFrequencyFindCheck(outputList, fixWords);
				}
				stringBuilder.delete(StablePOS.INT_ZERO, stringBuilder.length());
				stringBuilder = neroController.getBinaryForestRecurWordOneTime(stringBuilder.append(inputString
						.charAt(charPosition)), inputString, charPosition, inputStringLength, forestRoots, forestDepth
						, charPosition + StablePOS.INT_ONE);
				String countWordNode = stringBuilder.toString();
				int compare = countInputStringLength = countWordNode.length();
				if (compare == StablePOS.INT_ONE) {
					WordFrequencyUtil.WordFrequencyCompareCheck(outputList, fixWords, countWordNode);
					fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
					fixWords[StablePOS.INT_ZERO].append(countWordNode);
					continue Here;
				}
				if (compare == StablePOS.INT_TWO) {
					countInputStringLength = nlpController.doSlangPartAndPOSCheckForTwoCharForMap(countInputStringLength
							, outputList, stringBuilder, wordsForest, fixWords, posController);
					continue Here;
				}
				if (compare == StablePOS.INT_THREE) {
					I_FixWords(charPosition, inputString, fixWords);
					countInputStringLength = nlpController.doPOSAndEMMCheckOfThreeForMap(countInputStringLength, outputList
							, wordsForest, stringBuilder, fixWords, posController);
					continue Here;
				}
				if (compare == StablePOS.INT_FOUR) {
					I_FixWords(charPosition, inputString, fixWords);
					countInputStringLength = nlpController.doSlangCheckForMap(countInputStringLength, outputList, stringBuilder
							, wordsForest, fixWords, posController);
				}
			}
		return outputList;
	}

	public Map<String, WordFrequency> getWordFrequencyMap(List<String> sets) throws IOException {
		Map<String, WordFrequency> map = new ConcurrentHashMap<>();
		Iterator <String> iterator = sets.iterator();
		Here:
			while(iterator.hasNext()){
				String setOfi = iterator.next();
				if (map.containsKey(setOfi)) {
					WordFrequency wordFrequency = map.get(setOfi);
					wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
					map.put(setOfi, wordFrequency);
					continue Here;
				} 
				WordFrequency wordFrequency = new WordFrequency();
				wordFrequency.I_Frequency(StablePOS.INT_ONE);
				wordFrequency.I_Word(setOfi);
				map.put(setOfi, wordFrequency);
			}
		return map;
	}
	//计算函数以后移出 DNA元基组 到RNA. 
	public List<WordFrequency> sortWordFrequencyMap(Map<String, WordFrequency> map) throws IOException {
		List<WordFrequency> list = quick6DLuoYaoguangSort.frequencyWordMapToList(map);
		quick6DLuoYaoguangSort.quick6DLuoYaoGuangSortWordFrequency(list, StablePOS.INT_ZERO
				, list.size() - StablePOS.INT_ONE);
		return list;
	}

	public Map<Integer, WordFrequency> getWordFrequencyByReturnSortMap(List<String> sets) throws IOException {
		return sortWordFrequencyMapToSortMap(getWordFrequencyMap(sets));
	}	

	public Map<Integer, WordFrequency> sortWordFrequencyMapToUnsortMap(Map<String, WordFrequency> map){
		Map<Integer, WordFrequency> listMap = quick6DLuoYaoguangSort.frequencyWordMapToMap(map);
		return listMap;
	}

	public Map<Integer, WordFrequency> sortWordFrequencyMapToSortMap(Map<String, WordFrequency> map){
		Map<Integer, WordFrequency> listMap = quick6DLuoYaoguangSort.frequencyWordMapToMap(map);
		quick6DLuoYaoguangSort.quick6DLuoYaoGuangSortWordFrequency(listMap, StablePOS.INT_ZERO
				, listMap.size() - StablePOS.INT_ONE);
		return listMap;
	}

	public Map<String, WordFrequency> parserMixStringByReturnFrequencyMap(String mixedString) {
		mixedString += StablePOS.SPACE_STRING;
		Map<String, String> wordsForest = fHMMList.getPosCnToCn();
		Map<String, WordFrequency> outputList = new ConcurrentHashMap<>();
		Map<Long, FMHMMNode> forestRoots = fHMMList.getMap();//.getRoot();
		int inputStringLength = mixedString.length();
		int forestDepth = StablePOS.INT_ZERO;
		int countInputStringLength;
		StringBuilder[] fixWords = new StringBuilder[StablePOS.INT_TWO];
		fixWords[StablePOS.INT_ZERO] = new StringBuilder();
		fixWords[StablePOS.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		int find = StablePOS.INT_ZERO;
		Here:
			for (int charPosition = StablePOS.INT_ZERO; charPosition < inputStringLength; charPosition
					+= (countInputStringLength == StablePOS.INT_ZERO ? StablePOS.INT_ONE : countInputStringLength)) {
				//luan ma
				if(mixedString.charAt(charPosition) < StablePOS.INT_ONE_TWO_EIGHT && charPosition < mixedString.length()
						- StablePOS.INT_ONE){
					if(find == StablePOS.INT_ZERO) {
						fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
					}
					fixWords[StablePOS.INT_ZERO].append(mixedString.charAt(charPosition));
					countInputStringLength = StablePOS.INT_ONE;
					find = StablePOS.INT_ONE;
					continue Here;
				}
				if(find == StablePOS.INT_ONE) {
					find = StablePOS.INT_ZERO;	
					Iterator<String> it = fHMMList.englishStringToWordsList(fixWords[StablePOS.INT_ZERO].toString()).iterator();
					while(it.hasNext()) {
						String temp=it.next();
						if (outputList.containsKey(temp)) {
							WordFrequency wordFrequency = outputList.get(temp);
							wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
							outputList.put(temp, wordFrequency);
						} else {
							WordFrequency wordFrequency = new WordFrequency();
							wordFrequency.I_Frequency(StablePOS.INT_ONE);
							wordFrequency.I_Word(temp);
							outputList.put(temp, wordFrequency);
						}
					}
					fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
				}
				stringBuilder.delete(StablePOS.INT_ZERO, stringBuilder.length());
				stringBuilder = neroController.getBinaryForestRecurWordOneTime(stringBuilder.append(mixedString
						.charAt(charPosition)), mixedString, charPosition, inputStringLength, forestRoots, forestDepth
						, charPosition + StablePOS.INT_ONE);
				String countWordNode = stringBuilder.toString();
				int compare = countInputStringLength = countWordNode.length();
				if (compare == StablePOS.INT_TWO) {
					countInputStringLength = nlpController.doSlangPartAndPOSCheckForTwoCharForMap(countInputStringLength
							, outputList, stringBuilder, wordsForest, fixWords, posController);
					continue Here;
				}
				if (compare == StablePOS.INT_THREE) {
					I_FixWords(charPosition, mixedString, fixWords);
					countInputStringLength = nlpController.doPOSAndEMMCheckOfThreeForMap(countInputStringLength, outputList
							, wordsForest, stringBuilder, fixWords, posController);
					continue Here;
				}
				if (compare == StablePOS.INT_ONE) {
					if (outputList.containsKey(countWordNode)) {
						WordFrequency wordFrequency = outputList.get(countWordNode);
						wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
						outputList.put(countWordNode, wordFrequency);
					} else {
						WordFrequency wordFrequency = new WordFrequency();
						wordFrequency.I_Frequency(StablePOS.INT_ONE);
						wordFrequency.I_Word(fixWords[StablePOS.INT_ZERO].toString());
						outputList.put(countWordNode, wordFrequency);
					}
					fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
					fixWords[StablePOS.INT_ZERO].append(countWordNode);
					continue Here;
				}
				if (compare == StablePOS.INT_FOUR) {
					I_FixWords(charPosition, mixedString, fixWords);
					countInputStringLength = nlpController.doSlangCheckForMap(countInputStringLength, outputList, stringBuilder
							, wordsForest, fixWords, posController);
				}
			}
		return outputList;
	}
	
	public List<WordFrequency> getWordFrequency(List<String> sets) throws IOException {
		return sortWordFrequencyMap(getWordFrequencyMap(sets));
	}	

	public EmotionMap getEmotionMap() {
		return this.emotionMap;
	}
}