package OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.E;
import java.util.Map;

import java.util.concurrent.ConcurrentHashMap;

import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
public class ExecPLSQLImp {
	public static Map<String, Object> ExecPLSQL(String plsql, boolean mod) throws Exception{
		//working for here
		Map<String, Object> output = new ConcurrentHashMap<>();
		//1make container
		output.put("start", "0");
		output.put("countJoins", "0");
		//2make line
		String[] commands = plsql.replace(" ", "").replace("\n", "").split(";");
		String[] acknowledge = null;
		for(String command:commands) {
			acknowledge = command.split(":");
			if(acknowledge[0].equals("setRoot")) {
				PLSQLCommandImp.proceseSetRoot(acknowledge, output);
			}
			if(acknowledge[0].equals("baseName")) {
				PLSQLCommandImp.P_BaseName(acknowledge, output);
			}
			if(acknowledge[0].equals("tableName")) {
				PLSQLCommandImp.P_TableName(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnName")) {
				PLSQLCommandImp.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("changeCulumnName")) {
				PLSQLCommandImp.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnValue")) {
				PLSQLCommandImp.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("join")) {
				PLSQLCommandImp.P_Join(acknowledge, output);
			}
			if(acknowledge[0].equals("condition")) {
				PLSQLCommandImp.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("relation")) {
				PLSQLCommandImp.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("aggregation")) {
				PLSQLCommandImp.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("getCulumns")) {
				PLSQLCommandImp.P_ListNeedStart(acknowledge, output);
			}
			output.put("newCommand", acknowledge[0]);
			PLSQLCommandImp.P_Exec(acknowledge, output, mod);
			output.put("lastCommand", output.get("newCommand"));
		}
		if(null!= acknowledge) {
			if(output.get("start").toString().equals("1")) {
				PLSQLCommandImp.P_Exec(acknowledge, output, mod);
			}
		}
		System.out.println("1");
		PLSQLCommandImp.P_Check(output.get("newCommand").toString(), output, mod);
		return output;
	}

	public static Map<String, Object> ExecPLORM(PLORMInterf orm, boolean b) throws Exception {
		return ExecPLSQL(orm.getPLSQL(), true);
	}
}