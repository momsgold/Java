
public class GradeConverterApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Grade Converter' application!");
		
		
		// prompt user if they want to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		
		// prompt user for input
		int grade = Console.getInt("\nEnter a numerical grade from 0 to 100:  ", 0, 100);
		// create new instance of Grade class
		Grade g = new Grade(grade);
		
		// display letter grade
		System.out.println("\nLetter grade: " + g.getLetter());
		
		// refer to Console class and getStringmethod
		choice = Console.getString("\nWould you like to continue? ('y'/'n')  ", "y", "n");
		}
		// exit message
		System.out.println("\nThank you for using the 'Grade Converter' application!");
	}

}
