package OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.E;
import java.io.File;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager;
import OSI.OPE.MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E.D_RowsImp;
import OSI.OPE.MSI.OP.SM.AOP.MEC.SIQ.SM.OSI.E.I_TablesImp;
import OSI.OPE.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_RowsImp;
import OSI.OPE.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.Q_JoinRowsImp;
import OSI.OPE.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.Q_RowsImp;
import OSI.OPE.MSU.OP.SM.AOP.MEC.SIQ.SM.update.E.U_JoinRowsImp;
import OSI.OPE.MSU.OP.SM.AOP.MEC.SIQ.SM.update.E.U_RowsImp;
import OSI.OPE.OP.SM.AOP.MEC.SIQ.SM.reflection.Base;
import OSI.OPE.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import PEU.P.cache.*;
@SuppressWarnings("unchecked")
public class PLSQLCommandImp {
	public static void proceseSetRoot(String[] acknowledge, Map<String, Object> output) throws Exception {
		String dbPath = acknowledge[1];
		for(int i=2; i<acknowledge.length; i++) {
			dbPath += ":" + acknowledge[i];
		}
		if(null != CacheManager.getCacheInfo("DBPath")) {
			File file = new File(dbPath);
			if(!file.exists()) {
				file.mkdirs();
				Cache c = new Cache();
				c.setValue(dbPath);
				CacheManager.putCache("DBPath", c);
			}else if(file.isFile()) {
				throw new Exception();
			}else if(file.isDirectory()) {
				Cache c = new Cache();
				c.setValue(dbPath);
				CacheManager.putCache("DBPath", c);
			}
		}
	}

	public static void processBaseName(String[] acknowledge, Map<String, Object> object) {
		object.put(acknowledge[0], acknowledge[1]);
	}

	public static void processTableName(String[] acknowledge, Map<String, Object> object) {
		object.put(acknowledge[0], acknowledge[1]);
		object.put("type", acknowledge[2]);
	}

	public static void processListNeedStart(String[] acknowledge, Map<String, Object> object) {
		object.put("start", "1");
		if(object.containsKey(acknowledge[0])) {
			List<String[]> relationValues = (List<String[]>) object.get(acknowledge[0]);
			relationValues.add(acknowledge);
			object.put(acknowledge[0], relationValues);
			return;
		}
		List<String[]> relationValues = new CopyOnWriteArrayList<>();
		relationValues.add(acknowledge);
		object.put(acknowledge[0], relationValues);
	}

	public static void processJoin(String[] acknowledge, Map<String, Object> object) {
		if(object.get("countJoins").toString().equals("1")) {
			object.put("countJoins", "n");
		}
		if(object.get("countJoins").toString().equals("0")) {
			object.put("countJoins", "1");
		}
		object.put("joinBaseName", acknowledge[1]);
		object.put("joinTableName", acknowledge[2]);
	}

