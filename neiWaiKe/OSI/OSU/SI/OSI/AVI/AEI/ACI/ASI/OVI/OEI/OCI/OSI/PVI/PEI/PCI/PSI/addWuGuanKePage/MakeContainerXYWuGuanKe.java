package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addWuGuanKePage;
import java.awt.Color;

import java.awt.Container;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;

import ME.sample.App;

public class MakeContainerXYWuGuanKe extends Thread implements Runnable{
	public WuGuanKekx jpanelSecond;
	public App u;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	
	public MakeContainerXYWuGuanKe(Analyzer analyzer, Container jpanelSecond, App u2, JTabbedPane jTabbedpane
			, List<String> tabNames2, Map<String, String> pos, Map<String, String> pose, Map<String, String> etc
			, Map<String, String> cte) {
		super();
		//this.jpanelSecond= jpanelSecond;
		this.u= u2;
		this.tabNames= tabNames2;
		this.jTabbedpane= jTabbedpane;
		this.analyzer= analyzer;
		this.pos= pos;
		this.pose= pose;
		this.etc= etc;
		this.cte= cte;
	}
	
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*3);
			tabNames.add("五官科");
			jpanelSecond= new WuGuanKekx(u.text, this.analyzer, pos, pose, etc, cte, jTabbedpane, u);
			jpanelSecond.setName("五官科");
			
			//u.jpanel11= new MakeContainerXYWuGuanKe(u.text, this.analyzer, pos, pose, etc, cte, jTabbedpane, u);
			//u.jpanel11.setName(tabNames.get(10));
			jTabbedpane.addTab("五官科", new ImageIcon(), jpanelSecond, "添加五官科页");// �����һ��ҳ��  
			Color[] colors= new Color[3];
			colors[0]= new Color(253, 233, 254);
			colors[1]= new Color(233, 254, 234);
			colors[2]= new Color(255, 251, 232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
			jTabbedpane.validate();
		} catch (InterruptedException | IOException e) {
			jTabbedpane.validate();
		}
	}

	public void AOP_VEC_SQ(String input) {
		// TODO Auto-generated method stub
		jpanelSecond.key= input.toString();
		jpanelSecond.keyReleased(null);
		
	}
}