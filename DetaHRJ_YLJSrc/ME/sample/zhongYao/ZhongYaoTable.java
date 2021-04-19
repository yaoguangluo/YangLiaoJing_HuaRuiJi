package ME.sample.zhongYao;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import ME.sample.App;
import ME.sample.DictionaryFromDB;
import ME.sample.PathLinkFile;
import ME.sample.TableSorterZYNK;
import MVQ.tableRender.ColorTableRender;

public class ZhongYaoTable implements MouseListener {
	private App app;
	@SuppressWarnings({"serial"})
	public javax.swing.JTable jTable(App app) throws IOException {
		this.app= app;
		DictionaryFromDB d= new DictionaryFromDB();
		//dictionary d= new dictionary();
		//dic_list= d.txtToList();
		try {
			app.dic_map= d.listToMap(app.dic_yw, app.dic_li, app.dic_hai, app.dic_xz, app.dic_ya, app.dic_jm
					, app.dic_xw, app.dic_cy, app.dic_jj, app.dic_zf, app.dic_cj, app.dic_yl);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//		dic_map= d.listToMap(dic_list);
		app.dic_index= d.mapToIndex(app.dic_map);
		//		dic_yw= d.mapToMap_yw(dic_map);
		//		dic_li= d.mapToMap_li(dic_map);
		//		dic_hai= d.mapToMap_hai(dic_map);
		//		dic_xz= d.mapToMap_xz(dic_map);
		//		dic_ya= d.mapToMap_ya(dic_map);
		//		dic_jm= d.mapToMap_jm(dic_map);
		//		dic_xw= d.mapToMap_xw(dic_map);
		//		dic_cy= d.mapToMap_cy(dic_map);
		//		dic_jj= d.mapToMap_jj(dic_map);
		//		dic_zf= d.mapToMap_zf(dic_map);
		//		dic_cj= d.mapToMap_cj(dic_map);
		//		dic_yl= d.mapToMap_yl(dic_map,dic_xw,dic_li,dic_xz,dic_jm);
		app.tableData_old= new Object[app.dic_map.size()][14];
		Object[][] tableData_old_for_model= new Object[app.dic_map.size()][14];
		Iterator<String> iter= app.dic_map.keySet().iterator();
		app.copy= new ArrayList<>();
		int cc=0;
		while (iter.hasNext()) {
			String temp= iter.next();
			app.copy.add(temp);
		}
		System.out.println(cc);
		for(int i = 0; i < app.copy.size(); i++) {
			app.tableData_old[i]= new Object[]{
					(app.dic_index.get(app.copy.get(i))==null?"":app.dic_index.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", "") ,
					//dic_index.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					""+0,app.copy.get(i).trim(),
					(app.dic_yw.get(app.copy.get(i))==null?"":app.dic_yw.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(app.dic_li.get(app.copy.get(i))==null?"":app.dic_li.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					//dic_yw.get(copy.get(i)).toString().replaceAll("\\s*", "") , 
					//dic_li.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					(app.dic_hai.get(app.copy.get(i))==null?"详情参考笔记原文列":app.dic_hai.get(app.copy.get(i))
							.toString().replaceAll("\\s*", "").equalsIgnoreCase("")
							?"详情参考笔记原文列":app.dic_hai.get(app.copy.get(i)).toString().replaceAll("\\s*", "")), 
					(app.dic_yl.get(app.copy.get(i))==null?"":app.dic_yl.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(app.dic_xw.get(app.copy.get(i))==null?"":app.dic_xw.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(app.dic_jm.get(app.copy.get(i))==null?"":app.dic_jm.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					//dic_xw.get(copy.get(i)).toString().replaceAll("\\s*", "") ,
					//dic_jm.get(copy.get(i)).toString().replaceAll("\\s*", "") ,
					(app.dic_xz.get(app.copy.get(i))==null?"":app.dic_xz.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""), 
					(app.dic_jj.get(app.copy.get(i))==null?"":app.dic_jj.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""), 
					(app.dic_cy.get(app.copy.get(i))==null?"":app.dic_cy.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(app.dic_ya.get(app.copy.get(i))==null?"":app.dic_ya.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""), 
					(app.dic_zf.get(app.copy.get(i))==null?"":app.dic_zf.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(app.dic_cj.get(app.copy.get(i))==null?"":app.dic_cj.get(app.copy.get(i))).toString()
					.replaceAll("\\s*", "")};
			tableData_old_for_model[i]=app.tableData_old[i].clone();
		}	
		app.table= new javax.swing.JTable();  
		app.newTableModel= new DefaultTableModel(tableData_old_for_model, app.columnTitle){  
			@Override  
			public boolean isCellEditable(int row,int column){  
				return false;  
			}
		};  
		//		TableSorterWithLYG4DQS4D sorter= new TableSorterWithLYG4DQS4D(newTableModel); //ADDE
		TableSorterZYNK sorter= new TableSorterZYNK(app.newTableModel); //ADD
		sorter.addTableName("zybc");
		sorter.setTableHeader(app.table.getTableHeader());
		app.table.setModel(sorter); 
		app.table.setRowHeight(35);                                        //设置高度
		JTableHeader header= app.table.getTableHeader();
		header.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
		app.table.addMouseListener(this);
		app.table.getColumnModel().getColumn(3).setPreferredWidth(80+30);
		app.table.getColumnModel().getColumn(4).setPreferredWidth(80+130);
		app.table.getColumnModel().getColumn(5).setPreferredWidth(80+130);
		app.table.getColumnModel().getColumn(6).setPreferredWidth(80+130);
		app.table.getColumnModel().getColumn(7).setPreferredWidth(80+130);
		app.table.getColumnModel().getColumn(8).setPreferredWidth(80+130);
		app.table.getColumnModel().getColumn(9).setPreferredWidth(80+130);
		app.table.getColumnModel().getColumn(10).setPreferredWidth(80+30);
		app.table.getColumnModel().getColumn(11).setPreferredWidth(80+30);
		app.table.getColumnModel().getColumn(12).setPreferredWidth(80+30);
		app.table.getColumnModel().getColumn(14).setPreferredWidth(300+60);
		app.table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		app.table.getTableHeader().setReorderingAllowed(false);
		app.table.validate();
		app.table.setVisible(true);
		ColorTableRender tcr= new ColorTableRender();  
		app.table.setDefaultRenderer(Object.class, tcr);	
		return app.table;
	}

	public void mouseClicked(MouseEvent arg0) {
		if(null==arg0) {
			app.row= 0;
			app.col= 3;
		}else {
			if(app.disableCursor) {
				return;
			}
			app.row= app.table.getSelectedRow();
			app.col= app.table.getSelectedColumn();
		}
		app.key= app.name.getText();
		if(app.key!= null && !app.key.replace(" ", "").equals("") && app.key.length()>20) {
			app.key= app.key.substring(0, 20);
		}
		if(app.key== null) {
			app.key= "";	
		}
		if(app.zynkxPage!= null) {
			this.app.zynkxPage.key= app.table.getValueAt(app.row, 2).toString();
			this.app.zynkxPage.keyReleased(null);
		}
		try {
			app.coAuthorForWord.bootClassificationMap(app.table.getValueAt(app.row, 2).toString(), false);
		}catch(Exception e) {
			this.app.validate();
		}
		try {
			String value = app.table.getValueAt(app.row, app.col).toString();
			app.data.setSize(500, 800);
			app.sets = app.analyzer.parserMixedString(value);//词性分析
			app.data.setContentType("text/html");
			String page="";
			Iterator<String> iterator = app.sets.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					if(app.pos.get(setOfi) == null) {
						page += ("<span style=\"background:#FEFEFE\"><font color=\"black\" size=\"5\">" 
								+ setOfi + "</font></span>");
						continue Here;
					}
					if (!setOfi.equals("")) {
						if(app.key.contains(setOfi)&&(app.pos.get(setOfi).contains("名")||app.pos.get(setOfi)
								.contains("动")||app.pos.get(setOfi).contains("形"))) {
							page+="<span style=\"background:red\"><font color=\"white\">"+setOfi
									+"</font></span>";
							continue Here;
						}
						if(app.pos.get(setOfi).contains("名")) {
							page+="<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor()
									.Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(app.pos.get(setOfi).contains("动")) {
							page+="<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor()
									.Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(app.pos.get(setOfi).contains("形")) {
							page+="<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor()
									.Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(app.pos.get(setOfi).contains("副")) {
							page+="<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi
									+"</font></span>";
							continue Here;
						} 
						page+="<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi
								+"</font></span>";				 
					}
				}
			app.data.setText(page);
			app.data.setSelectionStart(0);
			app.data.setSelectionEnd(0);
			app.data.validate();
		}catch(Exception e){	
			e.printStackTrace();
		}          
		//add graph
		try {
			app.panel_yt.removeAll();
			app.yaoCaiLabel.removeAll();
			String value_temp= app.table.getValueAt(app.row, 2).toString().replace("\\s+", "");
			app.pngy_2_1= new ImageIcon(this.app.getClass().getResource(PathLinkFile.yc+ "/"+ value_temp+ ".png"));
			app.yaoCaiLabel.setIcon(app.pngy_2_1);
			app.yaoCaiLabel.validate();
			app.panel_yt.add(app.yaoCaiLabel);
			app.panel_yt.validate();
			app.panel_yt.updateUI();
		}catch(Exception e) {
			JLabel temp= new JLabel("亲，没找到~");
			app.panel_yt.add(temp);
			app.panel_yt.validate();
			app.panel_yt.updateUI();
		}
		this.app.panel.removeAll();
		this.app.panel.setLayout(new GridLayout(1, 1));
		//add jingmai
		String value_jingmai= "";
		try {
			for(int i= 0; i< app.table.getColumnCount(); i++) {
				if(app.table.getValueAt(app.row, i)!= null) {
					String temp= app.table.getValueAt(app.row, i).toString();
					if(temp.length()< 30) {
						value_jingmai+= temp;
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			int c = 0;
			Box jingMaiBox= new Box(BoxLayout.Y_AXIS);
			if(!value_jingmai.equals("")) {
				if(value_jingmai.contains("手阳明")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("大肠")) {
					JLabel label1= new JLabel(this.app.shouyangmin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手少阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("三焦")) {
					JLabel label1= new JLabel(this.app.shoushaoyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手少阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("心")
						||value_jingmai.contains("苦")) {
					JLabel label1= new JLabel(this.app.shoushaoyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手太阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("小肠")) {
					JLabel label1= new JLabel(this.app.shoutaiyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手太阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肺")
						||value_jingmai.contains("辛")) {
					JLabel label1= new JLabel(this.app.shoutaiyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手厥阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("心包")) {
					JLabel label1= new JLabel(this.app.shoujueyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足阳明")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("胃")) {
					JLabel label1= new JLabel(this.app.zuyangmin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足少阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("胆")) {
					JLabel label1= new JLabel(this.app.zushaoyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足少阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肾")
						||value_jingmai.contains("咸")||value_jingmai.contains("寒")) {
					JLabel label1= new JLabel(this.app.zushaoyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足太阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("膀胱")) {
					JLabel label1= new JLabel(this.app.zutaiyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足太阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("脾")) {
					JLabel label1= new JLabel(this.app.zutaiyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足厥阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肝")
						||value_jingmai.contains("温")) {
					JLabel label1= new JLabel(this.app.zujueyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}
			}
			if(c==0){
				JLabel temp= new JLabel("亲，没找到~");
				//this.panel.add(temp);
				jingMaiBox.add(temp);
			}

			//box, button, 
			//panel add box
			this.app.panel.add(jingMaiBox);
			this.app.panel.updateUI();
		}catch(Exception e) {
			e.printStackTrace();
			this.app.panel.updateUI();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
	