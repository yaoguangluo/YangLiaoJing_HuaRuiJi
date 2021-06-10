package OCI.ME.nero.C;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public interface NERO_C {
	@SuppressWarnings(StableData.RAW_TYPES)
	StringBuilder getBinaryForestRecurWord(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Integer, Map> forestRoots, int forestDepth, int charPositionNext);
}
