package OSI.OSU.ASQ.PSU.OCI.ortho.fhmm;
import java.util.Map;

import OSI.OSU.ASQ.PSU.view.stable.StableData;
public interface FMHMMList extends FHMMList {
	@SuppressWarnings(StableData.RAW_TYPES)
	Map<Integer, Map> getRoot();
}