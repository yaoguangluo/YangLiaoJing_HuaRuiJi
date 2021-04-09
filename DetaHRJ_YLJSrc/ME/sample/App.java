package ME.sample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import AVQ.OEQ.cap.Monitor;
import ME.sample.cecil.Cecil;
import ME.sample.editPane.EditPane;
import ME.sample.fckx.Fckx;
import ME.sample.fqz.Fqz;
import ME.sample.fyyd.Fyyd;
import ME.sample.jzkx.Jzkx;
import ME.sample.nk.Xynk;
import ME.sample.wkx.Wkx;
import ME.sample.wskx.Wskx;
import ME.sample.xysc.Xysc;
import ME.sample.zynkx.Zynkx;
import ME.sample.zyzdx.Zyzdx;
import OSI.OSU.MSQ.sets.stable.StableData;
import OSI.OSU.OEQ.MCQ.GUI.OSGI.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.catalytic.procedure.pde.FullDNATokenPDI;
import SP.SoundWaveJPanel;

import java.awt.Color;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

import org.ASQ.PSU.tinos.view.obj.Verbal;
import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;
import org.MSU.OCI.engine.base.translator.Translator;
import org.MSU.OEI.engine.base.translator.imp.TranslatorImp;
import org.OSU.tinos.string.StringSwap;
import org.tinos.dna.search.ZhongYaoSearch;
import org.tinos.neo.tts.ReadChinese;
import org.tinos.rest.medicine.RestMedicinePortImpl;

