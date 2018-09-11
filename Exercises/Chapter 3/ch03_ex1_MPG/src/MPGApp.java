//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.text.NumberFormat;
//import java.util.Scanner;
//
//public class MPGApp {
//
//    public static void main(String[] args) {
//        System.out.println("Welcome to the Miles Per Gallon calculator");
//        System.out.println();  // print a blank line
//        
//        @SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//        
//        String choice = "y";
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.print("Enter miles driven: ");
//            double miles = sc.nextDouble();
//            
//            System.out.print("Enter gallons of gas used: ");
//            double gallons = sc.nextDouble();
//            
//            // double mpg = miles/gallons;
//            // mpg = (int)Math.round(mpg);
//            // mpg = (double) Math.round(mpg * 100) / 100; 
//            // BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
//            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
//            
//            NumberFormat milesPerGallon = NumberFormat.getNumberInstance();
//            milesPerGallon.setMaximumFractionDigits(2);
//            System.out.println("Miles per gallon is " + milesPerGallon.format(mpg) + ".");
//            
//            // System.out.println("Miles per gallon is " + (double) Math.round(mpg * 100) / 100 + ".");
//            System.out.println(); 
//            
//            System.out.print("Calculate another MPG? (y/n): ");
//            choice = sc.next();
//            System.out.println("Goodbye");
//        }
//    }
//    
//}

import java.util.Scanner;
//import java.lang.Math;
//import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            //double miles = sc.nextDouble();
            BigDecimal miles = new BigDecimal(sc.next());
            
            System.out.print("Enter gallons of gas used: ");
            //double gallons = sc.nextDouble();
            BigDecimal gallons = new BigDecimal(sc.next());
            
            //double mpg = miles/gallons;
            //mpg = (int)Math.round(mpg);
            //mpg = (double) Math.round(mpg * 100) / 100;  
            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
            
            //NumberFormat number = NumberFormat.getNumberInstance();
            //number.setMaximumFractionDigits(2);
            
            //System.out.println("Miles per gallon is " + mpg + ".");           
            //System.out.println("Miles per gallon is " + number.format(mpg) + ".");
            System.out.println("Miles per gallon is " + mpg.toString() + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
