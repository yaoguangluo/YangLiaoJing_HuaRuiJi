package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXinShengErBook;
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

public class addXinShengErBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addXinShengErBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addXinShengErBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加新生儿科");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addXinShengErBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addXinShengErBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加新生儿科");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ = new addXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI = new addXinShengErBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES = new addXinShengErBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addXinShengErBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed = false;
	}
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		dictionary d= new dictionary();
		u.jpanel11.dic_list= d.txtToList();
		u.jpanel11.dic_map= d.listToMap(u.jpanel11.dic_map, u.jpanel11.dic_list);
		u.jpanel11.dic_gn = d.mapToMap_gn(u.jpanel11.dic_map);
		u.jpanel11.dic_lx = d.mapToMap_lx(u.jpanel11.dic_map);
		u.jpanel11.dic_by = d.mapToMap_by(u.jpanel11.dic_map);
		u.jpanel11.dic_wx = d.mapToMap_wx(u.jpanel11.dic_map);
		u.jpanel11.dic_bl = d.mapToMap_bl(u.jpanel11.dic_map);
		u.jpanel11.dic_lc = d.mapToMap_lc(u.jpanel11.dic_map);
		u.jpanel11.dic_sy = d.mapToMap_sy(u.jpanel11.dic_map);
		u.jpanel11.dic_zd = d.mapToMap_zd(u.jpanel11.dic_map);
		u.jpanel11.dic_bf = d.mapToMap_bf(u.jpanel11.dic_map);
		u.jpanel11.dic_zl = d.mapToMap_zl(u.jpanel11.dic_map);
		u.jpanel11.dic_jy = d.mapToMap_jy(u.jpanel11.dic_map);
		u.jpanel11.dic_yh = d.mapToMap_yh(u.jpanel11.dic_map);
		u.jpanel11.dic_yf = d.mapToMap_yf(u.jpanel11.dic_map);
		u.jpanel11.dic_yx = d.mapToMap_yx(u.jpanel11.dic_map);
		Iterator<String> iter = u.jpanel11.dic_map.keySet().iterator();
		u.jpanel11.copy = new ArrayList<String>();
		while (iter.hasNext()) {
			u.jpanel11.copy.add(iter.next());	
		}
		tableData_old = new Object[u.jpanel11.copy.size()][18];
		for(int i=0;i<u.jpanel11.copy.size();i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,u.jpanel11.copy.get(i).replaceAll("〔+", "〔").trim(),
					u.jpanel11.dic_map.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", "").replaceAll("〔+", "〔"),
					u.jpanel11.dic_gn.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_lx.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_by.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_wx.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_bl.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_lc.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_sy.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_zd.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_bf.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_zl.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_jy.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_yh.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_yf.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel11.dic_yx.get(u.jpanel11.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.jpanel11.newTableModel.getDataVector().clear();
		for(int i=0;i<tableData_old.length;i++) {
			u.jpanel11.newTableModel.insertRow(i, tableData_old[i]);
		}	
		u.jpanel11.newTableModel.fireTableDataChanged();
		u.jpanel11.revalidate();
		((addXinShengErBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addXinShengErBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addXinShengErBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
