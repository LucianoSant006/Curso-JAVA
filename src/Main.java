import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i = 0;
		System.out.println("Digite a senha");
		int senha = sc.nextInt();
		while (senha != 2002) {

			System.out.println("Senha Invalida");
			senha = sc.nextInt();

		}
		System.out.println("Acesso Permitido");

		sc.close();

	}

}
