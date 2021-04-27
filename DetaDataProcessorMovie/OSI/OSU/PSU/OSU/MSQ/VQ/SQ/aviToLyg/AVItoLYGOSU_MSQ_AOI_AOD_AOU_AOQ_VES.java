package OSI.OSU.PSU.OSU.MSQ.VQ.SQ.aviToLyg;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

import java.awt.FileDialog;


import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
public class AVItoLYGOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES{
	private static final long serialVersionUID = 1L;
	private FileDialog filedialog;
	public AVItoLYGOSU_MSQ_AOI_AOD_AOU_AOQ_VES(final AVItoLYGOSU_MSQ_OPE_OPC_ECI SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI){
		setLayout(null);
		scrollPane = new ScrollPane();
		add(scrollPane);
		panel=new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button = new JButton("Finish");
		button.setBounds(0, 0, 200, 30);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	System.out.println(e.getSource());
                	close=true;
                	SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.value=1;
            }
        });   
		panel.add(button);
		JButton readfile= new JButton("Read AVI");
		readfile.setBounds(0, 35, 200, 40);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog=new FileDialog(new Frame(),"readfilechoose",FileDialog.LOAD);
				 filedialog.setVisible(true);
				 SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepath=filedialog.getDirectory()+filedialog.getFile();
			     System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepath);

				}
			});
		panel.add(readfile);
		
		
		JButton readfile1= new JButton("Read AVI'S WAV");
		readfile1.setBounds(0, 80, 200, 50);
		readfile1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog=new FileDialog(new Frame(),"readfilechoose",FileDialog.LOAD);
				 filedialog.setVisible(true);
				 SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepathWAV=filedialog.getDirectory()+filedialog.getFile();
			     System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepath);

				}
			});
		panel.add(readfile1);
		JButton writefile= new JButton("WRITE LYG");
		writefile.setBounds(0, 135, 200,60 );
		writefile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog= new FileDialog(new Frame(),"writefilechoose",FileDialog.LOAD);
				 filedialog.setVisible(true);
				 SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.writefile= filedialog.getDirectory()+ filedialog.getFile();
			     System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.writefile);

				}
			});
		panel.add(writefile);	
		scrollPane.add(panel);
		close= false;
 	}
	public void config()
	{    
		System.out.println("configued");      
	}
}
