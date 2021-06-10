package PCI.ASQ.pca;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//这个函数用于坐标融聚团的主要条件过滤。
//思想：统计与概率论，立体几何，数据挖掘
//实现：罗瑶光
public class FusionPCAFilter{
	public static Map<Double, List<AMV_MVS_VSQ_2D>> filterFusion2DSetsWithCountScale
	(Map<Double, List<AMV_MVS_VSQ_2D>> groups, double countScale){
		Map<Double, List<AMV_MVS_VSQ_2D>> output= new HashMap<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			if(groups.get(value).size()>= countScale) {
				output.put(value, groups.get(value));
			}
		}
		return output;
	}
	
	public static Map<Double, List<AMV_MVS_VSQ_3D>> filterFusion3DSetsWithCountScale
	(Map<Double, List<AMV_MVS_VSQ_3D>> groups, double countScale){
		Map<Double, List<AMV_MVS_VSQ_3D>> output= new HashMap<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			if(groups.get(value).size()>= countScale) {
				output.put(value, groups.get(value));
			}
		}
		return output;
	}
}