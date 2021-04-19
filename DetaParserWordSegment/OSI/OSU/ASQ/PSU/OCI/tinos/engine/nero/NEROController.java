package OSI.OSU.ASQ.PSU.OCI.tinos.engine.nero;
import java.util.Map;

import OSI.OSU.ASQ.PSU.tinos.view.stable.StableData;
public interface NEROController {
	@SuppressWarnings(StableData.RAW_TYPES)
	StringBuilder getBinaryForestRecurWord(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Integer, Map> forestRoots, int forestDepth, int charPositionNext);
}
