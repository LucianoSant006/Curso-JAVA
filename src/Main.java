import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double price = 400.00;
		
		//  ela estânciada ela pertece ao escopo public static void Main
		double discount = 0;
		
		if (price < 200.00) {
			discount = price *0.1;
			// Quando a estrutura termina a execução as váriavs que tiverem sido declaradas
			// aqui dentro da estrutura vão ser desalocadas da mémeoria
		}
		/* outra forma de estância
		else { 
			discount =0;
		}*/
		
		System.out.println(discount);
		
		
				

		
	}

}
