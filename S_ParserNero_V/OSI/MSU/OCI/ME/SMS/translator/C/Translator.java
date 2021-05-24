package OSI.MSU.OCI.ME.SMS.translator.C;
import java.io.IOException;
import java.util.List;

import OSI.OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import OSI.OPE.ASQ.PSU.OCI.ME.analysis.C.Analyzer;
public interface Translator{	
	void init(Analyzer analyzer) throws IOException;
	String EnglishStringToChineseString(Analyzer analyzer, String EnglishString);
	String ChineseStringToEnglishString(Analyzer analyzer, String ChineseString);
	String MixedStringToChineseString(Analyzer analyzer, String key);
	String ChineseStringToEnglishStringWithPOS(Analyzer analyzer, String v);
	List<Verbal> index(Analyzer analyzer, String mixedString);
	List<Verbal> fixPos(List<Verbal> verbals);
	String getChineseSentenseFromVerbalList(List<Verbal> verbals);
	String getEnglishSentenseFromVerbalFixList(List<Verbal> verbalsFix);
}
