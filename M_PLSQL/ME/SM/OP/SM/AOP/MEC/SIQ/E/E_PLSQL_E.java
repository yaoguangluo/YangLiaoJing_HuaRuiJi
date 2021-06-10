package ME.SM.OP.SM.AOP.MEC.SIQ.E;
import java.util.Map;

import java.util.concurrent.ConcurrentHashMap;

import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
public class E_PLSQL_E {
	public static Map<String, Object> E_PLSQL(String plsql, boolean mod) throws Exception{
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
				PLSQLCommand_E.P_SetRoot(acknowledge, output);
			}
			if(acknowledge[0].equals("baseName")) {
				PLSQLCommand_E.P_BaseName(acknowledge, output);
			}
			if(acknowledge[0].equals("tableName")) {
				PLSQLCommand_E.P_TableName(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnName")) {
				PLSQLCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("changeCulumnName")) {
				PLSQLCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnValue")) {
				PLSQLCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("join")) {
				PLSQLCommand_E.P_Join(acknowledge, output);
			}
			if(acknowledge[0].equals("condition")) {
				PLSQLCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("relation")) {
				PLSQLCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("aggregation")) {
				PLSQLCommand_E.P_ListNeedStart(acknowledge, output);
			}
			if(acknowledge[0].equals("getCulumns")) {
				PLSQLCommand_E.P_ListNeedStart(acknowledge, output);
			}
			output.put("newCommand", acknowledge[0]);
			PLSQLCommand_E.P_E(acknowledge, output, mod);
			output.put("lastCommand", output.get("newCommand"));
		}
		if(null!= acknowledge) {
			if(output.get("start").toString().equals("1")) {
				PLSQLCommand_E.P_E(acknowledge, output, mod);
			}
		}
		System.out.println("1");
		PLSQLCommand_E.P_Check(output.get("newCommand").toString(), output, mod);
		return output;
	}

	public static Map<String, Object> E_PLORM(PLORMInterf orm, boolean b) throws Exception {
		return E_PLSQL(orm.getPLSQL(), true);
	}
}