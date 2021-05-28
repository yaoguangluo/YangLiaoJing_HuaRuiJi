package ME.APM.VSQ.Harrison;
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
		TEMP_list.add(PathLinkFile.HarrisonsPrinciplesofInternalMedicine_18ed1_txt);
		return TEMP_list;
	}
	
	public Map<String, String> listNameToMap(List<String> dic_list) throws IOException{
		Map<String, String> dic_map = new ConcurrentHashMap<String, String>();
		for(int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = this.getClass().getResourceAsStream(name);
			BufferedReader cReader;
			cReader = new BufferedReader(new InputStreamReader(in, "GBK"));  
			String ctempString = null; 
			int index = 0;
			while ((ctempString = cReader.readLine()) != null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para += " "+ctempString;
					if(ctempString.contains("^^")) {
						dic_map.put(name+(index++)+para.substring(0,30), para.replace("\\s+", " ").toLowerCase());
						para="";
					}
				}
			}
			cReader.close();
		}
		return dic_map;
	}
}