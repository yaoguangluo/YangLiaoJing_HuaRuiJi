package PCI.ASQ.classification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//task 20191219 daytime
//通过scale 距离来进行 坐标团切裂, 并匹配最短最近重心域融入。
//算法 耗时更长，准确度再增加。
//Theory yaoguang.luo 20191219~23， 欧基里德
//Application yaoguang.luo
public class FissileWithMatch{
	public static Map<Double, ArrayList<AMV_MVS_VSQ_2D>> fissilePosition2DWithMatch(ArrayList<AMV_MVS_VSQ_2D> groups
			, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_2D>> distanceGroups= new HashMap<>();
		Map<Double, AMV_MVS_VSQ_2D> distanceHeart= new HashMap<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= groups.iterator();
		double i= 0.0;
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_2D position2D= iterator.next();
			if(distanceGroups.isEmpty()) {
				ArrayList<AMV_MVS_VSQ_2D> ArrayList= new ArrayList<>();
				ArrayList.add(position2D);
				distanceGroups.put(i, ArrayList);
				distanceHeart.put(i, position2D);
			}else {
				//遍历所有团
				//团重心匹配如果超精度新存，不是就融入。
				Iterator<Double> iteratorScale= distanceHeart.keySet().iterator();
				double shortest = 0;
				double shortestDoubleScale = 0;
				boolean isFind= false;
				while(iteratorScale.hasNext()) {
					Double doubleScale= iteratorScale.next();
					AMV_MVS_VSQ_2D currenctHeart= distanceHeart.get(doubleScale);
					double distance= Distance.getDistance2D(currenctHeart, position2D);
					if(distance< scale) {
						if(false== isFind) {
							isFind= true;
							shortest= distance;
							shortestDoubleScale= doubleScale;
						}else {
							if(shortest< distance) {
								shortest= distance;
								shortestDoubleScale= doubleScale;
							}
						}
					}	
				}
				if(true== isFind) {
					AMV_MVS_VSQ_2D currenctHeart= distanceHeart.get(shortestDoubleScale);
					//融入得到新的重心
					AMV_MVS_VSQ_2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, position2D);
					//删除当前增加坐标集，更新坐标集
					ArrayList<AMV_MVS_VSQ_2D> ArrayList= distanceGroups.get(shortestDoubleScale);
					ArrayList.add(position2D);
					distanceGroups.put(shortestDoubleScale, ArrayList);
					//删除当前重心数据，更新重心数据
					distanceHeart.put(shortestDoubleScale, newHeart);
				}else {
					ArrayList<AMV_MVS_VSQ_2D> ArrayList= new ArrayList<>();
					ArrayList.add(position2D);
					distanceGroups.put(++i, ArrayList);
					distanceHeart.put(i, position2D);	
				}
			}
		}
		return distanceGroups;	
	}
	
	public static Map<Double, ArrayList<AMV_MVS_VSQ_3D>> fissilePosition3DWithMatch(ArrayList<AMV_MVS_VSQ_3D> groups
			, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_3D>> distanceGroups= new HashMap<>();
		Map<Double, AMV_MVS_VSQ_3D> distanceHeart= new HashMap<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= groups.iterator();
		double i= 0.0;
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_3D position3D= iterator.next();
			if(distanceGroups.isEmpty()) {
				ArrayList<AMV_MVS_VSQ_3D> ArrayList= new ArrayList<>();
				ArrayList.add(position3D);
				distanceGroups.put(i, ArrayList);
				distanceHeart.put(i, position3D);
			}else {
				//遍历所有团
				//团重心匹配如果超精度新存，不是就融入。
				Iterator<Double> iteratorScale= distanceHeart.keySet().iterator();
				double shortest= 0;
				double shortestDoubleScale = 0;
				boolean isFind= false;
				while(iteratorScale.hasNext()) {
					Double doubleScale= iteratorScale.next();
					AMV_MVS_VSQ_3D currenctHeart= distanceHeart.get(doubleScale);
					double distance= Distance.getDistance3D(currenctHeart, position3D);
					if(distance< scale) {
						if(false== isFind) {
							isFind= true;
							shortest= distance;
							shortestDoubleScale= doubleScale;
						}else {
							if(shortest< distance) {
								shortest= distance;
								shortestDoubleScale= doubleScale;
							}
						}
					}	
				}
				if(true== isFind) {
					AMV_MVS_VSQ_3D currenctHeart= distanceHeart.get(shortestDoubleScale);
					//融入得到新的重心
					AMV_MVS_VSQ_3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, position3D);
					//删除当前增加坐标集，更新坐标集
					ArrayList<AMV_MVS_VSQ_3D> ArrayList= distanceGroups.get(shortestDoubleScale);
					ArrayList.add(position3D);
					distanceGroups.put(shortestDoubleScale, ArrayList);
					//删除当前重心数据，更新重心数据
					distanceHeart.put(shortestDoubleScale, newHeart);
				}else {
					ArrayList<AMV_MVS_VSQ_3D> ArrayList= new ArrayList<>();
					ArrayList.add(position3D);
					distanceGroups.put(++i, ArrayList);
					distanceHeart.put(i, position3D);	
				}
			}
		}
		return distanceGroups;	
	}
}