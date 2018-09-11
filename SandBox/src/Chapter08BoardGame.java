
public class Chapter08BoardGame extends Chapter08Toy {
	private String name;
	private int pieces;
	
	// CONSTRUCTOR
	public Chapter08BoardGame(int id, String code, double price, String name, int pieces) {
		super(id, code, price); // superclass
		this.name = name;
		this.pieces = pieces;
	}
	
	public Chapter08BoardGame() {
		
	}

	public Chapter08BoardGame(int id, String code, double price) {
		super(id, code, price);
	}

	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	@Override
	public String toString() {
		// add super.toString() + to row to get toString from parent class
		return super.toString() + " ToyBoardGame [name: " + name + ", pieces: " + pieces + "]";
	}
	
}
