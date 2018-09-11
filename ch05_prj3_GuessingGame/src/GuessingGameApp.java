import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Guessing Game' application");
		
		// scanner initialization
		Scanner sc = new Scanner(System.in);
		
		// prompt user to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
				
			boolean correctGuess = false;
			int theNumber = randomNumber();
			int tries = 0;
			while (!correctGuess) {
				int guess = getInt("Enter number:  ", sc, 1 , 100);
				tries ++; // will only count valid guesses
				
				// compare guess vs the Number
				String response = ""; // initialize response
				if (guess > theNumber) {
					int difference = guess - theNumber;
					if (difference > 10) {
						response = "Way too high!";
					} else {
						response = "Too high.";
					}
				} else if (guess < theNumber) {
					int difference = theNumber - guess;
					if (difference > 10) {
						response = "Way too low!";
					} else {
						response = "Too low.";
					}
				} else { // correct guess
					response = "Way to go! You got it in " + tries + " tries";
					correctGuess = true; // breaks out of the loop
				}
				System.out.println(response);
			}
			
			// use the counter (tries) to display number of guesses
			if (tries <= 3) {
				System.out.println("I said you did a great jorb there!");
			} else if (tries < 7) {
				System.out.println("Not too bad!");
			} else {
				System.out.println("Took you long enough...");
			}
		
			// prompt user to continue (part 2)
			System.out.print("Try again?  ");
			choice = sc.next();
		}
		// exit message
		System.out.println("\nThank you for using the 'Guessing Game' application");
	}

	// get random number from 1 to 100
	private static int randomNumber() {
		System.out.println("\nI'm thinking of a nunmber between 1 and 100.");
		System.out.println("Try to guess it.\n");

		return (int) (1 + Math.random() * 100);
	}
	
	// data validation
	private static int getInt(String prompt, Scanner scan) {
		System.out.print(prompt + " ");
		int n = 0;
		boolean isValid = false;
		while (!isValid) {
		if (scan.hasNextInt()) { // see if user entered an integer
			isValid = true;
			n = scan.nextInt();
			} else {
				System.out.println("Please enter a valid integer between 0 and 100");
			}
		}
		return n;
	}
	
	// overloading a method - reusing method with different/additional parameters
	// set range of input
	private static int getInt(String prompt, Scanner scan, int min, int max) {
		boolean isValid = false;
		int n = 0;
		while (!isValid) {
			n = getInt(prompt, scan);
			if (n < min) {
				System.out.println("Number below 0 (" + min + ").");
			} else if (n > max) {
				System.out.println("Number above 100 (" + max + ").");
			} else {
				isValid = true;
			}
		}
		return n;
	}
	
}
