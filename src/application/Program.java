package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] Args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Para usar o objeto é preciso instanciar

		Triangle x, y;// Criada na mémoria stack statica

		/*
		 * ele existe na stack e não está os dados do triangulo e sim o endereço de
		 * mémoria do objeto criado no rip < --
		 */
		x = new Triangle();// durante a execução do programa pode fazer uma alocação dinamica de mémoria
		/// Alocação e mémoria dinamica vai ser criado um objeto do tipo tiangle na outa
		/// area de memoria mémoria rip onde fica os objtos dinamico durante a execução
		y = new Triangle();

		System.out.println("Enter the measures of triangule X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangule Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		/// criando um método reaproveitamento de código e delegação de responsabilidade
		double areaX = x.area();
		double areaY = y.area();

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