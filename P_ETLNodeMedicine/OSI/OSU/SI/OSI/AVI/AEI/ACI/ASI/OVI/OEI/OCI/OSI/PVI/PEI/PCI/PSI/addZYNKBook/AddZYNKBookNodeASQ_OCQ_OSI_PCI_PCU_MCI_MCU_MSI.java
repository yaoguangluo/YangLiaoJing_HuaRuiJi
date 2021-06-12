package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYNKBook;
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
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;

public class AddZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public AddZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addZYNKBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医内科方剂");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, A _A, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addZYNKBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医内科方剂");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new AddZYNKBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new AddZYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddZYNKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {		
		dictionary d=new dictionary();
		u.zynkxPage.dic_list=d.txtToList();
		u.zynkxPage.dic_map = d.listToMap(u.zynkxPage.dic_map, u.zynkxPage.dic_list);
		u.zynkxPage.dic_chu_fang = d.MapToChuFang(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_mz = d.MapTomz(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_zf = d.MapTozf(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_yy = d.MapToyy(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		
		u.zynkxPage.dic_sy = d.MapTosy(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_tl = d.MapTotl(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_ff = d.MapToff(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_fg = d.MapTofg(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		
		tableData_old = new Object[u.zynkxPage.dic_map.size()][12];
		Iterator<String> iter = u.zynkxPage.dic_map.keySet().iterator();
		u.zynkxPage.copy = new ArrayList<String>();
		while (iter.hasNext())
			u.zynkxPage.copy.add(iter.next());
		for(int i= 0;i< u.zynkxPage.copy.size(); i++) {
			tableData_old[i] = new Object[]{""+(i+1),
					"" + 0, u.zynkxPage.copy.get(i).trim().replace("^", " "),
					u.zynkxPage.dic_map.get(u.zynkxPage.copy.get(i)).toString().replaceAll("\\s*", "").replace("^", " "),
					u.zynkxPage.dic_chu_fang.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_chu_fang.get(u.zynkxPage.copy.get(i)).toString().replace("-", " "):"",
					u.zynkxPage.dic_mz.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_mz.get(u.zynkxPage.copy.get(i)).toString().replace("-", " "):"",
					u.zynkxPage.dic_zf.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_zf.get(u.zynkxPage.copy.get(i)).toString().replace("-", " "):"",
					u.zynkxPage.dic_yy.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_yy.get(u.zynkxPage.copy.get(i)).toString().replace("-", " "):"",
					u.zynkxPage.dic_sy.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_sy.get(u.zynkxPage.copy.get(i)).toString().replace("-", " "):"",	
					u.zynkxPage.dic_tl.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_tl.get(u.zynkxPage.copy.get(i)).toString().replace("-", " "):"",	
					u.zynkxPage.dic_ff.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_ff.get(u.zynkxPage.copy.get(i)).toString().replace("-", " "):"",	
					u.zynkxPage.dic_fg.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_fg.get(u.zynkxPage.copy.get(i)).toString().replace("-", " "):""	
			};
		}	
		u.zynkxPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.zynkxPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.zynkxPage.tableData_old= tableData_old;
		u.zynkxPage.newTableModel.fireTableDataChanged();
		u.zynkxPage.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((AddZYNKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)._A= _A;
		((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((AddZYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new AddZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
