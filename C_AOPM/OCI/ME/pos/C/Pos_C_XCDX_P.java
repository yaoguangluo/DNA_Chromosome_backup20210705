package OCI.ME.pos.C;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;

public interface Pos_C_XCDX_P{
	int chuLiBaDongCiOfTwo(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength,
			String[] strings, StringBuilder[] prefixWord);
	int chuLiMingCiOfTwo(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord, int charPosition, String inputString);
	int chuLiLianCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiZhuCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiJieCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiLiangCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiMingCiOfTwoForMap(Map<String, String> wordsForest,  Map<String, WordFrequency> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiLiangCiOfThreeForMap(Map<String, String> wordsForest, Map<String, WordFrequency> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiJieCiOfThreeForMap(Map<String, String> wordsForest, Map<String, WordFrequency> outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiLianCiOfThreeForMap(Map<String, String> wordsForest, Map<String, WordFrequency>  outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiZhuCiOfThreeForMap(Map<String, String> wordsForest, Map<String, WordFrequency>  outputList, int countInputStringLength
			, String[] strings, StringBuilder[] fixWord);
	int chuLiMingCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputStringLength,
			String[] strings, StringBuilder[] fixWord);
	int chuLiShiTaiCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputLength,
			String[] strings, StringBuilder[] prefixWord);
	int chuLiFuCiOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputLength,
			String[] strings, StringBuilder[] prefixWord);
	int chuLiLianCiPostFixOfThree(Map<String, String> wordsForest, List<String> outputList, int countInputLength,
			String[] strings, StringBuilder[] prefixWord);
}

