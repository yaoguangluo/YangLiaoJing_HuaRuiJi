package OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit;
public class Sort{
	public static LinkNode sort(LinkNode first){
		while(null != first && null != first.pre){
			first = first.pre;
		}
		return first;
	}
}