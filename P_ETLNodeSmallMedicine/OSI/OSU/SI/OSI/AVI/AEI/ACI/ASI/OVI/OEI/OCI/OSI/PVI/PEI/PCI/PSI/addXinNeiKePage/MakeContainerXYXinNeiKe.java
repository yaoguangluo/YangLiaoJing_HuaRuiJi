package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXinNeiKePage;
import java.awt.Color;

import java.awt.Container;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;

public class MakeContainerXYXinNeiKe extends Thread implements Runnable{
	public Container jpanelSecond;
	public App u;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public A _A;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	
	public MakeContainerXYXinNeiKe(A _A, Container jpanelSecond, App u2, JTabbedPane jTabbedpane
			, List<String> tabNames2, Map<String, String> pos, Map<String, String> pose, Map<String, String> etc
			, Map<String, String> cte) {
		super();
		this.jpanelSecond= jpanelSecond;
		this.u= u2;
		this.tabNames= tabNames2;
		this.jTabbedpane= jTabbedpane;
		this._A= _A;
		this.pos= pos;
		this.pose= pose;
		this.etc= etc;
		this.cte= cte;
	}
	
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*3);
			tabNames.add("心内科");
			jpanelSecond= new XinNeiKekx(u.text, this._A, pos, pose, etc, cte, jTabbedpane, u);
			jpanelSecond.setName("心内科");
			
//			u.jpanel11 = new MakeContainerXYXinNeiKe(u.text, this._A, pos, pose, etc, cte, jTabbedpane, u);
//			u.jpanel11.setName(tabNames.get(10));
			jTabbedpane.addTab("心内科", new ImageIcon() ,jpanelSecond, "添加心内科页");// �����һ��ҳ��  
			Color[] colors= new Color[3];
			colors[0]=new Color(253,233,254);
			colors[1]=new Color(233,254,234);
			colors[2]=new Color(255,251,232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
			jTabbedpane.validate();
		} catch (InterruptedException | IOException e) {
			jTabbedpane.validate();
		}
	}
}