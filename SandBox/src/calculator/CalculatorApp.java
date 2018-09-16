package calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Calculator' application!\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			Calculate c = new Calculate();
			// prompts user if they want to add or subtract, makes String named "operation"
			String operation = Console.getString("Add or subtract from first number ('a'/'s')?  ", "a", "s");
			System.out.println();
			
			// determines the operator printed out in the output message
						String operatorText = "";
						if(operation.equalsIgnoreCase("a")) {
							operatorText = " + ";
						} else {
							operatorText = " - ";
						}
			
			// use Console class to get the first number
			c.setNum1(Console.getInt("Enter the first number:  "));
			
			if (operation.equalsIgnoreCase("a")) {
				c.setNum2(Console.getInt("Enter the second number:  "));
				System.out.println();
				System.out.println(c.getNum1() + operatorText + c.getNum2() + " = " + c.add());
			} else {
				c.setNum2(Console.getInt("Enter second number:  "));
				System.out.println(c.getNum1() + operatorText + c.getNum2() + " = " + c.subtract());
			}
			
//			String message = c.getNum1() + operatorText + c.getNum2() + " = " +
//					if (operation.equalsIgnoreCase("a")) {
//						c.add();
//					} else {
//						c.subtract();
//					}
//			System.out.println(message);
					
			System.out.print("\nWould you like to use the 'Calculator' again?  ");
			choice = sc.next();
			System.out.println();
		}
		
		// exit message
		System.out.println("\nThank you for using the 'Calculator' application!");
	}

}
