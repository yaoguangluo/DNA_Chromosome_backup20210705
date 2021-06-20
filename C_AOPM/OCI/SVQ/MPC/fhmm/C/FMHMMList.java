package OCI.SVQ.MPC.fhmm.C;
import java.util.Map;

import SVQ.stable.StablePOS;
public interface FMHMMList extends FHMMList {
	@SuppressWarnings(StablePOS.RAW_TYPES)
	Map<Integer, Map> getRoot();
}