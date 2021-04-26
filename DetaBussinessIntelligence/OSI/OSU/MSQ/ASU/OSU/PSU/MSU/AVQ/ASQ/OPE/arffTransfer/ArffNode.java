package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.arffTransfer;
public class ArffNode
{ 
	public String SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS;
	public ArffNode next;
	public ArffNode pre;
	public ArffNode()
	{
		next=null;
		pre=null;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS=null;
	}
	public void addName(String name)
	{
		next=null;
		pre=null;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS=name;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS=new String(name);
	}
}