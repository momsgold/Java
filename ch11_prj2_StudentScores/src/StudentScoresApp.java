import java.util.Arrays;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Student Scores' application!");

		// get user input
		int n = Console.getInt("Number of students:  ", 1, Integer.MAX_VALUE);
		
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("STUDENT " + (i + 1));
			String lName = Console.getString("Last name: ");
			String fName = Console.getString("First name: ");
			int s = Console.getInt("Score: ", 0, 100);
			Student student = new Student(fName, lName, s);
			students[i] = student; // put it in the array
		}
		
		// business logic - sort
		// calls the compareTo method
		Arrays.sort(students); // sort students array
		
		// output
		System.out.println("SUMMARY");
		for (Student s : students) {
			System.out.println(s); // call the Student toString
		}
		
		System.out.println("Thank you for using the 'Student Scores' application!");
	}

}
