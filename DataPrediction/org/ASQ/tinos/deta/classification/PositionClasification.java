package org.ASQ.tinos.deta.classification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.ASQ.tinos.deta.basic.Distance;
import org.ASQ.tinos.deta.basic.Euclid;
import org.ASQ.tinos.deta.demension.Position2D;
//这个函数用于通过重心位移距离来进行坐标分类
//思想：欧基里德
//实现：罗瑶光
public class PositionClasification{
	public static Map<Double, List<Position2D>> addNewPositionWithoutHeart(Map<Double
			, List<Position2D>> groups, Position2D AMV_MVS_VSQ2D, double scaleDistance){
		double groupKey = 0;
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			groupKey= iterator.next();
			List<Position2D> group= groups.get(groupKey);
			Position2D heart= Euclid.findHeartPosition2D(group);
			double distance= Distance.getDistance2D(heart, AMV_MVS_VSQ2D);
			if(scaleDistance< distance) {
				group.add(AMV_MVS_VSQ2D);
				groups.put(groupKey, group);
				return groups;
			}
		}
		List<Position2D> group= new ArrayList<Position2D>() ;
		group.add(AMV_MVS_VSQ2D);
		groups.put(groupKey+1, group);
		return groups;
	}
	
	public static Map<Double, List<Position2D>> addNewPositionWithHeart(Map<Double, List<Position2D>> groups
			, Position2D AMV_MVS_VSQ2D, Map<Double, Position2D> hearts, double scaleDistance){	
		double groupKey= 0;
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			groupKey= iterator.next();
			List<Position2D> group= groups.get(groupKey);
			Position2D heart= hearts.get(groupKey);
			double distance= Distance.getDistance2D(heart, AMV_MVS_VSQ2D);
			if(scaleDistance< distance) {
				group.add(AMV_MVS_VSQ2D);
				groups.put(groupKey, group);
				//hearts熵增
				Position2D CryptHeart= Euclid.findCryptionPosition2D(heart, AMV_MVS_VSQ2D);
				hearts.put(groupKey, CryptHeart);
				return groups;
			}
		}
		List<Position2D> group= new ArrayList<Position2D>() ;
		group.add(AMV_MVS_VSQ2D);
		groups.put(groupKey+1, group);
		//heart
		hearts.put(groupKey+1, AMV_MVS_VSQ2D);
		return groups;
	}
}