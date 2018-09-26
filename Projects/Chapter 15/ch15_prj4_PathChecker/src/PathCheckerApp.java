import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Path Checker' application");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String path = Console.getString("Enter a path:  ");
//			Path dirPath = Paths.get(path);
			File file = new File(path);
			
			System.out.println(file.isDirectory());
		
			
			choice = Console.getString("Would you like to continue?  ", "y", "n");
		}
		
		System.out.println("Thank you for using the 'Path Checker' application");
	}

}
