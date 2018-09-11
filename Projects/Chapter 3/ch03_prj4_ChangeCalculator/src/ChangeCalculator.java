import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Change Calculator'");
		
		// Scanner initialization
		Scanner sc = new Scanner(System.in);
		
		// prompt user if they want to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		// prompt user for input
		System.out.print("\nEnter number of cents:  ");
		int cents = sc.nextInt();
		
		int countQ = 0;
		int countD = 0;
		int countN = 0;
		int countP = 0;
		
		while (cents > 0) {
			if (cents >= 25) {
				countQ ++;
				cents -= 25;
			} else if (cents >= 10) {
				countD ++;
				cents -= 10;
			} else if (cents >= 5) {
				countN ++;
				cents -= 5;
			} else if (cents >= 1) {
				countP ++;
				cents -= 1;
			}
		}
		
		int changeQ = countQ * 25;
		int changeD = countD * 10;
		int changeN = countN * 5;
		int changeP = countP * 1;
		
		String message1 = "\nQuarters: " + countQ + "\n"
					   +  "Dimes:    " + countD + "\n"
					   +  "Nickels:  " + countN + "\n"
					   +  "Pennies:  " + countP + "\n";
		System.out.println(message1);
		
		// prompt user to continue (part 2)
		System.out.print("Would you like to continue? ('y'/'n)  ");
		choice = sc.next();
		}
		// exit message
		System.out.println("\nThank you for using the 'Change Calculator'");
	}
}



//import java.util.Scanner;
//
//public class ChangeCalculator {
//
//	public static void main(String[] args) {
//		// welcome message
//		System.out.println("Welcome to the 'Change Calculator'");
//		
//		// scanner import
//		Scanner sc = new Scanner(System.in);
//		
//		
//		// prompt user to continue (part 1)
//		String choice = "y";
//		while (choice.equalsIgnoreCase("y")) {
//		
//		// prompt user for input
//		System.out.print("\nEnter the number of cents:  ");
//		int cents = sc.nextInt();
//		
////		int countQ = 0;
////		int countD = 0;
////		int countN = 0;
////		int countP = 0;
////		
////		 while (cents >= 0) {
////			if (cents >= 25) {
////				countQ ++;
////				cents -= 25;
////			} else if (cents >= 10) {
////				countD ++;
////				cents -= 10;
////			} else if (cents >= 5) {
////				countN ++;
////				cents -= 5;
////			} else if (cents >= 1) {
////				countP ++;
////				cents -= 1;
////			}
////		}
////		
////		int changeLeftQuarters = countQ * 25;
////		int changeLeftDimes = countD * 10;
//		 
//		// int changeLeftQuarters = cents - Math.round(cents / 25) * 25;
//		// int changeLeftDimes = changeLeftQuarters - Math.round(changeLeftQuarters / 10) * 10;
//		
////		 String message = "quarters: " + changeLeftQuarters + "\n"
////		 			      + "dimes: "    + changeLeftDimes    + "\n";
////		 System.out.println(message);
//		System.out.println(10);
//		
//		// prompt user if they want to continue (part 2)
//		System.out.print("\nWould you like to continue?  ");
//		choice = sc.next();
//		}
//		// exit message
//		System.out.println("Thank you for using the 'Cange Calculator'!");
//	}
//
//}
