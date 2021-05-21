package PEU.P.image;
public class Opening {
	public int[][] Processor(int[][]g,int[][]kenel){
		int[][] opening=new Erosion().Processor(g,kenel);
		opening=new Dilation().Processor(opening, kenel);
		return opening;
	}
}
