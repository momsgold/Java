import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Factorial Calculator'!");
		
		// Scanner intialization
		Scanner sc = new Scanner(System.in);
		
		
		//prompt user to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// prompt user for input
			System.out.print("Enter an integer between 0 and 10:  ");
			int integerVariable = sc.nextInt();
			long factorial = 1;
			
			 for (int i=1; i <= integerVariable; i ++) {
			        factorial = factorial * i;
			    }
			 
			 // print output
			 System.out.println("");
			 System.out.println("The factorial of " + integerVariable + " is " + factorial);
			
			// prompt user to continue (part 2)
			 System.out.println("");
			System.out.print("Would you like to continue? ('y'/'n')");
			choice = sc.next();
			}
		
		// exit message
		System.out.println("");
		System.out.println("Thank you for using the 'Factorial Calculator'");
	}

}
