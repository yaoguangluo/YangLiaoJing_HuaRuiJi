package OSI.OSU.ASQ.PSU.OCI.ME.euclid;
import java.util.Map;

import OSI.OSU.ASQ.PSU.view.obj.FMHMMNode;
import OSI.OSU.ASQ.PSU.view.stable.StableData;
public interface EuclidController {
	@SuppressWarnings({StableData.RAW_TYPES})
	Map<Integer, Map> mCogsEuclid(Map<Long, FMHMMNode> concurrentHashMap);
}
