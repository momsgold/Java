import java.text.NumberFormat;
import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Travel Time Calculator");
		
		// prompt user for input
		Scanner sc = new Scanner(System.in);
		
		// prompt user to continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter miles: ");
		double miles = sc.nextDouble();
		System.out.print("Enter miles per hour: ");
		double mph = sc.nextDouble();
		double hours = miles / mph;
		double minutes = (miles % mph);
		NumberFormat numberHours = NumberFormat.getNumberInstance();
		numberHours.setMaximumFractionDigits(0);
		NumberFormat numberMinutes = NumberFormat.getNumberInstance();
		numberMinutes.setMaximumFractionDigits(0);
		String message = "Estimated travel time"     + "\n"
				+ "Hours: "   + numberHours.format(hours) + "\n"
				+ "Minutes: " + numberMinutes.format(minutes) + "\n";
		System.out.println(message);
		
		// prompt user to continue (cont...)
		System.out.println("Would you like to continue? ('y'/'n')");
		choice = sc.next();
		}
		// exit message
		System.out.println("Thank you for using the Travel Time Calculator");
	}

}
