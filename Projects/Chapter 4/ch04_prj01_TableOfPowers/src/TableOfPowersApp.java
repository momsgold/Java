import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Squares and Cubes table");
		
		// Scanner initialization
		Scanner sc = new Scanner(System.in);
		
		// prompt user to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			// prompt user for input
			System.out.print("Enter an integer:  ");
			int integerVariable = sc.nextInt();
			
			String table = "";
			String header = "Number\tSquared\tCubed\n";
			String separator = "======\t=======\t=====\n";
			
			table += header;
			table += separator;
			
			for (int i = 1; i <= integerVariable; i ++) {
				// System.out.println(i); // check to see if for loop works, should print out i from 1 to integerVariable
				int squared = i * i;      // can also use Math.pow(integerVariable, 2);
				int cubed = i * i * i;	  // can also use Math.pow(integerVariable, 3);
				table += i + "\t" + squared + "\t" + cubed + "\n"; // don't forget "\n" at the end!
				}
			
			// print table
			System.out.println(table);
			
			// prompt user if they want to continue (part 2)
			System.out.print("Would you like to continue? ('y'/'n')  ");
			choice = sc.next();
			}
		
		//exit message
		sc.close();
		System.out.println("Thank you for using the Squares and Cubes table!");
	}
}