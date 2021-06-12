package PEI.thread;
import java.awt.Color;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import AVQ.OEQ.cap.Monitor;
import AVQ.PVU.vedio.PlayerControl;
import AVQ.PVU.vedio.PlayerShow;
import ME.APM.VSQ.App;
import MVQ.button.DetaButton;
import MVQ.filenameFilter.TXTFilter;
import OCI.ME.analysis.C.A;
public class MakeContainerZNXZ extends Thread implements Runnable{
	public Container jpanelThird;
	public App u;
	public JTabbedPane jTabbedpane;
	public List<String> tabNames;
	public A _A;
	public Thread thread;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public MakeContainerZNXZ(A _A, Container jpanelThird, App u2
			, JTabbedPane jTabbedpane, List<String> tabNames2, Map<String, String> pos
			, Map<String, String> pose, Map<String, String> etc, Map<String, String> cte) {
		super();
		this.jpanelThird= jpanelThird;
		this.u= u2;
		this.tabNames= tabNames2;
		this.jTabbedpane= jTabbedpane;
		this._A= _A;
		this.pos= pos;
		this.pose= pose;
		this.etc= etc;
		this.cte= cte;	
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*5);
			jpanelThird.setLayout(null);
			jpanelThird.setBounds(0, 0, 1490, 980);	
			u.monitor = new Monitor();
			u.monitor.setVisible(true);
			u.monitor.init();
			u.monitor.sliderx = new JSlider(0,360);
			u.monitor.sliderx.setSnapToTicks(true);
			u.monitor.sliderx.setPaintTicks(true);
			u.monitor.sliderx.setMajorTickSpacing(5);
			u.monitor.sliderx.setMinorTickSpacing(1);
			u.monitor.sliderx.setBackground(Color.black);
			u.monitor.sliderx.setForeground(Color.white);
			u.monitor.sliderx.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.monitor.facx = source.getValue();  
						}
					});  

			u.monitor.slidery = new JSlider(0,360);
			u.monitor.slidery.setSnapToTicks(true);
			u.monitor.slidery.setPaintTicks(true);
			u.monitor.slidery.setMajorTickSpacing(5);
			u.monitor.slidery.setMinorTickSpacing(1);
			u.monitor.slidery.setBackground(Color.black);
			u.monitor.slidery.setForeground(Color.white);
			u.monitor.slidery.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.monitor.facy = source.getValue();  
						}
					});  

			u.monitor.sliderz = new JSlider(0,360);
			u.monitor.sliderz.setSnapToTicks(true);
			u.monitor.sliderz.setPaintTicks(true);
			u.monitor.sliderz.setMajorTickSpacing(5);
			u.monitor.sliderz.setMinorTickSpacing(1);
			u.monitor.sliderz.setBackground(Color.black);
			u.monitor.sliderz.setForeground(Color.white);
			u.monitor.sliderz.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.monitor.facz = source.getValue(); 
						}
					});  
			u.monitor.slidert = new JSlider(0,100);
			u.monitor.slidert.setSnapToTicks(true);
			u.monitor.slidert.setPaintTicks(true);
			u.monitor.slidert.setMajorTickSpacing(5);
			u.monitor.slidert.setMinorTickSpacing(1);
			u.monitor.slidert.setBackground(Color.black);
			u.monitor.slidert.setForeground(Color.white);
			u.monitor.slidert.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.monitor.fact = source.getValue();  
							System.out.println(u.monitor.fact);
						}
					});  
			u.monitor.sliderl = new JSlider(0,360);
			u.monitor.sliderl.setSnapToTicks(true);
			u.monitor.sliderl.setPaintTicks(true);
			u.monitor.sliderl.setMajorTickSpacing(5);
			u.monitor.sliderl.setMinorTickSpacing(1);
			u.monitor.sliderl.setBackground(Color.black);
			u.monitor.sliderl.setForeground(Color.white);
			u.monitor.sliderl.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.monitor.facl = source.getValue();  
						}
					});  

			u.monitor.bt00 = new DetaButton ("初始化重置",100,50, Color.red);
			u.monitor.bt00.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							u.monitor.isRedButton = false;
							u.monitor.isGreenButton = false;
							u.monitor.isBlueButton = false;
							u.monitor.isStreButton = false;
							u.monitor.isSblButton = false;
							u.monitor.isRcaButton = false;
							u.monitor.isPcaButton = false;
							u.monitor.isPcfButton = false;	
							u.monitor.isStop = false;	
							u.monitor.recordStop = true;	
							u.monitor.imageList.clear();	
							u.monitor.bt01.setLabel("红色光谱关");
							u.monitor.bt02.setLabel("绿色光谱关");
							u.monitor.bt03.setLabel("蓝色光谱关");
							u.monitor.bt10.setLabel("锐化拉伸关");
							u.monitor.bt11.setLabel("纹理检测关");
							u.monitor.bt12.setLabel("熵增过滤关");
							u.monitor.bt13.setLabel("成份分析关");
							u.monitor.bt20.setLabel("成份过滤关");
							u.monitor.bt20.setLabel("暂停视屏关");
							u.monitor.bt31.setLabel("开始录制流");
							u.monitor.facx=7;
							u.monitor.facy=100;
							u.monitor.facz=0;
							u.monitor.fact=0;
							u.monitor.facl=3;
							u.monitor.facr=0;
							u.monitor.facg=0;
							u.monitor.facb=0;
						}
					});

			u.monitor.bt01= new DetaButton ("红色光谱关",100,50, Color.red);
			u.monitor.bt01.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isRedButton==false) {
								u.monitor.isRedButton=true;
								u.monitor.bt01.setLabel("红色光谱开");
							}else {
								u.monitor.isRedButton=false;
								u.monitor.bt01.setLabel("红色光谱关");
							}
						}
					});

			u.monitor.bt02= new DetaButton ("绿色光谱关",100,50, Color.green);
			u.monitor.bt02.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isGreenButton==false) {
								u.monitor.isGreenButton=true;
								u.monitor.bt02.setLabel("绿色光谱开");
							}else {
								u.monitor.isGreenButton=false;
								u.monitor.bt02.setLabel("绿色光谱关");
							}
						}
					});

			u.monitor.bt03= new DetaButton ("蓝色光谱关",100,50, Color.blue);
			u.monitor.bt03.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isBlueButton==false) {
								u.monitor.isBlueButton=true;
								u.monitor.bt03.setLabel("蓝色光谱开");
							}else {
								u.monitor.isBlueButton=false;
								u.monitor.bt03.setLabel("蓝色光谱关");
							}
						}
					});

			u.monitor.bt10= new DetaButton ("锐化拉伸关",100,50, Color.magenta);
			u.monitor.bt10.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isStreButton== false) {
								u.monitor.isStreButton= true;
								u.monitor.bt10.setLabel("锐化拉伸开");
							}else {
								u.monitor.isStreButton= false;
								u.monitor.bt10.setLabel("锐化拉伸关");
							}
						}
					});

			u.monitor.bt11= new DetaButton("纹理检测关", 100, 50, Color.pink);
			u.monitor.bt11.addActionListener( 
					new ActionListener(){    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isSblButton== false){
								u.monitor.isSblButton= true;
								u.monitor.bt11.setLabel("纹理检测开");
							}else {
								u.monitor.isSblButton= false;
								u.monitor.bt11.setLabel("纹理检测关");
							}
						}
					});

			u.monitor.bt12= new DetaButton ("熵增过滤关",100,50, Color.pink);
			u.monitor.bt12.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isRcaButton==false) {
								u.monitor.isRcaButton=true;
								u.monitor.bt12.setLabel("熵增过滤开");
							}else {
								u.monitor.isRcaButton=false;
								u.monitor.bt12.setLabel("熵增过滤关");
							}
						}
					});

			u.monitor.bt13= new DetaButton ("成份分析关",100,50, Color.pink);
			u.monitor.bt13.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isPcaButton==false) {
								u.monitor.isPcaButton=true;
								u.monitor.bt13.setLabel("成份分析开");
							}else {
								u.monitor.isPcaButton=false;
								u.monitor.bt13.setLabel("成份分析关");
							}
						}
					});

			u.monitor.bt20= new DetaButton ("成份过滤关",100,50, Color.pink);
			u.monitor.bt20.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isPcfButton==false) {
								u.monitor.isPcfButton=true;
								u.monitor.bt20.setLabel("成份过滤开");
							}else {
								u.monitor.isPcfButton=false;
								u.monitor.bt20.setLabel("成份过滤关");
							}
						}
					});

			u.monitor.bt21= new DetaButton ("动态裁剪面",100,50, Color.pink);
			u.monitor.bt21.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt22= new DetaButton ("暂停视屏关",100,50, Color.pink);
			u.monitor.bt22.addActionListener(
					new ActionListener(){
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isStop == false) {
								u.monitor.isStop = true;
								u.monitor.bt22.setLabel("暂停视屏开");
							}else {
								u.monitor.isStop = false;
								u.monitor.bt22.setLabel("暂停视屏关");
							}
						}
					});

			u.monitor.bt23= new DetaButton ("保存该图片",100,50, Color.pink);
			u.monitor.bt23.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							//获取图片
							//弹出保存框
							if(null== u.monitor.imageForOutput) {
								return;
							}
							//get path
							FileDialog filedialog= new FileDialog(new Frame(), "导入到这里", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("png"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							try {
								File outputBin = new File(filepath+ ".png");
								if(null== u.monitor.imageForOutput) {
									return;
								}
								ImageIO.write(u.monitor.imageForOutput, "png", outputBin);	
							} catch (IOException writePngError) {
								System.out.println(filepath);
							}	
							//输出图片
						}
					});

			u.monitor.bt30= new DetaButton ("录制配置项",100,50, Color.pink);
			u.monitor.bt30.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt31= new DetaButton ("开始录制流",100,50, Color.pink);
			u.monitor.bt31.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.recordStop == true) {
								u.monitor.recordStop = false;
								u.monitor.bt31.setLabel("暂停录制流");
							}else {
								u.monitor.recordStop = true;
								u.monitor.bt31.setLabel("开始录制流");
							}
						}
					});

			u.monitor.bt32 = new DetaButton ("保存视屏流",100,50, Color.pink);
			u.monitor.bt32.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							if(u.monitor.imageList.size()<= 0|| !u.monitor.recordStop) {
								return;
							}
							FileDialog filedialog= new FileDialog(new Frame(), "导入到这里", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							File outputBin= new File(filepath+ ".lyg");
							Iterator<int[][]> iterator= u.monitor.imageList.iterator();
							try {
								FileOutputStream wr= new FileOutputStream(outputBin);
								//写头， 宽，长
								if(iterator.hasNext()) {
									int[][] bufferedImage= iterator.next(); 
									int width= bufferedImage.length;
									int height= bufferedImage[0].length;
									int flips= u.monitor.imageList.size();
									byte[] flipBytes= new byte[height* width* 4];
									
									byte[] widthBytes= new byte[4];
									widthBytes[0]=(byte)(width&0xff);
									widthBytes[1]=(byte)(width>>8&0xff);
									widthBytes[2]=(byte)(width>>16&0xff);
									widthBytes[3]=(byte)(width>>24&0xff);
									wr.write(widthBytes);
									
									byte[] heightBytes= new byte[4];
									heightBytes[0]=(byte)(height&0xff);
									heightBytes[1]=(byte)(height>>8&0xff);
									heightBytes[2]=(byte)(height>>16&0xff);
									heightBytes[3]=(byte)(height>>24&0xff);
									wr.write(heightBytes);
									
									byte[] flipsBytes= new byte[4];
									flipsBytes[0]=(byte)(flips&0xff);
									flipsBytes[1]=(byte)(flips>>8&0xff);
									flipsBytes[2]=(byte)(flips>>16&0xff);
									flipsBytes[3]=(byte)(flips>>24&0xff);
									wr.write(flipsBytes);
									//写头桢
									for(int i= 0; i< height; i++){
										for(int j= 0; j< width; j++){
											int pix= bufferedImage[j][i];	
											flipBytes[i* (width* 4)+ j* 4+ 0]= (byte)(pix    &0xff);
											flipBytes[i* (width* 4)+ j* 4+ 1]= (byte)(pix>>8 &0xff);
											flipBytes[i* (width* 4)+ j* 4+ 2]= (byte)(pix>>16&0xff);
											flipBytes[i* (width* 4)+ j* 4+ 3]= (byte)(pix>>24&0xff);
											
										}
									}
									wr.write(flipBytes);
									wr.flush();
									//写身体
									while(iterator.hasNext()) {
										//写身体每一帧
										int[][] flipImage= iterator.next(); 
										for(int i= 0; i< height; i++){
											for(int j= 0; j< width; j++){
												int pix= flipImage[j][i];	
												//byte[] flip=new byte[4];
												flipBytes[i* (width* 4)+ j* 4+ 0]= (byte)(pix    &0xff);
												flipBytes[i* (width* 4)+ j* 4+ 1]= (byte)(pix>>8 &0xff);
												flipBytes[i* (width* 4)+ j* 4+ 2]= (byte)(pix>>16&0xff);
												flipBytes[i* (width* 4)+ j* 4+ 3]= (byte)(pix>>24&0xff);
											}
										}
										wr.write(flipBytes);
										wr.flush();
									}
								}
								wr.close();
								u.monitor.imageList.clear();
							} catch (FileNotFoundException e1) {
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					});

			u.monitor.bt33= new DetaButton ("读取录制流",100,50, Color.pink);
			u.monitor.bt33.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							FileDialog filedialog= new FileDialog(new Frame(), "读取lyg 视频文件", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							File inputBin= new File(filepath);
							//读取头
							//ArrayList<BufferedImage> arrayList=new ArrayList<>();
							//读取宽
							try {
								@SuppressWarnings("resource")
								RandomAccessFile randomAccessFile= new RandomAccessFile(inputBin, "r");
								byte[] width= new byte[4];
								int w3= 0;
								int w2= 0;
								int w1= 0;
								int w0= 0;
								if (randomAccessFile.read(width) != 0) {  
									//bytes to int
									w3= (int)width[3]<<24 &0xff000000;
									w2= (int)width[2]<<16&0x00ff0000;
									w1= (int)width[1]<<8&0x0000ff00;
									w0= (int)width[0]&0x000000ff;
								}
								final int widthInt=  w3|w2|w1|w0;
								//读取长
								byte[] height= new byte[4];
								int h3= 0;
								int h2= 0;
								int h1= 0;
								int h0= 0;
								if (randomAccessFile.read(height) != 0) {  
									//bytes to int
									h3= (int)height[3]<<24 &0xff000000;
									h2= (int)height[2]<<16 &0x00ff0000;
									h1= (int)height[1]<<8 &0x0000ff00;
									h0= (int)height[0] &0x000000ff;

								}
								final int heightInt= h3|h2|h1|h0;
								//读取帧数
								byte[] flips= new byte[4];
								int f3= 0;
								int f2= 0;
								int f1= 0;
								int f0= 0;
								if (randomAccessFile.read(flips) != 0) {  
									//bytes to int
									f3= (int)flips[3]<<24 &0xff000000;
									f2= (int)flips[2]<<16 &0x00ff0000;
									f1= (int)flips[1]<<8 &0x0000ff00;
									f0= (int)flips[0] &0x000000ff;
								}	
								final int flipsInt= f3|f2|f1|f0;
								//初始桢
								Map<Integer, BufferedImage> flipImage= new HashMap<>();
								for(int i= 0; i< flipsInt; i++) {
									byte[] filp= new byte[widthInt* heightInt* 4];
									try {
										if (randomAccessFile.read(filp)!= 0) {  
											//filp to image
											BufferedImage image= new BufferedImage(widthInt, heightInt, BufferedImage.TYPE_INT_RGB);
											for(int h= 0; h< heightInt; h++) {
												for(int w= 0; w< widthInt; w++) {
													int p3= (int)filp[h* (widthInt* 4)+ w* 4+ 3]<< 24& 0xff000000;
													int p2= (int)filp[h* (widthInt* 4)+ w* 4+ 2]<< 16& 0x00ff0000;
													int p1= (int)filp[h* (widthInt* 4)+ w* 4+ 1]<< 8 & 0x0000ff00;
													int p0= (int)filp[h* (widthInt* 4)+ w* 4+ 0]     & 0x000000ff;
													int pix= p3|p2|p1|p0;
													image.setRGB(w, h, pix);
												}
											}												
											flipImage.put(i, image);
										}
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}
								int[] control= new int[8];
								control[5]= flipImage.size();
								PlayerControl playerControl= new PlayerControl(control, flipImage);
								playerControl.run();
								PlayerShow playerShow= new PlayerShow(playerControl, widthInt
										, heightInt, flipImage, control);
								playerShow.start();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}

					});

			u.monitor.bt43 = new DetaButton ("高斯谱分析",100,50, Color.pink);
			u.monitor.bt43.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt43Stop== false) {
								u.monitor.isbt43Stop= true;
								u.monitor.bt43.setLabel("高斯谱开启");
							}else {
								u.monitor.isbt43Stop= false;
								u.monitor.bt43.setLabel("高斯谱关闭");
							}
						}
					});

			u.monitor.bt42= new DetaButton ("巴特沃斯流",100,50, Color.pink);
			u.monitor.bt42.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt41= new DetaButton ("拉普拉斯流",100,50, Color.pink);
			u.monitor.bt41.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt41Stop== false) {
								u.monitor.isbt41Stop= true;
								u.monitor.bt41.setLabel("拉普拉斯开");
							}else {
								u.monitor.isbt41Stop= false;
								u.monitor.bt41.setLabel("拉普拉斯关");
							}
						}
					});

			u.monitor.bt40= new DetaButton ("线性傅里叶",100,50, Color.pink);
			u.monitor.bt40.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt50= new DetaButton ("欧基里德流",100,50, Color.pink);
			u.monitor.bt50.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt51= new DetaButton ("皮脂层透显",100,50, Color.pink);
			u.monitor.bt51.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt52= new DetaButton ("肝像色处理",100,50, Color.pink);
			u.monitor.bt52.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt52Stop== false) {
								u.monitor.isbt52Stop= true;
								u.monitor.bt52.setLabel("肝相视屏开");
								u.monitor.facr=130;
								u.monitor.facg=110;
								u.monitor.facb=160;
							}else {
								u.monitor.isbt52Stop= false;
								u.monitor.bt52.setLabel("肝相视屏关");
								u.monitor.facr=0;
								u.monitor.facg=0;
								u.monitor.facb=0;
							}
						}
					});

			u.monitor.bt53= new DetaButton ("心相视屏关",100,50, Color.pink);
			u.monitor.bt53.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt53Stop== false) {
								u.monitor.isbt53Stop= true;
								u.monitor.bt53.setLabel("心相视屏开");
							}else {
								u.monitor.isbt53Stop= false;
								u.monitor.bt53.setLabel("心相视屏关");
							}
						}
					});

			u.monitor.bt60 = new DetaButton ("肾相色处理",100,50, Color.pink);
			u.monitor.bt60.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt60Stop== false) {
								u.monitor.isbt60Stop= true;
								u.monitor.bt60.setLabel("肾相视屏开");
								u.monitor.facr=146;
								u.monitor.facg=126;
								u.monitor.facb=126;
							}else {
								u.monitor.isbt60Stop= false;
								u.monitor.bt60.setLabel("肾相视屏关");
								u.monitor.facr=0;
								u.monitor.facg=0;
								u.monitor.facb=0;
							}
						}
					});

			u.monitor.bt61 = new DetaButton ("伤口炎症状",100,50, Color.pink);
			u.monitor.bt61.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.monitor.bt1 = new DetaButton ("催化成份",100,50, Color.pink);
			u.monitor.bt1.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt62 = new DetaButton ("因博思关闭",100,50, Color.pink);
			u.monitor.bt62.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt62Stop== false) {
								u.monitor.isbt62Stop= true;
								u.monitor.bt62.setLabel("因博思开启");
							}else {
								u.monitor.isbt62Stop= false;
								u.monitor.bt62.setLabel("因博思关闭");
							}
						}
					});

			u.monitor.bt63 = new DetaButton ("鼻相色分析",100,50, Color.pink);
			u.monitor.bt63.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt70 = new DetaButton ("眼相色分析",100,50, Color.pink);
			u.monitor.bt70.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt71 = new DetaButton ("耳相色分析",100,50, Color.pink);
			u.monitor.bt71.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.monitor.bt72 = new DetaButton ("唇相色分析",100,50, Color.pink);
			u.monitor.bt72.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt73= new DetaButton ("白舌相色关",100,50, Color.white);
			u.monitor.bt73.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt73Stop== false) {
								u.monitor.isbt73Stop= true;
								u.monitor.bt73.setLabel("白舌相色开");
								u.monitor.facr=145;
								u.monitor.facg=115;
								u.monitor.facb=95;
							}else {
								u.monitor.isbt73Stop= false;
								u.monitor.bt73.setLabel("白舌相色关");
								u.monitor.facr=0;
								u.monitor.facg=0;
								u.monitor.facb=0;
							}
						}
					});

			u.monitor.bt80 = new DetaButton("青舌相色关",100,50, Color.blue);
			u.monitor.bt80.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt80Stop== false) {
								u.monitor.isbt80Stop= true;
								u.monitor.bt80.setLabel("青舌相色开");
								u.monitor.facr=205;
								u.monitor.facg=125;
								u.monitor.facb=140;
							}else {
								u.monitor.isbt80Stop= false;
								u.monitor.bt80.setLabel("青舌相色关");
								u.monitor.facr=0;
								u.monitor.facg=0;
								u.monitor.facb=0;
							}
						}
					});
			
			u.monitor.bt81 = new DetaButton ("紫舌相色关",100,50, Color.magenta);
			u.monitor.bt81.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt81Stop== false) {
								u.monitor.isbt81Stop= true;
								u.monitor.bt81.setLabel("紫舌相色开");
								u.monitor.facr=140;
								u.monitor.facg=200;
								u.monitor.facb=135;
							}else {
								u.monitor.isbt81Stop= false;
								u.monitor.bt81.setLabel("紫舌相色关");
								u.monitor.facr=0;
								u.monitor.facg=0;
								u.monitor.facb=0;
							}
						}
					});
			
			
			u.monitor.bt82= new DetaButton ("黄舌相色关",100,50, Color.yellow);
			u.monitor.bt82.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt82Stop== false) {
								u.monitor.isbt82Stop= true;
								u.monitor.bt82.setLabel("黄舌相色开");
								u.monitor.facr= 160;
								u.monitor.facg= 110;
								u.monitor.facb= 160;
							}else {
								u.monitor.isbt82Stop= false;
								u.monitor.bt82.setLabel("黄舌相色关");
								u.monitor.facr= 0;
								u.monitor.facg= 0;
								u.monitor.facb= 0;
							}
						}
					});
			
			u.monitor.bt83= new DetaButton ("红舌相色关",100,50, Color.red);
			u.monitor.bt83.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt83Stop== false) {
								u.monitor.isbt83Stop= true;
								u.monitor.bt83.setLabel("红舌相色开");
								u.monitor.facr= 100;
								u.monitor.facg= 125;
								u.monitor.facb= 135;
							}else {
								u.monitor.isbt83Stop= false;
								u.monitor.bt83.setLabel("红舌相色关");
								u.monitor.facr= 0;
								u.monitor.facg= 0;
								u.monitor.facb= 0;
							}
						}
					});

			u.monitor.bt84= new DetaButton ("上传视频项",100,50, Color.pink);
			u.monitor.bt84.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.monitor.bt85= new DetaButton ("上传声频项",100,50, Color.pink);
			u.monitor.bt85.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.monitor.bt86= new DetaButton ("上传图片项",100,50, Color.pink);
			u.monitor.bt86.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.monitor.bt87= new DetaButton ("上传文档项",100,50, Color.pink);
			u.monitor.bt87.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.monitor.bt88= new DetaButton ("识别眼睛关",100,50, Color.pink);
			u.monitor.bt88.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt88Stop== false) {
								u.monitor.isbt88Stop= true;
								u.monitor.bt88.setLabel("识别眼睛开");
							}else {
								u.monitor.isbt88Stop= false;
								u.monitor.bt88.setLabel("识别眼睛关");
							}
						}
					});
			
			u.monitor.bt89= new DetaButton ("识别鼻子关",100,50, Color.pink);
			u.monitor.bt89.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			
			u.monitor.bt90= new DetaButton ("识别五官关",100,50, Color.pink);
			u.monitor.bt90.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.monitor.bt91= new DetaButton ("识别嘴巴关",100,50, Color.pink);
			u.monitor.bt91.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.monitor.bt111= new DetaButton("导入图片关",100,50, Color.pink);
			u.monitor.bt111.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isStop == false) {
								u.monitor.isStop = true;
								u.monitor.bt111.setLabel("导入图片开");
								FileDialog filedialog= new FileDialog(new Frame(), "打开图片文件", FileDialog.LOAD);
								filedialog.setFilenameFilter(new TXTFilter("jpg"));
								filedialog.setVisible(true);
								String filepath= filedialog.getDirectory() + filedialog.getFile();
								System.out.println(filepath);
								File inputBin= new File(filepath);
								try {
									u.tempBufferedImage= ImageIO.read(inputBin);
//									Image img= image.getScaledInstance(u.monitor.imageForOutput.getWidth()
//											, u.monitor.imageForOutput.getHeight(), java.awt.Image.SCALE_SMOOTH);
//									u.monitor.imageForOutput.getGraphics().drawImage(img, 0, 0, null);
//									u.monitor.getGraphics().drawImage(img, 0, 0, 900, 680, u.monitor);// 绘出图形文件
									if(null== u.tempBufferedImage) {
										return;
									}
									u.monitor.stopBufferedImage= u.tempBufferedImage;
									u.monitor.img= u.monitor.stopBufferedImage.getScaledInstance(u.monitor.imageForOutput.getWidth()
												, u.monitor.imageForOutput.getHeight(), java.awt.Image.SCALE_SMOOTH);
									u.monitor.imageForOutput.getGraphics().drawImage(u.monitor.img, 0, 0, null);	
									u.monitor.getGraphics().drawImage(u.monitor.img, 0, 0, 900, 680, u.monitor);// 绘出图形文件
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								//imge format
								//leftPanel.img= image.getScaledInstance(605, 365, java.awt.Image.SCALE_SMOOTH);
							}else {
								u.monitor.isStop = false;
								u.monitor.bt111.setLabel("导入图片关");
							}	
						}
					});
			u.monitor.bt112= new DetaButton ("图搜索焦点", 100,50, Color.pink);
			u.monitor.bt112.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isStop== false) {
								u.monitor.isStop= true;
								u.monitor.bt22.setLabel("导入图片开");
								if(null== u.tempBufferedImage) {
									return;
								}
								u.monitor.stopBufferedImage= u.tempBufferedImage;
								u.monitor.img= u.monitor.stopBufferedImage.getScaledInstance(u.monitor.imageForOutput.getWidth()
											, u.monitor.imageForOutput.getHeight(), java.awt.Image.SCALE_SMOOTH);
								u.monitor.imageForOutput.getGraphics().drawImage(u.monitor.img, 0, 0, null);	
								u.monitor.getGraphics().drawImage(u.monitor.img, 0, 0, 900, 680, u.monitor);// 绘出图形文件
							}else {
								u.monitor.isStop = false;
								u.monitor.bt22.setLabel("导入图片关");
							}	
						}
					});
			u.monitor.bt113= new DetaButton ("索贝尔关闭",100,50, Color.pink);
			u.monitor.bt113.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt113Stop== false) {
								u.monitor.isbt113Stop= true;
								u.monitor.bt113.setLabel("索贝尔开启");
							}else {
								u.monitor.isbt113Stop= false;
								u.monitor.bt113.setLabel("索贝尔关闭");
							}
						}
					});
			u.monitor.bt114= new DetaButton ("肽特征关闭",100,50, Color.pink);
			u.monitor.bt114.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt114Stop== false) {
								u.monitor.isbt114Stop= true;
								u.monitor.bt114.setLabel("肽特征开启");
							}else {
								u.monitor.isbt114Stop= false;
								u.monitor.bt114.setLabel("肽特征关闭");
							}
						}
					});
			
			u.monitor.bt121= new DetaButton ("肽腐蚀关闭",100,50, Color.pink);
			u.monitor.bt121.addActionListener( 
					new ActionListener() { 
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt121Stop== false) {
								u.monitor.isbt121Stop= true;
								u.monitor.bt121.setLabel("肽腐蚀开启");
							}else {
								u.monitor.isbt121Stop= false;
								u.monitor.bt121.setLabel("肽腐蚀关闭");
							}
						}
					});
			u.monitor.bt122= new DetaButton ("肽催化关闭",100,50, Color.pink);
			u.monitor.bt122.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt122Stop== false) {
								u.monitor.isbt122Stop= true;
								u.monitor.bt122.setLabel("肽催化开启");
							}else {
								u.monitor.isbt122Stop= false;
								u.monitor.bt122.setLabel("肽催化关闭");
							}
						}
					});
			u.monitor.bt123= new DetaButton ("肽丝化关闭",100,50, Color.pink);
			u.monitor.bt123.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.monitor.isbt123Stop== false) {
								u.monitor.isbt123Stop= true;
								u.monitor.bt123.setLabel("肽丝化开启");
							}else {
								u.monitor.isbt123Stop= false;
								u.monitor.bt123.setLabel("肽丝化关闭");
							}
						}
					});
			u.monitor.bt124= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt124.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			
			u.monitor.bt131= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt131.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt132= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt132.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt133= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt133.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt134= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt134.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			
			u.monitor.bt141= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt141.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt142= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt142.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt143= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt143.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt144= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt144.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.monitor.bt151= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt151.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt152= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt152.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt153= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt153.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			u.monitor.bt154= new DetaButton ("待添加功能",100,50, Color.pink);
			u.monitor.bt154.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.monitor.bt92= new DetaButton ("播放多媒体",100,50, Color.orange);
			u.monitor.bt92.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							FileDialog filedialog= new FileDialog(new Frame(), "播放多媒体", FileDialog.LOAD);
						//	filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
						//	File inputBin= new File(filepath);
							//
							try {
								Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+filepath);
							} catch (IOException e1) {	
								jTabbedpane.validate();
							}
						}
					});
			
			
			u.monitor.bt2 = new DetaButton ("线性腐蚀",100,50, Color.pink);
			u.monitor.bt2.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt3= new DetaButton ("独立成份",100,50, Color.pink);
			u.monitor.bt3.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt4= new DetaButton ("特征成份",100,50, Color.pink);
			u.monitor.bt4.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.bt5 = new DetaButton ("向量成份",100,50, Color.pink);
			u.monitor.bt5.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.monitor.btr = new DetaButton ("荧光谱红",100,50, Color.red);
			u.monitor.btr.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.btg = new DetaButton ("荧光谱绿",100,50, Color.green);
			u.monitor.btg.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.btb = new DetaButton ("荧光谱蓝",100,50, Color.blue);
			u.monitor.btb.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.monitor.sliderr = new JSlider(0,255);
			u.monitor.sliderr.setSnapToTicks(true);
			u.monitor.sliderr.setPaintTicks(true);
			u.monitor.sliderr.setMajorTickSpacing(5);
			u.monitor.sliderr.setMinorTickSpacing(0);
			u.monitor.sliderr.setBackground(Color.black);
			u.monitor.sliderr.setForeground(Color.red);
			u.monitor.sliderr.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.monitor.facr = source.getValue();  
							System.out.println(u.monitor.facr);
						}
					});

			u.monitor.sliderg = new JSlider(0,255);
			u.monitor.sliderg.setSnapToTicks(true);
			u.monitor.sliderg.setPaintTicks(true);
			u.monitor.sliderg.setMajorTickSpacing(5);
			u.monitor.sliderg.setMinorTickSpacing(0);
			u.monitor.sliderg.setBackground(Color.black);
			u.monitor.sliderg.setForeground(Color.green);
			u.monitor.sliderg.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.monitor.facg = source.getValue();  
							System.out.println(u.monitor.facg);
						}
					});

			u.monitor.sliderb = new JSlider(0,255);
			u.monitor.sliderb.setSnapToTicks(true);
			u.monitor.sliderb.setPaintTicks(true);
			u.monitor.sliderb.setMajorTickSpacing(5);
			u.monitor.sliderb.setMinorTickSpacing(0);
			u.monitor.sliderb.setBackground(Color.black);
			u.monitor.sliderb.setForeground(Color.blue);
			u.monitor.sliderb.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.monitor.facb = source.getValue();  
							System.out.println(u.monitor.facb);
						}
					});  
			u.monitor.br.add(u.monitor.btr);
			u.monitor.br.add(u.monitor.sliderr);
			u.monitor.sliderBox.add(u.monitor.br);

			u.monitor.bg.add(u.monitor.btg);
			u.monitor.bg.add(u.monitor.sliderg);
			u.monitor.sliderBox.add(u.monitor.bg);

			u.monitor.bb.add(u.monitor.btb);
			u.monitor.bb.add(u.monitor.sliderb);
			u.monitor.sliderBox.add(u.monitor.bb);

			u.monitor.b1.add(u.monitor.bt1);
			u.monitor.b1.add(u.monitor.sliderx);
			u.monitor.sliderBox.add(u.monitor.b1);

			u.monitor.b2.add(u.monitor.bt2);
			u.monitor.b2.add(u.monitor.slidery);
			u.monitor.sliderBox.add(u.monitor.b2);

			u.monitor.b3.add(u.monitor.bt3);
			u.monitor.b3.add(u.monitor.sliderz);
			u.monitor.sliderBox.add(u.monitor.b3);

			u.monitor.b4.add(u.monitor.bt4);
			u.monitor.b4.add(u.monitor.slidert);
			u.monitor.sliderBox.add(u.monitor.b4);

			u.monitor.b5.add(u.monitor.bt5);
			u.monitor.b5.add(u.monitor.sliderl);
			u.monitor.sliderBox.add(u.monitor.b5);

			u.monitor.buttonBox0.add(u.monitor.bt00);
			u.monitor.buttonBox0.add(u.monitor.bt01);
			u.monitor.buttonBox0.add(u.monitor.bt02);
			u.monitor.buttonBox0.add(u.monitor.bt03);
			u.monitor.sliderBox.add(u.monitor.buttonBox0);

			u.monitor.buttonBox1.add(u.monitor.bt10);
			u.monitor.buttonBox1.add(u.monitor.bt11);
			u.monitor.buttonBox1.add(u.monitor.bt12);
			u.monitor.buttonBox1.add(u.monitor.bt13);
			u.monitor.sliderBox.add(u.monitor.buttonBox1);

			u.monitor.buttonBox2.add(u.monitor.bt20);
			u.monitor.buttonBox2.add(u.monitor.bt21);
			u.monitor.buttonBox2.add(u.monitor.bt22);
			u.monitor.buttonBox2.add(u.monitor.bt23);
			u.monitor.sliderBox.add(u.monitor.buttonBox2);

			u.monitor.buttonBox3.add(u.monitor.bt30);
			u.monitor.buttonBox3.add(u.monitor.bt31);
			u.monitor.buttonBox3.add(u.monitor.bt32);
			u.monitor.buttonBox3.add(u.monitor.bt33);
			u.monitor.sliderBox.add(u.monitor.buttonBox3);

			u.monitor.buttonBox4.add(u.monitor.bt40);
			u.monitor.buttonBox4.add(u.monitor.bt41);
			u.monitor.buttonBox4.add(u.monitor.bt42);
			u.monitor.buttonBox4.add(u.monitor.bt43);
			u.monitor.sliderBox.add(u.monitor.buttonBox4);

			u.monitor.buttonBox5.add(u.monitor.bt50);
			u.monitor.buttonBox5.add(u.monitor.bt51);
			u.monitor.buttonBox5.add(u.monitor.bt52);
			u.monitor.buttonBox5.add(u.monitor.bt53);
			u.monitor.sliderBox.add(u.monitor.buttonBox5);

			u.monitor.buttonBox6.add(u.monitor.bt60);
			u.monitor.buttonBox6.add(u.monitor.bt61);
			u.monitor.buttonBox6.add(u.monitor.bt62);
			u.monitor.buttonBox6.add(u.monitor.bt63);
			u.monitor.sliderBox.add(u.monitor.buttonBox6);

			u.monitor.buttonBox7.add(u.monitor.bt70);
			u.monitor.buttonBox7.add(u.monitor.bt71);
			u.monitor.buttonBox7.add(u.monitor.bt72);
			u.monitor.buttonBox7.add(u.monitor.bt73);
			u.monitor.sliderBox.add(u.monitor.buttonBox7);
			
			u.monitor.buttonBox8.add(u.monitor.bt80);
			u.monitor.buttonBox8.add(u.monitor.bt81);
			u.monitor.buttonBox8.add(u.monitor.bt82);
			u.monitor.buttonBox8.add(u.monitor.bt83);
			u.monitor.sliderBox.add(u.monitor.buttonBox8);
			
			u.monitor.buttonBox9.add(u.monitor.bt84);
			u.monitor.buttonBox9.add(u.monitor.bt85);
			u.monitor.buttonBox9.add(u.monitor.bt86);
			u.monitor.buttonBox9.add(u.monitor.bt87);
			u.monitor.sliderBox.add(u.monitor.buttonBox9);

			u.monitor.buttonBox10.add(u.monitor.bt88);
			u.monitor.buttonBox10.add(u.monitor.bt89);
			u.monitor.buttonBox10.add(u.monitor.bt90);
			u.monitor.buttonBox10.add(u.monitor.bt92);
			
			u.monitor.buttonBox11.add(u.monitor.bt111);
			u.monitor.buttonBox11.add(u.monitor.bt112);
			u.monitor.buttonBox11.add(u.monitor.bt113);
			u.monitor.buttonBox11.add(u.monitor.bt114);
			
			u.monitor.buttonBox12.add(u.monitor.bt121);
			u.monitor.buttonBox12.add(u.monitor.bt122);
			u.monitor.buttonBox12.add(u.monitor.bt123);
			u.monitor.buttonBox12.add(u.monitor.bt124);
			
			u.monitor.buttonBox13.add(u.monitor.bt131);
			u.monitor.buttonBox13.add(u.monitor.bt132);
			u.monitor.buttonBox13.add(u.monitor.bt133);
			u.monitor.buttonBox13.add(u.monitor.bt134);
			
			u.monitor.buttonBox14.add(u.monitor.bt141);
			u.monitor.buttonBox14.add(u.monitor.bt142);
			u.monitor.buttonBox14.add(u.monitor.bt143);
			u.monitor.buttonBox14.add(u.monitor.bt144);
			
			u.monitor.buttonBox15.add(u.monitor.bt151);
			u.monitor.buttonBox15.add(u.monitor.bt152);
			u.monitor.buttonBox15.add(u.monitor.bt153);
			u.monitor.buttonBox15.add(u.monitor.bt154);
			
			u.monitor.sliderBox.add(u.monitor.buttonBox10);
			u.monitor.sliderBox.add(u.monitor.buttonBox11);
			u.monitor.sliderBox.add(u.monitor.buttonBox12);
			u.monitor.sliderBox.add(u.monitor.buttonBox13);
		//	u.monitor.sliderBox.add(u.monitor.buttonBox14);

			u.monitor.sliderBox.setBounds(910, 15, 400, 750);
			jpanelThird.add(u.monitor);
			jpanelThird.add(u.monitor.sliderBox);
			jpanelThird.setName(tabNames.get(2));
			jTabbedpane.addTab(tabNames.get(2), new ImageIcon(), jpanelThird, "相诊");// 加入第一个页面  
			Color[] colors= new Color[3];
			colors[0]=new Color(253,233,254);
			colors[1]=new Color(233,254,234);
			colors[2]=new Color(255,251,232);
			jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount()- 1, colors[jTabbedpane.getTabCount()%3]);
			jTabbedpane.validate();	
			while(0 == u.monitor.stop) {
				Thread.sleep(50);
				Graphics g =u.monitor.getGraphics();
				if(g!=null) {
					u.monitor.paint(g);
				}	 
			} 
		}catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
}