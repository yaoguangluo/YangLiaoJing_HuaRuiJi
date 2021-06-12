package PEI.thread;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import ME.APM.VSQ.App;
import ME.APM.VSQ.xlx.CoAuthorForWord;
import MVQ.button.DetaButton;
import OCI.ME.analysis.C.A;
public class MakeContainerQMDJ extends Thread implements Runnable, MouseMotionListener{
	public Container jpanel5;
	public App u;
	public int dice= 0;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public A _A;
	public JPanel panel_bg;
	public Map<String, String> pos;
	private int currentX;
	private int currentY;
	public MakeContainerQMDJ(A _A,Container jpanel5, App u2, JTabbedPane jTabbedpane
			, List<String> tabNames2,  Map<String, String> pos, Map<String, String> pose, Map<String, String> etc
			, Map<String, String> cte) {
		super();
		this.u= u2;
		this.tabNames= tabNames2;
		this.jTabbedpane= jTabbedpane;
		this.jpanel5= jpanel5;
		this._A= _A;
		this.pos= pos;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*2);
			panel_bg = new JPanel(); 
			panel_bg.setSize(460, 460);
			JLabel label88 = new JLabel(u.png88);
			//u.panel.setLayout(new GridLayout(20, 1));
			panel_bg.add(label88);
			panel_bg.addMouseMotionListener(this);
			JScrollPane jsp_bagua = new JScrollPane(panel_bg);
			jsp_bagua.setBounds(10, 60, 635, 410);
			
			JPanel panel_shun = new JPanel(); 
			panel_shun.setSize(460, 460);
			JLabel jshun = new JLabel(u.shun);
			//u.panel.setLayout(new GridLayout(20, 1));
			panel_shun.add(jshun);
			JScrollPane jsp_shun = new JScrollPane(panel_shun);
			jsp_shun.setBounds(10, 10+410+40+20, 635,190-38);

			JPanel panel_wsp = new JPanel(); 
			panel_wsp.setSize(460, 460);
			JLabel jwsp = new JLabel(u.wsp);
			//u.panel.setLayout(new GridLayout(20, 1));
			panel_wsp.add(jwsp);
			JScrollPane jsp_wsp = new JScrollPane(panel_wsp);
			jsp_wsp.setBounds(650+10, 10, 320,320);


			JPanel panel_wxp = new JPanel(); 
			panel_wxp.setSize(460, 460);
			JLabel jwxp = new JLabel(u.wxp);
		//	u.panel.setLayout(new GridLayout(20, 1));
			panel_wxp.add(jwxp);
			JScrollPane jsp_wxp = new JScrollPane(panel_wxp);
			jsp_wxp.setBounds(650+320+20, 10, 320, 320);

			JPanel panel_qp4 = new JPanel(); 
			panel_qp4.setSize(360, 360);
			JLabel jqp4 = new JLabel(u.qp4);
			u.panel.setLayout(new GridLayout(13, 1));
			panel_qp4.add(jqp4);
			JScrollPane jsp_qp4 = new JScrollPane(panel_qp4);
			jsp_qp4.setBounds(650+10, 10+320+20, 320, 320-38);

			JPanel panel_wwp = new JPanel(); 
			panel_wwp.setSize(460, 460);
			JLabel jwwp = new JLabel(u.wwp);
		//	u.panel.setLayout(new GridLayout(20, 1));
			panel_wwp.add(jwwp);
			JScrollPane jsp_wwp = new JScrollPane(panel_wwp);
			jsp_wwp.setBounds(650+320+20, 10+320+20, 320,320-38);


