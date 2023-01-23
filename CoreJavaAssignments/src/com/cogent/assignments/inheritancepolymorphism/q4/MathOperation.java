package com.cogent.assignments.inheritancepolymorphism.q4;

public class MathOperation {

	public static void main(String[] args) {
		if(args.length<3) {
			System.out.println("not enought arguments to perform the task!");
			return;
		}
		
		try{
			 Integer.parseInt(args[0]);
			 Integer.parseInt(args[1]);
		}catch(NumberFormatException e){
			 System.out.println("one of the variables passed cant be parsed into integer.\nExited the program.");
			 return;
		}
		
		switch(args[2]) {
		case "+":
			System.out.println("Addition result is "+ (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
			break;
		case "-":
			System.out.println("Subtraction result is "+ (Integer.parseInt(args[0])-Integer.parseInt(args[1])));
			break;
		case "/":
			divison(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			break;
		case "*":
			System.out.println("Multiplication result is "+ (Integer.parseInt(args[0])*Integer.parseInt(args[1])));
			break;
		default:
			System.out.println("Operator not identified! must be of the following type -,+,*,/.");
		}
		
	}
	
	private static void divison(int x, int y){
		if(y==0) {
			System.out.println("Cant perform division by 0!!\nExited the program");
			
			return;
		}
		System.out.println("Division result is "+ x/y);
	}
	
}
