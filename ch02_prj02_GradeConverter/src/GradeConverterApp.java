import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {

		// 1. Welcome message
		System.out.println("Welcome to the Letter Grade Converter");

		// 2. Prompt for user input
		Scanner sc = new Scanner(System.in);

		// 5. Prompt to continue
		String choice = "y"; // set default value/string for variable 'choice'
		// only runs code if user selects 'y'
		while (choice.equalsIgnoreCase("y")) { // while this evaluates to true, run all code inside curly braces

			System.out.print("Enter numerical grade  ");
			int numericalGrade = sc.nextInt(); // get from user
			String letterGrade = ""; // need a var to display message

			// 3. Biz logic. Convert numeric grade to letter grade
			if (numericalGrade >= 88) {
				letterGrade = "A";
			} else if (numericalGrade >= 80) {
				letterGrade = "B";
			} else if (numericalGrade >= 68) {
				letterGrade = "C";
			} else if (numericalGrade >= 60) {
				letterGrade = "D";
			} else { // don't need a test
				letterGrade = "F";
			}

			// 4. Output letter grade to user
			System.out.print("Letter grade: " + letterGrade);

			System.out.println("Letter grade: " + letterGrade); // print letter grade variable

			// 5. Prompt user to continue cont...
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		} // close while before sc.close()
		sc.close();

		// 6. Goodbye message
		System.out.println("Goodbye");

	}

}
