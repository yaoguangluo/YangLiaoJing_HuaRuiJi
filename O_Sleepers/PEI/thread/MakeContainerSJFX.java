package PEI.thread;
import java.awt.Color;
import java.awt.Container;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.GUISample;
public class MakeContainerSJFX extends Thread implements Runnable{
	public Container jpanelSecond;
	public App u;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public A _A;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Object[][] tableData_old;
	public JTextPane text;
	public MakeContainerSJFX(Object[][] tableData_old, JTextPane text, A _A,Container jpanelSecond, App u2
			, JTabbedPane jTabbedpane, List<String> tabNames, Map<String, String> pos
			, Map<String, String> pose, Map<String, String> etc, Map<String, String> cte) {
		super();
		this.jpanelSecond = jpanelSecond;
		this.u = u2;
		this.tabNames = tabNames;
		this.jTabbedpane = jTabbedpane;
		this._A = _A;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.text = text;
		this.tableData_old = tableData_old;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000* 5);
			jpanelSecond.setBounds(0, 0, 1490, 980);
			GUISample NE= new GUISample();
			NE.init(this.tableData_old,this.text, this.u, this._A, this.pos);
			NE.start();
			jpanelSecond.add(NE);
			jpanelSecond.setName(tabNames.get(1));
			jTabbedpane.addTab(tabNames.get(1), new ImageIcon(), jpanelSecond, "数据分析");// 加入第一个页面  
			Color[] colors= new Color[3];
			colors[0]=new Color(253,233,254);
			colors[1]=new Color(233,254,234);
			colors[2]=new Color(255,251,232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
			NE.validate();
			jTabbedpane.validate();
		//	u.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
}