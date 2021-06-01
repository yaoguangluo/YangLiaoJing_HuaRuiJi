package OPM.ESU.admin;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.App;
import ME.APM.VSQ.zhongYao.Dictionary;
import ME.APM.VSQ.zhongYao.DictionaryFromDB;
import OSV.VCQ.standard.DictionaryStandardDB;
import PEU.P.combination.ObjectCombination;

//作者 罗瑶光
//准备设计一个 数据库读取frequency 方案函数, 之后数据编辑页都走这个函数.
//先做单例类集合, 稍后逐渐分出继承子类.
//这个例子为中医药材集合.
public class DBReadMode{

	public static void aCommonReadWay(App app) throws IOException {
		//1首先如果有配置,按配置来读表
		//1.1输出结果有txt配置选勾读txt
		if(app.bootDBInTXTWay) {
			//...
			readDBInTXTWay(app);
			return;
		}
		//有数据表配置选勾就读数据表
		if(app.bootDBInBaseWay) {
			//...
			readDBInBaseWay(app);
			return;
		}
		//有web接口请求配置选勾就读web上的rest请求数据
		if(app.bootDBInWebWay) {
			readDBInWebWay(app);
			//...
			return;
		}

		//2如果没有配置就按流水线读表
		//2.1 有txt先读txt
		readDBInTXTWay(app);
		//2.2 有数据表就读读数据表
		readDBInBaseWay(app);
		//2.3 有web接口请求就读web上的rest请求数据
		readDBInWebWay(app);
		//2.4 输出结果.
	}

	public static void readDBInTXTWay(App app) throws IOException {
		Dictionary d= new Dictionary();
		List<String> dic_list= d.txtToList();
		try {
			app.dic_map= d.listToMap(dic_list);
			app.dic_yw= app.dic_map;
			app.dic_index= new DictionaryFromDB().mapToIndex(app.dic_map);
			ObjectCombination.mapCombination(app.dic_li, d.mapToMap_li(app.dic_map));
			ObjectCombination.mapCombination(app.dic_hai, d.mapToMap_hai(app.dic_map));
			ObjectCombination.mapCombination(app.dic_xz, d.mapToMap_xz(app.dic_map));
			ObjectCombination.mapCombination(app.dic_ya, d.mapToMap_ya(app.dic_map));
			ObjectCombination.mapCombination(app.dic_jm, d.mapToMap_jm(app.dic_map));
			ObjectCombination.mapCombination(app.dic_xw, d.mapToMap_xw(app.dic_map));
			ObjectCombination.mapCombination(app.dic_cy, d.mapToMap_cy(app.dic_map));
			ObjectCombination.mapCombination(app.dic_jj, d.mapToMap_jj(app.dic_map));
			ObjectCombination.mapCombination(app.dic_zf, d.mapToMap_zf(app.dic_map));
			ObjectCombination.mapCombination(app.dic_cj, d.mapToMap_cj(app.dic_map));
			ObjectCombination.mapCombination(app.dic_yl, d.mapToMap_yl(app.dic_map, app.dic_xw, app.dic_li, app.dic_xz, app.dic_jm));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readDBInBaseWay(App app) throws IOException {
		//...
		//db
		//测试下刚写的标准读表函数.
		DictionaryStandardDB d= new DictionaryStandardDB();
		String primaryKey= "中药名称";
		String tabKey= "zybc";
		//以后设计 uniq forenkey等.
		Map<String, Map<String, Object>> map= d.dbToMap(primaryKey, tabKey);
		ObjectCombination.mapCombination(app.dic_index, map.get("中药名称"));
		ObjectCombination.mapCombination(app.dic_yw, map.get("笔记原文"));
		ObjectCombination.mapCombination(app.dic_li, map.get("功效"));
		ObjectCombination.mapCombination(app.dic_xz, map.get("中医馆药理"));
		ObjectCombination.mapCombination(app.dic_ya, map.get("愚按"));
		ObjectCombination.mapCombination(app.dic_jm, map.get("经脉"));
		ObjectCombination.mapCombination(app.dic_xw, map.get("性味"));
		ObjectCombination.mapCombination(app.dic_cy, map.get("崇源"));
		ObjectCombination.mapCombination(app.dic_jj, map.get("经解"));
		ObjectCombination.mapCombination(app.dic_zf, map.get("搭配"));
		ObjectCombination.mapCombination(app.dic_hai, map.get("风险规避"));
		ObjectCombination.mapCombination(app.dic_cj, map.get("常见药"));
		ObjectCombination.mapCombination(app.dic_yl, map.get("用量"));
		ObjectCombination.mapCombination(app.dic_map, map.get("dic_map"));
	}

	public static void readDBInWebWay(App app) {
		//...
	}
}