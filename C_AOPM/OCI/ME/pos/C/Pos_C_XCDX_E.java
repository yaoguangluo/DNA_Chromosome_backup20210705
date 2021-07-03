package OCI.ME.pos.C;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;

public interface Pos_C_XCDX_E{
	void I_FixWordsOfTwo(int charPosition, String inputString, StringBuilder[] fixWords);

	int loopCheckBackFix(StringBuilder[] fixWord, int backPosition, Map<String, String> wordsForest
			, int countInputStringLength, List<String> outputList, String[] strings, int[] nestCountInputStringLength);

	int loopCheckBackFixForMap(StringBuilder[] fixWord, int backPosition, Map<String, String> wordsForest
			, int countInputStringLength, Map<String, WordFrequency> outputList, String[] strings, int[] nestCountInputStringLength);

	void didNotFindFirstCharForMap(Map<String, WordFrequency> outputList, String[] strings, StringBuilder[] fixWord
			, Map<String, String> wordsForest);
	void didNotFindFirstChar(List<String> outputList, String[] strings, StringBuilder[] fixWord
			, Map<String, String> wordsForest);
}

