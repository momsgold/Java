import java.text.NumberFormat;

public class modulus {

	public static void main(String[] args) {
		int miles = Console.getInt("Enter the miles:  ");
		int mph = Console.getInt("Enter the miles per hour:  ");
		
		double total = miles / mph;
		int hours = miles / mph;
		int minutesRem = miles % mph;
		double minutes = (mph / 60);
		
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(3);
		
		System.out.println("total = " + total + "\n"
						 + "hours = " + hours + "\n"
						 + "minutes = " + minutes);
	}

}
