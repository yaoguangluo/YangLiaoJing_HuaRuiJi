package biProcessor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.media.opengl.*;

import MVQ.button.DetaButton;
import MVQ.slider.DetaSlider;
import OSI.OSU.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OSI.OSU.ASQ.PSU.OCI.ME.analysis.Analyzer;
import OSI.OSU.VSQ.dna.search.ZhongYaoSearch;
import jogl.obj.yaoguangLuo.JOGLOBJShape;

import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.GLBuffers;
import com.jogamp.opengl.util.gl2.GLUT;

import ME.APM.VSQ.App;

import javax.media.opengl.awt.GLCanvas;  
import javax.media.opengl.glu.GLU;
public class CoAuthorForWord extends JPanel implements MouseMotionListener, MouseListener, MouseWheelListener, KeyListener, GLEventListener { 
	public Boolean clicked = false;
	public int mousex = 0;
	public int mousey = 0;
	public boolean hook= false;
	int zynk= 0;
	int zybc= 0;
	public int needChange = 0;
	public String prevSearchString = "";
	public ByteBuffer checkImageBuf = GLBuffers.newDirectByteBuffer(20 * 100 * 3);
	public Map<String, String> pos;
	public Map<String, Object> rootLeaf;
	public Map<String, Integer> findLeaf;
	public Map<String, Integer> frequencyLeaf;
	public Map<String, Integer> didLeaf;
	public App u;
	public Map<String, Object> dic_li ;
	public Map<String, Object> dic_yl;
	public Analyzer analyzer;
	public int c = 0;
	public JFrame jframe;
	private static final long serialVersionUID = 1L;
	public FPSAnimator animator = null;  
	ChangeListener listener; 
	Box sliderBoxx1 = new Box(BoxLayout.X_AXIS);  
	Box sliderBoxx2 = new Box(BoxLayout.X_AXIS);  
	Box sliderBox = new Box(BoxLayout.Y_AXIS);  
	Box buttonBox = new Box(BoxLayout.X_AXIS);  
	JSlider  sliderx;
	JSlider  slidery;
	JSlider  sliderz;
	JSlider  slidert;
	JButton top;
	JButton down;
	JButton left;
	JButton right;
	JButton bhl;
	JButton cfc;
	JButton whh;
	JButton rst;
	JButton save;
	JButton load;
	
	GL2 gl;  
	GLU glu;  
	GLUT glut;  
	float whiteLight[] = {0.2f, 0.2f, 0.2f, 1.0f};  
	float sourceLight[] = {0.8f, 0.8f, 0.8f, 1.0f};  
	float lightPos[] = {0.0f, 0.0f, 0.0f, 1.0f};  
	float moveshape = 0.0f;  
	float fEarthRot = 0.0f; 	
	float xrot = 18.0f;  
	float yrot = 2.0f;  
	float zrot = 1.0f;  
	float trot = 6.0f;  
	float prot = 1.0f;  
	float lrot = -3.5f; 
	float brot = 1.0f; 
	float irot = 78.0f; 
	float srot = 0.7f;
	
