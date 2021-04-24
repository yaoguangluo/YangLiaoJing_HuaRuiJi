package OSI.OSU.AOP.MEC.SIQ.pletl;
import java.util.HashMap;

import javax.swing.JTextPane;

import OSI.OSU.OVU.MVQ.gui.nodeView.NodeShow;
import OSI.OSU.OVU.MVU.gui.nodeEdit.LinkList;
public interface PLETLIntef{
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap);		
}