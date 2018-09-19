package business;

public class purchaserequestlineitem {
	private int ID;
	private int purchaseRequestID;
	private int productID;
	private int quantity;
	private boolean isActive;
	private String dateCreated;
	private String dateUpdated;
	private boolean updatedByUser;
	
	public purchaserequestlineitem(int iD, int purchaseRequestID, int productID, int quantity, boolean isActive,
			String dateCreated, String dateUpdated, boolean updatedByUser) {
		super();
		ID = iD;
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
		this.quantity = quantity;
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

	public int getPurchaseRequestID() {
		return purchaseRequestID;
	}

	public void setPurchaseRequestID(int purchaseRequestID) {
		this.purchaseRequestID = purchaseRequestID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
