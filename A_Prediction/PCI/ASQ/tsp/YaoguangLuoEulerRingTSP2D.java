package PCI.ASQ.tsp;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OEU.LYG4DQS4D.LYG9DWithDoubleQuickSort4D;
import PCI.ASQ.basic.Distance;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import PCI.ASQ.demension.Line2D;
import PCI.ASQ.demension.Line3D;

public class YaoguangLuoEulerRingTSP2D{
	//Foundation: Euler
	//Theory: Yaoguang.Luo
	//Application: Yaoguang.Luo 20200114
	public List<Line2D> getYaoguangLuo2DEulerRingTSP2D(List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs){
		//1 annotations 
		List<AMV_MVS_VSQ_2D> AMV_MVS_VSQ2DTag= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_2D> iterator= AMV_MVS_VSQs.iterator();
		int i= 0;
		String tag= "tag";
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_2D AMV_MVS_VSQ2D=  iterator.next();
			AMV_MVS_VSQ2D.setTag(tag+ i++);
			AMV_MVS_VSQ2DTag.add(AMV_MVS_VSQ2D);
		}
		AMV_MVS_VSQs= AMV_MVS_VSQ2DTag;
		//2 get all lines
		List<Line2D> linesMap= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_2D> iteratorOuter= AMV_MVS_VSQs.iterator();
		Map<String, Map<String, String>> indexMap= new HashMap<>();
		i= 0;
		while(iteratorOuter.hasNext()) {
			AMV_MVS_VSQ_2D AMV_MVS_VSQ2DOuter= iteratorOuter.next();
			Iterator<AMV_MVS_VSQ_2D> iteratorInner= AMV_MVS_VSQs.iterator();
			Next:
			while(iteratorInner.hasNext()) {
				AMV_MVS_VSQ_2D AMV_MVS_VSQ2DInner= iteratorOuter.next();
				Line2D line2D= new Line2D();
				line2D.setBegin(AMV_MVS_VSQ2DOuter);
				line2D.setEnd(AMV_MVS_VSQ2DInner);
				//2.1 delete the De-reflection redundant lines
				if(indexMap.containsKey(AMV_MVS_VSQ2DInner.getTag())) {
					continue Next;
				}
				//2.2 delete self AMV_MVS_VSQs lines
				if(!(AMV_MVS_VSQ2DOuter.getX()!=AMV_MVS_VSQ2DInner.getX()
						|| AMV_MVS_VSQ2DOuter.getY()!=AMV_MVS_VSQ2DInner.getY())) {
					continue Next;
				}
				Map<String, String> map= new HashMap<>();
				if(indexMap.containsKey(AMV_MVS_VSQ2DOuter.getTag())) {
					map= indexMap.get(AMV_MVS_VSQ2DOuter.getTag());
				}else {
					map= new HashMap<>();
				}
				map.put(AMV_MVS_VSQ2DInner.getTag(), "");
				indexMap.put(AMV_MVS_VSQ2DOuter.getTag(), map);
				linesMap.add(line2D);
			}
		}
		//3 sort line2D
		double[] distance= new double[AMV_MVS_VSQs.size()];
		Iterator<Line2D> linesKeySets= linesMap.iterator();
		//4 get each distance of line.
		i= 0;
		Map<Double, List<Line2D>> uniqueLines= new HashMap<>();
		while(linesKeySets.hasNext()) {
			Line2D line2D= linesKeySets.next();
			double distanceDouble= Distance.getDistance2D(line2D.getBegin(), line2D.getEnd());
			List<Line2D> list;
			if(uniqueLines.containsKey(distanceDouble)) {
				list= uniqueLines.get(distanceDouble);
			}else {
				list= new ArrayList<>();
				//5 normalization the unique key of the distance
				distance[i++]= distanceDouble;
			}
			list.add(line2D);
			uniqueLines.put(distanceDouble, list);
		}
		//6 Yaoguangluo's 4D Peak filter Theory Quick Sort the Distance Array
		int sortRangeScale= 4; //my default is 4. you should change it as your want.
		//distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
		distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 4);//算法应用更新
		//7 From small to big loop the distance and make a condition tree.
		List<Line2D> outputLine2D= new ArrayList<>(); 
		Map<String, Double> outputDouble2D= new HashMap<>(); 
		for(i= 0; i< distance.length; i++) {
			List<Line2D> list= uniqueLines.get(distance[i]);
			Iterator<Line2D> iteratorLines= list.iterator();
			Here:
				while(iteratorLines.hasNext()) {
					Line2D line2D= iteratorLines.next();
					AMV_MVS_VSQ_2D begin= line2D.getBegin();
					AMV_MVS_VSQ_2D end= line2D.getEnd();
					//8 decision tree add rights line
					if(outputDouble2D.containsKey(begin.getTag())) {
						double beginTimes= outputDouble2D.get(begin.getTag()).doubleValue();
						if(outputDouble2D.containsKey(end.getTag())) {	 
							double endTimes= outputDouble2D.get(end.getTag()).doubleValue();
							if(beginTimes> 1|| endTimes> 1) {
								continue Here;
							}
							outputDouble2D.put(begin.getTag(), beginTimes+ 1);
							outputDouble2D.put(end.getTag(), endTimes+ 1);
						}else {
							if(beginTimes> 1) {
								continue Here;
							}
							outputDouble2D.put(begin.getTag(), beginTimes+ 1);
							outputDouble2D.put(end.getTag(), 1.0);
						}
					}else {
						if(outputDouble2D.containsKey(end.getTag())) {
							double endTimes= outputDouble2D.get(end.getTag()).doubleValue();
							if(endTimes> 1) {
								continue Here;
							}
							outputDouble2D.put(begin.getTag(), 1.0);
							outputDouble2D.put(end.getTag(), endTimes+ 1);
						}else {
							outputDouble2D.put(begin.getTag(), 1.0);
							outputDouble2D.put(end.getTag(), 1.0);
						}
					}	
					outputLine2D.add(line2D);
				}	
		}
		return outputLine2D;	
	}
	
	public List<Line3D> getYaoguangLuo3DEulerRingTSP2D(List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs){
		//1 annotations 
		List<AMV_MVS_VSQ_3D> AMV_MVS_VSQ3DTag= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_3D> iterator= AMV_MVS_VSQs.iterator();
		int i= 0;
		String tag= "tag";
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_3D AMV_MVS_VSQ3D=  iterator.next();
			AMV_MVS_VSQ3D.setTag(tag+ i++);
			AMV_MVS_VSQ3DTag.add(AMV_MVS_VSQ3D);
		}
		AMV_MVS_VSQs= AMV_MVS_VSQ3DTag;
		//2 get all lines
		List<Line3D> linesMap= new ArrayList<>();
		Iterator<AMV_MVS_VSQ_3D> iteratorOuter= AMV_MVS_VSQs.iterator();
		Map<String, Map<String, String>> indexMap= new HashMap<>();
		i= 0;
		while(iteratorOuter.hasNext()) {
			AMV_MVS_VSQ_3D AMV_MVS_VSQ3DOuter= iteratorOuter.next();
			Iterator<AMV_MVS_VSQ_3D> iteratorInner= AMV_MVS_VSQs.iterator();
			Next:
			while(iteratorInner.hasNext()) {
				AMV_MVS_VSQ_3D AMV_MVS_VSQ3DInner= iteratorOuter.next();
				Line3D line3D= new Line3D();
				line3D.setBegin(AMV_MVS_VSQ3DOuter);
				line3D.setEnd(AMV_MVS_VSQ3DInner);
				//2.1 delete the De-reflection redundant lines
				if(indexMap.containsKey(AMV_MVS_VSQ3DInner.getTag())) {
					continue Next;
				}
				//2.2 delete self AMV_MVS_VSQs lines
				if(!(AMV_MVS_VSQ3DOuter.getX()!= AMV_MVS_VSQ3DInner.getX()
						|| AMV_MVS_VSQ3DOuter.getY()!= AMV_MVS_VSQ3DInner.getY()
						|| AMV_MVS_VSQ3DOuter.getZ()!= AMV_MVS_VSQ3DInner.getZ())) {
					continue Next;
				}
				Map<String, String> map= new HashMap<>();
				if(indexMap.containsKey(AMV_MVS_VSQ3DOuter.getTag())) {
					map= indexMap.get(AMV_MVS_VSQ3DOuter.getTag());
				}else {
					map= new HashMap<>();
				}
				map.put(AMV_MVS_VSQ3DInner.getTag(), "");
				indexMap.put(AMV_MVS_VSQ3DOuter.getTag(), map);
				linesMap.add(line3D);
			}
		}
		//3 sort line3D
		double[] distance= new double[AMV_MVS_VSQs.size()];
		Iterator<Line3D> linesKeySets= linesMap.iterator();
		//4 get each distance of line.
		i= 0;
		Map<Double, List<Line3D>> uniqueLines= new HashMap<>();
		while(linesKeySets.hasNext()) {
			Line3D line3D= linesKeySets.next();
			double distanceDouble= Distance.getDistance3D(line3D.getBegin(), line3D.getEnd());
			List<Line3D> list;
			if(uniqueLines.containsKey(distanceDouble)) {
				list= uniqueLines.get(distanceDouble);
			}else {
				list= new ArrayList<>();
				//5 normalization the unique key of the distance
				distance[i++]= distanceDouble;
			}
			list.add(line3D);
			uniqueLines.put(distanceDouble, list);
		}
		//6 Yaoguangluo's 4D Peak filter Theory Quick Sort the Distance Array
		int sortRangeScale= 4; //my default is 4. you should change it as your want.
		//distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
		distance= new LYG9DWithDoubleQuickSort4D().sort(distance, sortRangeScale, 4);//算法应用更新
		//7 From small to big loop the distance and make a condition tree.
		List<Line3D> outputLine3D= new ArrayList<>(); 
		Map<String, Double> outputDouble3D= new HashMap<>(); 
		for(i= 0; i< distance.length; i++) {
			List<Line3D> list= uniqueLines.get(distance[i]);
			Iterator<Line3D> iteratorLines= list.iterator();
			Here:
				while(iteratorLines.hasNext()) {
					Line3D line3D= iteratorLines.next();
					AMV_MVS_VSQ_3D begin= line3D.getBegin();
					AMV_MVS_VSQ_3D end= line3D.getEnd();
					//8 decision tree add rights line
					if(outputDouble3D.containsKey(begin.getTag())) {
						double beginTimes= outputDouble3D.get(begin.getTag()).doubleValue();
						if(outputDouble3D.containsKey(end.getTag())) {	 
							double endTimes= outputDouble3D.get(end.getTag()).doubleValue();
							if(beginTimes> 1|| endTimes> 1) {
								continue Here;
							}
							outputDouble3D.put(begin.getTag(), beginTimes+ 1);
							outputDouble3D.put(end.getTag(), endTimes+ 1);
						}else {
							if(beginTimes> 1) {
								continue Here;
							}
							outputDouble3D.put(begin.getTag(), beginTimes+ 1);
							outputDouble3D.put(end.getTag(), 1.0);
						}
					}else {
						if(outputDouble3D.containsKey(end.getTag())) {
							double endTimes= outputDouble3D.get(end.getTag()).doubleValue();
							if(endTimes> 1) {
								continue Here;
							}
							outputDouble3D.put(begin.getTag(), 1.0);
							outputDouble3D.put(end.getTag(), endTimes+ 1);
						}else {
							outputDouble3D.put(begin.getTag(), 1.0);
							outputDouble3D.put(end.getTag(), 1.0);
						}
					}	
					outputLine3D.add(line3D);
				}	
		}
		return outputLine3D;	
	}
}