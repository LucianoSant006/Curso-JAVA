import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double preco = 34.0;
		double desconto =  (preco < 20.0) ? preco *0.1 : preco *0.05;
		
		 /*
		if (preco < 20.0) {
			desconto = preco *0.1;
			
		}else {
			desconto = preco * 0.05;
		}
		*/
		System.out.println(desconto);
				

		
	}

}
