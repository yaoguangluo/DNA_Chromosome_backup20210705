package OCI.ME.nero.C;
import java.util.Map;

import SVQ.stable.StablePOS;
public interface NERO_C {
	@SuppressWarnings(StablePOS.RAW_TYPES)
	StringBuilder getBinaryForestRecurWord(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Integer, Map> forestRoots, int forestDepth, int charPositionNext);
}
