package PEQ.AMV.ECS.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import OCI.ME.analysis.C.A;
import PEU.P.nlp.*;
public class ANNTest{
	public static void main(String[] argv) throws IOException, InstantiationException, IllegalAccessException {
		ANNTest ANNTest = new ANNTest();
		String[][] AnnMatrix = ANNTest.getANNMatrix();
		for(int j = 0; j < AnnMatrix.length; j++) {
			double sum = 0;
			for(int i = 7; i < AnnMatrix[0].length; i++) {
				sum += Double.valueOf(AnnMatrix[j][i]);
			}
			if(sum >= 0.6) {
				System.out.println(AnnMatrix[j][0]+AnnMatrix[j][1] + AnnMatrix[j][2] + AnnMatrix[j][3] + "ANN:" + sum);
			}
		}
	}
	
	public String[][] getANNMatrix() throws IOException, InstantiationException, IllegalAccessException{
		SensingTest sensingTest= new SensingTest();
		//SUM OF ANN MAP CULUMN KERNEL
		String[][] preAnnMatrix= sensingTest.getMatrix();
		String[][] AnnMatrix= new DETA_ANN_HMM().summingProcessor(preAnnMatrix);	
		return AnnMatrix;
	}

	public String[][] getANNMatrix(String string, A _A) throws IOException
	, InstantiationException, IllegalAccessException {
		SensingTest sensingTest= new SensingTest();
		//SUM OF ANN MAP CULUMN KERNEL
		String[][] preAnnMatrix= sensingTest.getMatrix(string, _A);
		String[][] AnnMatrix= new DETA_ANN_HMM().summingProcessor(preAnnMatrix);	
		String[][] POSPCAAnnMatrix=  getPOSPCAAnnMatrix(AnnMatrix, _A.getPosCnToCn());
		return POSPCAAnnMatrix;
	//	return POSPCAAnnMatrix= AnnMatrix;
	}
	public String[][] getPOSPCAAnnMatrix(String[][] AnnMatrix, Map<String, String> pos){
		List<String[]> list= new ArrayList<>();
		for(int j= 0; j< AnnMatrix.length; j++) {
			if(pos.containsKey(AnnMatrix[j][0])) {
				String string= pos.get(AnnMatrix[j][0]);
				if(string.contains("名")
						|| string.contains("动")
						|| string.contains("医")
						|| string.contains("谓")
						|| string.contains("形")){
					list.add(AnnMatrix[j]);
				}
			}
		}
		String[][] PCANLP= new String[list.size()][15]; 
		Iterator<String[]> iterator= list.iterator();
		int i= 0;
		while(iterator.hasNext()) {
			PCANLP[i++]=iterator.next();
		}
		return PCANLP;		 	
	}

	public String[][] getANNMatrix(SensingTest sensingTest, String string, A _A) 
			throws IOException, InstantiationException, IllegalAccessException {
		//SUM OF ANN MAP CULUMN KERNEL
		String[][] preAnnMatrix = sensingTest.getMatrix(string, _A);
		String[][] AnnMatrix = new DETA_ANN_HMM().summingProcessor(preAnnMatrix);	
		String[][] POSPCAAnnMatrix=  getPOSPCAAnnMatrix(AnnMatrix, _A.getPosCnToCn());
		return POSPCAAnnMatrix;
	}
}