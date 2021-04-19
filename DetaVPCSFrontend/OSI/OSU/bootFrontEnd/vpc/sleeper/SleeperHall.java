package OSI.OSU.bootFrontEnd.vpc.sleeper;
import java.util.Iterator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import OSI.OSU.bootFrontEnd.rest.VPC;
public class SleeperHall{
	private Map<Integer, Sleeper> sleepersMap;
	public SleeperHall(){
		sleepersMap = new ConcurrentHashMap<>();
	}
	
	public int getThreadsCount() {
		return sleepersMap.size();
	}
	
	public void addExecSleeper(Integer sid, Sleeper sleeper) {
		sleepersMap.put(sid, sleeper);
	}
	
	public void removeThreadById(Integer sid) {
		if(sleepersMap.containsKey(sid)){
			sleepersMap.remove(sid);
		}
	}
	
	public void callSkivvy() {
		sleepersMap.clear();
		System.gc();
	}
	
	public int getZipDownloadCount() {
		int output= 0;
		Iterator<Integer> iterator= sleepersMap.keySet().iterator();
		while(iterator.hasNext()) {
			if(VPC.getFilePath(sleepersMap.get(iterator.next())
					.getVPCSRequest().getRequestLink()).contains(".zip")){
				output++;
			}
		}
		return output;
	}
}