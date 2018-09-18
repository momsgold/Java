import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Chapter15FileDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("hi");
		String dirString = "c:/test/test2/test3/test4";
		String dirString2 = "files/products.txt";
		Path dirPath = Paths.get(dirString);
		Path dirPath2 = Paths.get(dirString2);
		if (Files.notExists(dirPath)) {
			System.out.println(dirPath+" created");
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("dir already exists");
		}
		if (Files.notExists(dirPath2)) {
			System.out.println(dirPath2+" created");
			Files.createFile(dirPath2);
		}
		else {
			System.out.println("dir2 already exists");
		}
		System.out.println("Bye");
	}

}




//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class Chapter15FileDemo {
//
//	public static void main(String[] args) throws IOException {
//		System.out.println("Hello, there.");
//		// creates a new folder in "Test" named "Test2"
//		String dirString = "c:/Test/Test2"; // absolute path
//		String dirString2 = "files/products.txt";
//		Path dirPath = Paths.get(dirString); // import Path
//		Path dirPath2 = Paths.get(dirString2);
//		if (Files.notExists(dirPath)) { // if the path does not exist, then create directories
//			System.out.println(dirPath + " was created");
//			Files.createDirectories(dirPath); /// error! add a try/catch block to fix, let IE do it
//		} else {
//			System.out.println("directory already exists");
//		}
//		
//		if (Files.notExists(dirPath2)) {
//			System.out.println(dirPath2 + " created");
//			Files.createFile(dirPath2);
//		}
//
//	System.out.println("Bye, Q!");
//	}
//
//}
