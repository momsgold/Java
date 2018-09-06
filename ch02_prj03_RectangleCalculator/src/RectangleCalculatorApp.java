import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Area and Perimeter Calculator");
		
		// prompt user for input
		Scanner sc = new Scanner(System.in);
		
		// prompt the user if they want to continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter length: ");
		int length = sc.nextInt();
		System.out.print("Enter width: ");
		int width = sc.nextInt();
		int area = length * width;
		int perimeter = 2 * (length + width);
		
		// output data
		 String message = "Length: "    + length    + " m"    + "\n"
  			   			+ "Width: "     + width     + " m"    + "\n"
  			   			+ "Area: "      + area      + " m^2"  + "\n"
  			   			+ "Perimeter: " + perimeter + " m"    + "\n";
		 System.out.println(message);
		 
		 // prompt user if they want to continue cont...
		 System.out.println("Continue? ('y'/'n')");
		 choice = sc.next();
		} // close while statement
		
		sc.close();
		
		// exit message
		System.out.println("Thank you for using the Area and Perimeter Calculator");
	}

}
