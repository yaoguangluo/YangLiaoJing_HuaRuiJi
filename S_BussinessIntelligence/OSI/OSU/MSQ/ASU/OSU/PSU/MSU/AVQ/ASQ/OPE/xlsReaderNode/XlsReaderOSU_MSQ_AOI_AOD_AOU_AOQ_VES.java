package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.xlsReaderNode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class XlsReaderOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES{
	private static final long serialVersionUID = 1L;
	private FileDialog filedialog;
	@SuppressWarnings("rawtypes")
	private JComboBox jcb;
	HSSFWorkbook wb;
	HSSFDataFormat fo;
	public XlsReaderOSU_MSQ_AOI_AOD_AOU_AOQ_VES(final XlsReaderOSU_MSQ_OPE_OPC_ECI SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI) throws IOException{
		setLayout(null);
		scrollPane = new ScrollPane();
		add(scrollPane);
		panel=new Panel();
		panel.setLayout(null);	
		panel.setBackground(Color.white);
		JButton readfile= new JButton("Read File");
		readfile.setBounds(0, 0, 100, 30);
		readfile.addActionListener(new ActionListener(){
			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			public void actionPerformed(ActionEvent arg0) {
				filedialog=new FileDialog(new Frame(),"filechoose",FileDialog.LOAD);
				filedialog.setVisible(true);
				SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepath=filedialog.getDirectory()+filedialog.getFile();
				System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepath);     
				FileInputStream fis = null;
				try {
					fis = new FileInputStream(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.filepath);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
				POIFSFileSystem fs = null;
				try {
					fs = new POIFSFileSystem(fis);
				} catch (IOException e) {
					e.printStackTrace();
				} 
				wb = null;
				try {
					wb = new HSSFWorkbook(fs);
				} catch (IOException e) {
					e.printStackTrace();
				}
				String [] str=new String [wb.getNumberOfSheets()];
				for(int i=0;i<wb.getNumberOfSheets();i++){
					str[i]=new String(Integer.toString(i));
				}
				JButton choose=new JButton("Index choose");
				choose.setBounds(155, 0, 200, 30);
				choose.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0){
						HSSFSheet sheet = wb.getSheetAt(Integer.valueOf(jcb.getSelectedIndex())); 		 
						System.out.println(jcb.getSelectedIndex());
						HSSFRow row = sheet.getRow(0);   
						String[][] content= new String[sheet.getPhysicalNumberOfRows()][row.getLastCellNum()];
						String[] spec=new String[row.getLastCellNum()];
						if (row != null) {
							HSSFCell cell = null;
							for(int j=0;j<row.getLastCellNum();j++){
								cell = row.getCell(j);
								if(cell.getCellType()==1){
									System.out.println(cell.getStringCellValue());
									spec[j]=new String("String"); 
								}
								if(cell.getCellType()==0){
									if(HSSFDateUtil.isCellDateFormatted(cell)){
										System.out.println(cell.getDateCellValue());
										spec[j]=new String("Date"); 
									}else{
										System.out.println(cell.getNumericCellValue());
										spec[j]=new String("Number"); 
									}
								}
							}
						}
						for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
							row = sheet.getRow(i); 
							if (row != null) {
								HSSFCell cell = null;
								for(int j=0;j<row.getLastCellNum();j++){
									cell = row.getCell(j);
									if(cell.getCellType()==1){
										System.out.println(cell.getStringCellValue());
										content[i][j]=new String(cell.getStringCellValue());
									}
									if(cell.getCellType()==0){
										if(HSSFDateUtil.isCellDateFormatted(cell)){
											System.out.println(cell.getDateCellValue().toString());
											content[i][j]=new String(cell.getDateCellValue().toString());
										}
										else{
											System.out.println(cell.getNumericCellValue());
											content[i][j]=new String(Double.toString(cell.getNumericCellValue()));
										}
									}
								}
							}
						}		
						SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein= new JTable(content,spec); 
						SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.setBounds(0, 100, 400, 400);
						SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein.setVisible(true);
						panel.add(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein);			
					}}
						);
				panel.add(choose);
				jcb= new JComboBox(str);
				jcb.setBounds(105, 0, 150, 30);
				panel.add(jcb);   
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close= false;
	}
	public void config(){
		System.out.println("configued");      
	}
}
