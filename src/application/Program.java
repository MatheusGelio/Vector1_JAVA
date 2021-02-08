package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;
import model.exceptions.ProductException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the product quantity: ");
			int N = sc.nextInt();
			Product[] vector = new Product[N];
			
			for (int i=0; i<vector.length; i++) {
				System.out.println();
				System.out.print("Enter the product name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				System.out.print("Enter the product price: ");
				double productPrice = sc.nextDouble();
				vector[i] = new Product(productName, productPrice);
				vector[i].ProductExceptions();
			}
			
			double totalPrice = 0;
			
			System.out.println();
			System.out.println("Products:");
			for (int i=0; i<vector.length; i++) {
				totalPrice += vector[i].getProductPrice();
				System.out.print(vector[i]);
			}
			
			System.out.println();
			System.out.printf("Total: $%.2f%n", totalPrice);
		}
		catch (InputMismatchException error) {
			System.out.println("Error! Enter a number or a integer number.");
		}
		catch (NegativeArraySizeException error) {
			System.out.println("Error! Enter a positive number.");
		}
		catch (ProductException error) {
			System.out.println(error.getMessage());
		}
		
		sc.close();
	}
}
