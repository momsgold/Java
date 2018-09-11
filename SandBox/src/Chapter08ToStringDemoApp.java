
public class Chapter08ToStringDemoApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the 'toString Demonstration Application'!");
		
		Chapter08Toy toy1 = new Chapter08Toy(0, "stuffed animal", 10.00);
		// these next two Sysout's produced nothing valuable... UNLESS you add toSting to 'Toy' class (at end)
		System.out.println("Toy 1: " + toy1);
		System.out.println("Toy 1 toString(): " + toy1.toString());
		
		// this is more helpful output, regardless of whether we use toString in 'Toy' class
		System.out.println("Toy 1 fields: " + toy1.getId() + ", " + toy1.getCode() + ", " + toy1.getPrice());
		
		// initially, we don't have a toString method in ToyBoardGame so it takes the toString from the parent class
		Chapter08BoardGame bg1 = new Chapter08BoardGame(1, "CL", 12.00, "Candy Land", 48);
		System.out.println(bg1);

		Chapter08BoardGame bg2 = new Chapter08BoardGame();// using empty constructor
		bg2.setId(1); // parent
		bg2.setCode("S"); // child
		bg2.setName("Sorry"); // child
		bg2.setPieces(52); //child
		bg2.setPrice(13.00); // parent
		
		System.out.println("Bye, Q!");
	}

}
