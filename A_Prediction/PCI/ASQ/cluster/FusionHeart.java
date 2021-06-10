package PCI.ASQ.cluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//求融聚团宇宙的重心
//Theory yaoguang.luo 20191219， 欧基里德
//Application yaoguang.luo
public class FusionHeart{
	public static AMV_MVS_VSQ_2D fusionPosition2DHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups){
		List<AMV_MVS_VSQ_2D> hearts= new ArrayList<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			AMV_MVS_VSQ_2D AMV_MVS_VSQHeart= Euclid.findHeartPosition2D(groups.get(value));
			hearts.add(AMV_MVS_VSQHeart);
		}
		return Euclid.findHeartPosition2D(hearts);
	}
	
	public static AMV_MVS_VSQ_3D fusionPosition3DHeart(Map<Double, List<AMV_MVS_VSQ_3D>> groups){
		List<AMV_MVS_VSQ_3D> hearts= new ArrayList<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			AMV_MVS_VSQ_3D AMV_MVS_VSQHeart= Euclid.findHeartPosition3D(groups.get(value));
			hearts.add(AMV_MVS_VSQHeart);
		}
		return Euclid.findHeartPosition3D(hearts);
	}
}
		