package OCI.ME.nlp.C;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
//import OCI.ME.pos.C.POS_C;
//import OCI.ME.pos.C.Pos_C_XCDX;
import OCI.ME.pos.C.Pos_C_XCDX_P;

public interface Nlp_C_XCDX_S {	
	public int doSlangCheck(int countInputStringLength, List<String> output, StringBuilder stringBuilder,
			Map<String, String> wordsForest, StringBuilder[] prefixWord, Pos_C_XCDX_P posUtils, int charPosition, String textInputString);

	public int doSlangCheckForMap(int countInputStringLength, List<String> output, StringBuilder stringBuilder
			, Map<String, String> wordsForest, StringBuilder[] prefixWord, Pos_C_XCDX_P posUtils, int charPosition, String textInputString);

	public int doSlangCheckForMap(int countInputStringLength, Map<String, WordFrequency> output, StringBuilder stringBuilder
			, Map<String, String> wordsForest, StringBuilder[] prefixWord, Pos_C_XCDX_P posUtils);
}
