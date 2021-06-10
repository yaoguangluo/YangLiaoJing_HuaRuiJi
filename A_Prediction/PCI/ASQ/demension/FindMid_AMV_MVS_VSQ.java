package PCI.ASQ.demension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import PCI.ASQ.basic.Euclid;
public class FindMid_AMV_MVS_VSQ{
	//求坐标团的中心。
	public static Map<Double, AMV_MVS_VSQ_2D> getPosition2DGroupsMids(Map<Double, ArrayList<AMV_MVS_VSQ_2D>> groups){
		Map<Double, AMV_MVS_VSQ_2D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findMidPosition2D(groups.get(value)));
		}
		return output;
		
	}
	
	public static Map<Double, AMV_MVS_VSQ_3D> getPosition3DGroupsMids(Map<Double, ArrayList<AMV_MVS_VSQ_3D>> groups){
		Map<Double, AMV_MVS_VSQ_3D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findMidPosition3D(groups.get(value)));
		}
		return output;
	}
}