import java.util.ArrayList;

public class Chapter12ArrayListDemoApp {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); // need to import ArrayList every time
		
		// add to array "numbers"
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		// removes number "3"
//		System.out.println("remove '2'");
//		numbers.remove(2);
		
		// removes number "2"
		numbers.remove(new Integer(2));
		
		System.out.println(numbers);
	}

}
