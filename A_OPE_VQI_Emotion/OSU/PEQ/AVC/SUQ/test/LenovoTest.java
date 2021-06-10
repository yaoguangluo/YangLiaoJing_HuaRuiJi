package OSU.PEQ.AVC.SUQ.test;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import AEU.AVC.SUQ.engine.LenovoInit;
import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
public class LenovoTest{
	public static void main(String[] argv) throws IOException {
		//init
		String text = "..请用户 自行添加sample.." + 
				"。";

		LenovoInit lenovoInit = new LenovoInit();
		lenovoInit.init(text);
		Map<String, EmotionSample> environmentSampleMap = lenovoInit.getEnvironmentInit().getEmotionSampleMap();
		Map<String, Object> lenovo = lenovoInit.getSensingMap().getLenovoMap();
		//reduce
		System.out.println("环    境：");
		Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getDistinction()) {
				if(lenovo.containsKey(emotionSample.getDistinction())) {
					System.out.print(lenovo.get(emotionSample.getDistinction()).toString()+" ");
				}else {
					System.out.print(emotionSample.getDistinction()+" ");
				}
			}
		}
		System.out.println("");
		System.out.println("动机联想：");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getMotivation()) {
				if(lenovo.containsKey(emotionSample.getMotivation())) {
					System.out.print(lenovo.get(emotionSample.getMotivation()).toString()+" ");
				}else {
					System.out.print(emotionSample.getMotivation()+" ");
				}
			}
		}
		System.out.println("");
		System.out.println("倾向探索：" );
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getTrending()) {
				if(lenovo.containsKey(emotionSample.getTrending())) {
					System.out.print(lenovo.get(emotionSample.getTrending()).toString()+" ");
				}else {
					System.out.print(emotionSample.getTrending()+" ");
				}
			}
		}

		//reduce
		System.out.println("");
		System.out.println("决策挖掘：");
		Iterator = environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = environmentSampleMap.get(word);
			if(null != emotionSample.getPrediction()) {
				if(lenovo.containsKey(emotionSample.getPrediction())) {
					System.out.print(lenovo.get(emotionSample.getPrediction()).toString()+" ");
				}else {
					System.out.print(emotionSample.getPrediction()+" ");
				}
			}
		}
	}
}