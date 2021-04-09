package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addNankKeRW9Book;
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
import OSI.OSU.OEQ.MCQ.GUI.OSGI.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;

public class addNankKeRW9BookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addNankKeRW9BookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addNankKeRW9Book.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加男科");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addNankKeRW9BookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addNankKeRW9Book.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加男科");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ = new addNankKeRW9BookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI = new addNankKeRW9BookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES = new addNankKeRW9BookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addNankKeRW9BookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed = false;
	}
	
	public void IMP_PSU() throws IOException {
		dictionary d= new dictionary();
		u.fckx.dic_list= d.txtToList();
		u.fckx.dic_map= d.listToMap(u.fckx.dic_map, u.fckx.dic_list);
		u.fckx.dic_gn = d.mapToMap_gn(u.fckx.dic_map);
		u.fckx.dic_lx = d.mapToMap_lx(u.fckx.dic_map);
		u.fckx.dic_by = d.mapToMap_by(u.fckx.dic_map);
		u.fckx.dic_wx = d.mapToMap_wx(u.fckx.dic_map);
		u.fckx.dic_bl = d.mapToMap_bl(u.fckx.dic_map);
		u.fckx.dic_lc = d.mapToMap_lc(u.fckx.dic_map);
		u.fckx.dic_sy = d.mapToMap_sy(u.fckx.dic_map);
		u.fckx.dic_zd = d.mapToMap_zd(u.fckx.dic_map);
		u.fckx.dic_bf = d.mapToMap_bf(u.fckx.dic_map);
		u.fckx.dic_zl = d.mapToMap_zl(u.fckx.dic_map);
		u.fckx.dic_jy = d.mapToMap_jy(u.fckx.dic_map);
		u.fckx.dic_yh = d.mapToMap_yh(u.fckx.dic_map);
		u.fckx.dic_yf = d.mapToMap_yf(u.fckx.dic_map);
		u.fckx.dic_yx = d.mapToMap_yx(u.fckx.dic_map);
		Iterator<String> iter = u.fckx.dic_map.keySet().iterator();
		u.fckx.copy = new ArrayList<String>();
		while (iter.hasNext()) {
			u.fckx.copy.add(iter.next());	
		}
		tableData_old = new Object[u.fckx.copy.size()][18];
		for(int i=0;i<u.fckx.copy.size();i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,u.fckx.copy.get(i).replaceAll("〔+", "〔").trim(),
					u.fckx.dic_map.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", "").replaceAll("〔+", "〔"),
					u.fckx.dic_gn.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_lx.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_by.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_wx.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_bl.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_lc.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_sy.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_zd.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_bf.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_zl.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_jy.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_yh.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_yf.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckx.dic_yx.get(u.fckx.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.fckx.newTableModel.getDataVector().clear();
		for(int i=0;i<tableData_old.length;i++) {
			u.fckx.newTableModel.insertRow(i, tableData_old[i]);
		}	
		u.fckx.tableData_old=tableData_old;
		u.fckx.newTableModel.fireTableDataChanged();
		u.fckx.revalidate();
	}
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addNankKeRW9BookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addNankKeRW9BookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addNankKeRW9BookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addNankKeRW9BookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addNankKeRW9BookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addNankKeRW9BookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addNankKeRW9BookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addNankKeRW9BookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
