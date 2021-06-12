package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYBCBook;
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

public class AddZYBCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public AddZYBCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addZYBCBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中药本草");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddZYBCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, A _A, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addZYBCBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中药本草");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new AddZYBCBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new AddZYBCBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddZYBCBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {
		dictionary d= new dictionary();
		u.dic_list= d.txtToList();
		u.dic_map= d.listToMap(	u.dic_map, u.dic_list);
		u.dic_index= d.mapToIndex(u.dic_map);
		u.dic_yw= d.mapToMap_yw(u.dic_map);
		u.dic_li= d.mapToMap_li(u.dic_map);
		u.dic_hai= d.mapToMap_hai(u.dic_map);
		u.dic_xz= d.mapToMap_xz(u.dic_map);
		u.dic_ya= d.mapToMap_ya(u.dic_map);
		u.dic_jm= d.mapToMap_jm(u.dic_map);
		u.dic_xw= d.mapToMap_xw(u.dic_map);
		u.dic_cy= d.mapToMap_cy(u.dic_map);
		u.dic_jj= d.mapToMap_jj(u.dic_map);
		u.dic_zf= d.mapToMap_zf(u.dic_map);
		u.dic_cj= d.mapToMap_cj(u.dic_map);
		u.dic_yl= d.mapToMap_yl(u.dic_map,u.dic_xw,u.dic_li,u.dic_xz,u.dic_jm);
		
		Iterator<String> iter= u.dic_map.keySet().iterator();
		u.copy= new ArrayList<String>();
		while (iter.hasNext()) {
			u.copy.add(iter.next());	
		}
		tableData_old= new Object[u.copy.size()][18];
		for(int i= 0; i< u.copy.size(); i++) {
			tableData_old[i]= new Object[]{
					(u.dic_index.get(u.copy.get(i))==null?"":u.dic_index.get(u.copy.get(i)).toString().replaceAll("\\s*", "")),
					//u.dic_index.get(u.copy.get(i)).toString().replaceAll("\\s*", ""),
					""+0, u.copy.get(i).trim(),
//					u.dic_yw.get(u.copy.get(i)).toString().replaceAll("\\s*", "") , 
//					u.dic_li.get(u.copy.get(i)).toString().replaceAll("\\s*", ""),
					(u.dic_yw.get(u.copy.get(i))==null?"":u.dic_yw.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(u.dic_li.get(u.copy.get(i))==null?"":u.dic_li.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(u.dic_hai.get(u.copy.get(i))==null?"详情参考笔记原文列":u.dic_hai.get(u.copy.get(i))
							.toString().replaceAll("\\s*", "").equalsIgnoreCase("")
							?"详情参考笔记原文列":u.dic_hai.get(u.copy.get(i)).toString().replaceAll("\\s*", "")), 
					(u.dic_yl.get(u.copy.get(i))==null?"":u.dic_yl.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(u.dic_xw.get(u.copy.get(i))==null?"":u.dic_xw.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(u.dic_jm.get(u.copy.get(i))==null?"":u.dic_jm.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
//					u.dic_xw.get(u.copy.get(i)).toString().replaceAll("\\s*", "") ,
//					u.dic_jm.get(u.copy.get(i)).toString().replaceAll("\\s*", "") ,
					(u.dic_xz.get(u.copy.get(i))==null?"":u.dic_xz.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", "") , 
					(u.dic_jj.get(u.copy.get(i))==null?"":u.dic_jj.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", "") , 
					(u.dic_cy.get(u.copy.get(i))==null?"":u.dic_cy.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", "") ,
					(u.dic_ya.get(u.copy.get(i))==null?"":u.dic_ya.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", "") , 
					(u.dic_zf.get(u.copy.get(i))==null?"":u.dic_zf.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(u.dic_cj.get(u.copy.get(i))==null?"":u.dic_cj.get(u.copy.get(i))).toString()
					.replaceAll("\\s*", "")};
		};
		u.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.tableData_old= tableData_old;
		u.newTableModel.fireTableDataChanged();
		u.revalidate();
	}
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{		
		((AddZYBCBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)._A= _A;
		((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((AddZYBCBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new AddZYBCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
