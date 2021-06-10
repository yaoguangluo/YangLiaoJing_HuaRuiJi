package ESU.object;
import com.google.gson.Gson;
public class Object_ESU{
	public static String objectToJsonString(Gson gson, Object object){
		return gson.toJson(object);
	}
}