			Box buttonVecBox = new Box(BoxLayout.X_AXIS); 
			buttonVecBox.setBounds(10, 10, 630, 22);
			DetaButton bt_skch = new DetaButton("生克乘诲");
			bt_skch.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("static-access")
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_skch);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_skch), 0);
						
							jTabbedpane.validate();
						}
					});


			DetaButton bt_bgxs = new DetaButton("卦子象数");
			bt_bgxs.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_gzxs);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_gzxs), 0);
							jTabbedpane.validate();
						}
					});
			buttonVecBox.add(bt_bgxs);

			DetaButton bt_bgbz = new DetaButton("八纲辨证");
			bt_bgbz.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_bgbz);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_bgbz), 0);
							jTabbedpane.validate();
						}
					});

			DetaButton bt_ljbz = new DetaButton("六经辨证");
			bt_ljbz.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_ljbz);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_ljbz), 0);
							jTabbedpane.validate();
						}
					});

			DetaButton bt_sjbz = new DetaButton("三焦辨证");
			bt_sjbz.addActionListener(
					new ActionListener(){    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_sjbz);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_sjbz), 0);
							jTabbedpane.validate();
						}
					});

			DetaButton bt_qxbz = new DetaButton("气血辨证");
			bt_qxbz.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_qxbz);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_qxbz), 0);
							jTabbedpane.validate();
						}
					});
			DetaButton bt_jlbz = new DetaButton("天星辩证");
			bt_jlbz.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.png88);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.png88), 0);
							jTabbedpane.validate();
						}
					});

			buttonVecBox.add(bt_bgbz);

			buttonVecBox.add(bt_ljbz);
			buttonVecBox.add(bt_sjbz);
			buttonVecBox.add(bt_qxbz);
			buttonVecBox.add(bt_jlbz);

			buttonVecBox.add(bt_skch);
			buttonVecBox.add(bt_bgxs);

			
			
			Box buttonSecondVecBox = new Box(BoxLayout.X_AXIS); 
			buttonSecondVecBox.setBounds(10, 35, 630, 22);
			
			DetaButton bt_jlbz1 = new DetaButton("堪舆定藏");
			bt_jlbz1.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_KYCQ);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_KYCQ), 0);
							jTabbedpane.validate();
						}
					});
			
			DetaButton bt_jlbz2 = new DetaButton("梅花易数");
			bt_jlbz2.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_MHYS);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_MHYS), 0);
							jTabbedpane.validate();
						}
					});
			
			DetaButton bt_jlbz3 = new DetaButton("渊海子平");
			bt_jlbz3.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_YHZP);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_YHZP), 0);
							jTabbedpane.validate();
						}
					});
			
			DetaButton bt_jlbz4 = new DetaButton("青囊遵生");
			bt_jlbz4.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_QNZS);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_QNZS), 0);
							jTabbedpane.validate();
						}
					});
			
			DetaButton bt_jlbz5 = new DetaButton("御定六壬");
			bt_jlbz5.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_YDLR);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_YDLR), 0);
							jTabbedpane.validate();
						}
					});
			
			DetaButton bt_jlbz6 = new DetaButton("吉宅风水");
			bt_jlbz6.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_ZSBZ);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_ZSBZ), 0);
							jTabbedpane.validate();
						}
					});
			DetaButton bt_jlbz7 = new DetaButton("河洛理数");
			bt_jlbz7.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_HLLS);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_wsp.removeAll();
							panel_wsp.add(panel_wwp.getComponents()[0], 0);
							panel_wsp.updateUI();
							panel_wwp.add(panel_qp4.getComponents()[0], 0);
							panel_wwp.updateUI();
							panel_qp4.add(panel_wxp.getComponents()[0], 0);
							panel_qp4.updateUI();
							panel_wxp.add(new JLabel(u.bagua_HLLS), 0);
							panel_wxp.updateUI();
							jTabbedpane.validate();
						}
					});
			buttonSecondVecBox.add(bt_jlbz1);
			buttonSecondVecBox.add(bt_jlbz2);
			buttonSecondVecBox.add(bt_jlbz3);
			buttonSecondVecBox.add(bt_jlbz4);
			buttonSecondVecBox.add(bt_jlbz5);
			buttonSecondVecBox.add(bt_jlbz6);
			buttonSecondVecBox.add(bt_jlbz7);
			
			DetaButton bt_3d = new DetaButton(">");
			bt_3d.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							CoAuthorForWord app;
							try {
								app = new CoAuthorForWord(null, null, null);
								app.setSize(850, 400);
								app.setVisible(true);
								JFrame f = new JFrame();
								f.add(app);
								f.setTitle("三维奇门");
								f.setLocationRelativeTo(null);
								f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
								f.setSize(650,480);
								f.setVisible(true);
							} catch (HeadlessException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}   
						}
					});
			bt_3d.setBounds(612, 10, 30, 47);
			
			jpanel5.add(bt_3d);
			jpanel5.add(buttonVecBox);
			jpanel5.add(buttonSecondVecBox);
			jpanel5.add(jsp_bagua);
			jpanel5.add(jsp_wwp);
			jpanel5.add(jsp_wxp);
			jpanel5.add(jsp_wsp);
			jpanel5.add(jsp_qp4);
			jpanel5.add(jsp_shun);
			jpanel5.setLayout(null);
			jpanel5.setBounds(0, 0, 1490, 980);
			jpanel5.setName(tabNames.get(4));
			jTabbedpane.addTab(tabNames.get(4),new ImageIcon() , jpanel5, "奇门遁甲");// 加入第一个页面  
			Color[] colors= new Color[3];
			colors[0]=new Color(253,233,254);
			colors[1]=new Color(233,254,234);
			colors[2]=new Color(255,251,232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
			jTabbedpane.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(currentX==0&& currentY==0) {
			currentX= e.getX();
			currentY= e.getY();	
		}
		panel_bg.getComponent(0);
		
		//new BufferedImage();
		
		
		currentX= e.getX();
		currentY= e.getY();
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}