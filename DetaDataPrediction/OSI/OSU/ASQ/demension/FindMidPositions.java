package OSI.OSU.ASQ.demension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import OSI.OSU.ASQ.basic.Euclid;
public class FindMidPositions{
	//求坐标团的中心。
	public static Map<Double, Position2D> getPosition2DGroupsMids(Map<Double, ArrayList<Position2D>> groups){
		Map<Double, Position2D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findMidPosition2D(groups.get(value)));
		}
		return output;
		
	}
	
	public static Map<Double, Position3D> getPosition3DGroupsMids(Map<Double, ArrayList<Position3D>> groups){
		Map<Double, Position3D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findMidPosition3D(groups.get(value)));
		}
		return output;
	}
}