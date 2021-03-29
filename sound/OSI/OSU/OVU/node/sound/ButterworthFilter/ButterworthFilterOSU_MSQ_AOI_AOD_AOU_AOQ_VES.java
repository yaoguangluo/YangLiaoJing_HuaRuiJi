package OSI.OSU.OVU.node.sound.ButterworthFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
public class ButterworthFilterOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
{
	private static final long serialVersionUID = 1L;
	private FileDialog filedialog;
	public ButterworthFilterOSU_MSQ_AOI_AOD_AOU_AOQ_VES(final ButterworthFilterOSU_MSQ_OPE_OPC_ECI SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI)
	{
		setLayout(null);
		scrollPane = new ScrollPane();
		add(scrollPane);
		panel=new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button = new JButton("Finish");
		button.setBounds(0, 0, 100, 30);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	System.out.println(e.getSource());
                	close=true;
                	SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.value=1;
            }
        });   
		panel.add(button);
		JButton readfile= new JButton("Read JPG");
		readfile.setBounds(0, 35, 100, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog=new FileDialog(new Frame(),"filechoose",FileDialog.LOAD);
				 filedialog.setVisible(true);
				 SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepath=filedialog.getDirectory()+filedialog.getFile();
			     System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepath);
				}
			});
		panel.add(readfile);
		scrollPane.add(panel);
		close=false;
 	}
	public void config()
	{    
		System.out.println("configued");      
	}
}
