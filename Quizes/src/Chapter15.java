import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Chapter15 {

	public static void main(String[] args) throws IOException {
		String dirString = "/files/";
		String fileString = "products.txt";
		Path path = Paths.get(dirString + fileString);
		if (Files.notExists(path)) {
			Files.createFile(path);
		}

	}

}
