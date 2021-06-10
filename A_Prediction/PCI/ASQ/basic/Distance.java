package PCI.ASQ.basic;

import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;

//Theory: 勾股定理
//一种仅仅通过坐标差值叠加来计算距离向量的使用方法。
//Application: Yaoguang.luo
public class Distance{
	public static double getDistance2D(AMV_MVS_VSQ_2D begin,AMV_MVS_VSQ_2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		return Math.abs(x)+ Math.abs(y);
	}
	
	public static double getDistance3D(AMV_MVS_VSQ_3D begin,AMV_MVS_VSQ_3D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= begin.getZ()- end.getZ();
		return Math.abs(x)+ Math.abs(y)+ Math.abs(z);
	}
	
	public static double getPythagoreanDistance2D(AMV_MVS_VSQ_2D begin,AMV_MVS_VSQ_2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		return Math.sqrt(x* x+ y* y);
	}
	
	public static double getPythagoreanDistance3D(AMV_MVS_VSQ_3D begin,AMV_MVS_VSQ_3D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= begin.getZ()- end.getZ();
		return Math.sqrt(x* x+ y* y+ z* z);
	}
	
}