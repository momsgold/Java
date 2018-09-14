
public class ShowSelectorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Show Selector' application!\n");

		// prompt user for input
		String sCriteria = Console.getString("Search by genre (g)/length (l)/network (n):  ");
		String sValue = ""; // initialize variable
		if (sCriteria.equalsIgnoreCase("g")) {
			sValue = Console.getString("Comedy, Reality, Sci-Fi, or Drama?  ");
		} else if (sCriteria.equalsIgnoreCase("l")) {
			sValue = Console.getString("30, 60, or 90 minutes?  ");
		} else if (sCriteria.equalsIgnoreCase("n")) {
			sValue = Console.getString("Hulu, ABC, NBS, or VH1?  ");
		}
		
		// get array of shows
		Show[] shows = ShowDB.getShow(sCriteria, sValue);
		
		// enhanced for loop, for array of shows, iterate through that and sysout with every element in the array
		for (Show s : shows) {
			System.out.println(s); // calls the toString method
		}
		
		System.out.println("\nThank you for using the Show Selector' application!");
	}

}
