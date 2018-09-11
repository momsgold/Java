import java.util.Scanner;

public class ClawGameDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the 'Claw Game' application");
		System.out.println("Create a new stuffed animal...");
		Scanner sc = new Scanner(System.in);
		
		// create variables for attributes
		System.out.println("Enter stuffed animal name: ");
		String name = sc.next();
		
		System.out.println("Enter stuffed animal type: ");
		String type = sc.next();
		
		System.out.println("Enter stuffed animal color: ");
		String color = sc.next();
		
		ClawGameApp teddyBear = new ClawGameApp(name, type, color); // name it you last thing
		
		System.out.println("New stuffed animal: " + teddyBear);
		
		ClawGameApp s2 = new ClawGameApp("Annie", "dog", "blonde");
		sc.close();
		System.out.println("Thank you for using the 'Claw Game' application");
	}

}
