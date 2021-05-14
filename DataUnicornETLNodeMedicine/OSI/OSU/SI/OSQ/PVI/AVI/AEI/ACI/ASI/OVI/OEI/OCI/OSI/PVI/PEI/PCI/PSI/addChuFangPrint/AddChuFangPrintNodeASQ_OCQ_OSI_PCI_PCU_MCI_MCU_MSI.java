package OSI.OSU.SI.OSQ.PVI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addChuFangPrint;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class AddChuFangPrintNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public AddChuFangPrintNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("ChuFangPrint.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("处方打印");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	
	public AddChuFangPrintNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("ChuFangPrint.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("处方打印");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new AddChuFangPrintView();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new AddChuFangPrintRun();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new AddChuFangPrintPanel((AddChuFangPrintRun) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void OPE_E(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((AddChuFangPrintRun) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((AddChuFangPrintView) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed= true;
	}
	
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI= new AddChuFangPrintNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
