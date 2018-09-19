package business;

public class purchaserequest {
	private int ID;
	private int userID;
	private String description;
	private String justification;
	private String dateNeeded;
	private String deliveryMode;
	private String status;
	private double total;
	private String submittedDate;
	private String reasonForRejection;
	private boolean isActive;
	private String dateCreated;
	private String dateupdated;
	private boolean updatedByUser;
	
	public purchaserequest(int iD, int userID, String description, String justification, String dateNeeded,
			String deliveryMode, String status, double total, String submittedDate, String reasonForRejection,
			boolean isActive, String dateCreated, String dateupdated, boolean updatedByUser) {
		super();
		ID = iD;
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
		this.isActive = isActive;
		this.dateCreated = dateCreated;
		this.dateupdated = dateupdated;
		this.updatedByUser = updatedByUser;
	}

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(String dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
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

	public String getDateupdated() {
		return dateupdated;
	}

	public void setDateupdated(String dateupdated) {
		this.dateupdated = dateupdated;
	}

	public boolean isUpdatedByUser() {
		return updatedByUser;
	}

	public void setUpdatedByUser(boolean updatedByUser) {
		this.updatedByUser = updatedByUser;
	}

}