	public static void processExec(String[] acknowledge, Map<String, Object> object, boolean mod) throws Exception {
		if(object.get("start").toString().equals("1")) {
			if(!acknowledge[0].equalsIgnoreCase(object.get("lastCommand").toString())
					&&(object.get("lastCommand").toString().contains("changeCulumnName")
							||object.get("lastCommand").toString().contains("culumnValue")
							||object.get("lastCommand").toString().contains("condition")
							||object.get("lastCommand").toString().contains("relation")
							||object.get("lastCommand").toString().contains("aggregation")
							||object.get("lastCommand").toString().contains("getCulumns")
							||object.get("lastCommand").toString().contains("culumnName")
							||object.get("lastCommand").toString().contains("relation"))) {
				processExecKernel(object, mod);
			}
		}
	}
//处理机中心, 别急, 准备验证 罗瑶光
	private static void processExecKernel(Map<String, Object> object, boolean mod) throws Exception{
		if(object.get("type").toString().equalsIgnoreCase("select") && 
				(object.get("countJoins").toString().equalsIgnoreCase("0") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey("condition")) {
				object.put("obj", Q_RowsImp.selectRowsByAttributesOfCondition(object));
			}
			if(object.containsKey("aggregation")) {
				object.put("obj", Q_RowsImp.selectRowsByAttributesOfAggregation(object));
			}
			if(object.containsKey("getCulumns")) {
				object.put("obj", Q_RowsImp.selectRowsByAttributesOfGetCulumns(object));
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("select") && 
				(object.get("countJoins").toString().equalsIgnoreCase("n") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && !object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey("condition")) {
				object.put("joinObj", Q_JoinRowsImp.selectRowsByAttributesOfJoinCondition(object));
			}
			if(object.containsKey("relation")) {
				object.put("obj", Q_JoinRowsImp.selectRowsByAttributesOfJoinRelation(object));
			}
			if(object.containsKey("aggregation")) {
				object.put("obj", Q_JoinRowsImp.selectRowsByAttributesOfJoinAggregation(object));
			}
			if(object.containsKey("getCulumns")) {
				object.put("joinObj", Q_JoinRowsImp.selectRowsByAttributesOfJoinGetCulumns(object));
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("create")){
			if(object.containsKey("culumnName")) {
				I_TablesImp.createTable(object, mod);
			}
			object.remove("recordRows");
		}
		//离散数学的conjuction变换  a^&&b^&&c * kernel[] = (a^&&b^)^^&&c * kernel[] = (a||b)^&&c * kernel[]
		if(object.get("type").toString().equalsIgnoreCase("update") && 
				(object.get("countJoins").toString().equalsIgnoreCase("0") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey("condition")) {
				object.put("updateObj", U_RowsImp.updateRowsByAttributesOfCondition(object, mod));
			}
			if(object.containsKey("aggregation")) {
				object.put("updateObj", U_RowsImp.updateRowsByAttributesOfAggregation(object, mod));
			}
			if(object.containsKey("culumnValue")) {
				U_RowsImp.updateRowsByRecordConditions(object, mod);
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("update") && 
				(object.get("countJoins").toString().equalsIgnoreCase("n") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") && !object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey("condition")) {
				object.put("updateJoinObj", U_JoinRowsImp.updateRowsByAttributesOfJoinCondition(object, mod));
			}
			if(object.containsKey("relation")) {
				object.put("updateObj", U_JoinRowsImp.updateRowsByAttributesOfJoinRelation(object, mod));
			}
			if(object.containsKey("aggregation")) {
				object.put("updateObj", U_JoinRowsImp.updateRowsByAttributesOfJoinAggregation(object, mod));
			}
			if(object.containsKey("culumnValue")) {
				U_RowsImp.updateRowsByRecordConditions(object, mod);
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("insert")) {
			if(object.containsKey("culumnValue")) {
				IU_RowsImp.insertRowByAttributes(object, mod);
			}
		}
		if(object.get("type").toString().equalsIgnoreCase("delete")) {
			if(object.containsKey("condition")) {
				D_RowsImp.deleteRowByAttributesOfCondition(object, mod);
			}
		}
		object.remove("condition");
		object.remove("culumnName");
		object.remove("changeCulumnName");
		object.remove("getCulumns");
		object.remove("relation");
		object.remove("aggregation");
		object.remove("getCulumns");
		object.put("start", "0");
	}
    
	//plsql函数执行指令 正在检查中 罗瑶光 20210405
	public static void processCheck(String acknowledge, Map<String, Object> object, boolean mod) throws Exception {
		if(object.get("start").toString().equals("1")) {
			processExecKernel(object, mod);
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		int totalPages = 0;
		if(obj != null) {
			totalPages = obj.size();
		}
		int rowBeginIndex = object.containsKey("pageBegin")? Integer.valueOf(object.get("pageBegin").toString()):0;
		int rowEndIndex = object.containsKey("pageEnd")?Integer.valueOf(object.get("pageEnd").toString()):totalPages>15?15:totalPages;
		object.put("pageBegin", rowBeginIndex);
		object.put("pageEnd", rowEndIndex);

		String DBPath= CacheManager.getCacheInfo("DBPath").getValue().toString() + "/" + object.get("baseName").toString();
		String DBTablePath = DBPath + "/" + object.get("tableName").toString();
		object.put("tablePath", DBTablePath);
		object.put("returnResult", "success");
		object.put("totalPages", totalPages);
		object.put("loginInfo", "success");
		List<Object> spec = new ArrayList<>();
		Iterator<String> iterator = new ArrayList<String>().iterator();
		if(obj== null || obj.size()< 1) {
			Base base= DetaDBBufferCacheManager.db.getBase(object.get("baseName").toString());
			Table table= base.getTable(object.get("tableName").toString());
			if(null!= table) {
				iterator= table.getSpec().getCulumnTypes().keySet().iterator();
			}
		}else {//进行map 验证检测 罗瑶光 20210405
			Map<String, Object> map= obj.get(0);
			Map<String, Object> objectInMap= (Map<String, Object>)map.get("rowValue");
			iterator = null== objectInMap? null:objectInMap.keySet().iterator();
		}
		if(iterator != null) {
			while(iterator.hasNext()) {
				spec.add(iterator.next());
			}
		}
		object.put("spec", spec);
	}
}