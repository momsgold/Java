import java.text.NumberFormat;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Tip Calculator' Application!\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double mealCost = Console.getDouble("Enter the cost of the meal:  ");
			double tipPercentage = Console.getInt("Enter the tip percentage (0 - 40):  ", 0, 40);
			
			double tipDecimal = tipPercentage / 100;
			double tipAmount = tipDecimal * mealCost;
			double totalCost = tipAmount + mealCost;
			
			NumberFormat percent = NumberFormat.getPercentInstance();
			NumberFormat number = NumberFormat.getCurrencyInstance();
			
			System.out.println();
			System.out.println(
					"Tip percentage: " + percent.format(tipDecimal) + "\n"
				  + "Tip amount: " + number.format(tipAmount) + "\n"
				  + "Meal total: " + number.format(totalCost));
			
			choice = Console.getString("\nWould you like to continue? (y/n)");
		}
		System.out.println("Thanks for using the 'Tip Calculator' Application");
	}

}
