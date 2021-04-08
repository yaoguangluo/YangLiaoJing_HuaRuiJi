package ME.sample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import org.tinos.vpcs.restServer.RestServer;

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
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.catalytic.procedure.pde.TokenPDI;
import OSQ.disk.GetDisk;
import OVQ.OSU.sort.Quick9DLYGWithStringSwap;
import PEI.thread.MakeContainerBJY;
import PEI.thread.MakeContainerGJJD;
import PEI.thread.MakeContainerHLS;
import PEI.thread.MakeContainerQMDJ;
import PEI.thread.MakeContainerSJFX;
import PEI.thread.MakeContainerXXFC;
import PEI.thread.MakeContainerXYCF;
import PEI.thread.MakeContainerXYJZ;
import PEI.thread.MakeContainerXYNK;
import PEI.thread.MakeContainerXYWK;
import PEI.thread.MakeContainerZNXZ;
import PEI.thread.MakeContainerZYFC;
import PEI.thread.MakeContainerZYNKFJ;
import PEI.thread.MakeContainerZYWS;
import PEI.thread.MakeContainerZYZD;
import PEI.thread.MakeContainer_ZHONG_YAO;
import SP.SoundWaveJPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.BadLocationException;

import org.ASQ.PSU.tinos.view.obj.Verbal;
import org.ASQ.PSU.tinos.view.obj.WordFrequency;
import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;
import org.ASQ.PSU.OEI.tinos.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import org.MSU.OCI.engine.base.translator.Translator;
import org.MSU.OEI.engine.base.translator.imp.TranslatorImp;
import org.OSU.tinos.list.ListSwap;
import org.OSU.tinos.string.StringSwap;
import org.deta.boot.server.BootVPCSBackEnd;
import org.deta.bootFrontEnd.server.BootVPCSFrontEnd;
//import org.deta.boot.server.BootVPCSBackEnd;
//import org.deta.bootFrontEnd.server.BootVPCSFrontEnd;
import org.tinos.listen.ReadToWav;
import org.tinos.neo.tts.ReadChinese;
import org.tinos.rest.medicine.RestMedicinePortImpl;

