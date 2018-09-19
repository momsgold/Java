import java.util.ArrayList;

public class ch12_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> textbooks = new ArrayList<>();
		textbooks.add("Introductory Chemical Engineering Thermodynamics");
		textbooks.add("Separation Process Principles");
		textbooks.add("Essentials of Chemical Reaction Engineering");
		
		// add additional
		textbooks.add("Multivariable Calculus");
		// remove last book
		String book = textbooks.remove(3);
		
		System.out.println("_________Chemical Engineering Textbooks_________");
		for (String s : textbooks) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("'" + book + "' was removed");
		
	}

}
