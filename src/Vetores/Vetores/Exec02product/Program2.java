package Vetores.Exec02product;
import java.util.Locale;
import java.util.Scanner;

import Vetores.Exec02.entities.Product;




public class Program2{


	public static void main(String[] Args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N =sc.nextInt();

	Product[]  vect = new Product[N];

		for(int i =0; i < vect.length; i++) {

			String name = sc.next();
			double price = sc.nextDouble();

			vect[i] = new Product(name, price);
		}

			double sum =0.0;
			String nome = null;
		for (int i = 0; i < vect.length;i++) {


			sum += vect[i].getPrice();

		}

		 double avg = sum /N;

		 System.out.printf("%f",avg);




	}




}