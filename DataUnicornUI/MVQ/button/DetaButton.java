package MVQ.button;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;

//import javax.swing.BorderFactory;
import javax.swing.JButton;

public class DetaButton extends JButton implements MouseListener, MouseMotionListener, MouseWheelListener{
	private static final long serialVersionUID = 1L;
	public BufferedImage bufferedImage;
	/**
	 * Author Yaoguang Luo
	 */
	public DetaButton(String string, final int x, final int y, java.awt.Color c) {  
		super(string); 
		this.setBackground(c);
		this.addMouseMotionListener(new MouseMotionListener() {
			int motionI= 1;
			public void mouseDragged(MouseEvent e) {
			}
			
			public void mouseMoved(MouseEvent e) {
				Color reg= Color.black;
				if(1== motionI++) {
					reg= Color.black;
				}else if(2== motionI) {
					reg= Color.blue;
				}else if(3== motionI) {
					motionI= 1;
					reg= Color.green;
				}
				Graphics g= getGraphics();
				g.setColor(reg);
				int xPoints[]= {1, 1+ 10, 1};
				int yPoints[]= {1, 1, 1+ 10};
				g.fillPolygon(xPoints, yPoints, 3);
			}
		});
	}
	public DetaButton(String string) {
		super(string); 
		int i= 1+ (int)(Math.abs(Math.random()*100))% 4;
		Color regBackground = null;
		if(1== i) {
			regBackground= Color.orange;
		}else if(2== i) {
			regBackground= Color.magenta;
		}else if(3== i) {
			regBackground= Color.green;
		}else if(4== i) {
			regBackground= Color.red;
		}
		this.setBackground(regBackground);
		this.addMouseMotionListener(new MouseMotionListener() {
			int motionI= 1;
			public void mouseDragged(MouseEvent e) {
			}
			
			public void mouseMoved(MouseEvent e) {
				Color reg= Color.black;
				if(1== motionI++) {
					reg= Color.black;
				}else if(2== motionI) {
					reg= Color.blue;
				}else if(3== motionI) {
					motionI= 1;
					reg= Color.green;
				}
				Graphics g= getGraphics();
				g.setColor(reg);
				int xPoints[]= {1, 1+ 10, 1};
				int yPoints[]= {1, 1, 1+ 10};
				g.fillPolygon(xPoints, yPoints, 3);
			}
		});
		
		this.addMouseListener(this);
		this.addMouseWheelListener(this);
		this.addMouseMotionListener(this);
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getButton());
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getButton());
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}