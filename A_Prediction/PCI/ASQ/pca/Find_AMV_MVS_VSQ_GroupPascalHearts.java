package PCI.ASQ.pca;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;

import PCI.ASQ.classification.FissileWithMatch;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import PCI.ASQ.demension.FindHeart_AMV_MVS_VSQ;
import PCI.ASQ.demension.FindMid_AMV_MVS_VSQ;
import PCI.ASQ.demension.Line2D;
import PCI.ASQ.demension.Line3D;

public class Find_AMV_MVS_VSQ_GroupPascalHearts{
	//通过坐标团的 精度匹配分割的内部坐标聚类团 进行 每个聚类团的 重心和中心距离 求解 获取有效的团稳定观测数据模型
	//思想 帕斯卡，欧基里德，数据挖掘，贝叶斯，立体几何，流体力学，量化拓扑力学，离散数学，统计与概率论 20191227
	//实现 罗瑶光 
	public static Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_2D> groups, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_2D>> pascalGroups= FissileWithMatch.fissilePosition2DWithMatch(groups, scale);
		Map<Double, AMV_MVS_VSQ_2D> pascalHearts= FindHeart_AMV_MVS_VSQ.getPosition2DGroupsHearts(pascalGroups);
		return pascalHearts;
	}
	
	public static Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_3D>> pascalGroups= FissileWithMatch.fissilePosition3DWithMatch(groups, scale);
		Map<Double, AMV_MVS_VSQ_3D> pascalHearts= FindHeart_AMV_MVS_VSQ.getPosition3DGroupsHearts(pascalGroups);
		return pascalHearts;
	}
	
	public static Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_2D> groups, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_2D>> pascalGroups= FissileWithMatch.fissilePosition2DWithMatch(groups, scale);
		Map<Double, AMV_MVS_VSQ_2D> pascalMids=  FindMid_AMV_MVS_VSQ.getPosition2DGroupsMids(pascalGroups);
		return pascalMids;
	}
	
	public static Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) {
		Map<Double, ArrayList<AMV_MVS_VSQ_3D>> pascalGroups= FissileWithMatch.fissilePosition3DWithMatch(groups, scale);
		Map<Double, AMV_MVS_VSQ_3D> pascalMids= FindMid_AMV_MVS_VSQ.getPosition3DGroupsMids(pascalGroups);
		return pascalMids;
	}
	
	public static Map<Double, Line2D> getPosition2DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_2D> pascalHearts
			, Map<Double, AMV_MVS_VSQ_2D> pascalMids) {
		Map<Double, Line2D> pascalDirections= new HashMap<>();
		Iterator<Double> iterator= pascalHearts.keySet().iterator();
		while(iterator.hasNext()) {
			double key= iterator.next();
			Line2D value= new Line2D();
			value.setBegin(pascalMids.get(key));
			value.setEnd(pascalHearts.get(key));
			pascalDirections.put(key, value);
		}
		return pascalDirections;
	}
	
	public static Map<Double, Line3D> getPosition3DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_3D> pascalHearts
			, Map<Double, AMV_MVS_VSQ_3D> pascalMids) {
		Map<Double, Line3D> pascalDirections= new HashMap<>();
		Iterator<Double> iterator= pascalHearts.keySet().iterator();
		while(iterator.hasNext()) {
			double key= iterator.next();
			Line3D value= new Line3D();
			value.setBegin(pascalMids.get(key));
			value.setEnd(pascalHearts.get(key));
			pascalDirections.put(key, value);
		}
		return pascalDirections;
	}
	
	public static Map<Double, Line3D> getPosition3DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_3D> groups, double scale){
		return	getPosition3DsGroupPascalDirection(getPosition3DsGroupPascalHearts(groups, scale)
				,getPosition3DsGroupPascalMids(groups, scale)); 
	}
	
	public static Map<Double, Line2D> getPosition2DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_2D> groups, double scale){
		return	getPosition2DsGroupPascalDirection(getPosition2DsGroupPascalHearts(groups, scale)
				,getPosition2DsGroupPascalMids(groups, scale)); 
	}
}