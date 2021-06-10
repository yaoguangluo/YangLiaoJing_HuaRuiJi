package OCI.ME.nero.C;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
public interface NERO_C_OneTime {
	StringBuilder getBinaryForestsRecurWordOneTime(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Long, FMHMMNode>[] forestsRoots, int forestDepth, int charPositionNext);
	StringBuilder getBinaryForestRecurWordOneTime(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Long, FMHMMNode> forestRoots, int forestDepth, int charPositionNext);
	StringBuilder getQuickForestRecurWord(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<String, String> forestRoots, int forestDepth, int charPositionNext);
}
