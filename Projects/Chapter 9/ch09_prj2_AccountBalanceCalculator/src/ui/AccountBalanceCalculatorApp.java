package ui;
import java.text.NumberFormat;

import business.*; // imports everything in business package
//import business.Account;
//import business.CheckingAccount;
//import business.SavingsAccount;
import util.Console;

public class AccountBalanceCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Account Balance Calculator' application!");

		// get user input (w or d? c or s? amount)
		System.out.println("Starting balances:  ");
		CheckingAccount ca = new CheckingAccount(1000); // enter balance of $1000 inside ()
		SavingsAccount sa = new SavingsAccount(1000); // enter balance of $1000 inside ()
		
		// define number format "currency" to put numbers into currency format
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		System.out.println("Checking: " + currency.format(ca.getBalance()));
		System.out.println("Savings:  " + currency.format(sa.getBalance()));
		
		System.out.println("Enter transactions for the month:  ");
		
		// prompt user if they want to continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			// overloading the getString method (in Console) to add option to set parameters
			// prompt transaction type (w or d) from user
			String transactionType = Console.getString("Withdraw or deposit? ('w'/'d')  ", "w", "d");
			// prompt account type (c or s) from user
			String accountType = Console.getString("Checking or savings? ('c'/'s')  ", "c", "s");
			// prompt amount from user
			double amount = Console.getDouble("Amount?  ", 1, Double.POSITIVE_INFINITY); // validate that the user enters a number > 0
			
			// business logic
			// declare local variable, acct, and set it equal to checking or savings account, 
			// depending on what accoutType user selects
			Account acct = null;
			if (accountType.equalsIgnoreCase("c")) {
				acct = ca;
			} else if (accountType.equalsIgnoreCase("s")) {
				acct = sa;
			}
			
			// set account equal to withdraw or deposit
			if (transactionType.equalsIgnoreCase("w")) {
				acct.withdrawl(amount);
			} else if (transactionType.equalsIgnoreCase("d")) {
				acct.deposit(amount);
			}
			
			// output
			sa.applyInterestPayment(); 
			ca.deductMonthlyFee();
			String message = "Monthly Payments and Fees" + "\n"
						   + "Checking fee: " + currency.format(ca.getMonthlyFee()) + "\n"
						   + "Savings interest payment: " + currency.format(sa.getMonthlyInterestPayment()) + "\n" + "\n"
						   + "Final Balances" + "\n"
						   + "Checking: " + currency.format(ca.getBalance()) + "\n"
						   + "Savings: " + currency.format(sa.getBalance());
			System.out.println(message);
			
			choice = Console.getString("Would you like to continue? ('y'/'n')  ", "y", "n");
		}
		
		// exit message
		System.out.println("Thank you for using the 'Account Balance Calculator' application!");
	}

}
