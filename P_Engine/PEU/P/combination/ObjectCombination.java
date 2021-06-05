package PEU.P.combination;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
//ยÞัþนโ
public class ObjectCombination {
	public static Map<String, Object> mapCombination(Map<String, Object> output, Map<String, Object> destination) {
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

	public static List<Object> listCombination(List<Object> output, List<Object> destination) {
		if(null== output) {
			output= new LinkedList<>();
		}
		Iterator<Object> keyIterator= destination.iterator();
		while(keyIterator.hasNext()) {
			output.add(keyIterator.next());
		}
		return output;
	}

	public static int[] intArrayCombination(int[] output, int[] destination) {
		int[] ints= new int[output.length+ destination.length];
		for(int i= 0; i< output.length; i++) {
			ints[i]= output[i];
		} 
		for(int i= 0; i< destination.length; i++) {
			ints[i]= output[output.length+ i];
		} 
		return ints;
	}
	
	public static double[] doubleArrayCombination(double[] output, double[] destination) {
		double[] doubles= new double[output.length+ destination.length];
		for(int i= 0; i< output.length; i++) {
			doubles[i]= output[i];
		} 
		for(int i= 0; i< destination.length; i++) {
			doubles[i]= output[output.length+ i];
		} 
		return doubles;
	}
	
	public static long[] longArrayCombination(long[] output, long[] destination) {
		long[] longs= new long[output.length+ destination.length];
		for(int i= 0; i< output.length; i++) {
			longs[i]= output[i];
		} 
		for(int i= 0; i< destination.length; i++) {
			longs[i]= output[output.length+ i];
		} 
		return longs;
	}
	
	public static float[] floatArrayCombination(float[] output, float[] destination) {
		float[] floats= new float[output.length+ destination.length];
		for(int i= 0; i< output.length; i++) {
			floats[i]= output[i];
		} 
		for(int i= 0; i< destination.length; i++) {
			floats[i]= output[output.length+ i];
		} 
		return floats;
	}
	
	public static String[] StringArrayCombination(String[] output, String[] destination) {
		String[] strings= new String[output.length+ destination.length];
		for(int i= 0; i< output.length; i++) {
			strings[i]= output[i];
		} 
		for(int i= 0; i< destination.length; i++) {
			strings[i]= output[output.length+ i];
		} 
		return strings;
	}
	
	public static char[] charArrayCombination(char[] output, char[] destination) {
		char[] chars= new char[output.length+ destination.length];
		for(int i= 0; i< output.length; i++) {
			chars[i]= output[i];
		} 
		for(int i= 0; i< destination.length; i++) {
			chars[i]= output[output.length+ i];
		} 
		return chars;
	}
	
	public static byte[] byteArrayCombination(byte[] output, byte[] destination) {
		byte[] bytes= new byte[output.length+ destination.length];
		for(int i= 0; i< output.length; i++) {
			bytes[i]= output[i];
		} 
		for(int i= 0; i< destination.length; i++) {
			bytes[i]= output[output.length+ i];
		} 
		return bytes;
	}
	
	public static Vector<Object> vectorCombination(Vector<Object> output, Vector<Object> destination) {
		if(null== output) {
			output= new Vector<>();
		}
		Iterator<Object> keyIterator= destination.iterator();
		while(keyIterator.hasNext()) {
			output.add(keyIterator.next());
		}
		return output;
	}
}