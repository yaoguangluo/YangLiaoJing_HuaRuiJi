package PEU.P.search;
public class LinerSearch{
	public boolean search(int [] array,int n) {
		for(int i=0;i<array.length;i++){
			if(array[i]==n)
				return true;
		}
		return false;
	}
}