package ME.APM.VSQ.xlx;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.media.opengl.*;

import MVQ.button.DetaButton;
import MVQ.slider.DetaSlider;
import OCI.ME.analysis.C.A;
import VSQ.OPE.jogl.JOGLOBJShape;

import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.GLBuffers;
import com.jogamp.opengl.util.gl2.GLUT;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ME.APM.VSQ.App;
import ME.S.stables.PathLinkFile;

import javax.media.opengl.awt.GLCanvas;  
import javax.media.opengl.glu.GLU;
public class CoAuthorForWord extends JPanel implements MouseMotionListener, MouseListener, MouseWheelListener, KeyListener, GLEventListener { 
	public Boolean clicked = false;
	public int mousex = 0;
	public int mousey = 0;
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
	public A _A;
	public int c = 0;
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
	float xrot = -0.0f;  
	float yrot = -0.0f;  
	float zrot = 360.0f;  
	float trot = 0.0f;  
	float prot = 1.0f;  
	float lrot = -1.5f; 
	float brot = -0.5f; 
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
	
	ByteBuffer buffer;
	int[][] g;
	JOGLOBJShape shape=null;
	public double t = 1.0d;
	public String rootWord;  
	public CoAuthorForWord(App u, A _A
			, Map<String, String> pos) throws HeadlessException, InterruptedException  {  
		Thread.sleep(100);
		rootWord="";
		rootLeaf = new ConcurrentHashMap<>();
		findLeaf = new ConcurrentHashMap<>();
		frequencyLeaf = new ConcurrentHashMap<>();
		didLeaf= new ConcurrentHashMap<>();
		this._A = _A;
		this.pos = pos;
		this.u = u;
		this.setLayout(null);
		Thread.sleep(100);
		GLProfile glp = GLProfile.getDefault();
		GLCapabilities glcaps = new GLCapabilities(glp);      
		GLCanvas canvas = new GLCanvas(glcaps);  
		canvas.addGLEventListener(this);  
		canvas.addMouseListener(this);  
		Thread.sleep(100);
		canvas.addMouseMotionListener(this);
		canvas.addKeyListener(this);
		canvas.addMouseWheelListener(this);
		canvas.setBounds(0, 0, 618, 350);
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
		top = new DetaButton("top", 100, 50, Color.red);
		top.addActionListener( 
				new ActionListener()  {    
					public void actionPerformed(ActionEvent e){
						brot+=0.5;
					}
				});
		down = new DetaButton("down", 100, 50, Color.orange);
		down.addActionListener( 
				new ActionListener()  {    
					public void actionPerformed(ActionEvent e){
						brot-=0.5;
					}
				});
		left = new DetaButton("left", 100, 50, Color.pink);
		left.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						lrot-=0.5;
					}
				});
		right = new DetaButton("right", 100, 50, Color.green);
		right.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						lrot+=0.5;
					}
				});
		bhl = new DetaButton("Ôª»ùÎåÐÐ", 100, 50, Color.red);
		bhl.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						bootFlowerForest("ÎåÐÐ", true);
					}
				});  
		cfc = new DetaButton("Ë«Ôª°ËØÔ", 100, 50, Color.orange);
		cfc.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						bootClassificationMap("Ë«Ôª", true);
					}
				});  
		whh = new DetaButton("Ôª»ù°ËØÔ", 200, 50, Color.magenta);
		whh.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						bootFlowerSea("ÒõÑô", true);
					}
				}); 
		rst = new DetaButton("ÖØÖÃ", 200, 50, Color.pink);
	//	rst.setBounds(0, 0, 100, 20);
		rst.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						 xrot = -0.0f;  
						 yrot = -0.0f;  
						 zrot = 360.0f;  
						 trot = 0.0f;  
						 prot = 1.0f;  
						 lrot = -1.5f; 
						 brot = -0.5f; 
						 irot = 78.0f; 
						 srot = 0.7f;
					}
				}); 
		
		save = new DetaButton("±£´æ", 200, 50, Color.green);
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
		
		load = new DetaButton("¶ÁÈ¡", 200, 50, Color.magenta);
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
		JButton xzb = new DetaButton("X×ø±ê", 200, 50, Color.pink);
		buttonBoxX.add(xzb);
		buttonBoxX.add(sliderx);
		sliderBoxx1.add(buttonBoxX);
		
		Box buttonBoxY = new Box(BoxLayout.X_AXIS);  
		JButton yzb = new DetaButton("Y×ø±ê", 200, 50, Color.pink);
		buttonBoxY.add(yzb);
		buttonBoxY.add(slidery);
		sliderBoxx1.add(buttonBoxY);
		
		Box buttonBoxZ = new Box(BoxLayout.X_AXIS);  
		JButton zzb = new DetaButton("Z×ø±ê", 200, 50, Color.pink);
		buttonBoxZ.add(zzb);
		buttonBoxZ.add(sliderz);
		sliderBoxx2.add(buttonBoxZ);
		
		Box buttonBoxT = new Box(BoxLayout.X_AXIS);  
		JButton tzb = new DetaButton("T×ø±ê", 200, 50, Color.pink);
		buttonBoxT.add(tzb);
		buttonBoxT.add(slidert);
		sliderBoxx2.add(buttonBoxT);
		
		
		sliderBox.add(sliderBoxx1);
		sliderBox.add(sliderBoxx2);
		sliderBox.add(buttonBox);
		sliderBox.setBounds(0, 350, 627, 300);
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
//		System.out.println("2122222222222222222");
		GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();
		gl.glTranslatef(lrot, brot, -26.0f);
		gl.glRotatef(xrot, 1, 0.0f, 0.0f);
		gl.glRotatef(yrot, 0.0f, 1, 0.0f);
		gl.glRotatef(zrot, 0.0f, 0.0f, 1);
		gl.glPointSize(prot);
		gl.glOrtho(0, trot, 0, trot, 1, -1);  
		int section[] = new int[21];
		section [0]=32;
		section [1]=32;
		section [2]=32;
		section [3]=32;
		section [4]=10;
		section [5]=10;
		section [6]=10;
		section [7]=10;
		section [8]=10;
		section [9]=10;
		section [10]=10;
		section [11]=10;
		float a = 10;
		double root[] = new double[3];
		didLeaf.clear();
		try {
			drawWords(section, 0, root, a, 0, 0, this.rootLeaf, didLeaf);
		} catch (IOException e) {
			e.printStackTrace();
		}
		gl.glEnd();
		gl.glFlush();
	}  	
	@SuppressWarnings({"unchecked", "static-access"})
	private void drawWords(int []s, int se, double[] root, float a, int j, int k, Map<String, Object> root3
			, Map<String, Integer> didLeaf) throws IOException {
		if(root3 == null || root3.size() == 0) {
			return;
		}
		int i = 0;
		s[se] = root3.size();
		Iterator<String> iteratorLeaf = root3.keySet().iterator();
		Here:
		while(iteratorLeaf.hasNext()) {
			if(k >= irot) {
				return;
			}
			k++;
			double a1 = 1;
			String leafName = iteratorLeaf.next();
			if(leafName.length()==0) {
				continue Here;
			}
			Map<String, Object> leaf = (Map<String, Object>) root3.get(leafName);
			if(leaf.size() > 0) {
				a1 =  1 ;
			}
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
			String prePrint= leafName;
			Font font= new Font(prePrint,20, 20);
			checkImageBuf= GLBuffers.newDirectByteBuffer(20 * prePrint.length()*22 * 3);
			BufferedImage image= new BufferedImage(prePrint.length()*32, 20, BufferedImage.TYPE_INT_RGB);
			Graphics2D ga= image.createGraphics();
			ga.setColor(Color.white);
			ImageIcon bagua_dui= null; 
			//×ÏÉ«£ºmegenda 
			if(leafName.contains("Ùã")) {
				bagua_dui= new ImageIcon(this.getClass().getResource(PathLinkFile.bg_xun_png)); 
				ga.setColor(new Color(226,5,9));
			}else
			if(leafName.contains("Àë")) {
				bagua_dui= new ImageIcon(this.getClass().getResource(PathLinkFile.bg_li_png)); 
				ga.setColor(new Color(240,45,216));//zi
			}else
			if(leafName.contains("À¤")) {
				bagua_dui= new ImageIcon(this.getClass().getResource(PathLinkFile.bg_kun_png)); 
				ga.setColor(new Color(0,185,185));
			}else
			if(leafName.contains("¶Ò")) {
				bagua_dui= new ImageIcon(this.getClass().getResource(PathLinkFile.bg_dui_png)); 
				ga.setColor(new Color(30,164,19));
			}else
			if(leafName.contains("Ç¬")) {
				bagua_dui= new ImageIcon(this.getClass().getResource(PathLinkFile.bg_qian_png)); 
				ga.setColor(Color.BLUE);
			}else
			if(leafName.contains("¿²")) {
				bagua_dui= new ImageIcon(this.getClass().getResource(PathLinkFile.bg_kan_png)); 
				ga.setColor(new Color(91,15,86));
			}else
			if(leafName.contains("ôÞ")) {
				bagua_dui= new ImageIcon(this.getClass().getResource(PathLinkFile.bg_gen_png)); 
				ga.setColor(new Color(0, 255, 255));
			}else
			if(leafName.contains("Õð")) {
				bagua_dui= new ImageIcon(this.getClass().getResource(PathLinkFile.bg_zhen_png)); 
				ga.setColor(new Color(245, 249, 102));
			}else
			if(leafName.contains("Ä¾")) {
					ga.setColor(new Color(226, 5, 9));
			}else
			if(leafName.contains("»ð")) {
				ga.setColor(new Color(240, 45, 216));
			}else
			if(leafName.contains("ÍÁ")) {
				ga.setColor(new Color(0, 255, 255));
			}else
			if(leafName.contains("½ð")) {
				ga.setColor(new Color(30, 164, 19));
			}else
			if(leafName.contains("Ë®")) {
				ga.setColor(new Color(91, 15, 86));
			}
				
			if(null!= bagua_dui) {
				DrawImage(bagua_dui);	
			}
			gl.glRasterPos3d(root[0] + Math.cos(2*Math.PI*i/s[se]) * a
					, root[1] + Math.sin(2 * Math.PI * i/s[se]) * a
					, root[2] + (srot*a1)+ 9);
			int AMV_MVS_VSQX= 1;
			int AMV_MVS_VSQY= 17;
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
			root1[0]= root[0]+ Math.cos(2* Math.PI* i/ s[se])* a;
			root1[1]= root[1]+ Math.sin(2* Math.PI* i/ s[se])* a;
			root1[2]= root[2]+ (srot* a1);
			//j = i; 
			if(!didLeaf.containsKey(leafName) && findLeaf.containsKey(leafName)) {
				didLeaf.put(leafName, 1);
					drawWords(s, se+ 1, root1, a * 0.66f , j+ i, k, leaf, didLeaf);
			}
			i++;
		}
	}

	private void DrawImage(ImageIcon bagua_dui) { 
		BufferedImage bufferedImage= new BufferedImage(bagua_dui.getIconWidth(),
				bagua_dui.getIconHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D ga= bufferedImage.createGraphics();

		ga.drawImage(bagua_dui.getImage(), 0, 0, bagua_dui.getImageObserver());
		ByteBuffer graphImageBuf 
		= GLBuffers.newDirectByteBuffer((bufferedImage.getHeight())* (bufferedImage.getWidth()+10)* 3);
		graphImageBuf.clear();
		int h= bufferedImage.getHeight();
		for (int i1= h- 1; i1>= 0; i1--){
			for (int j1 = 0; j1 < bufferedImage.getWidth(); j1++){
				if(bufferedImage.getRGB(j1, i1)!= 0) {
					graphImageBuf.put((byte)(bufferedImage.getRGB(j1, i1)>>0  & (byte)0xFF));	
					graphImageBuf.put((byte)(bufferedImage.getRGB(j1, i1)>>8  & (byte)0xFF));	
					graphImageBuf.put((byte)(bufferedImage.getRGB(j1, i1)>>16 & (byte)0xFF));	
				}
			}
		}
		graphImageBuf.rewind();
		gl.glDrawPixels(bufferedImage.getWidth(), bufferedImage.getHeight()
				, GL2.GL_RGB, GL.GL_UNSIGNED_BYTE, graphImageBuf);
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
		CoAuthorForWord app = new CoAuthorForWord(null, null, null);   
		app.setSize(850, 500);
		app.setVisible(true);
		JFrame f = new JFrame();
		f.add(app);
		f.setTitle("ButtonDemo");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(650,480);
		f.setVisible(true);
	}
	
	public void bootFlowerSea(String string, boolean isButton) {
		if(rootWord== null) {
			return;
		}
		if(rootWord.equalsIgnoreCase(string) && isButton== false) {
			return;
		} 
		rootWord= string;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(rootWord, 1);
		frequencyLeaf.put(rootWord, 1);
		Map<String, Object> leaf = new ConcurrentHashMap<>();
		Map<String, Object> subLeaf = new LinkedHashMap<>();
		subLeaf.put("ACT ¾ª ·Ó ¶Ò¡ú ¢ò", new ConcurrentHashMap<String, Object>());
		  subLeaf.put("D ËÀ Ëá À¤¨J ¢ø", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("PV ¾° õ£ Àë¡ü ¢ó", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("UH ¶Å Íª Ùã¨I ¢õ", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("OE éä ´¼ Õð¡û ¢ô", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("IX Éú õ¥ ôÞ¨L ¢÷", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("MS ÐÝ ÃÑ ¿²¡ý ¢ö", new ConcurrentHashMap<String, Object>());
		  subLeaf.put("Q ¿ª Ã¸ Ç¬¨K ¢ñ", new ConcurrentHashMap<String, Object>());
		leaf.put(rootWord, subLeaf);
		rootLeaf = subLeaf;
	}
	
	public void bootClassificationMap(String string, boolean isButton) {
		if(rootWord== null) {
			return;
		}
		if(rootWord.equalsIgnoreCase(string) && isButton== false) {
			return;
		} 
		rootWord= string;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(rootWord, 1);
		frequencyLeaf.put(rootWord, 1);
		Map<String, Object> leaf = new ConcurrentHashMap<>();
		Map<String, Object> subLeaf = new LinkedHashMap<>();
		 subLeaf.put("CX ¾ª ´¼ ¶Ò¡ú ¢ò", new ConcurrentHashMap<String, Object>());
	   subLeaf.put("DD E ËÀ Ã¸ À¤¨J ¢ø", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("DH ¾° õ£ Àë¡ü ¢ó", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("QA ¶Å Ëá Ùã¨I ¢õ", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("PI éä Íª Õð¡û ¢ô", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("ST Éú õ¥ ôÞ¨L ¢÷", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("UO ÐÝ ·Ó ¿²¡ý ¢ö", new ConcurrentHashMap<String, Object>());
		 subLeaf.put("MV ¿ª ÃÑ Ç¬¨K ¢ñ", new ConcurrentHashMap<String, Object>());
		leaf.put(rootWord, subLeaf);
		rootLeaf = subLeaf;
	}
	
	public void bootFlowerForest(String string, boolean isButton) {
		if(rootWord== null) {
			return;
		}
		if(rootWord.equalsIgnoreCase(string) && isButton== false) {
			return;
		} 
		rootWord= string;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(rootWord, 1);
		frequencyLeaf.put(rootWord, 1);
		Map<String, Object> leaf = new ConcurrentHashMap<>();
		Map<String, Object> subLeaf = new LinkedHashMap<>();
//		subLeaf.put("ACT ¾ª¶Ò¡ú ¢ò", new ConcurrentHashMap<String, Object>());
//		  subLeaf.put("D ËÀÀ¤¨J ¢ø", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("PV ¾°Àë¡ü ¢ó", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("UH ¶ÅÙã¨I ¢õ", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("OE éäÕð¡û ¢ô", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("IX ÉúôÞ¨L ¢÷", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("MS ÐÝ¿²¡ý ¢ö", new ConcurrentHashMap<String, Object>());
//		  subLeaf.put("Q ¿ªÇ¬¨K ¢ñ", new ConcurrentHashMap<String, Object>());
//		leaf.put(rootWord, subLeaf);
		
		subLeaf.put("H PV DD õ£ »ð¡ü", new ConcurrentHashMap<String, Object>());
		  subLeaf.put("H CDI õ¥Ëá ÍÁ¨J", new ConcurrentHashMap<String, Object>());
		  subLeaf.put("H AQT ·ÓÃ¸ ½ð¨K ", new ConcurrentHashMap<String, Object>());
		  subLeaf.put("H MXS ÃÑ Ë®¨L", new ConcurrentHashMap<String, Object>());
		  subLeaf.put("H OEU ´¼Íª Ä¾¨I", new ConcurrentHashMap<String, Object>());
		  leaf.put(rootWord, subLeaf);
		rootLeaf = subLeaf;
		
//		
//		if(rootWord== null) {
//			return;
//		}
//		if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//			return;
//		} 
//		rootWord= string;
//		rootLeaf.clear();
//		findLeaf.clear();
//		frequencyLeaf.clear();
//		findLeaf.put(rootWord, 1);
//		frequencyLeaf.put(rootWord, 1);
//		Map<String, Object> leaf = new ConcurrentHashMap<>();
//		Map<String, Object> subLeaf = new LinkedHashMap<>();
//		subLeaf.put("ACT ¾ª¶Ò¡ú ¢ò", new ConcurrentHashMap<String, Object>());
//		  subLeaf.put("D ËÀÀ¤¨J ¢ø", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("PV ¾°Àë¡ü ¢ó", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("UH ¶ÅÙã¨I ¢õ", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("OE éäÕð¡û ¢ô", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("IX ÉúôÞ¨L ¢÷", new ConcurrentHashMap<String, Object>());
//		 subLeaf.put("MS ÐÝ¿²¡ý ¢ö", new ConcurrentHashMap<String, Object>());
//		  subLeaf.put("Q ¿ªÇ¬¨K ¢ñ", new ConcurrentHashMap<String, Object>());
//		leaf.put(rootWord, subLeaf);
//		rootLeaf = subLeaf;
	}
	
	@SuppressWarnings("unused")
	private Map<String, Object> kernerForest(String temp, Map<String, Object> root, Map<String, Integer> findLeaf, int depth) { 
		Map<String, Object> leaf = new ConcurrentHashMap<String, Object>();
		if(++depth>6) {
			return leaf;
		}
		int ml=0;
		if(u.dic_li.containsKey(temp) || u.dic_yl.containsKey(temp) ||u.dic_zf.containsKey(temp)) {
			Map<String, WordFrequency> map = _A.parserMixStringByReturnFrequencyMap(
					(u.dic_li.get(temp) == null? "":u.dic_li.get(temp))+
					(u.dic_yl.get(temp) == null? "":u.dic_yl.get(temp).toString())+
					(u.dic_zf.get(temp) == null? "":u.dic_zf.get(temp).toString())
					);
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String tempRec = it.next();
				if(!findLeaf.containsKey(tempRec)) {
					findLeaf.put(tempRec, 1);
					frequencyLeaf.put(tempRec, 1);
					if(u.dic_map.containsKey(tempRec)) {
						Map<String, Object> subLeaf = kernerForest(tempRec, leaf, findLeaf, depth);
						leaf.put(tempRec, subLeaf);
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
		zrot+= (arg0.getX()+10)/90;
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
		trot += arg0.getWheelRotation()*2;
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