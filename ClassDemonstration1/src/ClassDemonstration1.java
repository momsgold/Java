import java.util.Scanner;

public class ClassDemonstration1 {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("Hello, world");
		
		// Get input from user
		Scanner sc = new Scanner(System.in); // get information in from the user
		System.out.print("enter price"); // print instead of println will have the price entered on the same line
		double price = sc.nextDouble();
		
		// Print "this is your price
		System.out.println("This is your #:  " + price);
		
		// Goodbye message
		System.out.println("Bye Q!");
		
		sc.close(); // close the scanner to get rid of sc resource leak error
	}

}
