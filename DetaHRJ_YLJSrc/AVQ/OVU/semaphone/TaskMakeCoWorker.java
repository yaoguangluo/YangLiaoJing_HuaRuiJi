package AVQ.OVU.semaphone;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.util.Map;
import javax.swing.JScrollPane;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;

import ME.sample.App;
import biProcessor.CoAuthorForWord;
public class TaskMakeCoWorker extends Thread implements Runnable{
	public App u;
	public Analyzer analyzer;
	public Container jpanelFirstu;
	public Map<String, String> pos;
	public TaskMakeCoWorker(App u, Container jpanelFirstu, Analyzer analyzer, Map<String, String> pos) {
		this.u= u;
		this.jpanelFirstu = jpanelFirstu;
		this.analyzer = analyzer;
		this.pos = pos;
	}

	@Override
	public void run() {
		try {
			u.coAuthorForWord = new CoAuthorForWord(u, analyzer, pos);
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