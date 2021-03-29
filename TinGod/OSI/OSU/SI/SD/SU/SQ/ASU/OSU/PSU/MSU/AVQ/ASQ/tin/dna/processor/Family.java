package OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.dna.processor;
import java.util.concurrent.ConcurrentHashMap;
public class Family{
	public ConcurrentHashMap<String, Life> getFamily() {
		return family;
	}

	public void setFamily(ConcurrentHashMap<String, Life> family) {
		this.family = family;
	}

	ConcurrentHashMap<String, Life> family= new ConcurrentHashMap<>();
}