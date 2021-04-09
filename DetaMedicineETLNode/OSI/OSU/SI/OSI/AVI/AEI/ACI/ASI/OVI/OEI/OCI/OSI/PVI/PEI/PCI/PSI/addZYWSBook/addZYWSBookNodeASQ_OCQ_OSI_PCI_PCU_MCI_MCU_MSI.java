package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYWSBook;
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

public class addZYWSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addZYWSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addZYWSBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医外伤");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addZYWSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addZYWSBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医外伤");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new addZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new addZYWSBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new addZYWSBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addZYWSBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {		
		dictionary d=new dictionary();
		u.wskx.dic_list=d.txtToList();
		u.wskx.dic_map = d.listToMap(u.wskx.dic_map, u.wskx.dic_list);
		u.wskx.dic_gn = d.mapToMap_gn(u.wskx.dic_map);
		u.wskx.dic_lx = d.mapToMap_lx(u.wskx.dic_map);
		u.wskx.dic_by = d.mapToMap_by(u.wskx.dic_map);
		u.wskx.dic_wx = d.mapToMap_wx(u.wskx.dic_map);
		u.wskx.dic_bl = d.mapToMap_bl(u.wskx.dic_map);
		u.wskx.dic_lc = d.mapToMap_lc(u.wskx.dic_map);
		u.wskx.dic_sy = d.mapToMap_sy(u.wskx.dic_map);
		u.wskx.dic_zd = d.mapToMap_zd(u.wskx.dic_map);
		u.wskx.dic_bf = d.mapToMap_bf(u.wskx.dic_map);
		u.wskx.dic_zl = d.mapToMap_zl(u.wskx.dic_map);
		u.wskx.dic_jy = d.mapToMap_jy(u.wskx.dic_map);
		u.wskx.dic_yh = d.mapToMap_yh(u.wskx.dic_map);
		u.wskx.dic_yf = d.mapToMap_yf(u.wskx.dic_map);
		u.wskx.dic_yx = d.mapToMap_yx(u.wskx.dic_map);
		tableData_old = new Object[u.wskx.dic_map.size()][18];
		Iterator<String> iter = u.wskx.dic_map.keySet().iterator();
		u.wskx.copy = new ArrayList<String>();
		while (iter.hasNext())
			u.wskx.copy.add(iter.next());
		for(int i= 0;i< u.wskx.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,u.wskx.copy.get(i).trim().replace("〔〔〔", "〔") ,
					u.wskx.dic_map.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", "").replace("〔〔〔", "〔"),
					u.wskx.dic_gn.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_lx.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_by.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_wx.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_bl.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_lc.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_sy.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_zd.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_bf.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_zl.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_jy.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_yh.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_yf.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.wskx.dic_yx.get(u.wskx.copy.get(i)).toString().replaceAll("\\s*", "")};
		}	
		u.wskx.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.wskx.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.wskx.tableData_old= tableData_old;
		u.wskx.newTableModel.fireTableDataChanged();
		u.wskx.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addZYWSBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addZYWSBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addZYWSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
