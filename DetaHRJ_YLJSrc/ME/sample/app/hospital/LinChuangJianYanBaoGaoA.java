package ME.sample.app.hospital;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import comp.detaButton.DetaButton;
import comp.detaLabel.DetaLabel;

public class LinChuangJianYanBaoGaoA  extends JPanel implements MouseListener, KeyListener, ActionListener{
	//今天准备把医学检验报告的单位进行格式化 规范化,等下开始 20210401
	//罗瑶光
	private static final long serialVersionUID = 1L;
	public LinChuangJianYanBaoGaoA(JTextPane name){
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);

		//1做表 左边名称 右边输入框
		JLabel 诊断结果= new JLabel("诊断结果:");  
		诊断结果.setForeground(Color.WHITE);
		诊断结果.setBounds(10, 20+ 300+ 90, 100, 20);
		JTextField 诊断结果_box= new JTextField();
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

		DetaButton 导入图片= new DetaButton ("导入图片", 100,50, Color.pink);	
		//	JButton 推荐过滤= new JButton("推荐过滤");  
		导入图片.setForeground(Color.black);
		导入图片.setBounds(10+ 70+ 120+ 120+ 120+ 120+ 120, 20+ 300+ 90, 100, 30);
		导入图片.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//诊断结果_box.removeAll();
			}
		});
		this.add(导入图片);	

		DetaButton 扫描图片= new DetaButton ("扫描图片", 100,50, Color.pink);	
		//	JButton 推荐过滤= new JButton("推荐过滤");  
		扫描图片.setForeground(Color.black);
		扫描图片.setBounds(10+ 70+ 120+ 120+ 120+ 120+ 120+ 120, 20+ 300+ 90, 100, 30);
		扫描图片.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//诊断结果_box.removeAll();
			}
		});
		this.add(扫描图片);	

		DetaButton 蓝牙接收报告= new DetaButton ("蓝牙接收报告", 100,50, Color.pink);	
		//	JButton 推荐过滤= new JButton("推荐过滤");  
		蓝牙接收报告.setForeground(Color.black);
		蓝牙接收报告.setBounds(10+ 70+ 120+ 120+ 120+ 120+ 120+ 120+ 120, 20+ 300+ 90, 150, 30);
		蓝牙接收报告.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//诊断结果_box.removeAll();
			}
		});
		this.add(蓝牙接收报告);	

		//copy tab
		DetaLabel baiDanBai= new DetaLabel("白蛋白alb:");  
		baiDanBai.setForeground(Color.WHITE);
		baiDanBai.setBounds(10, 32+ 25*0, 100, 25);  
		baiDanBai.setTag("西医检验：白蛋白ALB->临床意义:鞘内免疫病观测指标鞘内免疫病观测指标->实验室检查:血3350-4765mg/dl脑脊液13.4-23.7mg/dl", true);
		JTextField baiDanBai_box= new JTextField();
		baiDanBai_box.setBounds(10+ 110, 33+ 0, 80, 20);
		baiDanBai_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= baiDanBai_box.getText();
				double temp_double= Double.valueOf(temp.isEmpty()?"0":temp);
				String report= "鞘内免疫病观测指标鞘内免疫病观测指标异常";
				if(temp_double< 4765&& temp_double> 3350) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(baiDanBai);
		this.add(baiDanBai_box);	

		DetaLabel label2= new DetaLabel("乙肝两对半hbcab:");
		label2.setForeground(Color.WHITE);
		label2.setBounds(10, 32+ 25*1, 100, 25);
		label2.setTag("西医检验：乙肝两对半HbcAb->临床意义:->实验室检查:阴性", true);
		JTextField label2_box= new JTextField();
		label2_box.setBounds(10+ 110, 33+ 25*1, 80, 20);
		label2_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label2_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "乙肝阳性";
				if(temp.contains("阳")) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label2);
		this.add(label2_box);	
		DetaLabel label3= new DetaLabel("糖耐量实验:");
		label3.setForeground(Color.WHITE);
		label3.setBounds(10, 32+ 25*2, 100, 25);
		JTextField label3_box= new JTextField();
		label3_box.setBounds(10+ 110, 33+ 25*2, 80, 20);
		label3_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label3_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "糖尿病监测诊断指标异常";
				if(temp_double> 140&& temp_double< 50) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label3);
		this.add(label3_box);	

		DetaLabel label4= new DetaLabel("螨虫镜检:");
		label4.setForeground(Color.WHITE);
		label4.setBounds(10, 32+ 25* 3, 100, 20);
		JTextField label4_box= new JTextField();
		label4_box.setBounds(10+ 110, 33+ 25* 3, 80, 20);
		label4_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label4_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "螨虫感染阳性";
				if(temp.contains("阳")) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label4);
		this.add(label4_box);	

		DetaLabel label5= new DetaLabel("性病支原体检测（uu）:");
		label5.setForeground(Color.WHITE);
		label5.setBounds(10, 32+ 25*4, 100, 20);
		JTextField label5_box= new JTextField();
		label5_box.setBounds(10+ 110, 33+ 25*4, 80, 20);
		label5_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label5_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "性病支原体感染阳性";
				if(temp.contains("阳")) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label5);
		this.add(label5_box);	

		DetaLabel label6= new DetaLabel("低密度脂蛋白ldl-c:");  
		label6.setForeground(Color.WHITE);
		label6.setBounds(10, 32+ 25*5, 100, 20);
		JTextField label6_box= new JTextField();
		label6_box.setBounds(10+ 110, 33+ 25*5, 80, 20);
		label6_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label6_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "同血清总胆固醇测定指标异常";
				if(temp_double> 120&& temp_double< 40) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label6);
		this.add(label6_box);	

		//7
		DetaLabel label7= new DetaLabel("血氨nh3:");  
		label7.setForeground(Color.WHITE);
		label7.setBounds(10, 32+ 25*6, 100, 20);
		JTextField label7_box= new JTextField();
		label7_box.setBounds(10+ 110, 33+ 25*6, 80, 20);
		label7_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label7_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "增高：见于肝昏迷，重症肝炎，休克。";
				if(temp_double< 100) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label7);
		this.add(label7_box);	
		//8
		DetaLabel label68= new DetaLabel("胰岛素抗体ins-ab:");  
		label68.setForeground(Color.WHITE);
		label68.setBounds(10, 32+ 25*7, 100, 20);
		JTextField label68_box= new JTextField();
		label68_box.setBounds(10+ 110, 33+ 25*7, 80, 20);
		label68_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label68_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "胰岛素抵抗指标异常";
				if(temp_double> 10) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label68);
		this.add(label68_box);	
		//9
		DetaLabel label69= new DetaLabel("钾（尿）钾（尿）:");  
		label69.setForeground(Color.WHITE);
		label69.setBounds(10, 32+ 25*8, 100, 20);
		JTextField label69_box= new JTextField();
		label69_box.setBounds(10+ 110, 33+ 25*8, 80, 20);
		label69_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label69_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "当使用利尿时，尿钾排泄增多，原发性醛固酮增高症人尿钾排泄增加。指标异常";
				if(temp_double> 100&& temp_double< 25) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label69);
		this.add(label69_box);	
		//10
		DetaLabel label610= new DetaLabel("磷ip:");  
		label610.setForeground(Color.WHITE);
		label610.setBounds(10, 32+ 25*9, 100, 20);
		JTextField label610_box= new JTextField();
		label610_box.setBounds(10+ 110, 33+ 25*9, 80, 20);
		label610_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label610_box.getText();
				double temp_double= Double.valueOf(temp.isEmpty()?"0":temp);
				String reportz= "磷增高：见于甲状旁腺机能减退，急慢性肾功能不全，尿毒症，骨髓瘤及骨折愈合期。";
				String reportj= "磷降低：见于甲亢，代谢性酸中毒佝楼病，软骨病，肾功能衰竭，长期腹泻及吸收不良。";

				if(temp_double> 5) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 2.5) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label610);
		this.add(label610_box);	
		//11
		DetaLabel label611= new DetaLabel("氯（尿）氯（尿）:");  
		label611.setForeground(Color.WHITE);
		label611.setBounds(10, 32+ 25*10, 100, 20);
		JTextField label611_box= new JTextField();
		label611_box.setBounds(10+ 110, 33+ 25*10, 80, 20);
		label611_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label611_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "一般情况下，尿钠与尿氯保持相对平衡，但连续服用NaCL或KCL后，尿氯比尿钠高"
						+ "；相反，连服大量碱性钠盐，尿钠比尿氯高。";
				if(temp_double> 250&& temp_double< 110) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	

			}
		});
		this.add(label611);
		this.add(label611_box);	
		//12
		DetaLabel label612= new DetaLabel("肌钙蛋白ttnt:");  
		label612.setForeground(Color.WHITE);
		label612.setBounds(10, 32+ 25*11, 100, 20);
		JTextField label612_box= new JTextField();
		label612_box.setBounds(10+ 110, 33+ 25*11, 80, 20);
		label612_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label612_box.getText();
				double temp_double= Double.valueOf(temp);
				String report= "诊断心肌梗塞的灵敏指标，同时它又是判断不稳定心绞痛患者预后的一个重要指标异常";
				if(temp_double>= 0.05) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label612);
		this.add(label612_box);	
		//13
		DetaLabel label613= new DetaLabel("钠（尿）钠（尿）:");  
		label613.setForeground(Color.WHITE);
		label613.setBounds(10, 32+ 25*12, 100, 20);
		JTextField label613_box= new JTextField();
		label613_box.setBounds(10+ 110, 33+ 25*12, 80, 20);
		label613_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label613_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "判断是否有大量盐的丢失，判断呕吐，腹泻患者的电解质平衡，中枢神经系统疾病，脑出血，炎症，肿瘤，肾小管严重损害患者尿钠增多。";
				String reportj= "尿钠低。";

				if(temp_double> 260) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 130) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label613);
		this.add(label613_box);	
		//14
		DetaLabel label614= new DetaLabel("碱性磷酸酶alp:");  
		label614.setForeground(Color.WHITE);
		label614.setBounds(10, 32+ 25*13, 100, 20);
		JTextField label614_box= new JTextField();
		label614_box.setBounds(10+ 110, 33+ 25*13, 80, 20);
		label614_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label614_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "碱性磷酸酶增高：常见于肝癌，肝硬化，阻塞性黄疸，急慢性黄疸型肝炎，骨细胞瘤，骨折及少年儿童。。";
				String reportj= "碱性磷酸酶低。";

				if(temp_double> 110) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 20) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label614);
		this.add(label614_box);	
		//
		addSecondColomns(诊断结果_box);
		addThirdColomns(诊断结果_box);
		addFourthColomns(诊断结果_box);
		addFifthColomns(诊断结果_box);
	}
	private void addFifthColomns(JTextField 诊断结果_box) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai222223= new DetaLabel("血渗透压血osm:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*4, 32+ 0, 100, 20);
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= baiDanBai222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "反应血中溶质分子及离子总数增高。";
				String reportj= "反应血中溶质分子及离子总数降低。";

				if(temp_double> 310) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 280) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		DetaLabel label2222223= new DetaLabel("肌酐清除率cor:");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*4, 32+ 25*1, 100, 20);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label2222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "肌酐清除率高。";
				String reportj= "肌酐清除率低。";

				if(temp_double> 120) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 75) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		DetaLabel label3222223= new DetaLabel("血（尿）铜cu:");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*4, 32+ 25*2, 100, 20);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label3222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "血（尿）铜 增高：见于恶性肿瘤，肝硬化，甲亢，结核等。";
				String reportj= "血（尿）铜 降低：见于先天性铜吸收及肝脏代谢障碍，肾病综合症及肝豆状核变性。";

				if(temp_double> 150) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 80) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		DetaLabel label4222223= new DetaLabel("组分区带igg:");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+ 220*4, 32+ 25* 3, 100, 20);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label4222223_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "鞘内免疫病观测指标阳性";
				if(temp.contains("阳")) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		DetaLabel label5222223= new DetaLabel("甲状旁腺激素pth:");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*4, 32+ 25*4, 100, 20);
		JTextField label5222223_box= new JTextField();
		label5222223_box.setBounds(10+ 110+220*4, 33+ 25*4, 80, 20);
		label5222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label5222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "测定甲状旁腺功能骨质过密。";
				String reportj= "测定甲状旁腺功能骨质疏松。";

				if(temp_double>72) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 12) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label5222223);
		this.add(label5222223_box);	

		DetaLabel label6222223= new DetaLabel("尿3-甲氧基4-羟基苦杏仁酸（vma）:");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*4, 32+ 25*5, 100, 20);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label6222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "尿3-甲氧基4-羟基苦杏仁酸（vma）过高。";
				String reportj= "尿3-甲氧基4-羟基苦杏仁酸（vma）过低。";

				if(temp_double>13) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 3.5) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		DetaLabel label7222223= new DetaLabel("载脂蛋白ap0alap0al:");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*4, 32+ 25*6, 100, 20);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label7222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "载脂蛋白过高。";
				String reportj= "载脂蛋白降低：常见于高脂血症，冠心病及肝实质性病变。";

				if(temp_double>13) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 3.5) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		DetaLabel label68222223= new DetaLabel("肌钙蛋白itni:");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*4, 32+ 25*7, 100, 20);
		JTextField label68222223_box= new JTextField();
		label68222223_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
		label68222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label68222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "同TNI。诊断心肌梗塞的灵敏指标，同时它又是判断不稳定心绞痛患者预后的一个重要指标。";
				String reportj= "肌钙蛋白过低。";

				if(temp_double>0.05) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 0) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	

			}
		});
		this.add(label68222223);
		this.add(label68222223_box);	
		//9
		DetaLabel label69222223= new DetaLabel("氯醋酸萘酚as-d酯酶染色:");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*4, 32+ 25*8, 100, 20);
		JTextField label69222223_box= new JTextField();
		label69222223_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
		label69222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label69222223_box.getText();
				//double temp_double= Double.valueOf(temp);
				String report= "白血病";
				if(temp.contains("阳")) {
					诊断结果_box.setText(诊断结果_box.getText().contains(report)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ report);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(report, ""));	
				}	
			}
		});
		this.add(label69222223);
		this.add(label69222223_box);	
		//10
		DetaLabel label610222223= new DetaLabel("乳酸lact:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*4, 32+ 25*9, 100, 20);
		JTextField label610222223_box= new JTextField();
		label610222223_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
		label610222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label7222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "乳酸LACT过高。见于缺氧，酸中毒，休克，严重贫血，肺功能不全，肌肉痉挛，糖尿病，剧烈运动";
				String reportj= "";

				if(temp_double>18) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 5.4) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label610222223);
		this.add(label610222223_box);	
		//11
		DetaLabel label611222223= new DetaLabel("肿瘤标记抗原242检测ca242:");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*4, 32+ 25*10, 100, 20);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= label611222223_box.getText();
				double temp_double= Double.valueOf(temp);
				String reportz= "";
				String reportj= "主要用于胰腺癌、结直肠癌的诊断与鉴别";

				if(temp_double> 260) {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportz)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportz);	
				}else if(temp_double< 22) {	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));	
					诊断结果_box.setText(诊断结果_box.getText().contains(reportj)
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ reportj);	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace(reportz, ""));	
					诊断结果_box.setText(诊断结果_box.getText().replace(reportj, ""));		
				}	
			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		DetaLabel label612222223= new DetaLabel("钙ca:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*4, 32+ 25*11, 100, 20);
		JTextField label612222223_box= new JTextField();
		label612222223_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
		label612222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label612222223_box
						, "降低：常见于维生素D缺乏，佝楼病，软骨病，小儿手足抽搐症，老年骨质疏松，甲状旁腺功能减退，慢性肾炎，尿毒症，低钙饮食及吸收不良" 
						, "增高：见于骨肿瘤，甲状旁腺机能亢进，急性骨萎缩，肾上腺皮脂功能减退及维生素D摄入过量等。"
						, "" 
						,8.5 ,11, 诊断结果_box
						, "");
			}
		});
		this.add(label612222223);
		this.add(label612222223_box);	
		//13
		DetaLabel label613222223= new DetaLabel("巨噬细胞感染趋化因子-1βmip-1β:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*4, 32+ 25*12, 100, 20);
		JTextField label613222223_box= new JTextField();
		label613222223_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
		label613222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label613222223);
		this.add(label613222223_box);	
		//14
		DetaLabel label614222223= new DetaLabel("尿17-羟固醇17-oh:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*4, 32+ 25*13, 100, 20);
		JTextField label614222223_box= new JTextField();
		label614222223_box.setBounds(10+ 110+ 220* 4, 33+ 25* 13, 80, 20);
		label614222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label614222223_box
						, "降低：见于上腺皮质功能不全，如阿狄森氏病等" 
						, "增高：见于柯兴氏综合症，肥胖症，甲亢，肾上腺皮功能亢进，尤以其肿瘤升高显著。"
						, "" ,3 ,11, 诊断结果_box, "");
			}
		});
		this.add(label614222223);
		this.add(label614222223_box);	
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
	void addFourthColomns(JTextField 诊断结果_box) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai222223= new DetaLabel("ldh同工酶is0-ldh:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*3, 32+ 0, 100, 20);
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		DetaLabel label2222223= new DetaLabel("胰岛素ins:");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*3, 32+ 25*1, 100, 20);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		DetaLabel label3222223= new DetaLabel("同t:");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*3, 32+ 25*2, 100, 20);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		DetaLabel label4222223= new DetaLabel("淀粉酶amy:");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+220*3, 32+ 25* 3, 100, 20);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label4222223_box
						, "降低：见于肝脏疾病，如肝癌，肝硬化。"
						, "增高：见于急慢性胰腺炎，胰腺癌，胆道疾病，胃穿孔，肠梗阻，腮腺炎，唾液腺炎等。" 
						,"" ,110 ,110, 诊断结果_box, "");
			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		DetaLabel label5222223= new DetaLabel("乳酸脱氢酶ldh:");  
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

		DetaLabel label6222223= new DetaLabel("铁tron:");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*3, 32+ 25*5, 100, 20);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		DetaLabel label7222223= new DetaLabel("酸性磷酸酶和酒石酸l+:");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*3, 32+ 25*6, 100, 20);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		DetaLabel label68222223= new DetaLabel("粒细胞刺激因子g-csf:");  
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
		DetaLabel label69222223= new DetaLabel("雌激素el:");  
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
		DetaLabel label610222223= new DetaLabel("同工酶ck-mb:");  
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
		DetaLabel label611222223= new DetaLabel("尿渗透压尿osm:");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*3, 32+ 25*10, 100, 20);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label611222223_box
						, "稀释，可反应远曲肾小管的浓缩稀释症等疾病的诊断及鉴别诊断"
						, "浓稠，可反应远曲肾小管的浓缩稀释症等疾病的诊断及鉴别诊断" 
						, "" 
						,600, 800, 诊断结果_box
						, "");
			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		DetaLabel label612222223= new DetaLabel("结核印迹试验tb-poc:");  
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
		DetaLabel label613222223= new DetaLabel("腺苷脱氨酸ada:");  
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
		DetaLabel label614222223= new DetaLabel("尖锐湿疣醋酸白:");  
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

	private void addThirdColomns(JTextField 诊断结果_box) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai222223= new DetaLabel("疥疮镜检sarcoptesscabidiexamination:");  
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10+220*2, 32+ 0, 100, 20);
		JTextField baiDanBai222223_box= new JTextField();
		baiDanBai222223_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
		baiDanBai222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);	

		DetaLabel label2222223= new DetaLabel("白色念珠菌抗体:");  
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10+220*2, 32+ 25*1, 100, 20);
		JTextField label2222223_box= new JTextField();
		label2222223_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
		label2222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label2222223);
		this.add(label2222223_box);	

		DetaLabel label3222223= new DetaLabel("总胆红质tbil:");  
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10+220*2, 32+ 25*2, 100, 20);
		JTextField label3222223_box= new JTextField();
		label3222223_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
		label3222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label3222223);
		this.add(label3222223_box);	

		DetaLabel label4222223= new DetaLabel("直接胆红质dbil:");  
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10+220*2, 32+ 25* 3, 100, 20);
		JTextField label4222223_box= new JTextField();
		label4222223_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
		label4222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label4222223_box
						, ""
						, "增高：常见于阻塞性黄疸，肝癌，胰头癌，胆石症等" 
						, "" 
						,0, 0.4, 诊断结果_box
						, "");
			}
		});
		this.add(label4222223);
		this.add(label4222223_box);	

		DetaLabel label5222223= new DetaLabel("斑贴试验patchtest:");  
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10+220*2, 32+ 25*4, 100, 20);
		JTextField label5222223_box= new JTextField();
		label5222223_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
		label5222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label5222223);
		this.add(label5222223_box);	

		DetaLabel label6222223= new DetaLabel("血镁mg:");  
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10+220*2, 32+ 25*5, 100, 20);
		JTextField label6222223_box= new JTextField();
		label6222223_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
		label6222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label6222223);
		this.add(label6222223_box);	

		//7
		DetaLabel label7222223= new DetaLabel("甲肝抗体-igmhav-igmigmhav-igm:");  
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10+220*2, 32+ 25*6, 100, 20);
		JTextField label7222223_box= new JTextField();
		label7222223_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
		label7222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label7222223);
		this.add(label7222223_box);	
		//8
		DetaLabel label68222223= new DetaLabel("肌酸激酶ck:");  
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10+220*2, 32+ 25*7, 100, 20);
		JTextField label68222223_box= new JTextField();
		label68222223_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
		label68222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label68222223_box
						, "过低"
						, "增高：心梗4-6小时开始升高，18-36小时可达正常值的20-30倍，为最高峰，2-4天恢复正常，另外，病毒性心肌炎，皮肌炎，肌肉损伤，肌营养不良，心包炎，脑血管意外及心脏手术等都可以使CK增高" 
						, "" 
						, 25, 200, 诊断结果_box
						, "");
			}
		});
		this.add(label68222223);
		this.add(label68222223_box);	
		//9
		DetaLabel label69222223= new DetaLabel("胆固醇tc:");  
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10+220*2, 32+ 25*8, 100, 20);
		JTextField label69222223_box= new JTextField();
		label69222223_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
		label69222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label69222223);
		this.add(label69222223_box);	
		//10
		DetaLabel label610222223= new DetaLabel("高密度脂蛋白hdl-c:");  
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10+220*2, 32+ 25*9, 100, 20);
		JTextField label610222223_box= new JTextField();
		label610222223_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
		label610222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label610222223_box
						, "降低：见于脑血管病，冠心病，高TG血症，严重疾病或手术后，吸烟，缺少运动等。"
						, "" 
						, "" 
						,35, 70, 诊断结果_box
						, "");

			}
		});
		this.add(label610222223);
		this.add(label610222223_box);	
		//11
		DetaLabel label611222223= new DetaLabel("rents:");  
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10+220*2, 32+ 25*10, 100, 20);
		JTextField label611222223_box= new JTextField();
		label611222223_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
		label611222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label611222223);
		this.add(label611222223_box);	
		//12
		DetaLabel label612222223= new DetaLabel("肌酐cre:");  
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10+220*2, 32+ 25*11, 100, 20);
		JTextField label612222223_box= new JTextField();
		label612222223_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
		label612222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label612222223);
		this.add(label612222223_box);	
		//13
		DetaLabel label613222223= new DetaLabel("巨细胞病毒igm抗体定性cmc:");  
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10+220*2, 32+ 25*12, 100, 20);
		JTextField label613222223_box= new JTextField();
		label613222223_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
		label613222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label613222223);
		this.add(label613222223_box);	
		//14
		DetaLabel label614222223= new DetaLabel("叶酸:");  
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10+220*2, 32+ 25*13, 100, 20);
		JTextField label614222223_box= new JTextField();
		label614222223_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
		label614222223_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label614222223_box
						, "降低：贫血。"
						, "" 
						, "" 
						, 3, 17, 诊断结果_box
						, "");
			}
		});
		this.add(label614222223);
		this.add(label614222223_box);	
	}

	private void addSecondColomns(JTextField 诊断结果_box) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel baiDanBai22= new DetaLabel("磷（尿）:");  
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10+220*1, 32+ 0, 100, 20);
		JTextField baiDanBai22_box= new JTextField();
		baiDanBai22_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
		baiDanBai22_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(baiDanBai22_box
						, "降低：见于甲状旁腺机能减退，肾病引起的尿毒症"
						, "增高：见于甲状旁腺机能亢进" 
						, "" 
						,23, 48, 诊断结果_box
						, "");
			}
		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);	

		DetaLabel label222= new DetaLabel("基质细胞源性因子-1sdf-1:");  
		label222.setForeground(Color.WHITE);
		label222.setBounds(10+220*1, 32+ 25*1, 100, 20);
		JTextField label222_box= new JTextField();
		label222_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
		label222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label222);
		this.add(label222_box);	

		DetaLabel label322= new DetaLabel("栽脂蛋白eapoe:");  
		label322.setForeground(Color.WHITE);
		label322.setBounds(10+220*1, 32+ 25*2, 100, 20);
		JTextField label322_box= new JTextField();
		label322_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
		label322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label322);
		this.add(label322_box);	

		DetaLabel label422= new DetaLabel("甘油三酯tg:");  
		label422.setForeground(Color.WHITE);
		label422.setBounds(10+220*1, 32+ 25* 3, 100, 20);
		JTextField label422_box= new JTextField();
		label422_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
		label422_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label422_box
						, "降低：见于甲亢，肾上腺皮质功能低下，肝实质性病变，原发性β脂蛋白缺乏及吸收不良。"
						, "增高：可由遗传，饮食因素或继发于某些疾病，如糖尿病，肾病等。" 
						, "" 
						,50, 150, 诊断结果_box
						, "");
			}
		});
		this.add(label422);
		this.add(label422_box);	

		DetaLabel label522= new DetaLabel("cl（胸水）:");  
		label522.setForeground(Color.WHITE);
		label522.setBounds(10+220*1, 32+ 25*4, 100, 20);
		JTextField label522_box= new JTextField();
		label522_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
		label522_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label522_box
						, "降低：常见于结核性脑膜炎，化脓性脑膜炎"
						, "尿毒症病人脑脊液氯化物长高" 
						, "" 
						,119, 129, 诊断结果_box
						, "");
			}
		});
		this.add(label522);
		this.add(label522_box);	

		DetaLabel label622= new DetaLabel("巨噬细胞感染趋化因子-1αmip-1α:");  
		label622.setForeground(Color.WHITE);
		label622.setBounds(10+220*1, 32+ 25*5, 100, 20);
		JTextField label622_box= new JTextField();
		label622_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
		label622_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label622);
		this.add(label622_box);	

		//7
		DetaLabel label722= new DetaLabel("纳na:");  
		label722.setForeground(Color.WHITE);
		label722.setBounds(10+220*1, 32+ 25*6, 100, 20);
		JTextField label722_box= new JTextField();
		label722_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
		label722_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label722_box
						, "降低：1.肾皮质功能不全，重症肾盂肾炎，糖尿病。2.胃肠道引流，呕吐及腹泻。3.肮利尿激素过多。"
						, "增高：1.严重脱水，大量出汗，高烧，烧伤，糖尿病性多尿。2.肾上腺皮质功能亢进，原发及继发性醛固酮增多病。" 
						, "" 
						,135, 145, 诊断结果_box
						, "");
			}
		});
		this.add(label722);
		this.add(label722_box);	
		//8
		DetaLabel label6822= new DetaLabel("尿17-酮类固醇17-ks:");  
		label6822.setForeground(Color.WHITE);
		label6822.setBounds(10+220*1, 32+ 25*7, 100, 20);
		JTextField label6822_box= new JTextField();
		label6822_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
		label6822_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label6822_box
						, "降低：见于上腺皮质功能不全，如阿狄森氏病等。"
						, "增高：见于柯兴氏综合症，肥胖症，甲亢，肾上腺皮功能亢进，尤以其肿瘤升高显著。" 
						, "" 
						,3, 11, 诊断结果_box
						, "");
			}
		});
		this.add(label6822);
		this.add(label6822_box);	
		//9
		DetaLabel label6922= new DetaLabel("胆汁酸tba:");  
		label6922.setForeground(Color.WHITE);
		label6922.setBounds(10+220*1, 32+ 25*8, 100, 20);
		JTextField label6922_box= new JTextField();
		label6922_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
		label6922_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label6922_box
						, ""
						, "增高：急慢性肝炎，肝硬化，阻塞性黄疸及药物引起肝损害时。" 
						, "" 
						,0, 10, 诊断结果_box
						, "");
			}
		});
		this.add(label6922);
		this.add(label6922_box);	
		//10
		DetaLabel label61022= new DetaLabel("血浆维生素b12vb12:");  
		label61022.setForeground(Color.WHITE);
		label61022.setBounds(10+220*1, 32+ 25*9, 100, 20);
		JTextField label61022_box= new JTextField();
		label61022_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
		label61022_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(label61022);
		this.add(label61022_box);	
		//11
		DetaLabel label61122= new DetaLabel("血糖glu:");  
		label61122.setForeground(Color.WHITE);
		label61122.setBounds(10+220*1, 32+ 25*10, 100, 20);
		JTextField label61122_box= new JTextField();
		label61122_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
		label61122_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label61122_box
						, "过低"
						, "增高：某些生理因素（情绪紧张，饭后1-2小时）及注射肾上腺素后，病理性增高见于各种糖尿病，慢性胰腺炎，心梗，甲亢，垂体前叶嗜酸性细胞瘤，颅内出血，颅外伤等。" 
						, "" 
						,70, 110, 诊断结果_box
						, "");
			}
		});
		this.add(label61122);
		this.add(label61122_box);	
		//12
		DetaLabel label61222= new DetaLabel("24小时合成率igg:");  
		label61222.setForeground(Color.WHITE);
		label61222.setBounds(10+220*1, 32+ 25*11, 100, 20);
		JTextField label61222_box= new JTextField();
		label61222_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
		label61222_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label61222_box
						, "鞘内免疫病观测指标低"
						, "鞘内免疫病观测指标高" 
						, "" 
						,3, 9, 诊断结果_box
						, "");
			}
		});
		this.add(label61222);
		this.add(label61222_box);	
		//13
		DetaLabel label61322= new DetaLabel("谷丙转氨酶alt:");  
		label61322.setForeground(Color.WHITE);
		label61322.setBounds(10+220*1, 32+ 25*12, 100, 20);
		JTextField label61322_box= new JTextField();
		label61322_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
		label61322_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(label61322_box
						, ""
						, "增高：常见于急慢性肝炎，药物性肝损伤，脂肪肝，肝硬化，心梗，胆道疾病等。" 
						, "" 
						,5, 40, 诊断结果_box
						, "");
			}
		});
		this.add(label61322);
		this.add(label61322_box);	
		//14
		DetaLabel label61422= new DetaLabel("胰岛细胞抗体ica:");  
		label61422.setForeground(Color.WHITE);
		label61422.setBounds(10+220*1, 32+ 25*13, 100, 20);
		JTextField label61422_box= new JTextField();
		label61422_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
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
}
