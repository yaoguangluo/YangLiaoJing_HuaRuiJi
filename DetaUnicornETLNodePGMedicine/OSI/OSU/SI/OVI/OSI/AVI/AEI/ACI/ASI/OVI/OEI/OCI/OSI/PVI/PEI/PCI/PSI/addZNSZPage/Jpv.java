package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZNSZPage;
import java.awt.Color;


import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.Vector;
public class Jpv extends Panel implements Runnable{
	public Vector<Double> lines;
	public Vector<Double> mlines1;
	public Vector<Double> mlines2;
	public Vector<Double> mlines3;
	public Vector<Double> mlines4;
	public Vector<Double> mlines5;
	public Vector<Double> mlines6;
	public Vector<Double> mlines7;
	public Vector<Double> mlines8;
	public Vector<Double> mlines9;
	public Vector<Double> mlines10;
	public Vector<Double> mlines11;
	public Vector<Double> mlines12;
	public Vector<Double> forOutput= new Vector<Double>(); ;
	public String string; 
	Graphics2D graphics2D;
	Graphics graphics;
	private static final long serialVersionUID = 1L;
	public Jpv(Graphics graphics) {
		this.graphics= graphics;
	}

	public void paint1(Vector<Double> mlines) {
		graphics2D.clearRect(0, 200, 300, 130);
		graphics.clearRect(0, 200, 300, 130);
		if (mlines != null) {
			graphics2D.setColor(Color.red); 
			graphics.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+10, 200, (int)v.getX2()+10, (int)v.getY2()+200);      
					graphics.drawLine((int)v.getX1()+10, 200, (int)v.getX2()+10, (int)v.getY2()+200);  
				}
			}
		}
		graphics2D.drawString("傅里叶变换", 0+10,  200+120);
		graphics.drawString("傅里叶变换", 0+10,  200+120);
	}

	public void paint2(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(0, 300+30, 300, 200);
		if (mlines != null) {
			graphics2D.setColor(Color.blue); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+10,350-20,(int)v.getX2()+10,(int)v.getY2()+350-20);      
				}
			}
		}
		graphics2D.drawString("锐化熵", 0+10,  350+120-20);
		graphics.clearRect(0, 300+30, 300, 200);
		if (mlines != null) {
			graphics.setColor(Color.blue); 
			if(mlines.size()>2) {
				for (int i= 0; i < mlines.size(); i++) {
					Line2D v= (Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+10,350-20,(int)v.getX2()+10,(int)v.getY2()+350-20);      
				}
			}
		}
		graphics.drawString("锐化熵", 0+10,  350+120-20);
	}

	public void paint3(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(0,450+30-20, 300, 250);
		if (mlines != null) {
			graphics2D.setColor(Color.yellow); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+10,500-20,(int)v.getX2()+10,(int)v.getY2()+500-20);      
				}
			}
		}
		graphics2D.drawString("高斯过滤", 0+10,  500+120-20);
		graphics.clearRect(0,450+30-20, 300, 250);
		if (mlines != null) {
			graphics.setColor(Color.yellow); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+10,500-20,(int)v.getX2()+10,(int)v.getY2()+500-20);      
				}
			}
		}
		graphics.drawString("高斯过滤", 0+10,  500+120-20);
	}

	public void paint4(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(260, 200, 300, 130);
		if (mlines != null) {
			// .. render sampling graph ..
			graphics2D.setColor(Color.orange); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+260+10,200,(int)v.getX2()+260+10,(int)v.getY2()+200);        
				}
			}
		}
		graphics2D.drawString("细化", 260+10,  200+120);
		graphics.clearRect(260, 200, 300, 130);
		if (mlines != null) {
			// .. render sampling graph ..
			graphics.setColor(Color.orange); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+260+10,200,(int)v.getX2()+260+10,(int)v.getY2()+200);        
				}
			}
		}
		graphics.drawString("细化", 260+10,  200+120);
	}

	public void paint5(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(260,300+30, 300, 200); 
		if (mlines != null) {
			graphics2D.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+260+10,350-20,(int)v.getX2()+260+10,(int)v.getY2()+350-20);          
				}
			}
		}
		graphics2D.drawString("裁剪", 260+10,  350+120-20);
		graphics.clearRect(260,300+30-20, 300, 200); 
		if (mlines != null) {
			graphics.setColor(Color.red); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+260+10,350-20,(int)v.getX2()+260+10,(int)v.getY2()+350-20);          
				}
			}
		}
		graphics.drawString("裁剪", 260+10,  350+120-20);
	}

	public void paint6(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(260, 450+30-20, 300, 250);
		if (mlines!= null) {
			graphics2D.setColor(Color.BLUE); 
			if(mlines.size()> 2) {
				for (int i= 0; i< mlines.size(); i++) {
					Line2D v= (Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+ 260+ 10, 500-20, (int)v.getX2()+ 260+ 10, (int)v.getY2()+ 500-20);        
				}
			}
		}
		graphics2D.drawString("平移", 260+10,  500+120-20);
		graphics.clearRect(260, 450+30-20, 300, 250);
		if (mlines!= null) {
			graphics.setColor(Color.BLUE); 
			if(mlines.size()> 2) {
				for (int i= 0; i< mlines.size(); i++) {
					Line2D v= (Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+ 260+ 10, 500-20, (int)v.getX2()+ 260+ 10, (int)v.getY2()+ 500-20);        
				}
			}
		}
		graphics.drawString("平移", 260+10,  500+120-20);
	}

	public void paint7(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(520, 200, 500, 100+30);
		if (mlines != null) {
			graphics2D.setColor(Color.BLUE); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+520+10,200,(int)v.getX2()+520+10,(int)v.getY2()+200);        
				}
			}
		}
		graphics2D.drawString("高阶傅里叶", 520+10,  200+120);
		graphics.clearRect(520, 200, 500, 100+30);
		if (mlines != null) {
			graphics.setColor(Color.BLUE); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+520+10,200,(int)v.getX2()+520+10,(int)v.getY2()+200);        
				}
			}
		}
		graphics.drawString("高阶傅里叶", 520+10,  200+120);
	}

	public void paint8(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(520,300+30, 500, 200); 
		if (mlines != null) {
			graphics2D.setColor(Color.cyan); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+520+10,350-20,(int)v.getX2()+520+10,(int)v.getY2()+350-20);        
				}
			}
		}
		graphics2D.drawString("截取拉伸", 520+10,  350+120-20);
		graphics.clearRect(520,300+30, 500, 200); 
		if (mlines != null) {
			graphics.setColor(Color.cyan); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+520+10,350-20,(int)v.getX2()+520+10,(int)v.getY2()+350-20);        
				}
			}
		}
		graphics.drawString("截取拉伸", 520+10,  350+120-20);
	}

	public void paint9(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(520,450+30-20, 500, 250+30);
		if (mlines != null) {
			graphics2D.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+520+10,500-20,(int)v.getX2()+520+10,(int)v.getY2()+500-20);         
				}
			}
		}
		graphics2D.drawString("细化", 520+10,  500+120-20);
		graphics.clearRect(520,450+30-20, 500, 250+30);
		if (mlines != null) {
			graphics.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+520+10,500-20,(int)v.getX2()+520+10,(int)v.getY2()+500-20);         
				}
			}
		}
		graphics.drawString("细化", 520+10,  500+120-20);
	}

	public void paint10(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(780, 200, 500, 100+30);
		if (mlines != null) {
			graphics2D.setColor(Color.BLUE); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+780+10,200,(int)v.getX2()+780+10,(int)v.getY2()+200);        
				}
			}
		}
		graphics2D.drawString("量化裁剪", 780+10,  200+120);
		graphics.clearRect(780, 200, 500, 100+30);
		if (mlines != null) {
			graphics.setColor(Color.BLUE); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+780+10,200,(int)v.getX2()+780+10,(int)v.getY2()+200);        
				}
			}
		}
		graphics.drawString("量化裁剪", 780+10,  200+120);
	}

	public void paint11(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(780,300+30-20, 500, 400); 
		if (mlines != null) {
			// .. render sampling graph ..
			graphics2D.setColor(Color.white); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+780+10,350-20,(int)v.getX2()+780+10,(int)v.getY2()+350-20);       
				}
			}
		}
		graphics2D.drawString("输出", 780+10,  350+120-20);
		graphics.clearRect(780,300+30-20, 500, 400); 
		if (mlines != null) {
			// .. render sampling graph ..
			graphics.setColor(Color.white); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+780+10,350-20,(int)v.getX2()+780+10,(int)v.getY2()+350-20);       
				}
			}
		}
		graphics.drawString("输出", 780+10,  350+120-20);
		graphics2D.drawString("噪音报警类别:", 780+10,  350+220);
		graphics.drawString("噪音报警类别:", 780+10,  350+220);
	}

	public void paint12(Vector<Double> mlines) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(780, 450, 500, 250);
		if (mlines != null) {
			graphics2D.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics2D.drawLine((int)v.getX1()+780+10,500,(int)v.getX2()+780+10,(int)v.getY2()+500);          
				}
			}
		}
		graphics2D.drawString("12", 780+10, 500+50);
		graphics.clearRect(780, 450, 500, 250);
		if (mlines != null) {
			graphics.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					graphics.drawLine((int)v.getX1()+780+10,500,(int)v.getX2()+780+10,(int)v.getY2()+500);          
				}
			}
		}
	}

	public void paintvalue(String v1) {
		graphics2D.setColor(Color.black); 
		graphics2D.clearRect(0,600, 1600, 350);
		graphics2D.setFont(new Font("宋体",Font.BOLD+Font.ITALIC,20));
		if(v1!=null)
			graphics2D.drawString("你说的是"+v1, 10, 780);
	}

	public void paint(Graphics g, Vector<Double> lines, Vector<Double> forOutput) {
		int w= 1400;
		int h= 980;
		int INFOPAD= 15;
		graphics2D= (Graphics2D) g;
		graphics2D.setBackground(Color.black);
		graphics2D.clearRect(0, 40, w, 200);
		graphics2D.setColor(Color.black);
		graphics2D.fillRect(0, h-INFOPAD, w, INFOPAD);
		if (lines != null) {
			// .. recode data .. 
			forOutput.clear(); 	
			graphics2D.setColor(Color.pink);
			for (int i= 1,j= 1; i< lines.size()- 1; i++, j++) {
				Line2D v= (Line2D) lines.get(i);
				Line2D v1= (Line2D) lines.get(i+ 1);
				forOutput.add(lines.get(i+ 1));
				int x= (int)v.getY1()+ 120;
				int y= (int)v1.getY2()+ 120;
				if(x<42) {
					x=42;
				}
				if(x>185) {
					x=185;
				}
				if(y<42) {
					y=42;
				}
				if(y>185) {
					y=185;
				}
				graphics2D.drawLine(j+ 10, x, j+ 1+ 10,y);  
	
			}
		}
		graphics2D.drawString("时序波", 0+10,  120+50);
		graphics.clearRect(0, 40, w, 200);
		graphics.setColor(Color.white);
		graphics.fillRect(0, h-INFOPAD, w, INFOPAD);
		if (lines != null) {
			// .. recode data .. 
			forOutput.clear(); 	
			graphics.setColor(Color.pink);
			for (int i= 1,j= 1; i< lines.size()- 1; i++, j++) {
				Line2D v= (Line2D) lines.get(i);
				Line2D v1= (Line2D) lines.get(i+ 1);
				forOutput.add(lines.get(i+ 1));
				int x= (int)v.getY1()+ 120;
				int y= (int)v1.getY2()+ 120;
				if(x<42) {
					x=42;
				}
				if(x>200) {
					x=190;
				}
				if(y<42) {
					y=42;
				}
				if(y>200) {
					y=190;
				}
				graphics.drawLine(j+ 10, x, j+ 1+ 10,y);  
			}
		}
		graphics.drawString("时序波", 0+10,  120+50);
		
	}

	@Override
	public void run() {
	}
}
