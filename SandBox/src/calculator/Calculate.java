package calculator;

public class Calculate {
	// instance variables
	private int num1;
	private int num2;
	
	// constructor
	public Calculate() {
		super();
		this.num1 = 0;
		this.num2 = 0;
		}

	// getters and setters
	public int getNum1() {
		return num1;
		}

	public void setNum1(int num1) {
		this.num1 = num1;
		}

	public int getNum2() {
		return num2;
		}

	public void setNum2(int num2) {
		this.num2 = num2;
		}
	
	// add and subtract methods
	public int add() {
		return num1 + num2;
		}
	
	public int subtract() {
		return num1 - num2;
		}
	
}
