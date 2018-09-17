
public class Chapter13 {

	public static void main(String[] args) {
		// question 6
		String s1 = "Kristine";
		s1 += " Thomas";
		String s2 = s1;
		if (s1.equals(s2)) {
			System.out.println("same");
		} 
		if (s1 == s2) {
			System.out.println("equal");
		}
		
		System.out.println();
		
		// question 7
		String s3 = "805 Martin Street";
		String s4 = "805 Martin Street";
		if (s3.equals(s4)) {
			System.out.println("same");
		}
		if (s3 == s4) {
			System.out.println("equal");
		}

		System.out.println();
		
		// question 9
		String s5 = "188-45-9271";
		String s6 = "";
		for (int i = 0; i < s5.length(); i++) {
			if (s5.charAt(i) != '-') {
				s6 += s5.charAt(i);
			}
		}
		s6 = s6.replace('-', '.');
		System.out.println(s6);
	}

}
