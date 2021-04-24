package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYWSBook;
import java.awt.HeadlessException;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;

import ME.APM.VSQ.App;
import OSI.OSU.ASQ.PSU.OCI.ME.analysis.Analyzer;
import OSI.OSU.OEQ.MCQ.OVU.PQE.osgi.*;
import biProcessor.CoAuthorForWord;
public class addZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public App u;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public String DNNtext;
	public addZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ(){
		super();
	}
	public void view() throws Exception{
		try {
			CoAuthorForWord app = null;
			try {
				app= new CoAuthorForWord(u, analyzer, pos);
				app.setSize(850, 400);
				app.setVisible(true);
				JFrame f= new JFrame();
				f.add(app);
				f.setTitle("处方DNN功效观测");
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				f.setSize(650, 480);
				f.setVisible(true);
				app.bootZynkFlowerForest("药方功效森林", DNNtext, true);
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}   
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
