import java.awt.print.Book;
import java.util.Arrays;

public class ch11_Arrays {

	public static void main(String[] args) {
		String[] textbooks1 = {
				"Introductory Chemical Engineering Thermodynamics",
				"Separation Process Principles",
				"Essentials of Chemical Reaction Engineering"
				};
		Arrays.sort(textbooks1);
		
		System.out.println("__________CHEMICAL ENGINEERING TEXTBOOKS__________");
		for (int i = 0; i < textbooks1.length; i++) {
			System.out.println((i + 1) + ". " + textbooks1[i]);
		}
		
		// OR DO THIS
		
		System.out.println("\n__________CHEMICAL ENGINEERING TEXTBOOKS__________");
		for (String book : textbooks1) {
			
//			for (int i = 0; i < textbooks1.length; i++) {
//			System.out.println((i + 1) + ". " + book);	
//			}
			System.out.println(book);
		}
		
		// OR DO THIS
		
		String[][] textbooks2 = {{"1", "Introductory Chemical Engineering Thermodynamics"},
								 {"2", "Separation Process Principles"}, 
								 {"3", "Essentials of Chemical Reaction Engineering"}
								};
		
		System.out.println("\n__________CHEMICAL ENGINEERING TEXTBOOKS__________");
		for (int i = 0; i < textbooks2.length; i++) {
			for (int j = 0; j < textbooks2[i].length; j++) {
				System.out.println(textbooks2[i][j]);
			}
		}
	}
}
