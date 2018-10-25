package business;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieCollection {
	private List<Movie> movies;

	public MovieCollection() {
		movies = new ArrayList<>();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
	
	public void add(Movie m) {
		movies.add(m);
	}
	
	public List<Movie> filterMovies (Predicate<Movie> condition) {
//		List<Movie> filteredMovies = new ArrayList<>();
//		for (Movie m: movies) {
//			if (condition.test(m)) {
//				filteredMovies.add(m);
//			}
//		}
//		return filteredMovies;
		return movies.stream().filter(condition).collect(Collectors.toList());
	}
	
	public double getLowestRating() {
//		double lowestRating = 5.0; // initialize to 5 since it is the highest, otherwise it would always return 0.0
//		for (Movie m: movies) {
//			lowestRating = Math.min(lowestRating, m.getRating());// lowestRating in there is the current lowest rating value that's being compares to the other rating
//		}
		double lowestRating = movies.stream().map(r -> r.getRating()).reduce(5.0, (a, b) -> Math.min(a, b)); // for every instance of Movie pull out a rating
		return lowestRating;
	}
	
	public double getHighestRating() {
		double highestRating = movies.stream().map(r -> r.getRating()).reduce(1.0, (a, b) -> Math.max(a, b)); // for every instance of Movie pull out a rating
		return highestRating;
	}
	
	public String getAverageRating() {
		double sum = movies.stream().map(r -> r.getRating()).reduce(0.0, (a, b) -> (a + b)); 
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		return number.format(sum / movies.size());
	}
	
	public int getSize() {
		return movies.size();
	}
	
}
