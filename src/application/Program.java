package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] Args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	

		double xA, xB, xC, yA, yB, yC;
		System.out.println("Enter the measures of triangule X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangule Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triagle x area: %.4f%n", areaX);
		System.out.printf("Triagle y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Large area: X");
		} else {

			System.out.println("Large area: Y");
		}

		sc.close();
	}
}