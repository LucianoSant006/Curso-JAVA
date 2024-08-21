import java.util.Scanner;

public class Main{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de not");
		int N = sc.nextInt();
		for(int x = 0;x < N;x++) {
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			if(n2 ==0) {
				System.out.printf("Divisão impossivel");
			}else {
				double media = ( n1 / n2);
				System.out.printf("%.1f%n", media);
			}
			sc.close();	
		}
		
		
		

		
	}
}
	

