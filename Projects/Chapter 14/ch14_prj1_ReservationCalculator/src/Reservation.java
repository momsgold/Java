import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	public static final double COST_OF_NIGHT = 145;
	private LocalDate arrivalDate;
	private String arrivalDateFormatted;
	private LocalDate departureDate;
	private String departureDateFormatted;
	private int numberOfNights;
	private String pricePerNightFormatted;
	private double totalPrice;
	private String totalPriceFormatted;
	
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}


//	public Reservation(LocalDate arrivalDate, String arrivalDateFormatted, LocalDate departureDate,
//			String departureDateFormatted, int numberOfNights, String pricePerNightFormatted, double totalPrice,
//			String totalPriceFormatted) {
//		super();
//		this.arrivalDate = arrivalDate;
//		this.arrivalDateFormatted = arrivalDateFormatted;
//		this.departureDate = departureDate;
//		this.departureDateFormatted = departureDateFormatted;
//		this.numberOfNights = numberOfNights;
//		this.pricePerNightFormatted = pricePerNightFormatted;
//		this.totalPrice = totalPrice;
//		this.totalPriceFormatted = totalPriceFormatted;
//	}

	
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return dtf.format(getArrivalDate());
	}

//	public void setArrivalDateFormatted(String arrivalDateFormatted) {
//		this.arrivalDateFormatted = arrivalDateFormatted;
//	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return dtf.format(getDepartureDate());
	}

//	public void setDepartureDateFormatted(String departureDateFormatted) {
//		this.departureDateFormatted = departureDateFormatted;
//	}

	public int getNumberOfNights() {
		// time between
		long numDays = ChronoUnit.DAYS.between(getArrivalDate(), getDepartureDate());
		return (int) numDays;
	}

//	public void setNumberOfNights(int numberOfNights) {
//		this.numberOfNights = numberOfNights;
//	}

	public String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(COST_OF_NIGHT);
	}

//	public void setPricePerNightFormatted(String pricePerNightFormatted) {
//		this.pricePerNightFormatted = pricePerNightFormatted;
//	}

	public double getTotalPrice() {
		return totalPrice;
	}

//	public void setTotalPrice(double totalPrice) {
//		this.totalPrice = totalPrice;
//	}

	public String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getNumberOfNights() * COST_OF_NIGHT);
	}

//	public void setTotalPriceFormatted(String totalPriceFormatted) {
//		this.totalPriceFormatted = totalPriceFormatted;
//	}
	
}
