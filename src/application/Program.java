package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;



public class Program {

	public static void main(String[] Args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu= new Student();
		
		System.out.println("What's your name");
		stu.name = sc.next();
		sc.nextLine();
		System.out.println("write your grade for the three semesters ");
		stu.nota1 = sc.nextDouble();
		stu.nota2 =sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		System.out.println(stu);
		if (stu.Finalgrade() < 60.0) {
		System.out.println("Failed");
		System.out.printf("Missing %.2f Points %n", stu.calcPoints());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();
	
	}
}
