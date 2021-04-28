package OPM.ESU.admin;
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

public class PLSQLSectionPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

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
	public PLSQLSectionPanel(App app){
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		JLabel jlabel= new JLabel("读取数据库"+ ":");  
		jlabel.setForeground(Color.white);
		jlabel.setBounds(10+ 0* 150, 20+ 25* 0, 100, 50);
		JCheckBox jlabel_end_box= new JCheckBox();
		jlabel_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 0, 20, 20);
		jlabel_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {

					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {

					}
				}
				
			}
		});
		this.add(jlabel);
		this.add(jlabel_end_box);	
		
		JLabel jlabel1 = new JLabel("读取TXT"+ ":");  
		jlabel1.setForeground(Color.white);
		jlabel1.setBounds(10 + 1* 150, 20+ 25* 0, 100, 50);
		JCheckBox jlabel1_end_box= new JCheckBox();
		jlabel1_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 0, 20, 20);
		jlabel1_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel1_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel1);
		this.add(jlabel1_end_box);	
		
		//有规律的01数字后缀我会稍后归纳优化. 罗瑶光
		JLabel jlabel10 = new JLabel("激活缓存"+ ":");  
		jlabel10.setForeground(Color.white);
		jlabel10.setBounds(10 + 0* 150, 20+ 25* 1, 100, 50);
		JCheckBox jlabel10_end_box= new JCheckBox();
		jlabel10_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 1, 20, 20);
		jlabel10_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel10_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel10);
		this.add(jlabel10_end_box);	
		
		JLabel jlabel11= new JLabel("激活ORM"+ ":");  
		jlabel11.setForeground(Color.white);
		jlabel11.setBounds(10 + 1* 150, 20+ 25* 1, 100, 50);
		JCheckBox jlabel11_end_box= new JCheckBox();
		jlabel11_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 1, 20, 20);
		jlabel11_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel11_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel11);
		this.add(jlabel11_end_box);	
		
		
		JLabel jlabel21 = new JLabel("读写分离模式"+ ":");  
		jlabel21.setForeground(Color.white);
		jlabel21.setBounds(10 + 2* 150, 20+ 25* 0, 100, 50);
		JCheckBox jlabel21_end_box= new JCheckBox();
		jlabel21_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 0, 20, 20);
		jlabel21_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel21_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel21);
		this.add(jlabel21_end_box);	
		
		JLabel jlabel22 = new JLabel("医学表可修改"+ ":");  
		jlabel22.setForeground(Color.white);
		jlabel22.setBounds(10 + 2* 150, 20+ 25* 1, 100, 50);
		JCheckBox jlabel22_end_box= new JCheckBox();
		jlabel22_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 1, 20, 20);
		jlabel22_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel22_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(jlabel22);
		this.add(jlabel22_end_box);	
		
		JLabel jlabel30 = new JLabel("元基解密"+ ":");  
		jlabel30.setForeground(Color.white);
		jlabel30.setBounds(10 + 0* 150, 20+ 25* 2, 100, 50);
		JCheckBox jlabel30_end_box= new JCheckBox();
		jlabel30_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 2, 20, 20);
		jlabel30_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel30_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(jlabel30);
		this.add(jlabel30_end_box);	
		
		JLabel jlabel31= new JLabel("元基加密"+ ":");  
		jlabel31.setForeground(Color.white);
		jlabel31.setBounds(10+ 1* 150, 20+ 25* 2, 100, 50);
		JCheckBox jlabel31_end_box= new JCheckBox();
		jlabel31_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 2, 20, 20);
		jlabel31_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel31_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(jlabel31);
		this.add(jlabel31_end_box);	
		
		JLabel jlabel32= new JLabel("元基计算"+ ":");  
		jlabel32.setForeground(Color.white);
		jlabel32.setBounds(10+ 2* 150, 20+ 25* 2, 100, 50);
		JCheckBox jlabel32_end_box= new JCheckBox();
		jlabel32_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 2, 20, 20);
		jlabel32_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel32_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(jlabel32);
		this.add(jlabel32_end_box);	
		
		//热备模式
		JLabel jlabel40= new JLabel("热备模式"+ ":");  
		jlabel40.setForeground(Color.white);
		jlabel40.setBounds(10+ 0* 150, 20+ 25* 3, 100, 50);
		JCheckBox jlabel40_end_box= new JCheckBox();
		jlabel40_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 3, 20, 20);
		jlabel40_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jlabel40_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(jlabel40);
		this.add(jlabel40_end_box);	
		//binlog
		JLabel Binlog= new JLabel("Binlog"+ ":");  
		Binlog.setForeground(Color.white);
		Binlog.setBounds(10+ 0* 150, 20+ 25* 4, 100, 50);
		JCheckBox Binlog_end_box= new JCheckBox();
		Binlog_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 4, 20, 20);
		Binlog_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Binlog_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Binlog);
		this.add(Binlog_end_box);	
		//rollback模式
		JLabel Rollback= new JLabel("Rollback"+ ":");  
		Rollback.setForeground(Color.white);
		Rollback.setBounds(10+ 0* 150, 20+ 25* 5, 100, 50);
		JCheckBox Rollback_end_box= new JCheckBox();
		Rollback_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 5, 20, 20);
		Rollback_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Rollback_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Rollback);
		this.add(Rollback_end_box);	
		//索引模式
		JLabel 索引模式= new JLabel("索引模式"+ ":");  
		索引模式.setForeground(Color.white);
		索引模式.setBounds(10+ 0* 150, 20+ 25* 6, 100, 50);
		JCheckBox 索引模式_end_box= new JCheckBox();
		索引模式_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 6, 20, 20);
		索引模式_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(索引模式_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(索引模式);
		this.add(索引模式_end_box);	
		//query模式
		JLabel Query模式= new JLabel("Query模式"+ ":");  
		Query模式.setForeground(Color.white);
		Query模式.setBounds(10+ 0* 150, 20+ 25* 7, 100, 50);
		JCheckBox Query模式_end_box= new JCheckBox();
		Query模式_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 7, 20, 20);
		Query模式_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(Query模式_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(Query模式);
		this.add(Query模式_end_box);	
		//异常记录模式
		JLabel 异常记录模式= new JLabel("异常记录模式"+ ":");  
		异常记录模式.setForeground(Color.white);
		异常记录模式.setBounds(10+ 0* 150, 20+ 25* 8, 100, 50);
		JCheckBox 异常记录模式_end_box= new JCheckBox();
		异常记录模式_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 8, 20, 20);
		异常记录模式_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(异常记录模式_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(异常记录模式);
		this.add(异常记录模式_end_box);	
		//无锁模式
		
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