package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.arffTransfer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class ArffTransferOSU_MSQ_OPE_OPC_ECI extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public ArffTransferOSU_MSQ_OPE_OPC_ECI( ) throws IOException{	
	}
	public void run(final ArffTransferOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)
			throws IOException{
		System.out.println("runed" + value); 
		System.out.println(toptablein.getModel().getValueAt(0, 0));
		System.out.println("runed" + value);
		File file = new File(filepath);  
		file.createNewFile();
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"GBK"));  
		ArffLink link=new ArffLink();
		ArffNode node=new ArffNode();
		wr.write("@relation "+"'ARFF'"+"\n");  
		for(int i=0;i<toptablein.getModel().getColumnCount();i++){
			if(toptablein.getModel().getColumnName(i).contains("String")){
				wr.write("@attribute " + "'" + toptablein.getModel().getColumnName(i) + i + "'" + " {");
				for(int j=0; j<toptablein.getModel().getRowCount(); j++){
					Object obj = toptablein.getModel().getValueAt(j, i);
					if(obj != null) {
						if(!link.search(node, obj.toString())){
							link.addNode(node, obj.toString());
							wr.write("'"+obj.toString()+"'");
							wr.write(",");
						}
					} 
				}
				wr.write("}\n");
			}

			if(toptablein.getModel().getColumnName(i).contains("Number")){
				wr.write("@attribute "+"'"+toptablein.getModel().getColumnName(i)+i+"'"+" real");
				wr.write("\n");
			}
			
			if(toptablein.getModel().getColumnName(i).contains("Date")){
				wr.write("@attribute "+"'"+toptablein.getModel().getColumnName(i)+i+"'"+" string");
				wr.write("\n");
			}
		}
		wr.write("@data\n");    
		for(int i=0; i<toptablein.getModel().getRowCount(); i++){
			for(int j=0; j<toptablein.getModel().getColumnCount();j++){
				if(toptablein.getModel().getColumnName(j).contains("String")
						||toptablein.getModel().getColumnName(j).contains("Date")){
					Object obj = toptablein.getModel().getValueAt(i, j);
					if(obj != null) {
						wr.write("'"+obj.toString()+"'");
						wr.write(",");
					}
				}else{
					Object obj = toptablein.getModel().getValueAt(i, j);
					if(obj != null) {
						wr.write(obj.toString());
						wr.write(",");
					}	 
				}
			}
			wr.write("\n");
		}
		System.out.println("===完成省份：");    
		System.out.println("全部完成。。。。。。。。");  
		wr.flush();  
		wr.close(); 	  
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout=toptablein;
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.out=new JTable(content,spec); 	
	}
}
