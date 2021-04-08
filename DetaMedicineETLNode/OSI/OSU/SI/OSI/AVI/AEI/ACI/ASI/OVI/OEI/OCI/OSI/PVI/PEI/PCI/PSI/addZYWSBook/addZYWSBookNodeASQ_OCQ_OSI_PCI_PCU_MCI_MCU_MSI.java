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
		u.jpanel14.dic_list=d.txtToList();
		u.jpanel14.dic_map = d.listToMap(u.jpanel14.dic_map, u.jpanel14.dic_list);
		u.jpanel14.dic_gn = d.mapToMap_gn(u.jpanel14.dic_map);
		u.jpanel14.dic_lx = d.mapToMap_lx(u.jpanel14.dic_map);
		u.jpanel14.dic_by = d.mapToMap_by(u.jpanel14.dic_map);
		u.jpanel14.dic_wx = d.mapToMap_wx(u.jpanel14.dic_map);
		u.jpanel14.dic_bl = d.mapToMap_bl(u.jpanel14.dic_map);
		u.jpanel14.dic_lc = d.mapToMap_lc(u.jpanel14.dic_map);
		u.jpanel14.dic_sy = d.mapToMap_sy(u.jpanel14.dic_map);
		u.jpanel14.dic_zd = d.mapToMap_zd(u.jpanel14.dic_map);
		u.jpanel14.dic_bf = d.mapToMap_bf(u.jpanel14.dic_map);
		u.jpanel14.dic_zl = d.mapToMap_zl(u.jpanel14.dic_map);
		u.jpanel14.dic_jy = d.mapToMap_jy(u.jpanel14.dic_map);
		u.jpanel14.dic_yh = d.mapToMap_yh(u.jpanel14.dic_map);
		u.jpanel14.dic_yf = d.mapToMap_yf(u.jpanel14.dic_map);
		u.jpanel14.dic_yx = d.mapToMap_yx(u.jpanel14.dic_map);
		tableData_old = new Object[u.jpanel14.dic_map.size()][18];
		Iterator<String> iter = u.jpanel14.dic_map.keySet().iterator();
		u.jpanel14.copy = new ArrayList<String>();
		while (iter.hasNext())
			u.jpanel14.copy.add(iter.next());
		for(int i= 0;i< u.jpanel14.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,u.jpanel14.copy.get(i).trim().replace("〔〔〔", "〔") ,
					u.jpanel14.dic_map.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", "").replace("〔〔〔", "〔"),
					u.jpanel14.dic_gn.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_lx.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_by.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_wx.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_bl.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_lc.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_sy.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_zd.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_bf.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_zl.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_jy.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_yh.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_yf.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel14.dic_yx.get(u.jpanel14.copy.get(i)).toString().replaceAll("\\s*", "")};
		}	
		u.jpanel14.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.jpanel14.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.jpanel14.tableData_old= tableData_old;
		u.jpanel14.newTableModel.fireTableDataChanged();
		u.jpanel14.revalidate();
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
