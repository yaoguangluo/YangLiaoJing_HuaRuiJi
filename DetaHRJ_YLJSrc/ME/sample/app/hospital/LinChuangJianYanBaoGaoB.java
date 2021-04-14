package ME.sample.app.hospital;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import ME.sample.App;
import comp.detaButton.DetaButton;
import comp.detaLabel.DetaLabel;

public class LinChuangJianYanBaoGaoB  extends JPanel implements MouseListener, KeyListener, ActionListener{

	private static final long serialVersionUID= 1L;
	public JTextField 诊断结果_box;
	public LinChuangJianYanBaoGaoB(JTextPane name, App app){
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);	

		//1做表 左边名称 右边输入框
		//1做表 左边名称 右边输入框
		DetaLabel 诊断结果= new DetaLabel("诊断结果 :");  
		诊断结果.setForeground(Color.white);
		诊断结果.setBounds(10, 20+ 300+ 90, 100, 20);
		诊断结果_box= new JTextField();
		诊断结果_box.setBounds(10, 33+ 325+ 90, 1070, 120);
		诊断结果_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(诊断结果);
		this.add(诊断结果_box);	

		DetaButton 清空= new DetaButton ("清空", 100,50, Color.gray);	
		//JButton 清空= new JButton("清空");  
		清空.setForeground(Color.black);
		清空.setBounds(10+70, 20+ 300+ 90, 100, 30);
		清空.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				诊断结果_box.removeAll();
			}
		});
		this.add(清空);	


		DetaButton 打印= new DetaButton ("打印", 100,50, Color.red);	
		//JButton 打印= new JButton("打印");  
		打印.setForeground(Color.black);
		打印.setBounds(10+70+120, 20+ 300+ 90, 100, 30);
		打印.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//诊断结果_box.removeAll();
			}
		});
		this.add(打印);	


		DetaButton 编辑页= new DetaButton ("编辑页", 100,50, Color.orange);	
		//JButton 编辑页= new JButton("编辑页");  
		编辑页.setForeground(Color.black);
		编辑页.setBounds(10+ 70+ 120+ 120, 20+ 300+ 90, 100, 30);
		编辑页.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//诊断结果_box.removeAll();
			}
		});
		this.add(编辑页);

		DetaButton 署名= new DetaButton ("署名", 100,50, Color.blue);	
		//JButton 署名= new JButton("署名");  
		署名.setForeground(Color.black);
		署名.setBounds(10+ 70+ 120+ 120+ 120, 20+ 300+ 90, 100, 30);
		署名.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//诊断结果_box.removeAll();
			}
		});
		this.add(署名);	

		DetaButton 推荐过滤= new DetaButton ("推荐过滤", 100,50, Color.pink);	
		//	JButton 推荐过滤= new JButton("推荐过滤");  
		推荐过滤.setForeground(Color.black);
		推荐过滤.setBounds(10+ 70+ 120+ 120+ 120+ 120, 20+ 300+ 90, 100, 30);
		推荐过滤.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//诊断结果_box.removeAll();
			}
		});
		this.add(推荐过滤);	

		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai22= new DetaLabel("全血黏度:");  
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10+220*0, 32+ 0, 100, 20);
		JTextField baiDanBai22_box= new JTextField();
		baiDanBai22_box.setBounds(10+ 110+220*0, 33+ 0, 80, 20);
		baiDanBai22_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= baiDanBai22_box.getText();
				诊断结果_box.setText(诊断结果_box.getText()+ temp);
			}
		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);	

		DetaLabel label222= new DetaLabel("肿瘤标记抗原242检测ca242:");  
		label222.setForeground(Color.WHITE);
		label222.setBounds(10+220*0, 32+ 25*1, 100, 20);
		JTextField label222_box= new JTextField();
		label222_box.setBounds(10+ 110+220*0, 33+ 25*1, 80, 20);
		label222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label222);
		this.add(label222_box);	

		DetaLabel label322= new DetaLabel("过敏原检测（1）吸入组ⅰ（2）吸入组ⅱ（3）食物组ⅲ（4）食物组ⅳivtivt-ⅰivt-ⅱivt-ⅲivt-ⅳ :");  
		label322.setForeground(Color.WHITE);
		label322.setBounds(10+220*0, 32+ 25*2, 100, 20);
		JTextField label322_box= new JTextField();
		label322_box.setBounds(10+ 110+220*0, 33+ 25*2, 80, 20);
		label322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label322);
		this.add(label322_box);	

		DetaLabel label422= new DetaLabel("钙ca:");  
		label422.setForeground(Color.WHITE);
		label422.setBounds(10+220*0, 32+ 25* 3, 100, 20);
		JTextField label422_box= new JTextField();
		label422_box.setBounds(10+ 110+220*0, 33+ 25* 3, 80, 20);
		label422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label422);
		this.add(label422_box);	

		DetaLabel label522= new DetaLabel("巨噬细胞感染趋化因子-1βmip-1β:");  
		label522.setForeground(Color.WHITE);
		label522.setBounds(10+220*0, 32+ 25*4, 100, 20);
		JTextField label522_box= new JTextField();
		label522_box.setBounds(10+ 110+220*0, 33+ 25*4, 80, 20);
		label522_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label522);
		this.add(label522_box);	

		DetaLabel label622= new DetaLabel("尿17-羟固醇17-oh :");  
		label622.setForeground(Color.WHITE);
		label622.setBounds(10+220*0, 32+ 25*5, 100, 20);
		JTextField label622_box= new JTextField();
		label622_box.setBounds(10+ 110+220*0, 33+ 25*5, 80, 20);
		label622_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label622);
		this.add(label622_box);	

		//7
		DetaLabel label722= new DetaLabel("促黄体生成素lh :");  
		label722.setForeground(Color.WHITE);
		label722.setBounds(10+220*0, 32+ 25*6, 100, 20);
		JTextField label722_box= new JTextField();
		label722_box.setBounds(10+ 110+220*0, 33+ 25*6, 80, 20);
		label722_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label722);
		this.add(label722_box);	
		//8
		DetaLabel label6822= new DetaLabel("乙肝表面抗原hbsag:");  
		label6822.setForeground(Color.WHITE);
		label6822.setBounds(10+220*0, 32+ 25*7, 100, 20);
		JTextField label6822_box= new JTextField();
		label6822_box.setBounds(10+ 110+220*0, 33+ 25*7, 80, 20);
		label6822_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6822);
		this.add(label6822_box);	
		//9
		DetaLabel label6922= new DetaLabel("毛囊虫镜检demodexfolliculorumexamination :");  
		label6922.setForeground(Color.WHITE);
		label6922.setBounds(10+220*0, 32+ 25*8, 100, 20);
		JTextField label6922_box= new JTextField();
		label6922_box.setBounds(10+ 110+220*0, 33+ 25*8, 80, 20);
		label6922_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6922);
		this.add(label6922_box);	
		//10
		DetaLabel label61022= new DetaLabel("促肾上腺皮质激素acth :");  
		label61022.setForeground(Color.WHITE);
		label61022.setBounds(10+220*0, 32+ 25*9, 100, 20);
		JTextField label61022_box= new JTextField();
		label61022_box.setBounds(10+ 110+220*0, 33+ 25*9, 80, 20);
		label61022_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61022);
		this.add(label61022_box);	
		//11
		DetaLabel label61122= new DetaLabel("弓形体igm,抗体阳性定性toxo:");  
		label61122.setForeground(Color.WHITE);
		label61122.setBounds(10+220*0, 32+ 25*10, 100, 20);
		JTextField label61122_box= new JTextField();
		label61122_box.setBounds(10+ 110+220*0, 33+ 25*10, 80, 20);
		label61122_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61122);
		this.add(label61122_box);	
		//12
		DetaLabel label61222= new DetaLabel("载脂蛋白ap0bap0b:");  
		label61222.setForeground(Color.WHITE);
		label61222.setBounds(10+220*0, 32+ 25*11, 100, 20);
		JTextField label61222_box= new JTextField();
		label61222_box.setBounds(10+ 110+220*0, 33+ 25*11, 80, 20);
		label61222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label61222_box
						, "降低：常见于肝实质性病变"
						, "增高：常见于高脂血症，冠心病，银屑病。" 
						, "" 
						,75, 123, 诊断结果_box
						, "");
			}
		});
		this.add(label61222);
		this.add(label61222_box);	
		//13
		DetaLabel label61322= new DetaLabel("尿酸uric :");  
		label61322.setForeground(Color.WHITE);
		label61322.setBounds(10+220*0, 32+ 25*12, 100, 20);
		JTextField label61322_box= new JTextField();
		label61322_box.setBounds(10+ 110+220*0, 33+ 25*12, 80, 20);
		label61322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label61322_box
						, "降低：见于恶性贫血及肾上腺皮质激素等药物治疗后"
						, "增高：见于痛风，子痫，白血病，红细胞增多症，多发性骨髓瘤，急慢性肾小球肾炎。" 
						, "" 
						,2.5, 7.7, 诊断结果_box
						, "");
			}
		});
		this.add(label61322);
		this.add(label61322_box);	
		//14
		DetaLabel label61422= new DetaLabel("胰高糖素 :");  
		label61422.setForeground(Color.WHITE);
		label61422.setBounds(10+220*0, 32+ 25*13, 100, 20);
		JTextField label61422_box= new JTextField();
		label61422_box.setBounds(10+ 110+220*0, 33+ 25*13, 80, 20);
		label61422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label61422_box
						, ":测定胰岛a细胞功能过低"
						, ":测定胰岛a细胞功能过高" 
						, "" 
						,40, 130, 诊断结果_box
						, "");
			}
		});
		this.add(label61422);
		this.add(label61422_box);	
		//
		addSecondColomns(诊断结果_box);
		addThirdColomns(诊断结果_box);
		addFourthColomns(诊断结果_box);
		addFifthColomns(诊断结果_box);
	}
	private void addFifthColomns(JTextField 诊断结果_box2) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai222223= new DetaLabel("军团菌抗原检测:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*1, 32+ 0, 100, 20);
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		DetaLabel label2222223= new DetaLabel("真菌培养取材cultureoffungi :");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*1, 32+ 25*1, 100, 20);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		DetaLabel label3222223= new DetaLabel("转肽酶ggt :");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*1, 32+ 25*2, 100, 20);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label3222223_box
						, ""
						, "增高：常见于原发性或转移性肝癌，急性肝炎，慢性肝炎活动期，肝硬化，急性胰腺炎及心力衰竭等" 
						, "" 
						,8, 50, 诊断结果_box
						, "");
			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		DetaLabel label4222223= new DetaLabel("免疫组化验查immunohistophathol-ogicstain :");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+220*1, 32+ 25* 3, 100, 20);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		DetaLabel label5222223= new DetaLabel("四项诱导血小板聚集功能测试（mulitipleagentplateletaggregationtest）4-pagt :");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*1, 32+ 25*4, 100, 20);
		JTextField label5222223_box= new JTextField();
		label5222223_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
		label5222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label5222223);
		this.add(label5222223_box);	

		DetaLabel label6222223= new DetaLabel("髓鞘碱性蛋白mbp :");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*1, 32+ 25*5, 100, 20);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		DetaLabel label7222223= new DetaLabel("皮肤病理活检dermatopathologicalexamination :");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*1, 32+ 25*6, 100, 20);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		DetaLabel label68222223= new DetaLabel("血（尿）锌zn :");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*1, 32+ 25*7, 100, 20);
		JTextField label68222223_box= new JTextField();
		label68222223_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
		label68222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label68222223_box
						, "降低：见于急慢性肝炎，肝硬化，肝瘤，心梗，贫血。儿童缺锌症，重症肌无力"
						, "增高：见于锌中毒，甲亢，X射线照射后。" 
						, "" 
						,50, 140, 诊断结果_box
						, "");
			}
		});
		this.add(label68222223);
		this.add(label68222223_box);	
		//9
		DetaLabel label69222223= new DetaLabel("尿皮质醇尿皮质醇 :");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*1, 32+ 25*8, 100, 20);
		JTextField label69222223_box= new JTextField();
		label69222223_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
		label69222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label69222223_box
						, "测定肾上腺皮质功能过低"
						, "测定肾上腺皮质功能过高" 
						, "" 
						,10, 80, 诊断结果_box
						, "");
			}
		});
		this.add(label69222223);
		this.add(label69222223_box);	
		//10
		DetaLabel label610222223= new DetaLabel("白色念珠菌抗原:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*1, 32+ 25*9, 100, 20);
		JTextField label610222223_box= new JTextField();
		label610222223_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
		label610222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label610222223);
		this.add(label610222223_box);	
		//11
		DetaLabel label611222223= new DetaLabel("乙肝两对半hbeab :");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*1, 32+ 25*10, 100, 20);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		DetaLabel label612222223= new DetaLabel("早老素-1ps-1:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*1, 32+ 25*11, 100, 20);
		JTextField label612222223_box= new JTextField();
		label612222223_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
		label612222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label612222223);
		this.add(label612222223_box);	
		//13
		DetaLabel label613222223= new DetaLabel("总蛋白tp:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*1, 32+ 25*12, 100, 20);
		JTextField label613222223_box= new JTextField();
		label613222223_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
		label613222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label613222223_box
						, "降低：常见于恶性肿瘤，重症结核，营养及吸收障碍，肝硬化，肾病综合症，烧伤，失血"
						, "增高：常见于高度脱水症（如腹泄、沤吐，休克，高热）及多发性骨髓瘤" 
						, "" 
						,6.0, 8.0, 诊断结果_box
						, "");
			}
		});
		this.add(label613222223);
		this.add(label613222223_box);	
		//14
		DetaLabel label614222223= new DetaLabel("肺炎支原体igg:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*1, 32+ 25*13, 100, 20);
		JTextField label614222223_box= new JTextField();
		label614222223_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
		label614222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label614222223);
		this.add(label614222223_box);	
	}

	void addFourthColomns(JTextField 诊断结果_box2) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai22= new DetaLabel("淋球菌培养取材cultureofneisseriagonorrhoen:");  
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10+220*2, 32+ 0, 100, 20);
		JTextField baiDanBai22_box= new JTextField();
		baiDanBai22_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
		baiDanBai22_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);	

		DetaLabel label222= new DetaLabel("尿酸（尿）:");  
		label222.setForeground(Color.WHITE);
		label222.setBounds(10+220*2, 32+ 25*1, 100, 20);
		JTextField label222_box= new JTextField();
		label222_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
		label222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label222_box
						, ""
						, "痛风" 
						, "" 
						,0.2 , 2.0, 诊断结果_box
						, "");
			}
		});
		this.add(label222);
		this.add(label222_box);	

		DetaLabel label322= new DetaLabel("血小板聚集:");  
		label322.setForeground(Color.WHITE);
		label322.setBounds(10+220*2, 32+ 25*2, 100, 20);
		JTextField label322_box= new JTextField();
		label322_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
		label322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label322_box
						, "血小板功能过低"
						, "血小板功能过高" 
						, "" 
						, 25, 55, 诊断结果_box
						, "");
			}
		});
		this.add(label322);
		this.add(label322_box);	

		DetaLabel label422= new DetaLabel("谷草转氨酶ast:");  
		label422.setForeground(Color.WHITE);
		label422.setBounds(10+220*2, 32+ 25* 3, 100, 20);
		JTextField label422_box= new JTextField();
		label422_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
		label422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label422_box
						, ""
						, "增高：常见于心梗，急慢性肝炎，中毒性肝炎，心功能不全，皮肌炎等" 
						, "" 
						,8, 40, 诊断结果_box
						, "");
			}
		});
		this.add(label422);
		this.add(label422_box);	

		DetaLabel label522= new DetaLabel("甲肝抗体-igmhav-igm:");  
		label522.setForeground(Color.WHITE);
		label522.setBounds(10+220*2, 32+ 25*4, 100, 20);
		JTextField label522_box= new JTextField();
		label522_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
		label522_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label522);
		this.add(label522_box);	

		DetaLabel label622= new DetaLabel("生长激素gh:");  
		label622.setForeground(Color.WHITE);
		label622.setBounds(10+220*2, 32+ 25*5, 100, 20);
		JTextField label622_box= new JTextField();
		label622_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
		label622_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态； ng/ml
				String temp= label622_box.getText();
				double temp_double= Double.valueOf(temp);
				if(temp_double>5|| temp_double<0.06) {
					诊断结果_box.setText(诊断结果_box.getText().contains("诊断肢端肥大症垂体瘤等")
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ "诊断肢端肥大症垂体瘤等");	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace("诊断肢端肥大症垂体瘤等", ""));	
				}		
			}
		});
		this.add(label622);
		this.add(label622_box);	

		//7
		DetaLabel label722= new DetaLabel("脂肪酶lipase:");  
		label722.setForeground(Color.WHITE);
		label722.setBounds(10+220*2, 32+ 25*6, 100, 20);
		JTextField label722_box= new JTextField();
		label722_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
		label722_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//增高：见于急慢性胰腺炎，胰腺癌，胆道疾病，胃穿孔，肠梗阻，腮腺炎，唾液腺炎等。降低：见于肝脏疾病，如肝癌，肝硬化。
				//加状态；
				String temp= label722_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "增高：见于急慢性胰腺炎，胰腺癌，胆道疾病，胃穿孔，肠梗阻，腮腺炎，唾液腺炎等。降低：见于肝脏疾病，如肝癌，肝硬化。";
				if(temp_double>40) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}		

			}
		});
		this.add(label722);
		this.add(label722_box);	
		//8
		DetaLabel label6822= new DetaLabel("血浆叶酸测定fa:");  
		label6822.setForeground(Color.WHITE);
		label6822.setBounds(10+220*2, 32+ 25*7, 100, 20);
		JTextField label6822_box= new JTextField();
		label6822_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
		label6822_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6822);
		this.add(label6822_box);	
		//9
		DetaLabel label6922= new DetaLabel("ck-mm同工酶:");  
		label6922.setForeground(Color.WHITE);
		label6922.setBounds(10+220*2, 32+ 25*8, 100, 20);
		JTextField label6922_box= new JTextField();
		label6922_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
		label6922_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6922);
		this.add(label6922_box);	
		//10
		DetaLabel label61022= new DetaLabel("特异性酯酶双染色:");  
		label61022.setForeground(Color.WHITE);
		label61022.setBounds(10+220*2, 32+ 25*9, 100, 20);
		JTextField label61022_box= new JTextField();
		label61022_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
		label61022_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61022);
		this.add(label61022_box);	
		//11
		DetaLabel label61122= new DetaLabel("铁染色:");  
		label61122.setForeground(Color.WHITE);
		label61122.setBounds(10+220*2, 32+ 25*10, 100, 20);
		JTextField label61122_box= new JTextField();
		label61122_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
		label61122_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61122);
		this.add(label61122_box);	
		//12
		DetaLabel label61222= new DetaLabel("铁染色:");  
		label61222.setForeground(Color.WHITE);
		label61222.setBounds(10+220*2, 32+ 25*11, 100, 20);
		JTextField label61222_box= new JTextField();
		label61222_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
		label61222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61222);
		this.add(label61222_box);	
		//13
		DetaLabel label61322= new DetaLabel("乙肝两对半hbeag:");  
		label61322.setForeground(Color.WHITE);
		label61322.setBounds(10+220*2, 32+ 25*12, 100, 20);
		JTextField label61322_box= new JTextField();
		label61322_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
		label61322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61322);
		this.add(label61322_box);	
		//14
		DetaLabel label61422= new DetaLabel("α-醋酸萘酚酯酶染色 :");  
		label61422.setForeground(Color.WHITE);
		label61422.setBounds(10+220*2, 32+ 25*13, 100, 20);
		JTextField label61422_box= new JTextField();
		label61422_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
		label61422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61422);
		this.add(label61422_box);	
	}

	private void addThirdColomns(JTextField 诊断结果_box2) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai222223= new DetaLabel("血浆同型半胱氨酸hcy:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*3, 32+ 0, 100, 20);
		baiDanBai222223.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DetaLabel 单位= new DetaLabel("白蛋白alb :");  
				单位.setForeground(Color.WHITE);
				单位.setBounds(10, 20+ 0, 100, 20);
				add(单位);		
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(baiDanBai222223_box
						, "心脑血管病独立危险因素"
						, "" 
						, "" 
						,15, 9990, 诊断结果_box
						, "");
			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		DetaLabel label2222223= new DetaLabel("尿微量白蛋白排泄率uaer :");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*3, 32+ 25*1, 100, 20);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label2222223_box
						, ""
						, "早期肾病的诊断 过高" 
						, "" 
						,0, 20, 诊断结果_box
						, "");
			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		DetaLabel label3222223= new DetaLabel("氯cl :");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*3, 32+ 25*2, 100, 20);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label2222223_box
						, "降低：见于低钠血症，严重呕吐，腹泻，胃液胰液胆汁液大量丢失，肾功能减退及阿狄森氏病等"
						, "增高：见于高钠血症，呼吸碱中毒，高渗性脱水，肾炎少尿及尿道梗塞" 
						, "" 
						,96, 106, 诊断结果_box
						, "");
			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		DetaLabel label4222223= new DetaLabel("灌洗液常规检查balf :");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+220*3, 32+ 25* 3, 100, 20);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		DetaLabel label5222223= new DetaLabel("呼吸道病毒检测:");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*3, 32+ 25*4, 100, 20);
		JTextField label5222223_box= new JTextField();
		label5222223_box.setBounds(10+ 110+220*3, 33+ 25*4, 80, 20);
		label5222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label5222223);
		this.add(label5222223_box);	

		DetaLabel label6222223= new DetaLabel("肌酐（尿） :");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*3, 32+ 25*5, 100, 20);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label6222223_box
						, "降低：见于肾功能不全，白血症"
						, "增高：见于破伤风，伤寒，皮肌炎。" 
						, "" 
						,98, 230, 诊断结果_box
						, "");
			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		DetaLabel label7222223= new DetaLabel("血免疫球蛋白gigg :");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*3, 32+ 25*6, 100, 20);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label6222223_box
						, "降低：免疫病"
						, "过高" 
						, "" 
						,90, 209, 诊断结果_box
						, "");
			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		DetaLabel label68222223= new DetaLabel("胸水ldh:");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*3, 32+ 25*7, 100, 20);
		JTextField label68222223_box= new JTextField();
		label68222223_box.setBounds(10+ 110+220*3, 33+ 25*7, 80, 20);
		label68222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label68222223);
		this.add(label68222223_box);	
		//9
		DetaLabel label69222223= new DetaLabel("促进泡生成素fsm :");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*3, 32+ 25*8, 100, 20);
		JTextField label69222223_box= new JTextField();
		label69222223_box.setBounds(10+ 110+220*3, 33+ 25*8, 80, 20);
		label69222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label69222223);
		this.add(label69222223_box);	
		//10
		DetaLabel label610222223= new DetaLabel("d-二聚体（d-dimer）:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*3, 32+ 25*9, 100, 20);
		JTextField label610222223_box= new JTextField();
		label610222223_box.setBounds(10+ 110+220*3, 33+ 25*9, 80, 20);
		label610222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label610222223);
		this.add(label610222223_box);	
		//11
		DetaLabel label611222223= new DetaLabel("间接胆红质ibil :");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*3, 32+ 25*10, 100, 20);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label611222223_box
						, ""
						, ":增高：见于溶血性黄疸，新生儿黄疸，血型不符的输血反应" 
						, "" 
						,0.1, 0.7, 诊断结果_box
						, "");
			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		DetaLabel label612222223= new DetaLabel("t细胞亚群测定:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*3, 32+ 25*11, 100, 20);
		JTextField label612222223_box= new JTextField();
		label612222223_box.setBounds(10+ 110+220*3, 33+ 25*11, 80, 20);
		label612222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label612222223);
		this.add(label612222223_box);	
		//13
		DetaLabel label613222223= new DetaLabel("氧合:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*3, 32+ 25*12, 100, 20);
		JTextField label613222223_box= new JTextField();
		label613222223_box.setBounds(10+ 110+220*3, 33+ 25*12, 80, 20);
		label613222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label613222223);
		this.add(label613222223_box);	
		//14
		DetaLabel label614222223= new DetaLabel("set:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*3, 32+ 25*13, 100, 20);
		JTextField label614222223_box= new JTextField();
		label614222223_box.setBounds(10+ 110+220*3, 33+ 25*13, 80, 20);
		label614222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label614222223);
		this.add(label614222223_box);	
	}

	private void addSecondColomns(JTextField 诊断结果_box2) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai22= new DetaLabel("胎盘糖旦白胎盘糖旦白:");  
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10+220*4, 32+ 0, 100, 20);
		JTextField baiDanBai22_box= new JTextField();
		baiDanBai22_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
		baiDanBai22_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);	

		DetaLabel label222= new DetaLabel("单核细胞化学趋化因子-1mcp-1 :");  
		label222.setForeground(Color.WHITE);
		label222.setBounds(10+220*4, 32+ 25*1, 100, 20);
		JTextField label222_box= new JTextField();
		label222_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
		label222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label222);
		this.add(label222_box);	

		DetaLabel label322= new DetaLabel("骨髓细胞形态学诊断检查:");  
		label322.setForeground(Color.WHITE);
		label322.setBounds(10+220*4, 32+ 25*2, 100, 20);
		JTextField label322_box= new JTextField();
		label322_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
		label322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label322);
		this.add(label322_box);	

		DetaLabel label422= new DetaLabel("髓鞘碱性蛋白抗体mbp:");  
		label422.setForeground(Color.WHITE);
		label422.setBounds(10+220*4, 32+ 25* 3, 100, 20);
		JTextField label422_box= new JTextField();
		label422_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
		label422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label422);
		this.add(label422_box);	

		DetaLabel label522= new DetaLabel("羟丁酸脱氢酶hbdh :");  
		label522.setForeground(Color.WHITE);
		label522.setBounds(10+220*4, 32+ 25*4, 100, 20);
		JTextField label522_box= new JTextField();
		label522_box.setBounds(10+ 110+ 220* 4, 33+ 25*4, 80, 20);
		label522_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label522_box
						, ""
						, "作为急性心梗诊断的一个指标，与LDH大致相同，在急性心梗时此酶在血液中维持高值，可达2周左右。" 
						, "" 
						,80, 220, 诊断结果_box
						, "");

			}
		});
		this.add(label522);
		this.add(label522_box);	

		DetaLabel label622= new DetaLabel("c-肽c-p:");  
		label622.setForeground(Color.WHITE);
		label622.setBounds(10+220*4, 32+ 25*5, 100, 20);
		JTextField label622_box= new JTextField();
		label622_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
		label622_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label622);
		this.add(label622_box);	

		//7
		DetaLabel label722= new DetaLabel("性病衣原体快速检测（ct）:");  
		label722.setForeground(Color.WHITE);
		label722.setBounds(10+220*4, 32+ 25*6, 100, 20);
		JTextField label722_box= new JTextField();
		label722_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
		label722_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label722);
		this.add(label722_box);	
		//8
		DetaLabel label6822= new DetaLabel("催孔素phl :");  
		label6822.setForeground(Color.WHITE);
		label6822.setBounds(10+220*4, 32+ 25*7, 100, 20);
		JTextField label6822_box= new JTextField();
		label6822_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
		label6822_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6822);
		this.add(label6822_box);	
		//9
		DetaLabel label6922= new DetaLabel("骨髓巨核细胞定量计数分类分析:");  
		label6922.setForeground(Color.WHITE);
		label6922.setBounds(10+220*4, 32+ 25*8, 100, 20);
		JTextField label6922_box= new JTextField();
		label6922_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
		label6922_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6922);
		this.add(label6922_box);	
		//10
		DetaLabel label61022= new DetaLabel("血气分析加离子分析:");  
		label61022.setForeground(Color.WHITE);
		label61022.setBounds(10+220*4, 32+ 25*9, 100, 20);
		JTextField label61022_box= new JTextField();
		label61022_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
		label61022_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61022);
		this.add(label61022_box);	
		//11
		DetaLabel label61122= new DetaLabel("脑脊液生化糖:");  
		label61122.setForeground(Color.WHITE);
		label61122.setBounds(10+220*4, 32+ 25*10, 100, 20);
		JTextField label61122_box= new JTextField();
		label61122_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
		label61122_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61122);
		this.add(label61122_box);	
		//12***********************************
		DetaLabel label61222= new DetaLabel("血管紧张素转化酶sace:");  
		label61222.setForeground(Color.WHITE);
		label61222.setBounds(10+220*4, 32+ 25*11, 100, 20);
		JTextField label61222_box= new JTextField();
		label61222_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
		label61222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label61222_box
						, ""
						, "结节病，肺结核" 
						, "" 
						, 20, 40, 诊断结果_box
						, "");
			}
		});
		this.add(label61222);
		this.add(label61222_box);	
		//13
		DetaLabel label61322= new DetaLabel("糖元染色:");  
		label61322.setForeground(Color.WHITE);
		label61322.setBounds(10+220*4, 32+ 25*12, 100, 20);
		JTextField label61322_box= new JTextField();
		label61322_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
		label61322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61322);
		this.add(label61322_box);	
		//14
		DetaLabel label61422= new DetaLabel("脑脊液细胞学检查:");  
		label61422.setForeground(Color.WHITE);
		label61422.setBounds(10+220*4, 32+ 25*13, 100, 20);
		JTextField label61422_box= new JTextField();
		label61422_box.setBounds(10+ 110+220*4, 33+ 25*13, 80, 20);
		label61422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61422);
		this.add(label61422_box);	
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
	protected void printValue(JTextField label612222223_box, String minString, String maxString, String elseString
			, double min, double max, JTextField 诊断结果_box, String yinyang) {
		//加状态；
		String temp= label612222223_box.getText();
		//double temp_double= Double.valueOf(temp);
		if(yinyang.contains("阴 ")||yinyang.contains("阳")) {
			if(temp.contains(yinyang)) {
				诊断结果_box.setText(诊断结果_box.getText().contains(elseString)
						? 诊断结果_box.getText(): 诊断结果_box.getText()+ elseString);	
			}else {
				诊断结果_box.setText(诊断结果_box.getText().replace(elseString, ""));	
			}
			return;
		}
		if(temp.isEmpty()) {
			诊断结果_box.setText(诊断结果_box.getText().replace(maxString, "").replace(minString, ""));
			return;
		}
		//加状态；
		double temp_double= Double.valueOf(temp);
		if(temp_double> max) {
			诊断结果_box.setText(诊断结果_box.getText().replace(maxString, "").replace(minString, ""));	
			诊断结果_box.setText(诊断结果_box.getText().contains(maxString)
					? 诊断结果_box.getText(): 诊断结果_box.getText()+ maxString);	
		}else if(temp_double< min) {	
			诊断结果_box.setText(诊断结果_box.getText().replace(maxString, "").replace(minString, ""));	
			诊断结果_box.setText(诊断结果_box.getText().contains(minString)
					? 诊断结果_box.getText(): 诊断结果_box.getText()+ minString);	
		}else {
			诊断结果_box.setText(诊断结果_box.getText().replace(maxString, "").replace(minString, ""));	
		}
	}
}
