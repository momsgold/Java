import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Chapter03FormattingApp {

	public static void main(String[] args) {
		// currency formatting
		double price = 11.5751;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		// String priceString = currency.format(price);
		// System.out.println("Formatted price = " + priceString);
		System.out.println("Formatted price = " + currency.format(price));
		// System.out.println("another formatting option = " + );

		// percentage formatting
		double majority = 0.505;
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.println("");
		System.out.println("Formatted percent = " + percent.format(majority));
		
		// BigDecimal string
		BigDecimal subtotal = new BigDecimal("100.05");
		BigDecimal discountPercent = new BigDecimal("0.1");
		System.out.println("");
		System.out.println("Subtotal = " + subtotal);
		System.out.println("Discount percent = " + discountPercent);
		
		// BigDecimal multiply and round. Multiply subtotal (100.05) by discountAmount (10%)
		BigDecimal discountAmount = subtotal.multiply(discountPercent);
		discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP);
		System.out.println("");
		System.out.println("Discount amount = " + discountAmount);
		
		
		// create constant
		final BigDecimal SALES_TAX_PCT = new BigDecimal("0.05");
		
		// BigDecimal subtract numbers
		BigDecimal totalBeforeTax = subtotal.subtract(discountAmount);
		BigDecimal total = totalBeforeTax.add(SALES_TAX_PCT);
		System.out.println("");
		System.out.println("Total = " + total);
		
		// Use BigDecimal to round a double value
		// discountAmount = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

}
