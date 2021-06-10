package OCI.SVQ.MPC.fhmm.C;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public interface FMHMMList extends FHMMList {
	@SuppressWarnings(StableData.RAW_TYPES)
	Map<Integer, Map> getRoot();
}