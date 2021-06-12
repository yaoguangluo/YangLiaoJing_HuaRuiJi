package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addFuChanBook;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

public class AddFuChanBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public AddFuChanBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addFuChanBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医妇产科");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddFuChanBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, A _A, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addFuChanBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医妇产科");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
		this.u= u;
		this._A= _A;
		this.pos= pos;
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ = new AddFuChanBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI = new AddFuChanBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES = new AddFuChanBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddFuChanBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed = false;
	}
	public void IMP_PSU() throws IOException {
		dictionary d= new dictionary();
		u.fckxPage.dic_list= d.txtToList();
		u.fckxPage.dic_map= d.listToMap(u.fckxPage.dic_map, u.fckxPage.dic_list);
		u.fckxPage.dic_gn = d.mapToMap_gn(u.fckxPage.dic_map);
		u.fckxPage.dic_lx = d.mapToMap_lx(u.fckxPage.dic_map);
		u.fckxPage.dic_by = d.mapToMap_by(u.fckxPage.dic_map);
		u.fckxPage.dic_wx = d.mapToMap_wx(u.fckxPage.dic_map);
		u.fckxPage.dic_bl = d.mapToMap_bl(u.fckxPage.dic_map);
		u.fckxPage.dic_lc = d.mapToMap_lc(u.fckxPage.dic_map);
		u.fckxPage.dic_sy = d.mapToMap_sy(u.fckxPage.dic_map);
		u.fckxPage.dic_zd = d.mapToMap_zd(u.fckxPage.dic_map);
		u.fckxPage.dic_bf = d.mapToMap_bf(u.fckxPage.dic_map);
		u.fckxPage.dic_zl = d.mapToMap_zl(u.fckxPage.dic_map);
		u.fckxPage.dic_jy = d.mapToMap_jy(u.fckxPage.dic_map);
		u.fckxPage.dic_yh = d.mapToMap_yh(u.fckxPage.dic_map);
		u.fckxPage.dic_yf = d.mapToMap_yf(u.fckxPage.dic_map);
		u.fckxPage.dic_yx = d.mapToMap_yx(u.fckxPage.dic_map);
		Iterator<String> iter = u.fckxPage.dic_map.keySet().iterator();
		u.fckxPage.copy = new ArrayList<String>();
		while (iter.hasNext()) {
			u.fckxPage.copy.add(iter.next());	
		}
		tableData_old = new Object[u.fckxPage.copy.size()][18];
		for(int i=0;i<u.fckxPage.copy.size();i++) {
			tableData_old[i]= new Object[]{""+ (i+ 1), ""+ 0, u.fckxPage.copy.get(i).replaceAll("〔+", "〔").trim(),
					u.fckxPage.dic_map.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", "").replaceAll("〔+", "〔"),
					u.fckxPage.dic_gn.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_lx.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_by.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_wx.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_bl.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_lc.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_sy.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_zd.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_bf.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_zl.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_jy.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_yh.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_yf.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.fckxPage.dic_yx.get(u.fckxPage.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.fckxPage.newTableModel.getDataVector().clear();
		for(int i= 0;i< tableData_old.length;i++) {
			u.fckxPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.fckxPage.tableData_old= tableData_old;
		u.fckxPage.newTableModel.fireTableDataChanged();
		u.fckxPage.revalidate();
	}
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((AddFuChanBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((AddFuChanBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((AddFuChanBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)._A= _A;
		((AddFuChanBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((AddFuChanBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((AddFuChanBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((AddFuChanBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new AddFuChanBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
