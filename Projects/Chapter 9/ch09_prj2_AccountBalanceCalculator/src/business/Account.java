package business;

public abstract class Account implements Balanceable, Withdrawlable, Depositable { // make class abstract for some reason...
	
	// make protected so we can use balance in other classes
	protected double balance; // don't initialize here, initialize in checking and saving account
	
	// we do not have a constructor because the class is abstract
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amt) {
		balance = amt;
	}
	
	@Override
	public void deposit(double amt) {
		balance += amt; // deposit adds amt to balance
	}

	@Override
	public void withdrawl(double amt) {
		// stops you from withdrawing more money than is in the account
		if (amt > balance) {
			System.out.println("Amount exceeds balance!"); // try not to put Sysout in business logic in the future
		} else {
		balance -= amt; // withdraw subtracts amt from balance
		}
	}

}
