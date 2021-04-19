package OSI.OSU.ASQ.tinos.deta.cluster;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.OSU.ASQ.tinos.deta.basic.Distance;
import OSI.OSU.ASQ.tinos.deta.basic.Euclid;
import OSI.OSU.ASQ.tinos.deta.demension.Position2D;
import OSI.OSU.ASQ.tinos.deta.demension.Position3D;
import OSI.OSU.ASQ.tinos.deta.ratio.DistanceRatio;
//Theory: Yaoguang.luo 20191216：12：06
//一种仅仅通过坐标重心来描绘射极边缘面探测使用方法。
//Application: Yaoguang.luo
public class SideEnd{
	public static List<Position2D> getSideEnd2D(List<Position2D> list, double scale) {
		Position2D heart= Euclid.findHeartPosition2D(list);
		Map<Double, Position2D> ratioSide= new HashMap<>();
		Iterator<Position2D> iterator= list.iterator();
		while(iterator.hasNext()) {
			Position2D AMV_MVS_VSQ2D= iterator.next();
			double ratio= DistanceRatio.getDistanceRatio2D(heart, AMV_MVS_VSQ2D);
			if(ratioSide.containsKey(ratio)) {
				double newDistance= Distance.getDistance2D(heart, AMV_MVS_VSQ2D);
				double oldDistance= Distance.getDistance2D(heart, ratioSide.get(ratio));
				if(newDistance> oldDistance) {
					if(newDistance> scale) {
						ratioSide.put(ratio, AMV_MVS_VSQ2D);
					}
				}
			}else {
				double newDistance= Distance.getDistance2D(heart, AMV_MVS_VSQ2D);
				if(newDistance> scale) {
					ratioSide.put(ratio, AMV_MVS_VSQ2D);
				}
			}
		}
		//转换
		List<Position2D> output= new ArrayList<>();
		Iterator<Double> iteratorKeys= ratioSide.keySet().iterator();
		while(iteratorKeys.hasNext()) {
			output.add(ratioSide.get(iteratorKeys.next()));
		}
		return output;
	}
	
	public static List<Position3D> getSideEnd3D(List<Position3D> list, double scale) {
		Position3D heart= Euclid.findHeartPosition3D(list);
		Map<Double, Position3D> ratioSide= new HashMap<>();
		Iterator<Position3D> iterator= list.iterator();
		while(iterator.hasNext()) {
			Position3D AMV_MVS_VSQ3D= iterator.next();
			double ratio= DistanceRatio.getDistanceRatio3D(heart, AMV_MVS_VSQ3D);
			if(ratioSide.containsKey(ratio)) {
				double newDistance= Distance.getDistance3D(heart, AMV_MVS_VSQ3D);
				double oldDistance= Distance.getDistance3D(heart, ratioSide.get(ratio));
				if(newDistance> oldDistance) {
					if(newDistance> scale) {
						ratioSide.put(ratio, AMV_MVS_VSQ3D);
					}
				}
			}else {
				double newDistance= Distance.getDistance3D(heart, AMV_MVS_VSQ3D);
				if(newDistance> scale) {
					ratioSide.put(ratio, AMV_MVS_VSQ3D);
				}
			}
		}
		//转换
		List<Position3D> output= new ArrayList<>();
		Iterator<Double> iteratorKeys= ratioSide.keySet().iterator();
		while(iteratorKeys.hasNext()) {
			output.add(ratioSide.get(iteratorKeys.next()));
		}
		return output;
	}
}