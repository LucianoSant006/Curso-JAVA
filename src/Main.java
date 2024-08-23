import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		//Deixa em  minúsculo 
		String s01 = original.toLowerCase();
		
		//Deixa o valor da varial em Maiúsculo
		String s02 = original.toUpperCase();
		
		//Tira os espaços deixados  na váriavel
		String s03 = original.trim();
		
		//Começa  a conta apartir do índice 2 
		String s04 = original.substring(2);
		
		//Começa a conta apartir do índice 2 e termina no 9
		String s05 = original.substring(2, 9);
		
		//Substitui a pelo  x
		String s06 = original.replace('a', 'x');
		
		String s07 = original.replace("abc", "xy");
		
		//Pega o primeiro indice
		int i = original.indexOf("bc");
		
		//Obtem o último índice 
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("substring: -" + s04 + "-");
		System.out.println("substring: -" + s05 + "-");
		System.out.println("replace('a', 'x'):-" + s06 + "-");
		System.out.println("replace('abc', 'xy'):-" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		
	}

}
