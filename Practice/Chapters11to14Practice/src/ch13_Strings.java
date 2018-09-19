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
		System.out.println();
		
		// replace spaces with dashes
		System.out.println("_________Chemical Engineering Textbooks_________");
		for (int i = 0; i < textbooks.length; i++) {
		textbooks[i] = textbooks[i].replace(" ", "-");
		System.out.println(textbooks[i]);
		}
		System.out.println();
		
		// create a new string with StringBuilder
		StringBuilder textbook = new StringBuilder();
		textbook.append("Separation");
		textbook.append("-");
		textbook.append("Process");
		textbook.append("-");
		textbook.append("Principles");
		System.out.println(textbook);
		System.out.println();
		
		// remove dashes from textbook string
//		for (int i = 0; i < textbook.length(); i++) {
//				if (textbook.charAt(i) == "-") {
//				textbook.deleteCharAt(i);
//				i--;
//			}
//		}
		
		// remove dashes from textbooks
		for (int i = 0; i < textbooks.length; i++) {
			textbooks[i] = textbooks[i].replaceAll("-", " ");
			textbooks[i] = textbooks[i].trim();
		}
		
		// separate textbook name into multiple lines
		String berk = "Introductory Chemical Engineering Thermodynamics";
		
		int i1 = berk.indexOf(" ");
		int i2 = berk.indexOf(" ", i1 + 1);
		System.out.println(i1 + ", " + i2);
		
		
//		if (index1 == -1) {
//			System.out.println("Textbook title not in a valid format.");
//		} else {
//			int index2 = berk.indexOf(" ", index1 + 1);
//			if (index2 == -1) {
//				String word1 = berk.substring(0, index1);
//				String word2 = berk.substring(index1 + 1);
//				System.out.println(word1 + " . " + word2);
//			}
//		}
		
		
	}

}
