package PCI.ASQ.basic;
import java.util.Iterator;

import java.util.List;

import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//Theory: Euclid
//Application: Yaoguang.luo
public class Euclid{
	public static AMV_MVS_VSQ_2D findHeartPosition2D(List<AMV_MVS_VSQ_2D> List) {
		Iterator<AMV_MVS_VSQ_2D> iterator= List.iterator();
		double sumOfX= 0;
		double sumOfY= 0;
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_2D position2D= iterator.next();
			sumOfX+= position2D.getX();
			sumOfY+= position2D.getY();
		}
		AMV_MVS_VSQ_2D position2D= new AMV_MVS_VSQ_2D();
		position2D.setX(sumOfX/ List.size());
		position2D.setY(sumOfY/ List.size());
		return position2D;
	}
	
	public static AMV_MVS_VSQ_2D findCryptionPosition2D(AMV_MVS_VSQ_2D heart, AMV_MVS_VSQ_2D oneMore) {
		AMV_MVS_VSQ_2D position2D= new AMV_MVS_VSQ_2D();
		position2D.setX((heart.getX()+ oneMore.getX())/ 2);
		position2D.setY((heart.getY()+ oneMore.getY())/ 2);
		return position2D;
	}
	
	public static AMV_MVS_VSQ_3D findHeartPosition3D(List<AMV_MVS_VSQ_3D> List) {
		Iterator<AMV_MVS_VSQ_3D> iterator= List.iterator();
		double sumOfX= 0;
		double sumOfY= 0;
		double sumOfZ= 0;
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_3D position3D= iterator.next();
			sumOfX+= position3D.getX();
			sumOfY+= position3D.getY();
			sumOfZ+= position3D.getZ();
		}
		AMV_MVS_VSQ_3D position3D= new AMV_MVS_VSQ_3D();
		position3D.setX(sumOfX/ List.size());
		position3D.setY(sumOfY/ List.size());
		position3D.setZ(sumOfZ/ List.size());
		return position3D;
	}
	
	public static AMV_MVS_VSQ_3D findCryptionPosition3D(AMV_MVS_VSQ_3D heart, AMV_MVS_VSQ_3D oneMore) {
		AMV_MVS_VSQ_3D position3D= new AMV_MVS_VSQ_3D();
		position3D.setX((heart.getX()+ oneMore.getX())/ 2);
		position3D.setY((heart.getY()+ oneMore.getY())/ 2);
		position3D.setZ((heart.getZ()+ oneMore.getZ())/ 2);
		return position3D;
	}

	public static AMV_MVS_VSQ_2D findMidPosition2D(List<AMV_MVS_VSQ_2D> list) {
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		Iterator<AMV_MVS_VSQ_2D> iterator= list.iterator();
		if(iterator.hasNext()) {
			AMV_MVS_VSQ_2D position2D= iterator.next();
			xMax= position2D.getX();
			xMin= position2D.getX();
			yMax= position2D.getY();
			yMin= position2D.getY();
		}
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_2D position2D= iterator.next();
			if(position2D.getX()> xMax) {
				xMax= position2D.getX();
			}
			if(position2D.getX()< xMin) {
				xMin= position2D.getX();
			}
			if(position2D.getY()> yMax) {
				yMax= position2D.getY();
			}
			if(position2D.getY()< yMin) {
				yMin= position2D.getY();
			}
		}
		AMV_MVS_VSQ_2D mid= new AMV_MVS_VSQ_2D();
		mid.setX((xMin+ xMax)/ 2);
		mid.setY((yMin+ yMax)/ 2);
		return mid;
	}
	
	public static AMV_MVS_VSQ_3D findMidPosition3D(List<AMV_MVS_VSQ_3D> list) {
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		double zMax= 0;
		double zMin= 0;
		Iterator<AMV_MVS_VSQ_3D> iterator= list.iterator();
		if(iterator.hasNext()) {
			AMV_MVS_VSQ_3D position3D= iterator.next();
			xMax= position3D.getX();
			xMin= position3D.getX();
			yMax= position3D.getY();
			yMin= position3D.getY();
			zMax= position3D.getZ();
			zMin= position3D.getZ();
		}
		while(iterator.hasNext()) {
			AMV_MVS_VSQ_3D position3D= iterator.next();
			if(position3D.getX()> xMax) {
				xMax= position3D.getX();
			}
			if(position3D.getX()< xMin) {
				xMin= position3D.getX();
			}
			if(position3D.getY()> yMax) {
				yMax= position3D.getY();
			}
			if(position3D.getY()< yMin) {
				yMin= position3D.getY();
			}
			if(position3D.getZ()> zMax) {
				zMax= position3D.getZ();
			}
			if(position3D.getZ()< zMin) {
				zMin= position3D.getZ();
			}
		}
		AMV_MVS_VSQ_3D mid= new AMV_MVS_VSQ_3D();
		mid.setX((xMin+ xMax)/ 2);
		mid.setY((yMin+ yMax)/ 2);
		mid.setZ((zMin+ zMax)/ 2);
		return mid;
	}
}