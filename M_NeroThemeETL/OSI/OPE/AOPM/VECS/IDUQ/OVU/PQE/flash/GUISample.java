package OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash;
import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import ME.APM.VSQ.App;
import ME.APM.VSQ.DetaBuy;
import MVQ.button.DetaButton;
import MVQ.filenameFilter.TXTFilter;
import OCI.ME.analysis.C.A;
import OSI.OPE.MSI.OEI.SOI.SMQ.save.SaveAnd_U_File;
import OSI.OPE.MSI.OEI.SOI.SMQ.save.SaveAs_I_File;
import OSI.OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OSI.OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import OSI.OPE.MSQ.SS.stable.StableData;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.LoadFile;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.NodeOSGI;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.CacuString;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.Sort;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.U_RelatedLineVPS;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
@SuppressWarnings("deprecation")
public class GUISample extends JApplet implements MouseMotionListener
, MouseListener, ItemListener, ActionListener, Runnable{	
	private static final long serialVersionUID= 5270675501794340912L;
	public GUISample() {
		getContentPane().setBackground(new Color(255,255,255));
	}
	public Map<String, Object> nodeReflection= new HashMap<>();
	public String fileCurrentpath;
	public int w, h;
	public int flash= 0;
	public int count= 0;
	public String currentNodeName;
	public int currentNodeID;
	public String currentNodePrimaryKey;
	public LinkList first;
	public int currentx, currenty;
	public int choose= 0;
	public int oldx, oldy;
	public int newx, newy;
	public int isOperation= 0;
	public String treeNodeName;
	public NodeShow nodeView;
	public NodeProject nodeProject;
	public NodeInfo nodeInfo;
	public UnicornJSplitPane mainSplitPane;
	public UnicornJSplitPane leftSplitPane;
	public UnicornJSplitPane rightSplitPane;
	public UnicornJSplitPane righttopSplitPane;
	public JScrollPane righttopScrollPane;
	public JScrollPane rightdownScrollPane;
	public JScrollPane rightrightScrollPane;
	public JTextPane rightBotJTextPane;
	public ThisCanvas canvas;
	public PopupMenu popupMenu, nodeMenu, itemMenu, engineMenu;
	public MenuItem save, saveAs, delete, load, boot, bootETL, osgis;
	public MenuItem menuItem;
	public MenuItem configre, run, show, dNode, dLine;
	public Thread thread, threadApplet; 
	private JTextPane text;
	private Object[][] tableData_old; 
	public U_RelatedLineVPS updateRelatedLine;
	public App u;
	public A _A;
	public Map<String, String> pos;
	public void run() {
		try {
			Thread.sleep(100);
			nodeProject.setBounds(0, 0, leftSplitPane.getWidth()
					, leftSplitPane.getDividerLocation());
			Thread.sleep(1000);
			nodeProject.validate();
			while(true){   
				try{
					Thread.sleep(5000);
					this.validate();
				}catch (InterruptedException e) {}
				this.validate();
			}  
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	public void start(){
		if(thread== null){
			thread=  new Thread(this);
			thread.start();
		}
	}

	public void stop() {
	}

	public void Registrar() {
		load.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings({StableData.TAG_STATIC_ACCESS})
			public void actionPerformed(ActionEvent e) {
				try {
					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_LOAD_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_LOAD_ENSURE);
					if(0!= confirm) {
						rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
						rightBotJTextPane.validate();
						return;
					}
					FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_HISTORY
							, FileDialog.LOAD);
					filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					fileCurrentpath= filedialog.getDirectory()+ filedialog.getFile();
					System.out.println(fileCurrentpath);
					if(null== fileCurrentpath|| fileCurrentpath.isEmpty()|| !fileCurrentpath.contains
							(StableData.FILE_FORMAT_ETL)) {
						System.out.println(StableData.ATTENSION_RECHOICE);
						return;
					}
					File file= new File(fileCurrentpath);
					if(!file.isFile()) {
						System.out.println(StableData.ATTENSION_RECHOICE);
						return;
					}
					LinkNode needDeleteNode= first.first;
					while(needDeleteNode!= null) {
						first.first= first.deletNode(first.first, needDeleteNode.name, needDeleteNode.ID
								, needDeleteNode.primaryKey);
						if(null== needDeleteNode.next) {
							break;
						}
						needDeleteNode= needDeleteNode.next;
					}
					canvas.repaint();	
					first.first= LoadFile.Load(first.first, nodeView, file, first);
				}catch(Exception loadE) {
					loadE.printStackTrace();
				}
				canvas.repaint();	
				righttopScrollPane.validate();
			}
		});
		save.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings({StableData.TAG_STATIC_ACCESS})
			public void actionPerformed(ActionEvent e) {
				if(null== fileCurrentpath) {
					System.out.println(StableData.ATTENSION_UNCURRENT_CHOICE);
					return;
				}
				javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_UPDATE_ENSURE
						+ fileCurrentpath + StableData.MARK_QUESTION);
				int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_UPDATE_ENSURE
						+ fileCurrentpath + StableData.MARK_QUESTION);
				if(0!= confirm) {
					rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
					rightBotJTextPane.validate();
					return;
				}
				SaveAnd_U_File.update(fileCurrentpath, first.first);
			}
		});
		
		saveAs.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveAs_I_File.Save(first.first);
			}
		});
		
		osgis.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings({ "static-access" })
			public void actionPerformed(ActionEvent e) {
				String jarCategoryLink= "";	
				FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_HISTORY
						, FileDialog.LOAD);
				filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
				filedialog.setVisible(true);
				jarCategoryLink= filedialog.getDirectory();
				//System.out.println(jarCategoryLink);
				if(null== jarCategoryLink|| jarCategoryLink.isEmpty()|| jarCategoryLink.contains
						(StableData.FILE_FORMAT_JAR)) {
					System.out.println(StableData.ATTENSION_RECHOICE);
					return;
				}
				File file= new File(jarCategoryLink);
				if(file.isFile()) {
					System.out.println(StableData.ATTENSION_FILE_CHOICE);
					return;
				}
				File[] files= file.listFiles();
				Here:
					for(int i= 0; i< files.length; i++) {
						rightBotJTextPane.validate();
						getContentPane().validate();	
						URLClassLoader loader= null;
						try {
							loader= new URLClassLoader(new URL[]{ files[i].toURL() });
						} catch (MalformedURLException e2) {
							e2.printStackTrace();
						}  
						String filename= files[i].getName().replace(StableData.FILE_FORMAT_JAR, StableData.STRING_EMPTY);
						if(!filename.contains("OSI.OSU.")) {
							continue Here;
						}
						//如下注释2行代码 refer https://www.cnblogs.com/chinaxin/p/3678442.html 这小伙子以后有前途。哈哈
						//Class<?> myclass = loader.loadClass("hand.java.loadjar.TestClass");
						//Gene new object
						//Object myobject = myclass.newInstance();   
						Class<?> myclass= null;
					
						//因为按照标准格式函数命名, 因此做了首字母的大写变换, 准备调试下.罗瑶光
						String[] filenameSplit= filename.split("\\.");
						String lastName= filenameSplit[filenameSplit.length- 1];
						String FirstCharOfLastName= (""+ lastName.charAt(0)).toUpperCase();
						String NewlastName= FirstCharOfLastName+ lastName.subSequence(1, lastName.length());	
						System.out.println(filename);
						
						//   数组                                                      尾组                                                                          首字母                    大写
						//filename= (""+ filename.split("\\.")[filename.split("\\.").length- 1].charAt(0)).toUpperCase();			
						//System.out.println(filename.replace(filename.split(".").length, newChar)filename.split(".").length);
						try {
							String className= filename+ "."+ NewlastName
									+ StableData.NODE_NODE_INTERFACE;
							System.out.println(className);
							myclass= loader.loadClass(className);
						} catch (ClassNotFoundException e1) {
//							//增加小写识别一次，兼容老的插件。
//							//之后我会统一进行修改 
//							//罗瑶光20210514
//							FirstCharOfLastName= (""+ lastName.charAt(0));
//							NewlastName= FirstCharOfLastName+ lastName.subSequence(1, lastName.length());	
//							System.out.println(filename);
//							String className= filename+ "."+ NewlastName
//									+ StableData.NODE_NODE_INTERFACE;
//							System.out.println(className);
//							try {
//								myclass= loader.loadClass(className);
//							} catch (ClassNotFoundException e2) {
//								// TODO Auto-generated catch block
//								e2.printStackTrace();
//							}
							e1.printStackTrace();
						}
						Object myobject= null;
						try {
							myobject= myclass.newInstance();
						}
						catch (InstantiationException e1) {
							e1.printStackTrace();
						} 
						catch (IllegalAccessException e1) {
							e1.printStackTrace();
						}

						//我准备之后设计成病毒式热插拔，因为绕过虚拟机的思想涉及情报学特工和计算机病毒领域
						//，害怕国家相关安全体系管控，暂时不研发。
						OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
						= (OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) myobject;
						if(nodeReflection.containsKey(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
							rightBotJTextPane.setText("请勿重复添加，节点已存在"+ System.currentTimeMillis());
							continue Here;
							//return;
						}
						nodeReflection.put(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, null);
						OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.register(tableData_old, text, u, _A, pos);
						try {
							//search register need add the information
							if(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("添加")
									&& OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("页")) {
								u.searchList.add(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI); //memory increment
							}
							//searchList
							//
							OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.IMP_PSU();
							rightBotJTextPane.setText("节点:"
									+ OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
									+ "已经更新成功"+ System.currentTimeMillis()
									+ "\r\n"+ rightBotJTextPane.getText());
							rightBotJTextPane.validate();
							thread.sleep(100);
						} catch (IOException e1) {
							e1.printStackTrace();
						} catch (InterruptedException e2) {
							e2.printStackTrace();
						}
						nodeView.first= nodeView.link.addNode(nodeView.first
								, OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI);
					}	
				nodeView.updateTree();
				getContentPane().validate();	
			}
		});
		
		boot.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BootNeroCell.bootCell(first.first, rightBotJTextPane, canvas);
					rightBotJTextPane.setText(StableData.NODE_EXEC_SUCCESS);
					rightBotJTextPane.validate();
				} catch (IOException e1) {
					rightBotJTextPane.setText(e1.getStackTrace().toString());
					rightBotJTextPane.validate();
				} catch (UnsupportedAudioFileException | InterruptedException e1) {
					rightBotJTextPane.setText(e1.getStackTrace().toString());
					rightBotJTextPane.validate();
				}
			}
		});
		bootETL.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings(StableData.TAG_STATIC_ACCESS)
			public void actionPerformed(ActionEvent e) {
				try {
					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_LOAD_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_LOAD_ENSURE);
					if(0!= confirm) {
						rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
						rightBotJTextPane.validate();
						return;
					}
					FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_HISTORY
							, FileDialog.LOAD);
					filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					fileCurrentpath= filedialog.getDirectory()+ filedialog.getFile();
					System.out.println(fileCurrentpath);
					if(null== fileCurrentpath|| fileCurrentpath.isEmpty()|| !fileCurrentpath.contains
							(StableData.FILE_FORMAT_ETL)) {
						System.out.println(StableData.ATTENSION_RECHOICE);
						return;
					}
					File file= new File(fileCurrentpath);
					if(!file.isFile()) {
						System.out.println(StableData.ATTENSION_RECHOICE);
						return;
					}
					LinkNode needDeleteNode= first.first;
					while(needDeleteNode!= null) {
						first.first= first.deletNode(first.first, needDeleteNode.name, needDeleteNode.ID
								, needDeleteNode.primaryKey);
						if(null== needDeleteNode.next) {
							break;
						}
						needDeleteNode= needDeleteNode.next;
					}
					canvas.repaint();	
					first.first= LoadFile.Load(first.first, nodeView, file, first);
				}catch(Exception loadE) {
					loadE.printStackTrace();
				}
				canvas.repaint();	
				righttopScrollPane.validate();	
				try {
					BootNeroCell.bootCell(first.first, rightBotJTextPane, canvas);
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (UnsupportedAudioFileException | InterruptedException e1) {
					e1.printStackTrace();
				}
				rightBotJTextPane.setText(StableData.NODE_EXEC_SUCCESS);
				rightBotJTextPane.validate();
			}
		});
		//delete
		delete.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings(StableData.TAG_STATIC_ACCESS)
			public void actionPerformed(ActionEvent e) {
				try {
					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_CANCEL_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_CANCEL_ENSURE);
					if(0!= confirm) {
						rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
						rightBotJTextPane.validate();
						return;
					}
					LinkNode node= first.first;
					while(node!= null) {
						first.first= first.deletNode(first.first, node.name, node.ID, node.primaryKey);
						if(null== node.next) {
							break;
						}
						node= node.next;
					}
					node= node.next;
					canvas.repaint();			
				}catch(Exception E) {
					canvas.repaint();
				}
				rightBotJTextPane.setText(StableData.ATTENSION_DELETE);
				rightBotJTextPane.validate();
			}	
		});
		leftSplitPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {  
			public void propertyChange(java.beans.PropertyChangeEvent evt) {  
				if (evt.getPropertyName().equals(JSplitPane.DIVIDER_LOCATION_PROPERTY)) {  
					//action code 
					nodeProject.width=leftSplitPane.getWidth();
					nodeProject.height=leftSplitPane.getDividerLocation();
					nodeProject.setBounds(0, 0,leftSplitPane.getWidth(),leftSplitPane
							.getDividerLocation());
					nodeProject.validate();

				}  
			}  
		});  
		mainSplitPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {  
			public void propertyChange(java.beans.PropertyChangeEvent evt) {  
				if (evt.getPropertyName().equals(JSplitPane.DIVIDER_LOCATION_PROPERTY)) {  
					//action code 
					nodeProject.width=mainSplitPane.getDividerLocation();
					nodeProject.height=leftSplitPane.getDividerLocation();
					nodeProject.setBounds(0, 0,mainSplitPane.getDividerLocation()
							, leftSplitPane.getDividerLocation());
					nodeProject.validate();
				}  
			}  
		});  

		righttopScrollPane.addComponentListener(new ComponentListener(){
			public void componentHidden(ComponentEvent arg0) {}
			public void componentMoved(ComponentEvent arg0) {}
			public void componentResized(ComponentEvent arg0) {
				righttopScrollPane.validate();
			}
			public void componentShown(ComponentEvent arg0) {}
		});

		getContentPane().addComponentListener(new ComponentListener(){
			public void componentHidden(ComponentEvent arg0) {}
			public void componentMoved(ComponentEvent arg0) {}
			public void componentResized(ComponentEvent arg0) {
				w= getContentPane().getWidth();
				h= getContentPane().getHeight();
				mainSplitPane.setBounds(10, 50, w- 20, h- 80);
				mainSplitPane.setDividerLocation(0.11);
				leftSplitPane.setDividerLocation(0.25);
				rightSplitPane.setDividerLocation(0.85);
				righttopSplitPane.setDividerLocation(0.9);
				
				nodeProject.width= mainSplitPane.getDividerLocation();
				nodeProject.height= leftSplitPane.getDividerLocation();
				nodeProject.setBounds(0, 0, mainSplitPane.getDividerLocation()
						, leftSplitPane.getDividerLocation());
				nodeProject.validate();
				mainSplitPane.validate();
				System.out.println(w + "<>" + h);
			}

			public void componentShown(ComponentEvent arg0) {
			}	
		});	
		addMouseListener(this);
		addMouseMotionListener(this);
		nodeProject.addMouseListener(this);
		nodeView.addMouseListener(this);
		nodeView.tree.addMouseListener(this);
		nodeView.tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent evt) {
				DefaultMutableTreeNode note= (DefaultMutableTreeNode) nodeView.tree.getLastSelectedPathComponent();
				String tr= null;
				if(note!= null){
					tr= new CacuString().cauString(note.toString());       
				}
				if(tr!=null){
					treeNodeName= new String(tr);
					rightBotJTextPane.setText("节点名："+ treeNodeName);
					rightBotJTextPane.validate();
				}
			}
		});
		menuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(treeNodeName!=null){
					try {
						first.first= first.addNode(first.first, treeNodeName, 100, 50, nodeView.first);
						righttopScrollPane.validate();
					} catch (CloneNotSupportedException e1) {
						rightBotJTextPane.setText(StableData.NODE_ADD_ERROR);
						rightBotJTextPane.validate();
					} catch (InstantiationException e1) {
						rightBotJTextPane.setText(StableData.NODE_ADD_ERROR);
						rightBotJTextPane.validate();
					} catch (IllegalAccessException e1) {
						rightBotJTextPane.setText(StableData.NODE_ADD_ERROR);
						rightBotJTextPane.validate();
					} catch (IOException e1) {
						rightBotJTextPane.setText(StableData.NODE_ADD_ERROR);
						rightBotJTextPane.validate();
					}
					rightBotJTextPane.setText("节点名："+ "treeNodeName");
					rightBotJTextPane.validate();
				}
			}
		});  
		configre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node= new LinkNode();
				first.first= Sort.sort(first.first);
				node= first.first;
				while(node!= null){
					if(node.name.equals(canvas.currentNodeName)&&node.ID== canvas.currentNodeID
							&& node.primaryKey.equals(canvas.currentNodePrimaryKey)){
						try {
							node.thisFace.MEI_MSU(rightBotJTextPane, canvas);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setLocation(node.x, node.y);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setSize(300, 300);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setResizable(true);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.scrollPane.setBounds(0, 0
									, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getWidth()- 10
									, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getHeight()- 45);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.panel.setPreferredSize(new Dimension(800, 600));
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setBackground(Color.BLUE);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setVisible(true);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.validate();
							new OSI.OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer(node, first.first);
						} catch (IOException e1){
							rightBotJTextPane.setText(StableData.NODE_UPDATE_ERROR);
							rightBotJTextPane.validate();
						} 
					}
					node= node.next;
				}	
				rightBotJTextPane.setText(StableData.NODE_UPDATE_SUCCESS);
				rightBotJTextPane.validate();
			}
		}); 
		run.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node= new LinkNode();
				first.first= Sort.sort(first.first);
				node= first.first;
				while(node!= null){
					if(node.name.equals(canvas.currentNodeName)&&node.ID == canvas.currentNodeID
							&& node.primaryKey.equals(canvas.currentNodePrimaryKey)){
						try {
							node.thisFace.OPE_E(rightBotJTextPane);
						} catch (FileNotFoundException e1) {
							rightBotJTextPane.setText(StableData.NODE_EXEC_ERROR);
							rightBotJTextPane.validate();
						} catch (IOException e1) {
							rightBotJTextPane.setText(StableData.NODE_EXEC_ERROR);
							rightBotJTextPane.validate();
						} catch (UnsupportedAudioFileException e2) {
							rightBotJTextPane.setText(StableData.NODE_EXEC_ERROR);
							rightBotJTextPane.validate();
						} catch (InterruptedException e3) {
							rightBotJTextPane.setText(StableData.NODE_EXEC_ERROR);
							rightBotJTextPane.validate();
						}
					}
					node= node.next;
				}	
				rightBotJTextPane.setText(StableData.NODE_EXEC_SUCCESS);
				rightBotJTextPane.validate();
			}
		}); 
		show.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node= new LinkNode();
				first.first= Sort.sort(first.first);
				node= first.first;
				while(node!= null){
					if(node.name.equals(canvas.currentNodeName)&&node.ID== canvas.currentNodeID
							&& node.primaryKey.equals(canvas.currentNodePrimaryKey)){
						if(!node.thisFace.showed){
							try {
								node.thisFace.AVQ_ASQ_OVQ_OSQ_VSQ(rightBotJTextPane);
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setLocation(node.x, node.y);
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setSize(500, 500);
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setResizable(true);
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.scrollPane.setBounds(0, 0
										, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getWidth()- 10
										, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getHeight()- 45);
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.panel.setPreferredSize(new Dimension(800, 600));
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setVisible(true);
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.validate();
							} catch (Exception e1) {
								//e1.printStackTrace();
								rightBotJTextPane.setText(StableData.NODE_INSPECT_ERROR);
								rightBotJTextPane.validate();
							}  
						}else{
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setVisible(true);  
						}
					}
					node=node.next;
				}	
				rightBotJTextPane.setText(StableData.NODE_INDICATE_SUCCESS);
				rightBotJTextPane.validate();
			}
		}); 
		dNode.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node= new LinkNode();
				first.first= Sort.sort(first.first);
				node=first.first;
				while(node!= null){
					if(node.name.equals(canvas.currentNodeName)&&node.ID== canvas.currentNodeID
							&& node.primaryKey.equalsIgnoreCase(canvas.currentNodePrimaryKey)){
						first.first= first.deletNode(first.first, node.name, node.ID, node.primaryKey);
						updateRelatedLine.doUpdateRelatedLine(first.first, canvas.currentNodeName, canvas.currentNodeID
								, canvas.currentNodePrimaryKey);
					}
					node= node.next;
				}	
				canvas.repaint();
			}
		}); 
		dLine.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node=new LinkNode();
				first.first= Sort.sort(first.first);
				node=first.first;
				while(node!=null){
					if(node.beconnect&&node.name.equals(canvas.currentNodeName)&& node.ID==canvas.currentNodeID
							&& node.primaryKey.equals(canvas.currentNodePrimaryKey)){
						node.beconnect=false;
						node.tBeconnect=false;
						node.mBeconnect=false;
						node.dBeconnect=false;
					}
					node= node.next;
				}
				canvas.repaint();
			}
		}); 
	}	

	public void init(){
		try {
			CreatMap();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Registrar();
		this.resize(w,h);	
	}

	public void init(Object[][] tableData_old,JTextPane text, App u
			, A _A, Map<String, String> pos){
		try {
			this.text= text;
			this.tableData_old= tableData_old;
			this.u= u;
			this._A= _A;
			this.pos= pos;
			CreatMap();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Registrar();
		this.resize(w,h);	
	}

	
	private void CreatMap() throws IOException {
		w= 1446- 130;
		h= 820- 110-70;
		updateRelatedLine= new U_RelatedLineVPS();
		getContentPane().setLayout(null);
		UIManager.put("SplitPaneUI", "OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornSplitPaneUI");
		UIManager.put("ScrollBarUI", "OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI");
		UIManager.put("TreeUI", "OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeUI");
		currentNodeName= new String("");
		first= new LinkList();
		
		popupMenu= new PopupMenu();
		menuItem= new MenuItem();
		menuItem.setLabel("add");
		popupMenu.add(menuItem);
		
		nodeInfo= new NodeInfo();
		nodeView= new NodeShow(this, this.tableData_old, this.text, popupMenu, this.u, this._A, this.pos);
		nodeView.tree.setBackground(Color.white);
		nodeView.setBounds(10, 168, 137, 222);
		nodeProject= new NodeProject();
		nodeProject.setBounds(10, 38, 137, 124);	
		mainSplitPane = new UnicornJSplitPane();
		mainSplitPane.setAutoscrolls(true);
		//mainSplitPane.setEnabled(false);//
		mainSplitPane.setBounds(10, 50, w-20, h-80);
		mainSplitPane.setVisible(true);
		getContentPane().add(mainSplitPane);
		leftSplitPane= new UnicornJSplitPane();
		leftSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		mainSplitPane.setLeftComponent(leftSplitPane);
		leftSplitPane.setLeftComponent(nodeProject);
		leftSplitPane.setRightComponent(nodeView);
		rightSplitPane= new UnicornJSplitPane();
		rightSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		mainSplitPane.setRightComponent(rightSplitPane);
		righttopSplitPane= new UnicornJSplitPane();
		rightSplitPane.setLeftComponent(righttopSplitPane);
		rightBotJTextPane= new JTextPane();
		rightBotJTextPane.setText("你好，亲~");
		nodeMenu= new PopupMenu();
		canvas= new ThisCanvas(threadApplet, first, nodeView, nodeMenu, rightBotJTextPane);
		canvas.setPreferredSize(new Dimension(1500,1000));
		canvas.setEnabled(true);
		righttopScrollPane= new JScrollPane();
		righttopScrollPane.setViewportView(canvas);
		righttopSplitPane.setLeftComponent(righttopScrollPane);
		rightrightScrollPane= new JScrollPane();
		righttopSplitPane.setRightComponent(nodeInfo);
		rightdownScrollPane= new JScrollPane(rightBotJTextPane);
		rightSplitPane.setRightComponent(rightdownScrollPane);
		
		configre= new MenuItem();
		configre.setLabel("配置");
		run= new MenuItem();
		run.setLabel("运行");
		show= new MenuItem();
		show.setLabel("显示");
		dNode= new MenuItem();
		dNode.setLabel("删除该节");
		dLine= new MenuItem();
		dLine.setLabel("删除链接");
		nodeMenu.add(configre);
		nodeMenu.add(run);
		nodeMenu.add(show);
		nodeMenu.add(dNode);
		nodeMenu.add(dLine);  
		getContentPane().add(popupMenu);
		getContentPane().add(nodeMenu);
		engineMenu= new PopupMenu();
		load= new MenuItem();
		load.setLabel(StableData.CONFIG_LOAD);
		save= new MenuItem();
		save.setLabel(StableData.CONFIG_UPDATE);
		saveAs= new MenuItem();
		saveAs.setLabel(StableData.CONFIG_SAVE);
		delete= new MenuItem();
		delete.setLabel(StableData.CONFIG_DELETE);
		boot= new MenuItem();
		boot.setLabel(StableData.CONFIG_BOOT);
		bootETL= new MenuItem();
		bootETL.setLabel(StableData.CONFIG_BOOT_ETL);
		osgis= new MenuItem();
		osgis.setLabel(StableData.CONFIG_OSGIS);
		
		engineMenu.add(load);
		engineMenu.add(save);
		engineMenu.add(saveAs);
		engineMenu.add(delete);
		engineMenu.add(boot);
		engineMenu.add(bootETL);
		engineMenu.add(osgis);
	
		getContentPane().add(engineMenu);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);  
		DetaButton loadButton= new DetaButton("导入文档");
		loadButton.setBounds(5+105+105+105+105, 3, 100, 20);
		loadButton.addActionListener(new ActionListener(){
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_LOAD_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_LOAD_ENSURE);
					if(0!= confirm) {
						rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
						rightBotJTextPane.validate();
						return;
					}
					FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_HISTORY
							, FileDialog.LOAD);
					filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					fileCurrentpath= filedialog.getDirectory()+ filedialog.getFile();
					System.out.println(fileCurrentpath);
					if(null== fileCurrentpath|| fileCurrentpath.isEmpty()|| !fileCurrentpath.contains
							(StableData.FILE_FORMAT_ETL)) {
						System.out.println(StableData.ATTENSION_RECHOICE);
						return;
					}
					File file= new File(fileCurrentpath);
					if(!file.isFile()) {
						System.out.println(StableData.ATTENSION_RECHOICE);
						return;
					}
					LinkNode needDeleteNode= first.first;
					while(needDeleteNode!= null) {
						first.first= first.deletNode(first.first, needDeleteNode.name, needDeleteNode.ID
								, needDeleteNode.primaryKey);
						if(null== needDeleteNode.next) {
							break;
						}
						needDeleteNode= needDeleteNode.next;
					}
					canvas.repaint();	
					first.first= LoadFile.Load(first.first, nodeView, file, first);
				}catch(Exception loadE) {
					loadE.printStackTrace();
				}
				canvas.repaint();	
				righttopScrollPane.validate();
			}
		});
		buttonBox.add(loadButton);
		//
		DetaButton saveButton= new DetaButton("保存文档");
		saveButton.setBounds(5+105+105+105+105, 3, 100, 20);
		saveButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SaveAs_I_File.Save(first.first);
			}
		});
		buttonBox.add(saveButton);
		//
		DetaButton runButton= new DetaButton("更新执行");
		runButton.setBounds(5+105+105+105+105, 3, 100, 20);
		runButton.addActionListener(new ActionListener(){
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_LOAD_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_LOAD_ENSURE);
					if(0!= confirm) {
						rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
						rightBotJTextPane.validate();
						return;
					}
					FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_HISTORY
							, FileDialog.LOAD);
					filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					fileCurrentpath= filedialog.getDirectory()+ filedialog.getFile();
					System.out.println(fileCurrentpath);
					if(null== fileCurrentpath|| fileCurrentpath.isEmpty()|| !fileCurrentpath.contains
							(StableData.FILE_FORMAT_ETL)) {
						System.out.println(StableData.ATTENSION_RECHOICE);
						return;
					}
					File file= new File(fileCurrentpath);
					if(!file.isFile()) {
						System.out.println(StableData.ATTENSION_RECHOICE);
						return;
					}
					LinkNode needDeleteNode= first.first;
					while(needDeleteNode!= null) {
						first.first= first.deletNode(first.first, needDeleteNode.name, needDeleteNode.ID
								, needDeleteNode.primaryKey);
						if(null== needDeleteNode.next) {
							break;
						}
						needDeleteNode= needDeleteNode.next;
					}
					canvas.repaint();	
					first.first= LoadFile.Load(first.first, nodeView, file, first);
				}catch(Exception loadE) {
					loadE.printStackTrace();
				}
				canvas.repaint();	
				righttopScrollPane.validate();	
				try {
					BootNeroCell.bootCell(first.first, rightBotJTextPane, canvas);
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (UnsupportedAudioFileException | InterruptedException e1) {
					e1.printStackTrace();
				}
				rightBotJTextPane.setText(StableData.NODE_EXEC_SUCCESS);
				rightBotJTextPane.validate();
			}
		});
		buttonBox.add(runButton);
		//
		DetaButton updateButton= new DetaButton("更新文档");
		updateButton.setBounds(5+105+105+105+105, 3, 100, 20);
		updateButton.addActionListener(new ActionListener(){
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(null== fileCurrentpath) {
					System.out.println(StableData.ATTENSION_UNCURRENT_CHOICE);
					return;
				}
				javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_UPDATE_ENSURE
						+ fileCurrentpath + StableData.MARK_QUESTION);
				int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_UPDATE_ENSURE
						+ fileCurrentpath + StableData.MARK_QUESTION);
				if(0!= confirm) {
					rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
					rightBotJTextPane.validate();
					return;
				}
				SaveAnd_U_File.update(fileCurrentpath, first.first);
			}
		});
		buttonBox.add(updateButton);
		//
		DetaButton deleteButton= new DetaButton("删除文档");
		deleteButton.setBounds(5+105+105+105+105, 3, 100, 20);
		deleteButton.addActionListener(new ActionListener(){
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_CANCEL_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_CANCEL_ENSURE);
					if(0!= confirm) {
						rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
						rightBotJTextPane.validate();
						return;
					}
					LinkNode node= first.first;
					while(node!= null) {
						first.first= first.deletNode(first.first, node.name, node.ID, node.primaryKey);
						if(null== node.next) {
							break;
						}
						node= node.next;
					}
					node= node.next;
					canvas.repaint();			
				}catch(Exception E) {
					canvas.repaint();
				}
				rightBotJTextPane.setText(StableData.ATTENSION_DELETE);
				rightBotJTextPane.validate();
			}
		});
		buttonBox.add(deleteButton);
		//
		DetaButton addButton= new DetaButton("添加插件");
		addButton.setBounds(5+105+105+105+105, 3, 100, 20);
		addButton.addActionListener(new ActionListener(){
			@SuppressWarnings({ "static-access" })
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String jarCategoryLink= "";	
				FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_HISTORY
						, FileDialog.LOAD);
				filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
				filedialog.setVisible(true);
				jarCategoryLink= filedialog.getDirectory();
				//System.out.println(jarCategoryLink);
				if(null== jarCategoryLink|| jarCategoryLink.isEmpty()|| jarCategoryLink.contains
						(StableData.FILE_FORMAT_JAR)) {
					System.out.println(StableData.ATTENSION_RECHOICE);
					return;
				}
				File file= new File(jarCategoryLink);
				if(file.isFile()) {
					System.out.println(StableData.ATTENSION_FILE_CHOICE);
					return;
				}
				File[] files= file.listFiles();
				Here:
				for(int i= 0; i< files.length; i++) {
					rightBotJTextPane.validate();
					getContentPane().validate();	
					URLClassLoader loader = null;
					try {
						loader = new URLClassLoader(new URL[]{ files[i].toURL() });
					} catch (MalformedURLException e2) {
						e2.printStackTrace();
					}  
					String filename= files[i].getName().replace(StableData.FILE_FORMAT_JAR, StableData.STRING_EMPTY);
					if(!filename.contains("OSI.OSU.")) {
						continue Here;
					}
					/* 源头: 见JDK 官方文档 的classloader 描述 
					//如下注释2行代码 refer https://www.cnblogs.com/chinaxin/p/3678442.html 这小伙子以后有前途。哈哈
					//Class<?> myclass = loader.loadClass("hand.java.loadjar.TestClass");
					//Gene new object
					//Object myobject = myclass.newInstance();   
					*/
					
					//因为按照标准格式函数命名, 因此做了首字母的大写变换, 准备调试下.罗瑶光
					String[] filenameSplit= filename.split("\\.");
					String lastName= filenameSplit[filenameSplit.length- 1];
					String FirstCharOfLastName= (""+ lastName.charAt(0)).toUpperCase();
					String NewlastName= FirstCharOfLastName+ lastName.subSequence(1, lastName.length());	
					System.out.println(filename);
					
					Class<?> myclass = null;
					//   数组                                                      尾组                                                                          首字母                    大写
					//filename= (""+ filename.split("\\.")[filename.split("\\.").length- 1].charAt(0)).toUpperCase();			
					//System.out.println(filename.replace(filename.split(".").length, newChar)filename.split(".").length);
					try {
						String className= filename+ "."+ NewlastName
								+ StableData.NODE_NODE_INTERFACE;
						System.out.println(className);
						myclass= loader.loadClass(className);
					} catch (ClassNotFoundException e1) {
//						//增加小写识别一次，兼容老的插件。
//						FirstCharOfLastName= (""+ lastName.charAt(0));
//						NewlastName= FirstCharOfLastName+ lastName.subSequence(1, lastName.length());	
//						System.out.println(filename);
//						String className= filename+ "."+ NewlastName
//								+ StableData.NODE_NODE_INTERFACE;
//						System.out.println(className);
//						try {
//							myclass= loader.loadClass(className);
//						} catch (ClassNotFoundException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
						e1.printStackTrace();
					}
					Object myobject= null;
				try {
						myobject= myclass.newInstance();
					}
					catch (InstantiationException e1) {
						e1.printStackTrace();
					} 
					catch (IllegalAccessException e1) {
						e1.printStackTrace();
					}
				
					//我准备之后设计成病毒式热插拔，因为绕过虚拟机的思想涉及情报学特工和计算机病毒领域
					//，害怕国家相关安全体系管控，暂时不研发。
				    OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
				    = (OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) myobject;
				    if(nodeReflection.containsKey(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
						rightBotJTextPane.setText("请勿重复添加，节点已存在"+ System.currentTimeMillis());
						continue Here;
						//return;
					}
					nodeReflection.put(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, null);
				    OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.register(tableData_old, text, u, _A, pos);
				  
				    try {
				    	if(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("添加")
								&& OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("页")) {
							u.searchList.add(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI); //memory increment
						}
						OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.IMP_PSU();
						rightBotJTextPane.setText("节点:"
						+ OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
						+ "已经更新成功"+ System.currentTimeMillis()
						+ "\r\n"+ rightBotJTextPane.getText());
						rightBotJTextPane.validate();
						thread.sleep(100);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					nodeView.first= nodeView.link.addNode(nodeView.first
							, OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI);
				}	
				nodeView.updateTree();
				getContentPane().validate();	
			}
		});
		buttonBox.add(addButton);
		//
		DetaButton execButton= new DetaButton("一键执行");
		execButton.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					BootNeroCell.bootCell(first.first, rightBotJTextPane, canvas);
					rightBotJTextPane.setText(StableData.NODE_EXEC_SUCCESS);
					rightBotJTextPane.validate();
				} catch (IOException e1) {
					rightBotJTextPane.setText(e1.getStackTrace().toString());
					rightBotJTextPane.validate();
				} catch (UnsupportedAudioFileException | InterruptedException e1) {
					rightBotJTextPane.setText(e1.getStackTrace().toString());
					rightBotJTextPane.validate();
				}
			}
		});
		buttonBox.add(execButton);
		//
		DetaButton execButton1= new DetaButton("记忆键一");
		execButton1.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton1);
		
		//
		DetaButton execButton2= new DetaButton("记忆键二");
		execButton2.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton2);
		
		//
		DetaButton execButton3= new DetaButton("记忆键三");
		execButton3.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton3);
		
		//
		DetaButton execButton4= new DetaButton("记忆键四");
		execButton4.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton4);
		
		//
		DetaButton execButton5= new DetaButton("记忆键五");
		execButton5.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton5);
		
		//
		DetaButton execButton6= new DetaButton("卸载节点");
		execButton6.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//确认是否卸载
				javax.swing.JOptionPane jOptionPane= new JOptionPane("确认是否卸载？");
				@SuppressWarnings("static-access")
				int confirm= jOptionPane.showConfirmDialog(canvas, "确认卸载吗？");
				if(0!= confirm) {
					rightBotJTextPane.setText(StableData.ATTENSION_CANCELLED_OPERATION);
					rightBotJTextPane.validate();
					return;
				}
				//卸载
				//first.first
				NodeOSGI linkNode= nodeView.first;
				while(linkNode.next!= null) {//daodi
					linkNode= linkNode.next;
				}
				Here:
				while(linkNode!= null) {//benshen
					if(nodeReflection.containsKey(linkNode.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
						nodeReflection.remove(linkNode.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
						if(linkNode.pre!= null) {
							linkNode= linkNode.pre;	
							if(linkNode.next.next!= null) {
								linkNode.next= linkNode.next.next;
							} else {
								linkNode.next= null;
							}
						}else if(linkNode.next!= null) {
							linkNode= linkNode.next;
							linkNode.pre= null;
						}
						continue Here;
					}
					if(linkNode.pre== null) {
						break;
					}
					linkNode= linkNode.pre;	
				}	
				nodeView.first= linkNode;
				nodeView.updateTree();
				rightBotJTextPane.setText("卸载成功!");
				rightBotJTextPane.validate();
			}
		});
		buttonBox.add(execButton6);
		
		//
		DetaButton execButton7= new DetaButton("购买节点");
		execButton7.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton7.addActionListener(new ActionListener(){
			DetaBuy detaBuy;
			JFrame jFrame;
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(null== jFrame) {
					detaBuy= new DetaBuy();
					try {
						detaBuy.init(null);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					detaBuy.setBounds(0, 0, 785, 655);
					detaBuy.setVisible(true);
					detaBuy.show();
					jFrame= new JFrame("购买信息 V1.0.0");
					//frame.setLayout(null);
					jFrame.setSize(780, 650);
					jFrame.setLocation(300, 300);
					jFrame.setResizable(false);
					jFrame.add(detaBuy);
					jFrame.setVisible(true);
					jFrame.show();
					jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
				}else {
					jFrame.setVisible(true);
					jFrame.show();
				}
			}
		});
		buttonBox.add(execButton7);
		
		//
		DetaButton execButton8= new DetaButton("配置面板");
		execButton8.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				engineMenu.show(canvas, 0, 0);
			}
		});
		buttonBox.add(execButton8);
		
		buttonBox.setBounds(10, 0, 1400, 50);
		getContentPane().add(buttonBox);
		
		getContentPane().setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {}
	public void itemStateChanged(ItemEvent arg0) {}
	public void mouseClicked(MouseEvent arg0) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {
		//TreePath path= nodeView.tree.getPathForLocation(arg0.getX(), arg0.getY());
		TreePath path= nodeView.tree.getSelectionPath();
		if (path != null){
			nodeView.tree.setSelectionPath(path);
			if (3== arg0.getButton()){
			popupMenu.show(nodeView.tree, arg0.getX(), arg0.getY());
			}else {
				//engineMenu.show(canvas, 0, 0);
			}
		}else {
			engineMenu.show(canvas, 0, 0);
		}	
	}
	public void mouseDragged(MouseEvent arg0) {}
	public void mouseMoved(MouseEvent arg0) {}
}
