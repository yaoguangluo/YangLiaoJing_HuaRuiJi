package ME.APM.VSQ.OPE.hospital;

import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ZhongYaoJPanel  extends JPanel implements MouseListener, KeyListener, ActionListener{


	private static final long serialVersionUID = 1L;
	public ZhongYaoJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);
		
		name.setBounds(0, 0, 1490, 980);
		//推荐的话\
		this.removeAll();
		ScrollPane scrollPane= new ScrollPane();
		scrollPane.setBounds(0, 0, 1180, 610);
		scrollPane.add(name);
		this.add(scrollPane);
	//	this.add(name);
		//加处方	
		
	}
	public ZhongYaoJPanel(JTextPane name) {
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);
		
		name.setBounds(0, 0, 1180, 1480);
		//推荐的话\
		this.removeAll();
	//	this.add(name);
		//加处方
		ScrollPane scrollPane= new ScrollPane();
		scrollPane.setBounds(0, 0, 1130, 580);
		scrollPane.add(name);
		this.add(scrollPane);	
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
