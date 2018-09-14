
public class ShowDB {
	
	// this method will get an instance of Show for 
	// the searchCriteria and searchValue entered by the user
	// make Show an array of Show
	public static Show[] getShow(String searchCriteria, String searchValue) {
		        // class / method
		Show[] shows = null; // initialize variable, make an array
		
		if (searchCriteria.equalsIgnoreCase("g")) { // g for genre
			if (searchValue.equalsIgnoreCase("comedy")) {
				Show s = new Show("Seinfeld", "comedy", 30, "NBC");
				shows = new Show[1]; // array of length 1
				shows[0] = s;  // returning 1 element				
			} else if (searchValue.equalsIgnoreCase("drama")) {
				Show s = new Show("West Wing", "drama", 60, "ABC");
				shows = new Show[1];
				shows[0] = s;		
			} else if (searchValue.equalsIgnoreCase("reality")) {
				Show s = new Show("RuPauls Drag Race", "reality", 90, "VH1");
				shows = new Show[1];
				shows[0] = s;		
			} else if (searchValue.equalsIgnoreCase("sci-fi")) {
				Show s = new Show("Star Trek", "sci-fi", 60, "Hulu");
				shows = new Show[1];
				shows[0] = s;		
			}
			
		} else if (searchCriteria.equalsIgnoreCase("l")) { // l for length
			if (searchValue.equalsIgnoreCase("30")) {
				Show s = new Show("Seinfeld", "comedy", 30, "NBC");
				shows = new Show[1];
				shows[0] = s;				
			} else if (searchValue.equalsIgnoreCase("60")) {
				shows = new Show[2]; // length of 2 because there are two shows of length 60
				Show s1 = new Show("West Wing", "drama", 60, "ABC");
				Show s2 = new Show("Star Trek", "sci-fi", 60, "Hulu");
				shows[0] = s1;
				shows[1] = s2;
			} else if (searchCriteria.equalsIgnoreCase("90")) {
				Show s = new Show("RuPauls Drag Race", "reality", 90, "VH1");
				shows = new Show[1];
				shows[0] = s;		
			}
			
		} else if (searchCriteria.equalsIgnoreCase("n")) { // n for network
			if (searchValue.equalsIgnoreCase("NBC")) {
				Show s = new Show("Seinfeld", "comedy", 30, "NBC");
				shows = new Show[1]; // array of length 1
				shows[0] = s;  // returning 1 element				
			} else if (searchValue.equalsIgnoreCase("ABC")) {
				Show s = new Show("West Wing", "drama", 60, "ABC");
				shows = new Show[1];
				shows[0] = s;		
			} else if (searchValue.equalsIgnoreCase("VH1")) {
				Show s = new Show("RuPauls Drag Race", "reality", 90, "VH1");
				shows = new Show[1];
				shows[0] = s;		
			} else if (searchValue.equalsIgnoreCase("Hulu")) {
				Show s = new Show("Star Trek", "sci-fi", 60, "Hulu");
				shows = new Show[1];
				shows[0] = s;		
			}
		}
		return shows;
	
	}
}
