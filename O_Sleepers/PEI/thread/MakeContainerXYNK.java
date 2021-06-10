package PEI.thread;
import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import ME.APM.VSQ.App;
import ME.APM.VSQ.xiYiNeiKe.XynkPage;
import OPE.ASQ.PSU.OCI.ME.analysis.C.Analyzer;
public class MakeContainerXYNK extends Thread implements Runnable{
	public Container jpanelSecond;
	public App u;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public Map<String, String> pose; 
	public Map<String, String> etc;
	public Map<String, String> cte;
	public MakeContainerXYNK(Analyzer analyzer, App u2, JTabbedPane jTabbedpane, List<String> tabNames2
			, Map<String, String> pos, Map<String, String> pose, Map<String, String> etc
			, Map<String, String> cte) {
		super();
		this.u = u2;
		this.tabNames = tabNames2;
		this.jTabbedpane = jTabbedpane;
		this.analyzer = analyzer;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*4);
			u.xynkPage= new XynkPage(u.text, this.analyzer, pos, pose, etc, cte, u, jTabbedpane);
			u.xynkPage.setName(tabNames.get(5));
			jTabbedpane.addTab(tabNames.get(5),new ImageIcon() , u.xynkPage, "西医内科学");// 加入第一个页面  
			Color[] colors= new Color[3];
			colors[0]=new Color(253,233,254);
			colors[1]=new Color(233,254,234);
			colors[2]=new Color(255,251,232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
			jTabbedpane.validate();
		} catch (IOException e) {
			jTabbedpane.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		}  	
	}
}