import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int y = 0;
		System.out.printf("Digite a cordenada X %n");
		x = sc.nextInt();
		System.out.printf("Digite a Cordenada Y %n");
		y = sc.nextInt();
		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			System.out.printf("Digite a cordenada X %n");
			x = sc.nextInt();
			System.out.printf("Digite a Cordenada Y %n");
			y = sc.nextInt();
		}

		sc.close();

	}

}
