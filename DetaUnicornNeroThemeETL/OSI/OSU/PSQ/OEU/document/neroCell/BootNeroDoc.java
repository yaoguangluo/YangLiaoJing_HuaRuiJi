package OSI.OSU.PSQ.OEU.document.neroCell;
import java.io.File;
import java.util.Map;
import javax.swing.JTextPane;

import OSI.OSU.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OSU.MSQ.sets.stable.StableData;
import OSI.OSU.OEI.PVI.document.load.LoadFile;
import OSI.OSU.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OSU.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OSU.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OSU.vpcs.skivvy.Skivvy;
@SuppressWarnings("unused")
public class BootNeroDoc extends Thread implements Runnable{
	private String fileCurrentpath;
	private LinkList first;
	private LinkNode currentNode;
	private NodeShow nodeView;
	private ThisCanvas canvas;
	private JTextPane rightBotJTextPane;
	private Map<String, Object> pillow;
	public BootNeroDoc(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas) {
		this.fileCurrentpath= fileCurrentpath;
		this.first= first;
		this.rightBotJTextPane= rightBotJTextPane;
		this.canvas= canvas;
	}
	public void setPillow(Map<String, Object> map) {
		this.pillow= map;//map 提供运维，可控等数据
	}
	public void run() {
		try {
			System.out.println(fileCurrentpath);
			if(null== fileCurrentpath|| fileCurrentpath.isEmpty()
					|| !fileCurrentpath.contains(StableData.FILE_FORMAT_ETL)) {
				System.out.println(StableData.ATTENSION_RECHOICE);
				return;
			}
			File file= new File(fileCurrentpath);
			if(!file.isFile()) {
				System.out.println(StableData.ATTENSION_RECHOICE);
				return;
			}
			Thread.sleep(2);
			currentNode= LoadFile.Load(currentNode, nodeView, file, first);
			Thread.sleep(2);
			BootNeroCell.bootCell(currentNode, rightBotJTextPane, canvas);
		}catch(Exception loadE) {
			Skivvy.working(this.getId(), loadE);//skivvy负责vision， pillow，sets，sleeper 全程管理和反馈。
			loadE.printStackTrace();
		}
	}
}