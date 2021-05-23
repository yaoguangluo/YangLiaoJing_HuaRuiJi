package OSI.OPE.ASQ.PSU.OCI.SVQ.MPC.fhmm.C;
import java.util.Map;

import OSI.OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public interface FMHMMList extends FHMMList {
	@SuppressWarnings(StableData.RAW_TYPES)
	Map<Integer, Map> getRoot();
}