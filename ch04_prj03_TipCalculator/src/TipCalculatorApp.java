import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Tip Calculator' application");
		
		// Scanner initialization
		Scanner sc = new Scanner(System.in);
		
		// prompt user to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// input data
		
			System.out.print("\nCost of meal: ");
			double mealCost = sc.nextDouble();
			// have the user enter another value if they enter a cost that's less than 0.00
			if (mealCost <= 0) {
				System.out.println("Cost of meal must be greater than $0.00. Please enter a value that's greater than $0.00");
				continue;
				} // end accountability
			
			for (double i = 0.15; i <= 0.25; i += 0.05) { // don't forget to put 'int' in front of 'i'!!!
				double tipAmount = i * mealCost;
				double totalAmount = tipAmount + mealCost;
				
				NumberFormat percent = NumberFormat.getPercentInstance();
				NumberFormat number = NumberFormat.getCurrencyInstance();
				String message = "\n"
							   + percent.format(i) + "\n"
							   + "Tip amount: "   + number.format(tipAmount)   + "\n"
							   + "Total amount: " + number.format(totalAmount) + "\n";
				System.out.println(message);
				}
			
			// prompt user if they want to continue (part 2)
			System.out.print("Do you want to continue? ('y'/'n')  ");
			choice = sc.next();
			}
		
		// exit message
		System.out.println("\nThank you for using the 'Tip Calculator' application");
	}

}
