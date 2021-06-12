package PEQ.AMV.ECS.test;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import MSV.OSQ.sets.DetaDouble;
import OCI.ME.analysis.C.A;
import PEU.P.nlp.*;
public class DNNTest{
	public static void main(String[] argv) throws IOException, InstantiationException, IllegalAccessException {
		DNNTest dNNTest=new DNNTest();
		ANNTest aNNTest= new ANNTest();
		String[][] ann= aNNTest.getANNMatrix();
		String[][] dnn= dNNTest.getDNNMatrix(ann);
//		String[][] ann= aNNTest.getANNMatrix(string, _A);
//		String[][] dnn= dNNTest.getDNNMatrix(ann, _A, string);
		for(int i=0;i<dnn.length;i++) {
			double dnn_lwa = DetaDouble.parseDouble(dnn[i][3]);
			if(dnn_lwa>100) {
				System.out.print(ann[i][0] + ":");
				System.out.print(ann[i][1] + ":");
				System.out.print(ann[i][2] + ":");
				System.out.print(ann[i][3] + ":");
				System.out.print(dnn[i][0] + ":");
				System.out.print(dnn[i][3] + ":");
				System.out.println("");
			}
		}
	}

	public String[][] getDNNMatrix() throws IOException, InstantiationException, IllegalAccessException{
		ANNTest aNNTest = new ANNTest();
		RNN_IDETest rNN_IDETest = new RNN_IDETest();
		String[][] dNNMatrix = new DETA_DNN().summingProcessor(aNNTest.getANNMatrix(), rNN_IDETest.getIDEMatrix());	
		return dNNMatrix;
	}
	
	public String[][] getDNNMatrix(String[][] ann) throws IOException, InstantiationException, IllegalAccessException{
		RNN_IDETest rNN_IDETest = new RNN_IDETest();
		String[][] dNNMatrix = new DETA_DNN().summingProcessor(ann, rNN_IDETest.getIDEMatrix());	
		return dNNMatrix;
	}
	
	public String[][] getDNNMatrix(SensingTest sensingTest, String[][] ann, A _A, String string) 
			throws IOException, InstantiationException
	, IllegalAccessException{
		//RNN  深度此距离计算 开始注释 罗瑶光
		RNN_IDETest rNN_IDETest = new RNN_IDETest();
		String[][] rnn= rNN_IDETest.getIDEMatrixExcludeAnalyzer(sensingTest, ann, _A, string);
		rnn= getPOSPCARnnMatrix(rnn);
		if(ann.length> rnn.length) {
			ann= getAnnWithMaskRnn(ann, rnn);	
		}
		String[][] dNNMatrix = new DETA_DNN().summingProcessor(ann, rnn);	
		return dNNMatrix;
	}

	private String[][] getAnnWithMaskRnn(String[][] ann, String[][] rnn) {
		//map
		Map<String, Boolean> rnnMap= new HashMap<>(); 
		for(int i= 0; i< rnn.length; i++) {
			if(!rnnMap.containsKey(rnn[i][0])) {
				rnnMap.put(rnn[i][0], true);
			}
		}
		String[][] maskAnn= new String[rnnMap.size()][];
		int j= 0;
		for(int i= 0;i< ann.length; i++) {
			if(rnnMap.containsKey(ann[i][0])) {
				maskAnn[j++]= ann[i];
			}
		}
		return maskAnn;
	}

	private String[][] getPOSPCARnnMatrix(String[][] rnn) {
		List<String[]> list= new ArrayList<>();
		Here:
		for(int j= 0; j< rnn.length; j++) {
				if(Double.valueOf(rnn[j][1])== 0
				   || Double.valueOf(rnn[j][1])== 0
				   || Double.valueOf(rnn[j][1])== 0
						){
					continue Here;
				}
				list.add(rnn[j]);
		}
		String[][] PCANLP= new String[list.size()][15]; 
		Iterator<String[]> iterator= list.iterator();
		int i= 0;
		while(iterator.hasNext()) {
			PCANLP[i++]=iterator.next();
		}
		return PCANLP;		 
	}
	
	
	
	
	
}