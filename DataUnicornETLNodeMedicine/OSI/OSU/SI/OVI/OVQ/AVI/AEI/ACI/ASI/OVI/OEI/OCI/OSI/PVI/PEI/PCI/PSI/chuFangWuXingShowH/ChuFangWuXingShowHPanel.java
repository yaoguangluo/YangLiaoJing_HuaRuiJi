package OSI.OSU.SI.OVI.OVQ.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.chuFangWuXingShowH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
@SuppressWarnings("unused")
public class ChuFangWuXingShowHPanel extends OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES{
	private static final long serialVersionUID = 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public ChuFangWuXingShowHPanel(final ChuFangWuXingShowHRun SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, JTextPane text
			, Object[][] tableData_old){
		this.textTemp = text;
		this.tableData_old = tableData_old;
		setLayout(null);
		scrollPane = new ScrollPane();
		add(scrollPane);
		panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button = new JButton("完成");
		button.setBounds(0, 0, 150, 30);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(e.getSource());
				close = true;
				SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.value = 1;
			}
		});
		panel.add(button);
		JButton readfile = new JButton("处方五行配置生成");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn = new ConcurrentHashMap<>();
					for(int i=0;i<SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getRowCount();i++) {
						if(null != SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 5)) {
							String temp = SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 5).toString();
							if(temp.contains("足太阴")||temp.contains("通行十二")||temp.contains("脾")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("足太阴")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足太阴", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("足太阴"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足太阴", 1);
								}
							}
							if(temp.contains("足少阴")||temp.contains("通行十二")||temp.contains("肾")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("足少阴")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足少阴", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("足少阴"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足少阴", 1);
								}
							}
							if(temp.contains("足厥阴")||temp.contains("通行十二")||temp.contains("肝")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("足厥阴")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足厥阴", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("足厥阴"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足厥阴", 1);
								}
							}
							if(temp.contains("足太阳")||temp.contains("通行十二")||temp.contains("膀胱")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("足太阳")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足太阳", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("足太阳"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足太阳", 1);
								}
							}
							if(temp.contains("足少阳")||temp.contains("通行十二")||temp.contains("胆")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("足少阳")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足少阳", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("足少阳"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足少阳", 1);
								}
							}
							if(temp.contains("足阳明")||temp.contains("通行十二")||temp.contains("胃")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("足阳明")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足阳明", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("足阳明"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("足阳明", 1);
								}
							}
							if(temp.contains("手太阴")||temp.contains("通行十二")||temp.contains("肺")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("手太阴")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手太阴", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("手太阴"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手太阴", 1);
								}
							}
							if(temp.contains("手少阴")||temp.contains("通行十二")||temp.contains("心")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("手少阴")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手少阴", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("手少阴"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手少阴", 1);
								}
							}
							if(temp.contains("手厥阴")||temp.contains("通行十二")||temp.contains("心包")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("手厥阴")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手厥阴", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("手厥阴"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手厥阴", 1);
								}
							}
							if(temp.contains("手太阳")||temp.contains("通行十二")||temp.contains("小肠")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("手太阳")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手太阳", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("手太阳"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手太阳", 1);
								}
							}
							if(temp.contains("手少阳")||temp.contains("通行十二")||temp.contains("三焦")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("手少阳")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手少阳", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("手少阳"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手少阳", 1);
								}
							}
							if(temp.contains("手阳明")||temp.contains("通行十二")||temp.contains("大肠")) {
								if(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.containsKey("手阳明")) {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手阳明", SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.get("手阳明"));
								}else {
									SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topMapIn.put("手阳明", 1);
								}
							}
						}
					}
				}catch(Exception e) {		
				}
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close= false;
		
	}
	public void config(){
		System.out.println("configued");
	}
}
