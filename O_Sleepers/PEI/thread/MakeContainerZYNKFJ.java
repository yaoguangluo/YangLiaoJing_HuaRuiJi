package PEI.thread;
import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import ME.APM.VSQ.App;
import ME.APM.VSQ.zhongYiNeiKeXue.ZynkxPage;
import OCI.ME.analysis.C.A;
public class MakeContainerZYNKFJ extends Thread implements Runnable{
	public Container jpanelSecond;
	public App u;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public A _A;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public MakeContainerZYNKFJ(A _A, App u2, JTabbedPane jTabbedpane, List<String> tabNames2
			, Map<String, String> pos, Map<String, String> pose, Map<String, String> etc
			, Map<String, String> cte) {
		super();
		this.u = u2;
		this.tabNames = tabNames2;
		this.jTabbedpane = jTabbedpane;
		this._A=_A;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000* 2);
			//jTabbedpane.setMnemonicAt(5, KeyEvent.VK_5);// 设置第一个位置的快捷键为0  
			u.zynkxPage= new ZynkxPage(u.text, this._A, pos, pose, etc, cte, u, jTabbedpane);
			u.zynkxPage.setName(tabNames.get(6));
			jTabbedpane.addTab(tabNames.get(6), new ImageIcon(), u.zynkxPage, "中医方剂诊治");// 加入第一个页面  
			Color[] colors= new Color[3];
			colors[0]=new Color(253,233,254);
			colors[1]=new Color(233,254,234);
			colors[2]=new Color(255,251,232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
		//	jTabbedpane.addMouseListener(this);
			//	jTabbedpane.setMnemonicAt(6, KeyEvent.VK_6);// 设置第一个位置的快捷键为0  
			jTabbedpane.validate();
		} catch (IOException e) {
			jTabbedpane.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		} 	
	}
//	@SuppressWarnings("deprecation")
//	@Override
//	public void mouseClicked(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		//
//		if(3== arg0.getButton()) {
//			int index= jTabbedpane.getSelectedIndex();
//			Component component= jTabbedpane.getComponentAt(index);
//			String name= component.getName();
//			if(name.contains("本草")) {
//				return;
//			}
//			//弹出
//			JFrame frameTag= new JFrame(name);
//			//frame.setLayout(null);
//			frameTag.setSize(1330, 720);
//			Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
//			//
//			frameTag.setLocation(point.x, point.y);
//			frameTag.setResizable(false);
//			//frameTag.add(u.zynkx);
//			frameTag.add(jTabbedpane.getSelectedComponent());
//			frameTag.setVisible(true);
//			frameTag.show();
//		//	frameTag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
//			frameTag.addWindowListener(new WindowAdapter() {
//				public void windowClosing(WindowEvent windowevent) {
//					//String command = "taskkill /im dm_new.exe /f";  
//					jTabbedpane.addTab(name, new ImageIcon(), component, name);// 加入第一个页面  
//					jTabbedpane.validate();
//				}
//			});
//			//清空
//			jTabbedpane.remove(component);;	
//		}
//	}
//	@Override
//	public void mouseEntered(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void mouseExited(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void mousePressed(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void mouseReleased(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
}