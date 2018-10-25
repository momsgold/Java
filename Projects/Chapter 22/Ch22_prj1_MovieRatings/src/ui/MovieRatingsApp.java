package ui;

import java.time.LocalDate;
import java.util.List;

import business.Movie;
import business.MovieCollection;
import util.Console;

public class MovieRatingsApp {

	public static void main(String[] args) {
		//initialize stuff
		MovieCollection mc = new MovieCollection(); // calling constructor
		mc.add(new Movie("Avengers Infinity War", 2018, 4.0));
		mc.add(new Movie("Star Wars Episode 5 - Empire Strikes Back", 1980, 5.0));
		mc.add(new Movie("Sixteen Candles", 1984, 4.5));
		mc.add(new Movie("Happy Gilmore", 1996, 4.3));
		mc.add(new Movie("The Jerk", 1979, 3.9));
		mc.add(new Movie("Superbad", 2007, 3.9));
		mc.add(new Movie("Back to the Future Part III", 1990, 2.1));
		mc.add(new Movie("Entourage", 2015, 1.5));
		
		System.out.println("Welcome to the Movie Ratings application!\n");
		
		int choice = 0;
		while (choice != 6) {
			
		displayMenu();
		System.out.println();
		choice = Console.getInt("Choose a menu option:  ", 1, 6);
		List<Movie> filteredMovies; // define up here so we can use it multiple times inside switch statement
		
			switch (choice) {
			case 1: //enter a movie
				int nbr = Console.getInt("How many movies do you want to enter>  ", 1, 10);
				for (int i = 1; i <= nbr; i++) {
					Console.println("Movie numnber " + i);
					Console.println("---------------");
					String ttle = Console.getString("Enter title:  ");
					int yr = Console.getInt("Enter year:  ", 1900, LocalDate.now().getYear());
					double rate = Console.getDouble("Enter rating:  ", 1.0, 5.0);
					Movie m = new Movie(ttle, yr, rate);
					mc.add(m);
				}
				break;
			case 2: //view top rated movies
				filteredMovies = mc.filterMovies(m -> m.getRating() >= 4.0);
				Console.println("Movies rated 4.0 or higher:");
				Console.println("---------------------------");
				filteredMovies.stream().forEach(System.out::println); // print movies (toString) to console
				break;
			case 3: // view most recent movies
				filteredMovies = mc.filterMovies(m -> m.getYear() >= (LocalDate.now().getYear() - 10));
				Console.println("Movies released in the last 10 years:");
				Console.println("-------------------------------------");
				filteredMovies.stream().forEach(System.out::println);
				break;
			case 4: // view all movies
				Console.println("View all movies:");
				Console.println("----------------");
				mc.getMovies().stream().forEach(System.out::println);
				break;
			case 5: // view ratings
				Console.println("View ratings:");
				Console.println("-------------");
				Console.println("Number of movies: " + mc.getSize());
				Console.println("Lowest rating: " + mc.getLowestRating());
				Console.println("Highest rating: " + mc.getHighestRating());
				Console.println("Average rating: " + mc.getAverageRating());
				break;
			case 6: // QUIT
				Console.println("Bye Q!");
				break;
			}
		}

	}

	public static void displayMenu() {
        Console.println("-----------------------");
        Console.println("What do you want to do?");
        Console.println("-----------------------");
        Console.println("1 - Enter a movie");
        Console.println("2 - View top rated movies");
        Console.println("3 - View most recent movies");
        Console.println("4 - View all movies");
        Console.println("5 - View ratings");
        Console.println("6 - Quit application");
        
        Console.println();
	}
	
}