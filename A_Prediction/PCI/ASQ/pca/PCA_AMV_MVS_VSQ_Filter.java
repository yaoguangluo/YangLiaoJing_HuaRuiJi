package PCI.ASQ.pca;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//这个函数用于坐标类的 主要成份分析与提取
//思想：欧基里德 平面，立体几何
//实现：罗瑶光
public class PCA_AMV_MVS_VSQ_Filter{
	public static List<AMV_MVS_VSQ_2D> filterPosition2DsWithScaledDistance(List<AMV_MVS_VSQ_2D> input
			, AMV_MVS_VSQ_2D heart, double scaleDistacne){
		List<AMV_MVS_VSQ_2D> output= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= input.iterator();
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_2D position2D= iterator.next();
			double distance= Distance.getDistance2D(heart, position2D);
			if(distance< scaleDistacne) {
				output.add(position2D);
			}
		}
		return output;
	}

	public static List<AMV_MVS_VSQ_3D> filterPosition3DsWithScaledDistance(List<AMV_MVS_VSQ_3D> input
			, AMV_MVS_VSQ_3D heart, double scaleDistacne){
		List<AMV_MVS_VSQ_3D> output= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= input.iterator();
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_3D position3D= iterator.next();
			double distance= Distance.getDistance3D(heart, position3D);
			if(distance< scaleDistacne) {
				output.add(position3D);
			}
		}
		return output;
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_2D>> filterPosition2DsWithScaledDistance(Map<Double, List<AMV_MVS_VSQ_2D>> input
			, AMV_MVS_VSQ_2D heart, double scaleDistacne){
		Map<Double, List<AMV_MVS_VSQ_2D>> output= new HashMap<>();
		Iterator<Double> iterator= input.keySet().iterator();
		while(iterator.hasNext()) {
			double mapKey= iterator.next();
			List<AMV_MVS_VSQ_2D> position2DList= input.get(mapKey);
			AMV_MVS_VSQ_2D tempHeart= Euclid.findHeartPosition2D(position2DList);
			double distance= Distance.getDistance2D(heart, tempHeart);
			if(distance< scaleDistacne) {
				output.put(mapKey, position2DList);
			}
		}
		return output;
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_3D>> filterPosition3DsWithScaledDistance(Map<Double, List<AMV_MVS_VSQ_3D>> input
			, AMV_MVS_VSQ_3D heart, double scaleDistacne){
		Map<Double, List<AMV_MVS_VSQ_3D>> output= new HashMap<>();
		Iterator<Double> iterator= input.keySet().iterator();
		while(iterator.hasNext()) {
			double mapKey= iterator.next();
			List<AMV_MVS_VSQ_3D> position3DList= input.get(mapKey);
			AMV_MVS_VSQ_3D tempHeart= Euclid.findHeartPosition3D(position3DList);
			double distance= Distance.getDistance3D(heart, tempHeart);
			if(distance< scaleDistacne) {
				output.put(mapKey, position3DList);
			}
		}
		return output;
	}
}