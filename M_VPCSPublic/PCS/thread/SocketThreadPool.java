package PCS.thread;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class SocketThreadPool{
	private Map<String, SocketThread> poolMap;
	public SocketThreadPool(){
		poolMap = new ConcurrentHashMap<>();
	}
	public int getThreadsCount() {
		return poolMap.size();
	}
	public void addE_Socket(String sid, SocketThread clientSocket) {
		poolMap.put(sid, clientSocket);
	}
	public void removeThreadById(String sid) {
		if(poolMap.containsKey(sid)){
			poolMap.remove(sid);
		}
	}
}