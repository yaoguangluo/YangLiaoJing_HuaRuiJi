package OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import OCI.ME.analysis.C.Analyzer;
public class SensingMapImp implements SensingMap{
	private Map<String, Object> lenovoMap;
	
	@Override
	public Map<String, Object> getLenovoMap() {
		return this.lenovoMap;
	}

	@Override
	public void setLenovoMap(Map<String, Object> lenovoMap) {
		 this.lenovoMap = lenovoMap;
	}

	@Override
	public void initLenovoMap(Analyzer analyzer) throws IOException {
		lenovoMap= new HashMap<>();
		Map<String, String> CnToEnMap= analyzer.getFullCnToEn();
		Map<String, String> EnToCnMap= analyzer.getEnToCn();
		Iterator<String> iterator= CnToEnMap.keySet().iterator();
		Here:
		while(iterator.hasNext()) {
			String word= iterator.next();
			if(!CnToEnMap.containsKey(word)) {
				continue Here;
			}
			if(!EnToCnMap.containsKey(CnToEnMap.get(word))) {
				lenovoMap.put(word, word);
				continue Here;
			}
			lenovoMap.put(word, EnToCnMap.get(CnToEnMap.get(word)));
		}
	}
}