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



}
