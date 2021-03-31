package org.LYG.node.ai.arffTransfer;
public class arffNode
{ 
	public String SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS;
	public arffNode next;
	public arffNode pre;
	public arffNode()
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