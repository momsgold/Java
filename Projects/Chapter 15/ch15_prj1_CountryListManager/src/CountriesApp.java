import java.util.List;

public class CountriesApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Countries List Manager' application!");

		CountryIO cio = new CountryIO();
		
		// prompt user to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String command = "";
			while (!command.equalsIgnoreCase("3")) {
				displayCommandMenu();
				command = Console.getString("Enter menu number:  ");
				if (command.equals("1")) {
					// list countries
					List<Country> countries = cio.getAll();
					if (countries == null || countries.size() == 0) {
						System.out.println("Countries file doesn't exist. Please add a country.");
					} else {
						for (Country c : countries) {
							System.out.println(c.toFormattedDisplay());
						}
						System.out.println();	
					}
					
				} else if (command.equals("2")) {
					// add country
					int id = Console.getInt("Enter country ID:  ");
					String code = Console.getString("Enter country code"  );
					String name = Console.getString("Enter country name:  ");
					Country c = new Country(id, code, name);
					
					if (cio.add(c)) {
						System.out.println("This country has been added!");
					} else {
						System.out.println("Error adding country!");
					}
					System.out.println();
					
				} else if (command.equals("3")){
					// remove country
					int id = Console.getInt("Enter ountry ID to remove:  ");
					Country c = cio.get(id); // c is the instance of Country
					if (cio.remove(c)) {
						System.out.println(c.getCode() + " was successfully removed!");
					} else {
						System.out.println("An error has occurred");
					}
					System.out.println();
					
				} else if (!command.equals("4")) {
					// invalid command if it isn't 1-3
					System.out.println("Invalid command! Please try again.");
				}
			}
		
			
			choice = Console.getString("Would you like to continue?  ");
		}
		
		// exit message
		System.out.println("Thank you for using the 'Countries List Manager' application!");
	}
	
	private static void displayCommandMenu() {
		System.out.println("COMMAND MENU\n" 	    +  
						   "1 - List countries\n"   + 
						   "2 - Add a country\n"    + 
						   "3 - Remove a country\n" +
						   "4 - Exit");
	}

}
