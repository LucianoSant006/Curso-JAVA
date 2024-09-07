package Vetores.Exerc01_negativos;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] Args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vai digitar ?");
		int N = sc.nextInt();

		int[] vect = new int[N];

		for(int i = 0; i < vect.length;i++) {
			System.out.print("Digite um numeor");
			 vect[i] = sc.nextInt();


		}
		System.out.println("Numeros Negativos:");
		for(int i=0; i< vect.length; i++) {
	        if (vect[i] < 0) {

	        	System.out.printf("%d\n", vect[i]);
	        }



		}
		sc.close();
	}
}