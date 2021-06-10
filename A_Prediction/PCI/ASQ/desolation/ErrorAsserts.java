package PCI.ASQ.desolation;

import OEU.LYG4DQS4D.LYG9DWithDoubleQuickSort4D;
//import OSI.PCI.ASQ.statistic.LYG4DWithDoubleQuickSort4D;

public class ErrorAsserts{
	//这个函数用于进行精度误差匹配 获取质量是否属于合格状态。
	//inputValue 代表观测成份。
	//matchValues 代表观测参照样本。
	//scale代表误差精度。
	//sortStackRange 根据样本的相同项多少来确定堆栈溢出的适合减少递归树数。
	public boolean getErrorAsserts(double inputValue, double[] matchValues, double scale) {
		double max= inputValue+ scale;
		double min= inputValue- scale;
		for(int i= 0; i< matchValues.length; i++) {
			if(!(matchValues[i]> max|| matchValues[i]< min)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean getBinaryErrorAsserts(double inputValue, double[] matchValues
			, double scale, int sortStackRange, boolean isSort) {
		if(!isSort) {
			//matchValues= new LYG4DWithDoubleQuickSort4D().sort(matchValues, sortStackRange);	
			matchValues= new LYG9DWithDoubleQuickSort4D().sort(matchValues, sortStackRange, 4);	//算法应用更新
		}
		double max= inputValue+ scale;
		double min= inputValue- scale;
		int big= matchValues.length;
		int mid= matchValues.length/ 2;//>>1 有优化空间罗瑶光20210428
		while(big> 0) {
			if(!(matchValues[mid]> max|| matchValues[mid]< min)) {
				return true;
			}
			if(inputValue> matchValues[mid]) {
				mid= (mid+ big)/ 2;//>>1
			}else {
				big= mid;
				mid= mid/ 2;//>>1
			}
		}
		return false;
	}
}
