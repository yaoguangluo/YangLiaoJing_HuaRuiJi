package OSI.OVQ.OSU.MSQ.MV.SQ.show3D;
import java.awt.Dimension;



import java.awt.Panel;
import java.awt.ScrollPane;


import javax.swing.JButton;
import javax.swing.JScrollPane;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

public class Show3DView extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public Show3DView(){
		super();
	}
	public void view() throws Exception{
		scrollPane = new ScrollPane();
		panel=new Panel();
		JScrollPane j=new JScrollPane();

		test app = new test(gout);  
		app.setPreferredSize(new Dimension(800,500));
		app.setVisible(true);

		j.setViewportView(app);
		panel.add(j);
		scrollPane.add(panel);
		add(scrollPane);
		close=false;
	}
	@Override  
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ clone() {   
		objectView = (OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}
