package org.ASQ.tinos.deta.pca;
import java.util.Iterator;
import java.util.List;

import org.ASQ.tinos.deta.basic.Distance;
import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
import org.ASQ.tinos.deta.statistic.LYG9DWithDoubleQuickSort4D;
public class FindPCAMeanDistance{
	//oberserverPCAScale：确定主要有效最短路径的观测数
	//sortRangeScale：确定坐标距离排序时的相似成份多少来确定堆栈冗余比，避免堆栈溢出。
	//求坐标团的主要有效距离成份集的平均压强算法
	//适用于 观测/预测坐标集中某精度邻接坐标集的 平均距离 来确定 紧凑度，压力，压强，斥力等。
	//思想：罗瑶光 20191225
	//实现：罗瑶光
	public static double findMeanDistanceFromPositions2D(List<Position2D> AMV_MVS_VSQ2Ds
			, double oberserverPCAScale, int sortRangeScale) {
		Iterator<Position2D> outPosition2DIterator= AMV_MVS_VSQ2Ds.iterator();
		double outMean= 0;
		while(outPosition2DIterator.hasNext()) {
			Position2D outPosition2D= outPosition2DIterator.next();
			double[] distance= new double[AMV_MVS_VSQ2Ds.size()];
			int i= 0;
			Iterator<Position2D> inPosition2DIterator= AMV_MVS_VSQ2Ds.iterator();
			//取坐标点所有距离集合先
			while(inPosition2DIterator.hasNext()) {
				Position2D inPosition2D= inPosition2DIterator.next();
				distance[i++]= Distance.getDistance2D(outPosition2D, inPosition2D);
			}
			//距离非对称缺陷小高峰过滤极速快排 从小到大
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 70);
			//仅仅取精度内坐标点距离求平均值，0 为本身所以从 1 开始
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= AMV_MVS_VSQ2Ds.size()
					? AMV_MVS_VSQ2Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
		}
		return outMean/ AMV_MVS_VSQ2Ds.size();
	}
	
	public static double findMeanDistanceFromPositions3D(List<Position3D> AMV_MVS_VSQ3Ds
			, double oberserverPCAScale, int sortRangeScale) {
		Iterator<Position3D> outPosition3DIterator= AMV_MVS_VSQ3Ds.iterator();
		double outMean= 0;
		while(outPosition3DIterator.hasNext()) {
			Position3D outPosition3D= outPosition3DIterator.next();
			double[] distance= new double[AMV_MVS_VSQ3Ds.size()];
			int i= 0;
			Iterator<Position3D> inPosition3DIterator= AMV_MVS_VSQ3Ds.iterator();
			//取坐标点所有距离集合先
			while(inPosition3DIterator.hasNext()) {
				Position3D inPosition3D= inPosition3DIterator.next();
				distance[i++]= Distance.getDistance3D(outPosition3D, inPosition3D);
			}
			//距离非对称缺陷小高峰过滤极速快排 从小到大
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 70);
			//仅仅取精度内坐标点距离求平均值，0 为本身所以从 1 开始
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= AMV_MVS_VSQ3Ds.size()
					? AMV_MVS_VSQ3Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
		}
		return outMean/ AMV_MVS_VSQ3Ds.size();
	}
	
	//2D坐标团中 每一个坐标的斥力预测算法。
	public static double[] findPascalMeanDistanceByEachPositions2D(List<Position2D> AMV_MVS_VSQ2Ds
			, double oberserverPCAScale, int sortRangeScale) {
		double[] pascal= new double[AMV_MVS_VSQ2Ds.size()];
		Iterator<Position2D> outPosition2DIterator= AMV_MVS_VSQ2Ds.iterator();
		double outMean= 0;
		int AMV_MVS_VSQPoint=0;
		while(outPosition2DIterator.hasNext()) {
			Position2D outPosition2D= outPosition2DIterator.next();
			double[] distance= new double[AMV_MVS_VSQ2Ds.size()];
			int i= 0;
			Iterator<Position2D> inPosition2DIterator= AMV_MVS_VSQ2Ds.iterator();
			//取坐标点所有距离集合先
			while(inPosition2DIterator.hasNext()) {
				Position2D inPosition2D= inPosition2DIterator.next();
				distance[i++]= Distance.getDistance2D(outPosition2D, inPosition2D);
			}
			//距离非对称缺陷小高峰过滤极速快排 从小到大
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 70);
			//仅仅取精度内坐标点距离求平均值，0 为本身所以从 1 开始
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= AMV_MVS_VSQ2Ds.size()
					? AMV_MVS_VSQ2Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
			//采集坐标点形成斥力参照的主要最短路径成份。
			pascal[AMV_MVS_VSQPoint++]= inMean;
		}
		outMean/= AMV_MVS_VSQ2Ds.size();
		for(int i= 0; i< pascal.length; i++) {
			//比值获取 不稳定 观测数据。
			pascal[i]/= outMean;
		}
		return pascal;
	}
	
	//3D坐标团中 每一个坐标的斥力预测算法。
	public static double[] findPascalMeanDistanceByEachPositions3D(List<Position3D> AMV_MVS_VSQ3Ds
			, double oberserverPCAScale, int sortRangeScale) {
		double[] pascal= new double[AMV_MVS_VSQ3Ds.size()];
		Iterator<Position3D> outPosition3DIterator= AMV_MVS_VSQ3Ds.iterator();
		double outMean= 0;
		int AMV_MVS_VSQPoint=0;
		while(outPosition3DIterator.hasNext()) {
			Position3D outPosition3D= outPosition3DIterator.next();
			double[] distance= new double[AMV_MVS_VSQ3Ds.size()];
			int i= 0;
			Iterator<Position3D> inPosition3DIterator= AMV_MVS_VSQ3Ds.iterator();
			//取坐标点所有距离集合先
			while(inPosition3DIterator.hasNext()) {
				Position3D inPosition3D= inPosition3DIterator.next();
				distance[i++]= Distance.getDistance3D(outPosition3D, inPosition3D);
			}
			//距离非对称缺陷小高峰过滤极速快排 从小到大
			distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 70);
			//仅仅取精度内坐标点距离求平均值，0 为本身所以从 1 开始
			double inMean= 0;
			oberserverPCAScale= oberserverPCAScale>= AMV_MVS_VSQ3Ds.size()
					? AMV_MVS_VSQ3Ds.size()- 1: oberserverPCAScale;
			oberserverPCAScale= oberserverPCAScale< 0? 0: oberserverPCAScale;	
			for(i= 1; i<= oberserverPCAScale; i++) {
				inMean+= distance[i];
			}
			inMean/= oberserverPCAScale;
			outMean+= inMean;
			//采集坐标点形成斥力参照的主要最短路径成份。
			pascal[AMV_MVS_VSQPoint++]= inMean;
		}
		outMean/= AMV_MVS_VSQ3Ds.size();
		for(int i= 0; i< pascal.length; i++) {
			//比值获取 不稳定 观测数据。
			pascal[i]/= outMean;
		}
		return pascal;
	}
}