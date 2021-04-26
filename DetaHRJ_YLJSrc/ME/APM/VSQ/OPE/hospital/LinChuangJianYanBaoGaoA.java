package ME.APM.VSQ.OPE.hospital;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import MVQ.button.DetaButton;
import MVQ.label.DetaIndexLabel;
import MVQ.label.DetaLabel;

public class LinChuangJianYanBaoGaoA extends JPanel implements MouseListener, KeyListener
, ActionListener, MouseMotionListener{
	//今天准备把医学检验报告的单位进行格式化 规范化,等下开始 20210401
	//罗瑶光
	public List<DetaLabel> jFrameList;
	public boolean target= false;
	private static final long serialVersionUID = 1L;
	public LinChuangJianYanBaoGaoA(JTextPane name, List<DetaLabel> jFrameListRefer){
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);
		this.jFrameList= jFrameListRefer;
		this.addMouseMotionListener(this);
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

		//index
		JLabel 索引= new JLabel("索引 : ");  
		索引.setForeground(Color.WHITE);
		索引.setBounds(0, 1, 35, 25);  
		this.add(索引);

		String 索引s= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i= 0; i< 索引s.length(); i++) {
			DetaIndexLabel 索引temp= new DetaIndexLabel(" "+ 索引s.charAt(i)+ " ", jFrameList);  
			索引temp.setForeground(Color.WHITE);
			索引temp.setBounds(10+ 25*(i+ 1), 1, 25, 25);  
			索引temp.setIndex(""+ 索引s.charAt(i));
			this.add(索引temp);
		}
			
		//copy tab
		DetaLabel baiDanBai= new DetaLabel("白蛋白alb:");  
		baiDanBai.setForeground(Color.WHITE);
		baiDanBai.setBounds(10, 32+ 25*0, 100, 25);  
		baiDanBai.indexString= "BDAL";
		baiDanBai.setTag("西医检验：白蛋白ALB->临床意义:鞘内免疫病观测指标鞘内免疫病观测指标->实验室检查:血3350-4765mg/dl脑脊液13.4-23.7mg/dl", true);
		jFrameList.add(baiDanBai);
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

		DetaLabel 乙肝两对半= new DetaLabel("乙肝两对半hbcab:");
		乙肝两对半.setForeground(Color.WHITE);
		乙肝两对半.indexString= "YGLDBHBCAB";
		乙肝两对半.setBounds(10, 32+ 25*1, 100, 25);
		乙肝两对半.setTag("西医检验：乙肝两对半HbcAb->临床意义:->实验室检查:阴性", true);
		jFrameList.add(乙肝两对半);
		JTextField 乙肝两对半_box= new JTextField();
		乙肝两对半_box.setBounds(10+ 110, 33+ 25*1, 80, 20);
		乙肝两对半_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 乙肝两对半_box.getText();
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
		this.add(乙肝两对半);
		this.add(乙肝两对半_box);	
		DetaLabel 糖耐量实验= new DetaLabel("糖耐量实验:");
		糖耐量实验.indexString= "TNLSY";
		糖耐量实验.setForeground(Color.WHITE);
		糖耐量实验.setBounds(10, 32+ 25*2, 100, 25);
		jFrameList.add(糖耐量实验);
		JTextField 糖耐量实验_box= new JTextField();
		糖耐量实验_box.setBounds(10+ 110, 33+ 25*2, 80, 20);
		糖耐量实验_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 糖耐量实验_box.getText();
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
		this.add(糖耐量实验);
		this.add(糖耐量实验_box);	

		DetaLabel 螨虫镜检= new DetaLabel("螨虫镜检:");
		螨虫镜检.setForeground(Color.WHITE);
		螨虫镜检.setBounds(10, 32+ 25* 3, 100, 20);jFrameList.add(螨虫镜检);
		螨虫镜检.indexString= "MCJ";
		JTextField 螨虫镜检_box= new JTextField();
		螨虫镜检_box.setBounds(10+ 110, 33+ 25* 3, 80, 20);
		螨虫镜检_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 螨虫镜检_box.getText();
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
		this.add(螨虫镜检);
		this.add(螨虫镜检_box);	

		DetaLabel 性病支原体= new DetaLabel("性病支原体检测（uu）:");
		性病支原体.setForeground(Color.WHITE);
		性病支原体.setBounds(10, 32+ 25*4, 100, 20);jFrameList.add(性病支原体);
		性病支原体.indexString= "XBZYTU";
		JTextField 性病支原体_box= new JTextField();
		性病支原体_box.setBounds(10+ 110, 33+ 25*4, 80, 20);
		性病支原体_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 性病支原体_box.getText();
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
		this.add(性病支原体);
		this.add(性病支原体_box);	

		DetaLabel 低密度脂蛋白= new DetaLabel("低密度脂蛋白ldl-c:");  
		低密度脂蛋白.setForeground(Color.WHITE);
		低密度脂蛋白.setBounds(10, 32+ 25*5, 100, 20);jFrameList.add(低密度脂蛋白);
		低密度脂蛋白.indexString= "DMZBLDLC";
		JTextField 低密度脂蛋白_box= new JTextField();
		低密度脂蛋白_box.setBounds(10+ 110, 33+ 25*5, 80, 20);
		低密度脂蛋白_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp=低密度脂蛋白_box.getText();
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
		this.add(低密度脂蛋白);
		this.add(低密度脂蛋白_box);	

		//7
		DetaLabel 血氨= new DetaLabel("血氨nh3:");  
		血氨.setForeground(Color.WHITE);
		血氨.setBounds(10, 32+ 25*6, 100, 20);jFrameList.add(血氨);
		血氨.indexString= "XANH";
		JTextField 血氨_box= new JTextField();
		血氨_box.setBounds(10+ 110, 33+ 25*6, 80, 20);
		血氨_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 血氨_box.getText();
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
		this.add(血氨);
		this.add(血氨_box);	
		//8
		DetaLabel 胰岛素抗体= new DetaLabel("胰岛素抗体ins-ab:");  
		胰岛素抗体.setForeground(Color.WHITE);
		胰岛素抗体.setBounds(10, 32+ 25*7, 100, 20);jFrameList.add(胰岛素抗体);
		胰岛素抗体.indexString= "YDSKTINSAB";
		JTextField 胰岛素抗体_box= new JTextField();
		胰岛素抗体_box.setBounds(10+ 110, 33+ 25*7, 80, 20);
		胰岛素抗体_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 胰岛素抗体_box.getText();
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
		this.add(胰岛素抗体);
		this.add(胰岛素抗体_box);	
		//9
		DetaLabel 钾尿= new DetaLabel("钾（尿）钾（尿）:");  
		钾尿.setForeground(Color.WHITE);
		钾尿.setBounds(10, 32+ 25*8, 100, 20);jFrameList.add(钾尿);
		钾尿.indexString= "KAJN";
		JTextField 钾尿_box= new JTextField();
		钾尿_box.setBounds(10+ 110, 33+ 25*8, 80, 20);
		钾尿_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 钾尿_box.getText();
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
		this.add(钾尿);
		this.add(钾尿_box);	
		//10
		DetaLabel 磷= new DetaLabel("磷ip:");  
		磷.setForeground(Color.WHITE);
		磷.setBounds(10, 32+ 25*9, 100, 20);jFrameList.add(磷);
		磷.indexString= "LIP";
		JTextField 磷_box= new JTextField();
		磷_box.setBounds(10+ 110, 33+ 25*9, 80, 20);
		磷_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 磷_box.getText();
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
		this.add(磷);
		this.add(磷_box);	
		//11
		DetaLabel 氯尿= new DetaLabel("氯（尿）氯（尿）:");  
		氯尿.setForeground(Color.WHITE);
		氯尿.setBounds(10, 32+ 25*10, 100, 20);jFrameList.add(氯尿);
		氯尿.indexString= "CLN";
		JTextField 氯尿_box= new JTextField();
		氯尿_box.setBounds(10+ 110, 33+ 25*10, 80, 20);
		氯尿_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 氯尿_box.getText();
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
		this.add(氯尿);
		this.add(氯尿_box);	
		//12
		DetaLabel 肌钙蛋白= new DetaLabel("肌钙蛋白ttnt:");  
		肌钙蛋白.setForeground(Color.WHITE);
		肌钙蛋白.setBounds(10, 32+ 25*11, 100, 20);jFrameList.add(肌钙蛋白);
		肌钙蛋白.indexString= "JGDBTTNT";
		JTextField 肌钙蛋白_box= new JTextField();
		肌钙蛋白_box.setBounds(10+ 110, 33+ 25*11, 80, 20);
		肌钙蛋白_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 肌钙蛋白_box.getText();
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
		this.add(肌钙蛋白);
		this.add(肌钙蛋白_box);	
		//13
		DetaLabel 钠尿= new DetaLabel("钠（尿）钠（尿）:");  
		钠尿.setForeground(Color.WHITE);
		钠尿.setBounds(10, 32+ 25*12, 100, 20);jFrameList.add(钠尿);
		钠尿.indexString= "NA";
		JTextField 钠尿_box= new JTextField();
		钠尿_box.setBounds(10+ 110, 33+ 25*12, 80, 20);
		钠尿_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 钠尿_box.getText();
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
		this.add(钠尿);
		this.add(钠尿_box);	
		//14
		DetaLabel 碱性磷酸酶= new DetaLabel("碱性磷酸酶alp:");  
		碱性磷酸酶.setForeground(Color.WHITE);
		碱性磷酸酶.setBounds(10, 32+ 25*13, 100, 20);jFrameList.add(碱性磷酸酶);
		碱性磷酸酶.indexString= "JXLSMALP";
		JTextField 碱性磷酸酶_box= new JTextField();
		碱性磷酸酶_box.setBounds(10+ 110, 33+ 25*13, 80, 20);
		碱性磷酸酶_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 碱性磷酸酶_box.getText();
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
		this.add(碱性磷酸酶);
		this.add(碱性磷酸酶_box);	
		//
		addSecondColomns(诊断结果_box, jFrameList);
		addThirdColomns(诊断结果_box, jFrameList);
		addFourthColomns(诊断结果_box, jFrameList);
		addFifthColomns(诊断结果_box, jFrameList);
		this.validate();
	}
	private void addFifthColomns(JTextField 诊断结果_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel 血渗透压血osm= new DetaLabel("血渗透压血osm:");  
		血渗透压血osm.setForeground(Color.WHITE);
		血渗透压血osm.setBounds(10+220*4, 32+ 0, 100, 20);jFrameList.add(血渗透压血osm);
		血渗透压血osm.indexString= "XSTYOM";
		JTextField 血渗透压血osm_box= new JTextField();
		血渗透压血osm_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
		血渗透压血osm_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 血渗透压血osm_box.getText();
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
		this.add(血渗透压血osm);
		this.add(血渗透压血osm_box);	

		DetaLabel 肌酐清除率= new DetaLabel("肌酐清除率cor:");  
		肌酐清除率.setForeground(Color.WHITE);
		肌酐清除率.setBounds(10+220*4, 32+ 25*1, 100, 20);jFrameList.add(肌酐清除率);
		肌酐清除率.indexString= "JGQCLOR";
		JTextField 肌酐清除率_box= new JTextField();
		肌酐清除率_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
		肌酐清除率_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 肌酐清除率_box.getText();
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
		this.add(肌酐清除率);
		this.add(肌酐清除率_box);	

		DetaLabel 血尿铜= new DetaLabel("血（尿）铜cu:");  
		血尿铜.setForeground(Color.WHITE);
		血尿铜.setBounds(10+220*4, 32+ 25*2, 100, 20);jFrameList.add(血尿铜);
		血尿铜.indexString= "XTNCU";
		JTextField 血尿铜_box= new JTextField();
		血尿铜_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
		血尿铜_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 血尿铜_box.getText();
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
		this.add(血尿铜);
		this.add(血尿铜_box);	

		DetaLabel 组分区带igg= new DetaLabel("组分区带igg:");  
		组分区带igg.setForeground(Color.WHITE);
		组分区带igg.setBounds(10+ 220*4, 32+ 25* 3, 100, 20);jFrameList.add(组分区带igg);
		组分区带igg.indexString= "ZFQDIG";
		JTextField 组分区带igg_box= new JTextField();
		组分区带igg_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
		组分区带igg_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 组分区带igg_box.getText();
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
		this.add(组分区带igg);
		this.add(组分区带igg_box);	

		DetaLabel 甲状旁腺激素pth= new DetaLabel("甲状旁腺激素pth:");  
		甲状旁腺激素pth.setForeground(Color.WHITE);
		甲状旁腺激素pth.setBounds(10+220*4, 32+ 25*4, 100, 20);jFrameList.add(甲状旁腺激素pth);
		甲状旁腺激素pth.indexString= "JZPXSPTH";
		JTextField 甲状旁腺激素pth_box= new JTextField();
		甲状旁腺激素pth_box.setBounds(10+ 110+220*4, 33+ 25*4, 80, 20);
		甲状旁腺激素pth_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 甲状旁腺激素pth_box.getText();
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
		this.add(甲状旁腺激素pth);
		this.add(甲状旁腺激素pth_box);	

		DetaLabel 羟基苦杏仁酸= new DetaLabel("尿3-甲氧基4-羟基苦杏仁酸（vma）:");  
		羟基苦杏仁酸.setForeground(Color.WHITE);
		羟基苦杏仁酸.setBounds(10+220*4, 32+ 25*5, 100, 20);jFrameList.add(羟基苦杏仁酸);
		羟基苦杏仁酸.indexString= "NYQJKXRSVMA";
		JTextField 羟基苦杏仁酸_box= new JTextField();
		羟基苦杏仁酸_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
		羟基苦杏仁酸_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 羟基苦杏仁酸_box.getText();
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
		this.add(羟基苦杏仁酸);
		this.add(羟基苦杏仁酸_box);	

		//7
		DetaLabel 载脂蛋白ap0= new DetaLabel("载脂蛋白ap0alap0al:");  
		载脂蛋白ap0.setForeground(Color.WHITE);
		载脂蛋白ap0.setBounds(10+220*4, 32+ 25*6, 100, 20);jFrameList.add(载脂蛋白ap0);
		载脂蛋白ap0.indexString= "ZDBAPL";
		JTextField 载脂蛋白ap0_box= new JTextField();
		载脂蛋白ap0_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
		载脂蛋白ap0_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 载脂蛋白ap0_box.getText();
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
		this.add(载脂蛋白ap0);
		this.add(载脂蛋白ap0_box);	
		//8
		DetaLabel 肌钙蛋白itni= new DetaLabel("肌钙蛋白itni:");  
		肌钙蛋白itni.setForeground(Color.WHITE);
		肌钙蛋白itni.setBounds(10+220*4, 32+ 25*7, 100, 20);jFrameList.add(肌钙蛋白itni);
		肌钙蛋白itni.indexString= "JGDBIYNT";
		JTextField 肌钙蛋白itni_box= new JTextField();
		肌钙蛋白itni_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
		肌钙蛋白itni_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 肌钙蛋白itni_box.getText();
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
		this.add(肌钙蛋白itni);
		this.add(肌钙蛋白itni_box);	
		//9
		DetaLabel 氯醋酸萘酚= new DetaLabel("氯醋酸萘酚as-d酯酶染色:");  
		氯醋酸萘酚.setForeground(Color.WHITE);
		氯醋酸萘酚.setBounds(10+220*4, 32+ 25*8, 100, 20);jFrameList.add(氯醋酸萘酚);
		氯醋酸萘酚.indexString= "LCSNFADZMR";
		JTextField 氯醋酸萘酚_box= new JTextField();
		氯醋酸萘酚_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
		氯醋酸萘酚_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 氯醋酸萘酚_box.getText();
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
		this.add(氯醋酸萘酚);
		this.add(氯醋酸萘酚_box);	
		//10
		DetaLabel 乳酸lact= new DetaLabel("乳酸lact:");  
		乳酸lact.setForeground(Color.WHITE);
		乳酸lact.setBounds(10+220*4, 32+ 25*9, 100, 20);jFrameList.add(乳酸lact);
		乳酸lact.indexString= "RSLACT";
		JTextField 乳酸lact_box= new JTextField();
		乳酸lact_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
		乳酸lact_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 乳酸lact_box.getText();
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
		this.add(乳酸lact);
		this.add(乳酸lact_box);	
		//11
		DetaLabel 肿瘤标记抗原= new DetaLabel("肿瘤标记抗原242检测ca242:");  
		肿瘤标记抗原.setForeground(Color.WHITE);
		肿瘤标记抗原.setBounds(10+220*4, 32+ 25*10, 100, 20);jFrameList.add(肿瘤标记抗原);
		肿瘤标记抗原.indexString= "ZLBJKYCA";
		JTextField 肿瘤标记抗原_box= new JTextField();
		肿瘤标记抗原_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
		肿瘤标记抗原_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 肿瘤标记抗原_box.getText();
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
		this.add(肿瘤标记抗原);
		this.add(肿瘤标记抗原_box);	
		//12
		DetaLabel 钙ca= new DetaLabel("钙ca:");  
		钙ca.setForeground(Color.WHITE);
		钙ca.setBounds(10+220*4, 32+ 25*11, 100, 20);jFrameList.add(钙ca);
		钙ca.indexString= "GCA";
		JTextField 钙ca_box= new JTextField();
		钙ca_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
		钙ca_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(钙ca_box
						, "降低：常见于维生素D缺乏，佝楼病，软骨病，小儿手足抽搐症，老年骨质疏松，甲状旁腺功能减退，慢性肾炎，尿毒症，低钙饮食及吸收不良" 
						, "增高：见于骨肿瘤，甲状旁腺机能亢进，急性骨萎缩，肾上腺皮脂功能减退及维生素D摄入过量等。"
						, "" 
						,8.5 ,11, 诊断结果_box
						, "");
			}
		});
		this.add(钙ca);
		this.add(钙ca_box);	
		//13
		DetaLabel 巨噬细胞感染趋化因子= new DetaLabel("巨噬细胞感染趋化因子-1βmip-1β:");  
		巨噬细胞感染趋化因子.setForeground(Color.WHITE);
		巨噬细胞感染趋化因子.setBounds(10+220*4, 32+ 25*12, 100, 20);jFrameList.add(巨噬细胞感染趋化因子);
		巨噬细胞感染趋化因子.indexString= "JSXBGRQHYZBMIP";
		JTextField 巨噬细胞感染趋化因子_box= new JTextField();
		巨噬细胞感染趋化因子_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
		巨噬细胞感染趋化因子_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(巨噬细胞感染趋化因子);
		this.add(巨噬细胞感染趋化因子_box);	
		//14
		DetaLabel 羟固醇17= new DetaLabel("尿17-羟固醇17-oh:");  
		羟固醇17.setForeground(Color.WHITE);
		羟固醇17.setBounds(10+220*4, 32+ 25*13, 100, 20);jFrameList.add(羟固醇17);
		羟固醇17.indexString= "QGCOH";
		JTextField 羟固醇17_box= new JTextField();
		羟固醇17_box.setBounds(10+ 110+ 220* 4, 33+ 25* 13, 80, 20);
		羟固醇17_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(羟固醇17_box
						, "降低：见于上腺皮质功能不全，如阿狄森氏病等" 
						, "增高：见于柯兴氏综合症，肥胖症，甲亢，肾上腺皮功能亢进，尤以其肿瘤升高显著。"
						, "" ,3 ,11, 诊断结果_box, "");
			}
		});
		this.add(羟固醇17);
		this.add(羟固醇17_box);	
	}

	protected void printValue(JTextField 结核印迹试验_box, String minString, String maxString, String elseString
			, double min, double max, JTextField 诊断结果_box, String yinyang) {
		//加状态；
		String temp= 结核印迹试验_box.getText();
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
	void addFourthColomns(JTextField 诊断结果_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel ldh同工酶is= new DetaLabel("ldh同工酶is0-ldh:");  
		ldh同工酶is.setForeground(Color.WHITE);
		ldh同工酶is.setBounds(10+220*3, 32+ 0, 100, 20);jFrameList.add(ldh同工酶is);
		ldh同工酶is.indexString= "LDHTGMIS";
		JTextField ldh同工酶is_box= new JTextField();
		ldh同工酶is_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
		ldh同工酶is_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(ldh同工酶is);
		this.add(ldh同工酶is_box);	

		DetaLabel 胰岛素ins= new DetaLabel("胰岛素ins:");  
		胰岛素ins.setForeground(Color.WHITE);
		胰岛素ins.setBounds(10+220*3, 32+ 25*1, 100, 20);jFrameList.add(胰岛素ins);
		胰岛素ins.indexString= "YDSIN";
		JTextField 胰岛素ins_box= new JTextField();
		胰岛素ins_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
		胰岛素ins_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(胰岛素ins);
		this.add(胰岛素ins_box);	

		DetaLabel 同t= new DetaLabel("同t:");  
		同t.setForeground(Color.WHITE);
		同t.setBounds(10+220*3, 32+ 25*2, 100, 20);jFrameList.add(同t);
		同t.indexString= "T";
		JTextField 同t_box= new JTextField();
		同t_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
		同t_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(同t);
		this.add(同t_box);	

		DetaLabel 淀粉酶amy= new DetaLabel("淀粉酶amy:");  
		淀粉酶amy.setForeground(Color.WHITE);
		淀粉酶amy.setBounds(10+220*3, 32+ 25* 3, 100, 20);jFrameList.add(淀粉酶amy);
		淀粉酶amy.indexString= "DMFAY";
		JTextField 淀粉酶amy_box= new JTextField();
		淀粉酶amy_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
		淀粉酶amy_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(淀粉酶amy_box
						, "降低：见于肝脏疾病，如肝癌，肝硬化。"
						, "增高：见于急慢性胰腺炎，胰腺癌，胆道疾病，胃穿孔，肠梗阻，腮腺炎，唾液腺炎等。" 
						,"" ,110 ,110, 诊断结果_box, "");
			}
		});
		this.add(淀粉酶amy);
		this.add(淀粉酶amy_box);	

		DetaLabel 乳酸脱氢酶ldh= new DetaLabel("乳酸脱氢酶ldh:");  
		乳酸脱氢酶ldh.setForeground(Color.WHITE);
		乳酸脱氢酶ldh.setBounds(10+220*3, 32+ 25*4, 100, 20);jFrameList.add(乳酸脱氢酶ldh);
		乳酸脱氢酶ldh.indexString= "RSTQMLDH";
		JTextField 乳酸脱氢酶ldh_box= new JTextField();
		乳酸脱氢酶ldh_box.setBounds(10+ 110+220*3, 33+ 25*4, 80, 20);
		乳酸脱氢酶ldh_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(乳酸脱氢酶ldh);
		this.add(乳酸脱氢酶ldh_box);	

		DetaLabel 铁tron= new DetaLabel("铁tron:");  
		铁tron.setForeground(Color.WHITE);
		铁tron.setBounds(10+220*3, 32+ 25*5, 100, 20);jFrameList.add(铁tron);
		铁tron.indexString= "TRON";
		JTextField 铁tron_box= new JTextField();
		铁tron_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
		铁tron_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(铁tron);
		this.add(铁tron_box);	

		//7
		DetaLabel 酸性磷酸酶和酒石酸= new DetaLabel("酸性磷酸酶和酒石酸l+:");  
		酸性磷酸酶和酒石酸.setForeground(Color.WHITE);
		酸性磷酸酶和酒石酸.setBounds(10+220*3, 32+ 25*6, 100, 20);jFrameList.add(酸性磷酸酶和酒石酸);
		酸性磷酸酶和酒石酸.indexString= "SXLMJH";
		JTextField 酸性磷酸酶和酒石酸_box= new JTextField();
		酸性磷酸酶和酒石酸_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
		酸性磷酸酶和酒石酸_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(酸性磷酸酶和酒石酸);
		this.add(酸性磷酸酶和酒石酸_box);	
		//8
		DetaLabel 粒细胞刺激因子= new DetaLabel("粒细胞刺激因子g-csf:");  
		粒细胞刺激因子.setForeground(Color.WHITE);
		粒细胞刺激因子.setBounds(10+220*3, 32+ 25*7, 100, 20);jFrameList.add(粒细胞刺激因子);
		粒细胞刺激因子.indexString= "LXBCJYZ";
		JTextField 粒细胞刺激因子_box= new JTextField();
		粒细胞刺激因子_box.setBounds(10+ 110+220*3, 33+ 25*7, 80, 20);
		粒细胞刺激因子_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(粒细胞刺激因子);
		this.add(粒细胞刺激因子_box);	
		//9
		DetaLabel 雌激素el= new DetaLabel("雌激素el:");  
		雌激素el.setForeground(Color.WHITE);
		雌激素el.setBounds(10+220*3, 32+ 25*8, 100, 20);jFrameList.add(雌激素el);
		雌激素el.indexString= "CJSEL";
		JTextField 雌激素el_box= new JTextField();
		雌激素el_box.setBounds(10+ 110+220*3, 33+ 25*8, 80, 20);
		雌激素el_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(雌激素el);
		this.add(雌激素el_box);	
		//10
		DetaLabel 同工酶ck_mb= new DetaLabel("同工酶ck-mb:");  
		同工酶ck_mb.setForeground(Color.WHITE);
		同工酶ck_mb.setBounds(10+220*3, 32+ 25*9, 100, 20);jFrameList.add(同工酶ck_mb);
		同工酶ck_mb.indexString= "TGMCKB";
		JTextField 同工酶ck_mb_box= new JTextField();
		同工酶ck_mb_box.setBounds(10+ 110+220*3, 33+ 25*9, 80, 20);
		同工酶ck_mb_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(同工酶ck_mb);
		this.add(同工酶ck_mb_box);	
		//11
		DetaLabel 尿渗透压尿= new DetaLabel("尿渗透压尿osm:");  
		尿渗透压尿.setForeground(Color.WHITE);
		尿渗透压尿.setBounds(10+220*3, 32+ 25*10, 100, 20);jFrameList.add(尿渗透压尿);
		尿渗透压尿.indexString= "NSTY";
		JTextField 尿渗透压尿_box= new JTextField();
		尿渗透压尿_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
		尿渗透压尿_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(尿渗透压尿_box
						, "稀释，可反应远曲肾小管的浓缩稀释症等疾病的诊断及鉴别诊断"
						, "浓稠，可反应远曲肾小管的浓缩稀释症等疾病的诊断及鉴别诊断" 
						, "" 
						,600, 800, 诊断结果_box
						, "");
			}
		});
		this.add(尿渗透压尿);
		this.add(尿渗透压尿_box);	
		//12
		DetaLabel 结核印迹试验= new DetaLabel("结核印迹试验tb-poc:");  
		结核印迹试验.setForeground(Color.WHITE);
		结核印迹试验.setBounds(10+220*3, 32+ 25*11, 100, 20);jFrameList.add(结核印迹试验);
		结核印迹试验.indexString= "JHYJS";
		JTextField 结核印迹试验_box= new JTextField();
		结核印迹试验_box.setBounds(10+ 110+220*3, 33+ 25*11, 80, 20);
		结核印迹试验_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(结核印迹试验);
		this.add(结核印迹试验_box);	
		//13
		DetaLabel 腺苷脱氨酸= new DetaLabel("腺苷脱氨酸ada:");  
		腺苷脱氨酸.setForeground(Color.WHITE);
		腺苷脱氨酸.setBounds(10+220*3, 32+ 25*12, 100, 20);jFrameList.add(腺苷脱氨酸);
		腺苷脱氨酸.indexString= "XGTAS";
		JTextField 腺苷脱氨酸_box= new JTextField();
		腺苷脱氨酸_box.setBounds(10+ 110+220*3, 33+ 25*12, 80, 20);
		腺苷脱氨酸_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(腺苷脱氨酸);
		this.add(腺苷脱氨酸_box);	
		//14
		DetaLabel 尖锐湿疣醋酸白= new DetaLabel("尖锐湿疣醋酸白:");  
		尖锐湿疣醋酸白.setForeground(Color.WHITE);
		尖锐湿疣醋酸白.setBounds(10+220*3, 32+ 25*13, 100, 20);jFrameList.add(尖锐湿疣醋酸白);
		尖锐湿疣醋酸白.indexString= "JRSYCB";
		JTextField 尖锐湿疣醋酸白_box= new JTextField();
		尖锐湿疣醋酸白_box.setBounds(10+ 110+220*3, 33+ 25*13, 80, 20);
		尖锐湿疣醋酸白_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(尖锐湿疣醋酸白);
		this.add(尖锐湿疣醋酸白_box);	
	}

	private void addThirdColomns(JTextField 诊断结果_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel 疥疮镜检sarcoptes= new DetaLabel("疥疮镜检sarcoptesscabidiexamination:");  
		疥疮镜检sarcoptes.setForeground(Color.WHITE);
		疥疮镜检sarcoptes.setBounds(10+220*2, 32+ 0, 100, 20);jFrameList.add(疥疮镜检sarcoptes);
		疥疮镜检sarcoptes.indexString= "JCSAROPTESBIDXN";
		JTextField 疥疮镜检sarcoptes_box= new JTextField();
		疥疮镜检sarcoptes_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
		疥疮镜检sarcoptes_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(疥疮镜检sarcoptes);
		this.add(疥疮镜检sarcoptes_box);	

		DetaLabel 白色念珠菌抗体= new DetaLabel("白色念珠菌抗体:");  
		白色念珠菌抗体.setForeground(Color.WHITE);
		白色念珠菌抗体.setBounds(10+220*2, 32+ 25*1, 100, 20);jFrameList.add(白色念珠菌抗体);
		白色念珠菌抗体.indexString= "BSNZJKT";
		JTextField 白色念珠菌抗体_box= new JTextField();
		白色念珠菌抗体_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
		白色念珠菌抗体_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(白色念珠菌抗体);
		this.add(白色念珠菌抗体_box);	

		DetaLabel 总胆红质= new DetaLabel("总胆红质tbil:");  
		总胆红质.setForeground(Color.WHITE);
		总胆红质.setBounds(10+220*2, 32+ 25*2, 100, 20);jFrameList.add(总胆红质);
		总胆红质.indexString= "ZDHBIL";
		JTextField 总胆红质_box= new JTextField();
		总胆红质_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
		总胆红质_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(总胆红质);
		this.add(总胆红质_box);	

		DetaLabel 直接胆红质= new DetaLabel("直接胆红质dbil:");  
		直接胆红质.setForeground(Color.WHITE);
		直接胆红质.setBounds(10+220*2, 32+ 25* 3, 100, 20);jFrameList.add(直接胆红质);
		直接胆红质.indexString= "ZJDHBIL";
		JTextField 直接胆红质_box= new JTextField();
		直接胆红质_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
		直接胆红质_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(直接胆红质_box
						, ""
						, "增高：常见于阻塞性黄疸，肝癌，胰头癌，胆石症等" 
						, "" 
						,0, 0.4, 诊断结果_box
						, "");
			}
		});
		this.add(直接胆红质);
		this.add(直接胆红质_box);	

		DetaLabel 斑贴试验= new DetaLabel("斑贴试验patchtest:");  
		斑贴试验.setForeground(Color.WHITE);
		斑贴试验.setBounds(10+220*2, 32+ 25*4, 100, 20);jFrameList.add(斑贴试验);
		斑贴试验.indexString= "BTSY";
		JTextField 斑贴试验_box= new JTextField();
		斑贴试验_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
		斑贴试验_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(斑贴试验);
		this.add(斑贴试验_box);	

		DetaLabel 血镁= new DetaLabel("血镁mg:");  
		血镁.setForeground(Color.WHITE);
		血镁.setBounds(10+220*2, 32+ 25*5, 100, 20);jFrameList.add(血镁);
		血镁.indexString= "XMG";
		JTextField 血镁_box= new JTextField();
		血镁_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
		血镁_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(血镁);
		this.add(血镁_box);	

		//7
		DetaLabel 甲肝抗体= new DetaLabel("甲肝抗体-igmhav-igmigmhav-igm:");  
		甲肝抗体.setForeground(Color.WHITE);
		甲肝抗体.setBounds(10+220*2, 32+ 25*6, 100, 20);jFrameList.add(甲肝抗体);
		甲肝抗体.indexString= "JGKT";
		JTextField 甲肝抗体_box= new JTextField();
		甲肝抗体_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
		甲肝抗体_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(甲肝抗体);
		this.add(甲肝抗体_box);	
		//8
		DetaLabel 肌酸激酶= new DetaLabel("肌酸激酶ck:");  
		肌酸激酶.setForeground(Color.WHITE);
		肌酸激酶.setBounds(10+220*2, 32+ 25*7, 100, 20);jFrameList.add(肌酸激酶);
		肌酸激酶.indexString= "JSJM";
		JTextField 肌酸激酶_box= new JTextField();
		肌酸激酶_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
		肌酸激酶_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(肌酸激酶_box
						, "过低"
						, "增高：心梗4-6小时开始升高，18-36小时可达正常值的20-30倍，为最高峰，2-4天恢复正常，另外，病毒性心肌炎，皮肌炎，肌肉损伤，肌营养不良，心包炎，脑血管意外及心脏手术等都可以使CK增高" 
						, "" 
						, 25, 200, 诊断结果_box
						, "");
			}
		});
		this.add(肌酸激酶);
		this.add(肌酸激酶_box);	
		//9
		DetaLabel 胆固醇= new DetaLabel("胆固醇tc:");  
		胆固醇.setForeground(Color.WHITE);
		胆固醇.setBounds(10+220*2, 32+ 25*8, 100, 20);jFrameList.add(胆固醇);
		胆固醇.indexString= "DGC";
		JTextField 胆固醇_box= new JTextField();
		胆固醇_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
		胆固醇_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(胆固醇);
		this.add(胆固醇_box);	
		//10
		DetaLabel 高密度脂蛋白= new DetaLabel("高密度脂蛋白hdl-c:");  
		高密度脂蛋白.setForeground(Color.WHITE);
		高密度脂蛋白.setBounds(10+220*2, 32+ 25*9, 100, 20);jFrameList.add(高密度脂蛋白);
		高密度脂蛋白.indexString= "GMDB";
		JTextField 高密度脂蛋白_box= new JTextField();
		高密度脂蛋白_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
		高密度脂蛋白_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(高密度脂蛋白_box
						, "降低：见于脑血管病，冠心病，高TG血症，严重疾病或手术后，吸烟，缺少运动等。"
						, "" 
						, "" 
						,35, 70, 诊断结果_box
						, "");

			}
		});
		this.add(高密度脂蛋白);
		this.add(高密度脂蛋白_box);	
		//11
		DetaLabel rents= new DetaLabel("rents:");  
		rents.setForeground(Color.WHITE);
		rents.setBounds(10+220*2, 32+ 25*10, 100, 20);jFrameList.add(rents);
		rents.indexString= "RENT";
		JTextField rents_box= new JTextField();
		rents_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
		rents_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(rents);
		this.add(rents_box);	
		//12
		DetaLabel 肌酐= new DetaLabel("肌酐cre:");  
		肌酐.setForeground(Color.WHITE);
		肌酐.setBounds(10+220*2, 32+ 25*11, 100, 20);jFrameList.add(肌酐);
		肌酐.indexString= "JGCRE";
		JTextField 肌酐_box= new JTextField();
		肌酐_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
		肌酐_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(肌酐);
		this.add(肌酐_box);	
		//13
		DetaLabel 巨细胞病毒= new DetaLabel("巨细胞病毒igm抗体定性cmc:");  
		巨细胞病毒.setForeground(Color.WHITE);
		巨细胞病毒.setBounds(10+220*2, 32+ 25*12, 100, 20);jFrameList.add(巨细胞病毒);
		巨细胞病毒.indexString= "JXBD";
		JTextField 巨细胞病毒_box= new JTextField();
		巨细胞病毒_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
		巨细胞病毒_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(巨细胞病毒);
		this.add(巨细胞病毒_box);	
		//14
		DetaLabel 叶酸= new DetaLabel("叶酸:");  
		叶酸.setForeground(Color.WHITE);
		叶酸.setBounds(10+220*2, 32+ 25*13, 100, 20);jFrameList.add(叶酸);
		叶酸.indexString= "YS";
		JTextField 叶酸_box= new JTextField();
		叶酸_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
		叶酸_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(叶酸_box
						, "降低：贫血。"
						, "" 
						, "" 
						, 3, 17, 诊断结果_box
						, "");
			}
		});
		this.add(叶酸);
		this.add(叶酸_box);	
	}

	private void addSecondColomns(JTextField 诊断结果_box, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel 磷尿= new DetaLabel("磷（尿）:");  
		磷尿.setForeground(Color.WHITE);
		磷尿.setBounds(10+220*1, 32+ 0, 100, 20);jFrameList.add(磷尿);
		磷尿.indexString= "LN";
		JTextField 磷尿_box= new JTextField();
		磷尿_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
		磷尿_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(磷尿_box
						, "降低：见于甲状旁腺机能减退，肾病引起的尿毒症"
						, "增高：见于甲状旁腺机能亢进" 
						, "" 
						,23, 48, 诊断结果_box
						, "");
			}
		});
		this.add(磷尿);
		this.add(磷尿_box);	

		DetaLabel 基质细胞源性= new DetaLabel("基质细胞源性因子-1sdf-1:");  
		基质细胞源性.setForeground(Color.WHITE);
		基质细胞源性.setBounds(10+220*1, 32+ 25*1, 100, 20);jFrameList.add(基质细胞源性);
		基质细胞源性.indexString= "JZXBY";
		JTextField 基质细胞源性_box= new JTextField();
		基质细胞源性_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
		基质细胞源性_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(基质细胞源性);
		this.add(基质细胞源性_box);	

		DetaLabel 栽脂蛋白= new DetaLabel("栽脂蛋白eapoe:");  
		栽脂蛋白.setForeground(Color.WHITE);
		栽脂蛋白.setBounds(10+220*1, 32+ 25*2, 100, 20);jFrameList.add(栽脂蛋白);
		栽脂蛋白.indexString= "ZDBEAPOE";
		JTextField 栽脂蛋白_box= new JTextField();
		栽脂蛋白_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
		栽脂蛋白_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(栽脂蛋白);
		this.add(栽脂蛋白_box);	

		DetaLabel 甘油三酯= new DetaLabel("甘油三酯tg:");  
		甘油三酯.setForeground(Color.WHITE);
		甘油三酯.setBounds(10+220*1, 32+ 25* 3, 100, 20);jFrameList.add(甘油三酯);
		甘油三酯.indexString= "GYSZ";
		JTextField 甘油三酯_box= new JTextField();
		甘油三酯_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
		甘油三酯_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(甘油三酯_box
						, "降低：见于甲亢，肾上腺皮质功能低下，肝实质性病变，原发性β脂蛋白缺乏及吸收不良。"
						, "增高：可由遗传，饮食因素或继发于某些疾病，如糖尿病，肾病等。" 
						, "" 
						,50, 150, 诊断结果_box
						, "");
			}
		});
		this.add(甘油三酯);
		this.add(甘油三酯_box);	

		DetaLabel 胸水= new DetaLabel("cl（胸水）:");  
		胸水.setForeground(Color.WHITE);
		胸水.setBounds(10+220*1, 32+ 25*4, 100, 20);jFrameList.add(胸水);
		胸水.indexString= "CLXS";
		JTextField 胸水_box= new JTextField();
		胸水_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
		胸水_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(胸水_box
						, "降低：常见于结核性脑膜炎，化脓性脑膜炎"
						, "尿毒症病人脑脊液氯化物长高" 
						, "" 
						,119, 129, 诊断结果_box
						, "");
			}
		});
		this.add(胸水);
		this.add(胸水_box);	

		DetaLabel 巨噬细胞感染= new DetaLabel("巨噬细胞感染趋化因子-1αmip-1α:");  
		巨噬细胞感染.setForeground(Color.WHITE);
		巨噬细胞感染.setBounds(10+220*1, 32+ 25*5, 100, 20);jFrameList.add(巨噬细胞感染);
		巨噬细胞感染.indexString= "JSXBGRAMIP";
		JTextField 巨噬细胞感染_box= new JTextField();
		巨噬细胞感染_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
		巨噬细胞感染_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(巨噬细胞感染);
		this.add(巨噬细胞感染_box);	

		//7
		DetaLabel 纳na= new DetaLabel("纳na:");  
		纳na.setForeground(Color.WHITE);
		纳na.setBounds(10+220*1, 32+ 25*6, 100, 20);jFrameList.add(纳na);
		纳na.indexString= "NA";
		JTextField 纳na_box= new JTextField();
		纳na_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
		纳na_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(纳na_box
						, "降低：1.肾皮质功能不全，重症肾盂肾炎，糖尿病。2.胃肠道引流，呕吐及腹泻。3.肮利尿激素过多。"
						, "增高：1.严重脱水，大量出汗，高烧，烧伤，糖尿病性多尿。2.肾上腺皮质功能亢进，原发及继发性醛固酮增多病。" 
						, "" 
						,135, 145, 诊断结果_box
						, "");
			}
		});
		this.add(纳na);
		this.add(纳na_box);	
		//8
		DetaLabel 酮类固醇= new DetaLabel("尿17-酮类固醇17-ks:");  
		酮类固醇.setForeground(Color.WHITE);
		酮类固醇.setBounds(10+220*1, 32+ 25*7, 100, 20);jFrameList.add(酮类固醇);
		酮类固醇.indexString= "NTLGCKS";
		JTextField 酮类固醇_box= new JTextField();
		酮类固醇_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
		酮类固醇_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(酮类固醇_box
						, "降低：见于上腺皮质功能不全，如阿狄森氏病等。"
						, "增高：见于柯兴氏综合症，肥胖症，甲亢，肾上腺皮功能亢进，尤以其肿瘤升高显著。" 
						, "" 
						,3, 11, 诊断结果_box
						, "");
			}
		});
		this.add(酮类固醇);
		this.add(酮类固醇_box);	
		//9
		DetaLabel 胆汁酸= new DetaLabel("胆汁酸tba:");  
		胆汁酸.setForeground(Color.WHITE);
		胆汁酸.setBounds(10+220*1, 32+ 25*8, 100, 20);jFrameList.add(胆汁酸);
		胆汁酸.indexString= "DZSTBA";
		JTextField 胆汁酸_box= new JTextField();
		胆汁酸_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
		胆汁酸_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(胆汁酸_box
						, ""
						, "增高：急慢性肝炎，肝硬化，阻塞性黄疸及药物引起肝损害时。" 
						, "" 
						,0, 10, 诊断结果_box
						, "");
			}
		});
		this.add(胆汁酸);
		this.add(胆汁酸_box);	
		//10
		DetaLabel 血浆维生素= new DetaLabel("血浆维生素b12vb12:");  
		血浆维生素.setForeground(Color.WHITE);
		血浆维生素.setBounds(10+220*1, 32+ 25*9, 100, 20);jFrameList.add(血浆维生素);
		血浆维生素.indexString= "XJWSSBV";
		JTextField 血浆维生素_box= new JTextField();
		血浆维生素_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
		血浆维生素_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(血浆维生素);
		this.add(血浆维生素_box);	
		//11
		DetaLabel 血糖= new DetaLabel("血糖glu:");  
		血糖.setForeground(Color.WHITE);
		血糖.setBounds(10+220*1, 32+ 25*10, 100, 20);jFrameList.add(血糖);
		血糖.indexString= "XTGLU";
		JTextField 血糖_box= new JTextField();
		血糖_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
		血糖_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(血糖_box
						, "过低"
						, "增高：某些生理因素（情绪紧张，饭后1-2小时）及注射肾上腺素后，病理性增高见于各种糖尿病，慢性胰腺炎，心梗，甲亢，垂体前叶嗜酸性细胞瘤，颅内出血，颅外伤等。" 
						, "" 
						,70, 110, 诊断结果_box
						, "");
			}
		});
		this.add(血糖);
		this.add(血糖_box);	
		//12
		DetaLabel 小时合成率= new DetaLabel("24小时合成率igg:");  
		小时合成率.setForeground(Color.WHITE);
		小时合成率.setBounds(10+220*1, 32+ 25*11, 100, 20);jFrameList.add(小时合成率);
		小时合成率.indexString= "XSHCLIG";
		JTextField 小时合成率_box= new JTextField();
		小时合成率_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
		小时合成率_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(小时合成率_box
						, "鞘内免疫病观测指标低"
						, "鞘内免疫病观测指标高" 
						, "" 
						,3, 9, 诊断结果_box
						, "");
			}
		});
		this.add(小时合成率);
		this.add(小时合成率_box);	
		//13
		DetaLabel 谷丙转氨酶= new DetaLabel("谷丙转氨酶alt:");  
		谷丙转氨酶.setForeground(Color.WHITE);
		谷丙转氨酶.setBounds(10+220*1, 32+ 25*12, 100, 20);jFrameList.add(谷丙转氨酶);
		谷丙转氨酶.indexString= "GBZAMALT";
		JTextField 谷丙转氨酶_box= new JTextField();
		谷丙转氨酶_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
		谷丙转氨酶_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(谷丙转氨酶_box
						, ""
						, "增高：常见于急慢性肝炎，药物性肝损伤，脂肪肝，肝硬化，心梗，胆道疾病等。" 
						, "" 
						,5, 40, 诊断结果_box
						, "");
			}
		});
		this.add(谷丙转氨酶);
		this.add(谷丙转氨酶_box);	
		//14
		DetaLabel 胰岛细胞抗体= new DetaLabel("胰岛细胞抗体ica:");  
		胰岛细胞抗体.setForeground(Color.WHITE);
		胰岛细胞抗体.setBounds(10+220*1, 32+ 25*13, 100, 20);jFrameList.add(胰岛细胞抗体);
		胰岛细胞抗体.indexString= "YDXBICA";
		JTextField 胰岛细胞抗体_box= new JTextField();
		胰岛细胞抗体_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
		胰岛细胞抗体_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(胰岛细胞抗体);
		this.add(胰岛细胞抗体_box);	
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
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public void mouseMoved(MouseEvent e) {
		if(!DetaLabelStables.stableImages.target) {
			return;
		}
		if(!jFrameList.isEmpty()) {
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& detaLabel.frameTag.isShowing()) {
					detaLabel.frameTag.hide();
					detaLabel.validate();
				}
			}
			DetaLabelStables.stableImages.setTarget(false);
		}
	}	
}
