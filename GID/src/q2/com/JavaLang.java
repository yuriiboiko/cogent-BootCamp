package q2.com;

public class JavaLang extends Thread implements Language{

	//had to add a for loop to see the priority take effect 
	@Override
	public void showMessage() {
		for(int i =0;i<100;i++) {
			System.out.println("Java Program is running");		
		}
	}

	@Override
	public void run() {
		showMessage();
	}
}
