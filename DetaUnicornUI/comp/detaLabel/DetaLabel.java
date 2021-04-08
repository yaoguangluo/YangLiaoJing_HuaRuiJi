package comp.detaLabel;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	
	public int openx=0;
	public int openy=0;
	public int closex=0;
	public int closey=0;
	//罗瑶光
	//为了避免花屏,影响操作, 逻辑设计为点击打开,鼠标移动触发关闭.
	public DetaLabel(String name, int posx, int posy, int posw, int posh) { 
		super(name); 
		this.setForeground(Color.lightGray);
		this.setBackground(Color.black);
		this.posx= posx;
		this.posy= posy;
		this.posw= posw;
		this.posh= posh;
		this.setBounds(posx, posy, posw, posh);
		this.addMouseListener(new MouseListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!ShowTag) {
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
					openx= point.x;
					openy= point.y;
					return;
				}else {
					if(!frameTag.isShowing()) {
						Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
						frameTag.setSize(830, 50);
						frameTag.setLocation(point.x, point.y);
						frameTag.setVisible(true);
						frameTag.show();
						openx= point.x;
						openy= point.y;
						return;
					}
				}	
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
			
		});
		
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			
			@SuppressWarnings("deprecation")
			public void mouseMoved(MouseEvent e) {
				if(null!= frameTag) {
					Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
					if(Math.abs(point.x- openx)> 15||Math.abs(point.y- openy)> 15) {
						frameTag.hide();
					}
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