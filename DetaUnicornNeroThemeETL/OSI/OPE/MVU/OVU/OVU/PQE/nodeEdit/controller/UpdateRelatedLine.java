package OSI.OPE.MVU.OVU.OVU.PQE.nodeEdit.controller;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
public interface UpdateRelatedLine{
	public void doUpdateRelatedLine(LinkNode first, String currentNodeName
			, int currentNodeID, String currentNodePrimaryKey);
}