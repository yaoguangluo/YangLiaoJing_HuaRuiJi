package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addDanXianKePage;
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
public class AddDanXianKePageOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES{
	private static final long serialVersionUID = 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public String DNNtext;
	public AddDanXianKePageOSU_MSQ_AOI_AOD_AOU_AOQ_VES(final AddDanXianKePageOSU_MSQ_OPE_OPC_ECI SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, JTextPane text
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
		JButton readfile= new JButton("配置生成");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					DNNtext= "";
					for(int i= 0; i< SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getRowCount(); i++) {
						if(i< 20
								&& null!= SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 0)) {
							DNNtext+= " "+ SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.getValueAt(i, 0).toString();
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
