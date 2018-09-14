
public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Area Calculator' application!");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String shapeType = Console.getString("Calculate the area of a circle, square, or rectangle (c/s/r):  ");
			
			
			double h = 0.0;
			double w = 0.0;
			double r = 0.0;
			
			Shape s = null; // must initialize s shape so s.getArea() works
			switch (shapeType) {
			case "c": 
				r = Console.getDouble("Enter radius:  ");
				s = new Circle(r);
				break;
			case "s":
				w = Console.getDouble("Enter width:  ");
				s = new Square(w);
				break;
			case "r":
				w = Console.getDouble("Enter width:  ");
				h = Console.getDouble("Enter height:  ");
				s = new Rectangle(w, h);
				break;
			}
			
			Class c = s.getClass();
			System.out.println("The area of the " + c.getName() + " is: " + s.getArea());
			
			choice = Console.getString("Would you like to continue?  ");
		}
		
		System.out.println("Thank you for using the 'Area Calculator' application!");
	}

}
