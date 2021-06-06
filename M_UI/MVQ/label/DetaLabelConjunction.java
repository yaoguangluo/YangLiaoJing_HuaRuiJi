package MVQ.label;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.reportMap.ReportIndex;
//设计 罗瑶光
public class DetaLabelConjunction{
	public static DetaLabelConjunction detaLabelConjunction;
	public Map<String, Boolean> checkSets= new HashMap<>();
	public void init() throws IOException {
		InputStream inputStream= new ReportIndex().getClass().getResourceAsStream("report.txt");
		BufferedReader cReader= new BufferedReader(new InputStreamReader(inputStream));  
		String ctempString= null; 
		while ((ctempString= cReader.readLine()) != null) {  
			if(!ctempString.replace(" ","").equals(""))
				if(!detaLabelConjunction.checkSets.containsKey(ctempString)) {
					detaLabelConjunction.checkSets.put(ctempString, true);
				}
		}
		cReader.close();
	}
	
	public void findAndSetTag(DetaLabel detaLabel, String name) {
		Iterator<String> iterator= detaLabelConjunction.checkSets.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			String subString= name;
			subString= name.substring(0, 1);
			if(name.length()> 2) {
				subString= name.substring(0, 2);
			}
			if(name.length()> 5) {
				subString= name.substring(0, 5);
			}
			if(name.length()> 7) {
				subString= name.substring(0, 7);
			}
			if(name.length()> 8) {
				subString= name.substring(0, 8);
			}	
			if(name.length()> 10) {//之后太长截的取中文的部分
				subString= name.substring(0, 7);
			}		
			if(string.substring(5, 6+ subString.length())
					.toUpperCase().contains(subString.toUpperCase())) {
				detaLabel.setTag(string, true);
			}
		}
	}
}