package PCI.ASQ.classification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;

//这个函数用于通过重心位移距离来进行坐标分类
//思想：欧基里德
//实现：罗瑶光
public class AMV_MVS_VSQ_Classification{
	public static Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithoutHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups
			, AMV_MVS_VSQ_2D position2D, double scaleDistance){
		double groupKey = 0;
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			groupKey= iterator.next();
			List<AMV_MVS_VSQ_2D> group= groups.get(groupKey);
			AMV_MVS_VSQ_2D heart= Euclid.findHeartPosition2D(group);
			double distance= Distance.getDistance2D(heart, position2D);
			if(scaleDistance< distance) {
				group.add(position2D);
				groups.put(groupKey, group);
				return groups;
			}
		}
		List<AMV_MVS_VSQ_2D> group= new ArrayList<AMV_MVS_VSQ_2D>() ;
		group.add(position2D);
		groups.put(groupKey+1, group);
		return groups;
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithHeart(Map<Double
			, List<AMV_MVS_VSQ_2D>> groups, AMV_MVS_VSQ_2D position2D, Map<Double, AMV_MVS_VSQ_2D> hearts, double scaleDistance){	
		double groupKey= 0;
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			groupKey= iterator.next();
			List<AMV_MVS_VSQ_2D> group= groups.get(groupKey);
			AMV_MVS_VSQ_2D heart= hearts.get(groupKey);
			double distance= Distance.getDistance2D(heart, position2D);
			if(scaleDistance< distance) {
				group.add(position2D);
				groups.put(groupKey, group);
				//hearts熵增
				AMV_MVS_VSQ_2D CryptHeart= Euclid.findCryptionPosition2D(heart, position2D);
				hearts.put(groupKey, CryptHeart);
				return groups;
			}
		}
		List<AMV_MVS_VSQ_2D> group= new ArrayList<AMV_MVS_VSQ_2D>() ;
		group.add(position2D);
		groups.put(groupKey+1, group);
		//heart
		hearts.put(groupKey+1, position2D);
		return groups;
	}
}