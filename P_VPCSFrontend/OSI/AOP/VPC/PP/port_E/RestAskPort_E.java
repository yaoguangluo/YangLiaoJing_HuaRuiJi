package OSI.AOP.VPC.PP.port_E;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import ESU.json.Json_ESU;
import PCS.VQS.DSU.V.VtoV;
import VPC.VQS.DSU.utils.DetaFrontEndUtil;

public class RestAskPort_E{// implements RestAskPort {
	@SuppressWarnings("deprecation")
	public static Map<String, Object> ask(String ip, String token, String message, String pointIp) throws Exception {
		String json= null;
		if(token!= null && !token.equalsIgnoreCase("undefined")){
			json= DetaFrontEndUtil.backEndRequest("checkStatus?token=" + URLEncoder.encode(token));
		}
		Map<String, Object> jsonCheckMap;
		boolean jsonCheck= true;
		if(null== json){
			jsonCheckMap= new HashMap<String, Object>();
			jsonCheckMap.put("usrName", "匿名咨询师");
			jsonCheck= false;
		}else if(json.contains("unsuccess")){
			jsonCheck= false;
		}
		if(jsonCheck){
			jsonCheckMap= VtoV.JsonObjectToMap(new JSONObject(json));	
			Map<String, Object> out = new HashMap<>();
			String object= DetaFrontEndUtil.cacheRequest("get?key=" + pointIp + "&email=" 
					+ URLEncoder.encode("313699483@qq.com", "UTF-8") + "&password=" + URLEncoder.encode("Fengyue1985!", "UTF-8"));
			boolean check= true;
			if(null== object){
				check= false;
			}else if(object.contains("unsuccess")){
				check= false;
			}
			JSONArray jobj= null;
			if(check){
				JSONArray newjobj = new JSONArray();
				Object listArray = new JSONTokener(object).nextValue();
				if (listArray instanceof JSONArray){
					jobj = new JSONArray(object);
				}else{
					jobj = new JSONArray();
					JSONObject jsobj = new JSONObject(object);
					jobj.put(jsobj);
				}
				for(int i=0;i<jobj.length();i++){
					JSONObject obj = (JSONObject) jobj.get(i);
					Map<String, Object> map = VtoV.JsonObjectToMap(obj);
					map.put("isRead", "true");
					newjobj.put(map);
				}
				jobj = newjobj;
			}else{
				jobj = new JSONArray();
			}
			Map<String, Object> talk = new HashMap<>();
			talk.put("object", jsonCheckMap.get("usrName"));
			talk.put("message", message);
			talk.put("time", System.currentTimeMillis());
			talk.put("isRead", "false");
			jobj.put(talk);
			DetaFrontEndUtil.cacheRequest("put?key=" + pointIp + "&value=" + URLEncoder.encode(jobj.toString(), "UTF-8") 
			+ "&time=" + (System.currentTimeMillis()+900000) 
			+ "&email=" + URLEncoder.encode("313699483@qq.com", "UTF-8") + "&password=" + URLEncoder.encode("Fengyue1985!", "UTF-8"));
			out.put("obj", Json_ESU.jsonArrayToList(jobj));// 修正首字母大小写, 上面账号的个人qq sample密码已经更换,只是个示例而已.
			out.put("loginInfo", "success");
			out.put("returnResult", "发送成功");
			return out;
		}
		Map<String, Object> out = new HashMap<>();
		String object = DetaFrontEndUtil.cacheRequest("get?key=" + "Ask:" + ip + "&email=" 
				+ URLEncoder.encode("313699483@qq.com", "UTF-8") + "&password=" + URLEncoder.encode("Fengyue1985!", "UTF-8"));
		boolean check = true;
		if(null == object){
			check = false;
		}else if(object.contains("unsuccess")){
			check = false;
		}
		JSONArray jobj = null;
		if(check){
			JSONArray newjobj = new JSONArray();
			Object listArray = new JSONTokener(object).nextValue();
			if (listArray instanceof JSONArray){
				jobj = new JSONArray(object);
			}else{
				jobj = new JSONArray();
				JSONObject jsobj = new JSONObject(object);
				jobj.put(jsobj);
			}
			for(int i=0;i<jobj.length();i++){
				JSONObject obj = (JSONObject) jobj.get(i);
				Map<String, Object> map = VtoV.JsonObjectToMap(obj);
				map.put("isRead", "true");
				newjobj.put(map);
			}
			jobj = newjobj;
		}else{
			jobj = new JSONArray();
		}
		Map<String, Object> talk = new HashMap<>();
		talk.put("object", "Guest");
		talk.put("message", message);
		talk.put("time", System.currentTimeMillis());
		talk.put("isRead", "false");
		jobj.put(talk);
		DetaFrontEndUtil.cacheRequest("put?key=" + "Ask:" + ip + "&value=" + URLEncoder.encode(jobj.toString(), "UTF-8") 
		+ "&time=" +(System.currentTimeMillis()+900000) 
		+ "&email=" + URLEncoder.encode("313699483@qq.com", "UTF-8") + "&password=" + URLEncoder.encode("Fengyue1985!", "UTF-8"));
		out.put("obj",Json_ESU.jsonArrayToList(jobj));
		out.put("loginInfo", "success");
		out.put("returnResult", "发送成功");
		return out;
	}

