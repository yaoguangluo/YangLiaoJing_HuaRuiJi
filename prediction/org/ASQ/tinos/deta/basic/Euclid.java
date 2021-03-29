package org.ASQ.tinos.deta.basic;
import java.util.Iterator;
import java.util.List;

import org.ASQ.tinos.deta.demension.Position2D;
import org.ASQ.tinos.deta.demension.Position3D;
//Theory: Euclid
//Application: Yaoguang.luo
public class Euclid{
	public static Position2D findHeartPosition2D(List<Position2D> List) {
		Iterator<Position2D> iterator= List.iterator();
		double sumOfX= 0;
		double sumOfY= 0;
		while(iterator.hasNext()) {
			Position2D AMV_MVS_VSQ2D= iterator.next();
			sumOfX+= AMV_MVS_VSQ2D.getX();
			sumOfY+= AMV_MVS_VSQ2D.getY();
		}
		Position2D AMV_MVS_VSQ2D= new Position2D();
		AMV_MVS_VSQ2D.setX(sumOfX/ List.size());
		AMV_MVS_VSQ2D.setY(sumOfY/ List.size());
		return AMV_MVS_VSQ2D;
	}
	
	public static Position2D findCryptionPosition2D(Position2D heart, Position2D oneMore) {
		Position2D AMV_MVS_VSQ2D= new Position2D();
		AMV_MVS_VSQ2D.setX((heart.getX()+ oneMore.getX())/ 2);
		AMV_MVS_VSQ2D.setY((heart.getY()+ oneMore.getY())/ 2);
		return AMV_MVS_VSQ2D;
	}
	
	public static Position3D findHeartPosition3D(List<Position3D> List) {
		Iterator<Position3D> iterator= List.iterator();
		double sumOfX= 0;
		double sumOfY= 0;
		double sumOfZ= 0;
		while(iterator.hasNext()) {
			Position3D AMV_MVS_VSQ3D= iterator.next();
			sumOfX+= AMV_MVS_VSQ3D.getX();
			sumOfY+= AMV_MVS_VSQ3D.getY();
			sumOfZ+= AMV_MVS_VSQ3D.getZ();
		}
		Position3D AMV_MVS_VSQ3D= new Position3D();
		AMV_MVS_VSQ3D.setX(sumOfX/ List.size());
		AMV_MVS_VSQ3D.setY(sumOfY/ List.size());
		AMV_MVS_VSQ3D.setZ(sumOfZ/ List.size());
		return AMV_MVS_VSQ3D;
	}
	
	public static Position3D findCryptionPosition3D(Position3D heart, Position3D oneMore) {
		Position3D AMV_MVS_VSQ3D= new Position3D();
		AMV_MVS_VSQ3D.setX((heart.getX()+ oneMore.getX())/ 2);
		AMV_MVS_VSQ3D.setY((heart.getY()+ oneMore.getY())/ 2);
		AMV_MVS_VSQ3D.setZ((heart.getZ()+ oneMore.getZ())/ 2);
		return AMV_MVS_VSQ3D;
	}

	public static Position2D findMidPosition2D(List<Position2D> list) {
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		Iterator<Position2D> iterator= list.iterator();
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
		Position2D mid= new Position2D();
		mid.setX((xMin+ xMax)/ 2);
		mid.setY((yMin+ yMax)/ 2);
		return mid;
	}
	
	public static Position3D findMidPosition3D(List<Position3D> list) {
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		double zMax= 0;
		double zMin= 0;
		Iterator<Position3D> iterator= list.iterator();
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
		Position3D mid= new Position3D();
		mid.setX((xMin+ xMax)/ 2);
		mid.setY((yMin+ yMax)/ 2);
		mid.setZ((zMin+ zMax)/ 2);
		return mid;
	}
}