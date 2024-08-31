package util;

public class Product {
	private double price;
	private String name;
	private  int quantity;

	
	public Product(){
		
	}
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0;

	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice() {
	
	this.price = price;

	}
	
	public int getQuantity() {
		
		return quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
