package OSI.OPE.ASQ.PSU.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OSI.OPE.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OSI.OPE.ASQ.PSU.OCI.ME.analysis.Analyzer;
import OSI.OPE.ASQ.PSU.OEI.ME.analysis.E.CogsBinaryForestAnalyzerImp;

import static java.lang.System.*;

@SuppressWarnings("unused")
public class DemoPOSMedcine {
    public static void main(String[] args) throws IOException {
        Analyzer analyzer = new CogsBinaryForestAnalyzerImp();
        analyzer.init();
        Map<String, String> nlp = analyzer.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        String[] ss = new String[1];
        String[] ss1 = new String[1];
        ss[0] = "";
        ss1[0] = "";
        //ss1[0] = "、 益母 、结婚益母"; 

        for (int i = 0; i < ss.length; i++) {
            System.out.println("超级变态复杂病句-->" + ss[i]);
            Map<String, WordFrequency> map = analyzer.parserMixStringByReturnFrequencyMap(
            		ss[0]
					);
            out.print("分析处理真实结果-->");
            Iterator<String> it = map.keySet().iterator();
            while(it.hasNext()) {
            	 out.println(it.next());
            }
        }
    }
}