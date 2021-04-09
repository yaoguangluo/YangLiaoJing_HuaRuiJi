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
		u.jzkx.dic_list= d.txtToList();
		u.jzkx.dic_map = d.listToMap(u.jzkx.dic_map, u.jzkx.dic_list);
		u.jzkx.dic_gn = d.mapToMap_gn(u.jzkx.dic_map);
		u.jzkx.dic_lx = d.mapToMap_lx(u.jzkx.dic_map);
		u.jzkx.dic_by = d.mapToMap_by(u.jzkx.dic_map);
		u.jzkx.dic_wx = d.mapToMap_wx(u.jzkx.dic_map);
		u.jzkx.dic_bl = d.mapToMap_bl(u.jzkx.dic_map);
		u.jzkx.dic_lc = d.mapToMap_lc(u.jzkx.dic_map);
		u.jzkx.dic_sy = d.mapToMap_sy(u.jzkx.dic_map);
		u.jzkx.dic_zd = d.mapToMap_zd(u.jzkx.dic_map);
		u.jzkx.dic_bf = d.mapToMap_bf(u.jzkx.dic_map);
		u.jzkx.dic_zl = d.mapToMap_zl(u.jzkx.dic_map);
		u.jzkx.dic_jy = d.mapToMap_jy(u.jzkx.dic_map);
		u.jzkx.dic_yh = d.mapToMap_yh(u.jzkx.dic_map);
		u.jzkx.dic_yf = d.mapToMap_yf(u.jzkx.dic_map);
		u.jzkx.dic_yx = d.mapToMap_yx(u.jzkx.dic_map);
		tableData_old = new Object[u.jzkx.dic_map.size()][18];
		Iterator<String> iter= u.jzkx.dic_map.keySet().iterator();
		u.jzkx.copy= new ArrayList<String>();
		while (iter.hasNext())
			u.jzkx.copy.add(iter.next());
		for(int i= 0; i< u.jzkx.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,u.jzkx.copy.get(i).replace("〔〔〔", "〔").trim(),
					u.jzkx.dic_map.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", "").replace("〔〔〔", "〔"),
					u.jzkx.dic_gn.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_lx.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_by.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_wx.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_bl.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_lc.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_sy.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_zd.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_bf.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_zl.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_jy.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_yh.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_yf.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jzkx.dic_yx.get(u.jzkx.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.jzkx.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.jzkx.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.jzkx.tableData_old= tableData_old;
		u.jzkx.newTableModel.fireTableDataChanged();
		u.jzkx.revalidate();
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
