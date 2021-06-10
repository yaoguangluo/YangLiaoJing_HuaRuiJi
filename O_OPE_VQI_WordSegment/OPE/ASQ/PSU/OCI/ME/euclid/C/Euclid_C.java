package OPE.ASQ.PSU.OCI.ME.euclid.C;
import java.util.Map;

import OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public interface Euclid_C {
	@SuppressWarnings({StableData.RAW_TYPES})
	Map<Integer, Map> mCogsEuclid(Map<Long, FMHMMNode> concurrentHashMap);
}
