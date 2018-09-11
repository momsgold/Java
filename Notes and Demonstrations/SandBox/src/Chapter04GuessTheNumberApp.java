import java.util.Scanner;

public class Chapter04GuessTheNumberApp {

	public static void main(String[] args) {
		final int LIMIT = 10; // define constant LIMIT
		
		System.out.println("Guess the number!");
		System.out.println("I'm thinking of a number from 1 to " + LIMIT);
		System.out.println();
		
		// get random number between 1 and LIMIT
		double d = Math.random() * LIMIT; // d is >= 0.0 and < LIMIT
		int number = (int) d; 			  // convert double to int
		number++;						  // int <= 1 and <= LIMIT
		
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (true) {
			System.out.println("Your guess: ");
			int guess = sc.nextInt();
			
			
			if (guess < 1 || guess > LIMIT) {
				System.out.println("Wrong!");
				continue;
			}
			
			if (guess < number) {
				System.out.println("Too low.");
			} else if (guess > number) {
				System.out.println("Too high.");
			} else
				System.out.println("You guessed correctly in " + count + " tries.");
			break;
		}
		count++;
	}
}