package OSI.OPE.MSQ.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dnaSets;

import java.util.HashMap;

import java.util.Map;

public class CMS{
	public Map<String, Map<String, PDN>> javaCMSs;

	public Map<String, Map<String, Map<String, PDN>>> javaCMSsroot;
	
	public void init() {
		// TODO Auto-generated method stub
		javaCMSs= new HashMap<>();
		javaCMSsroot= new HashMap<>();
	}
}