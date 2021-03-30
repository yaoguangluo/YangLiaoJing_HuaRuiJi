package org.ASQ.tinos.deta.correction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
public class CorrectionCoosMap{
	//这个函数用于坐标集的计算观测优化。
	//思想 坐标系 平移 欧基里德，笛卡尔
	//实现 罗瑶光
	//range数组 0 为 x轴 ，1 为 y轴 ，2 为z轴 。
	public static double[] getPosition2DRange(List<Position2D> inputs) {
		Iterator<Position2D> iterator= inputs.iterator();
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		double[] range= new double[2];
		if(iterator.hasNext()) {
			Position2D AMV_MVS_VSQ2D= iterator.next();
			xMax= AMV_MVS_VSQ2D.getX();
			xMin= AMV_MVS_VSQ2D.getX();
			yMax= AMV_MVS_VSQ2D.getY();
			yMin= AMV_MVS_VSQ2D.getY();
		}
		while(iterator.hasNext()) {
			Position2D AMV_MVS_VSQ2D= iterator.next();
			if(AMV_MVS_VSQ2D.getX()> xMax) {
				xMax= AMV_MVS_VSQ2D.getX();
			}
			if(AMV_MVS_VSQ2D.getX()< xMin) {
				xMin= AMV_MVS_VSQ2D.getX();
			}
			if(AMV_MVS_VSQ2D.getY()> yMax) {
				yMax= AMV_MVS_VSQ2D.getY();
			}
			if(AMV_MVS_VSQ2D.getY()< yMin) {
				yMin= AMV_MVS_VSQ2D.getY();
			}
		}
		range[0]= xMax- xMin;
		range[1]= yMax- yMin;
		return range;
	}
	
	public static double[] getPosition3DRange(List<Position3D> inputs) {
		Iterator<Position3D> iterator= inputs.iterator();
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		double zMax= 0;
		double zMin= 0;
		double[] range= new double[3];
		if(iterator.hasNext()) {
			Position3D AMV_MVS_VSQ3D= iterator.next();
			xMax= AMV_MVS_VSQ3D.getX();
			xMin= AMV_MVS_VSQ3D.getX();
			yMax= AMV_MVS_VSQ3D.getY();
			yMin= AMV_MVS_VSQ3D.getY();
			zMax= AMV_MVS_VSQ3D.getZ();
			zMin= AMV_MVS_VSQ3D.getZ();
		}
		while(iterator.hasNext()) {
			Position3D AMV_MVS_VSQ3D= iterator.next();
			if(AMV_MVS_VSQ3D.getX()> xMax) {
				xMax= AMV_MVS_VSQ3D.getX();
			}
			if(AMV_MVS_VSQ3D.getX()< xMin) {
				xMin= AMV_MVS_VSQ3D.getX();
			}
			if(AMV_MVS_VSQ3D.getY()> yMax) {
				yMax= AMV_MVS_VSQ3D.getY();
			}
			if(AMV_MVS_VSQ3D.getY()< yMin) {
				yMin= AMV_MVS_VSQ3D.getY();
			}
			if(AMV_MVS_VSQ3D.getZ()> zMax) {
				zMax= AMV_MVS_VSQ3D.getZ();
			}
			if(AMV_MVS_VSQ3D.getZ()< zMin) {
				zMin= AMV_MVS_VSQ3D.getZ();
			}
		}
		range[0]= xMax- xMin;
		range[1]= yMax- yMin;
		range[2]= zMax- zMin;
		return range;
	}
	
	public static List<Position2D> CorrectionPosition2DMap(List<Position2D> inputs
			, double xRange, double yRange){
		List<Position2D> output= new ArrayList<>();
		Iterator<Position2D> iterator= inputs.iterator();
		while(iterator.hasNext()) {
			Position2D AMV_MVS_VSQ2D= iterator.next();
			AMV_MVS_VSQ2D.setX(AMV_MVS_VSQ2D.getX()+ xRange);
			AMV_MVS_VSQ2D.setY(AMV_MVS_VSQ2D.getY()+ yRange);
			output.add(AMV_MVS_VSQ2D);
		}
		return output;
	}
	
	public static List<Position3D> CorrectionPosition3DMap(List<Position3D> inputs
			, double xRange, double yRange, double zRange){
		List<Position3D> output=new ArrayList<>();
		Iterator<Position3D> iterator= inputs.iterator();
		while(iterator.hasNext()) {
			Position3D AMV_MVS_VSQ3D= iterator.next();
			AMV_MVS_VSQ3D.setX(AMV_MVS_VSQ3D.getX()+ xRange);
			AMV_MVS_VSQ3D.setY(AMV_MVS_VSQ3D.getY()+ yRange);
			AMV_MVS_VSQ3D.setZ(AMV_MVS_VSQ3D.getZ()+ zRange);
			output.add(AMV_MVS_VSQ3D);
		}
		return output;
	}
}