package ME.APM.VSQ;
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

import ME.APM.VSQ.OPE.config.SectionJPanel;
import OPM.ESU.admin.PLSQLSectionPanel;
import ME.S.stables.PathLinkFile;

public class AppConfig extends ScrollPane implements MouseListener, KeyListener, ActionListener{	
	private static final long serialVersionUID= 1L;
	public boolean isConfig= true;
	public SectionJPanel SectionJPanel;
	public PLSQLSectionPanel pLSQLJPanel;
	public SectionJPanel pLShellJPanel;
	public void init(App app){
		PathLinkFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		JTabbedPane jTabbedpane= new JTabbedPane();
		Container SectionJPanelContainer= new Container();
		SectionJPanel= new SectionJPanel(app);
		SectionJPanel.setLayout(null);
		SectionJPanel.setBounds(0, 0, 800, 750);
		SectionJPanelContainer.add(SectionJPanel);
		jTabbedpane.addTab("总启动专科与系统配置版面", new ImageIcon(), SectionJPanelContainer, "总启动专科与系统配置版面");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
		
		Container pLSQLJPanelContainer= new Container();
		pLSQLJPanel= new PLSQLSectionPanel(app);
		pLSQLJPanel.setLayout(null);
		pLSQLJPanel.setBounds(0, 0, 800, 750);
		pLSQLJPanelContainer.add(pLSQLJPanel);
		jTabbedpane.addTab("德塔PLSQL数据库语言控制台", new ImageIcon(), pLSQLJPanelContainer, "德塔PLSQL数据库语言控制台");
		jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1); 
		
		Container pLShellJPanelContainer= new Container();
		pLShellJPanel= new SectionJPanel(app);
		pLShellJPanel.setLayout(null);
		pLShellJPanel.setBounds(0, 0, 800, 750);
		pLShellJPanelContainer.add(pLShellJPanel);
		jTabbedpane.addTab("德塔TIN SHELL智能语言控制台", new ImageIcon(), pLShellJPanelContainer, "德塔TIN SHELL智能语言控制台");
		jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2); 
		
		Container endPointJPanelContainer= new Container();
		pLShellJPanel= new SectionJPanel(app);
		pLShellJPanel.setLayout(null);
		pLShellJPanel.setBounds(0, 0, 800, 750);
		endPointJPanelContainer.add(pLShellJPanel);
		jTabbedpane.addTab("德塔WEB智能终端控制台", new ImageIcon(), endPointJPanelContainer, "德塔WEB智能终端控制台");
		jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3); 
		
		
		//this.setLayout(null);
		this.setPreferredSize(new Dimension(800, 750));
		//jTabbedpane.setBounds(0, 0, 805, 505);
		this.add(jTabbedpane);
		this.setBounds(0, 0, 793, 753);
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