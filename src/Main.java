import java.util.Scanner;

public class Main{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int g =0;
		int f = 0;
		int p =0;
		int N = sc.nextInt();
		for(int x = 0;x < N;x++) {
			p = sc.nextInt();
			
			if(p >=10 &&p <= 20) {
				g += 1;
			}
			
			else {
				f += 1;
			}
			
		}
		System.out.println("in "+g);
		System.out.println("out "+f);
		
		
		

		
	}
}
	

