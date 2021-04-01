package comp.label;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class DetaLabel extends JLabel{
	private static final long serialVersionUID = 1L;
	public String tagName= "";
	public JLabel jLabel;
	//先碎片函数调试, 之后面板函数集成
	public JFrame frameTag;
	public boolean ShowTag= false;
	public int posx= 0;
	public int posy= 0;
	public int posw= 0;
	public int posh= 0;
	//罗瑶光
	public DetaLabel(String name, int posx, int posy, int posw, int posh) { 
		super(name); 
		this.setForeground(Color.lightGray);
		this.setBackground(Color.black);
		this.posx= posx;
		this.posx= posx;
		this.posx= posx;
		this.posx= posx;
		this.setBounds(posx, posy, posw, posh);
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			
			public void mouseMoved(MouseEvent e) {
				if(!ShowTag) {
					return;
				}
				
				if(null!= frameTag&& frameTag.isShowing()) {
					return;
				}
				
				if(null== frameTag) {
					jLabel= new JLabel(tagName);
					frameTag= new JFrame("提示栏");
					//frame.setLayout(null);
					frameTag.setSize(960, 70);
					//摘自第37行 https://blog.csdn.net/code_better/article/details/53505962
					Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
					//
					frameTag.setLocation(point.x, point.y);
					frameTag.setResizable(false);
					frameTag.add(jLabel);
					frameTag.setVisible(true);
					frameTag.show();
					frameTag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
				}else {
					Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
					frameTag.setSize(830, 50);
					frameTag.setLocation(point.x, point.y);
					frameTag.setVisible(true);
					frameTag.show();
				}
			}
		});
	}
	public void setTag(String string, boolean True) {
		// TODO Auto-generated method stub
		ShowTag= True;
		tagName= null== string? "":string.toString();
		if(null!= jLabel) {
			jLabel.setName(tagName);
		}else {
			jLabel= new JLabel(tagName);
		}
	}
}