package PEI.thread;
import java.awt.Color;
import java.awt.Container;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import ME.APM.VSQ.App;
import ME.APM.VSQ.editPane.EditPane;
import OCI.ME.analysis.C.A;
public class MakeContainerBJY extends Thread implements  Runnable{
	public Container jpanelSecond;
	public App u;
    public JTabbedPane jTabbedpane;
    public List<String> tabNames;
    public A _A;
    public Map<String, String> pos;
   	public Map<String, String> pose;
   	public Map<String, String> etc;
   	public Map<String, String> cte;
	private Map<String, String> pinyin;
	private Map<String, String> ctj;
	private Map<String, String> ctk;
	private Map<String, String> ctt;
	private Map<String, String> ctr;
	public MakeContainerBJY(A _A, App u2, JTabbedPane jTabbedpane
			, List<String> tabNames2, Map<String, String> pos, Map<String, String> pose
			, Map<String, String> etc, Map<String, String> cte, Map<String, String> pinyin
			, Map<String, String> ctj, Map<String, String> ctt, Map<String, String> ctk, Map<String, String> ctr) {
		super();
		this.u = u2;
		this.tabNames = tabNames2;
		this.jTabbedpane = jTabbedpane;
		this._A = _A;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.ctj = ctj;
		this.ctk = ctk;
		this.ctt = ctt;
		this.ctr = ctr;
		this.pinyin= pinyin;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*1);
			u.editPane = new EditPane(u.text, this._A,pos, pose, etc, cte, pinyin, ctk, ctt, ctj, ctr); 	
			u.editPane.setName(tabNames.get(15));
			jTabbedpane.addTab(tabNames.get(15),new ImageIcon() , u.editPane, "编辑页");// 加入第一个页面  	
			Color[] colors= new Color[3];
			colors[0]=new Color(253,233,254);
			colors[1]=new Color(233,254,234);
			colors[2]=new Color(255,251,232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
		//	new restServer(this.u).start();
			jTabbedpane.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
}