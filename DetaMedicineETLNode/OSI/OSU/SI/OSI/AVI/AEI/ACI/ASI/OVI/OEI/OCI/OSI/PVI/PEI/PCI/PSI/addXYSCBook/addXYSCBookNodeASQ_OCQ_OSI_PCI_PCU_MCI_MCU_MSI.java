package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYSCBook;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.*;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;

import ME.sample.App;
import OSI.OSU.AOPM.VECS.IDUQ.GUI.flash.ThisCanvas;
import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;

public class addXYSCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addXYSCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addXYSCBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西药手册");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addXYSCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addXYSCBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西药手册");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new addXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new addXYSCBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new addXYSCBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addXYSCBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {
		dictionary d= new dictionary();
		u.jpanel15.dic_yao_ming= new ConcurrentHashMap<>();
		u.jpanel15.dic_chengfen_danwei= new ConcurrentHashMap<>();
		u.jpanel15.dic_yong_fa= new ConcurrentHashMap<>();
		u.jpanel15.dic_yong_liang= new ConcurrentHashMap<>();
		u.jpanel15.dic_yao_li= new ConcurrentHashMap<>();
		u.jpanel15.dic_zhu_yi= new ConcurrentHashMap<>();
		u.jpanel15.dic_shi_ying= new ConcurrentHashMap<>();
		u.jpanel15.dic_jie_shao= new ConcurrentHashMap<>();
		u.jpanel15.dic_bu_liang_fan_ying= new ConcurrentHashMap<>();
		u.jpanel15.dic_yao_wu_xiang_hu_zuo_yong= new ConcurrentHashMap<>();
		u.jpanel15.dic_qi_ta= new ConcurrentHashMap<>();
		d.txtToMap(u.jpanel15.dic_yao_ming, u.jpanel15.dic_chengfen_danwei, u.jpanel15.dic_yong_fa
				, u.jpanel15.dic_yao_li, u.jpanel15.dic_zhu_yi, u.jpanel15.dic_shi_ying
				, u.jpanel15.dic_bu_liang_fan_ying, u.jpanel15.dic_yao_wu_xiang_hu_zuo_yong
				, u.jpanel15.dic_qi_ta, u.jpanel15.dic_yong_liang, u.jpanel15.dic_jie_shao);
		Iterator<String> iter= u.jpanel15.dic_yao_ming.keySet().iterator();
		u.jpanel15.copy= new ArrayList<>();
		while(iter.hasNext()) {
			u.jpanel15.copy.add(iter.next());	
		}
		tableData_old= new Object[u.jpanel15.dic_yao_ming.size()][18];
		for(int i= 0; i< u.jpanel15.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),
					""+0,
					u.jpanel15.copy.get(i).trim(),
					u.jpanel15.dic_jie_shao.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_yao_li.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_chengfen_danwei.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_yong_fa.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_zhu_yi.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_shi_ying.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_bu_liang_fan_ying.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_yong_liang.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_yao_wu_xiang_hu_zuo_yong.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.jpanel15.dic_qi_ta.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.jpanel15.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.jpanel15.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.jpanel15.tableData_old= tableData_old;
		u.jpanel15.newTableModel.fireTableDataChanged();
		u.jpanel15.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addXYSCBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addXYSCBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addXYSCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
