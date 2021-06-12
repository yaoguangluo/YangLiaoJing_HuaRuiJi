package IMO.EVU.biProcessor;
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
import OCI.ME.analysis.C.A;
import OSI.OPE.MSQ.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dnaSets.CMS;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life.Application;
import VSQ.OPE.jogl.JOGLOBJShape;

import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.GLBuffers;
import com.jogamp.opengl.util.gl2.GLUT;

import ME.APM.VSQ.App;

import javax.media.opengl.awt.GLCanvas;  
import javax.media.opengl.glu.GLU;
public class CoDNAAuthorForWord extends JPanel implements MouseMotionListener, MouseListener
, MouseWheelListener, KeyListener, GLEventListener { 
	public Boolean clicked = false;
	public int mousex = 0;
	public int mousey = 0;
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
	
	ByteBuffer buffer;
	int[][] g;
	JOGLOBJShape shape=null;
	public double t = 1.0d;
	public String rootWord;
	public CMS cms;  
	public CoDNAAuthorForWord(App u, A _A
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
		canvas.setBounds(0, 0, 1700, 700);
		Thread.sleep(100);
		this.add(canvas);
		animator = new FPSAnimator(canvas, 24, true);
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
		top = new DetaButton("上", 100, 50, Color.red);
		top.addActionListener( 
				new ActionListener()  {    
					public void actionPerformed(ActionEvent e){
						brot+=0.5;
					}
				});
		down = new DetaButton("下", 100, 50, Color.orange);
		down.addActionListener( 
				new ActionListener()  {    
					public void actionPerformed(ActionEvent e){
						brot-=0.5;
					}
				});
		left = new DetaButton("左", 100, 50, Color.pink);
		left.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						lrot-=0.5;
					}
				});
		right= new DetaButton("右", 100, 50, Color.green);
		right.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						lrot+=0.5;
					}
				});
		bhl= new DetaButton("染色体", 100, 50, Color.red);
		bhl.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						bootFlowerForest(rootWord,true);
					}
				});  
		cfc= new DetaButton("元基", 100, 50, Color.orange);
		cfc.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						bootClassificationMap(rootWord,true);
					}
				});  
		whh= new DetaButton("DNA", 200, 50, Color.magenta);
		whh.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						bootFlowerSea(rootWord,true);
					}
				}); 
		rst= new DetaButton("重置", 200, 50, Color.pink);
	//	rst.setBounds(0, 0, 100, 20);
		rst.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						xrot = 18.0f;  
						yrot = 2.0f;  
						zrot = 1.0f;  
						trot = 6.0f;  
						prot = 1.0f;  
						lrot = -3.5f; 
						brot = 1.0f; 
						irot = 78.0f; 
						srot = 0.7f;
					}
				}); 
		
		save = new DetaButton("保存", 200, 50, Color.green);
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
		
		load = new DetaButton("读取", 200, 50, Color.magenta);
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
		JButton xzb = new DetaButton("X坐标", 200, 50, Color.pink);
		buttonBoxX.add(xzb);
		buttonBoxX.add(sliderx);
		sliderBoxx1.add(buttonBoxX);
		
		Box buttonBoxY = new Box(BoxLayout.X_AXIS);  
		JButton yzb = new DetaButton("Y坐标", 200, 50, Color.pink);
		buttonBoxY.add(yzb);
		buttonBoxY.add(slidery);
		sliderBoxx1.add(buttonBoxY);
		
		Box buttonBoxZ = new Box(BoxLayout.X_AXIS);  
		JButton zzb = new DetaButton("Z坐标", 200, 50, Color.pink);
		buttonBoxZ.add(zzb);
		buttonBoxZ.add(sliderz);
		sliderBoxx2.add(buttonBoxZ);
		
		Box buttonBoxT = new Box(BoxLayout.X_AXIS);  
		JButton tzb = new DetaButton("T坐标", 200, 50, Color.pink);
		buttonBoxT.add(tzb);
		buttonBoxT.add(slidert);
		sliderBoxx2.add(buttonBoxT);
		
		
		sliderBox.add(sliderBoxx1);
		sliderBox.add(sliderBoxx2);
		sliderBox.add(buttonBox);
		sliderBox.setBounds(0, 750, 627, 300);
		add(sliderBox);
	}     
	protected void bootFlowerSea(String rootWord2, boolean b) {
		// TODO Auto-generated method stub
		
	}
	protected void bootClassificationMap(String rootWord2, boolean b) {
		// TODO Auto-generated method stub
		
	}
	protected void bootFlowerForest(String rootWord2, boolean b) {
		// TODO Auto-generated method stub
		
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
			
				Map<String, Object> leaf = (Map<String, Object>) root3.get(leafName);	
				if(leaf.size() > 0) {
					a1 =  1 ;
				}
				k++;
				//					findDup= true;
			
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
				if(se<2) {
//					gl.glVertex3d(root[0] + i * a
//							, root[1] + i * a
//							, root[2] + (srot * a1));
					gl.glEnd();
					gl.glColor3f(0, 255, 255);
					
					gl.glRasterPos3d(root[0] + i * a
								, root[1] + i * a
								, root[2] + (srot * a1));
				}else {
					gl.glVertex3d(root[0] + Math.cos(2 * Math.PI * i/ s[se]) * a
							, root[1] + Math.sin(2 * Math.PI * i/ s[se]) * a
							, root[2] + (srot * a1));
					gl.glEnd();
					gl.glColor3f(0, 0, 255);
					
					gl.glRasterPos3d(root[0] + Math.cos(2 * Math.PI * i / s[se]) * a
								, root[1] + Math.sin(2 * Math.PI * i / s[se]) * a
								, root[2] + (srot * a1));	
				}
				
				String prePrint= leafName;
				Font font= new Font(prePrint, 20, 20);
				checkImageBuf= GLBuffers.newDirectByteBuffer(20* prePrint.length()* 22* 3);
				BufferedImage image= new BufferedImage(prePrint.length()* 32, 20, BufferedImage.TYPE_INT_RGB);
				Graphics2D ga= image.createGraphics();
				ga.setColor(Color.white);
				int AMV_MVS_VSQX= 1;
				int AMV_MVS_VSQY= 17;
				this.weightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
				this.heightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);		

				//if(frequencyLeaf.containsKey(leafName)) {
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
				
				if(se< 2) {
					root1[0] = root[0] + i * a;
					root1[1] = root[1] + i * a;
					root1[2] = root[2] + (srot* a1);
				}else {
					root1[0] = root[0] + Math.cos(2 * Math.PI * i / s[se]) * a;
					root1[1] = root[1] + Math.sin(2 * Math.PI * i / s[se]) * a;
					root1[2] = root[2] + (srot* a1);
				}
				//j = i; 
				if(!leaf.isEmpty() && se< 1) {
					drawWords(s, se+1, root1, a * 1f, j+i, k, leaf, didLeaf);
				}else if(!leaf.isEmpty() && se< 2) {
					drawWords(s, se+1, root1, a * 0.7f, j+i, k, leaf, didLeaf);
				}else if(!leaf.isEmpty() && se >= 2) {
					drawWords(s, se+1, root1, a * 1.2f , j+i, k, leaf, didLeaf);
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
		Application application= new Application();
		application.init();
		CoDNAAuthorForWord app= new CoDNAAuthorForWord(null, null, null);   
		app.setSize(1700, 950);
		app.setVisible(true);
		JFrame f = new JFrame();
		f.add(app);
		f.setTitle("ButtonDemo");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1700,950);
		f.setVisible(true);
		app.bootDNAFlowerForest("DNA三维观测", application, true);
	}

	public void bootDNAFlowerForest(String string, Application application, boolean isButton) {
		// TODO Auto-generated method stub
		cms= application.cmss;
		zynk= 1;
		zybc= 1;
		if(rootWord==null) {
			return;
		}
		if(rootWord.equalsIgnoreCase(string) && isButton == false) {
			return;
		} 
		rootWord= string;
		rootLeaf.clear();
		findLeaf.clear();
		frequencyLeaf.clear();
		findLeaf.put(string, 1);
		frequencyLeaf.put(string, 1);
		Map<String, Object> leaf= new ConcurrentHashMap<String, Object>();
		int depth= 0;
		Map<String, Object> subLeaf= kernerDNAForest("DNA", leaf, findLeaf, depth);
		leaf.put(string, subLeaf);
		rootLeaf= leaf;
	}
	
	
	

	private Map<String, Object> kernerDNAForest(String string, Map<String, Object> root, Map<String, Integer> findLeaf,
			int depth) {
		Map<String, Object> leaf= new ConcurrentHashMap<String, Object>();
		// TODO Auto-generated method stub
		//chos
		Iterator<String> iteratorChos= cms.javaCMSsroot.keySet().iterator();//24
		while(iteratorChos.hasNext()) {
			String chos= iteratorChos.next();
			Map<String, Object> leafChosLeaf= new ConcurrentHashMap<String, Object>();
			Iterator<String> iteratorChosLeaf= cms.javaCMSsroot.get(chos).keySet().iterator();//24*3i
			while(iteratorChosLeaf.hasNext()) {
				String chosLeafs= iteratorChosLeaf.next();
				Map<String, Object> leafChos= new ConcurrentHashMap<String, Object>();//24
				Iterator<String> iteratorChosLeafPDNs= cms.javaCMSsroot.get(chos)
						.get(chosLeafs).keySet().iterator();
				while(iteratorChosLeafPDNs.hasNext()) {
					String chosLeaf= iteratorChosLeafPDNs.next();
					Map<String, Object> leafChosLeafs= new ConcurrentHashMap<String, Object>();
					Iterator<String> iteratorChosLeafPDN= cms.javaCMSsroot.get(chos)
							.get(chosLeafs).get(chosLeaf).javaPDNs.keySet().iterator();
					while(iteratorChosLeafPDN.hasNext()) {
						String chosLeafPDN= iteratorChosLeafPDN.next();
						Map<String, Object> leafChosLeafMap= new ConcurrentHashMap<String, Object>();
						Iterator<String> iteratorChosLeafPDNSet= cms.javaCMSsroot
								.get(chos).get(chosLeafs).get(chosLeaf).javaPDNs.get(chosLeafPDN).iterator();
						while(iteratorChosLeafPDNSet.hasNext()) {
							String chosLeafPDNSet= iteratorChosLeafPDNSet.next();
							leafChosLeafMap.put(chosLeafPDNSet, new ConcurrentHashMap<>());//java name
						}
						leafChosLeafs.put(chosLeafPDN, leafChosLeafMap);//initons name
					}
					leafChos.put(chosLeaf, leafChosLeafs);//chos name
				
				}
				leafChosLeaf.put(chosLeafs, leafChos);//initons name

			}
			leaf.put(chos, leafChosLeaf);// rootlink
		}
		
		//findLeaf
		//frequencyLeaf
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