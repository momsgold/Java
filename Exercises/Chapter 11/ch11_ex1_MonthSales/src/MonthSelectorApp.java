import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String[] monthName = {"January", "February", "March", "April", "May", 
                "June", "July", "August", "September", "October", "November", 
                "December"};
        
        double[] monthSales = {1287.45, 2814.57, 1784.59, 2287.66, 3174.73,
                2799.41, 2458.79, 2697.45, 3279.62, 2970.77, 2788.09, 2349.88};


        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        int monthNumber = 1;
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            monthNumber = Console.getInt("Enter month number: ");
            
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales            


            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        
        
        // display the total sales for the year
        
        
        Console.displayLine("");
        }
    }
}