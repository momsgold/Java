import java.util.Scanner;

public class RandomRoll {
	private int roll;
	
	// create an instance of Scanner
    private static Scanner sc = new Scanner(System.in);
	
	public RandomRoll() {
		super();
		this.roll = rollDice();
	}

	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public static Scanner getSc() {
		return sc;
	}


	public static void setSc(Scanner sc) {
		RandomRoll.sc = sc;
	}


	public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
	}
	
}
