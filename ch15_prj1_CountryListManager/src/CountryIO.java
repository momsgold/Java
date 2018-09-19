import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountryIO {
	// copy code on p 481
	// instance variables
	private List<Country> countries = null; // Country is a class
	private Path countriesPath = null;
	private File countriesFile = null;
	private final String FIELD_SEP = "\t";
	
	// empty constructor
	public CountryIO() {
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		countries = this.getAll();
	}
	
	public List<Country> getAll() { // read in whatever is in the file
		// if the countries file has already been read, don't read it again!
		if (countries != null) {
			return countries;
		} else {
			countries = new ArrayList<>();// create empty array list
			if (Files.exists(countriesPath)) { // if countries path exists...
				try (BufferedReader in = new BufferedReader(
										 new FileReader(countriesFile))) {
						String line = in.readLine();
						while (line != null) {
							String[] fields = line.split(FIELD_SEP);
							String idStr = fields[0]; // first field coming back form file
							String code = fields[1];
							String name = fields[2];
							int id = Integer.parseInt(idStr); // string from text field into numeric value
							Country country = new Country(id, code, name); //new instance of country
							countries.add(country); // if not null, add 'country' to array list of countries
							line = in.readLine();
							}
						}
				catch(IOException ioe) {
					System.out.println(ioe);
					return null;
				}
				return countries;
			} else {
				System.out.println(countriesPath.toAbsolutePath() + " doesn't exist!");
				return null;
			}
		}
		
	}
	
	//p. 483
	public boolean saveAll() {
		try (PrintWriter out = new PrintWriter(
							   new BufferedWriter(
							   new FileWriter(countriesFile)))) {
			// write all countries in list to file
			for (Country c : countries) {
				out.print(c.getId() + FIELD_SEP);
				out.print(c.getCode() + FIELD_SEP);
				out.println(c.getName());
			}
			return true; // save worked correctly
		} catch (IOException ioe) {
			System.out.println(ioe);
			return false; // save did not work correctly
		}
	}
	
	public boolean add(Country country) {
//		if (countries == null) {
//			countries = new ArrayList<>();// create empty array list
//		}
		
		countries.add(country);
		return saveAll();
	}
	
}
