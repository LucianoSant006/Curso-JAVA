package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] Args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		
		double percentege;
		
		System.out.println("Wrote your name");
		employee.Name = sc.next();
		System.out.println("GrossSalary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.println("Which percentage to increase salry?: ");
		percentege = sc.nextDouble();
		employee.increaseSalary(percentege);
		System.out.println("Update data : " + employee);
	}
}
