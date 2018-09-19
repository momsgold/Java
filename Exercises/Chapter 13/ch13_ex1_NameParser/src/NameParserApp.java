

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        int length = name.length();
        
        int n1 = name.indexOf(" "); // find the index of a space that occurs in name
        int n2 = name.indexOf(" ", n1 + 1); // if there's a middle name
        
        int i1 = name.indexOf(" ");
		int i2 = name.indexOf(" ", i1 + 1);
		
		if (length == 5) {
		
		int i3 = name.indexOf(" ", i2 + 1);
		
		String firstName = name.substring(0, i1);
		String middleName = name.substring(i1 + 1, i2); // get middle name. starts at i1 + 1 and ends at i2
		String lastName = name.substring(i2 + 1);
		
		String message = "First name:  " + firstName  + "\n"
					   + "Middle name: " + middleName + "\n"
					   + "Last name:   " + lastName   + "\n";
		System.out.println(message);
		
		} else if (length == 3) {
//			int in1 = name.indexOf(" ");
//			int in2 = name.indexOf(" ", in1 + 1);
			String firstName = name.substring(0, i1);
			String lastName = name.substring(i1 + 1); 
			
			String message = "First name:  " + firstName  + "\n"
					   	   + "Last name:   " + lastName   + "\n";
		System.out.println(i1);
		}
		System.out.println(i1);
    }
}
