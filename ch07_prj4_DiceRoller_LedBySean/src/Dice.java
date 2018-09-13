
public class Dice {
	// create instances
	private Die die1;
	private Die die2;
	
	/*
	 * create two instances of Die()
	 * the constructor of Die will generate a random value (rolling of the die)
	 * this is different than stated in the project requirements
	 * 
	 */
	
	// create constructor, instantiate die1 and die2
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}

	// create getters and setters
	public Die getDie1() {
		return die1;
	}

	public void setDie1(Die die1) {
		this.die1 = die1;
	}

	public Die getDie2() {
		return die2;
	}

	public void setDie2(Die die2) {
		this.die2 = die2;
	}
	
	public int getSum() {
		return die1.getValue() + die2.getValue(); // getValue is from Die class
	}

	// this is in place of the printRoll method in the project specifications
	@Override
	public String toString() {
		return "Die 1: " + die1.getValue() + "\n" 
			 + "Die 2: " + die2.getValue() + "\n" 
			 + "Total: " + getSum() + "\n"
			 + displaySpecialMessage();
	}
	
	private String displaySpecialMessage() {
		String s = "";
		
		if (getSum() == 7) {
				s = "Craps";
			} else if (getSum() == 2) {
				s = "Snake eyes";
			} else if (getSum() == 12) {
				s = "Box cars";
			}
		s += "\n";
		return s;
	}
	
}
