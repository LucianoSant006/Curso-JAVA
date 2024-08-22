import java.util.Scanner;

public class Main{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de numero");
		int N = sc.nextInt();
		int f =0;
		for(int x = N;x >=0 ;x--)
		{
				f = x *N;
				System.out.println(f);
		
				
		}
		
		
		sc.close();

		
	}
}
	

