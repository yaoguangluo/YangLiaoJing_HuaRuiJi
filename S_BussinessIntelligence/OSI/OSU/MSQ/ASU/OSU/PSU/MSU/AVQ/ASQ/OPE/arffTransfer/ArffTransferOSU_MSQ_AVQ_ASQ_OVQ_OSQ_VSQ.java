package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.arffTransfer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class ArffTransferOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public ArffTransferOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ()
	{
 	}
	public void view()
	{
		scrollPane = new ScrollPane();
		panel=new Panel();
		panel.setBackground(Color.yellow);	
		//
	    JScrollPane j=new JScrollPane();
	    tableout.setBackground(new Color(240, 128, 128));
	    tableout.setPreferredSize(new Dimension(200,200));
	    tableout.setVisible(true);
		j.setViewportView(tableout);
	    //
		panel.add(j);
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
