package PCI.ASQ.demension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import PCI.ASQ.basic.Euclid;
public class FindHeart_AMV_MVS_VSQ{
	//求坐标团的重心。
	public static Map<Double, AMV_MVS_VSQ_2D> getPosition2DGroupsHearts(Map<Double, ArrayList<AMV_MVS_VSQ_2D>> groups){
		Map<Double, AMV_MVS_VSQ_2D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findHeartPosition2D(groups.get(value)));
		}
		return output;
		
	}
	
	public static Map<Double, AMV_MVS_VSQ_3D> getPosition3DGroupsHearts(Map<Double, ArrayList<AMV_MVS_VSQ_3D>> groups){
		Map<Double, AMV_MVS_VSQ_3D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findHeartPosition3D(groups.get(value)));
		}
		return output;
		
	}
}