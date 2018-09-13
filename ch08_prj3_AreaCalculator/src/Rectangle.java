// inherits Square class!!!
public class Rectangle extends Square {
	// instances
	private double height;
	
	// constructor
	public Rectangle(double width, double height) {
		super(width);
		this.height = height;
	}

	// getters and setters
		public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// override getArea
	@Override
	public double getArea() {
		// return super.getArea(); calls getArea from parent class
		return width * height;
	}
	
}
