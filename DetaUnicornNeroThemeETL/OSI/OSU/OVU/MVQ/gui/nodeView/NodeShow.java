package OSI.OSU.OVU.MVQ.gui.nodeView;
import java.awt.Font;
import java.awt.PopupMenu;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import java.io.IOException;
import java.util.Map;

import javax.swing.tree.*;

import ME.APM.VSQ.App;
import OSI.OSU.AOPM.VECS.IDUQ.gui.flash.GUISample;
import OSI.OSU.ASQ.PSU.OCI.ME.analysis.Analyzer;
import OSI.OSU.OEQ.MCQ.gui.osgi.*;
import OSI.OSU.OVQ.MSQ.gui.platForm.UnicornTreeCellRenderer;
import OSI.OSU.SI.MCI.OEI.gui.extOSGI.OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register;
public class NodeShow extends JScrollPane {
	private static final long serialVersionUID= 1L;
	public JTree tree;
	public NodeOSGI first;
	public LinkOSGI link;
	public GUISample gUISample;
	DefaultTreeModel treeModel;
	DefaultMutableTreeNode root;
	ImageIcon test;
	public String labelname;
	JTextPane text;
	Object[][] tableData_old;
	public PopupMenu popupMenu;
	public App u;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public NodeShow(GUISample gUISample, Object[][] tableData_old, JTextPane text, PopupMenu popupMenu, App u
			, Analyzer analyzer, Map<String, String> pos) throws IOException{	
		this.text= text;
		this.tableData_old= tableData_old;
		this.popupMenu= popupMenu;
		this.gUISample= gUISample;
		this.u= u;
		this.analyzer= analyzer;
		this.pos= pos;
		link= new LinkOSGI();
		first= new OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(this.tableData_old, this.text, this.u
				, this.analyzer, this.pos).Rigester(first, link);
		updateTree();
	}
	
	public void updateTree() {
		DefaultMutableTreeNode root= new DefaultMutableTreeNode("Node");
		treeModel= new DefaultTreeModel(root);
		if(null== tree) {
			tree= new JTree(treeModel);	
		}else{
			tree.clearSelection();
			tree.removeAll();
		}
		tree.setModel(treeModel);
		//tree= new JTree(treeModel);
		tree.setExpandsSelectedPaths(true);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.putClientProperty("JTree.lineStyle" , "Horizontal");  
		tree.setEditable(false);
		UnicornTreeCellRenderer myCellRenderer = new UnicornTreeCellRenderer();  
		myCellRenderer.setFont(new Font("Serif", Font.ITALIC, 12));
		tree.setCellRenderer(myCellRenderer);
		DefaultMutableTreeNode BI= new DefaultMutableTreeNode("BI");
		DefaultMutableTreeNode SOUND= new DefaultMutableTreeNode("SOUND");
		DefaultMutableTreeNode IMAGE= new DefaultMutableTreeNode("IMAGE");
		DefaultMutableTreeNode MOVIE= new DefaultMutableTreeNode("MOVIE");
		root.add(BI);
		root.add(SOUND);	
		root.add(IMAGE);	
		root.add(MOVIE);
		while(null!= first){
			if(null== first.currentFace.AMV_MVS_VSQ){
				JLabel label;
				label= new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node= new DefaultMutableTreeNode(label);
				root.add(node);
			}
			else if(first.currentFace.AMV_MVS_VSQ.equals("BI")){
				JLabel label;
				label= new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node= new DefaultMutableTreeNode(label);
				BI.add(node);
			}
			else if(first.currentFace.AMV_MVS_VSQ.equals("SOUND")){
				JLabel label;
				label= new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node= new DefaultMutableTreeNode(label);
				SOUND.add(node);
			}
			else if(first.currentFace.AMV_MVS_VSQ.equals("IMAGE")){
				JLabel label;
				label= new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node= new DefaultMutableTreeNode(label);
				IMAGE.add(node);
			}
			else if(first.currentFace.AMV_MVS_VSQ.equals("MOVIE")){
				JLabel label;
				label= new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node= new DefaultMutableTreeNode(label);
				MOVIE.add(node);
			}
			else{
				JLabel label;
				label= new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node= new DefaultMutableTreeNode(label);
				root.add(node);
			}
			if(null== first.next) {
				break;
			}
			first= first.next;
		}	 
		//tree.addMouseListener(gUISample);
		this.setViewportView(tree);	
	}
}
