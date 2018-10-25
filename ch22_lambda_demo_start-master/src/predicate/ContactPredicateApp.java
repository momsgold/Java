package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import business.Contact;

public class ContactPredicateApp {

	public static void main(String[] args) {
			System.out.println("Welcome to the ContactLambdaApp (Lambda version)!\n");
			
			// Create a list of contacts
			ArrayList<Contact> contacts = new ArrayList<>();
			contacts.add(new Contact("John Doe", "john.doe@foo.com", "513-222-3333"));
			contacts.add(new Contact("Bill Smith", "bill.smith@foo.com", null));
			contacts.add(new Contact("Harvey Boogenheimer", "harvey.boogenheimer@foo.com", "513-555-6666"));
			contacts.add(new Contact("Bob Marley", null, null));
			contacts.add(new Contact("Wonder Woman", "ggadot@ww.com", null));
			
			
			System.out.println("Contacts without email address:");
			List<Contact> noEmailContacts = filterContacts(contacts, cn -> cn.getEmail() == null);
			for (Contact c: noEmailContacts) {
				System.out.println(c);
			}
			System.out.println();
			
			
			System.out.println("Contacts without phoneNumbers:");
			List<Contact> noPhoneContacts = filterContacts(contacts, cn -> cn.getPhone() == null);
			for (Contact c: noPhoneContacts) {
				System.out.println(c);
			}
			
			System.out.println();
			// filter out any of the contacts that have a null phone number
			contacts.stream().filter(cn -> cn.getPhone() == null).forEach(cn -> System.out.println(cn.getName()));
			
			System.out.println("\nBye Q!");

	}
	
	
	// accepts Contact list and a lambda expression
	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {// change TestContact interface to Java's Predicate interface (built in)
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

}
