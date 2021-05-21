package OSI.OPE.OEQ.MCQ.OVU.PQE.osgi;
public class LinkOSGI{
	public NodeOSGI addNode(NodeOSGI currentNode
			, OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI currentFace) {
		if(null== currentNode){
			currentNode= new NodeOSGI();
			currentNode.addName(currentFace);
			currentNode.next= null;
			currentNode.pre= null;
			return currentNode;
		}
		while(null!= currentNode.next){
			currentNode= currentNode.next;
		}
		NodeOSGI node= new NodeOSGI();
		node.addName(currentFace);
		node.pre= currentNode;
		currentNode.next= node;
		while(null!= currentNode.pre){
			currentNode= currentNode.pre;
		}
		return currentNode;
	} 
}