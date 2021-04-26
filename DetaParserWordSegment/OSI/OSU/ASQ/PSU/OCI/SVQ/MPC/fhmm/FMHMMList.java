package OSI.OSU.ASQ.PSU.OCI.SVQ.MPC.fhmm;
import java.util.Map;

import OSI.OSU.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public interface FMHMMList extends FHMMList {
	@SuppressWarnings(StableData.RAW_TYPES)
	Map<Integer, Map> getRoot();
}