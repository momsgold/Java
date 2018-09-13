
public class Chapter11ArrayDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		
		double[] prices = {10.50, 5.55, 50.99, 100.00};
		double sum = 0;
//		for (int i = 0; i < prices.length; i++) {
//			System.out.println(prices[i]);
//			sum += prices[i];
//			System.out.println("Subtotal = " + sum);
//		}
		for (double price : prices) {
			System.out.println(price);
			sum += price;
			System.out.println("Subtotal = " + sum);
		}

		System.out.println("Bye, Q!");
	}

}
