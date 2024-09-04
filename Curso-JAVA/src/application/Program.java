package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] Args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas serao digitadas? ");
		int N = sc.nextInt();
		
		String sum = "" ;
		int ida = 0;
		double alt = 0.0;
		
		double[]  vect = new double[N];
		String[]  vectN = new String[N];
		int[] vectI = new int[N];
		
		for(int i  = 1; i < vect.length;i++) {
			
			System.out.println("Dadosda da %d pessoa"+i);
			System.out.print("Nome: ");
			vectN[i] = sc.next();
			System.out.print("Idade: ");
			vectI[i] = sc.nextInt();
			System.out.print("Altura: ");
			vect[i] = sc.nextDouble();
			
			
				
		}
		
		double porcen = 0.0;
		for(int i =0; i <  vect.length ;i++) {
			
			
				if(vectI[i] <16) {
				 
				sum += vectN[i];
				alt += vect[i];
				ida += vectI[i];
		
				}
			}

		System.out.println(sum);
		System.out.println(alt);
		System.out.println(ida);
		
		sc.close();
		}
		
		
	}

