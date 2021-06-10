package PCS.VQS.DSU.V;
import java.lang.reflect.Type;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Map;
//import org.json.JSONArray;
import org.json.JSONObject;
//import org.json.XML;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
//VPCS VtoV整合在这里是为了避嫌.
//逐步剔除著作权范围代码, 大家可以看到, 这些注释掉的函数已经说明了我的整个工程 就 没有任何XML的应用. 具体见Deta 的 data swap包. 
//除了两个 JsonObjectToMap 和 ObjectToJsonString(用到 谷歌 的Guson 官方开源 DEMO 原函数) 就没有用到过走四方 时候的VToV函数,
//2019~2020 data swap 著作权申请文档很清晰了.
//罗瑶光 
public class VtoV{
//	public JSONObject XmlToJsonObject(String response ){
//		JSONObject responseJson = XML.toJSONObject(response);
//		return responseJson;
//	}

	public static Map<String, Object> JsonObjectToMap(JSONObject response){
		Gson gson= new Gson();
		Type type= new TypeToken<Map<String, Object>>(){}.getType();
		Map<String, Object> responseMap= gson.fromJson(response.toString(), type);
		return responseMap;
	}

//	public String MapToJsonString(Map<String, Object> response ){
//		Gson gson = new Gson();
//		return gson.toJson(response);
//	}
	
//	public String ListToJsonString(List<Object> response ){
//		Gson gson = new Gson();
//		return gson.toJson(response);
//	}
	
	public String ObjectToJsonString(Object response ){
		Gson gson = new Gson();
		return gson.toJson(response);
	}

//	public Map<String, Object> XmlToMap(String response){
//		JSONObject responseJson = XML.toJSONObject(response);
//		Gson gson = new Gson();
//		Type type = new TypeToken<Map<String, Object>>(){}.getType();
//		Map<String, Object> responseMap =gson.fromJson(responseJson.toString(), type);
//		return responseMap;
//	}

//	public String MapToXml(Map<String, Object> response){
//		Gson gson = new Gson();
//		String json = gson.toJson(response);
//		JSONObject jsonObj = new JSONObject(json);
//		String xml = XML.toString(jsonObj);
//		return xml;	
//	}

//	public List<Object> JsonArrayToList(JSONArray jobj) {
//		List<Object> output = new ArrayList<>();
//		for(int i=0; i<jobj.length(); i++){		
//			Object obj = jobj.get(i);
//			if(obj instanceof JSONObject){
//				output.add(JsonObjectToMap(jobj.getJSONObject(i)));
//			}else if(obj instanceof String){
//				output.add(String.valueOf(obj));
//			}else if(obj instanceof JSONArray){
//				output.add(JsonArrayToList(jobj.getJSONArray(i)));
//			}
//		}
//		return output;	
//	}

//	public Object StringListToJsonString(List<String> sets) {
//		Gson gson = new Gson();
//		return gson.toJson(sets);
//	}
	
}