import biProcessor.CoAuthorForWord;
import comp.detaButton.CfxButton;
import comp.detaButton.DetaButton;
import comp.detaSlider.DetaSlider;
import comp.detaTabbedpane.DetabbedPane;
import comp.detaTableRender.ColorTableRender;
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
	public Xynk jpanel6;
	public Zynkx jpanel7;
	public Zyzdx jpanel8;
	public Fyyd jpanel9;
	public Fqz jpanel10;
	public Fckx jpanel11;
	public Jzkx jpanel12;
	public Wkx jpanel13;
	public Wskx jpanel14;
	public Xysc jpanel15;
	public Cecil jpanel17;
	public EditPane jpanel16;
	public JLabel label0001;
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
	private Map<String, String> ctr;
	public CfxTextField name_feel_filter;
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

	public void init(){
		//Register DNA
		PathLinkFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		if(!new GetDisk().getKey().replaceAll(" ", "").contains("BFBFF000806E9-79530339318")) {
			//System.out.println(new GetDisk().getKey());
			//return;
		}
		try {
			Process process;
			process = Runtime.getRuntime().exec(  
					new String[] {"wmic", "cpu", "get", "ProcessorId"});
			process.getOutputStream().close();
			String value= "";
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(process.getInputStream()); 
			while(sc.hasNext()) {
				value+=sc.next();	
			}
			value+= new GetDisk().getKey();
			if(!value.equalsIgnoreCase("ProcessorIdBFEBFBFF000806E9-7953033931825660327-1051895781")) {
				//return;
			}
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}  

		frameConfig= new JFrame("软件配置面板");
		frameConfig.setIconImage(this.logo.getImage());
		frameConfig.setLayout(null);
		frameConfig.setSize(800, 750);
		frameConfig.resize(800, 750);
		frameConfig.setResizable(false);
		//
		appConfig= new AppConfig();
		frameConfig.add(appConfig);
		frameConfig.setVisible(true);
		frameConfig.show();
		frameConfig.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frameConfig.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				//String command= "taskkill /im dm_new.exe /f";  
				if(appConfig.SectionJPanel.isConfig) {
					frameConfig.removeAll();
					frameConfig.disable();
					System.gc();
					System.exit(0);
				}
			}
		});

		//		long v= 1612264183;
		//		long n= System.currentTimeMillis()/1000;
		//		long d= (n- v)/60/60/24;
		//		if(d> 30*3) {
		//			System.out.println("有效期90天已过");	
		//			System.exit(0);
		//			return;
		//		}
		//		
		appInstance= this;
		appConfig.init(appInstance);
		//stop cursor
		while(appConfig.SectionJPanel.isConfig) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		analyzer= new CogsBinaryForestAnalyzerImp();
		if(appConfig.SectionJPanel.jTextPane!= null) {
			String text= appConfig.SectionJPanel.jTextPane.getText();
			text="\r\n"+ "----当前版本有效期100天."+ text;
			text="\r\n"+ "..."+ text;
			appConfig.SectionJPanel.jTextPane.setText(text);
		}
		jTabbedpane= new DetabbedPane(1000-60, 20, Color.black);// 存放选项卡的组件
		try {
			RestServer rest= new RestServer(this);
			rest.start();
			if(appConfig.SectionJPanel.jTextPane!= null) {
				String text= appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----当前版本有效期100天."+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔中文分词分析子系统完毕！"+ text;
				text="\r\n"+ "..."+ text;
				appConfig.SectionJPanel.jTextPane.setText(text);
			}
			while(!ready) {
				Thread.sleep(300);
			}
			Thread.sleep(10000);
			analyzer.initMixed();
			pos= analyzer.getPosCnToCn();
			pose= analyzer.getPosEnToEn();
			posec= analyzer.getPosEnToCn();
			etc= analyzer.getEnToCn();
			cte= analyzer.getFullCnToEn();
			posFullec= analyzer.getFullEnToCn();
			posFullce= analyzer.getFullCnToEn();
			pinyin= analyzer.getPinYin();
			ctt= analyzer.getCtT();
			ctk= analyzer.getCtA();
			ctr= analyzer.getCtR();
			ctj= analyzer.getCtJ();
			if(appConfig.SectionJPanel.jTextPane!= null) {
				String text= appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----当前版本有效期100天."+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔中文分词分析子系统完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 多国语言词库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				appConfig.SectionJPanel.jTextPane.setText(text);
			}
			ts= new TranslatorImp();
			ts.init(analyzer);
			text= new JTextPane();
			jText= new JTextPane();
			jxText= new JTextPane();
			UIManager.put("ScrollBarUI", "OSI.OSU.OVQ.MSQ.GUI.platForm.UnicornScrollBarUI");	
			jTabbedpane.setBounds(0, 60, 1345, 980);
			tabNames= new ArrayList<>();
			tabNames.add("中药本草");
			tabNames.add("数据分析");
			tabNames.add("智能相诊");
			tabNames.add("智能声诊");
			tabNames.add("奇门遁甲");
			tabNames.add("西医内科");
			tabNames.add("中医方剂诊治");
			tabNames.add("中医诊断");
			tabNames.add("古籍经典");
			tabNames.add("中医生殖");
			tabNames.add("西医生殖");
			tabNames.add("西医急诊");
			tabNames.add("大外科");
			tabNames.add("中医外伤");
			tabNames.add("西药处方");
			tabNames.add("编辑页");
			tabNames.add("哈里森大内科");

			jsp_name= new JScrollPane(this.name());
			jsp_name.setBounds(10+50, 6, 580- 300, 50);

			comp.detaButton.DetaButton jlabel_button= new comp.detaButton.DetaButton("搜:");
			jlabel_button.setBounds(2, 6, 56, 23);
			jlabel_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(null== frame) {
						appSearch= new AppSearch();
						appSearch.init(name);
						appSearch.setBounds(0, 0, 785, 655);
						appSearch.setVisible(true);
						appSearch.show();
						frame= new JFrame("电子护理站 V1.1.0");
						//frame.setLayout(null);
						frame.setSize(780, 650);
						frame.setLocation(300, 300);
						frame.setResizable(false);
						frame.add(appSearch);
						frame.setVisible(true);
						frame.show();
						frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}else {
						frame.setVisible(true);
						frame.show();
					}
				}
			});

			comp.detaButton.DetaButton yin_button= new comp.detaButton.DetaButton("音:");
			yin_button.setBounds(2, 33, 56, 23);
			yin_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						name.setText(new ReadToWav().listen());
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});


			JLabel jlabel_filter= new JLabel("包含过滤:");  
			jlabel_filter.setForeground(Color.WHITE); 
			jlabel_filter.setBounds(60+ 15+ 7+ 585+ 100, -6, 100, 50);

			JScrollPane jsp_name_filter= null;
			jsp_name_filter= new JScrollPane(this.name_filter());
			jsp_name_filter.setBounds(60+15+30+580+ 100+ 40, 8, 580- 455, 22);	

			JLabel jlabel_filter_not_have= new JLabel("有关经络:");  
			jlabel_filter_not_have.setForeground(Color.WHITE); 
			jlabel_filter_not_have.setBounds(50+15+7+485+7, 20, 100, 50);

			JScrollPane jsp_name_filter_not_have= null;
			jsp_name_filter_not_have= new JScrollPane(this.name_filter_not_have());
			jsp_name_filter_not_have.setBounds(50+15+7+485+7+20+ 40, 6+28, 580- 459, 22);

			JLabel risk_filter= new JLabel("风险过滤:");  
			risk_filter.setForeground(Color.WHITE);
			risk_filter.setBounds(10+ 350, 6, 100, 25);

			JLabel feel_filter= new JLabel("无关性味:"); 
			feel_filter.setForeground(Color.WHITE);
			feel_filter.setBounds(60+15+7+585+ 100, 20, 100, 50);

			JScrollPane jsp_name_feel_filter= null;
			jsp_name_feel_filter= new JScrollPane(this.name_feel_filter());
			jsp_name_feel_filter.setBounds(60+15+30+580+ 100+ 40, 6+28, 580- 455, 22);


			JLabel jingmai_filter= new JLabel("线性观测:");  
			jingmai_filter.setForeground(Color.WHITE);
			jingmai_filter.setBounds(10+350, 21, 100, 50);


			look = new DetaSlider(0, 20);
			look.setSnapToTicks(true);
			look.setPaintTicks(true);
			look.setMajorTickSpacing(5);
			look.setMinorTickSpacing(1);
			look.setValue(0);
			look.addChangeListener(
					new ChangeListener(){
						public void stateChanged(ChangeEvent event){
							JSlider source = (JSlider) event.getSource();
							lookrot = source.getValue();
							appInstance.keyReleased(null);	
						}
					});
			look.setBounds(10+350+60, 36, 135, 20);

			JLabel xingwei_filter= new JLabel("功效过滤:");  
			xingwei_filter.setForeground(Color.WHITE); 
			xingwei_filter.setBounds(60+15+7+585, -6, 100, 50);

			JLabel zonghe_filter= new JLabel("配伍过滤:");  
			zonghe_filter.setForeground(Color.WHITE); 
			zonghe_filter.setBounds(50+15+7+485+7, -6, 100, 50);

			JLabel shuming_filter= new JLabel("术名过滤:");  
			shuming_filter.setForeground(Color.WHITE); 
			shuming_filter.setBounds(1+350+100+10, -6, 100, 50);

			zonghe_filter_box= new JCheckBox();
			zonghe_filter_box.setBounds(50+15+7+485+60+7, 8, 20, 20);
			zonghe_filter_box.setBackground(Color.ORANGE);

			zonghe_filter_box.addActionListener(this);

			shuming_filter_box= new JCheckBox();
			shuming_filter_box.setBounds(1+350+100+60+10, 8, 20, 20);
			shuming_filter_box.setBackground(Color.GREEN);

			jingmai_filter_box= new JCheckBox();
			jingmai_filter_box.setBounds(60+ 15+ 30+ 580+ 40, 8, 20, 20);
			jingmai_filter_box.setBackground(Color.BLUE);

			feel_filter_box= new JCheckBox();
			feel_filter_box.setBounds(60+15+30+580+40, 8, 20, 20);
			feel_filter_box.setBackground(Color.MAGENTA);

			risk_filter_box= new JCheckBox();
			risk_filter_box.setBounds(10+350+60, 8, 20, 20);
			risk_filter_box.setBackground(Color.RED);

			JButton addChuFang= new CfxButton("电子医院", 100, 50, Color.red); 
			addChuFang.setBounds(50+50+760+130+130-100-50, 6, 100, 50);
			addChuFang.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//
					String preAdd= "仅作病症预测推荐，不做行医诊治分析，请拥有医师资格证人员慎重分析病情，来做证候分析。谢谢!";
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					preAdd+= "大综合证候分析：";
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					//中医诊断：
					preAdd+= "中医诊断：\r\n\r\n";
					for(int i=0;i<5;i++) {
						preAdd+= "证候名："+ (null==jpanel8.table.getValueAt(i, 2)?"":jpanel8.table.getValueAt(i, 2).toString())
								//	+ "证候内容："+	(null==jpanel8.table.getValueAt(i, 5)?"":jpanel8.table.getValueAt(i, 5).toString())
								+ "可能性："+	(null==jpanel8.table.getValueAt(i, 1)?"":jpanel8.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "内科诊断：\r\n\r\n";
					//内科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候名："+ (null==jpanel6.table.getValueAt(i, 2)?"":jpanel6.table.getValueAt(i, 2).toString())
								//	+ "证候意义："+	(null==jpanel6.table.getValueAt(i, 9)?"":jpanel6.table.getValueAt(i, 9).toString())
								+ "可能性："+	(null==jpanel6.table.getValueAt(i, 1)?"":jpanel6.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "西医诊断：\r\n\r\n";
					//西医急诊：
					for(int i=0;i<5;i++) {
						preAdd+= "证候名："+ (null==jpanel12.table.getValueAt(i, 2)?"":jpanel12.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==jpanel12.table.getValueAt(i, 1)?"":jpanel12.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "外科诊断：\r\n\r\n";
					//外科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==jpanel13.table.getValueAt(i, 2)?"":jpanel13.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==jpanel13.table.getValueAt(i, 1)?"":jpanel13.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					preAdd+= "小专科系统组合诊断（可选）：";
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					preAdd+= "妇幼诊断：\r\n\r\n";
					//妇幼分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==jpanel11.table.getValueAt(i, 2)?"":jpanel11.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==jpanel11.table.getValueAt(i, 1)?"":jpanel11.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}

					preAdd+= "伤科：\r\n\r\n";
					//伤科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==jpanel14.table.getValueAt(i, 2)?"":jpanel14.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==jpanel14.table.getValueAt(i, 1)?"":jpanel14.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}

					String xiYaoTuiJian="";
					xiYaoTuiJian+= "*************************\r\n\r\n";
					xiYaoTuiJian+= "中西医结合用药打分排序（可选）：";
					xiYaoTuiJian+= "\r\n\r\n *************************\r\n\r\n";
					xiYaoTuiJian+= "西药推荐：\r\n\r\n";
					//分析：
					for(int i=0;i<20;i++) {
						xiYaoTuiJian+= "推荐名："+ (null==jpanel15.table.getValueAt(i, 2)?"":jpanel15.table.getValueAt(i, 2).toString())
								+ "适应内容："+	(null==jpanel15.table.getValueAt(i, 8)?"":jpanel15.table.getValueAt(i, 8).toString())
								+ "可能性："+	(null==jpanel15.table.getValueAt(i, 1)?"":jpanel15.table.getValueAt(i, 1).toString());
						xiYaoTuiJian+= "\r\n\r\n";
					}
					preAdd+= xiYaoTuiJian;
					preAdd+= "方剂推荐：\r\n\r\n";
					//方剂分析：
					for(int i=0;i<5;i++) {
						preAdd+= "推荐名："+ (null==jpanel7.table.getValueAt(i, 2)?"":jpanel7.table.getValueAt(i, 2).toString())
								+ "推荐内容："+(null==jpanel7.table.getValueAt(i, 4)?"":jpanel7.table.getValueAt(i, 4).toString())
								+ "可能性："+	(null==jpanel7.table.getValueAt(i, 1)?"":jpanel7.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "\r\n\r\n";

					String zhongYaoTuiJian="";
					//
					zhongYaoTuiJian+= "*************************";
					zhongYaoTuiJian+= "\r\n\r\n";
					zhongYaoTuiJian+= "仅作中药推荐，不做处方权分析，请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
					zhongYaoTuiJian+= "\r\n\r\n *************************";
					zhongYaoTuiJian+= "\r\n\r\n";
					for(int r= 0; r< (newTableModel.getRowCount()< 30? newTableModel.getRowCount(): 30); r++) {
						if(newTableModel.getValueAt(r, 2)!= null&& !newTableModel.getValueAt(r, 2).toString().isEmpty()) {
							zhongYaoTuiJian+= newTableModel.getValueAt(r, 2);
						}
						zhongYaoTuiJian+= "/";
						if(newTableModel.getValueAt(r, 6)!= null&&!newTableModel.getValueAt(r, 6).toString().isEmpty()) {
							String temp= newTableModel.getValueAt(r, 6).toString();
							String value= "";
							for(int i = 0; i < temp.length(); i++){
								if(temp.charAt(i)<128 || temp.charAt(i)=='~') {
									value+=temp.charAt(i);
								}else {
									value+=" ";
								}
							}
							String[] temps = value.replaceAll("\\s+", " ").split(" ");
							if(temps.length>0 && temps[0].split("~").length > 1) {
								//value = temps[0].split("~")[1];
								value = temps[0].split("~")[0].charAt(temps[0].split("~")[0].length()-1)+"~";
								value += temps[0].split("~")[1].replaceAll("g+", "");
								value += "g;";
							}else {
								value = "请酌情添加;";
							}
							zhongYaoTuiJian += value;
						}else {
							zhongYaoTuiJian += "请酌情添加;";
						}
						if(r%2!=0) {
							zhongYaoTuiJian += "\r\n\r\n";
						}else {
							zhongYaoTuiJian += "\r\n\r\n";
						}
					}
					preAdd+= zhongYaoTuiJian;
					if(text.getText().length()< 8000) {
						if(preAdd.length()< 8000) {
							if(!text.getText().isEmpty()) {
								text.setText(preAdd+ "\r\n\r\n"+ text.getText());
							}else {
								text.setText(preAdd);
							}
						}
					}else {
						text.setText(preAdd);
					}
					text.validate();

					if(jText.getText().length()< 8000) {
						if(zhongYaoTuiJian.length()< 8000) {
							if(!jText.getText().isEmpty()) {
								jText.setText(zhongYaoTuiJian+ "\r\n\r\n"+ jText.getText());
							}else {
								jText.setText(zhongYaoTuiJian);
							}
						}
					}else {
						jText.setText(zhongYaoTuiJian);
					}
					jText.validate();

					if(jxText.getText().length()< 8000) {
						if(xiYaoTuiJian.length()< 8000) {
							if(!jxText.getText().isEmpty()) {
								jxText.setText(xiYaoTuiJian+ "\r\n\r\n"+ jxText.getText());
							}else {
								jxText.setText(xiYaoTuiJian);
							}
						}
					}else {
						jxText.setText(xiYaoTuiJian);
					}
					jxText.validate();


					if(null== frameHospital) {
						appHospital= new AppHospital();
						appHospital.init(jText, appInstance);
						appHospital.setBounds(0, 0, 1145, 455);
						appHospital.setVisible(true);
						appHospital.show();
						frameHospital= new JFrame("电子医院诊断推荐报告 V0.0.3");
						//frame.setLayout(null);
						frameHospital.setSize(1140, 650);
						frameHospital.setLocation(300, 300);
						frameHospital.setResizable(false);
						frameHospital.add(appHospital);
						frameHospital.setVisible(true);
						frameHospital.show();
						frameHospital.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}else {						
						appHospital= new AppHospital();
						appHospital.init(jText, appInstance);
						appHospital.setBounds(0, 0, 1145, 455);
						appHospital.setVisible(true);
						appHospital.show();
						frameHospital= new JFrame("电子医院诊断推荐报告 V0.0.3");
						//frame.setLayout(null);
						frameHospital.setSize(1140, 650);
						frameHospital.setLocation(300, 300);
						frameHospital.setResizable(false);
						frameHospital.add(appHospital);
						frameHospital.setVisible(true);
						frameHospital.show();
						frameHospital.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}
					jText.validate();

				}
			});

			JButton button2= new CfxButton("德塔在线", 100, 50, Color.cyan); 
			button2.setBounds(30+60+760+130+130+130-100-50, 6, 100, 50);
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String link= "http://tinos.qicp.vip/data.html";
						Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+link);
					} catch (IOException e1) {	
						jTabbedpane.validate();
					}
				}
			});

			JButton button5= new CfxButton("卫健委", 100, 50, Color.orange); 
			button5.setBounds(10+ 70+ 760+ 130+ 130+ 130+ 130- 100- 50, 6, 100, 50);
			button5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String link="http://www.nhc.gov.cn";
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+link);
					} catch (IOException e1) {	
						jTabbedpane.validate();
					}
				}
			});	
			JPanel jp= new JPanel();
			jp.setLayout(null);
			jp.setBounds(0, 0, 1470, 980-50+ rangeHigh);
			jp.setBackground(Color.BLACK);
			jp.add(addChuFang);
			jp.add(button2);
			//jp.add(button3);
			//jp.add(button4);
			jp.add(button5);
			jp.add(jlabel_button);
			jp.add(yin_button);
			jp.add(jsp_name);
			jp.add(jsp_name_filter);
			jp.add(jlabel_filter);
			jp.add(jsp_name_filter_not_have);
			jp.add(jlabel_filter_not_have);
			jp.add(jTabbedpane);
			jp.add(risk_filter);
			jp.add(feel_filter);
			jp.add(xingwei_filter);
			jp.add(risk_filter_box);
			jp.add(look);
			jp.add(jsp_name_feel_filter);
			jp.add(jingmai_filter);
			jp.add(feel_filter_box);
			//jp.add(jingmai_filter_box);
			jp.add(zonghe_filter);
			jp.add(shuming_filter);
			jp.add(zonghe_filter_box);
			jp.add(shuming_filter_box);
			jp.setPreferredSize(new Dimension(1330, 730+ 40+ rangeHigh));
			JScrollPane js= new JScrollPane(jp);
			js.setBounds(0, 0, 1335, 730+ 50+ rangeHigh);	
			this.setLayout(null);  
			this.getContentPane().add(js);
			js.setViewportView(jp);
			this.setBounds(0, 0, 1345, 770+ 25+ rangeHigh);
			this.setVisible(true);
			Container jpanelFirst= new Container();
			MakeContainer_ZHONG_YAO c1= null;
			c1= new MakeContainer_ZHONG_YAO(analyzer, jpanelFirst, this, tabNames, pos, jTabbedpane);
			c1.start();
			jTabbedpane.addTab(tabNames.get(0), new ImageIcon(), jpanelFirst, "first");
			jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
			jTabbedpane.setBackgroundAt(0, new Color(253, 233, 254));
			jTabbedpane.addChangeListener(this);
			Thread.sleep(300);
			this.mouseClicked(null);

			if(appConfig.SectionJPanel.jlabel_peizhi_di2511.isSelected()) {
				//front
				new BootVPCSFrontEnd().start();
				Thread.sleep(5);
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----载入德塔 前端服务器 完毕！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				//backend
				new BootVPCSBackEnd().start();
				Thread.sleep(6);
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----载入德塔 后端服务器 完毕！"+ text;
					text="\r\n"+ "..."+ text;
					text="\r\n"+ "----载入德塔 数据分析引擎 完毕！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
			}

			if(appConfig.SectionJPanel.tabNamesHook[1]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入数据分析页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanelSecond= new Container();  
				MakeContainerSJFX c2= new MakeContainerSJFX(tableData_old, text, analyzer,jpanelSecond,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c2.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[2]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入智能相诊页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanelThird= new Container();  
				MakeContainerZNXZ c3= new MakeContainerZNXZ(analyzer,jpanelThird,this,jTabbedpane,tabNames, pos,pose,etc,cte);
				c3.start();
				Thread.sleep(300);
			}

			//			if(appConfig.SectionJPanel.tabNamesHook[3]) {
			//				if(appConfig.SectionJPanel.jTextPane!= null) {
			//					String text= appConfig.SectionJPanel.jTextPane.getText();
			//					text="\r\n"+ "----正在载入智能声诊页面！"+ text;
			//					text="\r\n"+ "..."+ text;
			//					appConfig.SectionJPanel.jTextPane.setText(text);
			//				}
			//				Container jpanelFourth= new Container();
			//				MakeContainerZNSZ c4= new MakeContainerZNSZ(analyzer,jpanelFourth,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			//				c4.start();
			//				Thread.sleep(300);
			//			}

			if(appConfig.SectionJPanel.tabNamesHook[4]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入奇门遁甲页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanel5= new Container();  
				MakeContainerQMDJ c5=new MakeContainerQMDJ(analyzer,jpanel5,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c5.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[5]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入西医内科页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYNK c6=new MakeContainerXYNK(analyzer,this,jTabbedpane,tabNames, pos,pose,etc,cte);
				c6.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[6]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入中医方剂页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYNKFJ c7=new MakeContainerZYNKFJ(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c7.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[7]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入中医诊断页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYZD c8=new MakeContainerZYZD(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c8.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[8]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入古籍经典页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerGJJD c9=new MakeContainerGJJD(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c9.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[9]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入中医妇产页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYFC c10=new MakeContainerZYFC(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c10.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[10]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 西医妇产 页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXXFC c11=new MakeContainerXXFC(analyzer,this,jTabbedpane,tabNames, pos,pose,etc,cte);
				c11.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[11]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 西医急诊 页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYJZ c12=new MakeContainerXYJZ(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c12.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[12]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 西医外科 页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYWK c13=new MakeContainerXYWK(analyzer,this,jTabbedpane,tabNames, pos,pose,etc,cte);
				c13.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[13]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 中医外伤 页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYWS c14=new MakeContainerZYWS(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c14.start();	
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[14]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 西医处方 页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYCF c15=new MakeContainerXYCF(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
				c15.start();
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[15]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text= "\r\n"+ "----正在载入 编辑页 页面！"+ text;
					text= "\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerBJY c16= new MakeContainerBJY(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc
						, cte, pinyin, ctj, ctt, ctk, ctr);
				c16.start();	
				Thread.sleep(300);
			}

			if(appConfig.SectionJPanel.tabNamesHook[16]) {
				if(appConfig.SectionJPanel.jTextPane!= null) {
					String text= appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 哈里森医典 页面！"+ text;
					text="\r\n"+ "..."+ text;
					appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerHLS c17= new MakeContainerHLS(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte,posec,posFullec);
				c17.start();
			}
			if(appConfig.SectionJPanel.jTextPane!= null) {
				String text= appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----正常载入完毕 欢迎使用 养疗经 大数据医学辅助，诊疗，电子医院系统！"+ text;
				text="\r\n"+ "----唯一版本号:BFEBFBFF-000906EA-13909532-49137476-6916="+ text;
				text="\r\n"+ "..."+ text;
				appConfig.SectionJPanel.jTextPane.setText(text);
			}

			try {
				Process process;
				process = Runtime.getRuntime().exec(  
						new String[] {"wmic", "cpu", "get", "ProcessorId"});
				process.getOutputStream().close();
				String value= "";
				@SuppressWarnings("resource")
				Scanner sc= new Scanner(process.getInputStream()); 
				while(sc.hasNext()) {
					value+=sc.next();	
				}
				value+= new GetDisk().getKey();
				if(!value.equalsIgnoreCase("ProcessorIdBFEBFBFF000806E9-7953033931825660327-1051895781")) {
					//return;
				}
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}  
			disableCursor= false;
		} catch (IOException | InterruptedException e4) {
			jTabbedpane.validate();
			e4.printStackTrace();
		}
	}

	private JTextField name_feel_filter() {
		name_feel_filter= new CfxTextField(null, 0, 0, null);  
		name_feel_filter.setBounds(180-50, 50, 380, 80);
		name_feel_filter.setBackground(Color.white);
		name_feel_filter.setText(" ");
		name_feel_filter.addKeyListener(this);
		return name_feel_filter;
	}

	public JPanel panel() throws IOException{
		panel_yt= new JPanel();
		panel_yt.setBackground(Color.white);
		pngy_2_1= new ImageIcon(this.getClass().getResource(PathLinkFile.yc_2_1_png));
		label0001= new JLabel(pngy_2_1);
		panel_yt.add(label0001);
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
						String string; System.out.println(linkUrl.getFile());
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

	@SuppressWarnings({"serial"})
	public javax.swing.JTable jTable() throws IOException {
		DictionaryFromDB d= new DictionaryFromDB();
		//dictionary d= new dictionary();
		//dic_list= d.txtToList();
		try {
			dic_map= d.listToMap(dic_yw, dic_li, dic_hai, dic_xz, dic_ya, dic_jm
					, dic_xw, dic_cy, dic_jj, dic_zf, dic_cj, dic_yl);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//		dic_map= d.listToMap(dic_list);
		dic_index= d.mapToIndex(dic_map);
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
		tableData_old= new Object[dic_map.size()][14];
		Object[][] tableData_old_for_model= new Object[dic_map.size()][14];
		Iterator<String> iter= dic_map.keySet().iterator();
		copy= new ArrayList<>();
		int cc=0;
		while (iter.hasNext()) {
			String temp= iter.next();
			copy.add(temp);
		}
		System.out.println(cc);
		for(int i = 0; i < copy.size(); i++) {
			tableData_old[i]= new Object[]{
					(dic_index.get(copy.get(i))==null?"":dic_index.get(copy.get(i))).toString()
					.replaceAll("\\s*", "") ,
					//dic_index.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					""+0,copy.get(i).trim(),
					(dic_yw.get(copy.get(i))==null?"":dic_yw.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(dic_li.get(copy.get(i))==null?"":dic_li.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					//dic_yw.get(copy.get(i)).toString().replaceAll("\\s*", "") , 
					//dic_li.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					(dic_hai.get(copy.get(i))==null?"详情参考笔记原文列":dic_hai.get(copy.get(i))
							.toString().replaceAll("\\s*", "").equalsIgnoreCase("")
							?"详情参考笔记原文列":dic_hai.get(copy.get(i)).toString().replaceAll("\\s*", "")), 
					(dic_yl.get(copy.get(i))==null?"":dic_yl.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(dic_xw.get(copy.get(i))==null?"":dic_xw.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(dic_jm.get(copy.get(i))==null?"":dic_jm.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					//dic_xw.get(copy.get(i)).toString().replaceAll("\\s*", "") ,
					//dic_jm.get(copy.get(i)).toString().replaceAll("\\s*", "") ,
					(dic_xz.get(copy.get(i))==null?"":dic_xz.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""), 
					(dic_jj.get(copy.get(i))==null?"":dic_jj.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""), 
					(dic_cy.get(copy.get(i))==null?"":dic_cy.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(dic_ya.get(copy.get(i))==null?"":dic_ya.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""), 
					(dic_zf.get(copy.get(i))==null?"":dic_zf.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(dic_cj.get(copy.get(i))==null?"":dic_cj.get(copy.get(i))).toString()
					.replaceAll("\\s*", "")};
			tableData_old_for_model[i]=tableData_old[i].clone();
		}	
		table= new javax.swing.JTable();  
		newTableModel= new DefaultTableModel(tableData_old_for_model, columnTitle){  
			@Override  
			public boolean isCellEditable(int row,int column){  
				return false;  
			}
		};  
		//		TableSorterWithLYG4DQS4D sorter= new TableSorterWithLYG4DQS4D(newTableModel); //ADDE
		TableSorterZYNK sorter= new TableSorterZYNK(newTableModel); //ADD
		sorter.addTableName("zybc");
		sorter.setTableHeader(table.getTableHeader());
		table.setModel(sorter); 
		table.setRowHeight(35);                                        //设置高度
		JTableHeader header= table.getTableHeader();
		header.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
		table.addMouseListener(this);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(4).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(5).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(6).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(7).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(8).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(9).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(10).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(11).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(12).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(14).setPreferredWidth(300+60);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getTableHeader().setReorderingAllowed(false);
		table.validate();
		table.setVisible(true);
		ColorTableRender tcr= new ColorTableRender();  
		table.setDefaultRenderer(Object.class, tcr);	
		return table;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(null==arg0) {
			row= 0;
			col= 3;
		}else {
			if(disableCursor) {
				return;
			}
			row= table.getSelectedRow();
			col= table.getSelectedColumn();
		}
		key= name.getText();
		if(key!= null && !key.replace(" ", "").equals("") && key.length()>20) {
			key= key.substring(0, 20);
		}
		if(key== null) {
			key= "";	
		}
		if(jpanel7!= null) {
			this.jpanel7.key= table.getValueAt(row, 2).toString();
			this.jpanel7.keyReleased(null);
		}
		try {
			coAuthorForWord.bootClassificationMap(table.getValueAt(row, 2).toString(), false);
		}catch(Exception e) {
			this.validate();
		}
		try {
			String value = table.getValueAt(row, col).toString();
			data.setSize(500, 800);
			sets = analyzer.parserMixedString(value);//词性分析
			data.setContentType("text/html");
			String page="";
			Iterator<String> iterator = sets.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					if(pos.get(setOfi) == null) {
						page += ("<span style=\"background:#FEFEFE\"><font color=\"black\" size=\"5\">" 
								+ setOfi + "</font></span>");
						continue Here;
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi)
								.contains("动")||pos.get(setOfi).contains("形"))) {
							page+="<span style=\"background:red\"><font color=\"white\">"+setOfi
									+"</font></span>";
							continue Here;
						}
						if(pos.get(setOfi).contains("名")) {
							page+="<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor()
									.Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(pos.get(setOfi).contains("动")) {
							page+="<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor()
									.Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(pos.get(setOfi).contains("形")) {
							page+="<span style=\"background:"+new PEU.imageProcessorYLJ.ColorProcessor()
									.Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(pos.get(setOfi).contains("副")) {
							page+="<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi
									+"</font></span>";
							continue Here;
						} 
						page+="<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi
								+"</font></span>";				 
					}
				}
			data.setText(page);
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
		}catch(Exception e){	
			e.printStackTrace();
		}          
		//add graph
		try {
			panel_yt.removeAll();
			label0001.removeAll();
			String value_temp= table.getValueAt(row, 2).toString().replace("\\s+", "");
			pngy_2_1= new ImageIcon(this.getClass().getResource(PathLinkFile.yc+ "/"+ value_temp+ ".png"));
			label0001.setIcon(pngy_2_1);
			label0001.validate();
			panel_yt.add(label0001);
			panel_yt.validate();
			panel_yt.updateUI();
		}catch(Exception e) {
			JLabel temp= new JLabel("亲，没找到~");
			panel_yt.add(temp);
			panel_yt.validate();
			panel_yt.updateUI();
		}
		this.panel.removeAll();
		this.panel.setLayout(new GridLayout(1, 1));
		//add jingmai
		String value_jingmai= "";
		try {
			for(int i= 0; i< table.getColumnCount(); i++) {
				if(table.getValueAt(row, i)!= null) {
					String temp= table.getValueAt(row, i).toString();
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
					JLabel label1= new JLabel(this.shouyangmin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手少阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("三焦")) {
					JLabel label1= new JLabel(this.shoushaoyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手少阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("心")
						||value_jingmai.contains("苦")) {
					JLabel label1= new JLabel(this.shoushaoyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手太阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("小肠")) {
					JLabel label1= new JLabel(this.shoutaiyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手太阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肺")
						||value_jingmai.contains("辛")) {
					JLabel label1= new JLabel(this.shoutaiyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手厥阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("心包")) {
					JLabel label1= new JLabel(this.shoujueyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足阳明")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("胃")) {
					JLabel label1= new JLabel(this.zuyangmin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足少阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("胆")) {
					JLabel label1= new JLabel(this.zushaoyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足少阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肾")
						||value_jingmai.contains("咸")||value_jingmai.contains("寒")) {
					JLabel label1= new JLabel(this.zushaoyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足太阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("膀胱")) {
					JLabel label1= new JLabel(this.zutaiyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足太阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("脾")) {
					JLabel label1= new JLabel(this.zutaiyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足厥阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肝")
						||value_jingmai.contains("温")) {
					JLabel label1= new JLabel(this.zujueyin);
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
			this.panel.add(jingMaiBox);
			this.panel.updateUI();
		}catch(Exception e) {
			e.printStackTrace();
			this.panel.updateUI();
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
		if(jpanel6!= null) {
			this.jpanel6.key= zhongyao.toString();
			this.jpanel6.keyReleased(null);
		}
		if(jpanel7!= null) {
			this.jpanel7.key= zhongyao.toString();
			this.jpanel7.keyReleased(null);
		}
		if(jpanel8!= null) {
			this.jpanel8.key= zhongyao.toString();
			this.jpanel8.keyReleased(null);
		}
		if(jpanel9!= null) {
			this.jpanel9.key= zhongyao.toString();
			this.jpanel9.keyReleased(null);
		}
		if(jpanel10!= null) {
			this.jpanel10.key= zhongyao.toString();
			this.jpanel10.keyReleased(null);
		}
		if(jpanel11!= null) {
			this.jpanel11.key= zhongyao.toString();
			this.jpanel11.keyReleased(null);
		}
		if(jpanel12!= null) {
			this.jpanel12.key= zhongyao.toString();
			this.jpanel12.keyReleased(null);
		}
		if(jpanel13!= null) {
			this.jpanel13.key= zhongyao.toString();
			this.jpanel13.keyReleased(null);
		}
		if(jpanel14!= null) {
			this.jpanel14.key= zhongyao.toString();
			this.jpanel14.keyReleased(null);
		}
		if(jpanel15!= null) {
			this.jpanel15.key= zhongyao.toString();
			this.jpanel15.keyReleased(null);
		}
		if(jpanel16!= null) {
			this.jpanel16.key= zhongyao.toString();
			this.jpanel16.keyReleased(null);
		}
		for(int i= 0; i< this.searchList.size(); i++) {
			try {
				searchList.get(i).AOP_VEC_SQ(null, zhongyao.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error");
				//e.printStackTrace();
			}
		}

		Translator ts= new TranslatorImp();
		try {
			ts.init(analyzer);
		} catch (IOException e) {
		} 
		List<Verbal> verbals= ts.index(analyzer, forE);
		if(jpanel17!= null) {
			this.jpanel17.verbals= verbals;
			this.jpanel17.keyReleased(null);
		}
		zhongYaoSearch(zhongyao, forE, key);
	}

	public void zhongYaoSearch(String zhongyao, String forE, String key) {
		String CatalyticDNA_xingwei= "";
		String CatalyticDNA_gongxiao= "";
		if(DNASearchIsClick) {
			TokenPDI pDE_RNA_Formular= new TokenPDI();
			double rate= ((double)催化比值rot)/ 100;
			//pDE_RNA_Formular.key[0]= 0.3;
			pDE_RNA_Formular.key[1]= rate;
			pDE_RNA_Formular.key[2]= rate;
			//pDE_RNA_Formular.key[3]= 0.3;
			if(null!= name_feel_filter.getText()) {
				pDE_RNA_Formular.pdw= name_feel_filter.getText().toUpperCase();
				pDE_RNA_Formular.code= pDE_RNA_Formular.pdw.toString().toUpperCase();
				pDE_RNA_Formular.doKeyPress(pDE_RNA_Formular.code, pDE_RNA_Formular, false);		
				CatalyticDNA_xingwei= null== pDE_RNA_Formular.pde?"": pDE_RNA_Formular.pde.toString();
			}
			//
			pDE_RNA_Formular.pde= "";
			if(null!= name_filter_not_have.getText()) {
				pDE_RNA_Formular.pdw= name_filter_not_have.getText().toUpperCase();
				pDE_RNA_Formular.code= pDE_RNA_Formular.pdw.toString().toUpperCase();
				pDE_RNA_Formular.doKeyPress(pDE_RNA_Formular.code, pDE_RNA_Formular, false);		
				CatalyticDNA_gongxiao= null== pDE_RNA_Formular.pde?"": pDE_RNA_Formular.pde.toString();		
			}
		}
		String[] score= new String[copy.size()];
		int[] score_code= new int[copy.size()];
		double []reg= new double[copy.size()];
		int count= 0;
		Map<String, WordFrequency> mapSearchWithoutSort= null;
		if(dic_map.containsKey(zhongyao.replaceAll(" ", ""))) {
			mapSearchWithoutSort= analyzer.parserMixStringByReturnFrequencyMap(zhongyao);	
		}else {
			String[] strings= key.split(" ");
			if(strings.length> 1&& key.split(" ")[0].length()> 5) {
				mapSearchWithoutSort= analyzer.parserMixStringByReturnFrequencyMap(key);
			}else {
				mapSearchWithoutSort= analyzer.parserMixStringByReturnFrequencyMap(zhongyao);	
			}
		}	
		Iterator<String> iteratorForCopy= copy.iterator();	
		int copyCount= 0;
		List<String> list= analyzer.parserMixedString(key);
		String[] string= ListSwap.listToArray(list);

		String[] stringReg= new String[forE.length()/ 3];
		for(int i= 0; i< stringReg.length; i++) {
			stringReg[i]= forE.substring(i* 3, (i* 3+ 3)< forE.length()? (i* 3+ 3): forE.length()- 1);
		}
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString= iteratorForCopy.next();
			score[copyCount]= iteratorForCopyString;
			String temps= dic_map.get(iteratorForCopyString).toString();
			String tempsPCA= dic_li.get(iteratorForCopyString).toString();
			String tempsIndex= dic_index.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency= mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					String mapSearchaAtII = iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
					if(temps.contains(mapSearchaAtII)) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						if(score[copyCount].contains(zhongyao.replace(" ", ""))) {
							reg[copyCount]+= 12;
						}
						if(zhongyao.contains(score[copyCount].replace(" ", ""))) {
							reg[copyCount]+= 12;
						}

						if(tempsIndex.equalsIgnoreCase(zhongyao.replace(" ", ""))) {
							reg[copyCount]+= 1200;
						}
						if(tempsIndex.contains(zhongyao.replace(" ", "").toUpperCase())) {
							reg[copyCount]+= 1200;
						}

						score[copyCount]= iteratorForCopyString;
						if(!pos.containsKey(mapSearchaAtII)) {
							reg[copyCount]+= 1;
							score_code[copyCount]+= 1<< mapSearchaAtII.length()
									<< wordFrequencySearch.getFrequency() ;
							if(tempsPCA.contains(mapSearchaAtII)) {
								score_code[copyCount] *= 2;
							}
							if(score[copyCount].contains(mapSearchaAtII)) {
								if(score[copyCount].length()>1) {
									reg[copyCount]+= 22;
								}
								reg[copyCount]+= 3;
							}
							continue Here;
						}
						if(pos.get(mapSearchaAtII).contains("名")|| pos.get(mapSearchaAtII).contains("动")
								|| pos.get(mapSearchaAtII).contains("形")|| pos.get(mapSearchaAtII).contains("谓")) {
							reg[copyCount]+= 2;
							if(tempsPCA.contains(mapSearchaAtII)) {
								reg[copyCount]*= 2;
							}
						}
						reg[copyCount]+= 1;
						score_code[copyCount]+= (iteratorForCopyString.contains(mapSearchaAtII)? 2: 1) 
								* (!pos.get(mapSearchaAtII).contains("名")? pos.get(mapSearchaAtII).contains("动")? 10: 1: 150) 
								<< mapSearchaAtII.length()* wordFrequencySearch.getFrequency();
						if(score[copyCount].contains(mapSearchaAtII)) {
							if(score[copyCount].length()>1) {
								reg[copyCount]+= 22;
							}
							reg[copyCount]+= 3;
						}
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
								if(score[copyCount].contains(mapSearchaAtII)) {
									if(score[copyCount].length()>1) {
										reg[copyCount]+= 12;
									}
									reg[copyCount]+= 3;
								}
								continue Here;
							}
						}
					}
				}
			score_code[copyCount] = score_code[copyCount] * (int)reg[copyCount];
			//词距
			int code= 200;
			int tempb= 0;
			int tempa= score_code[copyCount];
			if(key.length()> 6) {
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
				score_code[copyCount] = (int) (tempa/Math.pow(lookrot+ 1, 4) + tempb*Math.pow(lookrot, 2));
			}
			if(zhongyao.replace(" ", "").length()> 1&& zhongyao.replace(" ", "").length()< 5) {
				if(temps.contains(zhongyao.replace(" ", ""))) {
					tempb+= code<< 7;
				}
				score_code[copyCount] = (int) (tempa/Math.pow(lookrot+ 1, 4) + tempb*Math.pow(lookrot, 2));
			}
			copyCount++;
		}
		new Quick9DLYGWithStringSwap().sort(score_code, score);
		Object[][] tableData= new Object[count][13];
		int new_count = 0;
		newTableModel.getDataVector().clear();
		if(null== key|| key.equals("")) {
			for(int i= 0; i < tableData_old.length; i++) {
				tableData_old[i][6]= tableData_old[i][6]==null? "": tableData_old[i][6];
				newTableModel.insertRow(i, tableData_old[i]);
			}		
			newTableModel.fireTableDataChanged();	
			return;
		}
		Here:
			for(int i = copy.size()-1; i > -1; i--) {
				if(score_code[i]< 1){
					continue Here;
				}
				if(risk_filter_box.isSelected()) {
					String hai= (dic_hai.get(score[i])==null?"null."
							:dic_hai.get(score[i]).toString().replaceAll("\\s*", "")
							.equalsIgnoreCase("")?"null":dic_hai.get(score[i]).toString()
									.replaceAll("\\s*", ""));
					String temp= name_filter.getText();
					for(int j=0;j<temp.length();j++) {
						if(hai.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				if(feel_filter_box.isSelected()) {
					String li= (dic_li.get(score[i])==null?"null."
							:dic_li.get(score[i]).toString().replaceAll("\\s*", "")
							.equalsIgnoreCase("")?"null": dic_li.get(score[i]).toString()
									.replaceAll("\\s*", ""));
					String temp= name_filter.getText();
					for(int j= 0; j< temp.length(); j++) {
						if(li.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				//催化比值rot dna 催化计算
				if(!name_feel_filter.getText().isEmpty()) {
					String wei= dic_xw.get(score[i]).toString().replaceAll("\\s*", "");
					CatalyticDNA_xingwei+= name_feel_filter.getText().replace(" ", "");
					for(int j= 0; j< CatalyticDNA_xingwei.length(); j++) {
						if(wei.contains(""+ CatalyticDNA_xingwei.charAt(j))) {
							continue Here;
						}	
					}
				}
				if(null!= name_filter_not_have.getText()) {
					if(!name_filter_not_have.getText().replace(" ", "").isEmpty()) {
						String wei= dic_jm.get(score[i]).toString().replaceAll("\\s*", "");
						CatalyticDNA_gongxiao+= name_filter_not_have.getText().replace(" ", "");;
						for(int j= 0; j< CatalyticDNA_gongxiao.length(); j++) {
							if(!wei.contains(""+ CatalyticDNA_gongxiao.charAt(j))) {
								continue Here;
							}
						}
					}
				}
				if(shuming_filter_box.isSelected()) {
					String wei= score[i];
					String temp= name_filter.getText();
					for(int j= 0; j< temp.length(); j++) {
						if(wei.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				String temp= dic_map.get(score[i]).toString();
				if(tableData.length<= new_count) {
					continue Here;
				}
				tableData[new_count]= new Object[]{
						(dic_index.get(score[i])== null? "": dic_index.get(score[i])).toString().replaceAll("\\s*", ""), 
						score_code[i], score[i],
						(dic_yw.get(score[i])== null? "": dic_yw.get(score[i])).toString().replaceAll("\\s*", ""), 
						(dic_li.get(score[i])== null? "": dic_li.get(score[i])).toString().replaceAll("\\s*", ""), 
						(dic_hai.get(score[i])==null?"详情参考笔记原文列: 是药三分毒, 补药甚三分. 食材亦如此, 勤俭亦长生."
								:dic_hai.get(score[i]).toString().replaceAll("\\s*", "").equalsIgnoreCase("")?"详情参考笔记原文列"
										:dic_hai.get(score[i]).toString().replaceAll("\\s*", "")), 				
						(dic_yl.get(score[i])==null?"详情参考相关书籍":dic_yl.get(score[i])).toString().replaceAll("\\s*", ""),
						(dic_xw.get(score[i])== null? "": dic_xw.get(score[i])).toString().replaceAll("\\s*", ""), 
						(dic_jm.get(score[i])== null? "": dic_jm.get(score[i])).toString().replaceAll("\\s*", ""), 	
						(dic_xz.get(score[i])==null?"":dic_xz.get(score[i])).toString().replaceAll("\\s*", ""), 
						(dic_jj.get(score[i])==null?"":dic_jj.get(score[i])).toString().replaceAll("\\s*", ""), 
						(dic_cy.get(score[i])==null?"":dic_cy.get(score[i])).toString().replaceAll("\\s*", ""),
						(dic_ya.get(score[i])==null?"":dic_ya.get(score[i])).toString().replaceAll("\\s*", ""), 
						(dic_zf.get(score[i])==null?"":dic_zf.get(score[i])).toString().replaceAll("\\s*", ""),
						(dic_cj.get(score[i])==null?"":dic_cj.get(score[i])).toString().replaceAll("\\s*", "")};
				if(zhongyao.contains("风寒")) {
					if(temp.contains("风寒")) {
						newTableModel.insertRow(new_count, tableData[new_count]);
						new_count += 1;
					}
				}else if(zhongyao.contains("风热")){
					if(temp.contains("风热")) {
						newTableModel.insertRow(new_count, tableData[new_count]);
						new_count += 1;
					}		
				}else {
					newTableModel.insertRow(new_count, tableData[new_count]);
					new_count+=1;
				}		 
			}	
		newTableModel.fireTableDataChanged();
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