import biProcessor.CoAuthorForWord;
import comp.detaButton.DetaButton;
import comp.detaTabbedpane.DetabbedPane;
import comp.detaTextfield.CfxTextField;
import comp.detaTextpane.CfxTextPane;
import mapProcessor.VtoV;
@SuppressWarnings("deprecation")
public class App extends JApplet implements MouseListener, KeyListener, ActionListener, ChangeListener{	
	private static final long serialVersionUID= 1L;
	public List<String> CacheStringPiple= new CopyOnWriteArrayList<>();
	public Map<String, String> CacheString= new ConcurrentHashMap<>();
	public JFrame frameConfig;
	public int rangeHigh= 40;
	public int row= 0;
	public SoundWaveJPanel soundWaveJPanel;
	public int col= 0;
	public boolean disableCursor= true;
	public Translator ts;
	public JTextPane text;
	public JTextPane jText;
	protected JTextPane jxText;
	public String key;
	public JFrame frame;
	public JFrame frameHospital;
	public String hint;
	public AppSearch appSearch;
	public AppHospital appHospital;
	public AppConfig appConfig;
	public Analyzer analyzer;
	public CoAuthorForWord coAuthorForWord;
	public Monitor monitor;
	public JSlider look;
	public Map<String, String> pos;
	public Map<String, String> posec;
	public Map<String, String> pose;
	public Map<String, String> posFullec;
	public Map<String, String> posFullce;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Map<String, String> pinyin;
	public Map<String, String> ctk;
	public Map<String, String> ctj;
	public Map<String, String> ctt;
	public List<OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI> searchList= new ArrayList<>();; 
	public JCheckBox risk_filter_box;
	public JCheckBox feel_filter_box;
	public JCheckBox jingmai_filter_box;
	public JCheckBox gongxiao_filter_box;
	public JCheckBox zonghe_filter_box;
	public JCheckBox shuming_filter_box;
	public DetabbedPane jTabbedpane;
	public List<String> sets;
	public Xynk xynk;
	public Zynkx zynkx;
	public Zyzdx zyzdx;
	public Fyyd fyyd;
	public Fqz fqz;
	public Fckx fckx;
	public Jzkx jzkx;
	public Wkx wkx;
	public Wskx wskx;
	public Xysc xysc;
	public Cecil cecil;
	public EditPane editPane;
	public JLabel yaoCaiLabel;
	public JTextPane data;
	public JPanel panel_yt;
	public JTextField name;
	public JTextField nameHospital;
	public JTextField name_filter;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel= null;
	public List<String> dic_list;
	public List<String> copy;
	public Map<String, Object> dic_map= new HashMap<>();
	public Map<String, Object> dic_li= new HashMap<>();
	public Map<String, Object> dic_hai= new HashMap<>();
	public Map<String, Object> dic_xz= new HashMap<>();
	public Map<String, Object> dic_ya= new HashMap<>();
	public Map<String, Object> dic_jm= new HashMap<>();
	public Map<String, Object> dic_xw= new HashMap<>();
	public Map<String, Object> dic_cy= new HashMap<>();
	public Map<String, Object> dic_cj= new HashMap<>();
	public Map<String, Object> dic_jj= new HashMap<>();
	public Map<String, Object> dic_zf= new HashMap<>();
	public Map<String, Object> dic_yl= new HashMap<>();
	public Map<String, Object> dic_yw= new HashMap<>();
	public Map<String, Object> dic_index= new HashMap<>();
	public JPanel panel= new JPanel(); 
	public JButton buttonCTE;
	public JButton buttonFRS;
	public JButton buttonETC;
	public JButton buttonADD;
	public JButton buttonGXB;
	public JButton buttonBCJ;
	public JFrame frameTag;
	public TagSearch tagSearch;
	public ImageIcon logo= new ImageIcon(this.getClass().getResource(PathLinkFile.logo_png));  
	public ImageIcon pnga= new ImageIcon(this.getClass().getResource(PathLinkFile.sc_a_png)); 
	public ImageIcon pngo= new ImageIcon(this.getClass().getResource(PathLinkFile.sc_o_png)); 
	public ImageIcon pnge= new ImageIcon(this.getClass().getResource(PathLinkFile.sc_e_png)); 
	public ImageIcon pngi= new ImageIcon(this.getClass().getResource(PathLinkFile.sc_i_png)); 
	public ImageIcon pngu= new ImageIcon(this.getClass().getResource(PathLinkFile.sc_u_png)); 
	public ImageIcon shoujueyin= new ImageIcon(this.getClass().getResource(PathLinkFile.手厥阴心包经_png)); 
	public ImageIcon shoushaoyang= new ImageIcon(this.getClass().getResource(PathLinkFile.手少阳三焦经_png));  
	public ImageIcon shoushaoyin= new ImageIcon(this.getClass().getResource(PathLinkFile.手少阴心经_png));  
	public ImageIcon shoutaiyang= new ImageIcon(this.getClass().getResource(PathLinkFile.手太阳小肠经_png));  
	public ImageIcon shoutaiyin= new ImageIcon(this.getClass().getResource(PathLinkFile.手太阴肺经_png));  
	public ImageIcon shouyangmin= new ImageIcon(this.getClass().getResource(PathLinkFile.手阳明大肠经_png));  
	public ImageIcon zujueyin= new ImageIcon(this.getClass().getResource(PathLinkFile.足厥阴肝经_png));  
	public ImageIcon zushaoyang= new ImageIcon(this.getClass().getResource(PathLinkFile.足少阳胆经_png));
	public ImageIcon zushaoyin= new ImageIcon(this.getClass().getResource(PathLinkFile.足少阴肾经_png));  
	public ImageIcon zutaiyang= new ImageIcon(this.getClass().getResource(PathLinkFile.足太阳膀胱经_png));  
	public ImageIcon zutaiyin= new ImageIcon(this.getClass().getResource(PathLinkFile.足太阴脾经_png));  
	public ImageIcon zuyangmin= new ImageIcon(this.getClass().getResource(PathLinkFile.足阳明胃经_png));  
	public ImageIcon png88 = new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_png));  
	public ImageIcon wsp = new ImageIcon(this.getClass().getResource(PathLinkFile.wsp_png));  
	public ImageIcon wwp = new ImageIcon(this.getClass().getResource(PathLinkFile.wwp_png));  
	public ImageIcon wxp = new ImageIcon(this.getClass().getResource(PathLinkFile.wxp_png));
	public ImageIcon shun = new ImageIcon(this.getClass().getResource(PathLinkFile.shun_png));  
	public ImageIcon bagua_bgbz= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_bgbz_png));  
	public ImageIcon bagua_ljbz= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_ljbz_png));  
	public ImageIcon bagua_sjbz= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_sjbz_png));
	public ImageIcon bagua_qxbz= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_qxbz_png));  
	public ImageIcon bagua_gzxs= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_gzxs_png));  
	public ImageIcon bagua_skch= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_skch_png));  
	public ImageIcon bagua_MHYS= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_MHYS_png));  
	public ImageIcon bagua_YHZP= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_YHZP_png));  
	public ImageIcon bagua_QNZS= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_QNZS_png)); 
	public ImageIcon bagua_YDLR= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_YDLR_png)); 
	public ImageIcon bagua_HLLS= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_HLLS_png)); 
	public ImageIcon bagua_ZSBZ= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_ZSBZ_png));
	public ImageIcon bagua_KYCQ= new ImageIcon(this.getClass().getResource(PathLinkFile.bagua_KYCQ_png));
	public ImageIcon qp4= new ImageIcon(this.getClass().getResource(PathLinkFile._4qp_png));  
	public ImageIcon pngy_2_1= new ImageIcon(this.getClass().getResource(PathLinkFile.yc_2_1_png));  
	public Object[] columnTitle= {"ID", "打分", "中药名称", "笔记原文", "功效", "风险规避", "用法"
			, "性味", "脉络", "中医馆药理", "经解", "崇源", "愚按", "搭配", "常见药"};
	public CfxTextField name_filter_not_have;
	public Map<String, String> ctr;
	public CfxTextField nameFeelFilter;
	public JScrollPane jsp_name= null;
	public boolean ready= false;
	public App appInstance;
	private ReadChinese readChinese;
	private DetaButton buttonCTV;
	public int lookrot;
	public List<String> tabNames;
	public BufferedImage tempBufferedImage;
	public int 催化比值rot;
	public boolean DNASearchIsClick;
    public AppInit appInit;
	public void init(){
		appInit= new AppInit();
		appInit.init(this);
	}
