import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// 1. Welcome message
		System.out.println("Student Registration Form");
		
		// 2. Prompt user for info
		Scanner sc = new Scanner(System.in);
		
		// prompt user if they want to continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		// 3. Biz shit
		String firstName = "";
		String lastName = "";
		int birthYear = 1960;
		
		// get the input from the user
		System.out.print("Enter first name: ");
		firstName = sc.next();
		System.out.print("Enter last name: ");
		lastName = sc.next();
        System.out.print("Enter first name: ");
        birthYear = sc.nextInt();
      //  firstName = sc.equalsIgnoreCase();
		
		// 4. Output data
		 String message = "\n"
	                + "First name: " + firstName + "\n"
	                + "Last name: "  + lastName  + "\n"
	                + "Birth year: " + birthYear + "\n";
	        System.out.println(message);
		
	     // prompt user if they want to continue cont...
	     System.out.print("Continue? ('y'/'n') ");
	     choice = sc.next();
		}
		
		sc.close();
		
		// 6. Exit message
		System.out.println("Thank you for using the Student Registration application");
	}

}
