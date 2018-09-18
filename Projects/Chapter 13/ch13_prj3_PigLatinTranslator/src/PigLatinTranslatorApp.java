
public class PigLatinTranslatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Pig Latin Translator' application!\n");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String enterLine = Console.getString("Enter a line:  ");
//			String[] lineParts = enterLine.split(" ");
//			System.out.println(lineParts[0] + lineParts[1]);
			
			choice = Console.getString("Would you like to enter another line?  ");
		}
		
		System.out.println("\nThank you for using the 'Pig Latin Translator' application!");
	}

}
