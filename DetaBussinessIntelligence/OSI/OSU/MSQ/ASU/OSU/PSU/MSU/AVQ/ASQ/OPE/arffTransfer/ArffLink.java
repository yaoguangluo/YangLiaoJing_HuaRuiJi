package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.arffTransfer;
public class ArffLink{
	public boolean search(ArffNode first2, String key){
		while(first2 != null && first2.pre != null){
			first2 = first2.pre;
		}
		if(first2 == null || first2.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS == null){
			return false;
		}
		if(first2.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.equals(key)){
			return true;
		}
		while(first2.next != null){
			first2 = first2.next;
			if(first2.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.equals(key)){
				while(first2.pre != null){
					first2 = first2.pre;
				}
				return true;
			}
		}
		return false;
	}

	public ArffNode addNode(ArffNode currentnode, String name) {
		if(currentnode == null){
			currentnode = new ArffNode();
			currentnode.addName(name);
			currentnode.next = null;
			currentnode.pre = null;
			return currentnode;
		}
		while(currentnode.next != null){
			currentnode = currentnode.next;
		}
		ArffNode node = new ArffNode();
		node.addName(name);
		node.pre = currentnode;
		currentnode.next = node;
		while(currentnode.pre != null){
			currentnode = currentnode.pre;
		}
		return currentnode;
	} 
}