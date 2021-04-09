package ME.sample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.tinos.vpcs.restServer.RestServer;

import OSQ.disk.GetDisk;
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
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.MSU.OEI.engine.base.translator.imp.TranslatorImp;
import org.ASQ.PSU.OEI.tinos.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import org.deta.boot.server.BootVPCSBackEnd;
import org.deta.bootFrontEnd.server.BootVPCSFrontEnd;
import org.tinos.listen.ReadToWav;

import comp.detaButton.CfxButton;
import comp.detaSlider.DetaSlider;
import comp.detaTabbedpane.DetabbedPane;
public class AppInit {	
	@SuppressWarnings("deprecation")
	public void init(App app){
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

		app.frameConfig= new JFrame("软件配置面板");
		app.frameConfig.setIconImage(app.logo.getImage());
		app.frameConfig.setLayout(null);
		app.frameConfig.setSize(800, 750);
		app.frameConfig.resize(800, 750);
		app.frameConfig.setResizable(false);
		//
		app.appConfig= new AppConfig();
		app.frameConfig.add(app.appConfig);
		app.frameConfig.setVisible(true);
		app.frameConfig.show();
		app.frameConfig.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		app.frameConfig.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				//String command= "taskkill /im dm_new.exe /f";  
				if(app.appConfig.SectionJPanel.isConfig) {
					app.frameConfig.removeAll();
					app.frameConfig.disable();
					System.gc();
					System.exit(0);
				}
			}
		});

		app.appInstance= app;
		app.appConfig.init(app.appInstance);
		//stop cursor
		while(app.appConfig.SectionJPanel.isConfig) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		app.analyzer= new CogsBinaryForestAnalyzerImp();
		if(app.appConfig.SectionJPanel.jTextPane!= null) {
			String text= app.appConfig.SectionJPanel.jTextPane.getText();
			text="\r\n"+ "----当前版本有效期100天."+ text;
			text="\r\n"+ "..."+ text;
			app.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		app.jTabbedpane= new DetabbedPane(1000-60, 20, Color.black);// 存放选项卡的组件
		try {
			RestServer rest= new RestServer(app);
			rest.start();
			if(app.appConfig.SectionJPanel.jTextPane!= null) {
				String text= app.appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----当前版本有效期100天."+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔中文分词分析子系统完毕！"+ text;
				text="\r\n"+ "..."+ text;
				app.appConfig.SectionJPanel.jTextPane.setText(text);
			}
			while(!app.ready) {
				Thread.sleep(300);
			}
			Thread.sleep(10000);
			app.analyzer.initMixed();
			app.pos= app.analyzer.getPosCnToCn();
			app.pose= app.analyzer.getPosEnToEn();
			app.posec= app.analyzer.getPosEnToCn();
			app.etc= app.analyzer.getEnToCn();
			app.cte= app.analyzer.getFullCnToEn();
			app.posFullec= app.analyzer.getFullEnToCn();
			app.posFullce= app.analyzer.getFullCnToEn();
			app.pinyin= app.analyzer.getPinYin();
			app.ctt= app.analyzer.getCtT();
			app.ctk= app.analyzer.getCtA();
			app.ctr= app.analyzer.getCtR();
			app.ctj= app.analyzer.getCtJ();
			if(app.appConfig.SectionJPanel.jTextPane!= null) {
				String text= app.appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----当前版本有效期100天."+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔中文分词分析子系统完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 多国语言词库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				app.appConfig.SectionJPanel.jTextPane.setText(text);
			}
			app.ts= new TranslatorImp();
			app.ts.init(app.analyzer);
			app.text= new JTextPane();
			app.jText= new JTextPane();
			app.jxText= new JTextPane();
			UIManager.put("ScrollBarUI", "OSI.OSU.OVQ.MSQ.GUI.platForm.UnicornScrollBarUI");	
			app.jTabbedpane.setBounds(0, 60, 1345, 980);
			app.tabNames= new ArrayList<>();
			app.tabNames.add("中药本草");
			app.tabNames.add("数据分析");
			app.tabNames.add("智能相诊");
			app.tabNames.add("智能声诊");
			app.tabNames.add("奇门遁甲");
			app.tabNames.add("西医内科");
			app.tabNames.add("中医方剂诊治");
			app.tabNames.add("中医诊断");
			app.tabNames.add("古籍经典");
			app.tabNames.add("中医生殖");
			app.tabNames.add("西医生殖");
			app.tabNames.add("西医急诊");
			app.tabNames.add("大外科");
			app.tabNames.add("中医外伤");
			app.tabNames.add("西药处方");
			app.tabNames.add("编辑页");
			app.tabNames.add("哈里森大内科");

			app.jsp_name= new JScrollPane(app.name());
			app.jsp_name.setBounds(10+50, 6, 580- 300, 50);

			comp.detaButton.DetaButton jlabel_button= new comp.detaButton.DetaButton("搜:");
			jlabel_button.setBounds(2, 6, 56, 23);
			jlabel_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(null== app.frame) {
						app.appSearch= new AppSearch();
						app.appSearch.init(app.name);
						app.appSearch.setBounds(0, 0, 785, 655);
						app.appSearch.setVisible(true);
						app.appSearch.show();
						app.frame= new JFrame("电子护理站 V1.1.0");
						//frame.setLayout(null);
						app.frame.setSize(780, 650);
						app.frame.setLocation(300, 300);
						app.frame.setResizable(false);
						app.frame.add(app.appSearch);
						app.frame.setVisible(true);
						app.frame.show();
						app.frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}else {
						app.frame.setVisible(true);
						app.frame.show();
					}
				}
			});

			comp.detaButton.DetaButton yin_button= new comp.detaButton.DetaButton("音:");
			yin_button.setBounds(2, 33, 56, 23);
			yin_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						app.name.setText(new ReadToWav().listen());
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
			jsp_name_filter= new JScrollPane(app.name_filter());
			jsp_name_filter.setBounds(60+15+30+580+ 100+ 40, 8, 580- 455, 22);	

			JLabel jlabel_filter_not_have= new JLabel("有关经络:");  
			jlabel_filter_not_have.setForeground(Color.WHITE); 
			jlabel_filter_not_have.setBounds(50+15+7+485+7, 20, 100, 50);

			JScrollPane jsp_name_filter_not_have= null;
			jsp_name_filter_not_have= new JScrollPane(app.name_filter_not_have());
			jsp_name_filter_not_have.setBounds(50+15+7+485+7+20+ 40, 6+28, 580- 459, 22);

			JLabel risk_filter= new JLabel("风险过滤:");  
			risk_filter.setForeground(Color.WHITE);
			risk_filter.setBounds(10+ 350, 6, 100, 25);

			JLabel feel_filter= new JLabel("无关性味:"); 
			feel_filter.setForeground(Color.WHITE);
			feel_filter.setBounds(60+15+7+585+ 100, 20, 100, 50);

			JScrollPane jsp_name_feel_filter= null;
			jsp_name_feel_filter= new JScrollPane(app.name_feel_filter());
			jsp_name_feel_filter.setBounds(60+15+30+580+ 100+ 40, 6+28, 580- 455, 22);


			JLabel jingmai_filter= new JLabel("线性观测:");  
			jingmai_filter.setForeground(Color.WHITE);
			jingmai_filter.setBounds(10+350, 21, 100, 50);


			app.look = new DetaSlider(0, 20);
			app.look.setSnapToTicks(true);
			app.look.setPaintTicks(true);
			app.look.setMajorTickSpacing(5);
			app.look.setMinorTickSpacing(1);
			app.look.setValue(0);
			app.look.addChangeListener(
					new ChangeListener(){
						public void stateChanged(ChangeEvent event){
							JSlider source = (JSlider) event.getSource();
							app.lookrot = source.getValue();
							app.appInstance.keyReleased(null);	
						}
					});
			app.look.setBounds(10+350+60, 36, 135, 20);

			JLabel xingwei_filter= new JLabel("功效过滤:");  
			xingwei_filter.setForeground(Color.WHITE); 
			xingwei_filter.setBounds(60+15+7+585, -6, 100, 50);

			JLabel zonghe_filter= new JLabel("配伍过滤:");  
			zonghe_filter.setForeground(Color.WHITE); 
			zonghe_filter.setBounds(50+15+7+485+7, -6, 100, 50);

			JLabel shuming_filter= new JLabel("术名过滤:");  
			shuming_filter.setForeground(Color.WHITE); 
			shuming_filter.setBounds(1+350+100+10, -6, 100, 50);

			app.zonghe_filter_box= new JCheckBox();
			app.zonghe_filter_box.setBounds(50+15+7+485+60+7, 8, 20, 20);
			app.zonghe_filter_box.setBackground(Color.ORANGE);

			app.zonghe_filter_box.addActionListener(app);

			app.shuming_filter_box= new JCheckBox();
			app.shuming_filter_box.setBounds(1+350+100+60+10, 8, 20, 20);
			app.shuming_filter_box.setBackground(Color.GREEN);

			app.jingmai_filter_box= new JCheckBox();
			app.jingmai_filter_box.setBounds(60+ 15+ 30+ 580+ 40, 8, 20, 20);
			app.jingmai_filter_box.setBackground(Color.BLUE);

			app.feel_filter_box= new JCheckBox();
			app.feel_filter_box.setBounds(60+15+30+580+40, 8, 20, 20);
			app.feel_filter_box.setBackground(Color.MAGENTA);

			app.risk_filter_box= new JCheckBox();
			app.risk_filter_box.setBounds(10+350+60, 8, 20, 20);
			app.risk_filter_box.setBackground(Color.RED);

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
						preAdd+= "证候名："+ (null==app.zyzdx.table.getValueAt(i, 2)?"":app.zyzdx.table.getValueAt(i, 2).toString())
								//	+ "证候内容："+	(null==zyzdx.table.getValueAt(i, 5)?"":zyzdx.table.getValueAt(i, 5).toString())
								+ "可能性："+	(null==app.zyzdx.table.getValueAt(i, 1)?"":app.zyzdx.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "内科诊断：\r\n\r\n";
					//内科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候名："+ (null==app.xynk.table.getValueAt(i, 2)?"":app.xynk.table.getValueAt(i, 2).toString())
								//	+ "证候意义："+	(null==xynk.table.getValueAt(i, 9)?"":xynk.table.getValueAt(i, 9).toString())
								+ "可能性："+	(null==app.xynk.table.getValueAt(i, 1)?"":app.xynk.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "西医诊断：\r\n\r\n";
					//西医急诊：
					for(int i=0;i<5;i++) {
						preAdd+= "证候名："+ (null==app.jzkx.table.getValueAt(i, 2)?"":app.jzkx.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==app.jzkx.table.getValueAt(i, 1)?"":app.jzkx.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "外科诊断：\r\n\r\n";
					//外科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==app.wkx.table.getValueAt(i, 2)?"":app.wkx.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==app.wkx.table.getValueAt(i, 1)?"":app.wkx.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					preAdd+= "小专科系统组合诊断（可选）：";
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					preAdd+= "妇幼诊断：\r\n\r\n";
					//妇幼分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==app.fckx.table.getValueAt(i, 2)?"":app.fckx.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==app.fckx.table.getValueAt(i, 1)?"":app.fckx.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}

					preAdd+= "伤科：\r\n\r\n";
					//伤科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==app.wskx.table.getValueAt(i, 2)?"":app.wskx.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==app.wskx.table.getValueAt(i, 1)?"":app.wskx.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}

					String xiYaoTuiJian="";
					xiYaoTuiJian+= "*************************\r\n\r\n";
					xiYaoTuiJian+= "中西医结合用药打分排序（可选）：";
					xiYaoTuiJian+= "\r\n\r\n *************************\r\n\r\n";
					xiYaoTuiJian+= "西药推荐：\r\n\r\n";
					//分析：
					for(int i=0;i<20;i++) {
						xiYaoTuiJian+= "推荐名："+ (null==app.xysc.table.getValueAt(i, 2)?"":app.xysc.table.getValueAt(i, 2).toString())
								+ "适应内容："+	(null==app.xysc.table.getValueAt(i, 8)?"":app.xysc.table.getValueAt(i, 8).toString())
								+ "可能性："+	(null==app.xysc.table.getValueAt(i, 1)?"":app.xysc.table.getValueAt(i, 1).toString());
						xiYaoTuiJian+= "\r\n\r\n";
					}
					preAdd+= xiYaoTuiJian;
					preAdd+= "方剂推荐：\r\n\r\n";
					//方剂分析：
					for(int i=0;i<5;i++) {
						preAdd+= "推荐名："+ (null==app.zynkx.table.getValueAt(i, 2)?"":app.zynkx.table.getValueAt(i, 2).toString())
								+ "推荐内容："+(null==app.zynkx.table.getValueAt(i, 4)?"":app.zynkx.table.getValueAt(i, 4).toString())
								+ "可能性："+	(null==app.zynkx.table.getValueAt(i, 1)?"":app.zynkx.table.getValueAt(i, 1).toString());
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
					for(int r= 0; r< (app.newTableModel.getRowCount()< 30? app.newTableModel.getRowCount(): 30); r++) {
						if(app.newTableModel.getValueAt(r, 2)!= null&& !app.newTableModel.getValueAt(r, 2).toString().isEmpty()) {
							zhongYaoTuiJian+= app.newTableModel.getValueAt(r, 2);
						}
						zhongYaoTuiJian+= "/";
						if(app.newTableModel.getValueAt(r, 6)!= null&&!app.newTableModel.getValueAt(r, 6).toString().isEmpty()) {
							String temp= app.newTableModel.getValueAt(r, 6).toString();
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
					if(app.text.getText().length()< 8000) {
						if(preAdd.length()< 8000) {
							if(!app.text.getText().isEmpty()) {
								app.text.setText(preAdd+ "\r\n\r\n"+ app.text.getText());
							}else {
								app.text.setText(preAdd);
							}
						}
					}else {
						app.text.setText(preAdd);
					}
					app.text.validate();

					if(app.jText.getText().length()< 8000) {
						if(zhongYaoTuiJian.length()< 8000) {
							if(!app.jText.getText().isEmpty()) {
								app.jText.setText(zhongYaoTuiJian+ "\r\n\r\n"+ app.jText.getText());
							}else {
								app.jText.setText(zhongYaoTuiJian);
							}
						}
					}else {
						app.jText.setText(zhongYaoTuiJian);
					}
					app.jText.validate();

					if(app.jxText.getText().length()< 8000) {
						if(xiYaoTuiJian.length()< 8000) {
							if(!app.jxText.getText().isEmpty()) {
								app.jxText.setText(xiYaoTuiJian+ "\r\n\r\n"+ app.jxText.getText());
							}else {
								app.jxText.setText(xiYaoTuiJian);
							}
						}
					}else {
						app.jxText.setText(xiYaoTuiJian);
					}
					app.jxText.validate();


					if(null== app.frameHospital) {
						app.appHospital= new AppHospital();
						app.appHospital.init(app.jText, app.appInstance);
						app.appHospital.setBounds(0, 0, 1145, 455);
						app.appHospital.setVisible(true);
						app.appHospital.show();
						app.frameHospital= new JFrame("电子医院诊断推荐报告 V0.0.3");
						//frame.setLayout(null);
						app.frameHospital.setSize(1140, 650);
						app.frameHospital.setLocation(300, 300);
						app.frameHospital.setResizable(false);
						app.frameHospital.add(app.appHospital);
						app.frameHospital.setVisible(true);
						app.frameHospital.show();
						app.frameHospital.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}else {						
						app.appHospital= new AppHospital();
						app.appHospital.init(app.jText, app.appInstance);
						app.appHospital.setBounds(0, 0, 1145, 455);
						app.appHospital.setVisible(true);
						app.appHospital.show();
						app.frameHospital= new JFrame("电子医院诊断推荐报告 V0.0.3");
						//frame.setLayout(null);
						app.frameHospital.setSize(1140, 650);
						app.frameHospital.setLocation(300, 300);
						app.frameHospital.setResizable(false);
						app.frameHospital.add(app.appHospital);
						app.frameHospital.setVisible(true);
						app.frameHospital.show();
						app.frameHospital.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}
					app.jText.validate();

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
						app.jTabbedpane.validate();
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
						app.jTabbedpane.validate();
					}
				}
			});	
			JPanel jp= new JPanel();
			jp.setLayout(null);
			jp.setBounds(0, 0, 1470, 980-50+ app.rangeHigh);
			jp.setBackground(Color.BLACK);
			jp.add(addChuFang);
			jp.add(button2);
			//jp.add(button3);
			//jp.add(button4);
			jp.add(button5);
			jp.add(jlabel_button);
			jp.add(yin_button);
			jp.add(app.jsp_name);
			jp.add(jsp_name_filter);
			jp.add(jlabel_filter);
			jp.add(jsp_name_filter_not_have);
			jp.add(jlabel_filter_not_have);
			jp.add(app.jTabbedpane);
			jp.add(risk_filter);
			jp.add(feel_filter);
			jp.add(xingwei_filter);
			jp.add(app.risk_filter_box);
			jp.add(app.look);
			jp.add(jsp_name_feel_filter);
			jp.add(jingmai_filter);
			jp.add(app.feel_filter_box);
			//jp.add(jingmai_filter_box);
			jp.add(zonghe_filter);
			jp.add(shuming_filter);
			jp.add(app.zonghe_filter_box);
			jp.add(app.shuming_filter_box);
			jp.setPreferredSize(new Dimension(1330, 730+ 40+ app.rangeHigh));
			JScrollPane js= new JScrollPane(jp);
			js.setBounds(0, 0, 1335, 730+ 50+ app.rangeHigh);	
			app.setLayout(null);  
			app.getContentPane().add(js);
			js.setViewportView(jp);
			app.setBounds(0, 0, 1345, 770+ 25+ app.rangeHigh);
			app.setVisible(true);
			Container jpanelFirst= new Container();
			MakeContainer_ZHONG_YAO c1= null;
			c1= new MakeContainer_ZHONG_YAO(app.analyzer, jpanelFirst, app, app.tabNames, app.pos, app.jTabbedpane);
			c1.start();
			app.jTabbedpane.addTab(app.tabNames.get(0), new ImageIcon(), jpanelFirst, "first");
			app.jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
			app.jTabbedpane.setBackgroundAt(0, new Color(253, 233, 254));
			app.jTabbedpane.addChangeListener(app);
			Thread.sleep(300);
			app.mouseClicked(null);

			if(app.appConfig.SectionJPanel.jlabel_peizhi_di2511.isSelected()) {
				//front
				new BootVPCSFrontEnd().start();
				Thread.sleep(5);
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----载入德塔 前端服务器 完毕！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				//backend
				new BootVPCSBackEnd().start();
				Thread.sleep(6);
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----载入德塔 后端服务器 完毕！"+ text;
					text="\r\n"+ "..."+ text;
					text="\r\n"+ "----载入德塔 数据分析引擎 完毕！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[1]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入数据分析页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanelSecond= new Container();  
				MakeContainerSJFX c2= new MakeContainerSJFX(app.tableData_old, app.text, app.analyzer,jpanelSecond, app
						,app.jTabbedpane,app.tabNames, app.pos, app.pose, app.etc, app.cte);
				c2.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[2]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入智能相诊页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanelThird= new Container();  
				MakeContainerZNXZ c3= new MakeContainerZNXZ(app.analyzer,jpanelThird, app,app.jTabbedpane
						, app.tabNames, app.pos, app.pose, app.etc, app.cte);
				c3.start();
				Thread.sleep(300);
			}

//			if(app.appConfig.SectionJPanel.tabNamesHook[3]) {
//				if(app.appConfig.SectionJPanel.jTextPane!= null) {
//					String text= app.appConfig.SectionJPanel.jTextPane.getText();
//					text="\r\n"+ "----正在载入智能声诊页面！"+ text;
//					text="\r\n"+ "..."+ text;
//					app.appConfig.SectionJPanel.jTextPane.setText(text);
//				}
//				Container jpanelFourth= new Container();
//				app.MakeContainerZNSZ c4= new MakeContainerZNSZ(app.analyzer, jpanelFourth, app,app.jTabbedpane, app.tabNames, app.pos, app.pose, app.etc, app.cte);
//				c4.start();
//				Thread.sleep(300);
//			}

			if(app.appConfig.SectionJPanel.tabNamesHook[4]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入奇门遁甲页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanel5= new Container();  
				MakeContainerQMDJ c5=new MakeContainerQMDJ(app.analyzer,jpanel5, app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				c5.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[5]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入西医内科页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYNK c6=new MakeContainerXYNK(app.analyzer,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				c6.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[6]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入中医方剂页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYNKFJ c7=new MakeContainerZYNKFJ(app.analyzer,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				c7.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[7]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入中医诊断页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYZD c8=new MakeContainerZYZD(app.analyzer,app,app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				c8.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[8]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入古籍经典页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerGJJD c9=new MakeContainerGJJD(app.analyzer,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				c9.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[9]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入中医妇产页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYFC c10=new MakeContainerZYFC(app.analyzer,app,app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				c10.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[10]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 西医妇产 页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXXFC c11=new MakeContainerXXFC(app.analyzer,app, app.jTabbedpane, app.tabNames,  app.pos
						,app.pose, app.etc, app.cte);
				c11.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[11]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 西医急诊 页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYJZ c12=new MakeContainerXYJZ(app.analyzer,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				c12.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[12]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 西医外科 页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYWK c13=new MakeContainerXYWK(app.analyzer,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				c13.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[13]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 中医外伤 页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYWS c14=new MakeContainerZYWS(app.analyzer,app, app.jTabbedpane, app.tabNames,  app.pos
						,app.pose, app.etc, app.cte);
				c14.start();	
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[14]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 西医处方 页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYCF c15=new MakeContainerXYCF(app.analyzer,app, app.jTabbedpane, app.tabNames,  app.pos
						,app.pose, app.etc, app.cte);
				c15.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[15]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text= "\r\n"+ "----正在载入 编辑页 页面！"+ text;
					text= "\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerBJY c16= new MakeContainerBJY(app.analyzer, app, app.jTabbedpane, app.tabNames, app.pos,app.pose,app.etc
						, app.cte, app.pinyin, app.ctj, app.ctt, app.ctk, app.ctr);
				c16.start();	
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[16]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----正在载入 哈里森医典 页面！"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerHLS c17= new MakeContainerHLS(app.analyzer, app, app.jTabbedpane, app.tabNames, app.pos
						, app.pose, app.etc, app.cte, app.posec, app.posFullec);
				c17.start();
			}
			if(app.appConfig.SectionJPanel.jTextPane!= null) {
				String text= app.appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----正常载入完毕 欢迎使用 养疗经 大数据医学辅助，诊疗，电子医院系统！"+ text;
				text="\r\n"+ "----唯一版本号:BFEBFBFF-000906EA-13909532-49137476-6916="+ text;
				text="\r\n"+ "..."+ text;
				app.appConfig.SectionJPanel.jTextPane.setText(text);
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
			app.disableCursor= false;
		} catch (IOException | InterruptedException e4) {
			app.jTabbedpane.validate();
			e4.printStackTrace();
		}
	}
}