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
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import ME.S.stables.PathLinkFile;
import ME.APM.VSQ.OPE.config.DetaJPanel;


public class DetaBuy extends ScrollPane implements MouseListener, KeyListener, ActionListener{	
	private static final long serialVersionUID= 1L;
	public boolean isConfig= true;
	public DetaJPanel SectionJPanel;
	public void init(App app) throws IOException{
		PathLinkFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		JTabbedPane jTabbedpane= new JTabbedPane();
		Container SectionJPanelContainer= new Container();
		SectionJPanel= new DetaJPanel(app);
		SectionJPanel.setLayout(null);
		SectionJPanel.setBounds(0, 0, 800, 750);
		SectionJPanelContainer.add(SectionJPanel);
		jTabbedpane.addTab("¹ºÂò°æÃæ", new ImageIcon(), SectionJPanelContainer, "¹ºÂò°æÃæ");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
		
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