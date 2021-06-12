package AVQ.OVU.semaphone;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.util.Map;
import javax.swing.JScrollPane;

import IMO.EVU.biProcessor.CoAuthorForWord;
import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
public class TaskMakeCoWorker extends Thread implements Runnable{
	public App u;
	public A _A;
	public Container jpanelFirstu;
	public Map<String, String> pos;
	public TaskMakeCoWorker(App u, Container jpanelFirstu, A _A, Map<String, String> pos) {
		this.u= u;
		this.jpanelFirstu = jpanelFirstu;
		this._A = _A;
		this.pos = pos;
	}

	@Override
	public void run() {
		try {
			u.coAuthorForWord = new CoAuthorForWord(u, _A, pos);
		} catch (HeadlessException | InterruptedException e) {
			e.printStackTrace();
		}
		u.coAuthorForWord.setBackground(Color.white);
		JScrollPane jsp_bagua = new JScrollPane(u.coAuthorForWord);
		jsp_bagua.setBounds(695, 290 + 100 - 65 + 50 - 215+80, 750 - 130, 440-50);
		jpanelFirstu.add(jsp_bagua);
		jpanelFirstu.validate();
	}
}