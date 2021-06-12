package OSI.AOP.neo.tts;
import java.util.Iterator;

import java.util.List;

import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
//编码设计：罗瑶光
//refer Jacob 语音 api demo
//refer 德塔图灵系统，极速中文分词  罗瑶光
public class ReadChinese extends Thread implements Runnable{
	public String text= "";
	public int finish= 1;
	private List<String> setsForGet; 
	public com.jacob.activeX.ActiveXComponent sap;;
	public com.jacob.com.Dispatch sapo;
	public App app;
	public A _A;//对象只是 地址位而已，不是clone， copy和 new
	@SuppressWarnings("unused")
	public ReadChinese(App app, A _A){ 
		this.app= app;
		this._A= _A;
		com.jacob.activeX.ActiveXComponent sap= new com.jacob.activeX.ActiveXComponent("Sapi.SpVoice");
		sapo= sap.getObject();
		try {
			// 音量 0-100
			sap.setProperty("Volume", new com.jacob.com.Variant(100));
			// 语音朗读速度 -10 到 +10
			sap.setProperty("Rate", new com.jacob.com.Variant(-3));
			com.jacob.com.Variant defalutVoice= sap.getProperty("Voice");
			com.jacob.com.Dispatch dispdefaultVoice= defalutVoice.toDispatch();
			com.jacob.com.Variant allVoices= com.jacob.com.Dispatch.call(sapo, "GetVoices");
			com.jacob.com.Dispatch dispVoices= allVoices.toDispatch();
			com.jacob.com.Dispatch setvoice= com.jacob.com.Dispatch.call(dispVoices
					, "Item", new com.jacob.com.Variant(1)).toDispatch();
			com.jacob.activeX.ActiveXComponent voiceActivex= new com.jacob.activeX.ActiveXComponent(dispdefaultVoice);
			com.jacob.activeX.ActiveXComponent setvoiceActivex= new com.jacob.activeX.ActiveXComponent(setvoice);
			com.jacob.com.Variant item= com.jacob.com.Dispatch.call(setvoiceActivex, "GetDescription");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
	
	public void read(String string){
		try {
			com.jacob.com.Dispatch.call(sapo, "Speak", new com.jacob.com.Variant(string));
			} catch (Exception e) {
			//	e.printStackTrace();
//				sapo.safeRelease();
//				sap.safeRelease();
				sapo= null;
				sap= null;
				System.gc();
			} finally {
			}	
	}

//	public void run() {
//		if(finish == 1) {
//			this.read(this.text);	
//		}
//		if(finish == 2) {
//			Iterator<String> iterator = setsForGet.iterator();
//			String readString = "";
//			int c = 0;
//			while(iterator.hasNext() && finish == 2) {
//				readString += ""+ iterator.next();
//				if(c++ == 20) {
//					c=0;
//					this.read(readString);	
//					readString=" ";
//				}
//			}
//			if(c!=0) {
//				this.read(readString);	
//			}
//		}
//		finish=0;
//	}
	
	public void run() {
		if(finish== 1) {
			this.read(this.text);	
		}
		if(finish== 2) {
			Iterator<String> iterator= setsForGet.iterator();
			while(iterator.hasNext()&& finish== 2) {
				String readString= iterator.next();
				List<String> list = null;
				if(null!= app) {
					list= app._A.parserMixedString(readString);
				}else if(null!= _A) {
					list= _A.parserMixedString(readString);
				}
				if(null!= list&& finish== 2) {
					Iterator<String> listIterator= list.iterator();
					while(listIterator.hasNext()) {
						this.read(listIterator.next());	
					}
				}
			}
		}
		finish= 0;
	}
	
	public void setPreReadText(String text) {
		if(text.length()==0) {
			return;
		}
		finish=1;
		this.text = text;
	}
	
	public void setPreReadList(List<String> setsForGet) {
		if(setsForGet.size()==0) {
			return;
		}
		finish=2;
		this.setsForGet = setsForGet;
	}

	public void setNullSap() {
		try {
			sapo= null;
			sap= null;
		}catch(Exception E) {
			System.gc();
		}
	}
}

