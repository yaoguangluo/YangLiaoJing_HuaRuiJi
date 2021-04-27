package OSI.OPE.ASQ.PSU.OCI.ME.nero;
import java.util.Map;

import OSI.OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public interface NEROController {
	@SuppressWarnings(StableData.RAW_TYPES)
	StringBuilder getBinaryForestRecurWord(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Integer, Map> forestRoots, int forestDepth, int charPositionNext);
}
