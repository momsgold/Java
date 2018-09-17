
public class Chapter13_StringDemoApp {

	public static void main(String[] args) {
		String code = "java";
//		System.out.println("size is " + code.length());
		System.out.println("length of '" + code + "' is " + code.length());
		System.out.println();
		
		String name = "Mr. Anthony Green";
		int n1 = name.indexOf(" "); // find the index of a space that occurs in name
		int n2 = name.indexOf(" ", n1 + 1);
		System.out.println("spaces occur at indicies " + n1 + " and " + n2);
		System.out.println();
		
		int n3 = name.indexOf("Anthony");
		System.out.println("Anthony starts at an index of " + n3);
		System.out.println();
		
		// trim saces after "Racahel Baumann" and before "!"
		String n4 = "Rachael Baumann";
		System.out.println(n4.trim() + "!"); // trim gets rid of whitespace between RB and !
		System.out.println();
		
		// get last name
		String n5 = "Jon Hamm";
		String n5LastName = n5.substring(4); // returns whatever is at index 4 and beyond
		System.out.println(n5LastName);
		System.out.println();
		
		// get middle name
		String n6 = "Martin Van Buren";
		int i1 = n6.indexOf(" ");
		int i2 = n6.indexOf(" ", i1 + 1);
		String middleName = n6.substring(i1 + 1, i2); // get middle name. starts at i1 + 1 and ends at i2
		System.out.println(middleName + ".");
		System.out.println();
		
		// replace spaces with a character
		String n7 = "Hello there ladies and gentlemen";
		String n8 = n7.replace(' ', '-'); // replace space with -
		System.out.println(n8);
		System.out.println();
		
		// get length of the array (# of words)
		String[] n8Array = n8.split("-");
		System.out.println("# of words = " + n8Array.length); // display length of the array (number of words in n8)
		System.out.println();
		
		
	} 

}
