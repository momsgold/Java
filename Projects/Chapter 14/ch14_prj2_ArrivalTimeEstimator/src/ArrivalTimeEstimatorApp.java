import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ArrivalTimeEstimatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Arrival Time Estimator\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String departureDate = Console.getString("Departure date (YYYY-MM-DD):  ");
			String departureTime = Console.getString("Departure time (HH:MM):  ");
			int numberOfMiles = Console.getInt("Number of miles:  ");
			int milesPerHour = Console.getInt("Miles per hour:  ");
			
			double travelTime = numberOfMiles / milesPerHour;
			int travelTimeHours = numberOfMiles / milesPerHour;
			int travelTimeMinutes = numberOfMiles % milesPerHour;
			
			System.out.println("\nEstimated travel time");
			String message = "Hours: " + travelTimeHours + " hours" + "\n"
						   + "Minutes: " + travelTimeMinutes + " minutes" + "\n"
						   + "Estimated date of arrival: " + formatDate(addDate(getDate(departureDate), travelTimeHours)) + "\n"
						   + "Estimated arrival time: " + 
						   formatTime(addTime(getTime(departureTime), travelTimeHours, travelTimeMinutes));
			System.out.println(message);
			
			choice = Console.getString("\nWould you like to continue? ('y'/'n')? ");
		}
		
		// exit message
		System.out.println("\nBye, Q!");
	}
	
	// get the date into the date format
	public static LocalDate getDate(String date) {
		int index1 = date.indexOf("-");
		int index2 = date.indexOf("-", index1 + 1);
		
		String departureYear = date.substring(0, index1);
		String departureMonth = date.substring(index1 + 1, index2);
		String departureDay = date.substring(index2 + 1, date.length());
		
		int year = Integer.parseInt(departureYear);
		int month = Integer.parseInt(departureMonth);
		int day = Integer.parseInt(departureDay);
		
		LocalDate departure = LocalDate.of(year, month, day);
		return departure;
	}
	
	// get the time into the time format
	public static LocalTime getTime(String time) {
		int index1 = time.indexOf(":");
		
		String departureHour = time.substring(0, index1);
		String departureMinutes = time.substring(index1 + 1, time.length());
		
		int hour = Integer.parseInt(departureHour);
		int minutes = Integer.parseInt(departureMinutes);
		
		LocalTime departure = LocalTime.of(hour, minutes);
		
		return departure;
	}
	
	// add days to the departure date
	public static LocalDate addDate(LocalDate date, int hours) {
		int days = 0;
		for (int i = 1; i > 0; i++) {
			if (hours < 24) {
				days = 0;
			} else {
				days = i;
				break;
			}
		}
		LocalDate newHours = date.plusDays(days);
		return newHours;
	}
	
	// get the final time
	public static LocalTime addTime(LocalTime time, int hours, int minutes) {
		LocalTime newHours = time.plusHours(hours);
		LocalTime newTime = newHours.plusMinutes(minutes);
		return newTime;
	}
	
	// format the date
	// I know I probably could have done this formatting stuff in addTime and addDate, but I wanted more practice writing methods
	public static String formatDate(LocalDate date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return dtf.format(date);
	}
	
	// format the time
	public static String formatTime(LocalTime time) {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		return dtf.format(time);
	}
}