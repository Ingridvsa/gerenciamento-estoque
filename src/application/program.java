package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {
	public static void main(String[] args) {
		
		//importações para o funcionamento do projeto
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of product to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
