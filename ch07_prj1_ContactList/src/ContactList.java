
public class ContactList {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private static int objectCount = 0;
	
	public ContactList(String ifirstName, String ilastName, String iemail, String iphoneNumber) {
		firstName = ifirstName;
		lastName = ilastName;
		email = iemail;
		phoneNumber = iphoneNumber;
		objectCount ++;
	}
	
	// getters and setters
	// firstName
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String ifirstName) {
		firstName = ifirstName;
	}
	
	// lastName
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String ilastName) {
		lastName = ilastName;
	}
	
	// email
		public String getemail() {
			return email;
		}
		
		public void setemail(String iemail) {
			email = iemail;
		}
		
	// phone number
		public String getphoneNumber() {
			return phoneNumber;
		}
		
		public void setphoneNumber(String iphoneNumber) {
			phoneNumber = iphoneNumber;
		}

		@Override
		public String toString() {
			return "\n========================="   + "\n"
					+ "===== Contact List ======"  + "\n"
					+ "First name: " + firstName   + "\n"
					+ "Last name:  " + lastName    + "\n"
					+ "Email: "      + email       + "\n"
					+ "Phone: "		 + phoneNumber + "\n";
					// "ContactList [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					// + ", phoneNumber=" + phoneNumber + "]";
		}
	
	
}
