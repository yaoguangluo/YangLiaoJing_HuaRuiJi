package PCI.ASQ.classification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

//task 20191219 daytime
//通过scale 距离来进行 坐标团切裂。
//Theory yaoguang.luo 20191219， 欧基里德
//Application yaoguang.luo
public class Fissile{
	public static Map<Double, List<AMV_MVS_VSQ_2D>> fissilePosition2D(List<AMV_MVS_VSQ_2D> groups
			, double scale) {
		Map<Double, List<AMV_MVS_VSQ_2D>> distanceGroups= new HashMap<>();
		Map<Double, AMV_MVS_VSQ_2D> distanceHeart= new HashMap<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= groups.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				AMV_MVS_VSQ_2D position2D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<AMV_MVS_VSQ_2D> list= new ArrayList<>();
					list.add(position2D);
					distanceGroups.put(i, list);
					distanceHeart.put(i, position2D);
				}else {
					//遍历所有团
					//团重心匹配如果超精度新存，不是就融入。
					Iterator<Double> iteratorScale= distanceHeart.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						AMV_MVS_VSQ_2D currenctHeart= distanceHeart.get(doubleScale);
						double distance= Distance.getDistance2D(currenctHeart, position2D);
						if(distance< scale) {
							//融入得到新的重心
							AMV_MVS_VSQ_2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, position2D);
							//删除当前增加坐标集，更新坐标集
							List<AMV_MVS_VSQ_2D> list= distanceGroups.get(doubleScale);
							list.add(position2D);
							distanceGroups.put(doubleScale, list);
							//删除当前重心数据，更新重心数据
							distanceHeart.put(doubleScale, newHeart);
							//找到
							isFind= true;
							//如果预测 坐标适应状态 可以把 continue 省略。
							continue Here;
						}	
					}
					//新存
					if(!isFind) {
						List<AMV_MVS_VSQ_2D> list= new ArrayList<>();
						list.add(position2D);
						distanceGroups.put(++i, list);
						distanceHeart.put(i, position2D);	
					}
				}
			}
		return distanceGroups;	
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_3D>> fissilePosition3D(List<AMV_MVS_VSQ_3D> groups
			, double scale) {
		Map<Double, List<AMV_MVS_VSQ_3D>> distanceGroups= new HashMap<>();
		Map<Double, AMV_MVS_VSQ_3D> distanceHeart= new HashMap<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= groups.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				AMV_MVS_VSQ_3D position3D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<AMV_MVS_VSQ_3D> list= new ArrayList<>();
					list.add(position3D);
					distanceGroups.put(i, list);
					distanceHeart.put(i, position3D);
				}else {
					//遍历所有团
					//团重心匹配如果超精度新存，不是就融入。
					Iterator<Double> iteratorScale= distanceHeart.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						AMV_MVS_VSQ_3D currenctHeart= distanceHeart.get(doubleScale);
						double distance= Distance.getDistance3D(currenctHeart, position3D);
						if(distance< scale) {
							//融入得到新的重心
							AMV_MVS_VSQ_3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, position3D);
							//删除当前增加坐标集，更新坐标集
							List<AMV_MVS_VSQ_3D> list= distanceGroups.get(doubleScale);
							list.add(position3D);
							distanceGroups.put(doubleScale, list);
							//删除当前重心数据，更新重心数据
							distanceHeart.put(doubleScale, newHeart);
							//找到
							isFind= true;
							//如果预测 坐标适应状态 可以把 continue 省略。
							continue Here;
						}	
					}
					//新存
					if(!isFind) {
						List<AMV_MVS_VSQ_3D> list= new ArrayList<>();
						list.add(position3D);
						distanceGroups.put(++i, list);
						distanceHeart.put(i, position3D);	
					}
				}
			}
		return distanceGroups;	
	}
}