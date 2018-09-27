package ui;

import java.util.List;

import business.Textbooks;
import business.TextbooksDB;
import util.Console;

public class TextbooksApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Chemical Engineering Textbooks' application!!");

		TextbooksDB tdb = new TextbooksDB();
		
		String command = "";
		
		while (!command.equals("6")) {
			displayMenu();
			command = Console.getString("Enter a command ");
			System.out.println();
			
			// LIST ALL PRODUCTS
			if (command.equals("1")) {
				List<Textbooks> textbooks = tdb.getAll();
				
				System.out.println("ID" + "\t" + "TEXTBOOK" + "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "    " + "AUTHOR");
				for (Textbooks t : textbooks) {
					System.out.println(t);
				}
				
			// GET A PRODUCT
			} else if (command.equals("2")) {
				int tid = Console.getInt("Enter textbook ID:  ");
				getTextbookByID(tdb, tid);
			
			//ADD A PRODUCT
			} else if (command.equals("3")) {
				String title = Console.getString("Enter title:  ");
				String author = Console.getString("Enter author:  ");
				Textbooks textbooks = new Textbooks(title, author);
				
				if (tdb.add(textbooks)) {
					System.out.println("Textbook added successfully");
				} else {
					System.out.println("Error adding textbook.");
				}
			}
		
			// UPDATE A PRODUCT
			else if (command.equals("4")) {			
				int textbookid = Console.getInt("Enter textbook ID:  ");
				Textbooks textbooks = getTextbookByID(tdb, textbookid);	
				
				List<Integer> ids = tdb.getIdNumbers();
				String newtitle = "";
				String newauthor = "";
				if (ids.contains(textbookid)) {
				newtitle = Console.getString("Enter new title:  ");
				newauthor = Console.getString("Enter new author:  ");
				
				} else {
					textbookid =Console.getInt("Enter a valid textbook ID:  ");
					textbooks = getTextbookByID(tdb, textbookid);
					newtitle = Console.getString("Enter a new title:  ");
					
					newauthor = Console.getString("Enter new author:  ");
				}
				
				textbooks.setTitle(newtitle);
				textbooks.setAuthor(newauthor);
				
				if (tdb.update(textbooks)) {
					System.out.println("Textbook updated successfully");
				} else {
					System.out.println("Error updating textbook.");
				}
			}
			
			// DELETE A PRODUCT
			else if (command.equals("5")) {
				List<Integer> ids = tdb.getIdNumbers();
				
				int textbookid = Console.getInt("Enter textbook ID:  ");
				Textbooks textbooks = getTextbookByID(tdb, textbookid);
				
				if (ids.contains(textbookid)) {
					if (tdb.delete(textbooks)) {
						System.out.println("Textbook deleted successfully");
					} else {
						System.out.println("Error deleting textbook.");
					}
				} else {
					System.out.println("Enter a valid ID!");
					textbookid = Console.getInt("Enter textbook ID:  ");
					textbooks = getTextbookByID(tdb, textbookid);
				}
				
			}
				
 		}
		
		System.out.println("\nThank you for using the 'Chemical Engineering Textbooks' application!");
	}
	
	private static void displayMenu() {
		StringBuilder sb = new StringBuilder("\n_____COMMAND MENU_____\n");
		sb.append("1 - List all textbooks\n");
		sb.append("2 - Get a textbook\n");
		sb.append("3 - Add a textbook\n");
		sb.append("4 - Update a textbook\n");
		sb.append("5 - Remove a textbook\n");
		sb.append("6 - Exit the application\n");
		System.out.println(sb.toString());
	}
	
	private static Textbooks getTextbookByID(TextbooksDB tdb, int tid) {
		Textbooks textbooks = tdb.getTextbooks(tid);
		
		if (textbooks != null) {
			System.out.println(textbooks);
		} else {
			System.out.println("No textbook matching ID: " + tid);
		}
		return textbooks;
	}

}