	@SuppressWarnings("deprecation")
	public static Map<String, Object> feedBack(String ip, String token, String pointIp) throws Exception {
		String json = null;
		if(null != token && !token.equals("undefined")){
			json = DetaFrontEndUtil.backEndRequest("checkStatus?token=" + URLEncoder.encode(token));
		}
		Map<String, Object> jsonCheckMap;
		boolean jsonCheck = true;
		if(null == json){
			jsonCheckMap = new HashMap<String, Object>();
			jsonCheckMap.put("usrName", "匿名咨询师");
			jsonCheck = false;
		}else if(json.contains("unsuccess")){
			jsonCheck = false;
		}
		if(jsonCheck){
			jsonCheckMap = VtoV.JsonObjectToMap(new JSONObject(json));	
			Map<String, Object> out = new HashMap<>();
			String object = DetaFrontEndUtil.cacheRequest("get?key=" + URLEncoder.encode(pointIp, "UTF-8") 
			+ "&email=" + URLEncoder.encode("313699483@qq.com") + "&password=" + URLEncoder.encode("Fengyue1985!", "UTF-8"));
			boolean check = true;
			if(null == object){
				check = false;
			}
			if(object.contains("unsuccess")){
				check = false;
			}
			JSONArray jobj;
			if(check){
				Object listArray = new JSONTokener(object).nextValue();
				if (listArray instanceof JSONArray){
					jobj = new JSONArray(object);
				}else{
					jobj = new JSONArray();
					JSONObject jsobj = new JSONObject(object);
					jobj.put(jsobj);
				}
				out.put("obj", Json_ESU.jsonArrayToList(jobj));
				out.put("loginInfo", "success");
				out.put("returnResult", "发送成功");
			}else{
				jobj = new JSONArray();
				out.put("obj", Json_ESU.jsonArrayToList(jobj));
				out.put("loginInfo", "unsuccess");
				out.put("returnResult", "数据超时");
			}
			return out;
		}
		Map<String, Object> out = new HashMap<>();
		String object = DetaFrontEndUtil.cacheRequest("get?key=" + "Ask:" + URLEncoder.encode(ip, "UTF-8") + "&email=" 
				+ URLEncoder.encode("313699483@qq.com") + "&password=" + URLEncoder.encode("Fengyue1985!", "UTF-8"));
		boolean check = true;
		if(null == object){
			check = false;
		}else if(object.contains("unsuccess")){
			check = false;
		}
		JSONArray jobj;
		if(check){
			Object listArray = new JSONTokener(object).nextValue();
			if (listArray instanceof JSONArray){
				jobj = new JSONArray(object);
			}else{
				jobj = new JSONArray();
				JSONObject jsobj = new JSONObject(object);
				jobj.put(jsobj);
			}
			out.put("obj",Json_ESU.jsonArrayToList(jobj));
			out.put("loginInfo", "success");
			out.put("returnResult", "发送成功");
		}else{
			jobj = new JSONArray();
			out.put("obj", Json_ESU.jsonArrayToList(jobj));
			out.put("loginInfo", "unsuccess");
			out.put("returnResult", "数据超时");
		}
		return out;
	}

