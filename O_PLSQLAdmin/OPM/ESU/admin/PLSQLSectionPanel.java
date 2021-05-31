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
import javax.swing.JTextField;
import javax.swing.JTextPane;

import ME.APM.VSQ.App;

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
	@SuppressWarnings("unused")
	private App appInThisClass;
	public PLSQLSectionPanel(App app){
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		JLabel 读取数据库= new JLabel("读取数据库"+ ":");  
		读取数据库.setForeground(Color.white);
		读取数据库.setBounds(10+ 0* 150, 20+ 25* 0, 100, 50);
		JCheckBox 读取数据库_end_box= new JCheckBox();
		读取数据库_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 0, 20, 20);
		读取数据库_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(读取数据库_end_box.isSelected()) {
					appInThisClass.bootDBInBaseWay= true;
				}else {
					appInThisClass.bootDBInBaseWay= false;
				}

			}
		});
		this.add(读取数据库);
		this.add(读取数据库_end_box);	
		
		JLabel 读取TXT = new JLabel("读取TXT"+ ":");  
		读取TXT.setForeground(Color.white);
		读取TXT.setBounds(10 + 1* 150, 20+ 25* 0, 100, 50);
		JCheckBox 读取TXT_end_box= new JCheckBox();
		读取TXT_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 0, 20, 20);
		读取TXT_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(读取TXT_end_box.isSelected()) {
						appInThisClass.bootDBInTXTWay= true;
				}else {
					appInThisClass.bootDBInTXTWay= false;
				}
				
			}
		});
		this.add(读取TXT);
		this.add(读取TXT_end_box);	
		
		//有规律的01数字后缀我会稍后归纳优化. 罗瑶光
		JLabel 激活缓存 = new JLabel("激活缓存"+ ":");  
		激活缓存.setForeground(Color.white);
		激活缓存.setBounds(10 + 0* 150, 20+ 25* 1, 100, 50);
		JCheckBox 激活缓存_end_box= new JCheckBox();
		激活缓存_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 1, 20, 20);
		激活缓存_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(激活缓存_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(激活缓存);
		this.add(激活缓存_end_box);	
		
		JLabel 激活ORM= new JLabel("激活ORM"+ ":");  
		激活ORM.setForeground(Color.white);
		激活ORM.setBounds(10 + 1* 150, 20+ 25* 1, 100, 50);
		JCheckBox 激活ORM_end_box= new JCheckBox();
		激活ORM_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 1, 20, 20);
		激活ORM_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(激活ORM_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(激活ORM);
		this.add(激活ORM_end_box);	
		
		
		JLabel 读取REST = new JLabel("读取REST模式"+ ":");  
		读取REST.setForeground(Color.white);
		读取REST.setBounds(10 + 2* 150, 20+ 25* 0, 100, 50);
		JCheckBox 读取REST_end_box= new JCheckBox();
		读取REST_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 0, 20, 20);
		读取REST_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(读取REST_end_box.isSelected()) {
					appInThisClass.bootDBInWebWay= true;
				}else {
					appInThisClass.bootDBInWebWay= false;
				}
			}
		});
		this.add(读取REST);
		this.add(读取REST_end_box);	
		
		JLabel 医学表可修改 = new JLabel("医学表可修改"+ ":");  
		医学表可修改.setForeground(Color.white);
		医学表可修改.setBounds(10 + 2* 150, 20+ 25* 1, 100, 50);
		JCheckBox 医学表可修改_end_box= new JCheckBox();
		医学表可修改_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 1, 20, 20);
		医学表可修改_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(医学表可修改_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(医学表可修改);
		this.add(医学表可修改_end_box);	
		
		JLabel 元基解密 = new JLabel("元基解密"+ ":");  
		元基解密.setForeground(Color.white);
		元基解密.setBounds(10 + 0* 150, 20+ 25* 2, 100, 50);
		JCheckBox 元基解密_end_box= new JCheckBox();
		元基解密_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 2, 20, 20);
		元基解密_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(元基解密_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(元基解密);
		this.add(元基解密_end_box);	
		
		JLabel 元基加密= new JLabel("元基加密"+ ":");  
		元基加密.setForeground(Color.white);
		元基加密.setBounds(10+ 1* 150, 20+ 25* 2, 100, 50);
		JCheckBox 元基加密_end_box= new JCheckBox();
		元基加密_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 2, 20, 20);
		元基加密_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(元基加密_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(元基加密);
		this.add(元基加密_end_box);	
		
		JLabel 元基计算= new JLabel("元基计算"+ ":");  
		元基计算.setForeground(Color.white);
		元基计算.setBounds(10+ 2* 150, 20+ 25* 2, 100, 50);
		JCheckBox 元基计算_end_box= new JCheckBox();
		元基计算_end_box.setBounds(10+ 85+ 2* 150, 33+ 25* 2, 20, 20);
		元基计算_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(元基计算_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(元基计算);
		this.add(元基计算_end_box);	
		
		//热备模式
		JLabel 热备模式= new JLabel("热备模式"+ ":");  
		热备模式.setForeground(Color.white);
		热备模式.setBounds(10+ 0* 150, 20+ 25* 3, 100, 50);
		JCheckBox 热备模式_end_box= new JCheckBox();
		热备模式_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 3, 20, 20);
		热备模式_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(热备模式_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(热备模式);
		this.add(热备模式_end_box);	
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
		
		
		JLabel 读写分离模式 = new JLabel("读写分离模式"+ ":");  
		读写分离模式.setForeground(Color.white);
		读写分离模式.setBounds(10+ 1* 150, 20+ 25* 3, 100, 50);
		JCheckBox 读写分离模式_end_box= new JCheckBox();
		读写分离模式_end_box.setBounds(10+ 85+ 1* 150, 33+ 25* 3, 20, 20);
		读写分离模式_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(读写分离模式_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
				
			}
		});
		this.add(读写分离模式);
		this.add(读写分离模式_end_box);	
		
		
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
		JLabel 无锁模式= new JLabel("无锁模式"+ ":");  
		无锁模式.setForeground(Color.white);
		无锁模式.setBounds(10+ 0* 150, 20+ 25* 9, 100, 50);
		JCheckBox 无锁模式_end_box= new JCheckBox();
		无锁模式_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 9, 20, 20);
		无锁模式_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(无锁模式_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(无锁模式);
		this.add(无锁模式_end_box);	
		//WEB模式
		JLabel WEB模式= new JLabel("WEB模式"+ ":");  
		WEB模式.setForeground(Color.white);
		WEB模式.setBounds(10+ 0* 150, 20+ 25* 10, 100, 50);
		JCheckBox WEB模式_end_box= new JCheckBox();
		WEB模式_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 10, 20, 20);
		WEB模式_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(WEB模式_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(WEB模式);
		this.add(WEB模式_end_box);	
		//命令行
		JLabel 命令行模式= new JLabel("命令行模式"+ ":");  
		命令行模式.setForeground(Color.white);
		命令行模式.setBounds(10+ 0* 150, 20+ 25* 11, 100, 50);
		JCheckBox 命令行模式_end_box= new JCheckBox();
		命令行模式_end_box.setBounds(10+ 85+ 0* 150, 33+ 25* 11, 20, 20);
		命令行模式_end_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(命令行模式_end_box.isSelected()) {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}else {
					for(int i= 0; i< tabNames.length; i++) {
						
						
					}
				}
			}
		});
		this.add(命令行模式);
		this.add(命令行模式_end_box);	
		
		
		JLabel 数据库配置文件地址= new JLabel("数据库配置文件地址"+ ":");  
		数据库配置文件地址.setForeground(Color.white);
		数据库配置文件地址.setBounds(10+ 0* 150, 20+ 25* 13, 150, 50);
		
		JTextField 数据库配置文件地址JTextField= new JTextField();
		数据库配置文件地址JTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 13, 550, 50);
		数据库配置文件地址JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.dbConfigPath= 数据库配置文件地址JTextField.getText().trim();
			}
		});
		数据库配置文件地址JTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				appInThisClass.dbConfigPath= 数据库配置文件地址JTextField.getText().trim();
			}
			
		});
		数据库配置文件地址JTextField.setText("C:/DBconfig.lyg");
		appInThisClass.dbConfigPath= "C:/DBconfig.lyg";
		this.add(数据库配置文件地址);
		this.add(数据库配置文件地址JTextField);	
		
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