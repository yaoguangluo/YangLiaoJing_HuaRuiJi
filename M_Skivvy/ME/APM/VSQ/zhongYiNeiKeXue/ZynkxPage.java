package ME.APM.VSQ.zhongYiNeiKeXue;
import java.awt.Color;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
import ESU.list.List_ESU;
import ESU.sort.Quick9DLYGWithString_ESU;
import ESU.string.String_ESU;
import ME.APM.VSQ.App;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.RestCall;
import PEU.P.table.TableSorterZYNK;
import MVQ.button.DetaButton;
import OCI.ME.analysis.C.A;
import OSI.AOP.neo.tts.ReadChinese;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import OSI.VSQ.SSI.ASU.OSU.PSU.MSU.ASU.MPE.AOP.MEC.SIQ.search.ZhongYaoSearch;
import OSV.VCQ.standard.DictionaryStandardDB;
public class ZynkxPage extends Container implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
	public String key;
	public JTextPane data ;
	public JTextPane statistic ;
	public DetaButton buttonPrev;
	public DetaButton buttonNext;
	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public int currentPage;
	public List<String> sets;
	public JTextField name;
	public javax.swing.JTable table;
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel = null;
	public List<String> copy;
	public List<String> dic_list;
	public Map<String, Object> dic_map ;
	public Map<String, Object> dic_chu_fang ;
	public Map<String, Object> dic_mz;
	public Map<String, Object> dic_zf;
	public Map<String, Object> dic_yy;
	public Map<String, Object> dic_fg;	
	public Map<String, Object> dic_ff;
	public Map<String, Object> dic_sy;
	public Map<String, Object> dic_tl;
	public Map<String, Object> dic_bzm;
	int row;
	int col; 
	public Object[] columnTitle = {"ID", "打分", "病症&药名", "用药参考", "正常成人标准处方", "脉症", "制法", "应用", "使用", "讨论", "附方", "方歌"};
	public A _A;  
	public Map<String, String> pos;
	public DetaButton buttonCTE;
	public DetaButton buttonFRS;
	public DetaButton buttonETC;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public JTextPane text ;
	private App u;
	private JTabbedPane jTabbedpane;
	private ReadChinese readChinese;
	private DetaButton buttonCTV;
	//private DetaButton buttonZYFJ;
	public ZynkxPage(JTextPane text,A _A, Map<String, String> pos, Map<String, String> pose
			, Map<String, String> etc, Map<String, String> cte, App u, JTabbedPane jTabbedpane) throws IOException{
		this.text = text;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this._A = _A;
		this.pos = pos;
		this.u= u;
		this.jTabbedpane= jTabbedpane;
		this.setLayout(null);
		this.setBounds(0, 0, 1490, 980);	
		JScrollPane jsp_name = new JScrollPane(this.name());
		jsp_name.setBounds(100, 15, 680, 50);
		JScrollPane jsp_data = new JScrollPane(this.data());
		JScrollPane jsp_statistic = new JScrollPane(this.statistic());

		jsp_statistic.setBounds(5, 290 + 100 - 80 + 200-260, 1440 - 650 - 645, 500-166+90-44);
		jsp_data.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260+26, 1440-800+650-130, 500-166+90-70);
		JLabel jlabel = new JLabel("信息搜索:");  
		jlabel.setBounds(5, 15, 100, 50);
		JScrollPane jsp = new JScrollPane(this.jTable());
		jsp.setBounds(5, 80-80, 1440-130, 200+100+200-260);

		this.add(jsp);  
		this.add(jsp_data); 
		this.add(jsp_statistic);  
	}

	public JTextPane data() throws IOException {
		data = new JTextPane();  
		data.setBounds(850, 150, 1440-600, 800-70);

		buttonSum = new DetaButton("共有 " + (sets==null?0:(1 + sets.size() / 2001))+ " 页");
		buttonSum.setBounds(0, 0, 100, 30);
		buttonCrt = new DetaButton("当前页面：" + (currentPage + 1));
		buttonCrt.setBounds(120, 0, 150, 30);

		buttonPrev= new DetaButton("<-向前翻页");
		buttonPrev.setBounds(290, 0, 100, 30);
		buttonPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage-=1;
					currentPage = (currentPage< 0 ? 0 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
					Iterator<String> iterator = setsForGet.iterator();
					Here:
						while(iterator.hasNext()) {
							String setOfi = iterator.next();
							if(pos.get(setOfi) == null) {
								page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形")) {
								if (map.containsKey(setOfi)) {
									WordFrequency wordFrequency= map.get(setOfi);
									wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
									map.put(setOfi, wordFrequency);
								} else {
									WordFrequency wordFrequency= new WordFrequency();
									wordFrequency.setFrequency(StableData.INT_ONE);
									wordFrequency.setWord(setOfi);
									map.put(setOfi, wordFrequency);
								}
							}
							if (!setOfi.equals("")) {
								if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
									page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
				    				continue Here;
				    			}
								if(pos.get(setOfi).contains("名")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("动")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("形")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("副")) {
									page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								} 
								page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");		 
							}
						}	
					buttonCrt.setText("当前页面：" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
					jTabbedpane.validate();
				}   
				try {
					statistic.setSize(500, 800);
					Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder page = new StringBuilder();
					Here:
						for (int i = fwa.size()-1; i >= 0; i--) {
							if (fwa.get(i) != null) {
								if(pos.get(fwa.get(i).getWord()) == null) {
									page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("名")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("动")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("形")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
					jTabbedpane.validate();
				}          
			}
		});
		buttonNext= new DetaButton("向后翻页->");
		buttonNext.setBounds(410, 0, 100, 30);
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage+=1;
					currentPage = (currentPage > (sets == null ? 0 : sets.size()) / 2001 ? currentPage - 1 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
					Iterator<String> iterator = setsForGet.iterator();
					Here:
						while(iterator.hasNext()) {
							String setOfi = iterator.next();
							if(pos.get(setOfi) == null) {
								page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形")) {
								if (map.containsKey(setOfi)) {
									WordFrequency wordFrequency = map.get(setOfi);
									wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
									map.put(setOfi, wordFrequency);
								} else {
									WordFrequency wordFrequency = new WordFrequency();
									wordFrequency.setFrequency(StableData.INT_ONE);
									wordFrequency.setWord(setOfi);
									map.put(setOfi, wordFrequency);
								}
							}
							if (!setOfi.equals("")) {
								if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
									page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
				    				continue Here;
				    			}
								if(pos.get(setOfi).contains("名")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("动")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("形")) {
									page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("副")) {
									page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								} 
								page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
							}
						}
					buttonCrt.setText("当前页面：" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
					jTabbedpane.validate();
				}   
				try {
					statistic.setSize(500, 800);
					Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder page = new StringBuilder();
					Here:
						for (int i = fwa.size()-1; i >= 0; i--) {
							if (fwa.get(i) != null) {
								if(pos.get(fwa.get(i).getWord()) == null) {
									page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("名")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("动")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("形")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
					jTabbedpane.validate();
				}  
			}
		});
		buttonCTE = new DetaButton("英文注释");
		buttonCTE.setBounds(630, 0, 100, 30);
		buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
				StringBuilder page = new StringBuilder().append("");
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
			    				continue Here;
			    			}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");			 
						}
					}	
				buttonCrt.setText("当前页面：" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonFRS = new DetaButton("中文还原");
		buttonFRS.setBounds(520, 0, 100, 30);
		buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
				StringBuilder page = new StringBuilder().append("");
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi +"</font></span>");
			    				continue Here;
			    			}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
						}
					}	
				buttonCrt.setText("当前页面：" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonETC = new DetaButton("同义描述");
		buttonETC.setBounds(740, 0, 100, 30);
		buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
				StringBuilder page = new StringBuilder().append("");
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
			    				continue Here;
			    			}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"  + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");			 
						}
					}	
				buttonCrt.setText("当前页面：" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		DetaButton buttonADD = new DetaButton("添加到编辑页");
		buttonADD.setBounds(868, 0, 115, 30);
		buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets==null) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page = new StringBuilder();
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					page.append(setOfi); 
				}
				if(!text.getText().isEmpty()) {
					text.setText(text.getText() +"\r\n\r\n"+ page.toString());
				}else {
					text.setText(page.toString());
				}
				text.validate();
			}
		});
		DetaButton buttonKSLJ= new DetaButton("中药DNN");
		buttonKSLJ.setBounds(990, 0, 115, 30);
		buttonKSLJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null== sets) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page = new StringBuilder().append("");
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				String setOfi= "";
				int times= 0;
				while(times++<1000&& iterator.hasNext()) {
					setOfi += iterator.next();
				}
				String response = "";
				String keyCache= setOfi.length()> 30? setOfi.substring(0, 30): setOfi.substring(0, setOfi.length()- 1);
				if(!u.CacheString.containsKey(keyCache)) {
					try {
						String string= String_ESU.charsetSwap(setOfi, "GBK", "GBK");
						String encode= String_ESU.stringToURIencode(string, "UTF8");
						response= RestCall.backEndRequest(encode);
						String[] strings= response.split("\"");
						response= strings.length> 3? strings[3]: "";
						response= String_ESU.uRIencodeToURIdecode(response, "UTF8");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					if(u.CacheStringPiple.size()< 301) {//buman
						u.CacheString.put(keyCache, response);
						u.CacheStringPiple.add(0, keyCache);
					}else {//man
						u.CacheString.put(keyCache, response);
						u.CacheStringPiple.add(0, keyCache);
						u.CacheString.remove(u.CacheStringPiple.get(300));
						u.CacheStringPiple.remove(300);
					}
				}else {
					response=u.CacheString.get(keyCache);
				}
				//dnn森林
				try {
					String[] dnn= response.replace("\r\n", "<br/>").split("<br/>");
					u.coAuthorForWord.bootDetaDnnFlowerForest(u, table.getValueAt(row, 2).toString(), dnn, true);
					//(this.u.table.getValueAt(row, 2).toString(), false);
				}catch(Exception e1) {
					validate();
				}
				
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
							continue Here;
						}
						if((pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
							if (map.containsKey(setOfi)) {
								WordFrequency wordFrequency = map.get(setOfi);
								wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
								map.put(setOfi, wordFrequency);
							} else {
								WordFrequency wordFrequency = new WordFrequency();
								wordFrequency.setFrequency(StableData.INT_ONE);
								wordFrequency.setWord(setOfi);
								map.put(setOfi, wordFrequency);
							}
						}
						if (!setOfi.equals("")) {
							if(response.contains(setOfi)&& setOfi.length()> 1) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 145, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							} 
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
						}
					}	
				buttonSum.setText("共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
				buttonCrt.setText("当前页面：" + (sets == null? 0 : 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();			
				//
				try {
					statistic.setSize(500, 800);
					//Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder stringBuilder = new StringBuilder();
					String[] fwa= response.replace("\r\n", "<br/>").split("<br/>");
					Here:
						for (int i = fwa.length-1; i > 0; i--) {
							if (fwa[i]!= null) {
								if(pos.get(fwa[i].split(":")[0]) == null) {
									stringBuilder.append("<div style=\"background:black\"><font color=\"white\">" +fwa[i] + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa[i].split(":")[0]).contains("名")) {
									stringBuilder.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa[i] +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa[i].split(":")[0]).contains("动")) {
									stringBuilder.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa[i] +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa[i].split(":")[0]).contains("形")) {
									stringBuilder.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa[i] +"</font></div>");
								}
							}
						}	
					statistic.setText(stringBuilder.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
				}          
			}
		});
		
		DetaButton buttonFJJJ= new DetaButton("方剂禁忌");
		buttonFJJJ.setBounds(1106, 0, 115, 30);
		buttonFJJJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int column= 4;
					if(table.getValueAt(row, column).toString().isEmpty()) {
						column= 3;
					}
					u.coAuthorForWord.bootZynkJFlowerForest(table.getValueAt(row, 2).toString()
							, table.getValueAt(row, column).toString(), true);
					//(this.u.table.getValueAt(row, 2).toString(), false);
				}catch(Exception e1) {
					validate();
				}
			}
		});
		
		readChinese= new ReadChinese(u, _A);
		buttonCTV= new DetaButton("语音阅读关");
		buttonCTV.setBounds(740, 0, 100, 30);
		buttonCTV.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
