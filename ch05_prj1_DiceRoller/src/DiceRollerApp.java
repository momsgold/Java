import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcom to the 'Dice Roller App'!");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Roll the die?  ");
			choice = sc.next();
			
			int die1 = rollDice();
			int die2 = rollDice();
			int total = die1 + die2;
			
			if (total == 2) {
				System.out.println("Snake eyes");
				} else if (total == 12) {
					System.out.println("Box cars");
				}
			
			String message = "Die 1: " + die1  + "\n"
						   + "Die 2: " + die2  + "\n"
						   + "Total: " + total + "\n";
			System.out.println(message);
		}
	}
	
	public static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
	
	// public static void yessno(sc, "Roll the dice?") {}
					
}

//import java.util.Scanner;
//
//public class DiceRollerApp {
//
//	public static void main(String[] args) {
//		// welcome message
//		System.out.println("Welcome to the 'Dice Roller'");
//		
//		// scanner initialization
//		Scanner sc = new Scanner(System.in);
//		
//		// prompt user to continue (part 1)
//		String choice = "y";
//		while (choice.equalsIgnoreCase("y")) {
//			// input data
//			System.out.print("Would you like to roll th dice? ('y'/'n')  ");
//			String yesOrNo = sc.next();
//			
//			int roll1 = (int) (Math.random() * 6) + 1;
//			int roll2 = (int) (Math.random() * 6) + 1;
//			int total = roll1 + roll2;
//			
//			if (total == 2) {
//				System.out.println("Snake eyes");
//				} else if (total == 12) {
//					System.out.println("Box cars");
//				}
//			
//			String message = "\nDie 1: " + roll1 + "\n"
//					       + "Die 2: "   + roll2 + "\n"
//					       + "Total: "   + total + "\n";
//			System.out.println(message);
//		}
//		
//		choice = sc.next();
//		// exit message
//		System.out.println("Thank you for using the 'Dice Roller'");
//	}
//    
//	// Define method
//	// public static int rollDice() {
//	//	return (int) (Math.random() * 6) + 1;
//	// }
//	
//	// int roll1 = rollDice();
//	// System.out.println(roll1);
//}
