package tv.ui;

import java.util.ArrayList;
import java.util.List;

import tv.business.Show;
import tv.business.ShowDB;
import tv.util.Console;

public class TVShowApp {

	public static void main(String[] args) {
		System.out.println("Let's watch some television!");
	
		ShowDB showDB = new ShowDB(); // create an instance of the show database
		
		String command = "";
		while (!command.equalsIgnoreCase("3")) {
			displayMenu();
			command = Console.getString("Enter a command:  ");
			if (command.equals("1")) {
				List<Show> shows = showDB.getAll();
				for (Show s : shows) {
					System.out.println(s);
				}
			} else if (command.equals("2")) {
				// search by genre or length
				String searchCriteria = Console.getString("Search by genre (g) or length (l):  ", "g", "l");
				
				List<Show> shows = new ArrayList<>();
				if (searchCriteria.equalsIgnoreCase("g")) {
					// search by genre
					String genre = Console.getString("Select a genre - comedy, sci-fi, action, or drama:  ");
					shows = showDB.get(genre); // get database
				} else if (searchCriteria.equalsIgnoreCase("l")) {
					// search by length
					int length = Console.getInt("Enter a show length (30, 60, 90):  ");
					shows = showDB.get(length);
				}
				System.out.println("Result of search:");
				for (Show s : shows) {
					System.out.println(s);
				}
			} else if (command.equalsIgnoreCase("3")) {
				System.out.println("Add name, rating, length, genre, network:  ");
				String addName = Console.getString("Add a show namne: ");
				String addRating = Console.getString("Add a show rating:  ");
				int addLength = Console.getInt("Add a show length:  ");
				String addGenre = Console.getString("Add a show genre:  ");
				String addNetwork = Console.getString("Add a show network: ");
				Show tv = new Show(addName, addRating, addLength, addGenre, addNetwork);
				showDB.add(tv);
				
			} else if (!command.equals("4")) {
				System.out.println("Invalid command. Try again.");
			}
		}
		

		System.out.println("\nThat's enough TV for you.");
	}
	
	private static void displayMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n___COMMAND MENU___\n");
		sb.append("1 - List TV shows\n");
		sb.append("2 - List TV shows by genre or length\n");
		sb.append("3 - Add a TV show\n");
		sb.append("4 - Exit");
		System.out.println(sb);
	}

}
