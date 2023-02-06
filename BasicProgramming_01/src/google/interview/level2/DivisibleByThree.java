package google.interview.level2;

import java.util.Iterator;
import java.util.Random;

/*
 * You have L, a list containing some digits (0 to 9). 
 * Write a function solution(L) which finds the largest 
 * number that can be made from some or all of these digits
 * and is divisible by 3. If it is not possible to make such 
 * a number, return 0 as the solution. L will contain 
 * anywhere from 1 to 9 digits.  The same digit may appear 
 * multiple times in the list, but each element in the 
 * list may only be used once.
 */
public class DivisibleByThree {

	public static void main(String[] args) {
/*
		int[] x= {3, 1, 4, 1};
		int[] x1= {1,1,4,9,1};
		int[] x2= {4,9,3};
		int[] x3= {7,9};
		int[] x4= {2,2,5,5,2};
		int[] x5= {5,6,5};
		int[] x6= {8,8};
		int[] x7= {2,5,4};
		int[] x8= {1,1,5,4};
		int[] x9= {8,3};
		int[] x10= {1,1,4,4,1};
		int[] x11= {4,4,3};
		int[] x12= {7,7,3};

		
		
		
		System.out.println(solution(x));
		
		System.out.println("case 1");
		
		System.out.println(solution(x1));
		System.out.println("case 2");

		System.out.println(solution(x2));
		System.out.println("case 3");

		System.out.println(solution(x3));
		System.out.println("case 4");

		System.out.println(solution(x4));
		System.out.println("case 5");

		System.out.println(solution(x5));
		System.out.println("case 6");
		System.out.println(solution(x6));

		System.out.println("case 7");

		System.out.println(solution(x7));
		System.out.println("case 8");

		System.out.println(solution(x8));
		System.out.println("case 9");

		System.out.println(solution(x9));
		System.out.println("case 10");

		System.out.println(solution(x10));
		System.out.println("case 11");

		System.out.println(solution(x11));
		System.out.println("case 12");

		System.out.println(solution(x12));



		int[] y= {3, 1, 4, 1, 5, 9};
		
		//System.out.println(solution(x));
		System.out.println(solution(y));

*/
		
		
		for (int i = 0; i < 100; i++) {
			int[] x =generateArray();
			System.out.println("The array if ints:\n"+ toString(x));
			int ans=solution(x);
			System.out.println("the solution is :"+ans+" . Mod 3 of this is equal to: "+ (ans%3));
		}
		System.out.println("solution for y:");
		int[] y= {0};
		System.out.println(solution(y));

	}

	public static int solution(int[] l) {
		int sum=0;
		int[] freq = new int[10];
		for (int i = 0; i < l.length; i++) {
			sum+=l[i];
			freq[l[i]]++;
		}
		
		System.out.println("Sum is equal to "+sum);
		System.out.println("Sum % 3: "+(sum%3));

		if(sum%3==0) {
			return combineInts(freq);
		}
		else if(sum%3==1) {
			if(freq[1]>=1) {
				freq[1]--;
				System.out.println("Removing one 1");
				return combineInts(freq);
			}else if(freq[4]>=1) {
				System.out.println("Removing one 4");
				freq[4]--;
				return combineInts(freq);
			}else if(freq[7]>=1) {
				System.out.println("Removing one 7");
				freq[7]--;
				return combineInts(freq);
			}else if(freq[2]>=2) {
				System.out.println("Removing two 2");
				freq[2]-=2;
				return combineInts(freq);
			}else if(freq[5]>=1 && freq[2]>=1) {
				freq[5]--;
				freq[2]--;
				return combineInts(freq);
			}else if(freq[5]>=2) {
				System.out.println("Removing two 5");
				freq[5]-=2;
				return combineInts(freq);
			}else if(freq[8]>=2) {
				System.out.println("Removing two 8");
				freq[8]-=2;
				return combineInts(freq);
			}		
		}else {
			if(freq[2]>=1) {
				System.out.println("Removing one 2");
				freq[2]--;
				return combineInts(freq);
			}else if(freq[5]>=1) {
				System.out.println("Removing one 5");
				freq[5]--;
				return combineInts(freq);
			}else if(freq[8]>=1) {
				System.out.println("Removing one 8");
				freq[8]--;
				return combineInts(freq);
			}else if(freq[1]>=2) {
				System.out.println("Removing two 1");
				freq[1]-=2;
				return combineInts(freq);
			}else if(freq[1]>=1 && freq[4]>=1){//removing 1 and a 4
			    freq[1]--;
			    freq[4]--;
			    return combineInts(freq);
			}else if(freq[4]>=2) {
				System.out.println("Removing two 4");
				freq[4]-=2;
				return combineInts(freq);
			}else if(freq[7]>=2) {
				System.out.println("Removing two 7");
				freq[7]-=2;
				return combineInts(freq);
			}
		}	
		return 0;		
	}


	private static int combineInts(int[] l) {
		StringBuilder sb= new StringBuilder();

		for (int i = 9; i >= 0; i--) {
			for(int j=0;j<l[i]; j++) {
				sb.append(i);
			}
		}
		String ans=sb.toString();
		if(ans=="") {
			return 0;
		}
		else {
			return Integer.parseInt(ans);
		}

	}

	public static String toString(int[] a) {
		String str="";
		for (int i = 0; i < a.length; i++) {
			str+= a[i]+" ";
		}
		return str;
	}

	
	
	
		  public static int[] generateArray() {
		    Random rand = new Random();
		    int size = rand.nextInt(9)+1;  // generate a random number between 1 and 9
		    int[] arr = new int[size];
		    for (int i = 0; i < size; i++) {
		      arr[i] = rand.nextInt(10);  // generate a random number between 0 and 9
		    }
		    return arr;
		  }
		
	
	
	
	
	
	
}
