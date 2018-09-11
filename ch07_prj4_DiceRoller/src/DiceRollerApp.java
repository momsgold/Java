
public class DiceRollerApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Dice Roller' application!");

		// prompt user if they want to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
	
			// prompt user for input
			int roll = Console.RollDie();
			// create new instance of Grade class
			RandomRoll die1 = new RandomRoll(roll);
			
			// refer to Console class and getStringmethod
			choice = Console.getString("\nWould you like to continue? ('y'/'n')  ", "y", "n");
		}
		
		
		
		// exit message
		System.out.println("\nThank you for using the 'Dice Roller' application!");
	}

}
