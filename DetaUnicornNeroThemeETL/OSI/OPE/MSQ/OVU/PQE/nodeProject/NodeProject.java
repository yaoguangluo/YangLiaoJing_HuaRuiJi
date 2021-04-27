package OSI.OPE.MSQ.OVU.PQE.nodeProject;

import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class NodeProject extends JPanel implements ComponentListener {
	private static final long serialVersionUID= 866589699634559456L;
	private ImageIcon images;
	public Image newImg;
	public BufferedImage bufferedImage;
	public Image img;
	public int width;
	public int height;
	public JLabel jlabel;
	public NodeProject() {
		images= new ImageIcon(this.getClass().getResource("etl.png"));
		jlabel = new JLabel();
		jlabel.setIcon(images);
		this.add(jlabel);
		this.validate();
		this.addComponentListener(this);
	}
	@Override
	public void componentResized(ComponentEvent e) {
		img = images.getImage().getScaledInstance(this.width<= 0? 100: this.width
				, this.height<= 0? 100: this.height, java.awt.Image.SCALE_SMOOTH);
		jlabel.setIcon(new ImageIcon(img));
		jlabel.validate();
		this.validate();
	}
	@Override
	public void componentMoved(ComponentEvent e) {
		
	}
	@Override
	public void componentShown(ComponentEvent e) {
		
	}
	@Override
	public void componentHidden(ComponentEvent e) {

	}
}