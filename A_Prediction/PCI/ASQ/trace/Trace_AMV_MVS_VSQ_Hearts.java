package PCI.ASQ.trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
public class Trace_AMV_MVS_VSQ_Hearts{
	//Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
	//出版日期2019 年 12 月 21 日  作品说明Gitee, Github, DetaOSS
	//作品说明适用于 坐标团 动态分析，增量轨迹分析，熵增信息单元记录。
	//作者 罗瑶光
	public static List<AMV_MVS_VSQ_2D> trackTracePosition2DHeartsWithSingerGroup(List<AMV_MVS_VSQ_2D> coods){
		List<AMV_MVS_VSQ_2D> hearts= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= coods.iterator();
		boolean isFirst= true;
		while(iterator.hasNext()) {
			if(isFirst) {
				isFirst= !isFirst;
				hearts.add(iterator.next());
			}else {
				AMV_MVS_VSQ_2D position2D= iterator.next();
				AMV_MVS_VSQ_2D CryptHeart
				= Euclid.findCryptionPosition2D(hearts.get(hearts.size()- 1), position2D);
				hearts.add(CryptHeart);
			}
		}
		return hearts;
	}
	
	public static List<AMV_MVS_VSQ_3D> trackTracePosition3DHeartsWithSingerGroup(List<AMV_MVS_VSQ_3D> coods){
		List<AMV_MVS_VSQ_3D> hearts= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= coods.iterator();
		boolean isFirst= true;
		while(iterator.hasNext()) {
			if(isFirst) {
				isFirst= !isFirst;
				hearts.add(iterator.next());
			}else {
				AMV_MVS_VSQ_3D position3D= iterator.next();
				AMV_MVS_VSQ_3D CryptHeart
				= Euclid.findCryptionPosition3D(hearts.get(hearts.size()- 1), position3D);
				hearts.add(CryptHeart);
			}
		}
		return hearts;
	}
}