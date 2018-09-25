package ui;

import java.util.ArrayList;
import java.util.List;
import business.Product;
import business.ProductDB;
import util.Console;

public class PRSConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console Application (JDBC)!");
		
		ProductDB pdb = new ProductDB();
		
		String command = "";
		
		while (!command.equals("6")) {
			displayMenu();
			command = Console.getString("Enter a command ");
			
			// LIST ALL PRODUCTS
			if (command.equals("1")) {
				List<Product> products = pdb.getAll();
				
				for (Product p : products) {
					System.out.println(p);
				}
				
			// GET A PRODUCT
			} else if (command.equals("2")) {
				int pid = Console.getInt("Enter product ID:  ");
				getProductByID(pdb, pid);
			
			//ADD A PRODUCT
			} else if (command.equals("3")) {
				int vendorid = Console.getInt("Enter vendor ID:  ");
				String partnumber = Console.getString("Enter part number:  ");
				String name = Console.getString("Enter part name:  ");
				double price = Console.getDouble("Enter part price:  ");
				Product products = new Product(vendorid, partnumber, name, price);
				
				if (pdb.add(products)) {
					System.out.println("Product added successfully");
				} else {
					System.out.println("Error adding product.");
				}
			}
		
			// UPDATE A PRODUCT
			else if (command.equals("4")) {
				int productid = Console.getInt("Enter product ID:  ");
				Product products = getProductByID(pdb, productid);
				
				String newname = Console.getString("Enter new part name:  ");
				products.setName(newname);
				
				if (pdb.update(products)) {
					System.out.println("Product updated successfully");
				} else {
					System.out.println("Error updating product.");
				}
			}
			
			// DELETE A PRODUCT
			else if (command.equals("5")) {
				int productid = Console.getInt("Enter product ID:  ");
				Product products = getProductByID(pdb, productid);
				
				if (pdb.delete(products)) {
					System.out.println("Product deleted successfully");
				} else {
					System.out.println("Error deleting product.");
				}
			}
				
 		}
		
		System.out.println("Thank you for using the PRS Console Application (JDBC)!");
	}

	private static Product getProductByID(ProductDB pdb, int pid) {
		Product products = pdb.getProduct(pid);
		
		if (products != null) {
			System.out.println(products);
		} else {
			System.out.println("No product matching ID: " + pid);
		}
		return products;
	}
	
	private static void displayMenu() {
		StringBuilder sb = new StringBuilder("\nCOMMAND MENU:\n");
		sb.append("1 - List all products\n");
		sb.append("2 - Get a product\n");
		sb.append("3 - Add a product\n");
		sb.append("4 - Update a product\n");
		sb.append("5 - Remove a product\n");
		sb.append("6 - Exit\n");
		System.out.println(sb.toString());
	}

}
