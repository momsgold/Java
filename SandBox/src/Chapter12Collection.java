import java.util.ArrayList;

public class Chapter12Collection {

	public static void main(String[] args) {
		ArrayList<String> codes = new ArrayList<>();
		codes.add("java");
		codes.add("jsp");
		codes.add("mysql");
		System.out.println(codes);
		System.out.println();
		
		for (String s : codes) {
			System.out.println(s);
		}
	}

}
