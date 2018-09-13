
public class Die {
	// instance variables
	private int value;

	// create a constructor, should be empty
	public Die() {
		roll();
	// value = 0; // set the initial value of Die equal to 0
	}

	// create getter
	public int getValue() {
		return value;
	}

	// create setter, not really needed because we don't set anything
	public void setValue(int value) {
		this.value = value;
	}

	// method to roll the die, could make method private
	public void roll() {
		value = (int) (Math.random() * 6) + 1;
	}
	
}
