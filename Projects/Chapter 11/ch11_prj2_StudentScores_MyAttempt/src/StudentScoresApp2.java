
public class StudentScoresApp2 {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Student Scores' application!");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			
			choice = Console.getString("Would you like to continue? ");
		}
		
		System.out.println("Thank you for using the 'Student Scores' application!");
	}

}
