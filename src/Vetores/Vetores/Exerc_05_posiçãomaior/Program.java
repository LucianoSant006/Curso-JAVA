package Vetores.Exerc_05_posiçãomaior;

import java.util.Locale;
import java.util.Scanner;


public class Program {


	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posicimaior;

	    double maior;

	    System.out.print("Quantos números voce vai digitar? ");
	    n = sc.nextInt();

	    double[] vect = new double[n];

	    for (int i=0; i< vect.length; i++) {
	    	System.out.print("Digite um numero: ");
	        vect[i] = sc.nextDouble();
	    }

	    maior = vect[0];
	    posicimaior = 0;

	    for (int i=1; i< vect.length; i++) {
            
	        if (vect[i] > maior) {

	            maior = vect[i];
	            posicimaior = i;

	        }
	    }

		
	    System.out.printf("Maior Valor = %.1f\n", maior);
	    System.out.printf("Posição maior = %d\n", posicimaior);

		sc.close();
	}
}
