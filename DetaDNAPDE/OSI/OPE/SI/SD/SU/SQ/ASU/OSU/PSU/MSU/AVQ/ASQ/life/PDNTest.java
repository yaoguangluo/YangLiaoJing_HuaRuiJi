package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import IMO.EVU.biProcessor.CoDNAAuthorForWord;

public class PDNTest{
	public static void main(String[] argv) throws InterruptedException {
		Application application= new Application();
		application.init();
		try {
			CoDNAAuthorForWord app = null;
			try {
				app= new CoDNAAuthorForWord(null, null, null);
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
		//	close = false;
			
		}catch(Exception e) {
		}
	}
}