package ASQ.PSU.test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;

//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.Callable;
//import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.concurrent.E_Service;
//import java.util.concurrent.E_s;

@SuppressWarnings("unused")
public class DemoCogs {
    static List<List<String>> sets;
    static String ss;
    static int c = 0;

    public static void main(String[] args) throws IOException, InterruptedException {
        A _A = new CogsBinaryForest_AE();
        //Analyzer _A = new FastAnalyzerImp();
        //Analyzer _A = new PrettyAnalyzerImp();
        //Analyzer _A = new BaseAnalyzerImp();
        //Analyzer _A = new ScoreAnalyzerImp();
        _A.initMixed();
        sets = new CopyOnWriteArrayList<>();
        String ss = "从容易开始从容易知";
        System.out.println("");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new TaskWithResult(i, _A, ss));
        }
        while (sets.size() < 100) {
            Thread.sleep(300);
        }
        int j = 0;
        for (int i = 0; i < sets.get(0).size(); i++) {
            System.out.print(sets.get(0).get(i) + "  |  ");
            j++;
            if (j > 15) {
                j = 0;
                System.out.println("");
            }
        }
    }

    public static class TaskWithResult implements Callable<String> {
        private int id;
        private A _A;
        private String sss;

        public TaskWithResult(int id, A _A, String sss) {
            this.id = id;
            this._A = _A;
            this.sss = sss;
        }

        public String call() throws Exception {
            List<String> te = _A.parserString(sss);
            sets.add(te);
            return null;
        }
    }

}