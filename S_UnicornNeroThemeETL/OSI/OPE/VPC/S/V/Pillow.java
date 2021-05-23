package OSI.OPE.VPC.S.V;
import java.util.HashMap;
import java.util.Map;

import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
public class Pillow{
	public static Map<Long, Object> pillowBase;
	public static void register(BootNeroDoc bootNeroDoc) {
		//bootNeroDoc 需要拿出来的数据资源，比如可重用数据，运维数据，可控数据等。
		Map<String, Object>map= new HashMap<>(); 
		//...
		bootNeroDoc.setPillow(map);
		pillowBase.put(bootNeroDoc.getId(), map);
	}
}