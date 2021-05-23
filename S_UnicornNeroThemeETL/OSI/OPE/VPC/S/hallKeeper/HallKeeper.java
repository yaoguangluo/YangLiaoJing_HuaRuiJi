package OSI.OPE.VPC.S.hallKeeper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JTextPane;

import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
import OSI.OPE.VPC.S.V.Pillow;
import OSI.OPE.VPC.S.V.Vision;
import OSI.OPE.VPC.S.sets.Sets;
import OSI.OPE.VPC.S.skivvy.Skivvy;
public class HallKeeper{
	public static Map<Long, BootNeroDoc> hallKeeper;
	public static void vpcsRegister(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas) {
		if(null== hallKeeper) {
			hallKeeper= new ConcurrentHashMap<>();
		}
		
		if(200> hallKeeper.size()) {
			try {
				BootNeroDoc bootNeroDoc= new BootNeroDoc(first, fileCurrentpath, nodeView
						, rightBotJTextPane, canvas);
				Sets.register(bootNeroDoc.getId());//sets 是sleeper运行时候里面可以分离出来的数据。
				Pillow.register(bootNeroDoc);//pillow是这些数据的分类存储器
				Vision.registerVision(bootNeroDoc);//vision是sleeper运行的具体梦境。
				hallKeeper.put(bootNeroDoc.getId(), bootNeroDoc);
				bootNeroDoc.start();
			}catch(Exception e) {
				Skivvy.working(hallKeeper, e);//skivvy负责vision， pillow，sets，sleeper 全程管理和反馈。
			}
		}
	}
}