package entities;

public class Employee {

	public String Name;
	public double GrossSalary;
	public double Tax;



	public double NetSalary() {

		return this.GrossSalary - Tax;

	}


	public  void  increaseSalary( double percentage)
	{

		 GrossSalary += GrossSalary * percentage / 100.0;

	}

	public String toString() {


			return Name + ", $ " + String.format("%.2f", NetSalary());
	}

}
