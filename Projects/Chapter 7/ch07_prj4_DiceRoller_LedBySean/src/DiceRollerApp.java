import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Dice Roller' application!");

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Roll the dice? ('y'/'n')?  ");
		String choice = sc.next();
		while (choice.equalsIgnoreCase("y")) {
			// new instance will automatically roll the dice
			Dice d = new Dice();
			// Dice toString will return result of roll
			System.out.println(d);
			
			System.out.print("Roll again?  ");
			choice = sc.next();
		}
		
		sc.close();
		// exit message
		System.out.println("Thank you for using the 'Dice Roller' application!");
	}
	
}