	@SuppressWarnings("deprecation")
	public static Map<String, Object> getAskers(String token) throws Exception {
		String json=null;
		if(null != token){
			json = DetaFrontEndUtil.backEndRequest("checkStatus?token=" + URLEncoder.encode(token));
		}
		Map<String, Object> jsonCheckMap;
		boolean jsonCheck = true;
		if(null == json){
			jsonCheckMap = new HashMap<String, Object>();
			jsonCheckMap.put("usrName", "匿名咨询师");
			jsonCheck = false;
		}else if(json.contains("unsuccess")){
			jsonCheck = false;
		}
		if(jsonCheck){
			jsonCheckMap = VtoV.JsonObjectToMap(new JSONObject(json));	
			Map<String, Object> out = new HashMap<>();
			String object = DetaFrontEndUtil.cacheRequest("getAskers?email=" 
					+ URLEncoder.encode("313699483@qq.com") + "&password=" + URLEncoder.encode("Fengyue1985!"));
			boolean check = true;
			if(null == object){
				check = false;
			}else if(object.contains("unsuccess")){
				check = false;
			}
			JSONArray jobj;
			if(check){
				Object listArray = new JSONTokener(object).nextValue();
				if (listArray instanceof JSONArray){
					jobj = new JSONArray(object);
				}else{
					jobj = new JSONArray();
					JSONObject jsobj = new JSONObject(object);
					jobj.put(jsobj);
				}
				out.put("obj", Json_ESU.jsonArrayToList(jobj));
				out.put("loginInfo", "success");
				out.put("returnResult", "发送成功");
			}else{
				jobj = new JSONArray();
				out.put("obj", Json_ESU.jsonArrayToList(jobj));
				out.put("loginInfo", "unsuccess");
				out.put("returnResult", "数据超时");
			}
			return out;
		}
		Map<String, Object> out = new HashMap<>();
		out.put("obj", new ArrayList<Object>());
		out.put("loginInfo", "unsuccess");
		out.put("returnResult", "数据超时");
		return out;
	}

	public static Map<String, Object> recordIp(String string) {
		Map<String, Object> out = new HashMap<>();
		out.put("loginInfo", "success");
		out.put("returnResult", "已经获取");
		return out;
	}

	public static String dataWS(String string) throws IOException {
		String object= DetaFrontEndUtil.backEndRequest("dataWS?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataCX(String string) throws UnsupportedEncodingException, IOException {
		String object = DetaFrontEndUtil.backEndRequest("dataCX?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataCY(String string) throws UnsupportedEncodingException, IOException {
		String object = DetaFrontEndUtil.backEndRequest("dataCY?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataCG(String string) throws UnsupportedEncodingException, IOException {
		String object = DetaFrontEndUtil.backEndRequest("dataCG?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataCJ(String string) throws UnsupportedEncodingException, IOException {
		String object = DetaFrontEndUtil.backEndRequest("dataCJ?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataCL(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.backEndRequest("dataCL?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataXX(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.backEndRequest("dataXX?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataHF(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.backEndRequest("dataHF?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataCP(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.backEndRequest("dataCP?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataZF(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.backEndRequest("dataZF?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataXL(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.backEndRequest("dataXL?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataRN(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.backEndRequest("dataRN?input=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataZY(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.huaRuiJiRequest("dataZY?medicine=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}

	public static String dataXY(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.huaRuiJiRequest("dataXY?medicine=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}
	
	public static String dataYT(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.huaRuiJiRequest("dataYT?medicine=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}
	
	public static String dataXT(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.huaRuiJiRequest("dataXT?medicine=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}
	
	public static String dataZT(String string) throws UnsupportedEncodingException, IOException {
		String object= DetaFrontEndUtil.huaRuiJiRequest("dataZT?medicine=" + URLEncoder.encode(string, "UTF-8"));
		return object;
	}
}