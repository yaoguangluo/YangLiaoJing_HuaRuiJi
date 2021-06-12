package MSU.OCI.ME.SMS.translator.C;
import java.io.IOException;
import java.util.List;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import OCI.ME.analysis.C.A;
public interface Translator{	
	void init(A _A) throws IOException;
	String EnglishStringToChineseString(A _A, String EnglishString);
	String ChineseStringToEnglishString(A _A, String ChineseString);
	String MixedStringToChineseString(A _A, String key);
	String ChineseStringToEnglishStringWithPOS(A _A, String v);
	List<Verbal> index(A _A, String mixedString);
	List<Verbal> fixPos(List<Verbal> verbals);
	String getChineseSentenseFromVerbalList(List<Verbal> verbals);
	String getEnglishSentenseFromVerbalFixList(List<Verbal> verbalsFix);
}
