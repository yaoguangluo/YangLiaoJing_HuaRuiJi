package OCI.ME.euclid.C;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public interface Euclid_C {
	@SuppressWarnings({StableData.RAW_TYPES})
	Map<Integer, Map> mCogsEuclid(Map<Long, FMHMMNode> concurrentHashMap);
}
