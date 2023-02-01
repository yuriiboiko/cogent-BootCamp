package q2.com;

import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {

		CLang c=new CLang();
		JavaLang java = new JavaLang();
		Scanner sc= new Scanner(System.in);
		System.out.println("Select your favorite language to be run first...\nEnter 1 for Java and 2 for C");
		int choice= sc.nextInt();
		
		if(choice==1) {
			java.setPriority(10);
			c.setPriority(1);
		}else if(choice==2){
			c.setPriority(10);
			java.setPriority(1);
		}
		else {
			System.out.println("Invalid input...");
			return;
		}
		
		java.start();
		c.start();
	}

}
