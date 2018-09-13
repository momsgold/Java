
public class Square extends Shape {
	// instance, make width protected so child classes can access it (rectangle)
	protected double width;
	
	// constructor
	public Square(double width) {
		super();
		this.width = width;
	}

	// getter
	public double getWidth() {
		return width;
	}

	// setter
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return width * width;
	}

}
