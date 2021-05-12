package MSV.OSQ.sets;
public class DetaDouble{
	public static double parseDouble(String string) {
		return Double.parseDouble(string.equalsIgnoreCase("NaN")? "0": string);
		//infinit 问题稍后处理.
	}
}