package ME.APM.VSQ.OPE.hospital;

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

public class NeiKeJPanel  extends JPanel implements MouseListener, KeyListener, ActionListener{

		private static final long serialVersionUID= 1L;
		public NeiKeJPanel(JTextPane name){
			this.setLayout(null);
			this.setBounds(0, 0, 1180, 610);
			this.setBackground(Color.BLACK);
			
			//1×ö±í ×ó±ßÃû³Æ ÓÒ±ßÊäÈë¿ò
			JLabel Õï¶Ï½á¹û= new JLabel("Õï¶Ï½á¹û :");  
			Õï¶Ï½á¹û.setForeground(Color.WHITE);
			Õï¶Ï½á¹û.setBounds(10, 20+ 300+ 90, 100, 50);
			JTextField Õï¶Ï½á¹û_box= new JTextField();
			Õï¶Ï½á¹û_box.setBounds(10, 33+ 325+ 90, 1070, 120);
			Õï¶Ï½á¹û_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(Õï¶Ï½á¹û);
			this.add(Õï¶Ï½á¹û_box);	
			
			
			//copy tab
			JLabel baiDanBai= new JLabel("°×µ°°×alb :");  
			baiDanBai.setForeground(Color.WHITE);
			baiDanBai.setBounds(10, 20+ 0, 100, 50);
			JTextField baiDanBai_box= new JTextField();
			baiDanBai_box.setBounds(10+ 110, 33+ 0, 80, 20);
			baiDanBai_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(baiDanBai);
			this.add(baiDanBai_box);	
			
			JLabel label2= new JLabel("ÒÒ¸ÎÁ½¶Ô°ëhbcab:");  
			label2.setForeground(Color.WHITE);
			label2.setBounds(10, 20+ 25*1, 100, 50);
			JTextField label2_box= new JTextField();
			label2_box.setBounds(10+ 110, 33+ 25*1, 80, 20);
			label2_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label2);
			this.add(label2_box);	

