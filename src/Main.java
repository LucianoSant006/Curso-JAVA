import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt(); 
		
		if (i %2 == 0) {
			System.out.printf("O número %d é Par",i);
		} else {
			System.out.printf("O número %d é Impar",i);

		}

	}

}
