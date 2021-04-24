package OSI.OSU.MSU.OCI.AOP.MEC.base.translator;
import java.io.IOException;
import java.util.List;

import OSI.OSU.ASQ.PSU.OCI.engine.analysis.Analyzer;
import OSI.OSU.ASQ.PSU.view.obj.Verbal;
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
