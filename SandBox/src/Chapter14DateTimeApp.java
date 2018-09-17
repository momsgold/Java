import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Chapter14DateTimeApp {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("Date: " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Time: " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Date and time: " + currentDateTime);

		LocalDate halloween = LocalDate.of(2018, 10, 31);
		System.out.println("Halloween: " + halloween);
		
		LocalDate christmas = LocalDate.of(2018, 12, 25);
		System.out.println("Christmas day: " + christmas);
		
		LocalDateTime birthday = LocalDateTime.of(2018, 12, 30, 17, 9, 00);
		System.out.println("My birthday: " + birthday);
		System.out.println("My birthday this year is on a " + birthday.getDayOfWeek());
		System.out.println("My birthday this year is on day " + birthday.getDayOfYear());
		
		if (halloween.isBefore(christmas)) {
			System.out.println("Halloween is before Christmas");
		}
		
		System.out.println(halloween.compareTo(christmas)); // returns -2 for months
		
		LocalDate changeHalloween = halloween.withMonth(2);
		System.out.println("Change Halloween to " + changeHalloween); //changed 31 to 28 since 28 days in Feb
		
		LocalDate feb29 = changeHalloween.plus(1, ChronoUnit.DAYS);
		System.out.println("Add 1 day to Feb 29: " + feb29);
		
		// format a date/time
		LocalDateTime future = LocalDateTime.of(2018, 9, 22, 13, 10, 00);
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(dtf.format(future));
		
		// format a date
		LocalDate future2 = LocalDate.of(2018, 9, 22);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(dtf2.format(future2));
		
		
	}

}
