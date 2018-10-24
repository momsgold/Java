package StreamsDemo;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemoApp {

	public static void main(String[] args) {
		
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(98);
		grades.add(92);
		grades.add(94);
		grades.add(95);
		grades.add(88);
		grades.add(100);
		
		System.out.println("Grades via old school 'for' loop");
		for (int i = 0; i < grades.size(); i++) {
			System.out.println(grades.get(i));
		}

		System.out.println("\nGrades via enhanced 'for' loop");
		for (int grade : grades) { // for every element inside grades, treat it as an int type grade
			System.out.println(grade);
		}

		System.out.println("\nGrades via stream, double colon operator");
		grades.stream().forEach(System.out::println); // :: call a method for each element inside stream, print that element
		
		// create instances of Person
		Person p1 = new Person(1,"Sam","111 Test Way"); // id, name, address
		Person p2 = new Person(2,"Sally","222 Main St.");
		Person p3 = new Person(3,"Adam","333 Broadway");
		
		ArrayList<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		System.out.println("\nPeople via stream, print just the names");
		
		
	}

}