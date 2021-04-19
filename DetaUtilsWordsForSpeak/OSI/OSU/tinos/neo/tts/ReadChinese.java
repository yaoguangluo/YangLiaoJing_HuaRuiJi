package OSI.OSU.tinos.neo.tts;
import java.util.Iterator;

import java.util.List;

public class ReadChinese extends Thread implements Runnable{
	public String text = "";
	public int finish = 1;
	private List<String> setsForGet; 
	public com.jacob.activeX.ActiveXComponent sap;;
	public com.jacob.com.Dispatch sapo;
	@SuppressWarnings("unused")
	public ReadChinese(){ 
		com.jacob.activeX.ActiveXComponent sap= new com.jacob.activeX.ActiveXComponent("Sapi.SpVoice");
		sapo= sap.getObject();
		try {
			// 音量 0-100
			sap.setProperty("Volume", new com.jacob.com.Variant(100));
			// 语音朗读速度 -10 到 +10
			sap.setProperty("Rate", new com.jacob.com.Variant(-2));
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
				e.printStackTrace();
				sapo.safeRelease();
				sap.safeRelease();
			} finally {
			}	
	}

	public void run() {
		if(finish == 1) {
			this.read(this.text);	
		}
		if(finish == 2) {
			Iterator<String> iterator = setsForGet.iterator();
			String readString = "";
			int c = 0;
			while(iterator.hasNext() && finish == 2) {
				readString += ""+ iterator.next();
				if(c++ == 20) {
					c=0;
					this.read(readString);	
					readString=" ";
				}
			}
			if(c!=0) {
				this.read(readString);	
			}
		}
		finish=0;
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
	//	 TODO Auto-generated method stub
		sap= null;
	}
}

