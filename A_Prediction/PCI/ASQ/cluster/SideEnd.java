package PCI.ASQ.cluster;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import PCI.ASQ.ratio.DistanceRatio;
//Theory: Yaoguang.luo 20191216：12：06
//一种仅仅通过坐标重心来描绘射极边缘面探测使用方法。
//Application: Yaoguang.luo
public class SideEnd{
	public static List<AMV_MVS_VSQ_2D> getSideEnd2D(List<AMV_MVS_VSQ_2D> list, double scale) {
		AMV_MVS_VSQ_2D heart= Euclid.findHeartPosition2D(list);
		Map<Double, AMV_MVS_VSQ_2D> ratioSide= new HashMap<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= list.iterator();
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_2D AMV_MVS_VSQ2D= iterator.next();
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
		List<AMV_MVS_VSQ_2D> output= new ArrayList<>();
		Iterator<Double> iteratorKeys= ratioSide.keySet().iterator();
		while(iteratorKeys.hasNext()) {
			output.add(ratioSide.get(iteratorKeys.next()));
		}
		return output;
	}
	
	public static List<AMV_MVS_VSQ_3D> getSideEnd3D(List<AMV_MVS_VSQ_3D> list, double scale) {
		AMV_MVS_VSQ_3D heart= Euclid.findHeartPosition3D(list);
		Map<Double, AMV_MVS_VSQ_3D> ratioSide= new HashMap<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= list.iterator();
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_3D AMV_MVS_VSQ3D= iterator.next();
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
		List<AMV_MVS_VSQ_3D> output= new ArrayList<>();
		Iterator<Double> iteratorKeys= ratioSide.keySet().iterator();
		while(iteratorKeys.hasNext()) {
			output.add(ratioSide.get(iteratorKeys.next()));
		}
		return output;
	}
}