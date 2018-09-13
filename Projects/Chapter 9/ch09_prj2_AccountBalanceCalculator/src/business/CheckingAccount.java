package business;

public class CheckingAccount extends Account {
	// instance variable
	private double monthlyFee;

	// constructor
	public CheckingAccount(double balance) { // add double balance
		// super(); calls super() but we don't instantiate super()
		setBalance(balance);
		this.monthlyFee = 1; // "this" is a keyword. set monthly fee to $1
	}

	// getter
	public double getMonthlyFee() {
		return monthlyFee;
	}

	// setter
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	// deduct monthly fee from balance
	public void deductMonthlyFee() {
		balance -= monthlyFee; // continually deduct monthlyFee
	}
	
}
