import java.util.HashMap;
import java.util.Map;

public class ch12_HashMap {

	public static void main(String[] args) {
		Map<String, String> textbooks = new HashMap<>();
		textbooks.put("1", "Introductory Chemical Engineering Thermodynamics");
		textbooks.put("2", "Separation Process Principles");
		textbooks.put("3", "Essentials of Chemical Reaction Engineering");
		
		// add a textbook
		textbooks.put("4", "Multivariable Calculus");
		// remove last textbook
		String book = textbooks.remove(3);
		
		System.out.println("__________Chemical Engineering Textbooks__________");
		for (Map.Entry textbook : textbooks.entrySet()) {
			System.out.println(textbook.getKey() + ". " + textbook.getValue());
		}
		System.out.println();
		System.out.println("'" + book + "' was removed");
	}

}
