package ESU.sort;
import OEU.LYG4DQS4D.Quick_7D_luoyaoguang_Sort;
//作者 罗瑶光
public class Quick9DLYGWithString_ESU extends Quick_7D_luoyaoguang_Sort{
	public int[] sort(int[]a, String[]sa) {
		processDouble(a, 0, a.length - 1, sa, 0);
		return a;
	}

	private void processDouble(int[] array, int leftPoint, int rightPoint, String[] sa, int deep) {
		int c= rightPoint- leftPoint+ 1;
		if(!(c< 7|| deep> 70)) {//增加了deep
			int pos= partition(array, leftPoint, rightPoint, sa);
			if(leftPoint< pos- 1) {
				processDouble(array, leftPoint, pos- 1, sa, deep+ 1);
			}
			if(pos+ 1< rightPoint) {
				processDouble(array, pos+ 1, rightPoint, sa, deep+ 1);
			}
			return;
		}
		int i= leftPoint;
		for(int j= i+ 1; j< leftPoint+ c; j= i++){
			while(j> leftPoint){
				if(array[j]< array[--j]){
					int temp = array[j+ 1];
					array[j+ 1] = array[j];
					array[j] = temp;
					String stemp = String.valueOf(sa[j+ 1]);
					sa[j+ 1] = String.valueOf(sa[j]);
					sa[j] = String.valueOf(stemp);
				}
			}
		}	
	}

	private int partition(int[] array, int leftPoint, int rightPoint, String[] sa) {
		int x= array[leftPoint]< array[rightPoint]? array[leftPoint]: array[rightPoint];
		int leftPointReflection= leftPoint;
		while(leftPointReflection++ < rightPoint){
			while(!(array[leftPointReflection++]> x|| leftPointReflection> rightPoint)) {}
			while(array[rightPoint--]> x) {}
			if(--leftPointReflection< ++rightPoint){
				int temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
				String stemp= String.valueOf(sa[rightPoint]);
				sa[rightPoint]= String.valueOf(sa[leftPointReflection]);
				sa[leftPointReflection]= String.valueOf(stemp);
			}
		}
		array[leftPoint]= array[rightPoint];
		array[rightPoint]= x;
		return rightPoint;
	}
}