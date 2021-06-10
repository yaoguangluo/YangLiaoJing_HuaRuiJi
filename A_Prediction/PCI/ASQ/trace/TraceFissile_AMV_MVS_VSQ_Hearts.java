package PCI.ASQ.trace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

public class TraceFissile_AMV_MVS_VSQ_Hearts{
	//Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
	//创作日期2019 年 12 月 21 日  作品说明Gitee, Github, DetaOSS
	//作品说明适用于 坐标团 动态分析，增量轨迹分析，熵增信息单元记录。
	//作者 罗瑶光
	public static Map<Double, List<AMV_MVS_VSQ_2D>> 
	trackTracePosition2DHeartsWithFissileGroups(List<AMV_MVS_VSQ_2D> coods, double distanceScale){
		Map<Double, List<AMV_MVS_VSQ_2D>> output= new HashMap<>(); 
		Map<Double, List<AMV_MVS_VSQ_2D>> distanceGroups= new HashMap<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= coods.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				AMV_MVS_VSQ_2D position2D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<AMV_MVS_VSQ_2D> list= new ArrayList<>();
					list.add(position2D);
					distanceGroups.put(i, list);
					//
					List<AMV_MVS_VSQ_2D> listHeartsTrace= output.get(i);
					listHeartsTrace.add(position2D);
					output.put(i, listHeartsTrace);
				}else {
					//遍历所有团
					//团重心匹配如果超精度新存，不是就融入。
					Iterator<Double> iteratorScale= output.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						AMV_MVS_VSQ_2D currenctHeart= output.get(doubleScale).get(output.get(doubleScale).size()- 1);						
						double distance= Distance.getDistance2D(currenctHeart, position2D);
						if(distance< distanceScale) {
							//融入得到新的重心
							AMV_MVS_VSQ_2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, position2D);
							//删除当前增加坐标集，更新坐标集
							List<AMV_MVS_VSQ_2D> list= distanceGroups.get(doubleScale);
							list.add(position2D);
							distanceGroups.put(doubleScale, list);
							//删除当前重心数据，更新重心数据轨迹
							List<AMV_MVS_VSQ_2D> listHeartsTrace= output.get(doubleScale);
							listHeartsTrace.add(newHeart);
							output.put(doubleScale, listHeartsTrace);
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
						//加新hearts	
						List<AMV_MVS_VSQ_2D> listHeartsTrace= output.get(i);
						listHeartsTrace.add(position2D);
						output.put(i, listHeartsTrace);
					}
				}
			}
		return output;
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_3D>> 
	trackTracePosition3DHeartsWithFissileGroups(List<AMV_MVS_VSQ_3D> coods, double distanceScale){
		Map<Double, List<AMV_MVS_VSQ_3D>> output= new HashMap<>(); 
		Map<Double, List<AMV_MVS_VSQ_3D>> distanceGroups= new HashMap<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= coods.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				AMV_MVS_VSQ_3D position3D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<AMV_MVS_VSQ_3D> list= new ArrayList<>();
					list.add(position3D);
					distanceGroups.put(i, list);
					//
					List<AMV_MVS_VSQ_3D> listHeartsTrace= output.get(i);
					listHeartsTrace.add(position3D);
					output.put(i, listHeartsTrace);
				}else {
					//遍历所有团
					//团重心匹配如果超精度新存，不是就融入。
					Iterator<Double> iteratorScale= output.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						AMV_MVS_VSQ_3D currenctHeart= output.get(doubleScale).get(output.get(doubleScale).size()- 1);						
						double distance= Distance.getDistance3D(currenctHeart, position3D);
						if(distance< distanceScale) {
							//融入得到新的重心
							AMV_MVS_VSQ_3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, position3D);
							//删除当前增加坐标集，更新坐标集
							List<AMV_MVS_VSQ_3D> list= distanceGroups.get(doubleScale);
							list.add(position3D);
							distanceGroups.put(doubleScale, list);
							//删除当前重心数据，更新重心数据轨迹
							List<AMV_MVS_VSQ_3D> listHeartsTrace= output.get(doubleScale);
							listHeartsTrace.add(newHeart);
							output.put(doubleScale, listHeartsTrace);
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
						//加新hearts	
						List<AMV_MVS_VSQ_3D> listHeartsTrace= output.get(i);
						listHeartsTrace.add(position3D);
						output.put(i, listHeartsTrace);
					}
				}
			}
		return output;
	}
}
