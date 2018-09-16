
public class Alligator extends Animal {
	
	// empty constructor
	public Alligator () {
		
	}
	
	// add 1 to count. call setCount pass getCount and add 1, pass into setCount
	@ Override
	public void incrementCount() {
		setCount(getCount() + 1); // count = count + 1
	}
	
	@Override
	public void resetCount() {
		setCount(0); //setCount equal to 0
	}
	
	@Override
	public int getCount() { // call super.getCount from parent class getCount
		return super.getCount(); // return getCount, may need to return super.getCount if it doesn't work
	}
	
	@Override
	public String getCountString() {
		return getCount() + " alligator";
	}
	
	
}
