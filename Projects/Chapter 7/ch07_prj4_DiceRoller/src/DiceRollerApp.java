
public class DiceRollerApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Dice Roller' application!");

		// prompt user if they want to continue (part 1)
		String choice = Console.getString("Would you like to roll the dice? ", "y", "n");
		while (choice.equalsIgnoreCase("y")) {
			// prompt user for input
			// create new instance of Grade class
			RandomRoll die1 = new RandomRoll();
			System.out.println(die1.getRoll());
			choice = Console.getString("Would you like to roll the dice? ", "y", "n");						
		}
		
		// exit message
		System.out.println("\nThank you for using the 'Dice Roller' application!");
	}

}
