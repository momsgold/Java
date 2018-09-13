
public class ShowDB {
	
	// this method will get an instance of Show for 
	// the searchCriteria and searchValue entered by the user
	public static Show getShow(String searchCriteria, String searchValue) {
		Show s = null; // initialize variable
		
		if (searchCriteria.equalsIgnoreCase("g")) { // g for genre
			if (searchValue.equalsIgnoreCase("comedy")) {
				s = new Show("Seinfeld", "comedy", 30, "NBC");
			} else if (searchValue.equalsIgnoreCase("drama")) {
				s = new Show("West Wing", "drama", 60, "ABC");
			} else if (searchValue.equalsIgnoreCase("reality")) {
				s = new Show("RuPauls Drag Race", "reality", 90, "VH1");
			} else if (searchValue.equalsIgnoreCase("sci-fi")) {
				s = new Show("Star Trek", "sci-fi", 60, "Hulu");
			}
		} else if (searchCriteria.equalsIgnoreCase("l")) { // l for length
			
		} else if (searchCriteria.equalsIgnoreCase("n")) { // n for network
			
		}
		return s;
	}
}
