package ME.APM.VSQ.zhongYiFuChan;
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
		TEMP_list.add(PathLinkFile.傅青主女科歌括_清_傅山_txt);
		TEMP_list.add(PathLinkFile.保婴撮要_明_薛铠_txt);
		TEMP_list.add(PathLinkFile.保幼新编_清_卢光履_txt);
		TEMP_list.add(PathLinkFile.慈幼便览_清_佚名_txt);
		TEMP_list.add(PathLinkFile.儿科萃精__陈守真_txt);
		TEMP_list.add(PathLinkFile.妇科百辩_明_庄履严_txt);
		TEMP_list.add(PathLinkFile.妇科秘书___txt);
		TEMP_list.add(PathLinkFile.妇科玉尺_清_沈金鳌_txt);
		TEMP_list.add(PathLinkFile.妇人良方集要_宋_陈自明_txt);
		TEMP_list.add(PathLinkFile.傅青主女科_明_傅山_txt); 
		TEMP_list.add(PathLinkFile.傅青主男科重编考释_明_傅山_txt); 
		return TEMP_list;
	}
	
	public Map<String, String> listNameToMap(List<String> dic_list) throws IOException{
		Map<String, String> dic_map = new ConcurrentHashMap<String, String>();
		for(int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = this.getClass().getResourceAsStream(name);
			BufferedReader cReader;
			if(name.equalsIgnoreCase(PathLinkFile.保婴撮要_明_薛铠_txt) 
					|| name.equalsIgnoreCase(PathLinkFile.慈幼便览_清_佚名_txt)
							|| name.equalsIgnoreCase(PathLinkFile.傅青主女科歌括_清_傅山_txt)) {
				 cReader= new BufferedReader(new InputStreamReader(in, "UTF-16"));  
			}else {
				 cReader= new BufferedReader(new InputStreamReader(in, "GBK"));  
			}
			String ctempString= null; 
			int index= 0;
			while ((ctempString= cReader.readLine())!= null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para+= ctempString;
					if(ctempString.replace(" ", "").contains("^^")) {	
						dic_map.put(name+(index++), para.replace("\\s+", " "));
						para= "";
					}
				}
			}
			cReader.close();
		}
		return dic_map;
	}
}