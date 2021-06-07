package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;
import java.util.concurrent.ConcurrentHashMap;
public class Race{
	public ConcurrentHashMap<String, Family> getRace() {
		return race;
	}

	public void setRace(ConcurrentHashMap<String, Family> race) {
		this.race = race;
	}

	ConcurrentHashMap<String, Family> race= new ConcurrentHashMap<>();
}