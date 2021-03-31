package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYNKBook;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;

import ME.sample.App;
import OSI.OSU.AOPM.VECS.IDUQ.GUI.Flash.ThisCanvas;
import OSI.OSU.OEQ.MCQ.GUI.OSGI.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;

public class addZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addZYNKBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医内科方剂");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
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
		this.analyzer= analyzer;
		this.pos= pos;
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new addZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new addZYNKBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new addZYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addZYNKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {		
		dictionary d=new dictionary();
		u.jpanel7.dic_list=d.txtToList();
		u.jpanel7.dic_map = d.listToMap(u.jpanel7.dic_map, u.jpanel7.dic_list);
		u.jpanel7.dic_chu_fang = d.MapToChuFang(u.jpanel7.dic_list, u.jpanel7.dic_map);
		u.jpanel7.dic_mz = d.MapTomz(u.jpanel7.dic_list, u.jpanel7.dic_map);
		u.jpanel7.dic_zf = d.MapTozf(u.jpanel7.dic_list, u.jpanel7.dic_map);
		u.jpanel7.dic_yy = d.MapToyy(u.jpanel7.dic_list, u.jpanel7.dic_map);
		
		u.jpanel7.dic_sy = d.MapTosy(u.jpanel7.dic_list, u.jpanel7.dic_map);
		u.jpanel7.dic_tl = d.MapTotl(u.jpanel7.dic_list, u.jpanel7.dic_map);
		u.jpanel7.dic_ff = d.MapToff(u.jpanel7.dic_list, u.jpanel7.dic_map);
		u.jpanel7.dic_fg = d.MapTofg(u.jpanel7.dic_list, u.jpanel7.dic_map);
		
		tableData_old = new Object[u.jpanel7.dic_map.size()][12];
		Iterator<String> iter = u.jpanel7.dic_map.keySet().iterator();
		u.jpanel7.copy = new ArrayList<String>();
		while (iter.hasNext())
			u.jpanel7.copy.add(iter.next());
		for(int i= 0;i< u.jpanel7.copy.size(); i++) {
			tableData_old[i] = new Object[]{""+(i+1),
					"" + 0, u.jpanel7.copy.get(i).trim().replace("^", " "),
					u.jpanel7.dic_map.get(u.jpanel7.copy.get(i)).toString().replaceAll("\\s*", "").replace("^", " "),
					u.jpanel7.dic_chu_fang.containsKey(u.jpanel7.copy.get(i))?u.jpanel7.dic_chu_fang.get(u.jpanel7.copy.get(i)).toString().replace("-", " "):"",
					u.jpanel7.dic_mz.containsKey(u.jpanel7.copy.get(i))?u.jpanel7.dic_mz.get(u.jpanel7.copy.get(i)).toString().replace("-", " "):"",
					u.jpanel7.dic_zf.containsKey(u.jpanel7.copy.get(i))?u.jpanel7.dic_zf.get(u.jpanel7.copy.get(i)).toString().replace("-", " "):"",
					u.jpanel7.dic_yy.containsKey(u.jpanel7.copy.get(i))?u.jpanel7.dic_yy.get(u.jpanel7.copy.get(i)).toString().replace("-", " "):"",
					u.jpanel7.dic_sy.containsKey(u.jpanel7.copy.get(i))?u.jpanel7.dic_sy.get(u.jpanel7.copy.get(i)).toString().replace("-", " "):"",	
					u.jpanel7.dic_tl.containsKey(u.jpanel7.copy.get(i))?u.jpanel7.dic_tl.get(u.jpanel7.copy.get(i)).toString().replace("-", " "):"",	
					u.jpanel7.dic_ff.containsKey(u.jpanel7.copy.get(i))?u.jpanel7.dic_ff.get(u.jpanel7.copy.get(i)).toString().replace("-", " "):"",	
					u.jpanel7.dic_fg.containsKey(u.jpanel7.copy.get(i))?u.jpanel7.dic_fg.get(u.jpanel7.copy.get(i)).toString().replace("-", " "):""	
			};
		}	
		u.jpanel7.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.jpanel7.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.jpanel7.tableData_old= tableData_old;
		u.jpanel7.newTableModel.fireTableDataChanged();
		u.jpanel7.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addZYNKBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addZYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
