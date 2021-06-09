package OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit;
import OSI.OPE.MVU.OVU.OVU.PQE.nodeEdit.C.U_RelatedLine;
public class U_RelatedLineVPS implements U_RelatedLine{
	public void doUpdateRelatedLine(LinkNode first, String currentNodeName
			, int currentNodeID, String currentNodePrimaryKey){
		first = Sort.sort(first);
		while(null!= first) {
			if(first.tBeconnect&& first.tBeconnetName.equals(currentNodeName)
					&& first.tBeconnectID== currentNodeID
					&& first.tBeconnectPrimaryKey.equalsIgnoreCase(currentNodePrimaryKey)){
				first.tBeconnect= false;
			}
			if(first.mBeconnect&& first.mBeconnetName.equals(currentNodeName)
					&& first.mBeconnectID== currentNodeID
					&& first.mBeconnectPrimaryKey.equalsIgnoreCase(currentNodePrimaryKey)){
				first.mBeconnect= false;
			}
			if(first.dBeconnect&& first.dBeconnetName.equals(currentNodeName)
					&& first.dBeconnectID== currentNodeID
					&& first.dBeconnectPrimaryKey.equalsIgnoreCase(currentNodePrimaryKey)){
				first.dBeconnect= false;
			}
			if(null== first.next) {
				break;
			}
			first= first.next;
		}
	}
}