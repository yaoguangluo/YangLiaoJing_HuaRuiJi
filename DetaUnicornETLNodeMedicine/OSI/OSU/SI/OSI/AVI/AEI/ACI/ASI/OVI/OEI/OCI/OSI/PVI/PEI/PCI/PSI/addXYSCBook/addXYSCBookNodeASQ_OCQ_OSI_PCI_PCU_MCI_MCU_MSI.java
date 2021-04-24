package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYSCBook;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.*;

import ME.sample.App;
import OSI.OSU.AOPM.VECS.IDUQ.GUI.flash.ThisCanvas;
import OSI.OSU.ASQ.PSU.OCI.ME.analysis.Analyzer;
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
		u.xyscPage.dic_yao_ming= new ConcurrentHashMap<>();
		u.xyscPage.dic_chengfen_danwei= new ConcurrentHashMap<>();
		u.xyscPage.dic_yong_fa= new ConcurrentHashMap<>();
		u.xyscPage.dic_yong_liang= new ConcurrentHashMap<>();
		u.xyscPage.dic_yao_li= new ConcurrentHashMap<>();
		u.xyscPage.dic_zhu_yi= new ConcurrentHashMap<>();
		u.xyscPage.dic_shi_ying= new ConcurrentHashMap<>();
		u.xyscPage.dic_jie_shao= new ConcurrentHashMap<>();
		u.xyscPage.dic_bu_liang_fan_ying= new ConcurrentHashMap<>();
		u.xyscPage.dic_yao_wu_xiang_hu_zuo_yong= new ConcurrentHashMap<>();
		u.xyscPage.dic_qi_ta= new ConcurrentHashMap<>();
		d.txtToMap(u.xyscPage.dic_yao_ming, u.xyscPage.dic_chengfen_danwei, u.xyscPage.dic_yong_fa
				, u.xyscPage.dic_yao_li, u.xyscPage.dic_zhu_yi, u.xyscPage.dic_shi_ying
				, u.xyscPage.dic_bu_liang_fan_ying, u.xyscPage.dic_yao_wu_xiang_hu_zuo_yong
				, u.xyscPage.dic_qi_ta, u.xyscPage.dic_yong_liang, u.xyscPage.dic_jie_shao);
		Iterator<String> iter= u.xyscPage.dic_yao_ming.keySet().iterator();
		u.xyscPage.copy= new ArrayList<>();
		while(iter.hasNext()) {
			u.xyscPage.copy.add(iter.next());	
		}
		tableData_old= new Object[u.xyscPage.dic_yao_ming.size()][18];
		for(int i= 0; i< u.xyscPage.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),
					""+0,
					u.xyscPage.copy.get(i).trim(),
					u.xyscPage.dic_jie_shao.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_yao_li.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_chengfen_danwei.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_yong_fa.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_zhu_yi.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_shi_ying.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_bu_liang_fan_ying.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_yong_liang.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_yao_wu_xiang_hu_zuo_yong.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", ""),
					u.xyscPage.dic_qi_ta.get(u.xyscPage.copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		u.xyscPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.xyscPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.xyscPage.tableData_old= tableData_old;
		u.xyscPage.newTableModel.fireTableDataChanged();
		u.xyscPage.revalidate();
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
