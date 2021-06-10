package OCI.AMV.ECS.SVQ.MPC.fhmm.C;
import java.io.IOException;
import java.util.Map;

import OPE.ASQ.PSU.OCI.ME.analysis.C.Analyzer;
public interface SensingMap{
	void initLenovoMap(Analyzer analyzer) throws IOException;
	public Map<String, Object> getLenovoMap();
	public void setLenovoMap(Map<String, Object> lenovoMap);
}