import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

		if (i < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não Negativo");

		}

	}

}
