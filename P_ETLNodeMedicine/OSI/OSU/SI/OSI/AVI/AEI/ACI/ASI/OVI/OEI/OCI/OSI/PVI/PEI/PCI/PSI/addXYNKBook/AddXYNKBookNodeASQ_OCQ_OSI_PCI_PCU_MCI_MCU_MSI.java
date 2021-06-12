package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYNKBook;
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

public class AddXYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public AddXYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addXYNKBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医内科");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddXYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, A _A, Map<String, String> pos) throws IOException{
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
		this._A= _A;
		this.pos= pos;
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new AddXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new AddXYNKBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new AddXYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddXYNKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {
		dictionary d=new dictionary();
		u.xynkPage.dic_list=d.txtToList();
		u.xynkPage.dic_map= d.listToMap(u.xynkPage.dic_map, u.xynkPage.dic_list);
		u.xynkPage.dic_gn= d.mapToMap_gn(u.xynkPage.dic_map);
		u.xynkPage.dic_lx= d.mapToMap_lx(u.xynkPage.dic_map);
		u.xynkPage.dic_by= d.mapToMap_by(u.xynkPage.dic_map);
		u.xynkPage.dic_wx= d.mapToMap_wx(u.xynkPage.dic_map);
		u.xynkPage.dic_bl= d.mapToMap_bl(u.xynkPage.dic_map);
		u.xynkPage.dic_lc= d.mapToMap_lc(u.xynkPage.dic_map);
		u.xynkPage.dic_sy= d.mapToMap_sy(u.xynkPage.dic_map);
		u.xynkPage.dic_zd= d.mapToMap_zd(u.xynkPage.dic_map);
		u.xynkPage.dic_bf= d.mapToMap_bf(u.xynkPage.dic_map);
		u.xynkPage.dic_zl= d.mapToMap_zl(u.xynkPage.dic_map);
		u.xynkPage.dic_jy= d.mapToMap_jy(u.xynkPage.dic_map);
		u.xynkPage.dic_yh= d.mapToMap_yh(u.xynkPage.dic_map);
		u.xynkPage.dic_yf= d.mapToMap_yf(u.xynkPage.dic_map);
		u.xynkPage.dic_yx= d.mapToMap_yx(u.xynkPage.dic_map);
		tableData_old= new Object[u.xynkPage.dic_map.size()][18];
		Iterator<String> iter= u.xynkPage.dic_map.keySet().iterator();
		u.xynkPage.copy= new ArrayList<String>();
		while (iter.hasNext())
			u.xynkPage.copy.add(iter.next());
		for(int i= 0; i< u.xynkPage.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+ (i+ 1),""+ 0, u.xynkPage.copy.get(i).trim(),
					u.xynkPage.dic_map.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_gn.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_lx.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_by.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_wx.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_bl.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_lc.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_sy.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_zd.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_bf.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_zl.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_jy.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_yh.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_yf.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xynkPage.dic_yx.get(u.xynkPage.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.xynkPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.xynkPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.xynkPage.tableData_old= tableData_old;
		u.xynkPage.newTableModel.fireTableDataChanged();
		u.xynkPage.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((AddXYNKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((AddXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((AddXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)._A= _A;
		((AddXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((AddXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((AddXYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((AddXYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new AddXYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
