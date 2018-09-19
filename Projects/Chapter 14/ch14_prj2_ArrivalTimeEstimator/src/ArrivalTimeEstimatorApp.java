
public class ArrivalTimeEstimatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Arrival Time Estimator\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String departureDate = Console.getString("Departure date (YYYY-MM-DD):  ");
			
			choice = Console.getString("Would you like to continue? ('y'/'n')?");
		}
		
		// exit message
		System.out.println("Bye, Q!");
	}

}
