package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_Prod {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price= sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		//Não precisa do toString o java decta
		System.out.println(product.toString());
		
		sc.close();
	}

}
