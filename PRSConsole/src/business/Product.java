package business;
	
public class Product {
	private int ID;
	private int vedorID;
	private String partNumber;
	private String name;
	private double price;
	private String unit;
	private String photoPath;
	private boolean isActive;
	private String dateCreated;
	private String dateUpdated;
	private boolean updatedByUser;
	
	public Product(int iD, int vedorID, String partNumber, String name, double price, String unit, String photoPath,
			boolean isActive, String dateCreated, String dateUpdated, boolean updatedByUser) {
		super();
		ID = iD;
		this.vedorID = vedorID;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
		this.isActive = isActive;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.updatedByUser = updatedByUser;
	}

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getVedorID() {
		return vedorID;
	}

	public void setVedorID(int vedorID) {
		this.vedorID = vedorID;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public boolean isUpdatedByUser() {
		return updatedByUser;
	}

	public void setUpdatedByUser(boolean updatedByUser) {
		this.updatedByUser = updatedByUser;
	}
	
}
