package PCI.ASQ.hint;
import java.util.List;

import PCI.ASQ.basic.Euclid;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import PCI.ASQ.demension.Line2D;
import PCI.ASQ.demension.Line3D;
public class AMV_MVS_VSQ_HintDirection{
	//坐标集隐藏运动趋势预测算法。
	//这个函数适用于在坐标团中观测 中心 与重心的 长度 来预测坐标团的稳定状态和轨迹预判。
	//适用于 游戏，数据建模，化学，物理等领域。
	//思想：流体内部分子力 统计
	//实现：罗瑶光
	public static Line2D getHintDirectionTrendFromPosition2Ds(List<AMV_MVS_VSQ_2D> inputs) {
		AMV_MVS_VSQ_2D mid= Euclid.findMidPosition2D(inputs);
		AMV_MVS_VSQ_2D heart= Euclid.findHeartPosition2D(inputs);
		Line2D line2D= new Line2D();
		line2D.setBegin(mid);
		line2D.setEnd(heart);
		return line2D;	
	} 
	
	public static Line3D getHintDirectionTrendFromPosition3Ds(List<AMV_MVS_VSQ_3D> inputs) {
		AMV_MVS_VSQ_3D mid= Euclid.findMidPosition3D(inputs);
		AMV_MVS_VSQ_3D heart= Euclid.findHeartPosition3D(inputs);
		Line3D line3D= new Line3D();
		line3D.setBegin(mid);
		line3D.setEnd(heart);
		return line3D;	
	} 
}