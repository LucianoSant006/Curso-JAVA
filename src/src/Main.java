import java.util.Locale;
import java.util.Scanner;

public class Main {


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int C = A + B;
			
			if (C  == 0 || B % A == 0) {
				System.out.println("Sao Multiplos");
			}
			else {
				System.out.println("Nao sao Multiplos");
			}
			
			sc.close();
		}

}
