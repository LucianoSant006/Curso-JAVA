import java.util.Scanner;

public class Main{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de notas");
		int N = sc.nextInt();
		for(int x = 0;x < N;x++) {
			
			double p1 = sc.nextDouble();
			double p2 = sc.nextDouble();
			double  p3= sc.nextDouble();

			
			double media = (p1 * 2.0 + p2 * 3.0 + p3 * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		
		
		

		
	}
}
	

