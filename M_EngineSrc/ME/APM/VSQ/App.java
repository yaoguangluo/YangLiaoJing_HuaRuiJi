package ME.APM.VSQ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import AVQ.OEQ.cap.Monitor;
import IMO.EVU.biProcessor.CoAuthorForWord;
import IMS.EUQ.SP.SoundWaveJPanel;
import ME.APM.VSQ.Harrison.CecilPage;
import ME.APM.VSQ.editPane.EditPane;
import ME.APM.VSQ.fuchankexue.FckxPage;
import ME.APM.VSQ.guJiJingDian.FyydPage;
import ME.APM.VSQ.jiZhenKeXue.JzkxPage;
import ME.APM.VSQ.waiShangKeXue.WskxPage;
import ME.APM.VSQ.xiYiNeiKe.XynkPage;
import ME.APM.VSQ.xiYiWaiKe.WkxPage;
import ME.APM.VSQ.xiYiYaoCai.XyscPage;
import ME.APM.VSQ.zhongYiFuChan.FqzPage;
import ME.APM.VSQ.zhongYiNeiKeXue.ZynkxPage;
import ME.APM.VSQ.zhongYiZhenDuanXue.ZyzdxPage;
import ME.S.stables.StableDataSrc;
import MVQ.button.DetaButton;
import MVQ.tabbedpane.DetabbedPane;
import MVQ.textfield.CfxTextField;
import MVQ.textpane.CfxTextPane;
import OSI.AOP.neo.tts.ReadChinese;
import OSI.AOP.rest.medicine.RestMedicinePortImpl;
import OSI.ESU.string.StringSwap;
import OSI.MSU.OCI.ME.SMS.translator.C.Translator;
import OSI.MSU.OEI.ME.SMS.SEU.OSD.OSI.E.TranslatorImp;
import OSI.OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import OSI.OPE.ASQ.PSU.OCI.ME.analysis.C.Analyzer;
import OSI.OPE.MSQ.SS.stable.StableData;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import OSI.VSQ.SSI.ASU.OSU.PSU.MSU.ASU.MPE.AOP.MEC.SIQ.search.ZhongYaoSearch;
import PEU.P.map.*;

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
@SuppressWarnings("deprecation")
public class App extends JApplet implements MouseListener, KeyListener, ActionListener, ChangeListener{	
	private static final long serialVersionUID= 1L;
	public String databaseRootPath;
	public List<String> CacheStringPiple= new CopyOnWriteArrayList<>();
	public Map<String, String> CacheString= new ConcurrentHashMap<>();
	public JFrame frameConfig;
	public int rangeHigh= 40;
	public int row= 0;
	public SoundWaveJPanel soundWaveJPanel;
	public int col= 0;
	public boolean disableCursor= true;
	public Translator translator;
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
	public XynkPage xynkPage;
	public ZynkxPage zynkxPage;
	public ZyzdxPage zyzdxPage;
	public FyydPage fyydPage;
	public FqzPage fqzPage;
	public FckxPage fckxPage;
	public JzkxPage jzkxPage;
	public WkxPage wkxPage;
	public WskxPage wskxPage;
	public XyscPage xyscPage;
	public CecilPage cecil;
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
	public Object[] columnTitle= {StableDataSrc.columnTitle_0, StableDataSrc.columnTitle_1, StableDataSrc.columnTitle_2
			, StableDataSrc.columnTitle_3, StableDataSrc.columnTitle_4, StableDataSrc.columnTitle_5, StableDataSrc.columnTitle_6
			, StableDataSrc.columnTitle_7, StableDataSrc.columnTitle_8, StableDataSrc.columnTitle_9, StableDataSrc.columnTitle_10
			, StableDataSrc.columnTitle_11, StableDataSrc.columnTitle_12, StableDataSrc.columnTitle_13, StableDataSrc.columnTitle_14};
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
	public String dbConfigPath;
	public boolean bootDBInTXTWay= false;
	public boolean bootDBInBaseWay= false;
	public boolean bootDBInWebWay= false;
	public void init(){
		try {
			appInit= new AppInit();
			appInit.init(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//
	public JTextField nameFeelFilter() {
		nameFeelFilter= new CfxTextField(null, 0, 0, null);  
		nameFeelFilter.setBounds(180-50, 50, 380, 80);
		nameFeelFilter.setBackground(Color.white);
		nameFeelFilter.setText(StableDataSrc.STRING_SPACE);
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
		data= new CfxTextPane(StableDataSrc.NEI_RONG, 1350, 2980, null);  
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
		buttonADD= new DetaButton(StableDataSrc.TIAN_JIA_DAO_BIAN_JI_YE, 100, 50, Color.red);
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
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi 
									+(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":StableDataSrc.STRING_EMPTY) + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals(StableDataSrc.STRING_EMPTY)) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains(StableDataSrc.ZI_MING)||pos.get(setOfi)
									.contains(StableDataSrc.ZI_DONG)||pos.get(setOfi).contains(StableDataSrc.ZI_XING))) {
								page.append("<span style=\"background:red\"><font color=\"white\" size=\"5\">" + setOfi 
										+(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":StableDataSrc.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_MING)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)
										+ "\"><font color=\"black\" size=\"5\">"+ "<A href=\"http://localhost:8000/search?word="+ setOfi+"\">"
										+ setOfi+ "</A>" + (posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)
										+")":StableDataSrc.STRING_EMPTY)+ "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_DONG)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("
												+posFullce.get(setOfi)+")":StableDataSrc.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_XING)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("
												+posFullce.get(setOfi)+")":StableDataSrc.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_FU)) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi 
										+(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":StableDataSrc.STRING_EMPTY) 
										+ "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi 
									+(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":StableDataSrc.STRING_EMPTY) + "</font></span>");			 
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
						if (!setOfi.equals(StableDataSrc.STRING_EMPTY)) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains(StableDataSrc.ZI_MING)||pos.get(setOfi)
									.contains(StableDataSrc.ZI_DONG)||pos.get(setOfi).contains(StableDataSrc.ZI_XING))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi +"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_MING)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)
										+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_DONG)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)
										+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_XING)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_FU)) {
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
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi
									+(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))
									+")" : StableDataSrc.STRING_EMPTY) : StableDataSrc.STRING_EMPTY) + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals(StableDataSrc.STRING_EMPTY)) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains(StableDataSrc.ZI_MING)
									||pos.get(setOfi).contains(StableDataSrc.ZI_DONG)||pos.get(setOfi).contains(StableDataSrc.ZI_XING))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+ setOfi 
										+(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))
										+")" : StableDataSrc.STRING_EMPTY) : StableDataSrc.STRING_EMPTY) +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_MING)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 245, 255)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)
												?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" 
														: StableDataSrc.STRING_EMPTY) : StableDataSrc.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_DONG)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(245, 255, 245)
										+"\"><font color=\"black\" size=\"5\">"+ setOfi +(cte.containsKey(setOfi)
												?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" 
														: StableDataSrc.STRING_EMPTY) : StableDataSrc.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_XING)) {
								page.append("<span style=\"background:"+new PEU.P.image.ColorProcessor().Processor(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)
												?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" 
														: StableDataSrc.STRING_EMPTY) : StableDataSrc.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains(StableDataSrc.ZI_FU)) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" 
										+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" 
												: StableDataSrc.STRING_EMPTY) : StableDataSrc.STRING_EMPTY) +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+ setOfi 
									+(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")"
											: StableDataSrc.STRING_EMPTY) : StableDataSrc.STRING_EMPTY) +  "</font></span>");			 
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
				//									fw.write(table.getValueAt(i, j).toString().replaceAll("\\[()\\]", StableDataSrc.STRING_EMPTY));
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
					//元基编码加密： 我注释下,这里的biky是梁壁荧的网名.去年准备追她,大丈夫追女人肯定不是砸钱刷人气来追吧
					//于是我就自学琴棋书画, 代码我就写点求婚礼物, 我一直很努力
					//,每次都是提高自己来吸引她的注意..从没有和别的女人乱搞,一下就10个月,就换来10个微笑...后来,人家还是觉得我配不上,那就算了.
					//又多一个妹妹.无所谓.哈哈
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
						OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.E.ExecPLSQLImp.ExecPLSQL(plsql, mod);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		readChinese= new ReadChinese(appInstance, analyzer);
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
					readChinese= new ReadChinese(appInstance, analyzer);
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
		name.setText(StableDataSrc.STRING_SPACE);
		name.addKeyListener(this);
		return name;
	}	

	public JTextField nameHospital() throws IOException {
		nameHospital= new CfxTextField(null, 0, 0, null);  
		nameHospital.setBounds(180-50, 50, 380, 80);
		nameHospital.setBackground(Color.white);
		nameHospital.setText(StableDataSrc.STRING_SPACE);
		nameHospital.addKeyListener(this);
		return nameHospital;
	}	

	public JTextField name_filter() throws IOException {
		name_filter= new CfxTextField(null, 0, 0, null);  
		name_filter.setBounds(180-50, 50, 380, 80);
		name_filter.setBackground(Color.white);
		name_filter.setText(StableDataSrc.STRING_SPACE);
		name_filter.addKeyListener(this);
		return name_filter;
	}	

	public JTextField name_filter_not_have() throws IOException {
		name_filter_not_have= new CfxTextField(null, 0, 0, null);  
		name_filter_not_have.setBounds(180-50, 50, 380, 80);
		name_filter_not_have.setBackground(Color.white);
		name_filter_not_have.setText(StableDataSrc.STRING_SPACE);
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
		String zhongyao= StableDataSrc.STRING_EMPTY;
		key= name.getText();
		String forE= key.toLowerCase().toString();
		if(key!= null && !key.replace(StableDataSrc.STRING_SPACE, StableDataSrc.STRING_EMPTY)
				.equals(StableDataSrc.STRING_EMPTY) && key.length()>50) {
			key= key.substring(0, 30);
		}
		if(forE!= null&& !forE.replace(StableDataSrc.STRING_SPACE, StableDataSrc.STRING_EMPTY)
				.equals(StableDataSrc.STRING_EMPTY) && forE.length()>110) {
			forE= forE.substring(0, 110);
		}
		key = key.length()== 0? StableDataSrc.STRING_EMPTY: translator.MixedStringToChineseString(analyzer, key);
		if(key.replaceAll("\\s+", StableDataSrc.STRING_SPACE).equalsIgnoreCase(StableDataSrc.STRING_SPACE)){
			key=StableDataSrc.STRING_EMPTY;
		}
		zhongyao= key.toString();
		Here:
			for(int i= 0; i< key.length(); i++) {
				if(StableData.feng.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "风";
					continue Here;
				}
				if(StableData.han.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "风寒";
					continue Here;
				}
				if(StableData.hot.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "风热";
					continue Here;
				}
				if(StableData.shi.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "风湿";
					continue Here;
				}
				if(StableData.huo.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "火";
					continue Here;
				}
				if(StableData.zao.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "燥";
					continue Here;
				}
				if(StableData.liuYin.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "六淫";
					continue Here;
				}
				if(StableData.qiQing.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "七情";
					continue Here;
				}
				if(StableData.wangYang.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "亡阳";
					continue Here;
				}
				if(StableData.wangYin.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "亡阴";
					continue Here;
				}
				if(StableData.jiBaoShiChang.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "饥饱失常";
					continue Here;
				}
				if(StableData.yinShiBuJie.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "饮食不洁";
					continue Here;
				}
				if(StableData.tiaoShiPianShe.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "挑食偏食";
					continue Here;
				}
				if(StableData.biaoHan.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "表寒";
					continue Here;
				}
				if(StableData.biaoRe.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "表热";
					continue Here;
				}
				if(StableData.yuXue.contains(StableDataSrc.STRING_EMPTY+ key.charAt(i))) {
					key+= "淤";
				}
			}
		if(xynkPage!= null) {
			this.xynkPage.key= zhongyao.toString();
			this.xynkPage.keyReleased(null);
		}
		if(zynkxPage!= null) {
			this.zynkxPage.key= zhongyao.toString();
			this.zynkxPage.keyReleased(null);
		}
		if(zyzdxPage!= null) {
			this.zyzdxPage.key= zhongyao.toString();
			this.zyzdxPage.keyReleased(null);
		}
		if(fyydPage!= null) {
			this.fyydPage.key= zhongyao.toString();
			this.fyydPage.keyReleased(null);
		}
		if(fqzPage!= null) {
			this.fqzPage.key= zhongyao.toString();
			this.fqzPage.keyReleased(null);
		}
		if(fckxPage!= null) {
			this.fckxPage.key= zhongyao.toString();
			this.fckxPage.keyReleased(null);
		}
		if(jzkxPage!= null) {
			this.jzkxPage.key= zhongyao.toString();
			this.jzkxPage.keyReleased(null);
		}
		if(wkxPage!= null) {
			this.wkxPage.key= zhongyao.toString();
			this.wkxPage.keyReleased(null);
		}
		if(wskxPage!= null) {
			this.wskxPage.key= zhongyao.toString();
			this.wskxPage.keyReleased(null);
		}
		if(xyscPage!= null) {
			this.xyscPage.key= zhongyao.toString();
			this.xyscPage.keyReleased(null);
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