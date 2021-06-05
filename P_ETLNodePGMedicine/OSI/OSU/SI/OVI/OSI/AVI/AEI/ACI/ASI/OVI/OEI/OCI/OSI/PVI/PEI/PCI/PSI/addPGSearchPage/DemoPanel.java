package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addPGSearchPage;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import MVQ.button.YLJShowButton;

public class DemoPanel extends JPanel implements MouseListener, MouseMotionListener, MouseWheelListener{
	/**
	 * Author Yaoguang Luo
	 */
	public Image img;
	public ImageIcon icon;
	public YLJShowButton button;
	public int pointX= 0;
	public int pointY= 0;
	public int pointZ= 0;
	
	private static final long serialVersionUID = 1L;

	public DemoPanel() {
		super();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		pointX= e.getX();
		pointY= e.getY();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
	}
}