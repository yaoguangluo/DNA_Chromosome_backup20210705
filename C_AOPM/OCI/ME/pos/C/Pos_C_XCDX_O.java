package OCI.ME.pos.C;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;

public interface Pos_C_XCDX_O {
	int parserFirstCharOfTwo(int countInputStringLength, List<String> outputList, String[] strings
			, StringBuilder[] fixWord);

	int parserFirstCharOfThree(int countInputStringLength, List<String> outputList, String[] strings
			, StringBuilder[] fixWord);

	int parserFirstTwoCharOfThree(int countInputStringLength, List<String> outputList, String[] strings
			, StringBuilder[] fixWord);

	int parserFirstCharOfTwoForMap(int countInputStringLength, Map<String, WordFrequency> outputList, String[] strings
			, StringBuilder[] fixWord, Map<String, String> wordsForest);

	int parserFirstCharOfThreeForMap(int countInputStringLength, Map<String, WordFrequency> outputList, String[] strings
			, StringBuilder[] fixWord, Map<String, String> wordsForest);
}

