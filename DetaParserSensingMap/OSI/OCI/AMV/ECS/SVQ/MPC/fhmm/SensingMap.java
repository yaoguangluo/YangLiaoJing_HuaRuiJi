package OSI.OCI.AMV.ECS.SVQ.MPC.fhmm;
import java.io.IOException;
import java.util.Map;

import OSI.OPE.ASQ.PSU.OCI.ME.analysis.Analyzer;
public interface SensingMap{
	void initLenovoMap(Analyzer analyzer) throws IOException;
	public Map<String, Object> getLenovoMap();
	public void setLenovoMap(Map<String, Object> lenovoMap);
}