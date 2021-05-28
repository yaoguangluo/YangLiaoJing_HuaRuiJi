package ME.APM.VSQ.guJiJingDian;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import ME.S.stables.PathLinkFile;

import java.util.List;
import java.util.Map;
public class Dictionary{	
	public List<String> dic_list;
	public Map<String, String> dic_map;
	public List<String> txtToListName() throws IOException{
		List<String> TEMP_list = new ArrayList<>();
		TEMP_list.add(PathLinkFile.黄帝内经_txt);
		TEMP_list.add(PathLinkFile.景岳全书_txt);
		TEMP_list.add(PathLinkFile.房中补益_唐_孙思邈_txt);
		TEMP_list.add(PathLinkFile.脉经_txt);
		TEMP_list.add(PathLinkFile.八十一难经_汉_扁鹊_txt);
		TEMP_list.add(PathLinkFile.中藏经_txt);
		TEMP_list.add(PathLinkFile.金匮要略_txt);
		return TEMP_list;
	}
	
	public Map<String, String> listNameToMap(List<String> dic_list) throws IOException{
		Map<String, String> dic_map = new ConcurrentHashMap<String, String>();
		for(int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = this.getClass().getResourceAsStream(name);
			BufferedReader cReader;
//			if(name.equalsIgnoreCase(PathLinkFile.保婴撮要_明_薛铠_txt) 
//					|| name.equalsIgnoreCase(PathLinkFile.慈幼便览_清_佚名_txt)) {
//				 cReader = new BufferedReader(new InputStreamReader(in, "UTF-16"));  
//			}else {
				 cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
			//}
			String ctempString = null; 
			int index = 0;
			while ((ctempString = cReader.readLine()) != null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para += ctempString;
					if(ctempString.replace(" ", "").contains("^^")) {	
						dic_map.put(name+(index++), para.replace("\\s+", " "));
						para="";
					}
				}
			}
			cReader.close();
		}
		return dic_map;
	}
}