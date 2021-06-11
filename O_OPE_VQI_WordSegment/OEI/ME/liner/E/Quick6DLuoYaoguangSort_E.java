package OEI.ME.liner.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
import OCI.ME.liner.C.Quick6DLuoYaoguangSort;
/*
** 快排6小高峰修正算法 作者 罗瑶光
** 快排10小高峰修正算法 作者 罗瑶光 20200921
*/
public class Quick6DLuoYaoguangSort_E implements Quick6DLuoYaoguangSort {
	public void quick6DLuoYaoGuangSortWordFrequency(List<WordFrequency> list, int leftPosition, int rightPosition) {		
		int c= rightPosition- leftPosition+ StableData.INT_ONE;
		if(c>  StableData.INT_FOUR) {
			int pos = partition(list, leftPosition, rightPosition);
			if(leftPosition< pos- StableData.INT_ONE) {
				quick6DLuoYaoGuangSortWordFrequency(list, leftPosition, pos - StableData.INT_ONE);
			}
			if(pos+ StableData.INT_ONE< leftPosition) {
				quick6DLuoYaoGuangSortWordFrequency(list, ++ pos, rightPosition);
			}
			return;
		}
		int i= leftPosition;
		for(int j= i+ StableData.INT_ONE; j< leftPosition+ c; j= i++){
			while(j> leftPosition){
				if (list.get(j).getFrequency()< list.get(--j).getFrequency()) {
					WordFrequency wordFrequency = list.get(j+ StableData.INT_ONE);
					list.set(j+ StableData.INT_ONE, list.get(j));
					list.set(j, wordFrequency);
				}
			}
		}
	}

	public int partition(List<WordFrequency> list, int leftPosition, int rightPosition) {
		int leftPositionNew= leftPosition;
		WordFrequency wordFrequencyX= list.get(leftPosition);
		WordFrequency wordFrequencyY= list.get(rightPosition);
		//小高峰修正边缘均衡开始
		if (wordFrequencyX.getFrequency()< wordFrequencyY.getFrequency()) {
			wordFrequencyY= wordFrequencyX;
		}
		//小高峰修正边缘均衡结束
		while (leftPositionNew++ < rightPosition) {
			while (!(list.get(leftPositionNew++).getFrequency()> wordFrequencyY.getFrequency())
					|| (leftPositionNew> rightPosition)){
			} 
			while (list.get(rightPosition--).getFrequency()> wordFrequencyY.getFrequency()) {
			}  
			if (--leftPositionNew< ++rightPosition){
				WordFrequency wordFrequency= list.get(rightPosition);
				list.set(rightPosition, list.get(leftPositionNew));
				list.set(leftPositionNew, wordFrequency);
			}
		}
		list.set(leftPosition, list.get(rightPosition));
		list.set(rightPosition, wordFrequencyY);
		return rightPosition;
	}

	@SuppressWarnings(StableData.RAW_TYPES)
	public List<WordFrequency> frequencyWordMapToList(Map<String, WordFrequency> map) {
		List<WordFrequency> list= new ArrayList<>();
		Iterator iterator= map.keySet().iterator();
		while (iterator.hasNext()) {
			list.add(map.get(iterator.next()));
		}
		return list;
	}

	@Override
	public void quick6DLuoYaoGuangSortWordFrequency(Map<Integer, WordFrequency> map, int leftPosition,
			int rightPosition) {
	}

	@Override
	public int partition(Map<Integer, WordFrequency> map, int leftPosition, int rightPosition) {
		return StableData.INT_ZERO;
	}

	@Override
	public Map<Integer, WordFrequency> frequencyWordMapToMap(Map<String, WordFrequency> map) {
		return null;
	}
}