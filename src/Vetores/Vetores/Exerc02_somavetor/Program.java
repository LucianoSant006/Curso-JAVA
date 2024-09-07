package Vetores.Exerc02_somavetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] Args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();
		double g = 0.0;
		double[] vect = new double[N];

		for (int i = 0; i < vect.length; i++) {

			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			g += vect[i];

		}

		double sum = 0.0;
		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {

			sum += vect[i];
			soma += vect[i];

		}
		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {


			System.out.printf("%.2f ",vect[i]);

		}

		double avg = soma/ N;

		System.out.println();
		System.out.printf("Soma =  %.2f %n" , soma);
		System.out.printf("Média =  %.2f %n" , avg);


		sc.close();
	}
}