package OSI.OSU.ASQ.PSU.OCI.ME.nero;
import java.util.Map;

import OSI.OSU.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
public interface NEROControllerOneTime {
	StringBuilder getBinaryForestsRecurWordOneTime(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Long, FMHMMNode>[] forestsRoots, int forestDepth, int charPositionNext);
	StringBuilder getBinaryForestRecurWordOneTime(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Long, FMHMMNode> forestRoots, int forestDepth, int charPositionNext);
	StringBuilder getQuickForestRecurWord(StringBuilder inputStringWordNode, String inputString, int charPosition
			, int inputStringLength, Map<String, String> forestRoots, int forestDepth, int charPositionNext);
}
