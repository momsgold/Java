
public class ClawGameApp {
	// define instance variables/attributes
	private int id; // don't initialize yet
	private String name;
	private String type;
	private String color;
	private static int objectCount = 0;
	
	// define constructor for class - always public
	public ClawGameApp(String inputName, String inputType, String inputColor) {
		id = 0;
		name = inputName;
		type = inputType;
		color = inputColor;
		objectCount ++;
	}
	
//	public ClawGameApp(String name, String type, String color) {
//	id = 0;
//	this.name = name; // you need to use this. if you're using the same variable names
//	this.type = type;
//	this.color = color;
// }
	
	// write getId method. You have to use "get" and attribute name! Camel case
	public int getId() {
		return id;
	}
	
	// write setter. Need "set" and attribute name in camel case
	public void setId(int inputId) {
		id = inputId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String inputName) {
		name = inputName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String inputType) {
		type = inputType;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String inputColor) {
		color = inputColor;
	}

	@Override // @ defines an annotation, do not need this statement but whatever
	// you have to add anything you add above to the toString
	public String toString() {
		return "ClawGameApp [id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + ", objectCount=" + objectCount + "]";
	}
	
	
	
}
