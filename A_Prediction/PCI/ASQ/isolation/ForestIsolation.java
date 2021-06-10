package PCI.ASQ.isolation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Distance;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
public class ForestIsolation{
	//带精度 2维 商旅路径团簇 森林单元 隔离 算法
	//Theory 《神经网络: 权距》，欧基里德， Yaoguang.Luo 20191220
	//Application Yaoguang.Luo 
	//适用于 最短路径，最小距离，商旅分析预测，等项目中
	public static Map<Double, List<AMV_MVS_VSQ_2D>> getTSPForestIsolationGroups2D(
			List<AMV_MVS_VSQ_2D> groups, double scale) {
		Map<Double, List<AMV_MVS_VSQ_2D>> output= new HashMap<>(); 
		Iterator<AMV_MVS_VSQ_2D> iterator= groups.iterator();
		double i= 0;
		while(iterator.hasNext()) {
			i++;
			AMV_MVS_VSQ_2D AMV_MVS_VSQ2D= iterator.next();
			Iterator<AMV_MVS_VSQ_2D> inIterator= groups.iterator();
			double j= 0;
			Here:
				while(inIterator.hasNext()) {
					j++;
					AMV_MVS_VSQ_2D inPosition2D= inIterator.next();
					//计算
					if(i== j) {
						continue Here;
					}
					double distance= Distance.getDistance2D(AMV_MVS_VSQ2D, inPosition2D);
					if(distance> scale) {
						continue Here;
					}
					//添加
					List<AMV_MVS_VSQ_2D> list;
					if(output.containsKey(i)) {
						list= output.get(i);
					}else {
						list= new ArrayList<>();
						list.add(AMV_MVS_VSQ2D);
					}
					list.add(inPosition2D);
					output.put(i, list);
				}
		}
		return output;	
	}

	//带精度 3维 商旅路径团簇 森林单元 隔离 算法
	//Theory 《神经网络: 权距》，欧基里德， Yaoguang.Luo 20191220
	//Application Yaoguang.Luo 
	//适用于 最短路径，最小距离，商旅分析预测，等项目中
	public static Map<Double, List<AMV_MVS_VSQ_3D>> getTSPIsolationGroups3D(
			List<AMV_MVS_VSQ_3D> groups, double scale) {
		Map<Double, List<AMV_MVS_VSQ_3D>> output= new HashMap<>(); 
		Iterator<AMV_MVS_VSQ_3D> iterator= groups.iterator();
		double i= 0;
		while(iterator.hasNext()) {
			i++;
			AMV_MVS_VSQ_3D AMV_MVS_VSQ3D= iterator.next();
			Iterator<AMV_MVS_VSQ_3D> inIterator= groups.iterator();
			double j= 0;
			Here:
				while(inIterator.hasNext()) {
					j++;
					AMV_MVS_VSQ_3D inPosition3D= inIterator.next();
					//计算
					if(i== j) {
						continue Here;
					}
					double distance= Distance.getDistance3D(AMV_MVS_VSQ3D, inPosition3D);
					if(distance> scale) {
						continue Here;
					}
					//添加
					List<AMV_MVS_VSQ_3D> list;
					if(output.containsKey(i)) {
						list= output.get(i);
					}else {
						list= new ArrayList<>();
						list.add(AMV_MVS_VSQ3D);
					}
					list.add(inPosition3D);
					output.put(i, list);
				}
		}
		return output;	
	}
}