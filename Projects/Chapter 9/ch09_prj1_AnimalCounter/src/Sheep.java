
public class Sheep extends Animal implements Cloneable {
	// instance variable
	private String name;
	
	// constructor
	public Sheep(String name) {
		this.name = name;
	}

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void incrementCount() {
		setCount(getCount() + 1);
	}

	@Override
	public void resetCount() {
		setCount(0); //setCount equal to 0
	}
	
	@Override
	public int getCount() {
		return super.getCount(); // return getCount, may need to return super.getCount if it doesn't work
	}

	@Override
	public String getCountString() {
		return getCount() + " " + name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
