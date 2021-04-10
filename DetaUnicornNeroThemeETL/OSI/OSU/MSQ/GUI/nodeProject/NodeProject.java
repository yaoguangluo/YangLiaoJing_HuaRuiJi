package OSI.OSU.MSQ.GUI.nodeProject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.OSU.tinos.image.ToolkitImageToBufferImage;
public class NodeProject extends JScrollPane {
	private static final long serialVersionUID= 866589699634559456L;
	private ImageIcon images;
	public Image newImg;
	public BufferedImage bufferedImage;
	public MyPanel jPanel;
	public Image img;
	public int width;
	public int height;
	public NodeProject() {
		images= new ImageIcon(this.getClass().getResource("etl.png"));
		img= images.getImage(); 
		jPanel= new MyPanel();
		jPanel.repaint();
		this.setViewportView(jPanel);
	};
	public void addimg() {
		images= new ImageIcon(this.getClass().getResource("etl.png"));
		img= images.getImage(); 
		width= images.getIconWidth();
		height= images.getIconHeight();
		bufferedImage= new ToolkitImageToBufferImage().toolkitImageIconToBufferImage(0, 0, images);
	}
	public class MyPanel extends JPanel {	
		public Image newimg;
		private static final long serialVersionUID = 1L;
		public MyPanel(){
			setLayout(null);
		}
		public void paint(Graphics g) {
			try {
				//因为APPLET的线程化，先后顺序不是很明确，于是加个while 罗瑶光
				while(null== g) {
					g= this.getGraphics();
					Thread.sleep(3000);
				}
				((Graphics2D) g).drawImage(bufferedImage, 0, 0, this);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}