//				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
//						? (currentPage + 1)*2000: sets.size());
				if(!readChinese.isAlive()) {
					buttonCTV.setLabel("语音阅读开");
					readChinese= new ReadChinese(u, _A);
					readChinese.setPreReadList(sets);
					readChinese.start();
				}else {
					buttonCTV.setLabel("语音阅读关");
					readChinese.finish= 0;
					readChinese.setNullSap();
					readChinese.stop();
				}
			}
		});
		
//导出后进行注释掉,避免误操作, 以后我会用控制面板里进行tab打勾来开启关闭这个功能. 罗瑶光20210502		
//		//我本来想用URLencoder转代码，就不需要用@标识@了。以后改下。先用我大TIN god标识。
//				buttonZYFJ= new DetaButton("导出中医方剂");
//				buttonZYFJ.setBounds(740, 0, 100, 30);
//				buttonZYFJ.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						boolean mod= true;
//						Here:
//						for(int i= 0; i< table.getRowCount(); i++){
//							try {
//								Thread.sleep(150);
//							} catch (InterruptedException e2) {
//								// TODO Auto-generated catch block
//								e2.printStackTrace();
//							}
//							String plsql= "setRoot:C:/DetaDB1;";
//							plsql+= "baseName:ZYY;"; 
//							plsql+= "tableName:zyfj:insert;" +
//									"culumnValue:ID:"+ table.getValueAt(i, 0).toString().replace(":", "@Tin@")+ ";"+ 
//									"culumnValue:打分:"+ table.getValueAt(i, 1).toString().replace(":", "@Tin@")+ ";"+ 
//									"culumnValue:病症药名:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 2).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:用药参考:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 3).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:成人处方:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 4).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:脉症:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 5).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:制法:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 6).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:应用:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 7).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:使用:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 8).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:讨论:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 9).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:附方:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 10).toString().replace(":", "@Tin@"))+ ";"+ 
//									"culumnValue:方歌:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 11).toString().replace(":", "@Tin@"))+ ";";
//							try {
//								if(table.getValueAt(i, 2).toString().contains("推拿")) {
//									continue Here;
//								}
//								OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.E_PLSQLImp.E_PLSQL(plsql, mod);
//							}catch(Exception e1) {
//								e1.printStackTrace();
//							}
//						}}
//				});
		
		Box buttonBox= new Box(BoxLayout.X_AXIS);  
		buttonBox.add(buttonPrev);
		buttonBox.add(buttonNext);
		buttonBox.add(buttonSum);
		buttonBox.add(buttonCrt);
		buttonBox.add(buttonCTE);
		buttonBox.add(buttonFRS);
		buttonBox.add(buttonETC);
		buttonBox.add(buttonCTV);
		buttonBox.add(buttonADD);
		buttonBox.add(buttonKSLJ);
		buttonBox.add(buttonFJJJ);
		//buttonBox.add(buttonZYFJ);
		
		buttonBox.setBounds(5+ 800- 650, 290+ 100- 80+ 200- 260, 950+ 320, 20);
		this.add(buttonBox);
		return data;  
	}

	public JTextPane statistic() throws IOException {
		statistic = new JTextPane();  
		statistic.setBounds(850, 150, 1440-840, 800);
		return statistic;  
	}

	public JTextField name() throws IOException {
		name = new JTextField();  
		name.setBounds(180, 50, 380, 80);
		name.addKeyListener(this);
		return name;
	}	

	@SuppressWarnings({ "serial" })
	public javax.swing.JTable jTable() throws IOException {  
//		DictionaryDB d= new DictionaryDB();
//		Dictionary d= new Dictionary();
//		dic_list=d.txtToList();
//		DictionaryDB
//		dic_chu_fang = d.MapToChuFang(dic_list, dic_map);
//		dic_mz = d.MapTomz(dic_list, dic_map);
//		dic_zf = d.MapTozf(dic_list, dic_map);
//		dic_yy = d.MapToyy(dic_list, dic_map);
//		
//		dic_sy = d.MapTosy(dic_list, dic_map);
//		dic_tl = d.MapTotl(dic_list, dic_map);
//		dic_ff = d.MapToff(dic_list, dic_map);
//		dic_fg = d.MapTofg(dic_list, dic_map);
//   		"culumnName:uk:病症药名:string;"+ 
//   		"culumnName:uk:用药参考:string;"+ 
//   		"culumnName:uk:成人处方:string;"+ 
//   		"culumnName:uk:脉症:string;"+ 
//   		"culumnName:uk:制法:string;"+ 
//   		"culumnName:uk:应用:string;"+ 
//   		"culumnName:uk:使用:string;"+ 
//   		"culumnName:uk:讨论:string;"+ 
//   		"culumnName:uk:附方:string;"+ 
//   		"culumnName:uk:方歌:string;";
		
		//测试下刚写的标准读表函数.
		DictionaryStandardDB d= new DictionaryStandardDB();
		String primaryKey= "病症药名";
		String tabKey= "zyfj";
		//以后设计 uniq forenkey等.
		Map<String, Map<String, Object>> map= d.dbToMap(primaryKey, tabKey);
		dic_bzm=map.get("病症药名");
		dic_chu_fang=map.get("成人处方");
		dic_mz=map.get("脉症");
		dic_zf=map.get("制法");
		dic_yy=map.get("应用");
		dic_sy=map.get("使用");
		dic_tl=map.get("讨论");
		dic_ff=map.get("附方");
		dic_fg=map.get("方歌");
		dic_map=map.get("dic_map");
		
//		dic_bzm= new HashMap<String, Object>();
//		dic_chu_fang= new HashMap<String, Object>();
//		dic_mz= new HashMap<String, Object>();
//		dic_zf= new HashMap<String, Object>();
//		dic_yy= new HashMap<String, Object>();
//		dic_sy= new HashMap<String, Object>();
//		dic_tl= new HashMap<String, Object>();
//		dic_ff= new HashMap<String, Object>();
//		dic_fg= new HashMap<String, Object>();	
		//dic_map= d.txtToMap(dic_bzm, dic_chu_fang, dic_mz, dic_zf, dic_yy, dic_sy, dic_tl, dic_ff, dic_fg);
		
		tableData_old = new Object[dic_map.size()][12];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0; i<copy.size(); i++) {
			tableData_old[i] = new Object[]{""+(i+1),
					"" + 0, copy.get(i).trim().replace("^", " "),
					dic_map.get(copy.get(i)).toString().replaceAll("\\s*", "").replace("^", " "),
					dic_chu_fang.containsKey(copy.get(i))?dic_chu_fang.get(copy.get(i)).toString().replace("-", " "):"",
					dic_mz.containsKey(copy.get(i))?dic_mz.get(copy.get(i)).toString().replace("-", " "):"",
					dic_zf.containsKey(copy.get(i))?dic_zf.get(copy.get(i)).toString().replace("-", " "):"",
					dic_yy.containsKey(copy.get(i))?dic_yy.get(copy.get(i)).toString().replace("-", " "):"",
							dic_sy.containsKey(copy.get(i))?dic_sy.get(copy.get(i)).toString().replace("-", " "):"",	
								dic_tl.containsKey(copy.get(i))?dic_tl.get(copy.get(i)).toString().replace("-", " "):"",	
									dic_ff.containsKey(copy.get(i))?dic_ff.get(copy.get(i)).toString().replace("-", " "):"",	
										dic_fg.containsKey(copy.get(i))?dic_fg.get(copy.get(i)).toString().replace("-", " "):""	
			};
		}	
		table = new javax.swing.JTable();  
		newTableModel = new DefaultTableModel(tableData_old,columnTitle){  
			@Override
			public boolean isCellEditable(int row, int column){  
				return false;
			}  
		};  
		TableSorterZYNK sorter= new TableSorterZYNK(newTableModel); //ADDE
		sorter.setTableHeader(table.getTableHeader());
		table.setModel(sorter); 
		table.setRowHeight(35);                                        //设置高度
		JTableHeader header=table.getTableHeader();
		header.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
		table.getColumnModel().getColumn(0).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(1).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(2).setPreferredWidth(80+50);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+521);
		table.getColumnModel().getColumn(4).setPreferredWidth(80+100);
		table.getColumnModel().getColumn(5).setPreferredWidth(80+60);
		table.getColumnModel().getColumn(6).setPreferredWidth(80+60);
		table.getColumnModel().getColumn(7).setPreferredWidth(80+50);
		
		table.getColumnModel().getColumn(8).setPreferredWidth(80+50);
		table.getColumnModel().getColumn(9).setPreferredWidth(80+50);
		table.getColumnModel().getColumn(10).setPreferredWidth(80+50);
		table.getColumnModel().getColumn(11).setPreferredWidth(80+50);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(this);
		colorTableRender tcr = new colorTableRender();  
		table.setDefaultRenderer(Object.class, tcr);	
		return table;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(key== null) {
			key= "";
		}
		sets= null;
		Map<String, WordFrequency> map = new ConcurrentHashMap<>();
		try {
			row= table.getSelectedRow();
			col= table.getSelectedColumn();
			String value= (String) table.getValueAt(row, col);
			
			//3d 
			try {
				int column= 4;
				if(table.getValueAt(row, column).toString().isEmpty()) {
					column= 3;
				}
				String zhongYaoFang= table.getValueAt(row, column).toString();
				String searchYaos= this.u.coAuthorForWord.bootZynkFlowerForest(table.getValueAt(row, 2).toString()
						, zhongYaoFang, true);
				//(this.u.table.getValueAt(row, 2).toString(), false);
				new ZhongYaoSearch().zhongYaoSearch(this.u, searchYaos, "", searchYaos);
			}catch(Exception e) {
				this.validate();
			}
			
			data.setSize(500, 800);
			sets = _A.parserMixedString(value);//词性分析		
			data.setContentType("text/html");
			StringBuilder page = new StringBuilder().append("");
			currentPage= 0;
			List<String> setsForGet= sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
			Iterator<String> iterator= setsForGet.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi= iterator.next();
					if(pos.get(setOfi)== null) {
						page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形")) {
						if (map.containsKey(setOfi)) {
							WordFrequency wordFrequency= map.get(setOfi);
							wordFrequency.setFrequency(wordFrequency.getFrequency()+ StableData.INT_ONE);
							map.put(setOfi, wordFrequency);
						} else {
							WordFrequency wordFrequency= new WordFrequency();
							wordFrequency.setFrequency(StableData.INT_ONE);
							wordFrequency.setWord(setOfi);
							map.put(setOfi, wordFrequency);
						}
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
		    				continue Here;
		    			}
						if(pos.get(setOfi).contains("名")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("动")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("形")) {
							page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("副")) {
							page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");		 
					}
				}	
			buttonSum.setText("共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
			buttonCrt.setText("当前页面：" + (sets == null? 0 : 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
		}catch(Exception e){	
			data.validate();
			jTabbedpane.validate();
		}   
		try {
			statistic.setSize(500, 800);
			Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
			statistic.setContentType("text/html");
			StringBuilder page = new StringBuilder();
			Here:
				for (int i = fwa.size()-1; i >= 0; i--) {
					if (fwa.get(i) != null) {
						if(pos.get(fwa.get(i).getWord()) == null) {
							page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("名")) {
							page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("动")) {
							page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("形")) {
							page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
						}
					}
				}	
			statistic.setText(page.toString());
			statistic.setSelectionStart(0);
			statistic.setSelectionEnd(0);
			statistic.validate();
		}catch(Exception e){	
			statistic.validate();
			jTabbedpane.validate();
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

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@SuppressWarnings("unused")
	@Override
	public void keyReleased(KeyEvent arg0) {
		String[] score = new String[copy.size()];
		int[] score_code = new int[copy.size()];
		int[] reg = new int[copy.size()];
		int count=0;
		Map<String, WordFrequency> mapSearchWithoutSort = null;
		mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(key);
		Iterator<String> iteratorForCopy = copy.iterator();	
		int copyCount = 0;
		
		List<String> list= _A.parserMixedString(key);
		String[] string= List_ESU.listToArray(list);
		
		String[] stringReg= new String[key.length()/3];
		for(int i= 0; i< stringReg.length; i++) {
			stringReg[i]= key.substring(i*3, (i*3+ 3)<key.length()?(i*3+ 3):key.length()-1);
		}
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString = iteratorForCopy.next();
			score[copyCount] = iteratorForCopyString;
			String temps = dic_map.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					String mapSearchaAtII = iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
					if(temps.contains(mapSearchaAtII)) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						score[copyCount] = iteratorForCopyString;
						if(score[copyCount].contains(key.replace(" ", ""))) {
							reg[copyCount]+= 500;
						}
						if(key.contains(score[copyCount].replace(" ", ""))) {
							reg[copyCount]+= 500;
						}
						if(!pos.containsKey(mapSearchaAtII)) {
							reg[copyCount] += 1;
							score_code[copyCount] += 1 << mapSearchaAtII.length() << wordFrequencySearch.getFrequency() ;
							continue Here;
						}
						if(pos.get(mapSearchaAtII).contains("名")||pos.get(mapSearchaAtII).contains("动")
								||pos.get(mapSearchaAtII).contains("形")||pos.get(mapSearchaAtII).contains("谓")) {
							reg[copyCount] += 2;
						}
						reg[copyCount] += 1;
						score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1) 
								* (!pos.get(mapSearchaAtII).contains("名") ? pos.get(mapSearchaAtII).contains("动")? 45 : 1 : 50) 
								<< mapSearchaAtII.length() * wordFrequencySearch.getFrequency();
						continue Here;
					}
					if(mapSearchaAtII.length()>1) {
						for(int j=0;j<mapSearchaAtII.length();j++) {
							if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
								if(reg[copyCount] == 0){
									count += 1;
								}
								score[copyCount] = iteratorForCopyString;
								score_code[copyCount]+=1;
								if(pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
										pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
										)) {
									reg[copyCount] += 2;
								}
								reg[copyCount] += 1;
								continue Here;
							}
						}
					}
				}
			score_code[copyCount] = score_code[copyCount] * reg[copyCount];	
			//词距
			int code= 100;
			int tempb= 0;
			int tempa= score_code[copyCount];		
			if(key.length()> 4) {
				//全词
				for(int i= 0; i< string.length; i++) {
					if(temps.contains(string[i])) {
						tempb+= code;
					}
				}
				//断句
				for(int i= 0; i< stringReg.length; i++) {
					if(temps.contains(stringReg[i])) {
						tempb+= code;
					}
				}
				score_code[copyCount] = (int) (tempa/Math.pow(this.u.lookrot+ 1, 4) + tempb*Math.pow(this.u.lookrot, 2));
			}
			if(key.replace(" ", "").length()> 1&& key.replace(" ", "").length()< 5) {
				if(temps.contains(key.replace(" ", ""))) {
					tempb+= code<< 7;
				}
				score_code[copyCount] = (int) (tempa/Math.pow(this.u.lookrot+ 1, 4) + tempb*Math.pow(this.u.lookrot, 2));
			}
			copyCount++;
		}
		LABEL2:
			new Quick9DLYGWithString_ESU().sort(score_code, score);
		int max= score_code[0];
		//int max= score_code.length> 0? score_code[0]: 9999;//稍后处理 罗瑶光20210514
		Object[][] tableData = new Object[count][13];
		int new_count=0;
		newTableModel.getDataVector().clear();
		if(null == key || key.equals("")) {
			for(int i=0; i<tableData_old.length; i++) {
				newTableModel.insertRow(i, tableData_old[i]);
			}		
			newTableModel.fireTableDataChanged();	
			return;
		}
		Here:
			for(int i = copy.size()-1; i > -1; i--) {
				if(score_code[i] < 1){
					continue Here;
				}
				if(u.shuming_filter_box.isSelected()) {
					String wei= score[i];
					String temp= u.name_filter.getText();
					for(int j=0;j<temp.length();j++) {
						if(wei.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				tableData[new_count] = new Object[]{new_count+1,score_code[i],score[i].replace("^", " "),
						dic_map.get(score[i]).toString().replace("^", " "),
						dic_chu_fang.containsKey(score[i])?dic_chu_fang.get(score[i]).toString().replace("-", " "):"",
								dic_mz.containsKey(score[i])?dic_mz.get(score[i]).toString().replace("-", " "):"",
										dic_zf.containsKey(score[i])?dic_zf.get(score[i]).toString().replace("-", " "):"",
												dic_yy.containsKey(score[i])?dic_yy.get(score[i]).toString().replace("-", " "):"",	
														dic_sy.containsKey(score[i])?dic_sy.get(score[i]).toString().replace("-", " "):"",	
																dic_tl.containsKey(score[i])?dic_tl.get(score[i]).toString().replace("-", " "):"",	
																		dic_ff.containsKey(score[i])?dic_ff.get(score[i]).toString().replace("-", " "):"",	
																				dic_fg.containsKey(score[i])?dic_fg.get(score[i]).toString().replace("-", " "):""	
				};
				newTableModel.insertRow(new_count, tableData[new_count]);
				new_count+=1;
			}	
		newTableModel.fireTableDataChanged();	
	}

	public class colorTableRender extends DefaultTableCellRenderer { 
		private static final long serialVersionUID = 1L;
		public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (isSelected && hasFocus && row == table.getSelectedRow() && column == table.getSelectedColumn()) {
				//2.设置当前Cell的颜色
				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				c.setBackground(Color.CYAN);//设置背景色
				c.setForeground(Color.gray);//设置前景色
				return c;
			} else {
				//3.设置单数行，偶数行的颜色
				if (row % 3 == 0) {//偶数行时的颜色
					setBackground(new Color(253,233,254));
				}else if (row % 3 == 1) {//设置单数行的颜色
					setBackground(new Color(233,254,234));
				}else if (row % 3 == 2) {//设置单数行的颜色
					setBackground(new Color(255,251,232));
				}
				return super.getTableCellRendererComponent(table, value,
						isSelected, hasFocus, row, column);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}