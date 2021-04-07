package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYJZBook;
import java.awt.*;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;

import ME.sample.App;
import OSI.OSU.AOPM.VECS.IDUQ.GUI.flash.ThisCanvas;
import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;

public class addXYJZBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addXYJZBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addXYJZBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医急诊");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addXYJZBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addXYJZBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医急诊");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new addXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new addXYJZBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new addXYJZBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addXYJZBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {
		dictionary d= new dictionary();
		u.jpanel12.dic_list= d.txtToList();
		u.jpanel12.dic_map = d.listToMap(u.jpanel12.dic_map, u.jpanel12.dic_list);
		u.jpanel12.dic_gn = d.mapToMap_gn(u.jpanel12.dic_map);
		u.jpanel12.dic_lx = d.mapToMap_lx(u.jpanel12.dic_map);
		u.jpanel12.dic_by = d.mapToMap_by(u.jpanel12.dic_map);
		u.jpanel12.dic_wx = d.mapToMap_wx(u.jpanel12.dic_map);
		u.jpanel12.dic_bl = d.mapToMap_bl(u.jpanel12.dic_map);
		u.jpanel12.dic_lc = d.mapToMap_lc(u.jpanel12.dic_map);
		u.jpanel12.dic_sy = d.mapToMap_sy(u.jpanel12.dic_map);
		u.jpanel12.dic_zd = d.mapToMap_zd(u.jpanel12.dic_map);
		u.jpanel12.dic_bf = d.mapToMap_bf(u.jpanel12.dic_map);
		u.jpanel12.dic_zl = d.mapToMap_zl(u.jpanel12.dic_map);
		u.jpanel12.dic_jy = d.mapToMap_jy(u.jpanel12.dic_map);
		u.jpanel12.dic_yh = d.mapToMap_yh(u.jpanel12.dic_map);
		u.jpanel12.dic_yf = d.mapToMap_yf(u.jpanel12.dic_map);
		u.jpanel12.dic_yx = d.mapToMap_yx(u.jpanel12.dic_map);
		tableData_old = new Object[u.jpanel12.dic_map.size()][18];
		Iterator<String> iter= u.jpanel12.dic_map.keySet().iterator();
		u.jpanel12.copy= new ArrayList<String>();
		while (iter.hasNext())
			u.jpanel12.copy.add(iter.next());
		for(int i= 0; i< u.jpanel12.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,u.jpanel12.copy.get(i).replace("〔〔〔", "〔").trim(),
					u.jpanel12.dic_map.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", "").replace("〔〔〔", "〔"),
					u.jpanel12.dic_gn.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_lx.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_by.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_wx.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_bl.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_lc.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_sy.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_zd.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_bf.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_zl.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_jy.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_yh.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_yf.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel12.dic_yx.get(u.jpanel12.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.jpanel12.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.jpanel12.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.jpanel12.tableData_old= tableData_old;
		u.jpanel12.newTableModel.fireTableDataChanged();
		u.jpanel12.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addXYJZBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addXYJZBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addXYJZBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
