package OCI.ME.nlp.C;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
//import OCI.ME.pos.C.POS_C;
//import OCI.ME.pos.C.Pos_C_XCDX;
import OCI.ME.pos.C.Pos_C_XCDX_P;

public interface Nlp_C_XCDX_A {	
	public int doSlangPartAndPOSCheckForTwoChar(int countInputStringLength, List<String> outputList
			, StringBuilder stringBuilder, Map<String, String> wordsForest, StringBuilder[] prefixWord
			, Pos_C_XCDX_P posUtils, int charPosition, String textInputString);
	
	public int doPOSAndEMMCheckOfThree(int countInputLength, List<String> outputList
			, Map<String, String> wordsForest, StringBuilder stringBuilder, StringBuilder[] prefixWord
			, Pos_C_XCDX_P posUtils, int charPosition, String textInputString);

	public int doSlangPartAndPOSCheckForTwoCharForMap(int countInputStringLength, Map<String, WordFrequency> outputList
			, StringBuilder stringBuilder, Map<String, String> wordsForest, StringBuilder[] prefixWord
			, Pos_C_XCDX_P posUtils);

	public int doPOSAndEMMCheckOfThreeForMap(int countInputLength, Map<String, WordFrequency> outputList
			, Map<String, String> wordsForest, StringBuilder stringBuilder, StringBuilder[] prefixWord
			, Pos_C_XCDX_P posUtils);
}
