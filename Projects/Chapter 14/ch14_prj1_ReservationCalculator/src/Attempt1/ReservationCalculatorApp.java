package Attempt1;
import java.time.LocalDate;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Reservation Calculator' application!\n");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// enter arrival date
			int arrivalMonth = Console.getInt("Enter arrival month (1-12):  ");
			int arrivalDay = Console.getInt("Enter arrival day (1-31):  ");
			int arrivalYear = Console.getInt("Enter arrival year:  ");
			System.out.println();
			// enter departure date
			int departureMonth = Console.getInt("Enter arrival month (1-12):  ");
			int departureDay = Console.getInt("Enter arrival day (1-31):  ");
			int departureYear = Console.getInt("Enter arrival year:  ");
			System.out.println();
			
			LocalDate arrivalDate = LocalDate.of(arrivalYear, arrivalMonth, arrivalDay);
			LocalDate departureDate = LocalDate.of(departureYear, departureMonth, departureDay);
			
			// WHAT DOES THIS DO?!?!?!?!?!?
			Reservation reservation = new Reservation(arrivalDate, departureDate);

			String message = "Arrival date: " + arrivalDate + "\n"
						   + "Departure date: " + departureDate + "\n";
			System.out.println(message);
			//System.out.println(getArrivalDateFormatted(arrivalYear));
			
			choice = Console.getString("\nWould you like to continue?  ");
		}
		
		// exit message
		System.out.println("\nThank you for using the 'Reservation Calculator' application!");
	}

}
