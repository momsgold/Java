import java.util.ArrayList;

public class ch12_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> textbooks = new ArrayList<>();
		textbooks.add("Introductory Chemical Engineering Thermodynamics");
		textbooks.add("Separation Process Principles");
		textbooks.add("Essentials of Chemical Reaction Engineering");
		
		textbooks.add("Multivariable Calculus");
		
		for (String s : textbooks) {
			System.out.println(s);
		}
		
	}

}
