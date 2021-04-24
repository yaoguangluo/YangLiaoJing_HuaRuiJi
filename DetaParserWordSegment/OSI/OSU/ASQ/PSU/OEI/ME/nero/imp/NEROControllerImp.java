package OSI.OSU.ASQ.PSU.OEI.ME.nero.imp;
import java.util.Map;

import OSI.OSU.ASQ.PSU.OCI.ME.nero.NEROController;
import OSI.OSU.ASQ.PSU.view.obj.FMHMMNode;
import OSI.OSU.ASQ.PSU.view.stable.StableData;
public class NEROControllerImp implements NEROController {
	@SuppressWarnings({StableData.RAW_TYPES, StableData.UNCHECKED})
	public StringBuilder getBinaryForestRecurWord(StringBuilder outputWordNode, String inputString, int charPosition
			, int inputStringLength, Map<Integer, Map> forestRoots, int forestDepth, int charPositionNext ) {
		if (StableData.INT_THREE== forestDepth) {
			return outputWordNode;
		}
		char charAtPosition= inputString.charAt(charPosition);
		int rangeHigh= charAtPosition>> StableData.INT_TEN;
		Map<Integer, Map> trees= forestRoots.get(rangeHigh);
		if (null== trees) {
			return outputWordNode;
		}
		int range= charAtPosition>> StableData.INT_SIX;
		if (!trees.containsKey(range)) {
			return outputWordNode;
		}
		Map<Long, FMHMMNode> maps= trees.get(range);
		FMHMMNode fFHMMNode= maps.get(Long.valueOf(charAtPosition));
		if (null== fFHMMNode) {
			return outputWordNode;
		}
		Map<String, Integer> outputList= fFHMMNode.getNext();
		if (null== outputList||charPositionNext>= inputStringLength) {
			return outputWordNode;
		}
		char positionOfi= inputString.charAt(charPositionNext);
		if (outputList.containsKey(String.valueOf(positionOfi))) {
			outputWordNode= getBinaryForestRecurWord(outputWordNode.append(positionOfi), inputString
					, charPositionNext, inputStringLength, forestRoots
					, forestDepth+ StableData.INT_ONE, ++charPositionNext);
		}
		return outputWordNode;
	}
}