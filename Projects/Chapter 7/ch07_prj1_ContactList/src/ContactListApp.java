import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Contact List' application.\n");
		
		// scanner initialization
		Scanner sc = new Scanner(System.in);
		
		// prompt user to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		// prompt user for input
		System.out.print("Enter first name:  ");
		String firstName = sc.next();
		System.out.print("Enter last name:  ");
		String lastName = sc.next();
		System.out.print("Enter email:  ");
		String email = sc.next();
		System.out.print("Enter phone:  ");
		String phoneNumber = sc.next();
		
		ContactList newEntry = new ContactList(firstName, lastName, email, phoneNumber);
		System.out.println("New user entry: " + newEntry);
	
		// prompt user to continue (part 2)
		System.out.print("Would you like to add another contact? ('y'/'n')  ");
		choice = sc.next();
		}
		
		sc.close();
		System.out.println("\nThank you for using the 'Contact List' application.");
	}

}
