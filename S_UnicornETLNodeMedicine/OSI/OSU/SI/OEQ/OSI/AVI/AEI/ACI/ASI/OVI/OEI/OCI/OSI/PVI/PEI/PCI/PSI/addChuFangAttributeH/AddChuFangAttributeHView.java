package OSI.OSU.SI.OEQ.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addChuFangAttributeH;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class AddChuFangAttributeHView extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public AddChuFangAttributeHView(){
		super();
	}
	public void view() throws Exception{
		try {
			scrollPane = new ScrollPane();
			panel = new Panel();
			panel.setBackground(Color.yellow);	
			JScrollPane j = new JScrollPane();
			tableout.setBackground(new Color(240, 128, 128));
			tableout.setPreferredSize(new Dimension(200, 800));
			tableout.setVisible(true);
			j.setViewportView(tableout);
			panel.add(j);
			scrollPane.add(panel);
			add(scrollPane);
			close = false;
			
		}catch(Exception e) {
		}
		
	}
	@Override
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ clone() {
		objectView = (OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}
