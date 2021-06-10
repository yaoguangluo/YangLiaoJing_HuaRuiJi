package PCI.ASQ.trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

public class TraceFissile_AMV_MVS_VSQ_ByHearts{
	//Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
	//创作日期2020 年 04 月 14 日 作品说明Gitee, Github, DetaOSS
	//这个算法之前个人软著申请有相关的根据坐标计算重心轨迹的算法
	//，这个函数是其反演函数，根据坐标的重心轨迹来求解其坐标集。
	//作品说明适用于 坐标团 动态分析，增量轨迹分析，熵增信息单元记录。
	//作者 罗瑶光
	public static List<AMV_MVS_VSQ_2D> trackTracePosition2DByHearts(List<AMV_MVS_VSQ_2D> hearts){
		List<AMV_MVS_VSQ_2D> trackTracePositions= new ArrayList<>(); 
		Iterator<AMV_MVS_VSQ_2D> iterator= hearts.iterator();
		AMV_MVS_VSQ_2D lastPosition2D= null;
		if(iterator.hasNext()) {
			lastPosition2D= iterator.next();
			trackTracePositions.add(lastPosition2D);	
		}
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_2D heartPostion= iterator.next();
			//position2D.setX((heart.getX()+ oneMore.getX())/ 2);
			//newHeart= (lastHeart+ newp)/2    =>  newp= newHeart*2 -lastHeart  
			//add section 1234
			AMV_MVS_VSQ_2D newPosition2D= new AMV_MVS_VSQ_2D(heartPostion.getX()*2- lastPosition2D.getX()
												   , heartPostion.getY()*2- lastPosition2D.getY());
			trackTracePositions.add(newPosition2D);
			lastPosition2D= heartPostion;
		}
		return trackTracePositions;
	}
	
	public static List<AMV_MVS_VSQ_3D> trackTracePosition3DByHearts(List<AMV_MVS_VSQ_3D> hearts){
		List<AMV_MVS_VSQ_3D> trackTracePositions= new ArrayList<>(); 
		Iterator<AMV_MVS_VSQ_3D> iterator= hearts.iterator();
		AMV_MVS_VSQ_3D lastPosition3D= null;
		if(iterator.hasNext()) {
			lastPosition3D= iterator.next();
			trackTracePositions.add(lastPosition3D);	
		}
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_3D heartPostion= iterator.next();
			//position3D.setX((heart.getX()+ oneMore.getX())/ 2);
			//newHeart= (lastHeart+ newp)/2    =>  newp= newHeart*2 -lastHeart  
			//add section 1234
			AMV_MVS_VSQ_3D newPosition3D= new AMV_MVS_VSQ_3D(heartPostion.getX()* 2- lastPosition3D.getX()
												   , heartPostion.getY()* 2- lastPosition3D.getY()
												   , heartPostion.getZ()* 2- lastPosition3D.getZ());
			trackTracePositions.add(newPosition3D);
			lastPosition3D= heartPostion;
		}
		return trackTracePositions;
	}
}
