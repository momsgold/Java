
public class Student implements Comparable {
	// instance variables
	private String firstName;
	private String lastName;
	private int score;
	
	// constructor
	public Student(String firstName, String lastName, int score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// just like in textbook on p. 367
	// sorts by last name
	@Override
	public int compareTo(Object o) {
		Student s = (Student) o; // (cast) o to Student class
		int compareValue = this.lastName.compareToIgnoreCase(s.getLastName()); // if last names are the same it returns a 0
		if (compareValue == 0) {
			compareValue = this.firstName.compareToIgnoreCase(s.getFirstName()); // if 0, then sort by first name
		}
		return compareValue;
	}

	@Override
	public String toString() {
		//return "Student [firstName=" + firstName + ", lastName=" + lastName + ", score=" + score + "]";
		return lastName + ", " + firstName + ": " + score;
	}
	
}
