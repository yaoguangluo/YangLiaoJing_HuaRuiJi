package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addHLSBook;
import java.awt.*;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;

import ME.sample.App;
import OSI.OSU.AOPM.VECS.IDUQ.GUI.Flash.ThisCanvas;
import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;

public class addHLSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addHLSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addHLSBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加哈里森医典");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addHLSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addHLSBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加哈里森医典");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
		this.u= u;
		this.analyzer= analyzer;
		this.pos= pos;
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new addHLSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new addHLSBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new addHLSBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addHLSBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {
		dictionary d = new dictionary();
		u.jpanel17.dic_list = d.txtToListName();
		u.jpanel17.dic_map = d.listNameToMap(u.jpanel17.dic_map, u.jpanel17.dic_list);//.listNameToMap(dic_list);
		tableData_old = new Object[u.jpanel17.dic_map.size()][4];
		Iterator<String> iter= u.jpanel17.dic_map.keySet().iterator();
		u.jpanel17.copy= new ArrayList<String>();
		while (iter.hasNext())
			u.jpanel17.copy.add(iter.next());
		for(int i= 0; i< u.jpanel17.copy.size(); i++) {
			tableData_old[i] = new Object[]{""+(i+1),""+0,u.jpanel17.copy.get(i).trim(),
					u.jpanel17.dic_map.get(u.jpanel17.copy.get(i)).toString().replaceAll("\\s+", " ")};
		}	
		u.jpanel17.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.jpanel17.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.jpanel17.tableData_old= tableData_old;
		u.jpanel17.newTableModel.fireTableDataChanged();
		u.jpanel17.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addHLSBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addHLSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane) throws Exception{
		((addHLSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addHLSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addHLSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addHLSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addHLSBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addHLSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
