import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Interest Calculator");
		
		//prompt user for input
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter loan amount: ");
		double loanAmount = sc.nextDouble();
		System.out.print("Enter interest rate: ");
		double interestRate = sc.nextDouble();
		double interest = interestRate * loanAmount;
		
		// output data
		NumberFormat amount = NumberFormat.getCurrencyInstance();
		NumberFormat rate = NumberFormat.getPercentInstance();
		BigDecimal interestAmt = new BigDecimal(interest);
		NumberFormat intAmt = NumberFormat.getCurrencyInstance();
		
		
		String message = ""
					   + "Loan amount = "   + amount.format(loanAmount)  + "\n"
					   + "Interest rate = " + rate.format(interestRate)  + "\n"
					   + "Interest = "      + intAmt.format(interestAmt) + "\n";
		System.out.println();
		System.out.println(message);
		
		// prompt user if they want to continue (cont...)
		System.out.println("Do you want to continue? ('y'/'n')");
		choice = sc.next();
		}
		// exit message
		System.out.println("Thank you for using the Interest Calculator");
	}

}
