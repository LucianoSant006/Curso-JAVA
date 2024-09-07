package Vetores.Exerc04_Pares;

import java.util.Scanner;

public class Program {

    

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N, qtd;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    N = sc.nextInt();

	    int[] vect = new int[N];

	    for (int i=0; i<vect.length; i++) {
	    	System.out.print("Digite um numero: ");
	        vect[i] = sc.nextInt();
	    }

	    System.out.println("\nNúmeros Psred:");

		qtd = 0;
	    for (int i=0; i<vect.length; i++) {
	        if (vect[i] % 2 == 0) {
	        	System.out.printf("%d  ", vect[i]);
	            qtd++;
	        }
	    }

	    System.out.printf("\n\nQuantidade De Pares : %d\n", qtd);

		sc.close();
	}
}