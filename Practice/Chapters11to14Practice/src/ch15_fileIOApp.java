import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ch15_fileIOApp {

	public static void main(String[] args) throws IOException {
		// get Path object for the file
		Path textbooksPath = Paths.get("textbooks.txt");
		File textbooksFile = textbooksPath.toFile();
		
		// write data to file
		// open an output stream
		PrintWriter getOut = new PrintWriter(
						     new BufferedWriter(
						     new FileWriter(textbooksFile)));
		
		// write data to the stream
		getOut.println("1\tEssentials of Chemical Reaction Engineering\t130.00");
		getOut.println("2\tIntroductory Chemical Engineering Thermodynamics\t140.00");
		getOut.println("3\tSeparation Process Principles\t137.00");
		
		// close the output stream and free system resources
		getOut.close();
	}

}
