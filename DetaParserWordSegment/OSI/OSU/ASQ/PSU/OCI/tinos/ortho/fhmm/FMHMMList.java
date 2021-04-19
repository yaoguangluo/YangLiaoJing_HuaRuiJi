package OSI.OSU.ASQ.PSU.OCI.tinos.ortho.fhmm;
import java.util.Map;

import OSI.OSU.ASQ.PSU.tinos.view.stable.StableData;
public interface FMHMMList extends FHMMList {
	@SuppressWarnings(StableData.RAW_TYPES)
	Map<Integer, Map> getRoot();
}