package org.OVI.node.image.imageRead;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JButton;

import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;
public class imageReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public imageReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ(){
	}
	public void view() throws Exception{
		scrollPane = new ScrollPane();
		panel=new Panel(){
			private static final long serialVersionUID = 1L;
			public void paint(Graphics g){
				Image im=(Image)lygout.image;
				g.drawImage(im,0,0,this);	  			
			}	
		};	
		//
		scrollPane.add(panel);
		add(scrollPane);
		close=false;
		
		
	}
	@Override  
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ clone() {   
		objectView = (OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}