			JLabel label3= new JLabel("ÌÇÄÍÁ¿ÊµÑé :");  
			label3.setForeground(Color.WHITE);
			label3.setBounds(10, 20+ 25*2, 100, 50);
			JTextField label3_box= new JTextField();
			label3_box.setBounds(10+ 110, 33+ 25*2, 80, 20);
			label3_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label3);
			this.add(label3_box);	
			
			JLabel label4= new JLabel("òý³æ¾µ¼ì :");  
			label4.setForeground(Color.WHITE);
			label4.setBounds(10, 20+ 25* 3, 100, 50);
			JTextField label4_box= new JTextField();
			label4_box.setBounds(10+ 110, 33+ 25* 3, 80, 20);
			label4_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label4);
			this.add(label4_box);	
			
			JLabel label5= new JLabel("ÐÔ²¡Ö§Ô­Ìå¼ì²â£¨uu£© :");  
			label5.setForeground(Color.WHITE);
			label5.setBounds(10, 20+ 25*4, 100, 50);
			JTextField label5_box= new JTextField();
			label5_box.setBounds(10+ 110, 33+ 25*4, 80, 20);
			label5_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label5);
			this.add(label5_box);	
			
			JLabel label6= new JLabel("µÍÃÜ¶ÈÖ¬µ°°×ldl-c :");  
			label6.setForeground(Color.WHITE);
			label6.setBounds(10, 20+ 25*5, 100, 50);
			JTextField label6_box= new JTextField();
			label6_box.setBounds(10+ 110, 33+ 25*5, 80, 20);
			label6_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label6);
			this.add(label6_box);	
			
			//7
			JLabel label7= new JLabel("Ñª°±nh3 :");  
			label7.setForeground(Color.WHITE);
			label7.setBounds(10, 20+ 25*6, 100, 50);
			JTextField label7_box= new JTextField();
			label7_box.setBounds(10+ 110, 33+ 25*6, 80, 20);
			label7_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label7);
			this.add(label7_box);	
			//8
			JLabel label68= new JLabel("ÒÈµºËØ¿¹Ìåins-ab :");  
			label68.setForeground(Color.WHITE);
			label68.setBounds(10, 20+ 25*7, 100, 50);
			JTextField label68_box= new JTextField();
			label68_box.setBounds(10+ 110, 33+ 25*7, 80, 20);
			label68_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label68);
			this.add(label68_box);	
			//9
			JLabel label69= new JLabel("¼Ø£¨Äò£©¼Ø£¨Äò£© :");  
			label69.setForeground(Color.WHITE);
			label69.setBounds(10, 20+ 25*8, 100, 50);
			JTextField label69_box= new JTextField();
			label69_box.setBounds(10+ 110, 33+ 25*8, 80, 20);
			label69_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label69);
			this.add(label69_box);	
			//10
			JLabel label610= new JLabel("Á×ip :");  
			label610.setForeground(Color.WHITE);
			label610.setBounds(10, 20+ 25*9, 100, 50);
			JTextField label610_box= new JTextField();
			label610_box.setBounds(10+ 110, 33+ 25*9, 80, 20);
			label610_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label610);
			this.add(label610_box);	
			//11
			JLabel label611= new JLabel("ÂÈ£¨Äò£©ÂÈ£¨Äò£©:");  
			label611.setForeground(Color.WHITE);
			label611.setBounds(10, 20+ 25*10, 100, 50);
			JTextField label611_box= new JTextField();
			label611_box.setBounds(10+ 110, 33+ 25*10, 80, 20);
			label611_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label611);
			this.add(label611_box);	
			//12
			JLabel label612= new JLabel("¼¡¸Æµ°°×ttnt :");  
			label612.setForeground(Color.WHITE);
			label612.setBounds(10, 20+ 25*11, 100, 50);
			JTextField label612_box= new JTextField();
			label612_box.setBounds(10+ 110, 33+ 25*11, 80, 20);
			label612_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label612);
			this.add(label612_box);	
			//13
			JLabel label613= new JLabel("ÄÆ£¨Äò£©ÄÆ£¨Äò£© :");  
			label613.setForeground(Color.WHITE);
			label613.setBounds(10, 20+ 25*12, 100, 50);
			JTextField label613_box= new JTextField();
			label613_box.setBounds(10+ 110, 33+ 25*12, 80, 20);
			label613_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label613);
			this.add(label613_box);	
			//14
			JLabel label614= new JLabel("¼îÐÔÁ×ËáÃ¸alp :");  
			label614.setForeground(Color.WHITE);
			label614.setBounds(10, 20+ 25*13, 100, 50);
			JTextField label614_box= new JTextField();
			label614_box.setBounds(10+ 110, 33+ 25*13, 80, 20);
			label614_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label614);
			this.add(label614_box);	
			//
			addSecondColomns();
			addThirdColomns();
			addFourthColomns();
			addFifthColomns();
		}
		private void addFifthColomns() {
			// TODO Auto-generated method stub
			//copy tab
			JLabel baiDanBai222223= new JLabel("ÑªÉøÍ¸Ñ¹Ñªosm:");  
			baiDanBai222223.setForeground(Color.WHITE);
			baiDanBai222223.setBounds(10+220*4, 20+ 0, 100, 50);
			JTextField baiDanBai222223_box= new JTextField();
			baiDanBai222223_box.setBounds(10+ 110+220*4, 33+ 0, 80, 20);
			baiDanBai222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(baiDanBai222223);
			this.add(baiDanBai222223_box);	
			
			JLabel label2222223= new JLabel("¼¡ôûÇå³ýÂÊcor:");  
			label2222223.setForeground(Color.WHITE);
			label2222223.setBounds(10+220*4, 20+ 25*1, 100, 50);
			JTextField label2222223_box= new JTextField();
			label2222223_box.setBounds(10+ 110+220*4, 33+ 25*1, 80, 20);
			label2222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label2222223);
			this.add(label2222223_box);	

			JLabel label3222223= new JLabel("Ñª£¨Äò£©Í­ cu:");  
			label3222223.setForeground(Color.WHITE);
			label3222223.setBounds(10+220*4, 20+ 25*2, 100, 50);
			JTextField label3222223_box= new JTextField();
			label3222223_box.setBounds(10+ 110+220*4, 33+ 25*2, 80, 20);
			label3222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label3222223);
			this.add(label3222223_box);	
			
			JLabel label4222223= new JLabel("×é·ÖÇø´ø igg:");  
			label4222223.setForeground(Color.WHITE);
			label4222223.setBounds(10+220*4, 20+ 25* 3, 100, 50);
			JTextField label4222223_box= new JTextField();
			label4222223_box.setBounds(10+ 110+220*4, 33+ 25* 3, 80, 20);
			label4222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label4222223);
			this.add(label4222223_box);	
			
			JLabel label5222223= new JLabel("¼××´ÅÔÏÙ¼¤ËØ pth:");  
			label5222223.setForeground(Color.WHITE);
			label5222223.setBounds(10+220*4, 20+ 25*4, 100, 50);
			JTextField label5222223_box= new JTextField();
			label5222223_box.setBounds(10+ 110+220*4, 33+ 25*4, 80, 20);
			label5222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label5222223);
			this.add(label5222223_box);	
			
			JLabel label6222223= new JLabel("Äò3-¼×Ñõ»ù4-ôÇ»ù¿àÐÓÈÊËá£¨vma£©:");  
			label6222223.setForeground(Color.WHITE);
			label6222223.setBounds(10+220*4, 20+ 25*5, 100, 50);
			JTextField label6222223_box= new JTextField();
			label6222223_box.setBounds(10+ 110+220*4, 33+ 25*5, 80, 20);
			label6222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label6222223);
			this.add(label6222223_box);	
			
			//7
			JLabel label7222223= new JLabel("ÔØÖ¬µ°°×ap0alap0 al:");  
			label7222223.setForeground(Color.WHITE);
			label7222223.setBounds(10+220*4, 20+ 25*6, 100, 50);
			JTextField label7222223_box= new JTextField();
			label7222223_box.setBounds(10+ 110+220*4, 33+ 25*6, 80, 20);
			label7222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label7222223);
			this.add(label7222223_box);	
			//8
			JLabel label68222223= new JLabel("¼¡¸Æµ°°×i tni:");  
			label68222223.setForeground(Color.WHITE);
			label68222223.setBounds(10+220*4, 20+ 25*7, 100, 50);
			JTextField label68222223_box= new JTextField();
			label68222223_box.setBounds(10+ 110+220*4, 33+ 25*7, 80, 20);
			label68222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label68222223);
			this.add(label68222223_box);	
			//9
			JLabel label69222223= new JLabel("ÂÈ´×ËáÝÁ·Óas-dõ¥Ã¸È¾É«:");  
			label69222223.setForeground(Color.WHITE);
			label69222223.setBounds(10+220*4, 20+ 25*8, 100, 50);
			JTextField label69222223_box= new JTextField();
			label69222223_box.setBounds(10+ 110+220*4, 33+ 25*8, 80, 20);
			label69222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label69222223);
			this.add(label69222223_box);	
			//10
			JLabel label610222223= new JLabel("ÈéËá lact:");  
			label610222223.setForeground(Color.WHITE);
			label610222223.setBounds(10+220*4, 20+ 25*9, 100, 50);
			JTextField label610222223_box= new JTextField();
			label610222223_box.setBounds(10+ 110+220*4, 33+ 25*9, 80, 20);
			label610222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label610222223);
			this.add(label610222223_box);	
			//11
			JLabel label611222223= new JLabel("Ö×Áö±ê¼Ç¿¹Ô­242¼ì²â ca242 :");  
			label611222223.setForeground(Color.WHITE);
			label611222223.setBounds(10+220*4, 20+ 25*10, 100, 50);
			JTextField label611222223_box= new JTextField();
			label611222223_box.setBounds(10+ 110+220*4, 33+ 25*10, 80, 20);
			label611222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label611222223);
			this.add(label611222223_box);	
			//12
			JLabel label612222223= new JLabel("¸Æ ca:");  
			label612222223.setForeground(Color.WHITE);
			label612222223.setBounds(10+220*4, 20+ 25*11, 100, 50);
			JTextField label612222223_box= new JTextField();
			label612222223_box.setBounds(10+ 110+220*4, 33+ 25*11, 80, 20);
			label612222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label612222223);
			this.add(label612222223_box);	
			//13
			JLabel label613222223= new JLabel("¾ÞÊÉÏ¸°û¸ÐÈ¾Ç÷»¯Òò×Ó-1¦Â mip-1¦Â:");  
			label613222223.setForeground(Color.WHITE);
			label613222223.setBounds(10+220*4, 20+ 25*12, 100, 50);
			JTextField label613222223_box= new JTextField();
			label613222223_box.setBounds(10+ 110+220*4, 33+ 25*12, 80, 20);
			label613222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label613222223);
			this.add(label613222223_box);	
			//14
			JLabel label614222223= new JLabel("Äò17-ôÇ¹Ì´¼ 17-oh:");  
			label614222223.setForeground(Color.WHITE);
			label614222223.setBounds(10+220*4, 20+ 25*13, 100, 50);
			JTextField label614222223_box= new JTextField();
			label614222223_box.setBounds(10+ 110+220*4, 33+ 25*13, 80, 20);
			label614222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label614222223);
			this.add(label614222223_box);	
		}
		
		void addFourthColomns() {
			// TODO Auto-generated method stub
			//copy tab
			JLabel baiDanBai222223= new JLabel("ldhÍ¬¹¤Ã¸is0-ldh :");  
			baiDanBai222223.setForeground(Color.WHITE);
			baiDanBai222223.setBounds(10+220*3, 20+ 0, 100, 50);
			JTextField baiDanBai222223_box= new JTextField();
			baiDanBai222223_box.setBounds(10+ 110+220*3, 33+ 0, 80, 20);
			baiDanBai222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(baiDanBai222223);
			this.add(baiDanBai222223_box);	
			
			JLabel label2222223= new JLabel("ÒÈµºËØins :");  
			label2222223.setForeground(Color.WHITE);
			label2222223.setBounds(10+220*3, 20+ 25*1, 100, 50);
			JTextField label2222223_box= new JTextField();
			label2222223_box.setBounds(10+ 110+220*3, 33+ 25*1, 80, 20);
			label2222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label2222223);
			this.add(label2222223_box);	

			JLabel label3222223= new JLabel("Í¬ t:");  
			label3222223.setForeground(Color.WHITE);
			label3222223.setBounds(10+220*3, 20+ 25*2, 100, 50);
			JTextField label3222223_box= new JTextField();
			label3222223_box.setBounds(10+ 110+220*3, 33+ 25*2, 80, 20);
			label3222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label3222223);
			this.add(label3222223_box);	
			
			JLabel label4222223= new JLabel("µí·ÛÃ¸ amy:");  
			label4222223.setForeground(Color.WHITE);
			label4222223.setBounds(10+220*3, 20+ 25* 3, 100, 50);
			JTextField label4222223_box= new JTextField();
			label4222223_box.setBounds(10+ 110+220*3, 33+ 25* 3, 80, 20);
			label4222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label4222223);
			this.add(label4222223_box);	
			
			JLabel label5222223= new JLabel("ÈéËáÍÑÇâÃ¸ ldh:");  
			label5222223.setForeground(Color.WHITE);
			label5222223.setBounds(10+220*3, 20+ 25*4, 100, 50);
			JTextField label5222223_box= new JTextField();
			label5222223_box.setBounds(10+ 110+220*3, 33+ 25*4, 80, 20);
			label5222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label5222223);
			this.add(label5222223_box);	
			
			JLabel label6222223= new JLabel("Ìú tron:");  
			label6222223.setForeground(Color.WHITE);
			label6222223.setBounds(10+220*3, 20+ 25*5, 100, 50);
			JTextField label6222223_box= new JTextField();
			label6222223_box.setBounds(10+ 110+220*3, 33+ 25*5, 80, 20);
			label6222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label6222223);
			this.add(label6222223_box);	
			
			//7
			JLabel label7222223= new JLabel("ËáÐÔÁ×ËáÃ¸ºÍ¾ÆÊ¯Ëál+:");  
			label7222223.setForeground(Color.WHITE);
			label7222223.setBounds(10+220*3, 20+ 25*6, 100, 50);
			JTextField label7222223_box= new JTextField();
			label7222223_box.setBounds(10+ 110+220*3, 33+ 25*6, 80, 20);
			label7222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label7222223);
			this.add(label7222223_box);	
			//8
			JLabel label68222223= new JLabel("Á£Ï¸°û´Ì¼¤Òò×Óg-csf:");  
			label68222223.setForeground(Color.WHITE);
			label68222223.setBounds(10+220*3, 20+ 25*7, 100, 50);
			JTextField label68222223_box= new JTextField();
			label68222223_box.setBounds(10+ 110+220*3, 33+ 25*7, 80, 20);
			label68222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label68222223);
			this.add(label68222223_box);	
			//9
			JLabel label69222223= new JLabel("´Æ¼¤ËØ el:");  
			label69222223.setForeground(Color.WHITE);
			label69222223.setBounds(10+220*3, 20+ 25*8, 100, 50);
			JTextField label69222223_box= new JTextField();
			label69222223_box.setBounds(10+ 110+220*3, 33+ 25*8, 80, 20);
			label69222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label69222223);
			this.add(label69222223_box);	
			//10
			JLabel label610222223= new JLabel("Í¬¹¤Ã¸ck-mb:");  
			label610222223.setForeground(Color.WHITE);
			label610222223.setBounds(10+220*3, 20+ 25*9, 100, 50);
			JTextField label610222223_box= new JTextField();
			label610222223_box.setBounds(10+ 110+220*3, 33+ 25*9, 80, 20);
			label610222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label610222223);
			this.add(label610222223_box);	
			//11
			JLabel label611222223= new JLabel("ÄòÉøÍ¸Ñ¹Äòosm:");  
			label611222223.setForeground(Color.WHITE);
			label611222223.setBounds(10+220*3, 20+ 25*10, 100, 50);
			JTextField label611222223_box= new JTextField();
			label611222223_box.setBounds(10+ 110+220*3, 33+ 25*10, 80, 20);
			label611222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label611222223);
			this.add(label611222223_box);	
			//12
			JLabel label612222223= new JLabel("½áºËÓ¡¼£ÊÔÑétb-poc:");  
			label612222223.setForeground(Color.WHITE);
			label612222223.setBounds(10+220*3, 20+ 25*11, 100, 50);
			JTextField label612222223_box= new JTextField();
			label612222223_box.setBounds(10+ 110+220*3, 33+ 25*11, 80, 20);
			label612222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label612222223);
			this.add(label612222223_box);	
			//13
			JLabel label613222223= new JLabel("ÏÙÜÕÍÑ°±Ëá ada :");  
			label613222223.setForeground(Color.WHITE);
			label613222223.setBounds(10+220*3, 20+ 25*12, 100, 50);
			JTextField label613222223_box= new JTextField();
			label613222223_box.setBounds(10+ 110+220*3, 33+ 25*12, 80, 20);
			label613222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label613222223);
			this.add(label613222223_box);	
			//14
			JLabel label614222223= new JLabel("¼âÈñÊªðà´×Ëá°×:");  
			label614222223.setForeground(Color.WHITE);
			label614222223.setBounds(10+220*3, 20+ 25*13, 100, 50);
			JTextField label614222223_box= new JTextField();
			label614222223_box.setBounds(10+ 110+220*3, 33+ 25*13, 80, 20);
			label614222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label614222223);
			this.add(label614222223_box);	
		}
		
		private void addThirdColomns() {
			// TODO Auto-generated method stub
			//copy tab
			JLabel baiDanBai222223= new JLabel("¾üÍÅ¾ú¿¹Ô­¼ì²â:");  
			baiDanBai222223.setForeground(Color.WHITE);
			baiDanBai222223.setBounds(10+220*2, 20+ 0, 100, 50);
			JTextField baiDanBai222223_box= new JTextField();
			baiDanBai222223_box.setBounds(10+ 110+220*2, 33+ 0, 80, 20);
			baiDanBai222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(baiDanBai222223);
			this.add(baiDanBai222223_box);	
			
			JLabel label2222223= new JLabel("Õæ¾úÅàÑøÈ¡²Äcultureoffungi :");  
			label2222223.setForeground(Color.WHITE);
			label2222223.setBounds(10+220*2, 20+ 25*1, 100, 50);
			JTextField label2222223_box= new JTextField();
			label2222223_box.setBounds(10+ 110+220*2, 33+ 25*1, 80, 20);
			label2222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label2222223);
			this.add(label2222223_box);	

			JLabel label3222223= new JLabel("×ªëÄÃ¸ggt :");  
			label3222223.setForeground(Color.WHITE);
			label3222223.setBounds(10+220*2, 20+ 25*2, 100, 50);
			JTextField label3222223_box= new JTextField();
			label3222223_box.setBounds(10+ 110+220*2, 33+ 25*2, 80, 20);
			label3222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label3222223);
			this.add(label3222223_box);	
			
			JLabel label4222223= new JLabel("ÃâÒß×é»¯Ñé²éimmunohistophathol-ogicstain :");  
			label4222223.setForeground(Color.WHITE);
			label4222223.setBounds(10+220*2, 20+ 25* 3, 100, 50);
			JTextField label4222223_box= new JTextField();
			label4222223_box.setBounds(10+ 110+220*2, 33+ 25* 3, 80, 20);
			label4222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label4222223);
			this.add(label4222223_box);	
			
			JLabel label5222223= new JLabel("ËÄÏîÓÕµ¼ÑªÐ¡°å¾Û¼¯¹¦ÄÜ²âÊÔ£¨mulitipleagentplateletaggregationtest£©4-pagt :");  
			label5222223.setForeground(Color.WHITE);
			label5222223.setBounds(10+220*2, 20+ 25*4, 100, 50);
			JTextField label5222223_box= new JTextField();
			label5222223_box.setBounds(10+ 110+220*2, 33+ 25*4, 80, 20);
			label5222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label5222223);
			this.add(label5222223_box);	
			
			JLabel label6222223= new JLabel("ËèÇÊ¼îÐÔµ°°×mbp :");  
			label6222223.setForeground(Color.WHITE);
			label6222223.setBounds(10+220*2, 20+ 25*5, 100, 50);
			JTextField label6222223_box= new JTextField();
			label6222223_box.setBounds(10+ 110+220*2, 33+ 25*5, 80, 20);
			label6222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label6222223);
			this.add(label6222223_box);	
			
			//7
			JLabel label7222223= new JLabel("Æ¤·ô²¡Àí»î¼ìdermatopathologicalexamination :");  
			label7222223.setForeground(Color.WHITE);
			label7222223.setBounds(10+220*2, 20+ 25*6, 100, 50);
			JTextField label7222223_box= new JTextField();
			label7222223_box.setBounds(10+ 110+220*2, 33+ 25*6, 80, 20);
			label7222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label7222223);
			this.add(label7222223_box);	
			//8
			JLabel label68222223= new JLabel("Ñª£¨Äò£©Ð¿zn :");  
			label68222223.setForeground(Color.WHITE);
			label68222223.setBounds(10+220*2, 20+ 25*7, 100, 50);
			JTextField label68222223_box= new JTextField();
			label68222223_box.setBounds(10+ 110+220*2, 33+ 25*7, 80, 20);
			label68222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label68222223);
			this.add(label68222223_box);	
			//9
			JLabel label69222223= new JLabel("ÄòÆ¤ÖÊ´¼ÄòÆ¤ÖÊ´¼ :");  
			label69222223.setForeground(Color.WHITE);
			label69222223.setBounds(10+220*2, 20+ 25*8, 100, 50);
			JTextField label69222223_box= new JTextField();
			label69222223_box.setBounds(10+ 110+220*2, 33+ 25*8, 80, 20);
			label69222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label69222223);
			this.add(label69222223_box);	
			//10
			JLabel label610222223= new JLabel("°×É«ÄîÖé¾ú¿¹Ô­:");  
			label610222223.setForeground(Color.WHITE);
			label610222223.setBounds(10+220*2, 20+ 25*9, 100, 50);
			JTextField label610222223_box= new JTextField();
			label610222223_box.setBounds(10+ 110+220*2, 33+ 25*9, 80, 20);
			label610222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label610222223);
			this.add(label610222223_box);	
			//11
			JLabel label611222223= new JLabel("ÒÒ¸ÎÁ½¶Ô°ëhbeab :");  
			label611222223.setForeground(Color.WHITE);
			label611222223.setBounds(10+220*2, 20+ 25*10, 100, 50);
			JTextField label611222223_box= new JTextField();
			label611222223_box.setBounds(10+ 110+220*2, 33+ 25*10, 80, 20);
			label611222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label611222223);
			this.add(label611222223_box);	
			//12
			JLabel label612222223= new JLabel("ÔçÀÏËØ-1ps-1:");  
			label612222223.setForeground(Color.WHITE);
			label612222223.setBounds(10+220*2, 20+ 25*11, 100, 50);
			JTextField label612222223_box= new JTextField();
			label612222223_box.setBounds(10+ 110+220*2, 33+ 25*11, 80, 20);
			label612222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label612222223);
			this.add(label612222223_box);	
			//13
			JLabel label613222223= new JLabel("×Üµ°°×tp:");  
			label613222223.setForeground(Color.WHITE);
			label613222223.setBounds(10+220*2, 20+ 25*12, 100, 50);
			JTextField label613222223_box= new JTextField();
			label613222223_box.setBounds(10+ 110+220*2, 33+ 25*12, 80, 20);
			label613222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label613222223);
			this.add(label613222223_box);	
			//14
			JLabel label614222223= new JLabel("·ÎÑ×Ö§Ô­Ìåigg:");  
			label614222223.setForeground(Color.WHITE);
			label614222223.setBounds(10+220*2, 20+ 25*13, 100, 50);
			JTextField label614222223_box= new JTextField();
			label614222223_box.setBounds(10+ 110+220*2, 33+ 25*13, 80, 20);
			label614222223_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label614222223);
			this.add(label614222223_box);	
		}
		
		private void addSecondColomns() {
			// TODO Auto-generated method stub
			//copy tab
			JLabel baiDanBai22= new JLabel("ÁÜÇò¾úÅàÑøÈ¡²Äcultureofneisseriagonorrhoen:");  
			baiDanBai22.setForeground(Color.WHITE);
			baiDanBai22.setBounds(10+220*1, 20+ 0, 100, 50);
			JTextField baiDanBai22_box= new JTextField();
			baiDanBai22_box.setBounds(10+ 110+220*1, 33+ 0, 80, 20);
			baiDanBai22_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(baiDanBai22);
			this.add(baiDanBai22_box);	
			
			JLabel label222= new JLabel("ÄòËá£¨Äò£©:");  
			label222.setForeground(Color.WHITE);
			label222.setBounds(10+220*1, 20+ 25*1, 100, 50);
			JTextField label222_box= new JTextField();
			label222_box.setBounds(10+ 110+220*1, 33+ 25*1, 80, 20);
			label222_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label222);
			this.add(label222_box);	

			JLabel label322= new JLabel("ÑªÐ¡°å¾Û¼¯:");  
			label322.setForeground(Color.WHITE);
			label322.setBounds(10+220*1, 20+ 25*2, 100, 50);
			JTextField label322_box= new JTextField();
			label322_box.setBounds(10+ 110+220*1, 33+ 25*2, 80, 20);
			label322_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label322);
			this.add(label322_box);	
			
			JLabel label422= new JLabel("¹È²Ý×ª°±Ã¸ast:");  
			label422.setForeground(Color.WHITE);
			label422.setBounds(10+220*1, 20+ 25* 3, 100, 50);
			JTextField label422_box= new JTextField();
			label422_box.setBounds(10+ 110+220*1, 33+ 25* 3, 80, 20);
			label422_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label422);
			this.add(label422_box);	
			
			JLabel label522= new JLabel("¼×¸Î¿¹Ìå-igmhav-igm:");  
			label522.setForeground(Color.WHITE);
			label522.setBounds(10+220*1, 20+ 25*4, 100, 50);
			JTextField label522_box= new JTextField();
			label522_box.setBounds(10+ 110+220*1, 33+ 25*4, 80, 20);
			label522_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label522);
			this.add(label522_box);	
			
			JLabel label622= new JLabel("Éú³¤¼¤ËØgh:");  
			label622.setForeground(Color.WHITE);
			label622.setBounds(10+220*1, 20+ 25*5, 100, 50);
			JTextField label622_box= new JTextField();
			label622_box.setBounds(10+ 110+220*1, 33+ 25*5, 80, 20);
			label622_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label622);
			this.add(label622_box);	
			
			//7
			JLabel label722= new JLabel("Ö¬·¾Ã¸lipase:");  
			label722.setForeground(Color.WHITE);
			label722.setBounds(10+220*1, 20+ 25*6, 100, 50);
			JTextField label722_box= new JTextField();
			label722_box.setBounds(10+ 110+220*1, 33+ 25*6, 80, 20);
			label722_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label722);
			this.add(label722_box);	
			//8
			JLabel label6822= new JLabel("Ñª½¬Ò¶Ëá²â¶¨fa:");  
			label6822.setForeground(Color.WHITE);
			label6822.setBounds(10+220*1, 20+ 25*7, 100, 50);
			JTextField label6822_box= new JTextField();
			label6822_box.setBounds(10+ 110+220*1, 33+ 25*7, 80, 20);
			label6822_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label6822);
			this.add(label6822_box);	
			//9
			JLabel label6922= new JLabel("ck-mmÍ¬¹¤Ã¸:");  
			label6922.setForeground(Color.WHITE);
			label6922.setBounds(10+220*1, 20+ 25*8, 100, 50);
			JTextField label6922_box= new JTextField();
			label6922_box.setBounds(10+ 110+220*1, 33+ 25*8, 80, 20);
			label6922_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label6922);
			this.add(label6922_box);	
			//10
			JLabel label61022= new JLabel("ÌØÒìÐÔõ¥Ã¸Ë«È¾É«:");  
			label61022.setForeground(Color.WHITE);
			label61022.setBounds(10+220*1, 20+ 25*9, 100, 50);
			JTextField label61022_box= new JTextField();
			label61022_box.setBounds(10+ 110+220*1, 33+ 25*9, 80, 20);
			label61022_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label61022);
			this.add(label61022_box);	
			//11
			JLabel label61122= new JLabel("ÌúÈ¾É«:");  
			label61122.setForeground(Color.WHITE);
			label61122.setBounds(10+220*1, 20+ 25*10, 100, 50);
			JTextField label61122_box= new JTextField();
			label61122_box.setBounds(10+ 110+220*1, 33+ 25*10, 80, 20);
			label61122_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label61122);
			this.add(label61122_box);	
			//12
			JLabel label61222= new JLabel("ÌúÈ¾É«:");  
			label61222.setForeground(Color.WHITE);
			label61222.setBounds(10+220*1, 20+ 25*11, 100, 50);
			JTextField label61222_box= new JTextField();
			label61222_box.setBounds(10+ 110+220*1, 33+ 25*11, 80, 20);
			label61222_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label61222);
			this.add(label61222_box);	
			//13
			JLabel label61322= new JLabel("ÒÒ¸ÎÁ½¶Ô°ëhbeag:");  
			label61322.setForeground(Color.WHITE);
			label61322.setBounds(10+220*1, 20+ 25*12, 100, 50);
			JTextField label61322_box= new JTextField();
			label61322_box.setBounds(10+ 110+220*1, 33+ 25*12, 80, 20);
			label61322_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

				}
			});
			this.add(label61322);
			this.add(label61322_box);	
			//14
			JLabel label61422= new JLabel("¦Á-´×ËáÝÁ·Óõ¥Ã¸È¾É« :");  
			label61422.setForeground(Color.WHITE);
			label61422.setBounds(10+220*1, 20+ 25*13, 100, 50);
			JTextField label61422_box= new JTextField();
			label61422_box.setBounds(10+ 110+220*1, 33+ 25*13, 80, 20);
			label61422_box.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//¼Ó×´Ì¬£»

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
