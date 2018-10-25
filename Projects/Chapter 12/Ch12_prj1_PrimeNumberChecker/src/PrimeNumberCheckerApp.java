import java.util.ArrayList;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Prime Number Checker' application!");
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int enterInteger = Console.getInt("\nEnter an integer between 1 and 1000:  ", 1, 1000);
			System.out.println();
			
			ArrayList<Integer> primeDivisors = new ArrayList<>();
			double isPrimeNumber = 0;
			for (int i = 1; i <= enterInteger; i++) {
				isPrimeNumber = enterInteger % i;
				if (isPrimeNumber == 0) {
					primeDivisors.add(i);
				}
			}
			
			if (primeDivisors.size() == 2) {
				System.out.println(enterInteger + " is a prime number");	
			} else {
				System.out.println(enterInteger + " is NOT a prime number" + "\n"
								 + "it has " + primeDivisors.size() + " factors: " + primeDivisors);
			}
			
			choice = Console.getString("\nWould you like to continue?  ", "y", "n");
		}
		
		System.out.println("\nBye Q!");
	}

}
