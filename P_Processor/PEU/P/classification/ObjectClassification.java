package PEU.P.classification;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//罗瑶光
//昨天有了合并函数,今天就设计分类函数
public class ObjectClassification {
	public static Map<String, Map<String, Object>> mapClassification(Map<String, Object> input, String[] keywords) {
		Map<String, Map<String, Object>> output= new HashMap<>();
		Iterator<String> iterator= input.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			for(int i= 0; i< keywords.length; i++) {
				if(string.contains(keywords[i])) {
					Map<String, Object> map;
					if(output.containsKey(keywords[i])) {
						map= output.get(keywords[i]);
					}else {
						map= new HashMap<>(); 
					}
					map.put(string, input.get(string));
					output.put(keywords[i], map);
				}
			}
		}
		return output;
	}
	
	public static void main(String[] ARGS) {
		Map<String, Object> input= new HashMap<String, Object>();
		String[] keywords= new String[3];
		input.put("罗", "罗");
		input.put("罗", "罗");
		input.put("瑶", "瑶");
		input.put("瑶", "瑶");
		input.put("光", "光");
		input.put("光", "光");
		
		keywords[0]="罗";
		keywords[1]="瑶";
		keywords[2]="光";
		mapClassification(input, keywords);
	}
}