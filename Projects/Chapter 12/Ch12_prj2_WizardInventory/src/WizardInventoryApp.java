import java.util.HashMap;
import java.util.Map;

public class WizardInventoryApp {
	// declare inventory HashMap
	private static HashMap<Integer, String> inventory = new HashMap<>();

	public static void main(String[] args) {
		// welcome message
		System.out.println("Wizards only, fool!\n");
		populateInitialInventory();		
		
		String command = ""; //initialize an empty string because we're using it inside a while loop
		while (!command.equalsIgnoreCase("exit")) { // if input does NOT equal "exit", do this stuff
			displayMenuItems();
			command = Console.getString("Command: ");
			System.out.println();
			if (command.equalsIgnoreCase("show")) {
				// show wizard inventory
				showInventoryItems();
				
			} else if (command.equalsIgnoreCase("grab")) {
				// add item to inventory
				String newItem = Console.getString("Item name:  ");
				System.out.println(addInventoryItem(newItem));
				
			} else if (command.equalsIgnoreCase("edit")) {
				// edit an item in inventory
				int itemNumber = Console.getInt("Item number:  ");
				System.out.println(editInventoryItem(itemNumber));
				
			} else if (command.equalsIgnoreCase("drop")) {
				// delete item from inventory
				int itemNumber = Console.getInt("Item number:  ");
				System.out.println(deleteInventoryItem(itemNumber));
				
			} else if (command.equalsIgnoreCase("menu")) {
				displayMenuItems();
				
			} else if (!command.equalsIgnoreCase("exit")) { // if NOT equal to "exit", do this stuff
				// user entered an invalid command
				System.out.println("Invalid command. Try again.");
				displayMenuItems(); // then display the menu items again
			}
		}
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			
			choice = Console.getString("\nWould you like to continue? ('y'/'n')  ", "y", "n");
		}
		
		System.out.println("Wizards rule!");
	}
	
	// show all the menu options in separate method
	public static void displayMenuItems() {
		System.out.println("COMMAND MENU: ");
		System.out.println("show - Show all items" + "\n"
					   	  + "grab - Grab an item"  + "\n"
					   	  + "edit - Edit an item"  + "\n"
					   	  + "drop - Drop an item"  + "\n"
					   	  + "menu - Dsiplay menu"  + "\n"
					   	  + "exit - Exit program"  + "\n");
	}
	
	// declare void because it's not returning anything. Use "put" for HashMap
	// starting item numbers at 1
	public static void populateInitialInventory() {
		// put data inside HashMap
		inventory.put(1, "wooden staff");
		inventory.put(2, "wizard hat");
		inventory.put(3, "cloth shoes");
	}
	
	public static void showInventoryItems() {
		for (Map.Entry item : inventory.entrySet()) { // allows you to reference each individual entry in HashMap
			System.out.println(item.getKey() + ": " + item.getValue());
		}
	}
	
	public static String addInventoryItem(String item) {
		int itemNumber = inventory.size() + 1; // key value
		String message = "";
		if (itemNumber > 4) {
			message = "You can't carry anymore items, frop something first.";
		} else {
			inventory.put(itemNumber, item);
			return item + " was added.";
		}
		return message;
	}

	public static String editInventoryItem(int number) {
		String value = inventory.get(number);
		System.out.println("Item selected: " + value);
		String newValue = Console.getString("Updated item name? ");
		inventory.put(number, newValue);
		return "Item number " + number + " was updated.";
	}
	
	public static String deleteInventoryItem(int number) {
		String removedItemValue = inventory.remove(number); 
		return removedItemValue + " was dropped.";
	}
	
}
