package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	
		
	
	
public double   totalValueInStrock( ){
	
	return price * quantity;

}

public void addProduct(int quantity) {
    // acessar o atributo da classe, não o do parâmetro
    // quantity = pega o que já tem nele + quantity (argumento)
    this.quantity += quantity; 
}

public void removeProducts(int quantity) {
	this.quantity -= quantity;
}

public String toString() {
	
	return name
		+ ", $"
		+String.format("%.2F", price)
		+", "
		+ quantity
		+" units, Total: $ "
		+ String.format("%.2f",totalValueInStrock());
}

}
