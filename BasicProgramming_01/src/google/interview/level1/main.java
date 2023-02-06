package google.interview.level1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x={14, 27, 1, 4, 2, 50, 3, 1};
		int[] y ={2, 4, 3, 1, 14, 27, 50, 1, 60};
		//sortArray(x);
		//System.out.println(toString(x));
		//sortArray(y);
		//System.out.println(toString(y));
		System.out.println(solution(x,y));
	}
	
	
	public static int solution(int[] x, int[] y) {
		
		sortArray(x);
		sortArray(y);
		
		int xIndex=0;
		int yIndex=0;
		while(xIndex<x.length&&yIndex<y.length) {
			if(x[xIndex]!=y[yIndex]) {
				if(x.length>y.length) {
					return x[xIndex];
				}
				return y[yIndex];
			}
			xIndex++;
			yIndex++;
		}
		if(xIndex<x.length) {
			return x[xIndex];
		}
		return  y[yIndex];
	}
	
	
	
	private static void sortArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
		}
	}
	
	public static String toString(int[] a) {
		String str="";
		for (int i = 0; i < a.length; i++) {
			str+= a[i]+" ";
		}
		return str;
	}


}
