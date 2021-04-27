package OSI.OPE.ASQ.PSU.OCI.ME.euclid;
import java.util.Map;

import OSI.OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import OSI.OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public interface EuclidController {
	@SuppressWarnings({StableData.RAW_TYPES})
	Map<Integer, Map> mCogsEuclid(Map<Long, FMHMMNode> concurrentHashMap);
}
