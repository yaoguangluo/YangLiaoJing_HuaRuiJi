package OPM.ESU.admin;

import ME.APM.VSQ.App;

//作者 罗瑶光
//准备设计一个 数据库读取frequency 方案函数, 之后数据编辑页都走这个函数.
public class DBReadMode{

	public void aCommonReadWay(App app, Object inputBuffer) {
		//1首先如果有配置,按配置来读表
		//1.1输出结果有txt配置选勾读txt
		if(app.bootDBInTXTWay) {
			//...
			return;
		}
		//有数据表配置选勾就读数据表
		if(app.bootDBInBaseWay) {
			//...
			return;
		}
		//有web接口请求配置选勾就读web上的rest请求数据
		if(app.bootDBInWebWay) {
			//...
			return;
		}

		//2如果没有配置就按流水线读表
		//2.1 有txt先读txt
		readDBInTXTWay(app, inputBuffer);
		//2.2 有数据表就读读数据表
		readDBInBaseWay(app, inputBuffer);
		//2.3 有web接口请求就读web上的rest请求数据
		readDBInWebWay(app, inputBuffer);
		//2.4 输出结果.
	}

	public void readDBInTXTWay(App app, Object inputBuffer) {
		//...
	}

	public void readDBInBaseWay(App app, Object inputBuffer) {
		//...
	}

	public void readDBInWebWay(App app, Object inputBuffer) {
		//...
	}
}