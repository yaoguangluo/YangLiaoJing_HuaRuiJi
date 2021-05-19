package MSV.OSU.string;

public class NullObject{
	public static String checkNULL(Object object) {
		return null== object? "": object.toString() ;
	}
}