package PEI.thread;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import AVQ.OVU.semaphone.TaskMakeCoWorker;
import ME.APM.VSQ.App;
import ME.APM.VSQ.zhongYao.ZhongYaoTable;
import OCI.ME.analysis.C.A;
public class MakeContainer_ZHONG_YAO extends Thread implements Runnable, MouseListener{
	public Container jpanelFirst;
	public App u;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public Box buttonBox;
	public A _A;
	public Map<String, String> pos;
	public TaskMakeCoWorker taskMakeCoWorker;
	public MakeContainer_ZHONG_YAO(A _A,Container jpanelFirst, App u2, List<String> tabNames2
			, Map<String, String> pos, JTabbedPane jTabbedpane) throws IOException {
		super();
		this.jpanelFirst= jpanelFirst;
		this.u= u2;
		this.tabNames= tabNames2;
		this._A= _A;
		this.jTabbedpane= jTabbedpane;
		this.pos= pos;
		jpanelFirst.setLayout(null);
		jpanelFirst.setBounds(0, 0, 1490, 980);
		JScrollPane jsp_table= null;
		jsp_table= new JScrollPane(new ZhongYaoTable().jTable(u));
		jsp_table.setBounds(5, 80-80, 1440-130, 200+120+50-135);
		jpanelFirst.add(jsp_table);  
	}
	public void start(){ 
		try {
			JScrollPane jsp_data= null;
			jsp_data= new JScrollPane(u.data());
			jsp_data.setBounds(5, 290+ 100- 65+ 50- 215+ 80+ 25, 397, 230-30);
			u.panel.setSize(500, 500);
			u.panel.setBackground(Color.white);
			u.panel.setLayout(new GridLayout(1, 1));
			JScrollPane jsp_jingmai= new JScrollPane(u.panel);
			jsp_jingmai.setBounds(405, 290+ 100- 65+ 50- 215+ 80, 285, 255-30);
			jsp_jingmai.setBackground(Color.white);
			JScrollPane jsp_yaotu= null;
			jsp_yaotu= new JScrollPane(u.panel());
			jsp_yaotu.setBounds(5, 600+ 100- 65+ 50- 215+ 25+ 3-30, 685, 182-20);	
			jsp_yaotu.setBackground(Color.white);
			buttonBox= u.getBox();
			buttonBox.setBackground(Color.white);
			buttonBox.setBounds(5, 290+ 100- 65+ 50- 215+ 80, 398, 22);
			jpanelFirst.add(jsp_yaotu);  
			jpanelFirst.add(jsp_jingmai);    
			jpanelFirst.add(jsp_data);  
			jpanelFirst.add(buttonBox);  
			jpanelFirst.validate();
			jpanelFirst.setName(tabNames.get(0));
			jTabbedpane.addMouseListener(this);
			taskMakeCoWorker= new TaskMakeCoWorker(u, jpanelFirst,_A,pos);
			taskMakeCoWorker.start();
		}catch(Exception e) {
			jTabbedpane.validate();
		}
	}
	
	//窗口弹出和收回枢纽
	@SuppressWarnings("deprecation")
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(3== arg0.getButton()) {
			int index= jTabbedpane.getSelectedIndex();
			Component component= jTabbedpane.getComponentAt(index);
			String name= component.getName();
			if(name== null|| name.contains("本草")) {
				return;
			}
			//弹出
			JFrame frameTag= new JFrame(name);
			//frame.setLayout(null);
			frameTag.setSize(1330, 720);
			Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
			//
			frameTag.setLocation(point.x, point.y);
			frameTag.setResizable(false);
			//frameTag.add(u.jpanel7);
			frameTag.add(jTabbedpane.getSelectedComponent());
			frameTag.setVisible(true);
			frameTag.show();
		//	frameTag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
			frameTag.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent windowevent) {
					//String command = "taskkill /im dm_new.exe /f";  
					jTabbedpane.addTab(name, new ImageIcon(), component, name);// 加入第一个页面  			
					Color[] colors= new Color[3];
					colors[0]= new Color(253,233,254);
					colors[1]= new Color(233,254,234);
					colors[2]= new Color(255,251,232);
					jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
					jTabbedpane.validate();
				}
			});
			//清空
			jTabbedpane.remove(component);;	
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}