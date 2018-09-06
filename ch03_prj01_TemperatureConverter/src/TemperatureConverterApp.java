import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Temperature Converter Application");
		
		// prompt user for input
		Scanner sc = new Scanner(System.in);
		
		//prompt user to continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		// input data
		System.out.print("Enter degrees in Fahrenheit: ");
		double degreesF = sc.nextDouble();
		double degreesC = (degreesF - 32) * 5/9;
		
		// output data
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		System.out.println("Degrees in celcius: " + number.format(degreesC));
		
		 // prompt user if they want to continue cont...
		 System.out.println("Continue? ('y'/'n')");
		 choice = sc.next();
		}
		// sc.close;
		
		// end message
		System.out.println("Thank you for using the Temperature Converter Application");
	}

}
