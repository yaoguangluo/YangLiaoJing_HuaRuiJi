package AEU.OPM.VEC.ica;

import java.io.IOException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;

public class EducationRatio{

	public double[] getEducationKernel(String text) throws IOException {
		A _A = new CogsBinaryForest_AE();
		_A.init();
		Map<String, String> pos = _A.getPosCnToCn();
		List<String> sets = _A.parserString(text);
		Map<Integer, WordFrequency> map = _A.getWordFrequencyByReturnSortMap(sets);
		double[] output = new double[StableData.INT_SEVEN];
		output[StableData.INT_ZERO] = sets.size();
		Iterator<Integer> iterator = map.keySet().iterator();
		Here:
			while(iterator.hasNext()) {
				WordFrequency wordFrequency = map.get(iterator.next());
				if(!pos.containsKey(wordFrequency.getWord())) {
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StableData.NLP_ZI_MING)){
					output[StableData.INT_ONE]+= StableData.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StableData.NLP_ZI_DONG)){
					output[StableData.INT_TWO]+= StableData.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StableData.NLP_ZI_WEI)){
					output[StableData.INT_FOUR]+= StableData.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StableData.NLP_ZI_XING)){
					output[StableData.INT_THREE]+= StableData.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StableData.NLP_ZI_FU)){
					output[StableData.INT_FIVE]+= StableData.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StableData.NLP_ZI_JIE)){
					output[StableData.INT_SIX]+= StableData.INT_ONE;
				}
			}	
		return output;
	}

	public double[] getEducationRatioKernel(double[] input) {
		double[] output=new double[input.length];
		for(int i=StableData.INT_ZERO;i<input.length;i++) {
			output[i]=input[i]/input[StableData.INT_ZERO];
		}
		return output;
	}
}