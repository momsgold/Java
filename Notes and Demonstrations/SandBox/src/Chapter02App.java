import java.util.Scanner;

public class Chapter02App {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		System.out.print("Enter an integer: ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		System.out.print("Enter another integer: ");
		double b = sc.nextInt();
		
		// double avg = ((double)a + (double)b) / 2; // without casting a and b as "double" because average was not using enough sig figs
		double avg = (a + b) / 2;
		System.out.println("Average = " + avg);
		
		// if avg > 10, say "yay" else, say "sucks"
		if (avg > 10) {
			System.out.println("Yay! Greater than 10!");
			System.out.println("Average = " + avg);
		} // if there is more than one output, use curly braces
		else {
			System.out.println("Sucks. Not greater than 10.");
			System.out.println("Average = " + avg);
		}
		
		// Get a string from user, and test if it equals "yes"
		System.out.println("Enter 'yes' or 'no'"); // tells them to spell it out like that
		String str = sc.next();
		if (str.equals("yes"))
			System.out.println("User entered 'yes'");
		
		System.out.println("Bye");
		
		sc.close(); //fix resource leak sc
	}

}
