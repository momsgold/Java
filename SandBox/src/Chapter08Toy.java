
public class Chapter08Toy {
	private int id;
	private String code;
	private double price;
	
	public Chapter08Toy(int id, String code, double price) {
		this.id = id;
		this.code = code;
		this.price = price;
	}
	
	public Chapter08Toy() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Toy [id: " + id + ", code: " + code + ", price: " + price + "]";
	}
	
}
