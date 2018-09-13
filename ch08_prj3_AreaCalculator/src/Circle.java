
public class Circle extends Shape {

	// instance
	private double radius;
	
	// constructor
	public Circle(double radius) {
		super(); // you need super() here
		this.radius = radius;
	}

	// getter
	public double getRadius() {
		return radius;
	}

	// setter
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
