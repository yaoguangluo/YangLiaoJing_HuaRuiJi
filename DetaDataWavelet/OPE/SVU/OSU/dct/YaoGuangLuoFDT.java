package OPE.SVU.OSU.dct;

//20210406 
//double t= 2*Pi/N;
//cos(2knPi/N)= cos(k* n* t) ;
//0~1024 0~1024
//之后我会再来挑战下余弦化简,别急
//refer 傅里叶, 
//编码 罗瑶光
public class YaoGuangLuoFDT{
	final static double pi= 3.1415926;
	final static int N= 1024;
	double cos[][]= new double [N][N] ;
	double sin[][]= new double [N][N] ; 
	public void kernel() {
		for(int k= 0; k< N; k++){
			double v1= 2* pi* k/ N;
			for(int n= 0; n< N; n++){
				double v= v1* n;
				cos[k][n]= Math.cos(v);
				System.out.println(""+ k+ " "+n+ " "+ cos[k][n]);
				sin[k][n]= Math.sin(v);
			}
		} 
	}
	
	public double[][] caculate(double[][] input) {
		for(int k= 0; k< N; k++){
			for(int n= 0; n< N; n++){
				input[k][n]= Math.pow(input[k][n]* cos[k][n], 2)+ Math.pow(input[k][n]* sin[k][n], 2);
				input[k][n]= Math.sqrt(input[k][n]);
			}
		}
		return input; 
	}
	
	public static void main(String[] Args) {
		YaoGuangLuoFDT yaoGuangLuo的FDT= new YaoGuangLuoFDT();
		double input[][]= new double [N][N];
		yaoGuangLuo的FDT.kernel();
		yaoGuangLuo的FDT.caculate(input);
		
	}
}
