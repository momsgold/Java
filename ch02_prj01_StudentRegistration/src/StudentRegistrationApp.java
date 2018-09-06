import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// 1. Welcome message
		System.out.println("Student Registration Form");
		
		// 2. Prompt user for info
		Scanner sc = new Scanner(System.in);
		
		// 3. Biz shit
		String firstName = "";
		String lastName = "";
		int birthYear = 1960;
		
		// get the input from the user
        System.out.print("Enter first name: ");
        birthYear = sc.Int();
      //  firstName = sc.equalsIgnoreCase();
		
		// 4. Output data
		 String message = "\n"
	                + "First name: " + firstName + "\n"
	                + "Last name: "  + lastName  + "\n"
	                + "Birth year: " + birthYear + "\n";
	        System.out.println(message);
		
		// 6. Exit message
		System.out.println("Goodbye");
	}

}
