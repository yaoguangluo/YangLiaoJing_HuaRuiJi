package MS.VPC.SH;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class SleeperHall{
	private Map<Integer, Sleeper> sleepersMap;
	public SleeperHall(){
		sleepersMap = new ConcurrentHashMap<>();
	}
	public int getThreadsCount() {
		return sleepersMap.size();
	}
	public void addE_Sleeper(Integer sid, Sleeper sleeper) {
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
}