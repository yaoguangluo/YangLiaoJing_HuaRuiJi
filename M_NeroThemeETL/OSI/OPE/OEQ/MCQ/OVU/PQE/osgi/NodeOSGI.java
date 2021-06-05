package OSI.OPE.OEQ.MCQ.OVU.PQE.osgi;
import javax.swing.ImageIcon;
public class NodeOSGI{ 
	public NodeOSGI next;
	public NodeOSGI pre;
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI currentFace;
	public ImageIcon thisIcon;
	public String SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS;
	@Override  
	public Object clone() {  
		NodeOSGI obj= null;  
		try{  
			obj= (NodeOSGI)super.clone();  
		}catch(CloneNotSupportedException e) {  
			e.printStackTrace();  
		}  
		return obj;  
	}  
	public NodeOSGI(){
		next= null;
		pre= null;
		currentFace= null;
		thisIcon= null;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= null;
	}
	public void addName(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI thisface){
		next= null;
		pre= null;
		currentFace= thisface;
		thisIcon= currentFace.thisIcon;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
		= new String(currentFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
	}
}