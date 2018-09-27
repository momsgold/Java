import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Path Checker' application\n");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String path = Console.getString("\nEnter a path:  ");
			File file = new File(path);
			
			if (file.exists()) {
				if (file.isFile()) {
					System.out.println("\nThe path points to a file");
				} else if (file.isDirectory()) {
					System.out.println("\nThe path points to a directory");
				}
			} else {
				System.out.println("\nThis file is clearly not a thing...");
			}
		
			choice = Console.getString("\nWould you like to continue?  ", "y", "n");
		}
		
		System.out.println("\nThank you for using the 'Path Checker' application");
	}

}