	float xrotr = 0.0f;  
	float yrotr = 0.0f;  
	float zrotr = 0.0f;  
	float trotr = 0.0f;  
	float protr = 0.0f;  
	float lrotr = 0.0f; 
	float brotr = 0.0f; 
	float irotr = 0.0f; 
	float srotr = 0.0f;
	public GLCanvas canvas; 
	ByteBuffer buffer;
	int[][] g;
	JOGLOBJShape shape=null;
	public double t = 1.0d;
	public String rootWord;  
	public CoAuthorForWord(App u, Analyzer analyzer
			, Map<String, String> pos) throws HeadlessException, InterruptedException  {  
		Thread.sleep(100);
		rootWord="";
		rootLeaf = new ConcurrentHashMap<>();
		findLeaf = new ConcurrentHashMap<>();
		frequencyLeaf = new ConcurrentHashMap<>();
		didLeaf= new ConcurrentHashMap<>();
		this.analyzer = analyzer;
		this.pos = pos;
		this.u = u;
		this.setLayout(null);
		Thread.sleep(100);
		GLProfile glp = GLProfile.getDefault();
		GLCapabilities glcaps = new GLCapabilities(glp);      
		canvas = new GLCanvas(glcaps);  
		canvas.addGLEventListener(this);  
		canvas.addMouseListener(this);  
		Thread.sleep(100);
		canvas.addMouseMotionListener(this);
		canvas.addKeyListener(this);
		canvas.addMouseWheelListener(this);
		canvas.setBounds(0, 0, 618, 350-50);
		Thread.sleep(100);
		this.add(canvas);
		animator = new FPSAnimator(canvas,24,true);
		centerWindow(this);
		animator.start();
		Thread.sleep(100);
		sliderx = new DetaSlider(0, 360);
		sliderx.setSnapToTicks(true);
		sliderx.setPaintTicks(true);
		sliderx.setMajorTickSpacing(20);
		sliderx.setMinorTickSpacing(5);
		sliderx.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent event){
						JSlider source = (JSlider) event.getSource();
						xrot = source.getValue();
					}
				});
		Thread.sleep(100);
		slidery = new DetaSlider(0 , 360);
		slidery.setSnapToTicks(true);
		slidery.setPaintTicks(true);
		slidery.setMajorTickSpacing(20);
		slidery.setMinorTickSpacing(5);
		slidery.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent event)  {    
						JSlider source = (JSlider) event.getSource();  
						yrot= source.getValue();  
					}
				});  
		Thread.sleep(100);
		sliderz = new DetaSlider(0 , 360); 
		sliderz.setSnapToTicks(true);  
		sliderz.setPaintTicks(true);  
		sliderz.setMajorTickSpacing(20);  
		sliderz.setMinorTickSpacing(5);  
		sliderz.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent event){
						JSlider source = (JSlider) event.getSource();
						zrot= source.getValue();  
					}

				});  
		Thread.sleep(100);
		slidert = new DetaSlider(1, 150);
		slidert.setSnapToTicks(true);
		slidert.setPaintTicks(true);
		slidert.setMajorTickSpacing(20);
		slidert.setMinorTickSpacing(1);
		slidert.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent event)  {    
						JSlider source = (JSlider)event.getSource();  
						irot= source.getValue();  
					}
				});      
		top = new DetaButton("��", 100, 50, Color.red);
		top.addActionListener( 
				new ActionListener()  {    
					public void actionPerformed(ActionEvent e){
						brot+=0.5;
					}
				});
		down = new DetaButton("��", 100, 50, Color.orange);
		down.addActionListener( 
				new ActionListener()  {    
					public void actionPerformed(ActionEvent e){
						brot-=0.5;
					}
				});
		left = new DetaButton("��", 100, 50, Color.pink);
		left.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						lrot-=0.5;
					}
				});
		right = new DetaButton("��", 100, 50, Color.green);
		right.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						lrot+=0.5;
					}
				});
		bhl= new DetaButton("��Чɭ��", 100, 50, Color.red);
		bhl.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						String searchYaos= u.coAuthorForWord.bootFlowerForest(rootWord, true);
						new ZhongYaoSearch().zhongYaoSearch(u, searchYaos, "", searchYaos);
					}
				});  
		cfc= new DetaButton("����ֲ��", 100, 50, Color.orange);
		cfc.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						bootClassificationMap(rootWord, true);
						new ZhongYaoSearch().zhongYaoSearch(u, u.key, "", u.key);
					}
				});  
		whh= new DetaButton("����ɭ��", 200, 50, Color.magenta);
		whh.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						String searchYaos= u.coAuthorForWord.bootFlowerSea(rootWord, true);
						new ZhongYaoSearch().zhongYaoSearch(u, searchYaos, "", searchYaos);
					}
				}); 
		rst= new DetaButton("����", 200, 50, Color.pink);
		rst.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						hook= !hook;
						if(null== jframe) {
							u.coAuthorForWord.canvas.setSize(900, 750);
							jframe= new JFrame("ҩ��۲�");
							jframe.setLayout(null);
							jframe.setSize(900, 750);
							jframe.setVisible(false);
							jframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
						}
						//�ó���
						if(hook) {
							animator.stop();
							u.coAuthorForWord.canvas.setSize(900, 750);
							jframe.add(u.coAuthorForWord.canvas);
							jframe.setVisible(true);
							u.coAuthorForWord.canvas.validate();
							u.coAuthorForWord.validate();
							jframe.validate();
							animator.start();
						}else {
							animator.stop();
							u.coAuthorForWord.canvas.setSize(650, 310);
							u.coAuthorForWord.add(u.coAuthorForWord.canvas);
							jframe.setVisible(false);
							u.coAuthorForWord.canvas.validate();
							u.coAuthorForWord.validate();
							u.coAuthorForWord.xrot= 18.0f;  
							u.coAuthorForWord.yrot= 2.0f;  
							u.coAuthorForWord.zrot= 1.0f;  
							u.coAuthorForWord.trot= 6.0f;  
							u.coAuthorForWord.prot= 1.0f;  
							u.coAuthorForWord.lrot= -3.5f; 
							u.coAuthorForWord.brot= 1.0f; 
							u.coAuthorForWord.irot= 78.0f; 
							u.coAuthorForWord.srot= 0.7f;
							animator.start();
						}
					}
				}); 
		
		save = new DetaButton("����", 200, 50, Color.green);
	//	rst.setBounds(0, 0, 100, 20);
		save.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						xrotr= xrot;  
						yrotr= yrot;  
						zrotr= zrot;  
						trotr= trot;  
						protr= prot;  
						lrotr= lrot; 
						brotr= brot; 
						irotr= irot; 
						srotr= srot;
					}
				}); 
		
		load = new DetaButton("��ȡ", 200, 50, Color.magenta);
	//	rst.setBounds(0, 0, 100, 20);
		load.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						xrot= xrotr;  
						yrot= yrotr;  
						zrot= zrotr;  
						trot= trotr;  
						prot= protr;  
						lrot= lrotr; 
						brot= brotr; 
						irot= irotr; 
						srot= srotr;
					}
				}); 
		buttonBox.add(top);
		buttonBox.add(down);
		buttonBox.add(left);
		Thread.sleep(100);
		buttonBox.add(right);  
		buttonBox.add(whh);
		buttonBox.add(bhl);
		buttonBox.add(cfc);
		buttonBox.add(rst);
		buttonBox.add(save);
		buttonBox.add(load);
		Box buttonBoxX = new Box(BoxLayout.X_AXIS);  
		JButton xzb = new DetaButton("X����", 200, 50, Color.pink);
		buttonBoxX.add(xzb);
		buttonBoxX.add(sliderx);
		sliderBoxx1.add(buttonBoxX);
		
		Box buttonBoxY = new Box(BoxLayout.X_AXIS);  
		JButton yzb = new DetaButton("Y����", 200, 50, Color.pink);
		buttonBoxY.add(yzb);
		buttonBoxY.add(slidery);
		sliderBoxx1.add(buttonBoxY);
		
		Box buttonBoxZ = new Box(BoxLayout.X_AXIS);  
		JButton zzb = new DetaButton("Z����", 200, 50, Color.pink);
		buttonBoxZ.add(zzb);
		buttonBoxZ.add(sliderz);
		sliderBoxx2.add(buttonBoxZ);
		
		Box buttonBoxT = new Box(BoxLayout.X_AXIS);  
		JButton tzb = new DetaButton("T����", 200, 50, Color.pink);
		buttonBoxT.add(tzb);
		buttonBoxT.add(slidert);
		sliderBoxx2.add(buttonBoxT);
		
		
		sliderBox.add(sliderBoxx1);
		sliderBox.add(sliderBoxx2);
		sliderBox.add(buttonBox);
		sliderBox.setBounds(0, 350-50, 627, 300);
		add(sliderBox);
	}     
	private void centerWindow(Component frame){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
		Dimension frameSize = frame.getSize();  
		if (frameSize.width > screenSize.width)  
			frameSize.width = screenSize.width;  
		if (frameSize.height > screenSize.height)  
			frameSize.height = screenSize.height;  
		frame.setLocation((screenSize.width - frameSize.width) >> 1,  
				(screenSize.height - frameSize.height) >> 1);  
		}  

	@SuppressWarnings("static-access")
	public void init(GLAutoDrawable drawable) {  
		gl =  drawable.getGL().getGL2();
		glu = new GLU();
		glut= new GLUT();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glTexParameteri(gl.GL_TEXTURE_2D,gl.GL_TEXTURE_MIN_FILTER,gl.GL_LINEAR);
		gl.glTexParameteri(gl.GL_TEXTURE_2D,gl.GL_TEXTURE_MAG_FILTER,gl.GL_NEAREST);      
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		gl.glEnable(GL.GL_DEPTH_TEST);
		gl.glDepthFunc(GL.GL_LEQUAL);
		gl.glShadeModel(GL2.GL_SMOOTH);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gl.glClearColor(0f, 0f, 0f, 0f);
		gl.glHint(gl.GL_PERSPECTIVE_CORRECTION_HINT, gl.GL_NICEST); 
	}  
	public void display(GLAutoDrawable drawable) { 
//		System.out.println(xrot);
//		System.out.println(yrot);
//		System.out.println(zrot);
//		System.out.println(trot);
//		System.out.println(prot);
//		System.out.println(lrot);
//		System.out.println(brot);	
//		System.out.println(irot);
//		System.out.println(srot);	
//		System.out.println("");
		GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();
		gl.glTranslatef(lrot, brot, -6.0f);
		gl.glRotatef(xrot, 1, 0.0f, 0.0f);
		gl.glRotatef(yrot, 0.0f, 1, 0.0f);
		gl.glRotatef(zrot, 0.0f, 0.0f, 1);
		gl.glPointSize(prot);
		gl.glOrtho(0, trot, 0, trot, 1, -1);  
		int section[]= new int[21];
		section [0]= 32;
		section [1]= 32;
		section [2]= 32;
		section [3]= 32;
		section [4]= 10;
		section [5]= 10;
		section [6]= 10;
		section [7]= 10;
		section [8]= 10;
		section [9]= 10;
		section [10]= 10;
		section [11]= 10;
		float a= 10;
		double root[]= new double[3];
		didLeaf.clear();
		try {
			drawWords(section, 0, root, a, 0, 0, this.rootLeaf, didLeaf);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		gl.glEnd();
		gl.glFlush();
	}  	
	@SuppressWarnings({"unchecked", "static-access"})
	private void drawWords(int []s, int se, double[] root, float a, int j, int k
			, Map<String, Object> root3, Map<String, Integer> didLeaf) throws IOException, InterruptedException {
		Thread.sleep(3);
		if(root3 == null || root3.size() == 0) {
			return;
		}
		int i = 0;
		s[se] = root3.size();
		Iterator<String> iteratorLeaf = root3.keySet().iterator();
		Here:
			while(iteratorLeaf.hasNext()) {
				if(k>= irot) {
					return;
				}
				
				double a1= 1;
				String leafName= iteratorLeaf.next();
				if(leafName.length()== 0) {
					continue Here;
				}
				int type= 0;
				Map<String, Object> leaf = (Map<String, Object>) root3.get(leafName);	
				if(leaf.size() > 0) {
					a1 =  1 ;
				}
				k++;
				if(k> 25) {
					return;
				}
				//					findDup= true;
				if(se< 2) {
					if(leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("ȱ��")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("���")
							||leafName.equalsIgnoreCase("���")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("ҩ��")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("ʱ��")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("Ԥ��")
							||leafName.equalsIgnoreCase("ע��")
							||leafName.equalsIgnoreCase("Ӧ��")
							||leafName.equalsIgnoreCase("����")
							||leafName.equalsIgnoreCase("������")
							||leafName.equalsIgnoreCase("��Ӧ")) {
						continue Here;
					}
				}
				int freq= -1;
				if(frequencyLeaf.containsKey(leafName)) {
					freq= frequencyLeaf.get(leafName);
				}
				if((se< 2)
						||(se== 3)
						||(se== 2&& zybc== 1&& (freq== -1))
						||(se== 2&&(freq>= u.lookrot))) {
					gl.glBegin(gl.GL_LINES);
					if(j%7==0) {
						gl.glColor3f(0,0,255);
					}
					if(j%7==1) {
						gl.glColor3f(0,255,0);
					}
					if(j%7==2) {
						gl.glColor3f(255,0,0);
					}
					if(j%7==3) {
						gl.glColor3f(255,0,255);
					}
					if(j%7==4) {
						gl.glColor3f(255,255,0);
					}
					if(j%7==5) {
						gl.glColor3f(255,255,255);
					}
					if(j%7==6) {
						gl.glColor3f(0,255,255);
					}
					gl.glVertex3d(root[0], root[1], root[2]);
					gl.glVertex3d(root[0] + Math.cos(2*Math.PI*i/s[se]) * a
							, root[1] + Math.sin(2 * Math.PI * i/s[se]) * a
							, root[2] + (srot*a1));
					gl.glEnd();
					gl.glColor3f(0,0,255);
					gl.glRasterPos3d(root[0] + Math.cos(2*Math.PI*i/s[se]) * a
							, root[1] + Math.sin(2 * Math.PI * i/s[se]) * a
							, root[2] + (srot*a1));
					String prePrint = leafName;
					Font font = new Font(prePrint,20, 20);
					checkImageBuf = GLBuffers.newDirectByteBuffer(20 * prePrint.length()*22 * 3);
					BufferedImage image = new BufferedImage(prePrint.length()*32, 20, BufferedImage.TYPE_INT_RGB);
					Graphics2D ga = image.createGraphics();
					ga.setColor(Color.white);
					//int type= 0;
					if(pos.containsKey(leafName)){
						if(pos.get(leafName).contains("��")) {
							ga.setColor(new Color(255,125,255));
							type= 1;
						}
						if(pos.get(leafName).contains("��")) {
							ga.setColor(new Color(125,255,125));
						}
						if(pos.get(leafName).contains("��")) {
							ga.setColor(new Color(255, 255, 125));
						}
						if(pos.get(leafName).contains("ν")) {
							ga.setColor(new Color(125, 125, 255));
						}
					}
					int AMV_MVS_VSQX = 1;
					int AMV_MVS_VSQY = 17;
					this.weightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
					this.heightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);		
					checkImageBuf.clear();
					int h = image.getHeight();
					for (int i1 = h-1; i1 >= 0; i1--){
						for (int j1 = 0; j1 < prePrint.length()*20; j1++){
							checkImageBuf.put((byte)(image.getRGB(j1, i1) & (byte)0xFF));	
							checkImageBuf.put((byte)(image.getRGB(j1, i1)>>8 & (byte)0xFF));	
							checkImageBuf.put((byte)(image.getRGB(j1, i1)>>16 & (byte)0xFF));	
						}
					}
					checkImageBuf.rewind();
					gl.glDrawPixels(prePrint.length()*20, 20, GL2.GL_RGB, GL.GL_UNSIGNED_BYTE, checkImageBuf);
					double root1[] = new double[3];
					root1[0] = root[0] + Math.cos(2 * Math.PI * i / s[se]) * a;
					root1[1] = root[1] + Math.sin(2 * Math.PI * i / s[se]) * a;
					root1[2] = root[2] + (srot* a1);
					//j = i; 
					if(!didLeaf.containsKey(leafName)&& findLeaf.containsKey(leafName)) {
						didLeaf.put(leafName, 1);
						if(type== 1) {
							if(zynk== 0) {
								drawWords(s, se+1, root1, a * 0.5f , j+i, k, leaf, didLeaf);
							}else {
								drawWords(s, se+1, root1, a * 0.36f , j+i, k, leaf, didLeaf);
							}
						}else {
							drawWords(s, se+1, root1, a * 0.5f , j+i, k, leaf, didLeaf);
						}
					}
				}
				i++;
			}
	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {  
		float fAspect; 
		if (height == 0) {  
			height = 1;  
		}
		gl.glViewport(0, 0, width, height);  
		fAspect = (float) width / height;      
		gl.glMatrixMode(GL2.GL_PROJECTION);  
		gl.glLoadIdentity();       
		glu.gluPerspective(53.0f, fAspect, 1.0, 400.0);  
		gl.glMatrixMode(GL2.GL_MODELVIEW);  
		gl.glLoadIdentity();  
	} 

	public void dispose(GLAutoDrawable arg0) {       
	}  

	public static void main(String[] args) throws HeadlessException, InterruptedException  {  
		CoAuthorForWord app= new CoAuthorForWord(null, null, null);   
		app.setSize(850, 700);
		app.setVisible(true);
		JFrame f = new JFrame();
		f.add(app);
		f.setTitle("ButtonDemo");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(650,700);
		f.setVisible(true);
	}
	//hai
	public String bootFlowerSea(String string, boolean isButton) {
		zynk= 0;
		zybc= 1;
		if(rootWord == null) {
			return "";
		}
		if(rootWord.equalsIgnoreCase(string) && isButton == false) {
			return "";
		} 
		rootWord= string;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(rootWord, 1);
		frequencyLeaf.put(rootWord, 1);
		Map<String, Object> leaf= new ConcurrentHashMap<>();
		int depth= 0;
		Map<String, Object> subLeaf= kernerSea(rootWord, leaf, findLeaf, depth);
		leaf.put(rootWord, subLeaf);
		rootLeaf= leaf;
		String output= subLeaf.keySet().toString();
		return output;
	}
	
	public void bootClassificationMap(String string, boolean isButton) {
		zynk= 0;
		zybc= 1;
		if(rootWord== null) {
			return;
		}
		if(rootWord.equalsIgnoreCase(string) && isButton == false) {
			return;
		} 
		rootWord= string;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(rootWord, 1);
		frequencyLeaf.put(rootWord, 1);
		Map<String, Object> leaf= new ConcurrentHashMap<>();
		int depth= 0;
		Map<String, Object> subLeaf= kernerClassification(rootWord, leaf, findLeaf, depth);
		leaf.put(rootWord, subLeaf);
		rootLeaf= leaf;
	}
	
	public String bootFlowerForest(String string, boolean isButton) {
		zynk= 0;
		zybc= 1;
		if(rootWord== null) {
			return "";
		}
		if(rootWord.equalsIgnoreCase(string) && isButton == false) {
			return "";
		} 
		rootWord= string;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(rootWord, 1);
		frequencyLeaf.put(rootWord, 1);
		Map<String, Object> leaf = new ConcurrentHashMap<String, Object>();
		int depth = 0;
		Map<String, Object> subLeaf = kernerForest(rootWord, leaf, findLeaf, depth);
		leaf.put(rootWord, subLeaf);
		rootLeaf = leaf;
		String output= subLeaf.keySet().toString();
		return output;
	}
	
	public void bootDetaDnnFlowerForest(App app, String mingCheng, String[] dnn, boolean isButton) {
		// TODO Auto-generated method stub
		zynk= 1;
		zybc= 1;
		if(rootWord== null) {
			return;
		}
		if(dnn.length< 2&& isButton== false) {
			return;
		} 
		rootWord= mingCheng;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(mingCheng, 1);
		frequencyLeaf.put(mingCheng, 1);
		Map<String, Object> leaf = new ConcurrentHashMap<String, Object>();
		int depth = 0;
		Map<String, Object> subLeaf = kernerDnnForest(app, dnn, leaf, findLeaf, depth);
		leaf.put(mingCheng, subLeaf);
		rootLeaf = leaf;
	}
	
	public void bootDetaBingMingDnnFlowerForest(App app, String mingCheng, String[] dnn, boolean isButton) {
		// TODO Auto-generated method stub
		zynk= 1;
		zybc= 0;
		u.lookrot= 2;
		if(rootWord== null) {
			return;
		}
		if(dnn.length< 2&& isButton== false) {
			return;
		} 
		rootWord= mingCheng;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(mingCheng, 1);
		frequencyLeaf.put(mingCheng, 1);
		Map<String, Object> leaf= new ConcurrentHashMap<String, Object>();
		int depth= 0;
		Map<String, Object> subLeaf= kernerDnnBingMingForest(app, dnn, leaf, findLeaf, depth);
		leaf.put(mingCheng, subLeaf);
		rootLeaf= leaf;
	}

	public String bootZynkFlowerForest(String fangji, String zucheng, boolean isButton) {
		zynk= 1;
		zybc= 1;
		if(rootWord==null) {
			return "";
		}
		if(rootWord.equalsIgnoreCase(fangji) && isButton == false) {
			return "";
		} 
		rootWord= fangji;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(fangji, 1);
		frequencyLeaf.put(fangji, 1);
		Map<String, Object> leaf = new ConcurrentHashMap<String, Object>();
		int depth = 0;
		Map<String, Object> subLeaf = kernerZynkForest(zucheng, leaf, findLeaf, depth);
		leaf.put(fangji, subLeaf);
		String output= subLeaf.keySet().toString();
		rootLeaf = leaf;
		return output;
	}
	
	public void bootZynkJFlowerForest(String fangji, String zucheng, boolean isButton) {
		// TODO Auto-generated method stub
		zynk= 1;
		zybc= 1;
		if(rootWord==null) {
			return;
		}
		if(rootWord.equalsIgnoreCase(fangji) && isButton == false) {
			return;
		} 
		rootWord = fangji;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(fangji, 1);
		frequencyLeaf.put(fangji, 1);
		Map<String, Object> leaf = new ConcurrentHashMap<String, Object>();
		int depth = 0;
		Map<String, Object> subLeaf = kernerZynkJForest(zucheng, leaf, findLeaf, depth);
		leaf.put(fangji, subLeaf);
		rootLeaf = leaf;
	}
	
	//dnn bingming
	private Map<String, Object> kernerDnnBingMingForest(App app, String[] dnn, Map<String, Object> root, Map<String, Integer> findLeaf, int depth) { 
		Map<String, Object> leaf= new ConcurrentHashMap<String, Object>();
		if(++depth> 6) {
			return leaf;
		}
		int max= dnn.length> 18? 18: dnn.length;
		for(int i= 1; i< max; i++){
			String tempRec= dnn[i].split(":")[0];
			if(tempRec.length()> 1) {
				if(this.pos.containsKey(tempRec)) {
					int find= 0;
					if(pos.get(tempRec).contains("��")) {
						find++;
					}
					if(pos.get(tempRec).contains("��")) {
						find++;
					}
					if(pos.get(tempRec).contains("��")) {
						find++;
					}
					if(pos.get(tempRec).contains("ν")) {
						find++;
					}
					if(find> 0) {
						if(!findLeaf.containsKey(tempRec)) {
							findLeaf.put(tempRec, 1);
							frequencyLeaf.put(tempRec, -1);
							Iterator<String> iterator= u.xyscPage.dic_shi_ying.keySet().iterator();
							Map<String, Object> gongxiao= new ConcurrentHashMap<String, Object>();
							Here:
								while(iterator.hasNext()) {
									String yaoming= iterator.next();
									Map<String, Object> gongxiaoyaoming= new ConcurrentHashMap<String, Object>();
									String li= u.xyscPage.dic_shi_ying.get(yaoming).toString();
									li+= u.xyscPage.dic_yao_li.get(yaoming).toString();
									if(li.contains(tempRec)) {
										String hai= u.xyscPage.dic_bu_liang_fan_ying.get(yaoming).toString();
										hai+= u.xyscPage.dic_zhu_yi.get(yaoming).toString();
										String xw= li;
										if(!frequencyLeaf.containsKey(yaoming) ) {
											frequencyLeaf.put(yaoming, 1);
											if(app.risk_filter_box.isSelected()) {
												String temp= app.name_filter.getText();
												for(int j=0;j<temp.length();j++) {
													if(hai.contains(""+ temp.charAt(j))) {
														continue Here;
													}
												}
											}
											//li
											if(app.feel_filter_box.isSelected()) {
												String temp= app.name_filter.getText();
												for(int j= 0; j< temp.length(); j++) {
													if(li.contains(""+ temp.charAt(j))) {
														continue Here;
													}	
												}
											}
											//xw
											if(!app.nameFeelFilter.getText().isEmpty()) {
												String temp= app.nameFeelFilter.getText();
												for(int j=0;j<temp.length();j++) {
													if(xw.contains(""+ temp.charAt(j))) {
														continue Here;
													}	
												}
											}
											
											//sm
											if(app.shuming_filter_box.isSelected()) {
												String temp= app.name_filter.getText();
												for(int j=0;j<temp.length();j++) {
													if(yaoming.contains(""+ temp.charAt(j))) {
														continue Here;
													}	
												}
											}
											yaoming=yaoming.split("��Ӧ֢")[0];
											yaoming=yaoming.split("��")[0];
											yaoming=yaoming.split("\\(")[0];
											gongxiao.put(yaoming, gongxiaoyaoming);
										}else {
											frequencyLeaf.put(yaoming, frequencyLeaf.get(yaoming)+ 1);
											//hai
										}
										//	} 
									}
								}
							leaf.put(tempRec, gongxiao);
						}else {
							frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
						}
					}
				}
			}
		}
		return leaf;
	} 
	
	//dnn
	private Map<String, Object> kernerDnnForest(App app, String[] dnn, Map<String, Object> root, Map<String, Integer> findLeaf, int depth) { 
		Map<String, Object> leaf= new ConcurrentHashMap<String, Object>();
		if(++depth> 6) {
			return leaf;
		}
		int max= dnn.length> 22? 22: dnn.length;
		for(int i= 1; i< max; i++){
			String tempRec= dnn[i].split(":")[0];
			if(tempRec.length()> 1) {
				if(this.pos.containsKey(tempRec)) {
					int find= 0;
					if(pos.get(tempRec).contains("��")) {
						find++;
					}
					if(pos.get(tempRec).contains("��")) {
						find++;
					}
					if(pos.get(tempRec).contains("��")) {
						find++;
					}
					if(pos.get(tempRec).contains("ν")) {
						find++;
					}
					if(find> 0) {
						if(!findLeaf.containsKey(tempRec)) {
							findLeaf.put(tempRec, 1);
							frequencyLeaf.put(tempRec, -1);
							Iterator<String> iterator= u.dic_li.keySet().iterator();
							Map<String, Object> gongxiao= new ConcurrentHashMap<String, Object>();
							Here:
								while(iterator.hasNext()) {
									String yaoming= iterator.next();
									Map<String, Object> gongxiaoyaoming= new ConcurrentHashMap<String, Object>();
									if(u.dic_li.get(yaoming).toString().contains(tempRec)) {
										String hai= u.dic_hai.get(yaoming).toString();
										String li= u.dic_li.get(yaoming).toString();
										String xw= u.dic_xw.get(yaoming).toString();
										String jm= u.dic_jm.get(yaoming).toString().replaceAll("\\s*", "");
										if(!frequencyLeaf.containsKey(yaoming)) {
											frequencyLeaf.put(yaoming, 1);
											//hai
											if(app.risk_filter_box.isSelected()) {
												String temp= app.name_filter.getText();
												for(int j=0;j<temp.length();j++) {
													if(hai.contains(""+ temp.charAt(j))) {
														continue Here;
													}
												}
											}
											//li
											if(app.feel_filter_box.isSelected()) {
												String temp= app.name_filter.getText();
												for(int j= 0; j< temp.length(); j++) {
													if(li.contains(""+ temp.charAt(j))) {
														continue Here;
													}	
												}
											}
											//xw
											if(!app.nameFeelFilter.getText().isEmpty()) {
												String temp= app.nameFeelFilter.getText();
												for(int j=0;j<temp.length();j++) {
													if(xw.contains(""+ temp.charAt(j))) {
														continue Here;
													}	
												}
											}
											//jm
											if(null!= app.name_filter_not_have.getText()) {
												if(!app.name_filter_not_have.getText().replace(" ", "").isEmpty()) {
													String temp= app.name_filter_not_have.getText();
													int findJM= 0;
													for(int j= 0; j< temp.length(); j++) {
														if(jm.contains(""+ temp.charAt(j))) {
															findJM= 1;
														}	
													}
													if(findJM== 0) {
														continue Here;
													}
												}
											}
											//sm
											if(app.shuming_filter_box.isSelected()) {
												String temp= app.name_filter.getText();
												for(int j=0;j<temp.length();j++) {
													if(yaoming.contains(""+ temp.charAt(j))) {
														continue Here;
													}	
												}
											}
											gongxiao.put(yaoming, gongxiaoyaoming);
										}else {
											frequencyLeaf.put(yaoming, frequencyLeaf.get(yaoming)+ 1);	
										}
										//	} 
									}
								}
							leaf.put(tempRec, gongxiao);
						}else {
							frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
						}
					}
				}
			}
		}
		return leaf;
	} 
	
	
	//neike JINJI
	private Map<String, Object> kernerZynkJForest(String temp, Map<String, Object> root, Map<String, Integer> findLeaf, int depth) { 
		Map<String, Object> leaf= new ConcurrentHashMap<String, Object>();
		if(++depth>6) {
			return leaf;
		}
		int ml=0;
		Map<String, WordFrequency> map = analyzer.parserMixStringByReturnFrequencyMap(temp);
		Iterator<String> it= map.keySet().iterator();
		int max= 0;
		while(it.hasNext()) {
			String tempRec= it.next();
			if(!findLeaf.containsKey(tempRec)) {
				findLeaf.put(tempRec, 1);
				frequencyLeaf.put(tempRec, -1);
				if(u.dic_map.containsKey(tempRec)) {
					Map<String, Object> subLeaf= new ConcurrentHashMap<String, Object>();
					if(u.dic_hai.containsKey(tempRec)) {
						if(!u.dic_hai.get(tempRec).toString().contains("�ʼ�")) {
							Map<String, Object> leafLiSub= new ConcurrentHashMap<String, Object>();
							subLeaf.put(u.dic_hai.get(tempRec).toString(), leafLiSub);
						}	
					}
					if(max++ < 25) {
						leaf.put(tempRec, subLeaf);
					}
					//return leaf;
				}else if(ml < 8) {
					Map<String, Object> subLeaf = kernerForest(tempRec, leaf, findLeaf, depth);
					if(subLeaf.size() > 0) {
						leaf.put(tempRec, subLeaf);
						ml++;
					}
				}
			}else {
				frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
			}
		}
		return leaf;
	}
	
	//li
	private Map<String, Object> kernerForest(String temp, Map<String, Object> root, Map<String, Integer> findLeaf, int depth) { 
		Map<String, Object> leaf = new ConcurrentHashMap<String, Object>();
		if(++depth>6) {
			return leaf;
		}
		//int ml=0;
		if(u.dic_li.containsKey(temp) || u.dic_yl.containsKey(temp) ||u.dic_zf.containsKey(temp)) {
			Map<String, WordFrequency> map = analyzer.parserMixStringByReturnFrequencyMap(
					(u.dic_li.get(temp) == null? "":u.dic_li.get(temp))+
					(u.dic_yl.get(temp) == null? "": "")+
					(u.dic_zf.get(temp) == null? "": "")
					);
			Iterator<String> it= map.keySet().iterator();
			while(it.hasNext()) {//gongxiao
				String tempRec= it.next();
				if(tempRec.length()> 1) {
					if(this.pos.containsKey(tempRec)) {
						int find= 0;
						if(pos.get(tempRec).contains("��")) {
							find++;
						}
						if(pos.get(tempRec).contains("��")) {
							find++;
						}
						if(pos.get(tempRec).contains("��")) {
							find++;
						}
						if(pos.get(tempRec).contains("ν")) {
							find++;
						}
						if(find> 0) {
							if(!findLeaf.containsKey(tempRec)) {
								findLeaf.put(tempRec, 1);
								frequencyLeaf.put(tempRec, -1);
								Iterator<String> iterator= u.dic_li.keySet().iterator();
								Map<String, Object> gongxiao= new ConcurrentHashMap<String, Object>();
								while(iterator.hasNext()) {
									String yaoming= iterator.next();
									Map<String, Object> gongxiaoyaoming= new ConcurrentHashMap<String, Object>();
									if(u.dic_li.get(yaoming).toString().contains(tempRec)) {
										String hai= u.dic_hai.get(yaoming).toString();
										if(!hai.contains("��")&&!hai.contains("��")&&!hai.contains("��")
												&&!hai.contains("��")&&!hai.contains("η")
												&&!hai.contains("��")&&!hai.contains("��")&&!hai.contains("̥")) {
											if(!frequencyLeaf.containsKey(yaoming) ) {
												frequencyLeaf.put(yaoming, 1);
												String xingWeiRatio= u.dic_xw.get(yaoming).toString();
												String xingWei= u.dic_xw.get(temp).toString();
												String maiLuoRatio= u.dic_jm.get(yaoming).toString();
												String maiLuo= u.dic_jm.get(temp).toString();
												if(((xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														)) {
													if(maiLuoRatio.contains("�İ�")){
														if((maiLuo.contains("�İ�"))) {
															gongxiao.put(yaoming, gongxiaoyaoming);
														}
													}
													if(!maiLuoRatio.contains("�İ�")&&maiLuoRatio.contains("��")){
														if((!maiLuo.contains("�İ�")&&maiLuo.contains("��"))) {
															gongxiao.put(yaoming, gongxiaoyaoming);
														}
													}
													if((maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("С��")&& maiLuo.contains("С��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("Ƣ")&& maiLuo.contains("Ƣ"))
															||(maiLuoRatio.contains("����")&& maiLuo.contains("����"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("ʮ��")&& maiLuo.contains("ʮ��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("����")&& maiLuo.contains("����"))
															||(maiLuoRatio.contains("θ")&& maiLuo.contains("θ"))
															){
														gongxiao.put(yaoming, gongxiaoyaoming);
													}
													if((!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))
															&&(!maiLuoRatio.contains("С��")&& !maiLuo.contains("С��"))
															&&(!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))
															&&(!maiLuoRatio.contains("Ƣ")&& !maiLuo.contains("Ƣ"))
															&&(!maiLuoRatio.contains("����")&& !maiLuo.contains("����"))
															&&(!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))
															&&(!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))
															&&(!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))
															&&(!maiLuoRatio.contains("ʮ��")&& !maiLuo.contains("ʮ��"))
															&&(!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))
															&&(!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))
															&&(!maiLuoRatio.contains("����")&& !maiLuo.contains("����"))
															&&(!maiLuoRatio.contains("θ")&& !maiLuo.contains("θ"))
															&&(!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))){
														gongxiao.put(yaoming, gongxiaoyaoming);
													}
												}
												
												if(((!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														))) {
													if(maiLuoRatio.contains("�İ�")){
														if((maiLuo.contains("�İ�"))) {
															gongxiao.put(yaoming, gongxiaoyaoming);
														}
													}
													if(!maiLuoRatio.contains("�İ�")&&maiLuoRatio.contains("��")){
														if((!maiLuo.contains("�İ�")&&maiLuo.contains("��"))) {
															gongxiao.put(yaoming, gongxiaoyaoming);
														}
													}
													if((maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("С��")&& maiLuo.contains("С��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("Ƣ")&& maiLuo.contains("Ƣ"))
															||(maiLuoRatio.contains("����")&& maiLuo.contains("����"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("ʮ��")&& maiLuo.contains("ʮ��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("����")&& maiLuo.contains("����"))
															||(maiLuoRatio.contains("θ")&& maiLuo.contains("θ"))
															){
														gongxiao.put(yaoming, gongxiaoyaoming);
													}
													if((!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("С��")&& !maiLuo.contains("С��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("Ƣ")&& !maiLuo.contains("Ƣ")
															&&!maiLuoRatio.contains("����")&& !maiLuo.contains("����")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("ʮ��")&& !maiLuo.contains("ʮ��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("����")&& !maiLuo.contains("����")
															&&!maiLuoRatio.contains("θ")&& !maiLuo.contains("θ")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��"))){
														gongxiao.put(yaoming, gongxiaoyaoming);
													}
												}	
											}else {
												frequencyLeaf.put(yaoming, frequencyLeaf.get(yaoming) + 1);
											}
										} 
									}
								}
								leaf.put(tempRec, gongxiao);
							}else {
								frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
							}
						}
					}
				}
			}
		}
		return leaf;
	} 


	//neike
	private Map<String, Object> kernerZynkForest(String temp, Map<String, Object> root, Map<String, Integer> findLeaf, int depth) { 
		Map<String, Object> leaf= new ConcurrentHashMap<String, Object>();
		if(++depth>6) {
			return leaf;
		}
		int ml=0;
		int max= 0;
		Map<String, WordFrequency> map = analyzer.parserMixStringByReturnFrequencyMap(temp);
		Iterator<String> it= map.keySet().iterator();
		while(it.hasNext()) {
			String tempRec= it.next();
			if(!findLeaf.containsKey(tempRec)) {
				findLeaf.put(tempRec, 1);
				frequencyLeaf.put(tempRec, -1);
				if(u.dic_map.containsKey(tempRec)) {
					Map<String, Object> subLeaf= new ConcurrentHashMap<String, Object>();
					if(u.dic_li.containsKey(tempRec)) {
						Map<String, WordFrequency> liMap
						= this.analyzer.parserMixStringByReturnFrequencyMap(u.dic_li.get(tempRec).toString());
						Iterator<String> itli= liMap.keySet().iterator();
						while(itli.hasNext()) {
							String word= itli.next();
							if(this.pos.containsKey(word)) {
								if(word.length()> 1) {
									if(!frequencyLeaf.containsKey(word)) {
										frequencyLeaf.put(word, 1);
									}else {
										frequencyLeaf.put(word, frequencyLeaf.get(word) + 1);
									}
									Map<String, Object> leafLiSub =  new ConcurrentHashMap<String, Object>();
									if(pos.get(word).contains("��")) {
										subLeaf.put(word, leafLiSub);
									}
									if(pos.get(word).contains("��")) {
										subLeaf.put(word, leafLiSub);
									}
									if(pos.get(word).contains("ν")) {
										subLeaf.put(word, leafLiSub);
									}
								}
							}
						}
					}
					if(max++ < 25) {
						leaf.put(tempRec, subLeaf);
					}
					//return leaf;
				}else if(ml < 8) {
					Map<String, Object> subLeaf = kernerForest(tempRec, leaf, findLeaf, depth);
					if(subLeaf.size() > 0) {
						leaf.put(tempRec, subLeaf);
						ml++;
					}
				}
			}else {
				frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
			}
		}
		return leaf;
	}
	
	//gongxiao
	private Map<String, Object> kernerClassification(String temp, Map<String, Object> root, Map<String, Integer> findLeaf,
			int depth) {
		Map<String, Object> leaf = new ConcurrentHashMap<>();
		if(++depth>6) {
			return leaf;
		} 
		frequencyLeaf.put(temp,-1);	
		if(u.dic_li.containsKey(temp)) {
			String className=temp+"��Ч";
			findLeaf.put(className, 1);
			frequencyLeaf.put(className, -1);	
			//add sub sets
			Map<String, WordFrequency> liMap = this.analyzer.parserMixStringByReturnFrequencyMap(u.dic_li.get(temp).toString());
			Iterator<String> it = liMap.keySet().iterator();
			Map<String, Object> leafLi = new ConcurrentHashMap<>();
			int ml = 0;
			while(it.hasNext()) {
				String word = liMap.get(it.next()).getWord();
				if(this.pos.containsKey(word)) {
					if(word.length() > 1) {
						Map<String, Object> leafLiSub = new ConcurrentHashMap<>();
						leafLi.put(word, leafLiSub);
						frequencyLeaf.put(word, -1);	
					}else if(ml < 10) {
						Map<String, Object> leafLiSub = new ConcurrentHashMap<>();
						if(leafLiSub.size() > 0) {
							leaf.put(word, leafLiSub);
							ml++;
						}
						ml++;
					}
				}
			}
			leaf.put(className, leafLi);
		}
		if(u.dic_hai.containsKey(temp)) {
			String className=temp+"����";
			findLeaf.put(className, 1);
			frequencyLeaf.put(className,-1);	
			Map<String, Object> leafLi = new ConcurrentHashMap<>();		
			leafLi.put(u.dic_hai.get(temp).toString(), leafLi);
			frequencyLeaf.put(u.dic_hai.get(temp).toString(), -1);	
			leaf.put(className, leafLi);	
		}
		if(u.dic_xw.containsKey(temp)) {
			String className=temp + "��ζ";
			findLeaf.put(className, 1);
			frequencyLeaf.put(className,-1);	
			//add sub sets
			Map<String, WordFrequency> liMap = this.analyzer.parserMixStringByReturnFrequencyMap(u.dic_xw.get(temp).toString());
			Iterator<String> it = liMap.keySet().iterator();
			Map<String, Object> leafLi = new ConcurrentHashMap<>();
			int ml = 0;
			while(it.hasNext()) {
				String word = liMap.get(it.next()).getWord();
				if(this.pos.containsKey(word)) {
					if(word.length() > 1) {
						Map<String, Object> leafLiSub = new ConcurrentHashMap<>();
						leafLi.put(word, leafLiSub);
						frequencyLeaf.put(word, -1);	
					}else if(ml < 10) {
						Map<String, Object> leafLiSub = new ConcurrentHashMap<>();
						leafLi.put(word, leafLiSub);
						frequencyLeaf.put(word, -1);	
						ml++;
					}
				}
			}
			leaf.put(className, leafLi);
		}
		if(u.dic_yl.containsKey(temp)) {
			String className=temp+"������ע";
			findLeaf.put(className, 1);
			frequencyLeaf.put(className, -1);	
			//add sub sets
			Map<String, Object> leafLi = new ConcurrentHashMap<>();	
			leafLi.put(u.dic_yl.get(temp).toString(), leafLi);
			frequencyLeaf.put(u.dic_yl.get(temp).toString(), -1);	
			leaf.put(className, leafLi);
		}	
		return leaf;
	}
	//hai
	private Map<String, Object> kernerSea(String temp, Map<String, Object> root, Map<String, Integer> findLeaf, int depth) {
		Map<String, Object> leaf= new ConcurrentHashMap<String, Object>();
		if(++depth> 6) {
			return leaf;
		}
		//int ml=0;
		if(u.dic_yw.containsKey(temp)) {
			if(u.dic_yw.get(temp).toString().isEmpty()) {
				return leaf;
			}
		}else {
			return leaf;
		}
		if(u.dic_li.containsKey(temp)|| u.dic_yl.containsKey(temp)|| u.dic_zf.containsKey(temp)) {
			Map<String, WordFrequency> map= analyzer.parserMixStringByReturnFrequencyMap(
					(u.dic_li.get(temp)== null? "":u.dic_li.get(temp))+
					(u.dic_yl.get(temp)== null? "": "")+
					(u.dic_zf.get(temp)== null? "": "")
					);
			Iterator<String> it= map.keySet().iterator();
			while(it.hasNext()) {//gongxiao
				String tempRec= it.next();
				if(tempRec.length()> 1) {
					if(this.pos.containsKey(tempRec)) {
						int find= 0;
						if(pos.get(tempRec).contains("��")) {
							find++;
						}
						if(pos.get(tempRec).contains("��")) {
							find++;
						}
						if(pos.get(tempRec).contains("��")) {
							find++;
						}
						if(pos.get(tempRec).contains("ν")) {
							find++;
						}
						if(find> 0) {
							if(!findLeaf.containsKey(tempRec)) {
								findLeaf.put(tempRec, 1);
								frequencyLeaf.put(tempRec, -1);
								Iterator<String> iterator= u.dic_li.keySet().iterator();
								Map<String, Object> gongxiao= new ConcurrentHashMap<String, Object>();
								//int max= 0;
								//bianli gongxiao
								Here:
								while(iterator.hasNext()) {
									String yaoming= iterator.next();
									Map<String, Object> gongxiaoyaoming= new ConcurrentHashMap<String, Object>();
									if(u.dic_li.get(yaoming).toString().contains(tempRec)) {
										String hai= u.dic_hai.get(yaoming).toString();
										if(hai.contains("��")||hai.contains("��")||hai.contains("��")
												||hai.contains("��")||hai.contains("η")
												||hai.contains("��")||hai.contains("��")||hai.contains("̥")) {
											if(!yaoming.contains("Ѩ")&& !frequencyLeaf.containsKey(yaoming) ) {
												frequencyLeaf.put(yaoming, 1);
												String xingWeiRatio= u.dic_xw.get(yaoming).toString();
												String xingWei= u.dic_xw.get(temp).toString();
												String maiLuoRatio= u.dic_jm.get(yaoming).toString();
												String maiLuo= u.dic_jm.get(temp).toString();
												
												if(u.risk_filter_box.isSelected()) {
													String tempRisk= u.name_filter.getText();
													for(int j= 0; j< tempRisk.length(); j++) {
														if(hai.contains(""+ tempRisk.charAt(j))) {
															continue Here;
														}
													}
												}
																
												if(((xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														||(xingWeiRatio.contains("��")&&xingWei.contains("��"))
														)) {
													if(maiLuoRatio.contains("�İ�")){
														if((maiLuo.contains("�İ�"))) {
															gongxiaoyaoming.put(hai, new ConcurrentHashMap<>());
															findLeaf.put(yaoming, 1);
															gongxiao.put(yaoming, gongxiaoyaoming);
														}
													}
													if(!maiLuoRatio.contains("�İ�")&& maiLuoRatio.contains("��")){
														if((!maiLuo.contains("�İ�")&& maiLuo.contains("��"))) {
															gongxiaoyaoming.put(hai, new ConcurrentHashMap<>());
															findLeaf.put(yaoming, 1);
															gongxiao.put(yaoming, gongxiaoyaoming);
														}
													}
													if((maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("С��")&& maiLuo.contains("С��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("Ƣ")&& maiLuo.contains("Ƣ"))
															||(maiLuoRatio.contains("����")&& maiLuo.contains("����"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("ʮ��")&& maiLuo.contains("ʮ��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("����")&& maiLuo.contains("����"))
															||(maiLuoRatio.contains("θ")&& maiLuo.contains("θ"))
															){
														gongxiaoyaoming.put(hai, new ConcurrentHashMap<>());
														findLeaf.put(yaoming, 1);
														gongxiao.put(yaoming, gongxiaoyaoming);
													}
													if((!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("С��")&& !maiLuo.contains("С��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("Ƣ")&& !maiLuo.contains("Ƣ")
															&&!maiLuoRatio.contains("����")&& !maiLuo.contains("����")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("ʮ��")&& !maiLuo.contains("ʮ��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("����")&& !maiLuo.contains("����")
															&&!maiLuoRatio.contains("θ")&& !maiLuo.contains("θ")
															)){
														gongxiaoyaoming.put(hai, new ConcurrentHashMap<>());
														findLeaf.put(yaoming, 1);
														gongxiao.put(yaoming, gongxiaoyaoming);
													}
												}
												
												if(((!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��")
														&&!xingWeiRatio.contains("��")&&!xingWei.contains("��"))
														)) {
													if(maiLuoRatio.contains("�İ�")){
														if((maiLuo.contains("�İ�"))) {
															gongxiaoyaoming.put(hai, new ConcurrentHashMap<>());
															findLeaf.put(yaoming, 1);
															gongxiao.put(yaoming, gongxiaoyaoming);
														}
													}
													if(!maiLuoRatio.contains("�İ�")&&maiLuoRatio.contains("��")){
														if((!maiLuo.contains("�İ�")&&maiLuo.contains("��"))) {
															gongxiaoyaoming.put(hai, new ConcurrentHashMap<>());
															findLeaf.put(yaoming, 1);
															gongxiao.put(yaoming, gongxiaoyaoming);
														}
													}
													if((maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("С��")&& maiLuo.contains("С��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("Ƣ")&& maiLuo.contains("Ƣ"))
															||(maiLuoRatio.contains("����")&& maiLuo.contains("����"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("ʮ��")&& maiLuo.contains("ʮ��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("��")&& maiLuo.contains("��"))
															||(maiLuoRatio.contains("����")&& maiLuo.contains("����"))
															||(maiLuoRatio.contains("θ")&& maiLuo.contains("θ"))
															){
														gongxiaoyaoming.put(hai, new ConcurrentHashMap<>());
														findLeaf.put(yaoming, 1);
														gongxiao.put(yaoming, gongxiaoyaoming);
													}
													if((!maiLuoRatio.contains("��")&& !maiLuo.contains("��")														&&(!maiLuoRatio.contains("С��")&& !maiLuo.contains("С��"))
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("Ƣ")&& !maiLuo.contains("Ƣ")
															&&!maiLuoRatio.contains("����")&& !maiLuo.contains("����")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("ʮ��")&& !maiLuo.contains("ʮ��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("��")&& !maiLuo.contains("��")
															&&!maiLuoRatio.contains("����")&& !maiLuo.contains("����")
															&&!maiLuoRatio.contains("θ")&& !maiLuo.contains("θ"))
															){
														gongxiaoyaoming.put(hai, new ConcurrentHashMap<>());
														findLeaf.put(yaoming, 1);
														gongxiao.put(yaoming, gongxiaoyaoming);
													}
												}	
											}
										} 
									}
								}
								leaf.put(tempRec, gongxiao);
							}else {
								frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
							}
						}
					}
				}
			}
		}
		return leaf;
	} 
	
	public void weightPrint(String prePrint, Graphics2D g, int AMV_MVS_VSQX, int AMV_MVS_VSQY, Font font) {
		g.setFont(font);
		g.drawString(prePrint, AMV_MVS_VSQX, AMV_MVS_VSQY);
	}
	public void heightPrint(String prePrint, Graphics2D g, int AMV_MVS_VSQX, int AMV_MVS_VSQY, Font font) {
		g.setFont(font);
		g.drawString(prePrint, AMV_MVS_VSQX, AMV_MVS_VSQY);
	}
	
	public void mouseDragged(java.awt.event.MouseEvent arg0) {
		if(arg0.getX()!=mousex) {
			yrot += (arg0.getX()-mousex)/5;
		}
		if(arg0.getY()!=mousey) {
			xrot += (arg0.getY()-mousey)/5;
		}
		mousex = arg0.getX();
		mousey = arg0.getY();
	}
	
	public void mouseMoved(java.awt.event.MouseEvent arg0) {

	}
	
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()==38) {
			brot += 0.5;
		}
		if(arg0.getKeyCode()==37) {
			lrot -= 0.5;
		}
		if(arg0.getKeyCode()==40) {
			brot -= 0.5;
		}
		if(arg0.getKeyCode()==39) {
			lrot += 0.5;
		}
	}
	
	public void keyReleased(KeyEvent arg0) {	
	}
	
	public void keyTyped(KeyEvent arg0) {	
	}
	
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		trot += arg0.getWheelRotation();
	}

	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
		clicked = false;	
	}
	
	public void mouseExited(MouseEvent arg0) {
		clicked = false;
	}
	
	public void mousePressed(MouseEvent arg0) {
		mousex = arg0.getX();
		mousey = arg0.getY();
	}
	
	public void mouseReleased(MouseEvent arg0) {
	}
	
}