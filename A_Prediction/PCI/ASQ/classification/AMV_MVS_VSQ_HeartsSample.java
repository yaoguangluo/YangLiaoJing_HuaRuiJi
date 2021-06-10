package PCI.ASQ.classification;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

//这个函数用于坐标集团距离采样匹配输出
//思想: 欧基里德 
//实现：罗瑶光
public class AMV_MVS_VSQ_HeartsSample{
	public static List<AMV_MVS_VSQ_2D> getShortestSamplePosition2DGroup(AMV_MVS_VSQ_2D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_2D>> groups) {
		double shortestDistance= 0;
		boolean isFirst= true;
		double key= 0;
		Iterator<Double> iterators= groups.keySet().iterator();
		while(iterators.hasNext()) {
			double mapKey= iterators.next();
			List<AMV_MVS_VSQ_2D> positions= groups.get(mapKey);
			AMV_MVS_VSQ_2D heart= Euclid.findHeartPosition2D(positions);
			double distance= Distance.getDistance2D(inputHeart, heart);
			if(true== isFirst) {
				isFirst= false;
				shortestDistance= distance;
				key= mapKey;
			}else {
				if(shortestDistance> distance) {
					shortestDistance= distance;
					key= mapKey;
				}
			}
		}
		return groups.get(key);	
	}	

	public static Map<Double, List<AMV_MVS_VSQ_2D>> getShorterSamplePosition2DGroupsWithScale(AMV_MVS_VSQ_2D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_2D>> groups, double scale) {
		Map<Double, List<AMV_MVS_VSQ_2D>> output= new HashMap<>();
		Iterator<Double> iterators= groups.keySet().iterator();
		while(iterators.hasNext()) {
			double mapKey= iterators.next();
			List<AMV_MVS_VSQ_2D> positions= groups.get(mapKey);
			AMV_MVS_VSQ_2D heart= Euclid.findHeartPosition2D(positions);
			double distance= Distance.getDistance2D(inputHeart, heart);
			if(scale> distance) {
				output.put(mapKey, positions);
			}
		}
		return output;	
	}	

	public static List<AMV_MVS_VSQ_3D> getShortestSamplePosition3DGroup(AMV_MVS_VSQ_3D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_3D>> groups) {
		double shortestDistance= 0;
		boolean isFirst= true;
		double key= 0;
		Iterator<Double> iterators= groups.keySet().iterator();
		while(iterators.hasNext()) {
			double mapKey= iterators.next();
			List<AMV_MVS_VSQ_3D> positions= groups.get(mapKey);
			AMV_MVS_VSQ_3D heart= Euclid.findHeartPosition3D(positions);
			double distance= Distance.getDistance3D(inputHeart, heart);
			if(true== isFirst) {
				isFirst= false;
				shortestDistance= distance;
				key= mapKey;
			}else {
				if(shortestDistance> distance) {
					shortestDistance= distance;
					key= mapKey;
				}
			}
		}
		return groups.get(key);	
	}	

	public static Map<Double, List<AMV_MVS_VSQ_3D>> getShortestSamplePosition3DGroupsWithScale(AMV_MVS_VSQ_3D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_3D>> groups, double scale) {
		Map<Double, List<AMV_MVS_VSQ_3D>> output= new HashMap<>();
		Iterator<Double> iterators= groups.keySet().iterator();
		while(iterators.hasNext()) {
			double mapKey= iterators.next();
			List<AMV_MVS_VSQ_3D> positions= groups.get(mapKey);
			AMV_MVS_VSQ_3D heart= Euclid.findHeartPosition3D(positions);
			double distance= Distance.getDistance3D(inputHeart, heart);
			if(scale> distance) {
				output.put(mapKey, positions);
			}
		}
		return output;	
	}	
}