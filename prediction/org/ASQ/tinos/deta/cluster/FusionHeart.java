package org.ASQ.tinos.deta.cluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.ASQ.tinos.deta.basic.Euclid;
import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
//求融聚团宇宙的重心
//Theory yaoguang.luo 20191219， 欧基里德
//Application yaoguang.luo
public class FusionHeart{
	public static Position2D fusionPosition2DHeart(Map<Double, List<Position2D>> groups){
		List<Position2D> hearts= new ArrayList<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			Position2D AMV_MVS_VSQHeart= Euclid.findHeartPosition2D(groups.get(value));
			hearts.add(AMV_MVS_VSQHeart);
		}
		return Euclid.findHeartPosition2D(hearts);
	}
	
	public static Position3D fusionPosition3DHeart(Map<Double, List<Position3D>> groups){
		List<Position3D> hearts= new ArrayList<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			Position3D AMV_MVS_VSQHeart= Euclid.findHeartPosition3D(groups.get(value));
			hearts.add(AMV_MVS_VSQHeart);
		}
		return Euclid.findHeartPosition3D(hearts);
	}
}
		