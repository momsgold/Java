package business;

public class SavingsAccount extends Account {
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	// User cannot establish an account without a balance,
	// so we need a balance in the constructor.
	// We have a business rule that states monthlyInterestRate is 1%
	// we will not set monthlyInterestPayment until end of month
	// or when we print results in the App.
	public SavingsAccount(double amt) {
		setBalance(balance); // pass amt through constructor. set balance to balance like in "CheckingAccount"
		this.monthlyInterestRate = .01; // set interest rate to 1%, don't pass through constructor thing
	}

	// getters and setters
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	// ApplyInterestPayment method applies monthlyInterestPayment
	public void applyInterestPayment() { // does not need parameters passed in
		// determine what the monthlyInterestPayment is
		double monthlyInterestPayment = balance * monthlyInterestRate;
		
		// set monthlyInterestPayment
		setMonthlyInterestPayment(monthlyInterestPayment);
		
		// add monthlyInterestPayment to balance
		balance += monthlyInterestPayment;
	}
	
}
