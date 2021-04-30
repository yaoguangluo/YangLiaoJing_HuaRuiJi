package nlpProcessor;
import java.io.IOException;

import MSV.OSQ.sets.DetaDouble;
public class DETA_DNN {
//Theory:DNN
//Algorithm Author Mr.Yaoguang Luo	
	public String[][] summingProcessor(String[][] ann, String[][] rnn) throws IOException
	, InstantiationException, IllegalAccessException {
		//SUM OF LWA DNN 
		//1 DNN AOP OF DNN
		String[][] dnn = new String[rnn.length][4];
		for(int i = 0; i < rnn.length; i++) {
			dnn[i][0] = rnn[i][0];
			double important = 0;
			for(int j = 0; j < rnn.length; j++) {
				important += DetaDouble.parseDouble(rnn[j][2]);
			}
			dnn[i][1] = "" + Math.sqrt(important * DetaDouble.parseDouble(rnn[i][1]));
		}
		//2 DNN CORRELATION LWA
		for(int i= 0; i< rnn.length; i++) {
			double sumOfPow= 0;
			for(int j= 0; j< rnn.length; j++) {
				sumOfPow+=  DetaDouble.parseDouble(rnn[j][3]);
			}
			sumOfPow= Math.abs(DetaDouble.parseDouble(rnn[i][3])- sumOfPow/ rnn.length);
			dnn[i][2]= ""+ Math.sqrt(DetaDouble.parseDouble(dnn[i][1])* sumOfPow);
		}
		//3 DNN and summing ANN combination
		for(int i= 0; i< ann.length; i++) {
			double summingANN= 0;
			for(int j= 7; j< ann[0].length; j++) {
				if(!ann[i][j].contains("a")) {
					summingANN+= DetaDouble.parseDouble(ann[i][j]);
				}
			}
			dnn[i][3]= ""+ summingANN*  DetaDouble.parseDouble(dnn[i][2]);
		}			
		return dnn;		 	
	}
}	
