package MSU.OCI.ME.SMS.translator.C;
import java.io.IOException;
import java.util.List;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import OCI.ME.analysis.C.A;
public interface Translator{	
	void init(A analyzer) throws IOException;
	String EnglishStringToChineseString(A analyzer, String EnglishString);
	String ChineseStringToEnglishString(A analyzer, String ChineseString);
	String MixedStringToChineseString(A analyzer, String key);
	String ChineseStringToEnglishStringWithPOS(A analyzer, String v);
	List<Verbal> index(A analyzer, String mixedString);
	List<Verbal> fixPos(List<Verbal> verbals);
	String getChineseSentenseFromVerbalList(List<Verbal> verbals);
	String getEnglishSentenseFromVerbalFixList(List<Verbal> verbalsFix);
}
