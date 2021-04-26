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

import ME.APM.VSQ.App;
import MVQ.button.DetaButton;
import MVQ.label.DetaIndexLabel;
import MVQ.label.DetaLabel;

public class LinChuangJianYanBaoGaoB  extends JPanel implements MouseListener, KeyListener, ActionListener, MouseMotionListener{

	private static final long serialVersionUID= 1L;
	public List<DetaLabel> jFrameList;
	public JTextField 诊断结果_box;
	public LinChuangJianYanBaoGaoB(JTextPane name, App app, List<DetaLabel> jFrameListRefer){
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);	
		this.addMouseMotionListener(this);
		this.jFrameList= jFrameListRefer;
		//1做表 左边名称 右边输入框
		//1做表 左边名称 右边输入框
		DetaLabel 诊断结果= new DetaLabel("诊断结果:");  
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
	
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel 全血黏度= new DetaLabel("全血黏度:");  
		全血黏度.setForeground(Color.WHITE);
		全血黏度.setBounds(10+220*0, 32+ 0, 100, 20); 全血黏度.indexString= "QXND"; jFrameList.add(全血黏度);
		JTextField 全血黏度_box= new JTextField();
		全血黏度_box.setBounds(10+ 110+220*0, 33+ 0, 80, 20);
		全血黏度_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				String temp= 全血黏度_box.getText();
				诊断结果_box.setText(诊断结果_box.getText()+ temp);
			}
		});
		this.add(全血黏度);
		this.add(全血黏度_box);	

		DetaLabel 肿瘤标记抗原242检测= new DetaLabel("肿瘤标记抗原242检测ca242:");  
		肿瘤标记抗原242检测.setForeground(Color.WHITE);
		肿瘤标记抗原242检测.setBounds(10+220*0, 32+ 25*1, 100, 20); 肿瘤标记抗原242检测.indexString= "ZLBJKYC"; jFrameList.add(肿瘤标记抗原242检测);
		JTextField 肿瘤标记抗原242检测_box= new JTextField();
		肿瘤标记抗原242检测_box.setBounds(10+ 110+220*0, 33+ 25*1, 80, 20);
		肿瘤标记抗原242检测_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(肿瘤标记抗原242检测);
		this.add(肿瘤标记抗原242检测_box);	

		DetaLabel 过敏原检测= new DetaLabel("过敏原检测（1）吸入组ⅰ（2）吸入组ⅱ（3）食物组ⅲ（4）食物组ⅳivtivt-ⅰivt-ⅱivt-ⅲivt-ⅳ:");  
		过敏原检测.setForeground(Color.WHITE);
		过敏原检测.setBounds(10+220*0, 32+ 25*2, 100, 20); 过敏原检测.indexString= "GMYJC"; jFrameList.add(过敏原检测);
		JTextField 过敏原检测_box= new JTextField();
		过敏原检测_box.setBounds(10+ 110+220*0, 33+ 25*2, 80, 20);
		过敏原检测_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(过敏原检测);
		this.add(过敏原检测_box);	

		DetaLabel 钙ca= new DetaLabel("钙ca:");  
		钙ca.setForeground(Color.WHITE);
		钙ca.setBounds(10+220*0, 32+ 25* 3, 100, 20); 钙ca.indexString= "GCA"; jFrameList.add(钙ca);
		JTextField 钙ca_box= new JTextField();
		钙ca_box.setBounds(10+ 110+220*0, 33+ 25* 3, 80, 20);
		钙ca_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(钙ca);
		this.add(钙ca_box);	

		DetaLabel 巨噬细胞感染趋化因子= new DetaLabel("巨噬细胞感染趋化因子-1βmip-1β:");  
		巨噬细胞感染趋化因子.setForeground(Color.WHITE);
		巨噬细胞感染趋化因子.setBounds(10+220*0, 32+ 25*4, 100, 20); 巨噬细胞感染趋化因子.indexString= "JSXBGRQHYZ"; jFrameList.add(巨噬细胞感染趋化因子);
		JTextField 巨噬细胞感染趋化因子_box= new JTextField();
		巨噬细胞感染趋化因子_box.setBounds(10+ 110+220*0, 33+ 25*4, 80, 20);
		巨噬细胞感染趋化因子_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(巨噬细胞感染趋化因子);
		this.add(巨噬细胞感染趋化因子_box);	

		DetaLabel 羟固醇17= new DetaLabel("尿17-羟固醇17-oh:");  
		羟固醇17.setForeground(Color.WHITE);
		羟固醇17.setBounds(10+220*0, 32+ 25*5, 100, 20); 羟固醇17.indexString= "NQGCOH"; jFrameList.add(羟固醇17);
		JTextField 羟固醇17_box= new JTextField();
		羟固醇17_box.setBounds(10+ 110+220*0, 33+ 25*5, 80, 20);
		羟固醇17_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(羟固醇17);
		this.add(羟固醇17_box);	

		//7
		DetaLabel 促黄体生成素= new DetaLabel("促黄体生成素lh:");  
		促黄体生成素.setForeground(Color.WHITE);
		促黄体生成素.setBounds(10+220*0, 32+ 25*6, 100, 20); 促黄体生成素.indexString= "CHTSLH"; jFrameList.add(促黄体生成素);
		JTextField 促黄体生成素_box= new JTextField();
		促黄体生成素_box.setBounds(10+ 110+220*0, 33+ 25*6, 80, 20);
		促黄体生成素_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(促黄体生成素);
		this.add(促黄体生成素_box);	
		//8
		DetaLabel 乙肝表面抗原= new DetaLabel("乙肝表面抗原hbsag:");  
		乙肝表面抗原.setForeground(Color.WHITE);
		乙肝表面抗原.setBounds(10+220*0, 32+ 25*7, 100, 20); 乙肝表面抗原.indexString= "YGBMKHSAG"; jFrameList.add(乙肝表面抗原);
		JTextField 乙肝表面抗原_box= new JTextField();
		乙肝表面抗原_box.setBounds(10+ 110+220*0, 33+ 25*7, 80, 20);
		乙肝表面抗原_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(乙肝表面抗原);
		this.add(乙肝表面抗原_box);	
		//9
		DetaLabel 毛囊虫镜检demo= new DetaLabel("毛囊虫镜检demodexfolliculorumexamination:");  
		毛囊虫镜检demo.setForeground(Color.WHITE);
		毛囊虫镜检demo.setBounds(10+220*0, 32+ 25*8, 100, 20); 毛囊虫镜检demo.indexString= "MNCJDEOXFLURATI"; jFrameList.add(毛囊虫镜检demo);
		JTextField 毛囊虫镜检demo_box= new JTextField();
		毛囊虫镜检demo_box.setBounds(10+ 110+220*0, 33+ 25*8, 80, 20);
		毛囊虫镜检demo_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(毛囊虫镜检demo);
		this.add(毛囊虫镜检demo_box);	
		//10
		DetaLabel 促肾上腺皮质激素= new DetaLabel("促肾上腺皮质激素acth:");  
		促肾上腺皮质激素.setForeground(Color.WHITE);
		促肾上腺皮质激素.setBounds(10+220*0, 32+ 25*9, 100, 20); 促肾上腺皮质激素.indexString= "CSXPZJACTH"; jFrameList.add(促肾上腺皮质激素);
		JTextField 促肾上腺皮质激素_box= new JTextField();
		促肾上腺皮质激素_box.setBounds(10+ 110+220*0, 33+ 25*9, 80, 20);
		促肾上腺皮质激素_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(促肾上腺皮质激素);
		this.add(促肾上腺皮质激素_box);	
		//11
		DetaLabel 弓形体igm= new DetaLabel("弓形体igm,抗体阳性定性toxo:");  
		弓形体igm.setForeground(Color.WHITE);
		弓形体igm.setBounds(10+220*0, 32+ 25*10, 100, 20); 弓形体igm.indexString= "GXTIMKDO"; jFrameList.add(弓形体igm);
		JTextField 弓形体igm_box= new JTextField();
		弓形体igm_box.setBounds(10+ 110+220*0, 33+ 25*10, 80, 20);
		弓形体igm_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(弓形体igm);
		this.add(弓形体igm_box);	
		//12
		DetaLabel 载脂蛋白ap0bap0b= new DetaLabel("载脂蛋白ap0bap0b:");  
		载脂蛋白ap0bap0b.setForeground(Color.WHITE);
		载脂蛋白ap0bap0b.setBounds(10+220*0, 32+ 25*11, 100, 20); 载脂蛋白ap0bap0b.indexString= "ZDBAPB"; jFrameList.add(载脂蛋白ap0bap0b);
		JTextField 载脂蛋白ap0bap0b_box= new JTextField();
		载脂蛋白ap0bap0b_box.setBounds(10+ 110+220*0, 33+ 25*11, 80, 20);
		载脂蛋白ap0bap0b_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(载脂蛋白ap0bap0b_box
						, "降低：常见于肝实质性病变"
						, "增高：常见于高脂血症，冠心病，银屑病。" 
						, "" 
						,75, 123, 诊断结果_box
						, "");
			}
		});
		this.add(载脂蛋白ap0bap0b);
		this.add(载脂蛋白ap0bap0b_box);	
		//13
		DetaLabel 尿酸uric= new DetaLabel("尿酸uric:");  
		尿酸uric.setForeground(Color.WHITE);
		尿酸uric.setBounds(10+220*0, 32+ 25*12, 100, 20); 尿酸uric.indexString= "NSURIC"; jFrameList.add(尿酸uric);
		JTextField 尿酸uric_box= new JTextField();
		尿酸uric_box.setBounds(10+ 110+220*0, 33+ 25*12, 80, 20);
		尿酸uric_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(尿酸uric_box
						, "降低：见于恶性贫血及肾上腺皮质激素等药物治疗后"
						, "增高：见于痛风，子痫，白血病，红细胞增多症，多发性骨髓瘤，急慢性肾小球肾炎。" 
						, "" 
						,2.5, 7.7, 诊断结果_box
						, "");
			}
		});
		this.add(尿酸uric);
		this.add(尿酸uric_box);	
		//14
		DetaLabel 胰高糖素= new DetaLabel("胰高糖素:");  
		胰高糖素.setForeground(Color.WHITE);
		胰高糖素.setBounds(10+220*0, 32+ 25*13, 100, 20); 胰高糖素.indexString= "YGTS"; jFrameList.add(胰高糖素);
		JTextField 胰高糖素_box= new JTextField();
		胰高糖素_box.setBounds(10+ 110+220*0, 33+ 25*13, 80, 20);
		胰高糖素_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(胰高糖素_box
						, ":测定胰岛a细胞功能过低"
						, ":测定胰岛a细胞功能过高" 
						, "" 
						,40, 130, 诊断结果_box
						, "");
			}
		});
		this.add(胰高糖素);
		this.add(胰高糖素_box);	
		//
		addSecondColomns(诊断结果_box, jFrameList);
		addThirdColomns(诊断结果_box, jFrameList);
		addFourthColomns(诊断结果_box, jFrameList);
		addFifthColomns(诊断结果_box, jFrameList);
		this.validate();
	}
	private void addFifthColomns(JTextField 诊断结果_box2, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel 军团菌抗原检测= new DetaLabel("军团菌抗原检测:");  
		军团菌抗原检测.setForeground(Color.WHITE);
		军团菌抗原检测.setBounds(10+220*1, 32+ 0, 100, 20); 军团菌抗原检测.indexString= "JTKYC"; jFrameList.add(军团菌抗原检测);
		JTextField 军团菌抗原检测_box= new JTextField();
		军团菌抗原检测_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
		军团菌抗原检测_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(军团菌抗原检测);
		this.add(军团菌抗原检测_box);	

		DetaLabel 真菌培养取材= new DetaLabel("真菌培养取材cultureoffungi:");  
		真菌培养取材.setForeground(Color.WHITE);
		真菌培养取材.setBounds(10+220*1, 32+ 25*1, 100, 20); 真菌培养取材.indexString= "ZJPYQCULTEROFNGI"; jFrameList.add(真菌培养取材);
		JTextField 真菌培养取材_box= new JTextField();
		真菌培养取材_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
		真菌培养取材_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(真菌培养取材);
		this.add(真菌培养取材_box);	

		DetaLabel 转肽酶ggt= new DetaLabel("转肽酶ggt:");  
		转肽酶ggt.setForeground(Color.WHITE);
		转肽酶ggt.setBounds(10+220*1, 32+ 25*2, 100, 20); 转肽酶ggt.indexString= "ZTMGT"; jFrameList.add(转肽酶ggt);
		JTextField 转肽酶ggt_box= new JTextField();
		转肽酶ggt_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
		转肽酶ggt_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(转肽酶ggt_box
						, ""
						, "增高：常见于原发性或转移性肝癌，急性肝炎，慢性肝炎活动期，肝硬化，急性胰腺炎及心力衰竭等" 
						, "" 
						,8, 50, 诊断结果_box
						, "");
			}
		});
		this.add(转肽酶ggt);
		this.add(转肽酶ggt_box);	

		DetaLabel 免疫组化验查= new DetaLabel("免疫组化验查immunohistophathol-ogicstain:");  
		免疫组化验查.setForeground(Color.WHITE);
		免疫组化验查.setBounds(10+220*1, 32+ 25* 3, 100, 20); 免疫组化验查.indexString= "MYZHCimmunohistophathologicstain".toUpperCase(); jFrameList.add(免疫组化验查);
		JTextField 免疫组化验查_box= new JTextField();
		免疫组化验查_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
		免疫组化验查_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(免疫组化验查);
		this.add(免疫组化验查_box);	

		DetaLabel 四项诱导血小板聚集功能= new DetaLabel("四项诱导血小板聚集功能测试（mulitipleagentplateletaggregationtest）4-pagt:");  
		四项诱导血小板聚集功能.setForeground(Color.WHITE);
		四项诱导血小板聚集功能.setBounds(10+220*1, 32+ 25*4, 100, 20); 
		四项诱导血小板聚集功能.indexString= "SXYDBJGNmulitipleagentplateletaggregationtest".toUpperCase(); jFrameList.add(四项诱导血小板聚集功能);
		JTextField 四项诱导血小板聚集功能_box= new JTextField();
		四项诱导血小板聚集功能_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
		四项诱导血小板聚集功能_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(四项诱导血小板聚集功能);
		this.add(四项诱导血小板聚集功能_box);	

		DetaLabel 髓鞘碱性蛋白= new DetaLabel("髓鞘碱性蛋白mbp:");  
		髓鞘碱性蛋白.setForeground(Color.WHITE);
		髓鞘碱性蛋白.setBounds(10+220*1, 32+ 25*5, 100, 20); 髓鞘碱性蛋白.indexString= "SJXDBMP"; jFrameList.add(髓鞘碱性蛋白);
		JTextField 髓鞘碱性蛋白_box= new JTextField();
		髓鞘碱性蛋白_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
		髓鞘碱性蛋白_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(髓鞘碱性蛋白);
		this.add(髓鞘碱性蛋白_box);	

		//7
		DetaLabel 皮肤病理活检= new DetaLabel("皮肤病理活检dermatopathologicalexamination:");  
		皮肤病理活检.setForeground(Color.WHITE);
		皮肤病理活检.setBounds(10+220*1, 32+ 25*6, 100, 20); 
		皮肤病理活检.indexString= "PFBHJdermatopathologicalexamination".toUpperCase(); jFrameList.add(皮肤病理活检);
		JTextField 皮肤病理活检_box= new JTextField();
		皮肤病理活检_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
		皮肤病理活检_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(皮肤病理活检);
		this.add(皮肤病理活检_box);	
		//8
		DetaLabel 血尿锌= new DetaLabel("血（尿）锌zn:");  
		血尿锌.setForeground(Color.WHITE);
		血尿锌.setBounds(10+220*1, 32+ 25*7, 100, 20); 血尿锌.indexString= "XNZN"; jFrameList.add(血尿锌);
		JTextField 血尿锌_box = new JTextField();
		血尿锌_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
		血尿锌_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(血尿锌_box
						, "降低：见于急慢性肝炎，肝硬化，肝瘤，心梗，贫血。儿童缺锌症，重症肌无力"
						, "增高：见于锌中毒，甲亢，X射线照射后。" 
						, "" 
						,50, 140, 诊断结果_box
						, "");
			}
		});
		this.add(血尿锌);
		this.add(血尿锌_box);	
		//9
		DetaLabel 尿皮质醇尿皮质醇= new DetaLabel("尿皮质醇尿皮质醇:");  
		尿皮质醇尿皮质醇.setForeground(Color.WHITE);
		尿皮质醇尿皮质醇.setBounds(10+220*1, 32+ 25*8, 100, 20); 尿皮质醇尿皮质醇.indexString= "NPZC"; jFrameList.add(尿皮质醇尿皮质醇);
		JTextField 尿皮质醇尿皮质醇_box= new JTextField();
		尿皮质醇尿皮质醇_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
		尿皮质醇尿皮质醇_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(尿皮质醇尿皮质醇_box
						, "测定肾上腺皮质功能过低"
						, "测定肾上腺皮质功能过高" 
						, "" 
						,10, 80, 诊断结果_box
						, "");
			}
		});
		this.add(尿皮质醇尿皮质醇);
		this.add(尿皮质醇尿皮质醇_box);	
		//10
		DetaLabel 白色念珠菌抗原= new DetaLabel("白色念珠菌抗原:");  
		白色念珠菌抗原.setForeground(Color.WHITE);
		白色念珠菌抗原.setBounds(10+220*1, 32+ 25*9, 100, 20); 白色念珠菌抗原.indexString= "BSNZJKY"; jFrameList.add(白色念珠菌抗原);
		JTextField 白色念珠菌抗原_box= new JTextField();
		白色念珠菌抗原_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
		白色念珠菌抗原_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(白色念珠菌抗原);
		this.add(白色念珠菌抗原_box);	
		//11
		DetaLabel 乙肝两对半hbeab= new DetaLabel("乙肝两对半hbeab:");  
		乙肝两对半hbeab.setForeground(Color.WHITE);
		乙肝两对半hbeab.setBounds(10+220*1, 32+ 25*10, 100, 20); 乙肝两对半hbeab.indexString= "YGLDBHEA"; jFrameList.add(乙肝两对半hbeab);
		JTextField 乙肝两对半hbeab_box= new JTextField();
		乙肝两对半hbeab_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
		乙肝两对半hbeab_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(乙肝两对半hbeab);
		this.add(乙肝两对半hbeab_box);	
		//12
		DetaLabel 早老素= new DetaLabel("早老素-1ps-1:");  
		早老素.setForeground(Color.WHITE);
		早老素.setBounds(10+220*1, 32+ 25*11, 100, 20); 早老素.indexString= "ZLSP"; jFrameList.add(早老素);
		JTextField 早老素_box= new JTextField();
		早老素_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
		早老素_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(早老素);
		this.add(早老素_box);	
		//13
		DetaLabel 总蛋白tp= new DetaLabel("总蛋白tp:");  
		总蛋白tp.setForeground(Color.WHITE);
		总蛋白tp.setBounds(10+220*1, 32+ 25*12, 100, 20); 总蛋白tp.indexString= "ZDBTP"; jFrameList.add(总蛋白tp);
		JTextField 总蛋白tp_box= new JTextField();
		总蛋白tp_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
		总蛋白tp_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(总蛋白tp_box
						, "降低：常见于恶性肿瘤，重症结核，营养及吸收障碍，肝硬化，肾病综合症，烧伤，失血"
						, "增高：常见于高度脱水症（如腹泄、沤吐，休克，高热）及多发性骨髓瘤" 
						, "" 
						,6.0, 8.0, 诊断结果_box
						, "");
			}
		});
		this.add(总蛋白tp);
		this.add(总蛋白tp_box);	
		//14
		DetaLabel 肺炎支原体igg= new DetaLabel("肺炎支原体igg:");  
		肺炎支原体igg.setForeground(Color.WHITE);
		肺炎支原体igg.setBounds(10+220*1, 32+ 25*13, 100, 20); 肺炎支原体igg.indexString= "FYZTIG"; jFrameList.add(肺炎支原体igg);
		JTextField 肺炎支原体igg_box= new JTextField();
		肺炎支原体igg_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
		肺炎支原体igg_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(肺炎支原体igg);
		this.add(肺炎支原体igg_box);	
	}

	void addFourthColomns(JTextField 诊断结果_box2, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel 淋球菌培养取材= new DetaLabel("淋球菌培养取材cultureofneisseriagonorrhoen:");  
		淋球菌培养取材.setForeground(Color.WHITE);
		淋球菌培养取材.setBounds(10+220*2, 32+ 0, 100, 20); 
		淋球菌培养取材.indexString= "LQJPYCcultureofneisseriagonorrhoen".toUpperCase(); jFrameList.add(淋球菌培养取材);
		JTextField 淋球菌培养取材_box= new JTextField();
		淋球菌培养取材_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
		淋球菌培养取材_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(淋球菌培养取材);
		this.add(淋球菌培养取材_box);	

		DetaLabel 尿酸尿= new DetaLabel("尿酸（尿）:");  
		尿酸尿.setForeground(Color.WHITE);
		尿酸尿.setBounds(10+220*2, 32+ 25*1, 100, 20); 尿酸尿.indexString= "NS"; jFrameList.add(尿酸尿);
		JTextField 尿酸尿_box= new JTextField();
		尿酸尿_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
		尿酸尿_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(尿酸尿_box
						, ""
						, "痛风" 
						, "" 
						,0.2 , 2.0, 诊断结果_box
						, "");
			}
		});
		this.add(尿酸尿);
		this.add(尿酸尿_box);	

		DetaLabel 血小板聚集= new DetaLabel("血小板聚集:");  
		血小板聚集.setForeground(Color.WHITE);
		血小板聚集.setBounds(10+220*2, 32+ 25*2, 100, 20); 血小板聚集.indexString= "XBJ"; jFrameList.add(血小板聚集);
		JTextField 血小板聚集_box= new JTextField();
		血小板聚集_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
		血小板聚集_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(血小板聚集_box
						, "血小板功能过低"
						, "血小板功能过高" 
						, "" 
						, 25, 55, 诊断结果_box
						, "");
			}
		});
		this.add(血小板聚集);
		this.add(血小板聚集_box);	

		DetaLabel 谷草转氨酶= new DetaLabel("谷草转氨酶ast:");  
		谷草转氨酶.setForeground(Color.WHITE);
		谷草转氨酶.setBounds(10+220*2, 32+ 25* 3, 100, 20); 谷草转氨酶.indexString= "GCZAMST"; jFrameList.add(谷草转氨酶);
		JTextField 谷草转氨酶_box= new JTextField();
		谷草转氨酶_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
		谷草转氨酶_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(谷草转氨酶_box
						, ""
						, "增高：常见于心梗，急慢性肝炎，中毒性肝炎，心功能不全，皮肌炎等" 
						, "" 
						,8, 40, 诊断结果_box
						, "");
			}
		});
		this.add(谷草转氨酶);
		this.add(谷草转氨酶_box);	

		DetaLabel 甲肝抗体= new DetaLabel("甲肝抗体-igmhav-igm:");  
		甲肝抗体.setForeground(Color.WHITE);
		甲肝抗体.setBounds(10+220*2, 32+ 25*4, 100, 20); 
		甲肝抗体.indexString= "JGKTigmhav".toUpperCase(); jFrameList.add(甲肝抗体);
		JTextField 甲肝抗体_box= new JTextField();
		甲肝抗体_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
		甲肝抗体_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(甲肝抗体);
		this.add(甲肝抗体_box);	

		DetaLabel 生长激素gh= new DetaLabel("生长激素gh:");  
		生长激素gh.setForeground(Color.WHITE);
		生长激素gh.setBounds(10+220*2, 32+ 25*5, 100, 20); 生长激素gh.indexString= "SZJGH"; jFrameList.add(生长激素gh);
		JTextField 生长激素gh_box= new JTextField();
		生长激素gh_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
		生长激素gh_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态； ng/ml
				String temp= 生长激素gh_box.getText();
				double temp_double= Double.valueOf(temp);
				if(temp_double>5|| temp_double<0.06) {
					诊断结果_box.setText(诊断结果_box.getText().contains("诊断肢端肥大症垂体瘤等")
							? 诊断结果_box.getText(): 诊断结果_box.getText()+ "诊断肢端肥大症垂体瘤等");	
				}else {
					诊断结果_box.setText(诊断结果_box.getText().replace("诊断肢端肥大症垂体瘤等", ""));	
				}		
			}
		});
		this.add(生长激素gh);
		this.add(生长激素gh_box);	

		//7
		DetaLabel 脂肪酶lipase= new DetaLabel("脂肪酶lipase:");  
		脂肪酶lipase.setForeground(Color.WHITE);
		脂肪酶lipase.setBounds(10+220*2, 32+ 25*6, 100, 20); 脂肪酶lipase.indexString= "ZFMLIPASE"; jFrameList.add(脂肪酶lipase);
		JTextField 脂肪酶lipase_box= new JTextField();
		脂肪酶lipase_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
		脂肪酶lipase_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				//增高：见于急慢性胰腺炎，胰腺癌，胆道疾病，胃穿孔，肠梗阻，腮腺炎，唾液腺炎等。降低：见于肝脏疾病，如肝癌，肝硬化。
				//加状态；
				String temp= 脂肪酶lipase_box.getText();
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
		this.add(脂肪酶lipase);
		this.add(脂肪酶lipase_box);	
		//8
		DetaLabel 血浆叶酸测定= new DetaLabel("血浆叶酸测定fa:");  
		血浆叶酸测定.setForeground(Color.WHITE);
		血浆叶酸测定.setBounds(10+220*2, 32+ 25*7, 100, 20); 血浆叶酸测定.indexString= "XJYSCDFA"; jFrameList.add(血浆叶酸测定);
		JTextField 血浆叶酸测定_box= new JTextField();
		血浆叶酸测定_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
		血浆叶酸测定_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(血浆叶酸测定);
		this.add(血浆叶酸测定_box);	
		//9
		DetaLabel 同工酶ck_mm= new DetaLabel("同工酶ck-mm:");  
		同工酶ck_mm.setForeground(Color.WHITE);
		同工酶ck_mm.setBounds(10+220*2, 32+ 25*8, 100, 20); 同工酶ck_mm.indexString= "TGMCK"; jFrameList.add(同工酶ck_mm);
		JTextField 同工酶ck_mm_box= new JTextField();
		同工酶ck_mm_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
		同工酶ck_mm_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(同工酶ck_mm);
		this.add(同工酶ck_mm_box);	
		//10
		DetaLabel 特异性酯酶双染色= new DetaLabel("特异性酯酶双染色:");  
		特异性酯酶双染色.setForeground(Color.WHITE);
		特异性酯酶双染色.setBounds(10+220*2, 32+ 25*9, 100, 20); 特异性酯酶双染色.indexString= "TYXZMSR"; jFrameList.add(特异性酯酶双染色);
		JTextField 特异性酯酶双染色_box= new JTextField();
		特异性酯酶双染色_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
		特异性酯酶双染色_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(特异性酯酶双染色);
		this.add(特异性酯酶双染色_box);	
		//11
		DetaLabel 铁染色= new DetaLabel("铁染色:");  
		铁染色.setForeground(Color.WHITE);
		铁染色.setBounds(10+220*2, 32+ 25*10, 100, 20); 铁染色.indexString= "TRS"; jFrameList.add(铁染色);
		JTextField 铁染色_box= new JTextField();
		铁染色_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
		铁染色_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(铁染色);
		this.add(铁染色_box);	
		//12
		DetaLabel 钾K= new DetaLabel("钾K:");  
		钾K.setForeground(Color.WHITE);
		钾K.setBounds(10+220*2, 32+ 25*11, 100, 20); 钾K.indexString= "JK"; jFrameList.add(钾K);
		JTextField 钾K_box= new JTextField();
		钾K_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
		钾K_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(钾K);
		this.add(钾K_box);	
		//13
		DetaLabel 乙肝两对半hbeag= new DetaLabel("乙肝两对半hbeag:");  
		乙肝两对半hbeag.setForeground(Color.WHITE);
		乙肝两对半hbeag.setBounds(10+220*2, 32+ 25*12, 100, 20); 乙肝两对半hbeag.indexString= "YGLDBHEAG"; jFrameList.add(乙肝两对半hbeag);
		JTextField 乙肝两对半hbeag_box= new JTextField();
		乙肝两对半hbeag_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
		乙肝两对半hbeag_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(乙肝两对半hbeag);
		this.add(乙肝两对半hbeag_box);	
		//14
		DetaLabel 醋酸萘酚酯酶染色= new DetaLabel("α-醋酸萘酚酯酶染色:");  
		醋酸萘酚酯酶染色.setForeground(Color.WHITE);
		醋酸萘酚酯酶染色.setBounds(10+220*2, 32+ 25*13, 100, 20); 醋酸萘酚酯酶染色.indexString= "CSNFZMR"; jFrameList.add(醋酸萘酚酯酶染色);
		JTextField 醋酸萘酚酯酶染色_box= new JTextField();
		醋酸萘酚酯酶染色_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
		醋酸萘酚酯酶染色_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(醋酸萘酚酯酶染色);
		this.add(醋酸萘酚酯酶染色_box);	
	}

	private void addThirdColomns(JTextField 诊断结果_box2, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel 血浆同型半胱氨酸= new DetaLabel("血浆同型半胱氨酸hcy:");  
		血浆同型半胱氨酸.setForeground(Color.WHITE);
		血浆同型半胱氨酸.setBounds(10+220*3, 32+ 0, 100, 20); 血浆同型半胱氨酸.indexString= "XJTBGASHCY"; jFrameList.add(血浆同型半胱氨酸);
		血浆同型半胱氨酸.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		JTextField 血浆同型半胱氨酸_box= new JTextField();
		血浆同型半胱氨酸_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
		血浆同型半胱氨酸_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(血浆同型半胱氨酸_box
						, "心脑血管病独立危险因素"
						, "" 
						, "" 
						,15, 9990, 诊断结果_box
						, "");
			}
		});
		this.add(血浆同型半胱氨酸);
		this.add(血浆同型半胱氨酸_box);	

		DetaLabel 尿微量白蛋白排泄率= new DetaLabel("尿微量白蛋白排泄率uaer:");  
		尿微量白蛋白排泄率.setForeground(Color.WHITE);
		尿微量白蛋白排泄率.setBounds(10+220*3, 32+ 25*1, 100, 20); 尿微量白蛋白排泄率.indexString= "NWLBDPXUAER"; jFrameList.add(尿微量白蛋白排泄率);
		JTextField 尿微量白蛋白排泄率_box= new JTextField();
		尿微量白蛋白排泄率_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
		尿微量白蛋白排泄率_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(尿微量白蛋白排泄率_box
						, ""
						, "早期肾病的诊断 过高" 
						, "" 
						,0, 20, 诊断结果_box
						, "");
			}
		});
		this.add(尿微量白蛋白排泄率);
		this.add(尿微量白蛋白排泄率_box);	

		DetaLabel 氯cl= new DetaLabel("氯cl:");  
		氯cl.setForeground(Color.WHITE);
		氯cl.setBounds(10+220*3, 32+ 25*2, 100, 20); 氯cl.indexString= "CL"; jFrameList.add(氯cl);
		JTextField 氯cl_box= new JTextField();
		氯cl_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
		氯cl_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(氯cl_box
						, "降低：见于低钠血症，严重呕吐，腹泻，胃液胰液胆汁液大量丢失，肾功能减退及阿狄森氏病等"
						, "增高：见于高钠血症，呼吸碱中毒，高渗性脱水，肾炎少尿及尿道梗塞" 
						, "" 
						,96, 106, 诊断结果_box
						, "");
			}
		});
		this.add(氯cl);
		this.add(氯cl_box);	

		DetaLabel 灌洗液常规检查balf= new DetaLabel("灌洗液常规检查balf:");  
		灌洗液常规检查balf.setForeground(Color.WHITE);
		灌洗液常规检查balf.setBounds(10+220*3, 32+ 25* 3, 100, 20); 灌洗液常规检查balf.indexString= "GXYCGJCBALF"; jFrameList.add(灌洗液常规检查balf);
		JTextField 灌洗液常规检查balf_box= new JTextField();
		灌洗液常规检查balf_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
		灌洗液常规检查balf_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(灌洗液常规检查balf);
		this.add(灌洗液常规检查balf_box);	

		DetaLabel 呼吸道病毒检测= new DetaLabel("呼吸道病毒检测:");  
		呼吸道病毒检测.setForeground(Color.WHITE);
		呼吸道病毒检测.setBounds(10+220*3, 32+ 25*4, 100, 20); 呼吸道病毒检测.indexString= "HXDBJC"; jFrameList.add(呼吸道病毒检测);
		JTextField 呼吸道病毒检测_box= new JTextField();
		呼吸道病毒检测_box.setBounds(10+ 110+220*3, 33+ 25*4, 80, 20);
		呼吸道病毒检测_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(呼吸道病毒检测);
		this.add(呼吸道病毒检测_box);	

		DetaLabel 肌酐尿= new DetaLabel("肌酐（尿）:");  
		肌酐尿.setForeground(Color.WHITE);
		肌酐尿.setBounds(10+220*3, 32+ 25*5, 100, 20); 肌酐尿.indexString= "JGN"; jFrameList.add(肌酐尿);
		JTextField 肌酐尿_box= new JTextField();
		肌酐尿_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
		肌酐尿_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(肌酐尿_box
						, "降低：见于肾功能不全，白血症"
						, "增高：见于破伤风，伤寒，皮肌炎。" 
						, "" 
						,98, 230, 诊断结果_box
						, "");
			}
		});
		this.add(肌酐尿);
		this.add(肌酐尿_box);	

		//7
		DetaLabel 免疫球蛋白gigg= new DetaLabel("免疫球蛋白gigg:");  
		免疫球蛋白gigg.setForeground(Color.WHITE);
		免疫球蛋白gigg.setBounds(10+220*3, 32+ 25*6, 100, 20); 免疫球蛋白gigg.indexString= "MYQDBGI"; jFrameList.add(免疫球蛋白gigg);
		JTextField 免疫球蛋白gigg_box= new JTextField();
		免疫球蛋白gigg_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
		免疫球蛋白gigg_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(免疫球蛋白gigg_box
						, "降低：免疫病"
						, "过高" 
						, "" 
						,90, 209, 诊断结果_box
						, "");
			}
		});
		this.add(免疫球蛋白gigg);
		this.add(免疫球蛋白gigg_box);	
		//8
		DetaLabel 胸水ldh= new DetaLabel("胸水ldh:");  
		胸水ldh.setForeground(Color.WHITE);
		胸水ldh.setBounds(10+220*3, 32+ 25*7, 100, 20); 胸水ldh.indexString= "XSLDH"; jFrameList.add(胸水ldh);
		JTextField 胸水ldh_box= new JTextField();
		胸水ldh_box.setBounds(10+ 110+220*3, 33+ 25*7, 80, 20);
		胸水ldh_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(胸水ldh);
		this.add(胸水ldh_box);	
		//9
		DetaLabel 促进泡生成素fsm= new DetaLabel("促进泡生成素fsm:");  
		促进泡生成素fsm.setForeground(Color.WHITE);
		促进泡生成素fsm.setBounds(10+220*3, 32+ 25*8, 100, 20); 促进泡生成素fsm.indexString= "CJPSFM"; jFrameList.add(促进泡生成素fsm);
		JTextField 促进泡生成素fsm_box= new JTextField();
		促进泡生成素fsm_box.setBounds(10+ 110+220*3, 33+ 25*8, 80, 20);
		促进泡生成素fsm_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(促进泡生成素fsm);
		this.add(促进泡生成素fsm_box);	
		//10
		DetaLabel d二聚体= new DetaLabel("d-二聚体（d-dimer）:");  
		d二聚体.setForeground(Color.WHITE);
		d二聚体.setBounds(10+220*3, 32+ 25*9, 100, 20); d二聚体.indexString= "DEJTDIMER"; jFrameList.add(d二聚体);
		JTextField d二聚体_box= new JTextField();
		d二聚体_box.setBounds(10+ 110+220*3, 33+ 25*9, 80, 20);
		d二聚体_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(d二聚体);
		this.add(d二聚体_box);	
		//11
		DetaLabel 间接胆红质= new DetaLabel("间接胆红质ibil:");  
		间接胆红质.setForeground(Color.WHITE);
		间接胆红质.setBounds(10+220*3, 32+ 25*10, 100, 20); 间接胆红质.indexString= "JDHZIBIL"; jFrameList.add(间接胆红质);
		JTextField 间接胆红质_box= new JTextField();
		间接胆红质_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
		间接胆红质_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(间接胆红质_box
						, ""
						, ":增高：见于溶血性黄疸，新生儿黄疸，血型不符的输血反应" 
						, "" 
						,0.1, 0.7, 诊断结果_box
						, "");
			}
		});
		this.add(间接胆红质);
		this.add(间接胆红质_box);	
		//12
		DetaLabel t细胞亚群测定= new DetaLabel("t细胞亚群测定:");  
		t细胞亚群测定.setForeground(Color.WHITE);
		t细胞亚群测定.setBounds(10+220*3, 32+ 25*11, 100, 20); t细胞亚群测定.indexString= "TXBYQCD"; jFrameList.add(t细胞亚群测定);
		JTextField t细胞亚群测定_box= new JTextField();
		t细胞亚群测定_box.setBounds(10+ 110+220*3, 33+ 25*11, 80, 20);
		t细胞亚群测定_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(t细胞亚群测定);
		this.add(t细胞亚群测定_box);	
		//13
		DetaLabel 氧合= new DetaLabel("氧合:");  
		氧合.setForeground(Color.WHITE);
		氧合.setBounds(10+220*3, 32+ 25*12, 100, 20); 氧合.indexString= "YH"; jFrameList.add(氧合);
		JTextField 氧合_box= new JTextField();
		氧合_box.setBounds(10+ 110+220*3, 33+ 25*12, 80, 20);
		氧合_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(氧合);
		this.add(氧合_box);	
		//14
		DetaLabel setSet= new DetaLabel("set:");  
		setSet.setForeground(Color.WHITE);
		setSet.setBounds(10+220*3, 32+ 25*13, 100, 20); setSet.indexString= "SET"; jFrameList.add(setSet);
		JTextField setSet_box= new JTextField();
		setSet_box.setBounds(10+ 110+220*3, 33+ 25*13, 80, 20);
		setSet_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(setSet);
		this.add(setSet_box);	
	}

	private void addSecondColomns(JTextField 诊断结果_box2, List<DetaLabel> jFrameList) {
		// TODO Auto-generated method stub
		//copy tab
		DetaLabel 胎盘糖旦白胎盘糖旦白= new DetaLabel("胎盘糖旦白胎盘糖旦白:");  
		胎盘糖旦白胎盘糖旦白.setForeground(Color.WHITE);
		胎盘糖旦白胎盘糖旦白.setBounds(10+220*4, 32+ 0, 100, 20); 胎盘糖旦白胎盘糖旦白.indexString= "TPDB"; jFrameList.add(胎盘糖旦白胎盘糖旦白);
		JTextField 胎盘糖旦白胎盘糖旦白_box= new JTextField();
		胎盘糖旦白胎盘糖旦白_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
		胎盘糖旦白胎盘糖旦白_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(胎盘糖旦白胎盘糖旦白);
		this.add(胎盘糖旦白胎盘糖旦白_box);	

		DetaLabel 单核细胞化学趋化因子= new DetaLabel("单核细胞化学趋化因子-1mcp-1:");  
		单核细胞化学趋化因子.setForeground(Color.WHITE);
		单核细胞化学趋化因子.setBounds(10+220*4, 32+ 25*1, 100, 20); 单核细胞化学趋化因子.indexString= "DHXBHQHYZMCP"; jFrameList.add(单核细胞化学趋化因子);
		JTextField 单核细胞化学趋化因子_box= new JTextField();
		单核细胞化学趋化因子_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
		单核细胞化学趋化因子_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(单核细胞化学趋化因子);
		this.add(单核细胞化学趋化因子_box);	

		DetaLabel 骨髓细胞形态学诊断检查= new DetaLabel("骨髓细胞形态学诊断检查:");  
		骨髓细胞形态学诊断检查.setForeground(Color.WHITE);
		骨髓细胞形态学诊断检查.setBounds(10+220*4, 32+ 25*2, 100, 20); 骨髓细胞形态学诊断检查.indexString= "GSXBTZDJC"; jFrameList.add(骨髓细胞形态学诊断检查);
		JTextField 骨髓细胞形态学诊断检查_box= new JTextField();
		骨髓细胞形态学诊断检查_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
		骨髓细胞形态学诊断检查_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(骨髓细胞形态学诊断检查);
		this.add(骨髓细胞形态学诊断检查_box);	

		DetaLabel 髓鞘碱性蛋白抗体= new DetaLabel("髓鞘碱性蛋白抗体mbp:");  
		髓鞘碱性蛋白抗体.setForeground(Color.WHITE);
		髓鞘碱性蛋白抗体.setBounds(10+220*4, 32+ 25* 3, 100, 20); 髓鞘碱性蛋白抗体.indexString= "SXJDBKTMBP"; jFrameList.add(髓鞘碱性蛋白抗体);
		JTextField 髓鞘碱性蛋白抗体_box= new JTextField();
		髓鞘碱性蛋白抗体_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
		髓鞘碱性蛋白抗体_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(髓鞘碱性蛋白抗体);
		this.add(髓鞘碱性蛋白抗体_box);	

		DetaLabel 羟丁酸脱氢酶= new DetaLabel("羟丁酸脱氢酶hbdh:");  
		羟丁酸脱氢酶.setForeground(Color.WHITE);
		羟丁酸脱氢酶.setBounds(10+220*4, 32+ 25*4, 100, 20); 羟丁酸脱氢酶.indexString= "QDSZTMHBDH"; jFrameList.add(羟丁酸脱氢酶);
		JTextField 羟丁酸脱氢酶_box= new JTextField();
		羟丁酸脱氢酶_box.setBounds(10+ 110+ 220* 4, 33+ 25*4, 80, 20);
		羟丁酸脱氢酶_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(羟丁酸脱氢酶_box
						, ""
						, "作为急性心梗诊断的一个指标，与LDH大致相同，在急性心梗时此酶在血液中维持高值，可达2周左右。" 
						, "" 
						,80, 220, 诊断结果_box
						, "");

			}
		});
		this.add(羟丁酸脱氢酶);
		this.add(羟丁酸脱氢酶_box);	

		DetaLabel 肽c= new DetaLabel("c-肽c-p:");  
		肽c.setForeground(Color.WHITE);
		肽c.setBounds(10+220*4, 32+ 25*5, 100, 20); 肽c.indexString= "TCP"; jFrameList.add(肽c);
		JTextField 肽c_box= new JTextField();
		肽c_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
		肽c_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(肽c);
		this.add(肽c_box);	

		//7
		DetaLabel 性病衣原体快速检测= new DetaLabel("性病衣原体快速检测（ct）:");  
		性病衣原体快速检测.setForeground(Color.WHITE);
		性病衣原体快速检测.setBounds(10+220*4, 32+ 25*6, 100, 20); 性病衣原体快速检测.indexString= "XBYTKSJC"; jFrameList.add(性病衣原体快速检测);
		JTextField 性病衣原体快速检测_box= new JTextField();
		性病衣原体快速检测_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
		性病衣原体快速检测_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(性病衣原体快速检测);
		this.add(性病衣原体快速检测_box);	
		//8
		DetaLabel 催孔素= new DetaLabel("催孔素phl:");  
		催孔素.setForeground(Color.WHITE);
		催孔素.setBounds(10+220*4, 32+ 25*7, 100, 20); 催孔素.indexString= "CKSPHL"; jFrameList.add(催孔素);
		JTextField 催孔素_box= new JTextField();
		催孔素_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
		催孔素_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(催孔素);
		this.add(催孔素_box);	
		//9
		DetaLabel 骨髓巨核细胞定量= new DetaLabel("骨髓巨核细胞定量计数分类分析:");  
		骨髓巨核细胞定量.setForeground(Color.WHITE);
		骨髓巨核细胞定量.setBounds(10+220*4, 32+ 25*8, 100, 20); 骨髓巨核细胞定量.indexString= "GSJHXBDL"; jFrameList.add(骨髓巨核细胞定量);
		JTextField 骨髓巨核细胞定量_box= new JTextField();
		骨髓巨核细胞定量_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
		骨髓巨核细胞定量_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(骨髓巨核细胞定量);
		this.add(骨髓巨核细胞定量_box);	
		//10
		DetaLabel 血气分析加离子分析= new DetaLabel("血气分析加离子分析:");  
		血气分析加离子分析.setForeground(Color.WHITE);
		血气分析加离子分析.setBounds(10+220*4, 32+ 25*9, 100, 20); 血气分析加离子分析.indexString= "XQFXJLZ"; jFrameList.add(血气分析加离子分析);
		JTextField 血气分析加离子分析_box= new JTextField();
		血气分析加离子分析_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
		血气分析加离子分析_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(血气分析加离子分析);
		this.add(血气分析加离子分析_box);	
		//11
		DetaLabel 脑脊液生化糖= new DetaLabel("脑脊液生化糖:");  
		脑脊液生化糖.setForeground(Color.WHITE);
		脑脊液生化糖.setBounds(10+220*4, 32+ 25*10, 100, 20); 脑脊液生化糖.indexString= "NJYSHT"; jFrameList.add(脑脊液生化糖);
		JTextField 脑脊液生化糖_box= new JTextField();
		脑脊液生化糖_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
		脑脊液生化糖_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(脑脊液生化糖);
		this.add(脑脊液生化糖_box);	
		//12***********************************
		DetaLabel 血管紧张素转化酶= new DetaLabel("血管紧张素转化酶sace:");  
		血管紧张素转化酶.setForeground(Color.WHITE);
		血管紧张素转化酶.setBounds(10+220*4, 32+ 25*11, 100, 20); 血管紧张素转化酶.indexString= "XGJZSHMACE"; jFrameList.add(血管紧张素转化酶);
		JTextField 血管紧张素转化酶_box= new JTextField();
		血管紧张素转化酶_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
		血管紧张素转化酶_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；
				printValue(血管紧张素转化酶_box
						, ""
						, "结节病，肺结核" 
						, "" 
						, 20, 40, 诊断结果_box
						, "");
			}
		});
		this.add(血管紧张素转化酶);
		this.add(血管紧张素转化酶_box);	
		//13
		DetaLabel 糖元染色= new DetaLabel("糖元染色:");  
		糖元染色.setForeground(Color.WHITE);
		糖元染色.setBounds(10+220*4, 32+ 25*12, 100, 20); 糖元染色.indexString= "TYRS"; jFrameList.add(糖元染色);
		JTextField 糖元染色_box= new JTextField();
		糖元染色_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
		糖元染色_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(糖元染色);
		this.add(糖元染色_box);	
		//14
		DetaLabel 脑脊液细胞学检查= new DetaLabel("脑脊液细胞学检查:");  
		脑脊液细胞学检查.setForeground(Color.WHITE);
		脑脊液细胞学检查.setBounds(10+220*4, 32+ 25*13, 100, 20); 脑脊液细胞学检查.indexString= "NJYXBJC"; jFrameList.add(脑脊液细胞学检查);
		JTextField 脑脊液细胞学检查_box= new JTextField();
		脑脊液细胞学检查_box.setBounds(10+ 110+220*4, 33+ 25*13, 80, 20);
		脑脊液细胞学检查_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//加状态；

			}
		});
		this.add(脑脊液细胞学检查);
		this.add(脑脊液细胞学检查_box);	
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
			DetaLabelStables.stableImages.setTarget(false);;
		}
	}
}
