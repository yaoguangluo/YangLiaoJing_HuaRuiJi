package MVQ.label;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ME.APM.VSQ.OPE.hospital.DetaLabelStables;

public class DetaIndexLabel extends JLabel implements MouseListener{
	private static final long serialVersionUID = 1L;
	public String tagName= "";
	public Box box;
	//先碎片函数调试, 之后面板函数集成
	public JFrame frameTag= new JFrame("提示栏");
	public boolean ShowTag= false;
	public boolean inited= false;
	public int openx=0;
	public int openy=0;
	public int closex=0;
	public int closey=0;
	public boolean isIndex= false;
	public List<DetaLabel> jFrameList;
	public String indexString;

	//罗瑶光
	//为了避免花屏,影响操作, 逻辑设计为点击打开,鼠标移动触发关闭.
	public DetaIndexLabel(String name, List<DetaLabel> jFrameList ) { 
		super(name); 
		this.setForeground(Color.lightGray);
		this.setBackground(Color.black);
		this.addMouseListener(this);
		this.jFrameList= jFrameList;
	}

	public void setTag(String string, boolean True) {
		
	}

	public void setIndex(String string) {
		DetaLabelStables.stableImages.setIndexString(string);
		this.indexString= string;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(!DetaLabelStables.stableImages.isIndexed) {
			return;
		}
		if(this.indexString.equalsIgnoreCase("A")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("A")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("B")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("B")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("C")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("C")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("D")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("D")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("E")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("E")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("F")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("F")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("G")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("G")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("H")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("H")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("I")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("I")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("J")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("J")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("K")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("K")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("L")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("L")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("M")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("M")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("N")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("N")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("O")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("O")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("P")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("P")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("Q")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("Q")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("R")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("R")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("S")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("S")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("T")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("T")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("U")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("U")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("V")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("V")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("W")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("W")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("X")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("X")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("Y")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("Y")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("Z")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("Z")) {
					detaLabel.setForeground(Color.red);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
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
}