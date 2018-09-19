
public class AnimalCounterApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Animal Counter' application!\n");

		// output
		// alligators
		System.out.println("Counting alligators...");
		Alligator a = new Alligator(); //instantiate new variable a
		count(a, 3); //calling count setting maxCount to 3
		
		// sheep - Blackie
		System.out.println("\nCounting sheep...");
		Sheep s1 = new Sheep("Blackie");
		count(s1, 2);
		
		// sheep - Dolly. Clone Dolly!
		Sheep s2 = null; // catch an error if it happens, clone method throws CloneNotSupportedException
		try {
			s2 = (Sheep) s1.clone(); // casting s1.clone()
		} catch (CloneNotSupportedException e) {
			System.out.println("Error");
		}
		System.out.println();
		s2.setName("Dolly");
		count(s2, 3);
		System.out.println();
		count(s1, 1);
		
		System.out.println("\nThank you for using the 'Animal Counter' application!");
	}
	
	public static void count(Countable c, int maxCount) {
		while (maxCount > 0) {
			maxCount -= 1;
			c.incrementCount();
			System.out.println(c.getCountString());	
			}	
		c.resetCount();
	}

}
