package entities;

public class Student{ 
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double Finalgrade() {
		double soma;
		return soma = nota1 + nota2 + nota3; 
		
		
	}

	public  double  calcPoints() {

		if(this.Finalgrade() < 60.0){
			return 60.0 - Finalgrade(); 
		}else {
			return 0.0;
		}
		
	}
	
	public String toString() {
		
		return name+" and Your final grade is: "+String.format("%.2f,",Finalgrade());
		
		
	}
	
	
	
	
	
}
