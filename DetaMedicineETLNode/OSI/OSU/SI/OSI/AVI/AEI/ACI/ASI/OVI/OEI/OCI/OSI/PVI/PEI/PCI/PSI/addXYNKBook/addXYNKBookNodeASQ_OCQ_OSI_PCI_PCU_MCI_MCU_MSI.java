package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYNKBook;
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

public class addXYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addXYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addXYNKBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医内科");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addXYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addXYNKBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医内科");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new addXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new addXYNKBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new addXYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addXYNKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {
		dictionary d=new dictionary();
		u.xynk.dic_list=d.txtToList();
		u.xynk.dic_map= d.listToMap(u.xynk.dic_map, u.xynk.dic_list);
		u.xynk.dic_gn= d.mapToMap_gn(u.xynk.dic_map);
		u.xynk.dic_lx= d.mapToMap_lx(u.xynk.dic_map);
		u.xynk.dic_by= d.mapToMap_by(u.xynk.dic_map);
		u.xynk.dic_wx= d.mapToMap_wx(u.xynk.dic_map);
		u.xynk.dic_bl= d.mapToMap_bl(u.xynk.dic_map);
		u.xynk.dic_lc= d.mapToMap_lc(u.xynk.dic_map);
		u.xynk.dic_sy= d.mapToMap_sy(u.xynk.dic_map);
		u.xynk.dic_zd= d.mapToMap_zd(u.xynk.dic_map);
		u.xynk.dic_bf= d.mapToMap_bf(u.xynk.dic_map);
		u.xynk.dic_zl= d.mapToMap_zl(u.xynk.dic_map);
		u.xynk.dic_jy= d.mapToMap_jy(u.xynk.dic_map);
		u.xynk.dic_yh= d.mapToMap_yh(u.xynk.dic_map);
		u.xynk.dic_yf= d.mapToMap_yf(u.xynk.dic_map);
		u.xynk.dic_yx= d.mapToMap_yx(u.xynk.dic_map);
		tableData_old= new Object[u.xynk.dic_map.size()][18];
		Iterator<String> iter= u.xynk.dic_map.keySet().iterator();
		u.xynk.copy= new ArrayList<String>();
		while (iter.hasNext())
			u.xynk.copy.add(iter.next());
		for(int i= 0; i< u.xynk.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+ (i+ 1),""+ 0, u.xynk.copy.get(i).trim(),
					u.xynk.dic_map.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_gn.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_lx.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_by.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_wx.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_bl.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_lc.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_sy.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_zd.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_bf.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_zl.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_jy.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_yh.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_yf.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynk.dic_yx.get(u.xynk.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.xynk.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.xynk.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.xynk.tableData_old= tableData_old;
		u.xynk.newTableModel.fireTableDataChanged();
		u.xynk.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addXYNKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addXYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addXYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
