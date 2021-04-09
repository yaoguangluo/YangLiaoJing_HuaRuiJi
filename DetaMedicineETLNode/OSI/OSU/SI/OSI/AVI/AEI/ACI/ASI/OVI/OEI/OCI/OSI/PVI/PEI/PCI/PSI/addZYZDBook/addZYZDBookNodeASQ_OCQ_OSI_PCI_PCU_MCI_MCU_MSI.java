package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYZDBook;
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

public class addZYZDBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	public addZYZDBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("addZYZDBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医诊断");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public addZYZDBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("addZYZDBook.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医诊断");
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
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new addZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new addZYZDBookOSU_MSQ_OPE_OPC_ECI();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new addZYZDBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((addZYZDBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU() throws IOException {
//		dictionary d= new dictionary();
//		u.jpanel15.dic_yao_ming= new ConcurrentHashMap<>();
//		u.jpanel15.dic_chengfen_danwei= new ConcurrentHashMap<>();
//		u.jpanel15.dic_yong_fa= new ConcurrentHashMap<>();
//		u.jpanel15.dic_yong_liang= new ConcurrentHashMap<>();
//		u.jpanel15.dic_yao_li= new ConcurrentHashMap<>();
//		u.jpanel15.dic_zhu_yi= new ConcurrentHashMap<>();
//		u.jpanel15.dic_shi_ying= new ConcurrentHashMap<>();
//		u.jpanel15.dic_jie_shao= new ConcurrentHashMap<>();
//		u.jpanel15.dic_bu_liang_fan_ying= new ConcurrentHashMap<>();
//		u.jpanel15.dic_yao_wu_xiang_hu_zuo_yong= new ConcurrentHashMap<>();
//		u.jpanel15.dic_qi_ta= new ConcurrentHashMap<>();
//		d.txtToMap(u.jpanel15.dic_yao_ming, u.jpanel15.dic_chengfen_danwei, u.jpanel15.dic_yong_fa
//				, u.jpanel15.dic_yao_li, u.jpanel15.dic_zhu_yi, u.jpanel15.dic_shi_ying
//				, u.jpanel15.dic_bu_liang_fan_ying, u.jpanel15.dic_yao_wu_xiang_hu_zuo_yong
//				, u.jpanel15.dic_qi_ta, u.jpanel15.dic_yong_liang, u.jpanel15.dic_jie_shao);
//		Iterator<String> iter= u.jpanel15.dic_yao_ming.keySet().iterator();
//		u.jpanel15.copy= new ArrayList<>();
//		while(iter.hasNext()) {
//			u.jpanel15.copy.add(iter.next());	
//		}
//		tableData_old= new Object[u.jpanel15.dic_yao_ming.size()][18];
//		for(int i= 0; i< u.jpanel15.copy.size(); i++) {
//			tableData_old[i]= new Object[]{""+(i+1),
//					""+0,
//					u.jpanel15.copy.get(i).trim(),
//					u.jpanel15.dic_jie_shao.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_yao_li.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_chengfen_danwei.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_yong_fa.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_zhu_yi.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_shi_ying.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_bu_liang_fan_ying.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_yong_liang.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_yao_wu_xiang_hu_zuo_yong.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", ""),
//					u.jpanel15.dic_qi_ta.get(u.jpanel15.copy.get(i)).toString().replaceAll("\\s*", "")
//			};
//		}	
		
		
		
		
		
		
		dictionary d=new dictionary();
		u.zyzdx.dic_list=d.txtToList();
		u.zyzdx.dic_map = d.listToMap(u.zyzdx.dic_map, u.zyzdx.dic_list);
		u.zyzdx.dic_gn = d.mapToMap_gn(u.zyzdx.dic_map);
		u.zyzdx.dic_lcbx =d.mapToMap_lcbx(u.zyzdx.dic_map);
		u.zyzdx.dic_lcyy =d.mapToMap_lcyy(u.zyzdx.dic_map);
		u.zyzdx.dic_zhfx =d.mapToMap_zhfx(u.zyzdx.dic_map);
		u.zyzdx.dic_zhjb =d.mapToMap_zhjb(u.zyzdx.dic_map);
		tableData_old = new Object[u.zyzdx.dic_map.size()][9];
		Iterator<String> iter = u.zyzdx.dic_map.keySet().iterator();
		u.zyzdx.copy = new ArrayList<String>();
		while (iter.hasNext())
			u.zyzdx.copy.add(iter.next());
		for(int i= 0;i< u.zyzdx.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,u.zyzdx.copy.get(i).trim().replace("〔","").replace("〕",":"),
					u.zyzdx.dic_map.get(u.zyzdx.copy.get(i)).toString().replaceAll("\\s*", "").replace("〔","").replace("〕",":") , 
					u.zyzdx.dic_gn.get(u.zyzdx.copy.get(i)).toString(),
					u.zyzdx.dic_lcbx.get(u.zyzdx.copy.get(i)).toString(),
					u.zyzdx.dic_zhfx.get(u.zyzdx.copy.get(i)).toString(), 
					u.zyzdx.dic_lcyy.get(u.zyzdx.copy.get(i)).toString(), 
					u.zyzdx.dic_zhjb.get(u.zyzdx.copy.get(i)).toString()};
		}	
		
		u.zyzdx.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.zyzdx.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.zyzdx.tableData_old= tableData_old;
		u.zyzdx.newTableModel.fireTableDataChanged();
		u.zyzdx.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) throws FileNotFoundException, IOException{	
		((addZYZDBookOSU_MSQ_OPE_OPC_ECI) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run((addZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		((addZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).analyzer= analyzer;
		((addZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).u= u;
		((addZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).pos= pos;
		((addZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ).DNNtext= ((addZYZDBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES).DNNtext;
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new addZYZDBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this.analyzer, this.pos);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
