package PCI.ASQ.cluster;

import java.util.List;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

public class ClusterAttraction{
	//临近2个坐标团的相互引力比算法建模观测，小于1 吸引，大于1 排斥。
	//思想： 罗瑶光，欧基里德， 立体几何，20191227
	//实现： 罗瑶光
	public static double getTwoPosition2DClusterAttraction(List<AMV_MVS_VSQ_2D> clusterOne
			, List<AMV_MVS_VSQ_2D> clusterTwo) {
		AMV_MVS_VSQ_2D midOne= Euclid.findMidPosition2D(clusterOne);
		AMV_MVS_VSQ_2D midTwo= Euclid.findMidPosition2D(clusterTwo);
		AMV_MVS_VSQ_2D heartOne= Euclid.findHeartPosition2D(clusterOne);
		AMV_MVS_VSQ_2D heartTwo= Euclid.findHeartPosition2D(clusterTwo);
		double midDistance= Distance.getDistance2D(midOne, midTwo);
		double heartDistance= Distance.getDistance2D(heartOne, heartTwo);
		return heartDistance/ midDistance;
	}
	
	public static double getTwoPosition3DClusterAttraction(List<AMV_MVS_VSQ_3D> clusterOne
			, List<AMV_MVS_VSQ_3D> clusterTwo) {
		AMV_MVS_VSQ_3D midOne= Euclid.findMidPosition3D(clusterOne);
		AMV_MVS_VSQ_3D midTwo= Euclid.findMidPosition3D(clusterTwo);
		AMV_MVS_VSQ_3D heartOne= Euclid.findHeartPosition3D(clusterOne);
		AMV_MVS_VSQ_3D heartTwo= Euclid.findHeartPosition3D(clusterTwo);
		double midDistance= Distance.getDistance3D(midOne, midTwo);
		double heartDistance= Distance.getDistance3D(heartOne, heartTwo);
		return heartDistance/ midDistance;
	}
}