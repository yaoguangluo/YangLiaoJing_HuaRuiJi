package ME.sample;
import java.awt.Container;

import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import ME.sample.app.hospital.ChuanRanJiZhenJPanel;
import ME.sample.app.hospital.JianYanBaoGaoJPanel;
import ME.sample.app.hospital.XiYaoJPanel;
import ME.sample.app.hospital.ZhongYaoJPanel;


public class AppHospital extends ScrollPane implements MouseListener, KeyListener, ActionListener{	
	private static final long serialVersionUID= 1L;
	
	public void init(JTextPane name, App app){
		PathLinkFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		JTabbedPane jTabbedpane= new JTabbedPane();
		Container chuanRanJiZhenContainer= new Container();
		ChuanRanJiZhenJPanel chuanRanJiZhenPanel= new ChuanRanJiZhenJPanel(name);
		chuanRanJiZhenContainer.setLayout(null);
		chuanRanJiZhenContainer.setBounds(0, 0, 1490, 980);
		chuanRanJiZhenContainer.add(chuanRanJiZhenPanel);
		jTabbedpane.addTab("临床检验报告A", new ImageIcon(), chuanRanJiZhenContainer, "临床检验报告A");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
			
		Container jianYanBaoGaoContainer= new Container();
		JianYanBaoGaoJPanel jianYanBaoGaoJPanel= new JianYanBaoGaoJPanel(name, app);
		jianYanBaoGaoContainer.setLayout(null);
		jianYanBaoGaoContainer.setBounds(0, 0, 1490, 980);
		jianYanBaoGaoContainer.add(jianYanBaoGaoJPanel);
		jTabbedpane.addTab("临床检验报告B", new ImageIcon(), jianYanBaoGaoContainer, "临床检验报告B");
		jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1); 
		
		Container zhongyaoContainer= new Container();
		ZhongYaoJPanel zhongyaoJPanel= new ZhongYaoJPanel(name);
		zhongyaoContainer.setLayout(null);
		zhongyaoContainer.setBounds(0, 0, 1490, 980);
		zhongyaoContainer.add(zhongyaoJPanel);
		jTabbedpane.addTab("中药推荐", new ImageIcon(), zhongyaoContainer, "中药推荐");
		jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2); 
		
		Container xiYaoContainer= new Container();
		XiYaoJPanel xiYaoJPanel= new XiYaoJPanel(app.jxText);
		xiYaoContainer.setLayout(null);
		xiYaoContainer.setBounds(0, 0, 1490, 980);
		xiYaoContainer.add(xiYaoJPanel);
		jTabbedpane.addTab("西药推荐", new ImageIcon(), xiYaoContainer, "西药推荐");
		jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3); 
		
		//this.setLayout(null);
		this.setPreferredSize(new Dimension(800, 600));
		//jTabbedpane.setBounds(0, 0, 805, 505);
		this.add(jTabbedpane);
		this.setBounds(0, 0, 805, 505);
		this.setVisible(true);
		this.validate();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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