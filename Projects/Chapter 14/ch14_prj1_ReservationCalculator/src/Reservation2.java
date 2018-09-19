import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation2 {
	// instance variables
	public static final double PRICE_PER_NIGHT = 145.00;
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	
	// constructor
	public Reservation2(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	// getters and setters
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	// methodssssssss and such
	// format arrivalDate variable
	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dtf.format(arrivalDate);
	}
	
	// format departureDate variable
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dtf.format(departureDate);
	}
	
	// calculate length of stay
	public int getNumberOfNights() {
		long numNights = ChronoUnit.DAYS.between(arrivalDate,  departureDate);
		return (int) numNights;	
	}
	
	// format the PRICE_PER_NIGHT constant
	public String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(PRICE_PER_NIGHT);
	}
	
	// calculate the total price of the stay
	public double getTotalPrice() {
		double returnVal = PRICE_PER_NIGHT * this.getNumberOfNights();
		return returnVal;
	}
	
	// format the total price for the stay
	public String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotalPrice());
	}
	
//	public double formatPrice(double price) {
//		NumberFormat currency = NumberFormat.getCurrencyInstance();
//		return Double.parseDouble(currency.format(price));
//	}
}
