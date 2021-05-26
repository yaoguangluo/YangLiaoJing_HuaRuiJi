package ME.APM.VSQ.OPE.config;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import OSQ.disk.GetDisk;

public class DetaJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID= 1L;
	public JTextPane jTextPane;
	@SuppressWarnings("resource")
	public DetaJPanel(App app) throws IOException{
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.white);
		Process process= Runtime.getRuntime().exec(  
				new String[] {"wmic", "cpu", "get", "ProcessorId"});  
		process.getOutputStream().close();
		String value= "";
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(process.getInputStream()); 
		while(sc.hasNext()) {
			value+=sc.next();	
		}
		value+= new GetDisk().getKey();
		process= Runtime.getRuntime().exec(  
				new String[] {"wmic", "dram", "get", "ProcessorId"});  
		process.getOutputStream().close();
		sc= new Scanner(process.getInputStream()); 
		while(sc.hasNext()) {
			value+=sc.next();	
		}
		JLabel jlabel= new JLabel();
		jlabel.setBackground(Color.orange);
		jlabel.setText("请将此序列号"+ value+ "拍照发送给微信客服号:15116110525");
		jlabel.setBounds(0, 0, 800, 600);
		this.add(jlabel);
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