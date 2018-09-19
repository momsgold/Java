import java.util.Arrays;

public class ch13_Strings {

	public static void main(String[] args) {
		String[] textbooks = {
				"Introductory Chemical Engineering Thermodynamics",
				"Separation Process Principles",
				"Essentials of Chemical Reaction Engineering"
				};
		Arrays.sort(textbooks);
	
		// count the characters in each textbook name
		for (int i = 0; i < textbooks.length; i++) {
			String book = textbooks[i];
			int length = book.length();
			System.out.println("length of '" + textbooks[i] + "' is " + length + " characters");
		}
		
	}

}
