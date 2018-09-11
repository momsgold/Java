import java.util.Scanner;

public class Chapter04ConsoleMethodsApp {

	public static void main(String[] args) {
		// specifications:
		// (1) get 3 integers (a, b, c)
		// (2) print to screen
		
		System.out.println("Welcome to the 'Console Methods' application");	
		Scanner sc1 = new Scanner(System.in);
		
		int a = promptForInt("Enter # a: ", sc1);
		int b = promptForInt("Enter # b: ", sc1);
		int c = promptForInt("Enter # c: ", sc1);
		
		System.out.println("Numbers entered: " + a + ", " + b + ", " + c);
		System.out.println("Thank you for using the 'Console Methods' application");
		sc1.close();
	}

	private static int promptForInt(String prompt, Scanner sc2) {
		System.out.print(prompt);
		int number = sc2.nextInt();
		return number;
	}
	
}
