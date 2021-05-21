package ME.APM.VSQ.OPE.config;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import ME.APM.VSQ.App;
import MVQ.slider.DetaSlider;

public class SectionJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID= 1L;
	public String[] tabNames= {"中药本草", "数据分析", "智能相诊", "智能声诊",
			"奇门遁甲", "西医内科", "中医方剂诊治", "中医诊断",
			"古籍经典", "中医生殖", "西医妇幼", "西医急诊",
			"大外科", "中医外伤", "西药处方", "编辑页",
			"哈里森大内科","五官科","男科","老年科","传染科","新生儿科",
			"麻醉科","精神科","脑外科","现代护理","核医学","肿瘤科","西医骨伤","遗传学"};
	public JCheckBox jlabel_box[];
	public boolean[] tabNamesHook= new boolean[30];
	public boolean isConfig= true;
	public JCheckBox jlabel_end_boxs;
	public JCheckBox jlabel_end_boxs1;
	public JCheckBox jlabel_end_boxs2;
	public JCheckBox jlabel_end_boxs3;
	public JCheckBox jlabel_peizhi_di25;
	public JTextPane jTextPane;
	public JCheckBox jlabel_peizhi_di2511;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2512;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2513;
//	private JComponent jlabelpeizhi2255;
//	private JComponent jlabelpeizhi2256;
//	private JComponent jlabelpeizhi2257;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2515;
    private JCheckBox jlabel_end_boxs31;
	private App appInThisClass;
	public SectionJPanel(App app){
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		int im= 5;
		int jm= 6;
		for(int i= 0; i< im; i++) {
			for(int j= 0; j< jm; j++) {
				if(i* jm+ j< tabNames.length) {
					JLabel jlabel = new JLabel(tabNames[i* jm+ j]+ ":");  
					jlabel.setForeground(Color.WHITE);
					jlabel.setBounds(10 + i* 150, 20+ 25* j, 100, 50);
					jlabel_box[i* jm+ j]= new JCheckBox();
					jlabel_box[i* jm+ j].setBackground(Color.BLUE);
					jlabel_box[i* jm+ j].setBounds(10+ 85+ i* 150, 33+ 25* j, 20, 20);
					final int reg= i* jm+ j;
					jlabel_box[i* jm+ j].addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent arg0) {
							if(jlabel_box[reg].isSelected()) {
								tabNamesHook[reg]= true;
							}else {
								tabNamesHook[reg]= false;
							}
							
						}
					});
					this.add(jlabel);
					this.add(jlabel_box[i* jm+ j]);	
				}
			}
		}
		
		JLabel jlabel = new JLabel("一键科目全选"+ ":");  
		jlabel.setForeground(Color.RED);
		jlabel.setBounds(10 + 0* 150, 20+ 25* 6, 100, 50);
		JCheckBox jlabel_end_box= new JCheckBox();
		jlabel_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 6, 20, 20);
		jlabel_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						tabNamesHook[i]= true;
						jlabel_box[i].setSelected(true);
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						tabNamesHook[i]= false;
						jlabel_box[i].setSelected(false);
					}
				}
				
			}
		});
		this.add(jlabel);
		this.add(jlabel_end_box);	
		
		JLabel jlabels = new JLabel("无声卡"+ ":");  
		jlabels.setForeground(Color.green);
		jlabels.setBounds(10 + 0* 150, 20+ 25* 7, 100, 50);
		jlabel_end_boxs= new JCheckBox();
		jlabel_end_boxs.setBounds(10+ 85+ 0* 150, 33+ 25* 7, 20, 20);
		jlabel_end_boxs.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_end_boxs.isSelected()) {
					jlabel_end_boxs.setSelected(false);
				}else {
					jlabel_end_boxs.setSelected(true);
				}
			}
		});
		this.add(jlabels);
		this.add(jlabel_end_boxs);	
		
		JLabel jlabels1 = new JLabel("无网卡"+ ":");  
		jlabels1.setForeground(Color.green);
		jlabels1.setBounds(10 + 1* 150, 20+ 25* 7, 100, 50);
		jlabel_end_boxs1= new JCheckBox();
		jlabel_end_boxs1.setBounds(10+ 85+ 1* 150, 33+ 25* 7, 20, 20);
		jlabel_end_boxs1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_end_boxs1.isSelected()) {
					jlabel_end_boxs1.setSelected(false);
				}else {
					jlabel_end_boxs1.setSelected(true);
				}
			}
		});
		this.add(jlabels1);
		this.add(jlabel_end_boxs1);	
		
		JLabel jlabels2 = new JLabel("无蓝牙"+ ":");  
		jlabels2.setForeground(Color.green);
		jlabels2.setBounds(10 + 2* 150, 20+ 25* 7, 100, 50);
		jlabel_end_boxs2= new JCheckBox();
		jlabel_end_boxs2.setBounds(10+ 85+ 2* 150, 33+ 25* 7, 20, 20);
		jlabel_end_boxs2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_end_boxs2.isSelected()) {
					jlabel_end_boxs2.setSelected(false);
				}else {
					jlabel_end_boxs2.setSelected(true);
				}
			}
		});
		this.add(jlabels2);
		this.add(jlabel_end_boxs2);	
		
		JLabel jlabels3= new JLabel("GPU加速"+ ":");  
		jlabels3.setForeground(Color.green);
		jlabels3.setBounds(10+ 3* 150, 20+ 25* 7, 100, 50);
		jlabel_end_boxs3= new JCheckBox();
		jlabel_end_boxs3.setBounds(10+ 85+ 3* 150, 33+ 25* 7, 20, 20);
		jlabel_end_boxs3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!jlabel_end_boxs3.isSelected()) {
					jlabel_end_boxs3.setSelected(true);
				}else {
					jlabel_end_boxs3.setSelected(false);
				}
			}
		});
		this.add(jlabels3);
		this.add(jlabel_end_boxs3);	
		
		JLabel jlabels31= new JLabel("无打印机"+ ":");  
		jlabels31.setForeground(Color.green);
		jlabels31.setBounds(10+ 4* 150, 20+ 25* 7, 100, 50);
		jlabel_end_boxs31= new JCheckBox();
		jlabel_end_boxs31.setBounds(10+ 85+ 4* 150, 33+ 25* 7, 20, 20);
		jlabel_end_boxs31.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!jlabel_end_boxs31.isSelected()) {
					jlabel_end_boxs31.setSelected(true);
				}else {
					jlabel_end_boxs31.setSelected(false);
				}
			}
		});
		this.add(jlabels31);
		this.add(jlabel_end_boxs31);	
		
		JLabel jlabelpeizhi = new JLabel("配置机型4G RAM, 30GB disk, 1200* 768 windows"+ ":");  
		jlabelpeizhi.setForeground(Color.magenta);
		jlabelpeizhi.setBounds(10 + 0* 150, 20+ 25* 8, 300, 50);
		JCheckBox jlabel_peizhi_di= new JCheckBox();
		jlabel_peizhi_di.setBounds(10+ 85+ 0* 150+ 250, 33+ 25* 8, 20, 20);
		jlabel_peizhi_di.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi);
		this.add(jlabel_peizhi_di);	
		
		JLabel jlabelpeizhi1 = new JLabel("配置机型8G RAM, 60GB disk, 1520* 1024 windows"+ ":");  
		jlabelpeizhi1.setForeground(Color.magenta);
		jlabelpeizhi1.setBounds(10 + 0* 150, 20+ 25* 9, 300, 50);
		JCheckBox jlabel_peizhi_di1= new JCheckBox();
		jlabel_peizhi_di1.setBounds(10+ 85+ 0* 150+ 250, 33+ 25* 9, 20, 20);
		jlabel_peizhi_di1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi1);
		this.add(jlabel_peizhi_di1);	
		
		JLabel jlabelpeizhi2= new JLabel("配置机型16G RAM, 100GB disk, 1920* 1360 windows"+ ":");  
		jlabelpeizhi2.setForeground(Color.magenta);
		jlabelpeizhi2.setBounds(10+ 0* 150, 20+ 25* 10, 300, 50);
		JCheckBox jlabel_peizhi_di2= new JCheckBox();
		jlabel_peizhi_di2.setBounds(10+ 85+ 0* 150+ 250, 33+ 25* 10, 20, 20);
		jlabel_peizhi_di2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi2);
		this.add(jlabel_peizhi_di2);	
		
		JLabel jlabelpeizhi21 = new JLabel("智慧搜索"+ ":");  
		jlabelpeizhi21.setForeground(Color.ORANGE);
		jlabelpeizhi21.setBounds(10 + 0* 150, 20+ 25* 11, 300, 50);
		JCheckBox jlabel_peizhi_di21= new JCheckBox();
		jlabel_peizhi_di21.setBounds(10+ 85+ 0* 150, 33+ 25* 11, 20, 20);
		jlabel_peizhi_di21.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi21);
		this.add(jlabel_peizhi_di21);	
		
		JLabel jlabelpeizhi2122= new JLabel("DNN搜索"+ ":");  
		jlabelpeizhi2122.setForeground(Color.ORANGE);
		jlabelpeizhi2122.setBounds(10 + 1* 150, 20+ 25* 11, 300, 50);
		JCheckBox jlabel_peizhi_di2122= new JCheckBox();
		jlabel_peizhi_di2122.setBounds(10+ 85+ 1* 150, 33+ 25* 11, 20, 20);
		jlabel_peizhi_di2122.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi2122);
		this.add(jlabel_peizhi_di2122);	
		
		JLabel jlabelpeizhi2123= new JLabel("神经网络搜索"+ ":");  
		jlabelpeizhi2123.setForeground(Color.ORANGE);
		jlabelpeizhi2123.setBounds(10 + 2* 150, 20+ 25* 11, 300, 50);
		JCheckBox jlabel_peizhi_di2123= new JCheckBox();
		jlabel_peizhi_di2123.setBounds(10+ 85+ 2* 150, 33+ 25* 11, 20, 20);
		jlabel_peizhi_di2123.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi2123);
		this.add(jlabel_peizhi_di2123);	
		
		JLabel jlabelpeizhi21231= new JLabel("DNA搜索"+ ":");  
		jlabelpeizhi21231.setForeground(Color.ORANGE);
		jlabelpeizhi21231.setBounds(10 + 3* 150, 20+ 25* 11, 300, 50);
		JCheckBox jlabel_peizhi_di21231= new JCheckBox();
		jlabel_peizhi_di21231.setBounds(10+ 85+ 3* 150, 33+ 25* 11, 20, 20);
		jlabel_peizhi_di21231.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(appInThisClass.DNASearchIsClick) {
					appInThisClass.DNASearchIsClick= false;	
				}else {
					appInThisClass.DNASearchIsClick= true;
				}
			}
		});
		this.add(jlabelpeizhi21231);
		this.add(jlabel_peizhi_di21231);
		
		//dna催化
		JLabel jlabelpeizhi2123111= new JLabel("DNA催化计算"+ ":");  
		jlabelpeizhi2123111.setForeground(Color.ORANGE);
		jlabelpeizhi2123111.setBounds(10+ 3* 150, 20+ 25* 12, 300, 50);		
		DetaSlider 催化比值= new DetaSlider(0, 100);
		催化比值.setSnapToTicks(true);
		催化比值.setPaintTicks(true);
		催化比值.setMajorTickSpacing(5);
		催化比值.setMinorTickSpacing(5);
		催化比值.setValue(49);
		催化比值.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent event){
						JSlider source= (JSlider) event.getSource();
						appInThisClass.催化比值rot= source.getValue();
						appInThisClass.keyReleased(null);	
					}
				});
		催化比值.setBounds(10+ 85+ 3* 150, 33+ 25* 12, 170, 20);
		
		this.add(jlabelpeizhi2123111);
		this.add(催化比值);	
		
		
		JLabel jlabelpeizhi212311= new JLabel("DNA加密"+ ":");  
		jlabelpeizhi212311.setForeground(Color.ORANGE);
		jlabelpeizhi212311.setBounds(10 + 4* 150, 20+ 25* 11, 300, 50);
		JCheckBox jlabel_peizhi_di212311= new JCheckBox();
		jlabel_peizhi_di212311.setBounds(10+ 85+ 4* 150, 33+ 25* 11, 20, 20);
		jlabel_peizhi_di212311.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi212311);
		this.add(jlabel_peizhi_di212311);	
		
		
		JLabel jlabelpeizhi22 = new JLabel("智慧阅读"+ ":");  
		jlabelpeizhi22.setForeground(Color.ORANGE);
		jlabelpeizhi22.setBounds(10 + 0* 150, 20+ 25* 12, 300, 50);
		JCheckBox jlabel_peizhi_di22= new JCheckBox();
		jlabel_peizhi_di22.setBounds(10+ 85+ 0* 150, 33+ 25* 12, 20, 20);
		jlabel_peizhi_di22.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi22);
		this.add(jlabel_peizhi_di22);	
		
		JLabel jlabelpeizhi2233 = new JLabel("文学性"+ ":");  
		jlabelpeizhi2233.setForeground(Color.ORANGE);
		jlabelpeizhi2233.setBounds(10 + 1* 150, 20+ 25* 12, 300, 50);
		JCheckBox jlabel_peizhi_di2233= new JCheckBox();
		jlabel_peizhi_di2233.setBounds(10+ 85+ 1* 150, 33+ 25* 12, 20, 20);
		jlabel_peizhi_di2233.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi2233);
		this.add(jlabel_peizhi_di2233);	
		
		
		JLabel jlabelpeizhi22331 = new JLabel("数理统计"+ ":");  
		jlabelpeizhi22331.setForeground(Color.ORANGE);
		jlabelpeizhi22331.setBounds(10 + 2* 150, 20+ 25* 12, 300, 50);
		JCheckBox jlabel_peizhi_di22331= new JCheckBox();
		jlabel_peizhi_di22331.setBounds(10+ 85+ 2* 150, 33+ 25* 12, 20, 20);
		jlabel_peizhi_di22331.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi22331);
		this.add(jlabel_peizhi_di22331);	
		
		
		
		JLabel jlabelpeizhi23 = new JLabel("智慧大脑"+ ":");  
		jlabelpeizhi23.setForeground(Color.ORANGE);
		jlabelpeizhi23.setBounds(10 + 0* 150, 20+ 25* 13, 300, 50);
		JCheckBox jlabel_peizhi_di23= new JCheckBox();
		jlabel_peizhi_di23.setBounds(10+ 85+ 0* 150, 33+ 25* 13, 20, 20);
		jlabel_peizhi_di23.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi23);
		this.add(jlabel_peizhi_di23);	
		
		
		JLabel jlabelpeizhi23D = new JLabel("DNA编码索引"+ ":");  
		jlabelpeizhi23D.setForeground(Color.ORANGE);
		jlabelpeizhi23D.setBounds(10 + 1* 150, 20+ 25* 13, 300, 50);
		JCheckBox jlabel_peizhi_di23D= new JCheckBox();
		jlabel_peizhi_di23D.setBounds(10+ 85+ 1* 150, 33+ 25* 13, 20, 20);
		jlabel_peizhi_di23D.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi23D);
		this.add(jlabel_peizhi_di23D);	
		
		JLabel jlabelpeizhi23D1 = new JLabel("类人认知执行"+ ":");  
		jlabelpeizhi23D1.setForeground(Color.ORANGE);
		jlabelpeizhi23D1.setBounds(10 + 2* 150, 20+ 25* 13, 300, 50);
		JCheckBox jlabel_peizhi_di23D1= new JCheckBox();
		jlabel_peizhi_di23D1.setBounds(10+ 85+ 2* 150, 33+ 25* 13, 20, 20);
		jlabel_peizhi_di23D1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi23D1);
		this.add(jlabel_peizhi_di23D1);	
		
		
		JLabel jlabelpeizhi23D12 = new JLabel("肽展计算"+ ":");  
		jlabelpeizhi23D12.setForeground(Color.ORANGE);
		jlabelpeizhi23D12.setBounds(10 + 3* 150, 20+ 25* 13, 300, 50);
		JCheckBox jlabel_peizhi_di23D12= new JCheckBox();
		jlabel_peizhi_di23D12.setBounds(10+ 85+ 3* 150, 33+ 25* 13, 20, 20);
		jlabel_peizhi_di23D12.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi23D12);
		this.add(jlabel_peizhi_di23D12);
		
		JLabel jlabelpeizhi23D1277 = new JLabel("元基筛选"+ ":");  
		jlabelpeizhi23D1277.setForeground(Color.ORANGE);
		jlabelpeizhi23D1277.setBounds(10 + 3* 150, 20+ 25* 14, 300, 50);
		JCheckBox jlabel_peizhi_di23D1277= new JCheckBox();
		jlabel_peizhi_di23D1277.setBounds(10+ 85+ 3* 150, 33+ 25* 14, 20, 20);
		jlabel_peizhi_di23D1277.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi23D1277);
		this.add(jlabel_peizhi_di23D1277);
		
		
		JLabel jlabelpeizhi23D123 = new JLabel("TVM识别"+ ":");  
		jlabelpeizhi23D123.setForeground(Color.ORANGE);
		jlabelpeizhi23D123.setBounds(10 + 4* 150, 20+ 25* 13, 300, 50);
		JCheckBox jlabel_peizhi_di23D123= new JCheckBox();
		jlabel_peizhi_di23D123.setBounds(10+ 85+ 4* 150, 33+ 25* 13, 20, 20);
		jlabel_peizhi_di23D123.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi23D123);
		this.add(jlabel_peizhi_di23D123);	
		
		JLabel jlabelpeizhi23D12377 = new JLabel("元基索引"+ ":");  
		jlabelpeizhi23D12377.setForeground(Color.ORANGE);
		jlabelpeizhi23D12377.setBounds(10 + 4* 150, 20+ 25* 14, 300, 50);
		JCheckBox jlabel_peizhi_di23D12377= new JCheckBox();
		jlabel_peizhi_di23D12377.setBounds(10+ 85+ 4* 150, 33+ 25* 14, 20, 20);
		jlabel_peizhi_di23D12377.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi23D12377);
		this.add(jlabel_peizhi_di23D12377);	
		
		
		JLabel jlabelpeizhi2355 = new JLabel("德塔混合分词"+ ":");  
		jlabelpeizhi2355.setForeground(Color.ORANGE);
		jlabelpeizhi2355.setBounds(10 + 0* 150, 20+ 25* 14, 300, 50);
		JCheckBox jlabel_peizhi_di2355= new JCheckBox();
		jlabel_peizhi_di2355.setBounds(10+ 85+ 0* 150, 33+ 25* 14, 20, 20);
		jlabel_peizhi_di2355.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi2355);
		this.add(jlabel_peizhi_di2355);	
		
		JLabel jlabelpeizhi2356 = new JLabel("德塔象契排序"+ ":");  
		jlabelpeizhi2356.setForeground(Color.ORANGE);
		jlabelpeizhi2356.setBounds(10 + 1* 150, 20+ 25* 14, 300, 50);
		JCheckBox jlabel_peizhi_di2356= new JCheckBox();
		jlabel_peizhi_di2356.setBounds(10+ 85+ 1* 150, 33+ 25* 14, 20, 20);
		jlabel_peizhi_di2356.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi2356);
		this.add(jlabel_peizhi_di2356);	
		
		JLabel jlabelpeizhi2357= new JLabel("拼音笔划索引"+ ":");  
		jlabelpeizhi2357.setForeground(Color.ORANGE);
		jlabelpeizhi2357.setBounds(10 + 2* 150, 20+ 25* 14, 300, 50);
		JCheckBox jlabel_peizhi_di2357= new JCheckBox();
		jlabel_peizhi_di2357.setBounds(10+ 85+ 2* 150, 33+ 25* 14, 20, 20);
		jlabel_peizhi_di2357.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi2357);
		this.add(jlabel_peizhi_di2357);	
		
		
		JLabel jlabelpeizhi2511= new JLabel("德塔云"+ ":");  
		jlabel_peizhi_di2511= new JCheckBox();
		jlabelpeizhi2511.setForeground(Color.ORANGE);
		jlabelpeizhi2511.setBounds(10+ 0* 150, 20+ 25* 15, 300, 50);
		jlabel_peizhi_di2511.setBounds(10+ 85+ 0* 150, 33+ 25* 15, 20, 20);
		jlabel_peizhi_di2511.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_peizhi_di2511.isSelected()) {
					jlabel_peizhi_di2511.setSelected(true);
				}else {
					jlabel_peizhi_di2511.setSelected(false);
				}
			}
		});
		this.add(jlabelpeizhi2511);
		this.add(jlabel_peizhi_di2511);	
		
		JLabel jlabelpeizhi24 = new JLabel("德塔前端"+ ":");  
		jlabelpeizhi24.setForeground(Color.ORANGE);
		jlabelpeizhi24.setBounds(10+ 1* 150, 20+ 25* 15, 300, 50);
		JCheckBox jlabel_peizhi_di24= new JCheckBox();
		jlabel_peizhi_di24.setBounds(10+ 85+ 1* 150, 33+ 25* 15, 20, 20);
		jlabel_peizhi_di24.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.add(jlabelpeizhi24);
		this.add(jlabel_peizhi_di24);	
		
		JLabel jlabelpeizhi2512= new JLabel("德塔后端"+ ":");  
		jlabelpeizhi2512.setForeground(Color.ORANGE);
		jlabelpeizhi2512.setBounds(10+ 2* 150, 20+ 25* 15, 300, 50);
		JCheckBox jlabel_peizhi_di2512= new JCheckBox();
		jlabel_peizhi_di2512.setBounds(10+ 85+ 2* 150, 33+ 25* 15, 20, 20);
		jlabel_peizhi_di2512.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_peizhi_di2512.isSelected()) {
					jlabel_peizhi_di2512.setSelected(true);
				}else {
					jlabel_peizhi_di2512.setSelected(false);
				}
			}
		});
		this.add(jlabelpeizhi2512);
		this.add(jlabel_peizhi_di2512);	
		
		JLabel jlabelpeizhi2513= new JLabel("德塔数据库"+ ":");  
		//jlabel_peizhi_di2513= new JCheckBox();
		jlabelpeizhi2513.setForeground(Color.ORANGE);
		jlabelpeizhi2513.setBounds(10+ 3* 150, 20+ 25* 15, 300, 50);
		JCheckBox jlabel_peizhi_di2513= new JCheckBox();
		jlabel_peizhi_di2513.setBounds(10+ 85+ 3* 150, 33+ 25* 15, 20, 20);
		jlabel_peizhi_di2513.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_peizhi_di2513.isSelected()) {
					jlabel_peizhi_di2513.setSelected(true);
				}else {
					jlabel_peizhi_di2513.setSelected(false);
				}
			}
		});
		this.add(jlabelpeizhi2513);
		this.add(jlabel_peizhi_di2513);	
		
		JLabel jlabelpeizhi2515= new JLabel("德塔缓存"+ ":");  
		//jlabel_peizhi_di2515= new JCheckBox();
		jlabelpeizhi2515.setForeground(Color.ORANGE);
		jlabelpeizhi2515.setBounds(10+ 4* 150, 20+ 25* 15, 300, 50);
		JCheckBox jlabel_peizhi_di2515= new JCheckBox();
		jlabel_peizhi_di2515.setBounds(10+ 85+ 4* 150, 33+ 25* 15, 20, 20);
		jlabel_peizhi_di2515.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_peizhi_di2515.isSelected()) {
					jlabel_peizhi_di2515.setSelected(true);
				}else {
					jlabel_peizhi_di2515.setSelected(false);
				}
			}
		});
		this.add(jlabelpeizhi2515);
		this.add(jlabel_peizhi_di2515);	
		
		MVQ.button.DetaButton jlabel_button= new MVQ.button.DetaButton("添加完毕:");
		jlabel_button.setBounds(10, 460, 100, 30);
		jlabel_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabNamesHook[0]= true;
				isConfig= false;
			}
		});
		this.add(jlabel_button);
		
		MVQ.button.DetaButton jlabel_flush_button= new MVQ.button.DetaButton("异常刷新:");
		jlabel_flush_button.setBounds(10+100+30, 460, 100, 30);
		jlabel_flush_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
				}
			}
		});
		this.add(jlabel_flush_button);
		
		jTextPane= new JTextPane();
		JScrollPane jsp_jTextPane= new JScrollPane(jTextPane);
		jsp_jTextPane.setBounds(10 + 0* 150, 20+ 25* 15+ 120, 765, 150);
		this.add(jsp_jTextPane);
		jTextPane.setText("正在载入 养疗经 1.8.5.0.0 系统(8.5.1.0) . . .");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}