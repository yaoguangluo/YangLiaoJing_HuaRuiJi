package MVQ.label;

import java.awt.Color;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ME.APM.VSQ.OPE.hospital.DetaLabelStables;
public class DetaLabel extends JLabel{
	private static final long serialVersionUID = 1L;
	public String tagName= "";
	public JLabel jLabelTop;
	public JLabel jLabelMed;
	public JLabel jLabelBot;
	public Box box;
	//先碎片函数调试, 之后面板函数集成
	public JFrame frameTag= new JFrame("提示栏");;
	public boolean ShowTag= false;
	public boolean inited= false;
	public int openx=0;
	public int openy=0;
	public int closex=0;
	public int closey=0;
	public boolean isIndex= false;
	public String indexString;

	//罗瑶光
	//为了避免花屏,影响操作, 逻辑设计为点击打开,鼠标移动触发关闭.
	public DetaLabel(String name) { 
		super(name); 
		this.setForeground(Color.lightGray);
		this.setBackground(Color.black);
		this.addMouseListener(new MouseListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!ShowTag) {
					return;
				}	
				if(!inited) {
					//jlable最简分行
					jLabelTop= new JLabel(tagName.substring(0, tagName.length()>70? 70: tagName.length()));
					jLabelTop.setBounds(0, 0, 900, 30);
					frameTag= new JFrame("提示栏");
					frameTag.setLayout(null);
					frameTag.setSize(900, 60);
					if(tagName.length()> 70) {
						jLabelMed= new JLabel(tagName.substring(70, tagName.length()>140? 140: tagName.length()));
						jLabelMed.setBounds(0, 30, 900, 30);
						frameTag.setSize(900, 120);
					}
					if(tagName.length()> 140) {
						jLabelBot= new JLabel(tagName.substring(140, tagName.length()));
						jLabelBot.setBounds(0, 60, 900, 30);
					}
					//摘自第37行 https://blog.csdn.net/code_better/article/details/53505962
					Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
					//
					frameTag.setLocation(point.x, point.y);
					frameTag.setResizable(false);
					frameTag.add(jLabelTop);
					if(tagName.length()> 70) {
						frameTag.add(jLabelMed);
					}
					if(tagName.length()> 140) {
						frameTag.add(jLabelBot);
					}
					frameTag.setVisible(true);
					frameTag.show();
					DetaLabelStables.stableImages.setTarget(true);
					frameTag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					openx= point.x;
					openy= point.y;
					inited= true;
					return;
				}else {
					if(!frameTag.isShowing()) {
						Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
						frameTag.setSize(900, 150);
						frameTag.setLocation(point.x, point.y);
						frameTag.setVisible(true);
						frameTag.show();
						DetaLabelStables.stableImages.setTarget(true);
						openx= point.x;
						openy= point.y;
						return;
					}
				}	
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
			}

		});
		//find and set tag
		DetaLabelConjunction.detaLabelConjunction.findAndSetTag(this, name);
	}


	public void setTag(String string, boolean True) {
		ShowTag= True;
		tagName= null== string? "": string.toString();
		if(null!= jLabelTop) {
			jLabelTop.setText(tagName.substring(0, tagName.length()> 70? 70: tagName.length()));
		}else {
			jLabelTop= new JLabel(tagName.substring(0, tagName.length()> 70? 70: tagName.length()));
		}
		if(tagName.length()> 70) {
			if(null!= jLabelBot) {
				jLabelMed.setText(tagName.substring(70, tagName.length()> 140? 140: tagName.length()));
			}else {
				jLabelMed= new JLabel(tagName.substring(70, tagName.length()> 140? 140: tagName.length()));
			}
		}
		if(tagName.length()> 140) {
			if(null!= jLabelBot) {
				jLabelBot.setText(tagName.substring(140, tagName.length()));
			}else {
				jLabelBot= new JLabel(tagName.substring(140, tagName.length()));
			}
		}
	}
}