package org.ASQ.PSU.OCI.tinos.engine.euclid;
import java.util.Map;

import org.ASQ.PSU.tinos.view.obj.FMHMMNode;
import org.ASQ.PSU.tinos.view.stable.StableData;
public interface EuclidController {
	@SuppressWarnings({StableData.RAW_TYPES})
	Map<Integer, Map> mCogsEuclid(Map<Long, FMHMMNode> concurrentHashMap);
}
