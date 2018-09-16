
public abstract class Animal implements Countable {
	// instance variable
	private int count;
	
	// don't needs a constructor because an abstract class won't be instantiated 
	
	// getter
	public int getCount() {
		return count;
	}
	
	// setter
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "(Animal) count: " + count;
	}

}
