package PEU.P.combination;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ObjectCombination {
	//设计个合并函数 罗瑶光
	public static Map<String, Object> MapCombination(Map<String, Object> output, Map<String, Object> destination) {
		if(null== output) {
			output= new HashMap<>();
		}
		Iterator<String> keyIterator= destination.keySet().iterator();
		while(keyIterator.hasNext()) {
			String string= keyIterator.next();		
			if(!output.containsKey(string)) {
				output.put(string, destination.get(string));
			}
		}
		return output;
	}

	//设计个合并函数 罗瑶光
	public static List<Object> ListCombination(List<Object> output, List<Object> destination) {
		if(null== output) {
			output= new LinkedList<>();
		}
		Iterator<Object> keyIterator= destination.iterator();
		while(keyIterator.hasNext()) {
			output.add(keyIterator.next());
		}
		return output;
	}
}