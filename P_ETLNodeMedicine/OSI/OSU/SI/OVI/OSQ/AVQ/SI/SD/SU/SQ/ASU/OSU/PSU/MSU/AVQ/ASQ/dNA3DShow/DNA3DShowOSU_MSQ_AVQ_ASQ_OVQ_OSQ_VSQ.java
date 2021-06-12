package OSI.OSU.SI.OVI.OSQ.AVQ.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dNA3DShow;
import java.awt.HeadlessException;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;

import IMO.EVU.biProcessor.CoDNAAuthorForWord;
import OCI.ME.analysis.C.A;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life.Application;
public class DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public ME.APM.VSQ.App u;
	public A _A;
	public Map<String, String> pos;
	public String DNNtext;
	public DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ(){
		super();
	}
	public void view() throws Exception{
		Application application= new Application();
		application.init();
		try {
			CoDNAAuthorForWord app = null;
			try {
				app= new CoDNAAuthorForWord(u, _A, pos);
				app.setSize(850, 400);
				app.setVisible(true);
				JFrame f= new JFrame();
				f.add(app);
				f.setTitle("DNA三维观测");
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				f.setSize(650,480);
				f.setVisible(true);
				//app.bootZynkFlowerForest("DNA三维观测", DNNtext, true);
				app.bootDNAFlowerForest("DNA三维观测", application, true);
				//application
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
