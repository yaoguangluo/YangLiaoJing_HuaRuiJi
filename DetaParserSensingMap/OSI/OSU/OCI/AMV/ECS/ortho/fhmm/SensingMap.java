package OSI.OSU.OCI.AMV.ECS.ortho.fhmm;
import java.io.IOException;
import java.util.Map;

import OSI.OSU.ASQ.PSU.OCI.engine.analysis.Analyzer;
public interface SensingMap{
	void initLenovoMap(Analyzer analyzer) throws IOException;
	public Map<String, Object> getLenovoMap();
	public void setLenovoMap(Map<String, Object> lenovoMap);
}