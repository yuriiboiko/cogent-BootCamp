package google.interview.level3;

public class QuickestToOne {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println("Testing integer: "+i);
			System.out.println("----------------");
			System.out.println("Final answer: "+solution(i+""));
			System.out.println("----------------");
			System.out.println("\n");

	
		}
		//System.out.println("Final answer: "+solution("19"));

	}

	public static int solution(String x) {
		int num = Integer.parseInt(x);
		int count = 0;
		while(num!=1) {
			System.out.print("Number: "+num);
			if(num%2==0) {
				System.out.print(" divding by 2.");
				num=num/2;
			}else if(((num+1)%4==0) && num>4) {
				System.out.print(" adding 1.");
				num++;
			}else {
				System.out.print(" subtracting 1.");
				num--;
			}
			System.out.println();
		count++;
		}
		return count;
	}
	


}