//
	public JTextField nameFeelFilter() {
		nameFeelFilter= new CfxTextField(null, 0, 0, null);  
		nameFeelFilter.setBounds(180-50, 50, 380, 80);
		nameFeelFilter.setBackground(Color.white);
		nameFeelFilter.setText(" ");
		nameFeelFilter.addKeyListener(this);
		return nameFeelFilter;
	}

	public JPanel panel() throws IOException{
		panel_yt= new JPanel();
		panel_yt.setBackground(Color.white);
		pngy_2_1= new ImageIcon(this.getClass().getResource(PathLinkFile.yc_2_1_png));
		yaoCaiLabel= new JLabel(pngy_2_1);
		panel_yt.add(yaoCaiLabel);
		return panel_yt;
	}

	public JTextPane data() throws IOException {
		data= new CfxTextPane("内容", 1350, 2980, null);  
		data.setBounds(850, 150, 1350, 2980);	
		data.setBackground(Color.white);
		Box buttonBoxLineTwo= new Box(BoxLayout.X_AXIS);  
		//		buttonBoxLineTwo.add(buttonGXB);
		//		buttonBoxLineTwo.add(buttonBCJ);
		buttonBoxLineTwo.setBounds(0, 22, 450, 20);
		//container.add(buttonBox);
		//container.add(buttonBoxLineTwo);
		return data; 
	}

	public Box getBox() {	
		buttonADD= new DetaButton("添加到编辑页", 100, 50, Color.red);
		buttonADD.setBounds(295-15, 0, 135, 30);
		buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet= sets;
				Iterator<String> iterator= setsForGet.iterator();
				while(iterator.hasNext()) {
					String setOfi= iterator.next();
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
		buttonCTE= new DetaButton("英文注释", 100, 50, Color.orange);
		buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet = sets;
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
								page.append("<span style=\"background:red\"><font color=\"white\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(255, 245, 255)+ "\"><font color=\"black\" size=\"5\">"+ "<A href=\"http://localhost:8000/search?word="+ setOfi+"\">"
										+ setOfi+ "</A>" + (posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"")+ "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");			 
						}}
				data.setText(page.toString());
				data.addHyperlinkListener(new HyperlinkListener(){
					@SuppressWarnings({ "hiding" })
					@Override
					public void hyperlinkUpdate(HyperlinkEvent e) {
						//.........
						//本函数的hyperlinkUpdate 格式 查阅了https://blog.csdn.net/nullpointer2008/article/details/7998986 文章。
						//20200323 罗瑶光修改
						//版权声明：本文为CSDN博主「空指针1996」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
						//原文链接：https://blog.csdn.net/nullpointer2008/article/details/7998986);
						//.........
						if (e.getEventType()!= HyperlinkEvent.EventType.ACTIVATED) 
							return;
						URL linkUrl= e.getURL();
						String string; 
						System.out.println(linkUrl.getFile());
						try {
							string= StringSwap.charsetSwap(linkUrl.getFile().toString(), "GBK", "GBK");
							String[] value= string.split("=");
							if(value.length> 1) {
								VtoV.ObjectToJsonString(RestMedicinePortImpl.doSearch(appInstance, value[1]));
							}
						} catch (UnsupportedEncodingException e2) {
							e2.printStackTrace();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						//弹窗
						//1 得到文字
						//2 文字标注解释字符串
						//3 生成frame
						if(null== frameTag) {
							tagSearch= new TagSearch();
							tagSearch.init(name);
							tagSearch.setBounds(0, 0, 435, 355);
							tagSearch.setVisible(true);
							tagSearch.show();
							frameTag= new JFrame("提示栏");
							//frame.setLayout(null);
							frameTag.setSize(430, 350);
							//摘自第37行 https://blog.csdn.net/code_better/article/details/53505962
							Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
							//
							frameTag.setLocation(point.x, point.y);
							frameTag.setResizable(false);
							frameTag.add(tagSearch);
							frameTag.setVisible(true);
							frameTag.show();
							frameTag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
						}else {
							Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
							frameTag.setLocation(point.x, point.y);
							frameTag.setVisible(true);
							frameTag.show();
						}
					}
				});
				data.setEditable(false);
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});

		buttonFRS= new DetaButton("中文词还原", 100, 50, Color.green);
		buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet= sets;
				Iterator<String> iterator= setsForGet.iterator();
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
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});

		buttonETC= new DetaButton("同义词描述", 100, 50, Color.pink);
		//buttonETC.setBounds(200-15, 0, 88, 30);
		buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet = sets;
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") +  "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});

		buttonGXB= new JButton("更新到表格");
		buttonETC.setBounds(200 - 15, 0, 88, 30);
		buttonGXB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				String temp = null;
				try {
					temp = data.getDocument().getText(0, data.getDocument().getLength());
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setValueAt(temp, row, col);
				System.out.println(temp);
			}
		});

		buttonBCJ= new JButton("导出新篇本草全集");
		//buttonETC.setBounds(200 - 15, 0, 88, 30);
		buttonBCJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				FileWriter fw = null;
				//				try {
				//					fw= new FileWriter("C:/Users/Administrator/Desktop/养疗金项目/bcqj.txt", true);
				//					for(int i=0;i<table.getRowCount();i++){
				//						fw.write("摘要");
				//						for(int j=0;j<table.getColumnCount();j++){
				//							fw.write("\r\n");
				//							fw.write("["+table.getColumnName(j)+"]");
				//							if(table.getValueAt(i, j)!=null) {
				//								if(j==3) {
				//									fw.write(table.getValueAt(i, j).toString().replaceAll("\\[()\\]", ""));
				//								}else {
				//									fw.write(table.getValueAt(i, j).toString());
				//								}
				//							}
				//							fw.write("\r\n");
				//						}
				//					}
				//					fw.write("\r\n");
				//					fw.write("摘要");
				//					fw.close();
				//				} catch (IOException e1) {
				//					// TODO Auto-generated catch block
				//					e1.printStackTrace();
				//				}	
				//一行一行的插入
				boolean mod= true;
				for(int i= 0; i< table.getRowCount(); i++){
					//元基编码加密：
					String plsql= "setRoot:C:/DetaDB1;";
					plsql+= "baseName:ZYY;"; 
					plsql+= "tableName:zybc:insert;" +
							"culumnValue:ID:"+ table.getValueAt(i, 0).toString().replace(":", "@biky@")+ ";" + 
							"culumnValue:打分:"+ table.getValueAt(i, 1).toString().replace(":", "@biky@")+ ";" + 
							"culumnValue:中药名称:"+ table.getValueAt(i, 2).toString().replace(":", "@biky@")+ ";" + 
							"culumnValue:笔记原文:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 3).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:功效:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 4).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:风险规避:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 5).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:用量:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 6).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:性味:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 7).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:经脉:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 8).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:中医馆药理:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 9).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:经解:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 10).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:崇源:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 11).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:愚按:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 12).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:搭配:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 13).toString().replace(":", "@biky@"))+ ";" +  
							"culumnValue:常见药:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 14).toString().replace(":", "@biky@"))+ ";";
					try {
						org.ME.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, mod);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		readChinese= new ReadChinese();
		buttonCTV= new DetaButton("语音阅读关");
		buttonCTV.setBounds(740, 0, 100, 30);
		buttonCTV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				//				if(appConfig.SectionJPanel.jlabel_end_boxs.isSelected()) {
				//					return;
				//				}
				//				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
				//						? (currentPage + 1)*2000: sets.size());
				if(!readChinese.isAlive()) {
					buttonCTV.setLabel("语音阅读开");
					readChinese= new ReadChinese();
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


		Box buttonBox= new Box(BoxLayout.X_AXIS);
		buttonBox.add(buttonCTE);
		buttonBox.add(buttonFRS);
		buttonBox.add(buttonCTV);
		//buttonBox.add(buttonETC);
		//buttonBox.add(buttonBCJ);
		buttonBox.add(buttonADD);
		buttonBox.setBounds(0, 0, 445, 20);

		//Box buttonBoxLineTwo= new Box(BoxLayout.X_AXIS);  
		//buttonBoxLineTwo.add(buttonGXB);
		//buttonBoxLineTwo.add(buttonBCJ);
		//buttonBoxLineTwo.setBounds(0, 22, 450, 20);
		//container.add(buttonBoxLineTwo);
		return buttonBox;
	} 

	public JTextField name() throws IOException {
		name= new CfxTextField(null, 0, 0, null);  
		name.setBounds(180- 50, 50, 380, 80);
		name.setBackground(Color.white);
		name.setText(" ");
		name.addKeyListener(this);
		return name;
	}	

	public JTextField nameHospital() throws IOException {
		nameHospital= new CfxTextField(null, 0, 0, null);  
		nameHospital.setBounds(180-50, 50, 380, 80);
		nameHospital.setBackground(Color.white);
		nameHospital.setText(" ");
		nameHospital.addKeyListener(this);
		return nameHospital;
	}	

	public JTextField name_filter() throws IOException {
		name_filter= new CfxTextField(null, 0, 0, null);  
		name_filter.setBounds(180-50, 50, 380, 80);
		name_filter.setBackground(Color.white);
		name_filter.setText(" ");
		name_filter.addKeyListener(this);
		return name_filter;
	}	

	public JTextField name_filter_not_have() throws IOException {
		name_filter_not_have= new CfxTextField(null, 0, 0, null);  
		name_filter_not_have.setBounds(180-50, 50, 380, 80);
		name_filter_not_have.setBackground(Color.white);
		name_filter_not_have.setText(" ");
		name_filter_not_have.addKeyListener(this);
		return name_filter_not_have;
	}	

	@Override
	public void mouseClicked(MouseEvent arg0) {
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

	//搜索
	@Override
	public void keyReleased(KeyEvent arg0) {
		String zhongyao= "";
		key= name.getText();
		String forE= key.toLowerCase().toString();
		if(key!= null && !key.replace(" ", "").equals("") && key.length()>50) {
			key= key.substring(0, 30);
		}
		if(forE!= null&& !forE.replace(" ", "").equals("") && forE.length()>110) {
			forE= forE.substring(0, 110);
		}
		key = key.length()== 0? "": ts.MixedStringToChineseString(analyzer, key);
		if(key.replaceAll("\\s+", " ").equalsIgnoreCase(" ")){
			key="";
		}
		zhongyao= key.toString();
		Here:
			for(int i= 0; i< key.length(); i++) {
				if(StableData.feng.contains(""+ key.charAt(i))) {
					key+= "风";
					continue Here;
				}
				if(StableData.han.contains(""+ key.charAt(i))) {
					key+= "风寒";
					continue Here;
				}
				if(StableData.hot.contains(""+ key.charAt(i))) {
					key+= "风热";
					continue Here;
				}
				if(StableData.shi.contains(""+ key.charAt(i))) {
					key+= "风湿";
					continue Here;
				}
				if(StableData.huo.contains(""+ key.charAt(i))) {
					key+= "火";
					continue Here;
				}
				if(StableData.zao.contains(""+ key.charAt(i))) {
					key+= "燥";
					continue Here;
				}
				if(StableData.liuYin.contains(""+ key.charAt(i))) {
					key+= "六淫";
					continue Here;
				}
				if(StableData.qiQing.contains(""+ key.charAt(i))) {
					key+= "七情";
					continue Here;
				}
				if(StableData.wangYang.contains(""+ key.charAt(i))) {
					key+= "亡阳";
					continue Here;
				}
				if(StableData.wangYin.contains(""+ key.charAt(i))) {
					key+= "亡阴";
					continue Here;
				}
				if(StableData.jiBaoShiChang.contains(""+ key.charAt(i))) {
					key+= "饥饱失常";
					continue Here;
				}
				if(StableData.yinShiBuJie.contains(""+ key.charAt(i))) {
					key+= "饮食不洁";
					continue Here;
				}
				if(StableData.tiaoShiPianShe.contains(""+ key.charAt(i))) {
					key+= "挑食偏食";
					continue Here;
				}
				if(StableData.biaoHan.contains(""+ key.charAt(i))) {
					key+= "表寒";
					continue Here;
				}
				if(StableData.biaoRe.contains(""+ key.charAt(i))) {
					key+= "表热";
					continue Here;
				}
				if(StableData.yuXue.contains(""+ key.charAt(i))) {
					key+= "淤";
				}
			}
		if(xynk!= null) {
			this.xynk.key= zhongyao.toString();
			this.xynk.keyReleased(null);
		}
		if(zynkx!= null) {
			this.zynkx.key= zhongyao.toString();
			this.zynkx.keyReleased(null);
		}
		if(zyzdx!= null) {
			this.zyzdx.key= zhongyao.toString();
			this.zyzdx.keyReleased(null);
		}
		if(fyyd!= null) {
			this.fyyd.key= zhongyao.toString();
			this.fyyd.keyReleased(null);
		}
		if(fqz!= null) {
			this.fqz.key= zhongyao.toString();
			this.fqz.keyReleased(null);
		}
		if(fckx!= null) {
			this.fckx.key= zhongyao.toString();
			this.fckx.keyReleased(null);
		}
		if(jzkx!= null) {
			this.jzkx.key= zhongyao.toString();
			this.jzkx.keyReleased(null);
		}
		if(wkx!= null) {
			this.wkx.key= zhongyao.toString();
			this.wkx.keyReleased(null);
		}
		if(wskx!= null) {
			this.wskx.key= zhongyao.toString();
			this.wskx.keyReleased(null);
		}
		if(xysc!= null) {
			this.xysc.key= zhongyao.toString();
			this.xysc.keyReleased(null);
		}
		if(editPane!= null) {
			this.editPane.key= zhongyao.toString();
			this.editPane.keyReleased(null);
		}
		for(int i= 0; i< this.searchList.size(); i++) {
			try {
				searchList.get(i).AOP_VEC_SQ(null, zhongyao.toString());
			} catch (IOException e) {
				System.out.println("error");
			}
		}

		Translator ts= new TranslatorImp();
		try {
			ts.init(analyzer);
		} catch (IOException e) {
		} 
		List<Verbal> verbals= ts.index(analyzer, forE);
		if(cecil!= null) {
			this.cecil.verbals= verbals;
			this.cecil.keyReleased(null);
		}
		new ZhongYaoSearch().zhongYaoSearch(this, zhongyao, forE, key);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//if(arg0.getID())
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(zonghe_filter_box.isSelected()) {
			for(int i = 0; i < newTableModel.getRowCount(); i++){
				for(int j = 0; j < newTableModel.getRowCount(); j++){
					if(i!= j) {
						if(newTableModel.getValueAt(i, 5).toString()
								.contains(newTableModel.getValueAt(j, 2).toString())) {
							newTableModel.removeRow(j);
							j-= 1;
						}
					}
				}
			}
			newTableModel.fireTableDataChanged();
		}else {
			this.keyReleased(null);;
		}
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		if(null!= soundWaveJPanel) {
			soundWaveJPanel.reg= 0;
			if(null!= soundWaveJPanel.waveJpanel) {
				soundWaveJPanel.waveJpanel.reg= 0;	
			}
			this.validate();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				this.validate();
			}
		}
	}
}