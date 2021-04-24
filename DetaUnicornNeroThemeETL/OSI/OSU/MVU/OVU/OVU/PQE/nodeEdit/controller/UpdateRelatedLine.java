package OSI.OSU.MVU.OVU.OVU.PQE.nodeEdit.controller;
import OSI.OSU.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
public interface UpdateRelatedLine{
	public void doUpdateRelatedLine(LinkNode first, String currentNodeName
			, int currentNodeID, String currentNodePrimaryKey);
}