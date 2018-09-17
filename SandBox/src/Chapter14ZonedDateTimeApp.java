import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Chapter14ZonedDateTimeApp {

	public static void main(String[] args) {
		Instant now = Instant.now();
		ZonedDateTime cincinnati = now.atZone(ZoneId.of("America/New_York"));
		System.out.println("Cincinnati: " + cincinnati);
		System.out.println("Cincinnati formated: " + cincinnati.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));

		ZonedDateTime tokyo = now.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println("Tokyo: " + tokyo);
		System.out.println("Tokyo formated: " + tokyo.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));

	}

}